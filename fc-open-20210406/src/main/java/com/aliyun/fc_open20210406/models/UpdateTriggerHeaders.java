// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class UpdateTriggerHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>This parameter is used to ensure that the modified resource is consistent with the resource to be modified. You can obtain the parameter value from the responses of <a href="https://help.aliyun.com/document_detail/190054.html">CreateTrigger</a>, <a href="https://help.aliyun.com/document_detail/190056.html">GetTrigger</a>, and <a href="https://help.aliyun.com/document_detail/190055.html">UpdateTrigger</a> operations.</p>
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
     * <p>The time when the request is initiated on the client. The format of the value is: <strong>EEE,d MMM yyyy HH:mm:ss GMT</strong>.</p>
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
     * <p>my-test-trace-id</p>
     */
    @NameInMap("X-Fc-Trace-Id")
    public String xFcTraceId;

    public static UpdateTriggerHeaders build(java.util.Map<String, ?> map) throws Exception {
        UpdateTriggerHeaders self = new UpdateTriggerHeaders();
        return TeaModel.build(map, self);
    }

    public UpdateTriggerHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public UpdateTriggerHeaders setIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
        return this;
    }
    public String getIfMatch() {
        return this.ifMatch;
    }

    public UpdateTriggerHeaders setXFcAccountId(String xFcAccountId) {
        this.xFcAccountId = xFcAccountId;
        return this;
    }
    public String getXFcAccountId() {
        return this.xFcAccountId;
    }

    public UpdateTriggerHeaders setXFcDate(String xFcDate) {
        this.xFcDate = xFcDate;
        return this;
    }
    public String getXFcDate() {
        return this.xFcDate;
    }

    public UpdateTriggerHeaders setXFcTraceId(String xFcTraceId) {
        this.xFcTraceId = xFcTraceId;
        return this;
    }
    public String getXFcTraceId() {
        return this.xFcTraceId;
    }

}
