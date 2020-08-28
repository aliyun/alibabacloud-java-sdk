// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateAliasResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CreateAliasResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAliasResponse self = new CreateAliasResponse();
        return TeaModel.build(map, self);
    }

}
