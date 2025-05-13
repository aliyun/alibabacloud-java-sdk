// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class DeleteFunctionHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>The header that is used to ensure that the changed resources are consistent with resources to be changed. The value comes from the response of the Create, Get, and Update API operations.</p>
     * 
     * <strong>example:</strong>
     * <p>e19d5cd5af0378da05f63f891c7467af</p>
     */
    @NameInMap("If-Match")
    public String ifMatch;

    /**
     * <p>The ID of your Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>188077086902****</p>
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
     * <p>The trace ID of the request for Function Compute API. The value is the same as that of the requestId parameter in the response.</p>
     * 
     * <strong>example:</strong>
     * <p>test-trace-id</p>
     */
    @NameInMap("X-Fc-Trace-Id")
    public String xFcTraceId;

    public static DeleteFunctionHeaders build(java.util.Map<String, ?> map) throws Exception {
        DeleteFunctionHeaders self = new DeleteFunctionHeaders();
        return TeaModel.build(map, self);
    }

    public DeleteFunctionHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public DeleteFunctionHeaders setIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
        return this;
    }
    public String getIfMatch() {
        return this.ifMatch;
    }

    public DeleteFunctionHeaders setXFcAccountId(String xFcAccountId) {
        this.xFcAccountId = xFcAccountId;
        return this;
    }
    public String getXFcAccountId() {
        return this.xFcAccountId;
    }

    public DeleteFunctionHeaders setXFcDate(String xFcDate) {
        this.xFcDate = xFcDate;
        return this;
    }
    public String getXFcDate() {
        return this.xFcDate;
    }

    public DeleteFunctionHeaders setXFcTraceId(String xFcTraceId) {
        this.xFcTraceId = xFcTraceId;
        return this;
    }
    public String getXFcTraceId() {
        return this.xFcTraceId;
    }

}
