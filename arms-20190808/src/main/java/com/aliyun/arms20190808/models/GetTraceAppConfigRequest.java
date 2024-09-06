// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetTraceAppConfigRequest extends TeaModel {
    /**
     * <p>The process ID (PID) of the application.</p>
     * <p>You can use one of the following methods to obtain the PID:</p>
     * <ul>
     * <li>API: Call the <a href="https://help.aliyun.com/document_detail/2588008.html">ListTraceApps</a> operation</li>
     * <li>Console: Log on to the Application Real-Time Monitoring Service (ARMS) console. In the left-side navigation pane, choose <strong>Application Monitoring</strong> &gt; <strong>Application List</strong>. On the Application List page, click the name of your application. The URL in the address bar contains the PID of the application. The PID is indicated in the pid=xxx format. The PID is usually percent encoded as xxx%40xxx. You must modify this value to remove the percent encoding. For example, if the PID in the URL is xxx%4074xxx, you must replace %40 with an at sign (@) to obtain xxx@74xxx.</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>To obtain the PID in the console, your application must be monitored by Application Monitoring rather than Managed Service for OpenTelemetry.</p>
     * </li>
     * <li><p>The GetTraceAppConfig operation can query only the custom settings of applications that are monitored by Application Monitoring.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a2n80plglh@745eddxxx</p>
     */
    @NameInMap("Pid")
    public String pid;

    public static GetTraceAppConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTraceAppConfigRequest self = new GetTraceAppConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetTraceAppConfigRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

}
