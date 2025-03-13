// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRetcodeShareUrlRequest extends TeaModel {
    /**
     * <p>The project ID (PID) of the application.</p>
     * <p>To obtain the application PID, log on to the Application Real-Time Monitoring Service (ARMS) console. In the left-side navigation pane, choose <strong>Browser Monitoring</strong>&gt;<strong>Browser Monitoring</strong>. Then, click the name of the application. The URL in the address bar contains the application PID, in the xxx format. As the browser is encoded, you must modify the PID. For example, if the PID in the URL is xxx%4074xxx, you must replace %40 with an at sign (@) to obtain xxx@74xxx.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>iioe7jcnuk@582846f37******</p>
     */
    @NameInMap("Pid")
    public String pid;

    public static GetRetcodeShareUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRetcodeShareUrlRequest self = new GetRetcodeShareUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetRetcodeShareUrlRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

}
