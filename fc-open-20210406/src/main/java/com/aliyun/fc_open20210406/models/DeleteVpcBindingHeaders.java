// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class DeleteVpcBindingHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>The ID of the Alibaba Cloud account.</p>
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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>asdf****</p>
     */
    @NameInMap("X-Fc-Trace-Id")
    public String xFcTraceId;

    public static DeleteVpcBindingHeaders build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpcBindingHeaders self = new DeleteVpcBindingHeaders();
        return TeaModel.build(map, self);
    }

    public DeleteVpcBindingHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public DeleteVpcBindingHeaders setXFcAccountId(String xFcAccountId) {
        this.xFcAccountId = xFcAccountId;
        return this;
    }
    public String getXFcAccountId() {
        return this.xFcAccountId;
    }

    public DeleteVpcBindingHeaders setXFcDate(String xFcDate) {
        this.xFcDate = xFcDate;
        return this;
    }
    public String getXFcDate() {
        return this.xFcDate;
    }

    public DeleteVpcBindingHeaders setXFcTraceId(String xFcTraceId) {
        this.xFcTraceId = xFcTraceId;
        return this;
    }
    public String getXFcTraceId() {
        return this.xFcTraceId;
    }

}
