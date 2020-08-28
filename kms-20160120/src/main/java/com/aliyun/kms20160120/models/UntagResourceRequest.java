// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UntagResourceRequest extends TeaModel {
    @NameInMap("KeyId")
    public String keyId;

    @NameInMap("TagKeys")
    @Validation(required = true)
    public String tagKeys;

    @NameInMap("SecretName")
    public String secretName;

    public static UntagResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UntagResourceRequest self = new UntagResourceRequest();
        return TeaModel.build(map, self);
    }

}
