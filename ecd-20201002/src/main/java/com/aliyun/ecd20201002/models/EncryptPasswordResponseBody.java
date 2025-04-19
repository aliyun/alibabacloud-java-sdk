// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class EncryptPasswordResponseBody extends TeaModel {
    /**
     * <p>The encrypted password.</p>
     * 
     * <strong>example:</strong>
     * <p>d34601bc-e6b1-4433-b0cc-8f6c5e52;n4apvGub3OBoj4Grwg==;thhO4UEomJfdvwnwlA==</p>
     */
    @NameInMap("EncryptedPassword")
    public String encryptedPassword;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AF538DA8-FFC6-52DA-8FF8-7B92579F****</p>
     */
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
