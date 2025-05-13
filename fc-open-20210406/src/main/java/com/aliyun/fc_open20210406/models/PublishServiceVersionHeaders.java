// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class PublishServiceVersionHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>The ETag value of the service. This value is used to ensure that the modified service is consistent with the service to be modified. The ETag value is returned in the responses of the <a href="https://help.aliyun.com/document_detail/175256.html">CreateService</a>, <a href="https://help.aliyun.com/document_detail/188167.html">UpdateService</a>, and <a href="https://help.aliyun.com/document_detail/189225.html">GetService</a> operations.</p>
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
     * <p>The start time when the function is invoked. Specify the time in the yyyy-mm-ddhh:mm:ss format.</p>
     * 
     * <strong>example:</strong>
     * <p>Wed, 11 May 2022 09:00:00 GMT</p>
     */
    @NameInMap("X-Fc-Date")
    public String xFcDate;

    /**
     * <p>2020-12-1210:00:00</p>
     * 
     * <strong>example:</strong>
     * <p>rid281s******</p>
     */
    @NameInMap("X-Fc-Trace-Id")
    public String xFcTraceId;

    public static PublishServiceVersionHeaders build(java.util.Map<String, ?> map) throws Exception {
        PublishServiceVersionHeaders self = new PublishServiceVersionHeaders();
        return TeaModel.build(map, self);
    }

    public PublishServiceVersionHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public PublishServiceVersionHeaders setIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
        return this;
    }
    public String getIfMatch() {
        return this.ifMatch;
    }

    public PublishServiceVersionHeaders setXFcAccountId(String xFcAccountId) {
        this.xFcAccountId = xFcAccountId;
        return this;
    }
    public String getXFcAccountId() {
        return this.xFcAccountId;
    }

    public PublishServiceVersionHeaders setXFcDate(String xFcDate) {
        this.xFcDate = xFcDate;
        return this;
    }
    public String getXFcDate() {
        return this.xFcDate;
    }

    public PublishServiceVersionHeaders setXFcTraceId(String xFcTraceId) {
        this.xFcTraceId = xFcTraceId;
        return this;
    }
    public String getXFcTraceId() {
        return this.xFcTraceId;
    }

}
