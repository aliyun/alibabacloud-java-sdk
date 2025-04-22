// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class DeleteSecretAPhoneNoToCustResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>请求状态码</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>删除是否成功</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>失败错误提示</p>
     * 
     * <strong>example:</strong>
     * <p>号码组不存在</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>返回id</p>
     * 
     * <strong>example:</strong>
     * <p>1D73E648-0978-18A5-B089-3BB2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>请求是否成功</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteSecretAPhoneNoToCustResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecretAPhoneNoToCustResponseBody self = new DeleteSecretAPhoneNoToCustResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSecretAPhoneNoToCustResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DeleteSecretAPhoneNoToCustResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteSecretAPhoneNoToCustResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public DeleteSecretAPhoneNoToCustResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteSecretAPhoneNoToCustResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteSecretAPhoneNoToCustResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
