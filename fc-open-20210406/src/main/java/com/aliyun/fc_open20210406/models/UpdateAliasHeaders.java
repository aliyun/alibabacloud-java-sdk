// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class UpdateAliasHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    // If the ETag specified in the request matches the ETag value of the object, the object and 200 OK are returned. Otherwise, 412 Precondition Failed is returned.
    // 
    // The ETag value of an object is used to check data integrity of the object. This parameter is empty by default.
    @NameInMap("If-Match")
    public String ifMatch;

    // The ID of your Alibaba Cloud account.
    @NameInMap("X-Fc-Account-Id")
    public String xFcAccountId;

    // The time on which the function is invoked. The format of the value is: **EEE,d MMM yyyy HH:mm:ss GMT**.
    @NameInMap("X-Fc-Date")
    public String xFcDate;

    // The trace ID of the invocation request of Function Compute.
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
