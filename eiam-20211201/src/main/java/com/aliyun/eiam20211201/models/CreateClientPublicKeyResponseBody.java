// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateClientPublicKeyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>KEYCKmEYW9byWTdjuRbmCjd2Bhg6VpkAxxxx</p>
     */
    @NameInMap("ClientPublicKeyId")
    public String clientPublicKeyId;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateClientPublicKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateClientPublicKeyResponseBody self = new CreateClientPublicKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateClientPublicKeyResponseBody setClientPublicKeyId(String clientPublicKeyId) {
        this.clientPublicKeyId = clientPublicKeyId;
        return this;
    }
    public String getClientPublicKeyId() {
        return this.clientPublicKeyId;
    }

    public CreateClientPublicKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
