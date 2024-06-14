// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateAliasRequest extends TeaModel {
    /**
     * <p>The alias of the CMK.</p>
     * <br>
     * <p>The alias must be 1 to 255 characters in length and must contain the prefix `alias/`. The alias cannot be prefixed with the reserved word `alias/acs`.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AliasName")
    public String aliasName;

    /**
     * <p>The ID of the CMK. The ID must be globally unique.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    public static CreateAliasRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAliasRequest self = new CreateAliasRequest();
        return TeaModel.build(map, self);
    }

    public CreateAliasRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public CreateAliasRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

}
