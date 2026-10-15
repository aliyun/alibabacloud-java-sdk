// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class CreateTemplateCacheResponseBody extends TeaModel {
    /**
     * <p>The error code. A value of 200 indicates success.</p>
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
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>B5AD8B54-4358-5F5B-ACAA-52F2016459C6</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The template cache object.</p>
     */
    @NameInMap("templateCache")
    public PublicTemplateCache templateCache;

    public static CreateTemplateCacheResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateCacheResponseBody self = new CreateTemplateCacheResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTemplateCacheResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateTemplateCacheResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateTemplateCacheResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTemplateCacheResponseBody setTemplateCache(PublicTemplateCache templateCache) {
        this.templateCache = templateCache;
        return this;
    }
    public PublicTemplateCache getTemplateCache() {
        return this.templateCache;
    }

}
