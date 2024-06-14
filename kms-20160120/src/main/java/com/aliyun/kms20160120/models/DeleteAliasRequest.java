// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DeleteAliasRequest extends TeaModel {
    /**
     * <p>The alias that you want to delete.</p>
     * <br>
     * <p>The value must be 1 to 255 characters in length and must include the alias/ prefix.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AliasName")
    public String aliasName;

    public static DeleteAliasRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAliasRequest self = new DeleteAliasRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAliasRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

}
