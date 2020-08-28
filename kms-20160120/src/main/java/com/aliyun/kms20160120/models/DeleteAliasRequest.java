// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DeleteAliasRequest extends TeaModel {
    @NameInMap("AliasName")
    @Validation(required = true)
    public String aliasName;

    public static DeleteAliasRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAliasRequest self = new DeleteAliasRequest();
        return TeaModel.build(map, self);
    }

}
