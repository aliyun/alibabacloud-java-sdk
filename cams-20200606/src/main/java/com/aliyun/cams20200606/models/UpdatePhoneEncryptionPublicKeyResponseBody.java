// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class UpdatePhoneEncryptionPublicKeyResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdatePhoneEncryptionPublicKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePhoneEncryptionPublicKeyResponseBody self = new UpdatePhoneEncryptionPublicKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePhoneEncryptionPublicKeyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdatePhoneEncryptionPublicKeyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdatePhoneEncryptionPublicKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
