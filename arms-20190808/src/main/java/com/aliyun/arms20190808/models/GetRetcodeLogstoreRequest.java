// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRetcodeLogstoreRequest extends TeaModel {
    /**
     * <p>The ID of the application. Log on to the ARMS console. In the left-side navigation pane, choose **Browser Monitoring** > **Browser Monitoring**. On the Browser Monitoring page, click the name of an application. The URL in the address bar contains the process ID (PID) of the application. The PID is indicated in the pid=xxx format. The PID is usually percent encoded as xxx%40xxx. You must modify this value to remove the percent encoding. For example, if the PID in the URL is xxx%4074xxx, you must replace %40 with the at sign (@) to obtain xxx@74xxx.</p>
     */
    @NameInMap("Pid")
    public String pid;

    /**
     * <p>The ID of the region where Log Service resides.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetRetcodeLogstoreRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRetcodeLogstoreRequest self = new GetRetcodeLogstoreRequest();
        return TeaModel.build(map, self);
    }

    public GetRetcodeLogstoreRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public GetRetcodeLogstoreRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
