// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class DeleteIdentityProviderSCIMCredentialResponseBody extends TeaModel {
    /**
     * <p>失败时结合 HTTP 状态及 message 处理。</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>本次请求的处理状态，不等同后台任务最终结果。</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>请求受理或错误消息；异步任务结果需按对应查询接口核对。</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>用于关联本次调用与排障，失败时请保留。</p>
     * 
     * <strong>example:</strong>
     * <p>request-example</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>true 表示本次请求处理成功；异步写入仍需继续查询任务结果。</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static DeleteIdentityProviderSCIMCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIdentityProviderSCIMCredentialResponseBody self = new DeleteIdentityProviderSCIMCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIdentityProviderSCIMCredentialResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteIdentityProviderSCIMCredentialResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeleteIdentityProviderSCIMCredentialResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteIdentityProviderSCIMCredentialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteIdentityProviderSCIMCredentialResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
