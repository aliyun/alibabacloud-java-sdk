// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateAliasRequest extends TeaModel {
    /**
     * <p>The alias that you want to bind.</p>
     * <p>The value must be 1 to 255 characters in length and must include the alias/ prefix.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alias/example</p>
     */
    @NameInMap("AliasName")
    public String aliasName;

    /**
     * <p>The ID of the CMK. The ID must be globally unique.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234abcd-12ab-34cd-56ef-12345678****</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    public static UpdateAliasRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAliasRequest self = new UpdateAliasRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAliasRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public UpdateAliasRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

}
