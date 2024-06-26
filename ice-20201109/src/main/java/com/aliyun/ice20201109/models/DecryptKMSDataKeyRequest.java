// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DecryptKMSDataKeyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ODZhOWVmZDktM2QxNi00ODk0LWJkNGYtMWZjNDNmM2YyYWJmS7FmDBBQ0BkKsQrtRnidtPwirmDcS0ZuJCU41xxAAWk4Z8qsADfbV0b+i6kQmlvj79dJdGOvtX69Uycs901qOjop4bTS****</p>
     */
    @NameInMap("CiphertextBlob")
    public String ciphertextBlob;

    public static DecryptKMSDataKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        DecryptKMSDataKeyRequest self = new DecryptKMSDataKeyRequest();
        return TeaModel.build(map, self);
    }

    public DecryptKMSDataKeyRequest setCiphertextBlob(String ciphertextBlob) {
        this.ciphertextBlob = ciphertextBlob;
        return this;
    }
    public String getCiphertextBlob() {
        return this.ciphertextBlob;
    }

}
