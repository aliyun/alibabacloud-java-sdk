// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class RestoreSecretResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SecretName")
    @Validation(required = true)
    public String secretName;

    public static RestoreSecretResponse build(java.util.Map<String, ?> map) throws Exception {
        RestoreSecretResponse self = new RestoreSecretResponse();
        return TeaModel.build(map, self);
    }

}
