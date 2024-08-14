// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateAliasRequest extends TeaModel {
    /**
     * <p>The alias of the CMK.</p>
     * <p>The alias must be 1 to 255 characters in length and must contain the prefix <code>alias/</code>. The alias cannot be prefixed with the reserved word <code>alias/acs</code>.</p>
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
     * <p>7906979c-8e06-46a2-be2d-68e3ccbc****</p>
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
