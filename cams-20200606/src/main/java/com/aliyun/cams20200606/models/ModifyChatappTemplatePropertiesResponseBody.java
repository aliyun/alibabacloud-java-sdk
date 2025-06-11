// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ModifyChatappTemplatePropertiesResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Model")
    public java.util.Map<String, ?> model;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ModifyChatappTemplatePropertiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyChatappTemplatePropertiesResponseBody self = new ModifyChatappTemplatePropertiesResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyChatappTemplatePropertiesResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ModifyChatappTemplatePropertiesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyChatappTemplatePropertiesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyChatappTemplatePropertiesResponseBody setModel(java.util.Map<String, ?> model) {
        this.model = model;
        return this;
    }
    public java.util.Map<String, ?> getModel() {
        return this.model;
    }

    public ModifyChatappTemplatePropertiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyChatappTemplatePropertiesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
