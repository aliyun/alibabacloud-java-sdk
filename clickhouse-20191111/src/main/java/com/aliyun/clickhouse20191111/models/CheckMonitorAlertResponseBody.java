// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CheckMonitorAlertResponseBody extends TeaModel {
    @NameInMap("Parameter")
    public String parameter;

    @NameInMap("RequestId")
    public String requestId;

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
