// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateAliasResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UpdateAliasResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAliasResponse self = new UpdateAliasResponse();
        return TeaModel.build(map, self);
    }

}
