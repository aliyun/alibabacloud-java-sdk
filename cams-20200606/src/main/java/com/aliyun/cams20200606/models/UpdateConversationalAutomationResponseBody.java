// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class UpdateConversationalAutomationResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateConversationalAutomationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateConversationalAutomationResponseBody self = new UpdateConversationalAutomationResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateConversationalAutomationResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public UpdateConversationalAutomationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateConversationalAutomationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateConversationalAutomationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateConversationalAutomationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
