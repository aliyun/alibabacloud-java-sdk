// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class EncryptPasswordResponseBody extends TeaModel {
    @NameInMap("EncryptedPassword")
    public String encryptedPassword;

    @NameInMap("RequestId")
    public String requestId;

    public static EncryptPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EncryptPasswordResponseBody self = new EncryptPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public EncryptPasswordResponseBody setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
        return this;
    }
    public String getEncryptedPassword() {
        return this.encryptedPassword;
    }

    public EncryptPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
