// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class QueryMonitorInfoResponseBody extends TeaModel {
    @NameInMap("MonitorInfo")
    public String monitorInfo;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public Integer code;

    public static QueryMonitorInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMonitorInfoResponseBody self = new QueryMonitorInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMonitorInfoResponseBody setMonitorInfo(String monitorInfo) {
        this.monitorInfo = monitorInfo;
        return this;
    }
    public String getMonitorInfo() {
        return this.monitorInfo;
    }

    public QueryMonitorInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryMonitorInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMonitorInfoResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

}
