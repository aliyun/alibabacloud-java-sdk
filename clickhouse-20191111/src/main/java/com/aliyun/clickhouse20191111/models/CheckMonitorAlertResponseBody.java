// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CheckMonitorAlertResponseBody extends TeaModel {
    /**
     * <p>The parameters that are used to configure the monitoring and alerting feature.</p>
     */
    @NameInMap("Parameter")
    public String parameter;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the monitoring and alerting feature is enabled. Valid values:</p>
     * <br>
     * <p>*   **enable**: The monitoring and alerting feature is enabled.</p>
     * <p>*   **disable**: The monitoring and alerting feature is disabled.</p>
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
