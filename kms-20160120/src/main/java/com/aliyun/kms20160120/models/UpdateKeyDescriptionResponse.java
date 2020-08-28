// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateKeyDescriptionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UpdateKeyDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateKeyDescriptionResponse self = new UpdateKeyDescriptionResponse();
        return TeaModel.build(map, self);
    }

}
