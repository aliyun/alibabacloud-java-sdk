// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateSecretRequest extends TeaModel {
    /**
     * <p>The key value.</p>
     * 
     * <strong>example:</strong>
     * <p>apikey-xxxxxxxx</p>
     */
    @NameInMap("secretData")
    public String secretData;

    public static UpdateSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecretRequest self = new UpdateSecretRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSecretRequest setSecretData(String secretData) {
        this.secretData = secretData;
        return this;
    }
    public String getSecretData() {
        return this.secretData;
    }

}
