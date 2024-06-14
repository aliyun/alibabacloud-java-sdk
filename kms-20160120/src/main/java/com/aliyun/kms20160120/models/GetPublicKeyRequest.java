// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetPublicKeyRequest extends TeaModel {
    /**
     * <p>The globally unique ID of the CMK. You can also set this parameter to an alias that is bound to the CMK. For more information, see [Use aliases](https://help.aliyun.com/document_detail/68522.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The globally unique ID of the CMK version.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("KeyVersionId")
    public String keyVersionId;

    public static GetPublicKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPublicKeyRequest self = new GetPublicKeyRequest();
        return TeaModel.build(map, self);
    }

    public GetPublicKeyRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public GetPublicKeyRequest setKeyVersionId(String keyVersionId) {
        this.keyVersionId = keyVersionId;
        return this;
    }
    public String getKeyVersionId() {
        return this.keyVersionId;
    }

}
