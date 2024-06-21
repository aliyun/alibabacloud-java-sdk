// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRetcodeShareUrlRequest extends TeaModel {
    /**
     * <p>The process identifier (PID) of the application. </p>
     * <p>Log on to the <strong>ARMS console</strong>. In the left-side navigation pane, choose <strong>Browser Monitoring</strong> &gt; <strong>Browser Monitoring</strong>. On the Browser Monitoring page, click the name of an application. The URL in the address bar contains the process ID (PID) of the application. The PID is indicated in the <code>pid=xxx</code> format. The PID is usually percent encoded as <code>xxx%40xxx</code>. You must modify this value to remove the percent encoding. For example, if the PID in the URL is <code>eb4zdose6v%409781be0f44d****</code>, you must replace <code>%40</code> with @ to obtain <code>eb4zdose6v@9781be0f44d****</code>.</p>
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
