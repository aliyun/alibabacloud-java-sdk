// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class DeleteAliasHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>If the ETag specified in a request matches the ETag value of the object, OSS transmits the object and returns 200 OK. If the ETag specified in a request does not match the ETag value of the object, OSS returns 412 Precondition Failed.</p>
     * <p>The ETag value of a resource is used to check whether the resource has changed. You can check data integrity by using the ETag value. Default value: null.</p>
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
     * <p>The trace ID of the request for Function Compute API.</p>
     * 
     * <strong>example:</strong>
     * <p>r9s89isisi****</p>
     */
    @NameInMap("X-Fc-Trace-Id")
    public String xFcTraceId;

    public static DeleteAliasHeaders build(java.util.Map<String, ?> map) throws Exception {
        DeleteAliasHeaders self = new DeleteAliasHeaders();
        return TeaModel.build(map, self);
    }

    public DeleteAliasHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public DeleteAliasHeaders setIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
        return this;
    }
    public String getIfMatch() {
        return this.ifMatch;
    }

    public DeleteAliasHeaders setXFcAccountId(String xFcAccountId) {
        this.xFcAccountId = xFcAccountId;
        return this;
    }
    public String getXFcAccountId() {
        return this.xFcAccountId;
    }

    public DeleteAliasHeaders setXFcDate(String xFcDate) {
        this.xFcDate = xFcDate;
        return this;
    }
    public String getXFcDate() {
        return this.xFcDate;
    }

    public DeleteAliasHeaders setXFcTraceId(String xFcTraceId) {
        this.xFcTraceId = xFcTraceId;
        return this;
    }
    public String getXFcTraceId() {
        return this.xFcTraceId;
    }

}
