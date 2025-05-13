// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class UpdateAliasHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>If the ETag specified in the request matches the ETag value of the object, the object and 200 OK are returned. Otherwise, 412 Precondition Failed is returned.</p>
     * <p>The ETag value of an object is used to check data integrity of the object. This parameter is empty by default.</p>
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
     * <p>The time on which the function is invoked. The format of the value is: <strong>EEE,d MMM yyyy HH:mm:ss GMT</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>Wed, 11 May 2022 09:00:00 GMT</p>
     */
    @NameInMap("X-Fc-Date")
    public String xFcDate;

    /**
     * <p>The trace ID of the invocation request of Function Compute.</p>
     * 
     * <strong>example:</strong>
     * <p>rid281s******</p>
     */
    @NameInMap("X-Fc-Trace-Id")
    public String xFcTraceId;

    public static UpdateAliasHeaders build(java.util.Map<String, ?> map) throws Exception {
        UpdateAliasHeaders self = new UpdateAliasHeaders();
        return TeaModel.build(map, self);
    }

    public UpdateAliasHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public UpdateAliasHeaders setIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
        return this;
    }
    public String getIfMatch() {
        return this.ifMatch;
    }

    public UpdateAliasHeaders setXFcAccountId(String xFcAccountId) {
        this.xFcAccountId = xFcAccountId;
        return this;
    }
    public String getXFcAccountId() {
        return this.xFcAccountId;
    }

    public UpdateAliasHeaders setXFcDate(String xFcDate) {
        this.xFcDate = xFcDate;
        return this;
    }
    public String getXFcDate() {
        return this.xFcDate;
    }

    public UpdateAliasHeaders setXFcTraceId(String xFcTraceId) {
        this.xFcTraceId = xFcTraceId;
        return this;
    }
    public String getXFcTraceId() {
        return this.xFcTraceId;
    }

}
