// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRetcodeLogstoreRequest extends TeaModel {
    /**
     * <p>The process identifier (PID) of the application. To obtain the PID of the application, perform the following steps: Log on to the Application Real-Time Monitoring Service (ARMS) console. In the left-side navigation pane, choose <strong>Browser Monitoring</strong> &gt; <strong>Browser Monitoring</strong>. On the Browser Monitoring page, click the name of the application. The URL in the address bar contains the PID of the application. The PID is in the pid=xxx format. The PID is usually percent encoded as xxx%40xxx. You must modify this value to remove the percent encoding. For example, if the PID in the URL is xxx%4074xxx, you must replace %40 with the at sign (@) to obtain xxx@74xxx.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>atc889zkcf@d8deedfa9bf****</p>
     */
    @NameInMap("Pid")
    public String pid;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
