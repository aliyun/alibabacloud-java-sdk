// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CheckMonitorAlertResponseBody extends TeaModel {
    /**
     * <p>The parameters that are used to configure the monitoring and alerting feature.</p>
     * 
     * <strong>example:</strong>
     * <p>{   &quot;monitor&quot;:{     &quot;key1&quot;:&quot;value1&quot;,     &quot;key2&quot;:&quot;value2&quot;   },   &quot;alert&quot;:{     &quot;key1&quot;:&quot;value1&quot;,     &quot;key2&quot;:&quot;value2&quot;   } }</p>
     */
    @NameInMap("Parameter")
    public String parameter;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>94F92113-FF63-5E57-8401-6FE123AD11DD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the monitoring and alerting feature is enabled. Valid values:</p>
     * <ul>
     * <li><strong>enable</strong>: The monitoring and alerting feature is enabled.</li>
     * <li><strong>disable</strong>: The monitoring and alerting feature is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("State")
    public String state;

    public static CheckMonitorAlertResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckMonitorAlertResponseBody self = new CheckMonitorAlertResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckMonitorAlertResponseBody setParameter(String parameter) {
        this.parameter = parameter;
        return this;
    }
    public String getParameter() {
        return this.parameter;
    }

    public CheckMonitorAlertResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckMonitorAlertResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
