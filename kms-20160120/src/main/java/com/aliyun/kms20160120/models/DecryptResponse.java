// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DecryptResponse extends TeaModel {
    @NameInMap("Plaintext")
    @Validation(required = true)
    public String plaintext;

    @NameInMap("KeyId")
    @Validation(required = true)
    public String keyId;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("KeyVersionId")
    @Validation(required = true)
    public String keyVersionId;

    public static DecryptResponse build(java.util.Map<String, ?> map) throws Exception {
        DecryptResponse self = new DecryptResponse();
        return TeaModel.build(map, self);
    }

}
