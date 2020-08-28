// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DeleteAliasResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteAliasResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAliasResponse self = new DeleteAliasResponse();
        return TeaModel.build(map, self);
    }

}
