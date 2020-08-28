// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetParametersForImportResponse extends TeaModel {
    @NameInMap("KeyId")
    @Validation(required = true)
    public String keyId;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ImportToken")
    @Validation(required = true)
    public String importToken;

    @NameInMap("PublicKey")
    @Validation(required = true)
    public String publicKey;

    @NameInMap("TokenExpireTime")
    @Validation(required = true)
    public String tokenExpireTime;

    public static GetParametersForImportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetParametersForImportResponse self = new GetParametersForImportResponse();
        return TeaModel.build(map, self);
    }

}
