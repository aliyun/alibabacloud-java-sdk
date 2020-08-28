// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateSecretVersionStageResponse extends TeaModel {
    @NameInMap("SecretName")
    @Validation(required = true)
    public String secretName;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UpdateSecretVersionStageResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecretVersionStageResponse self = new UpdateSecretVersionStageResponse();
        return TeaModel.build(map, self);
    }

}
