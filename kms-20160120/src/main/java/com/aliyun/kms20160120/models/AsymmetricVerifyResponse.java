// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class AsymmetricVerifyResponse extends TeaModel {
    @NameInMap("Value")
    @Validation(required = true)
    public Boolean value;

    @NameInMap("KeyId")
    @Validation(required = true)
    public String keyId;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("KeyVersionId")
    @Validation(required = true)
    public String keyVersionId;

    public static AsymmetricVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        AsymmetricVerifyResponse self = new AsymmetricVerifyResponse();
        return TeaModel.build(map, self);
    }

}
