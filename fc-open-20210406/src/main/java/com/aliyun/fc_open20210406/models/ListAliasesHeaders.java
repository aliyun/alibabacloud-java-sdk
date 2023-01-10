// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListAliasesHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    // The ID of your Alibaba Cloud account.
    @NameInMap("X-Fc-Account-Id")
    public String xFcAccountId;

    // The start time when the function is invoked. Specify the time in the yyyy-mm-ddhh:mm:ss format.
    @NameInMap("X-Fc-Date")
    public String xFcDate;

    // The trace ID of the invocation request of Function Compute.
    @NameInMap("X-Fc-Trace-Id")
    public String xFcTraceId;

    public static ListAliasesHeaders build(java.util.Map<String, ?> map) throws Exception {
        ListAliasesHeaders self = new ListAliasesHeaders();
        return TeaModel.build(map, self);
    }

    public ListAliasesHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ListAliasesHeaders setXFcAccountId(String xFcAccountId) {
        this.xFcAccountId = xFcAccountId;
        return this;
    }
    public String getXFcAccountId() {
        return this.xFcAccountId;
    }

    public ListAliasesHeaders setXFcDate(String xFcDate) {
        this.xFcDate = xFcDate;
        return this;
    }
    public String getXFcDate() {
        return this.xFcDate;
    }

    public ListAliasesHeaders setXFcTraceId(String xFcTraceId) {
        this.xFcTraceId = xFcTraceId;
        return this;
    }
    public String getXFcTraceId() {
        return this.xFcTraceId;
    }

}
