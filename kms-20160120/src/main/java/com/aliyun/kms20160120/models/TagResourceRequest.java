// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class TagResourceRequest extends TeaModel {
    @NameInMap("KeyId")
    public String keyId;

    @NameInMap("Tags")
    @Validation(required = true)
    public String tags;

    @NameInMap("SecretName")
    public String secretName;

    public static TagResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        TagResourceRequest self = new TagResourceRequest();
        return TeaModel.build(map, self);
    }

}
