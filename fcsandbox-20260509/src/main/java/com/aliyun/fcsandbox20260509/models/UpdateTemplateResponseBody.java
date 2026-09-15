// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class UpdateTemplateResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B5AD8B54-4358-5F5B-ACAA-52F2016459C6</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The template ID.</p>
     * 
     * <strong>example:</strong>
     * <p>tpl-9f3a2b7c8d1e4f5a6b0c7d8e9f1a2b3c</p>
     */
    @NameInMap("templateID")
    public String templateID;

    public static UpdateTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTemplateResponseBody self = new UpdateTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateTemplateResponseBody setTemplateID(String templateID) {
        this.templateID = templateID;
        return this;
    }
    public String getTemplateID() {
        return this.templateID;
    }

}
