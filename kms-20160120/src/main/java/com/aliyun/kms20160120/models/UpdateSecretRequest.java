// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateSecretRequest extends TeaModel {
    @NameInMap("SecretName")
    @Validation(required = true)
    public String secretName;

    @NameInMap("Description")
    public String description;

    public static UpdateSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecretRequest self = new UpdateSecretRequest();
        return TeaModel.build(map, self);
    }

}
