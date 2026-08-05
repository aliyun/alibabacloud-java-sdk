// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class BatchGetSecretValueShrinkRequest extends TeaModel {
    /**
     * <p>The list of secret information. You can query up to 20 different secrets at a time.</p>
     */
    @NameInMap("SecretsList")
    public String secretsListShrink;

    public static BatchGetSecretValueShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetSecretValueShrinkRequest self = new BatchGetSecretValueShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetSecretValueShrinkRequest setSecretsListShrink(String secretsListShrink) {
        this.secretsListShrink = secretsListShrink;
        return this;
    }
    public String getSecretsListShrink() {
        return this.secretsListShrink;
    }

}
