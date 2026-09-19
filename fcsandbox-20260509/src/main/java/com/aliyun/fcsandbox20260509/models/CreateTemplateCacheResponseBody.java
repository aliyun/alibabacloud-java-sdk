// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class CreateTemplateCacheResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>B5AD8B54-4358-5F5B-ACAA-52F2016459C6</p>
     */
    @NameInMap("requestId")
    public String requestId;

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
