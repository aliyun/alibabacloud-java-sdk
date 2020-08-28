// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateRotationPolicyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UpdateRotationPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRotationPolicyResponse self = new UpdateRotationPolicyResponse();
        return TeaModel.build(map, self);
    }

}
