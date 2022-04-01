// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListStatefulAsyncInvocationFunctionsHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    // 您的阿里云账号（主账号）ID。
    @NameInMap("X-Fc-Account-Id")
    public String xFcAccountId;

    // 发起API调用的日期，用于对请求签名。格式为yyyy-mm-ddhh:mm:ss。
    @NameInMap("X-Fc-Date")
    public String xFcDate;

    // 用于链路追踪的ID。
    @NameInMap("X-Fc-Trace-Id")
    public String xFcTraceId;

    public static ListStatefulAsyncInvocationFunctionsHeaders build(java.util.Map<String, ?> map) throws Exception {
        ListStatefulAsyncInvocationFunctionsHeaders self = new ListStatefulAsyncInvocationFunctionsHeaders();
        return TeaModel.build(map, self);
    }

    public ListStatefulAsyncInvocationFunctionsHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ListStatefulAsyncInvocationFunctionsHeaders setXFcAccountId(String xFcAccountId) {
        this.xFcAccountId = xFcAccountId;
        return this;
    }
    public String getXFcAccountId() {
        return this.xFcAccountId;
    }

    public ListStatefulAsyncInvocationFunctionsHeaders setXFcDate(String xFcDate) {
        this.xFcDate = xFcDate;
        return this;
    }
    public String getXFcDate() {
        return this.xFcDate;
    }

    public ListStatefulAsyncInvocationFunctionsHeaders setXFcTraceId(String xFcTraceId) {
        this.xFcTraceId = xFcTraceId;
        return this;
    }
    public String getXFcTraceId() {
        return this.xFcTraceId;
    }

}
