// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class CreateCustomDomainHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>The ID of your Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>188077086902****</p>
     */
    @NameInMap("X-Fc-Account-Id")
    public String xFcAccountId;

    /**
     * <p>The time when the operation is called. The format is: <strong>EEE,d MMM yyyy HH:mm:ss GMT</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>Wed, 11 May 2022 09:00:00 GMT</p>
     */
    @NameInMap("X-Fc-Date")
    public String xFcDate;

    /**
     * <p>The custom request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rid281s******</p>
     */
    @NameInMap("X-Fc-Trace-Id")
    public String xFcTraceId;

    public static CreateCustomDomainHeaders build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomDomainHeaders self = new CreateCustomDomainHeaders();
        return TeaModel.build(map, self);
    }

    public CreateCustomDomainHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public CreateCustomDomainHeaders setXFcAccountId(String xFcAccountId) {
        this.xFcAccountId = xFcAccountId;
        return this;
    }
    public String getXFcAccountId() {
        return this.xFcAccountId;
    }

    public CreateCustomDomainHeaders setXFcDate(String xFcDate) {
        this.xFcDate = xFcDate;
        return this;
    }
    public String getXFcDate() {
        return this.xFcDate;
    }

    public CreateCustomDomainHeaders setXFcTraceId(String xFcTraceId) {
        this.xFcTraceId = xFcTraceId;
        return this;
    }
    public String getXFcTraceId() {
        return this.xFcTraceId;
    }

}
