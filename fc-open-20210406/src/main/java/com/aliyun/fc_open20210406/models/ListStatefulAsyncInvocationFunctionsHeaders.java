// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListStatefulAsyncInvocationFunctionsHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>The ID of your Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>12348*****</p>
     */
    @NameInMap("X-Fc-Account-Id")
    public String xFcAccountId;

    /**
     * <p>The time when the function is invoked. The value is in the <strong>EEE,d MMM yyyy HH:mm:ss GMT</strong> format.</p>
     * 
     * <strong>example:</strong>
     * <p>Wed, 11 May 2022 09:00:00 GMT</p>
     */
    @NameInMap("X-Fc-Date")
    public String xFcDate;

    /**
     * <p>The trace ID of the request for Function Compute API.</p>
     * 
     * <strong>example:</strong>
     * <p>duytnd-Xsdfasfd***</p>
     */
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
