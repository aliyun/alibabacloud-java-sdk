// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListResourceTagsRequest extends TeaModel {
    @NameInMap("KeyId")
    @Validation(required = true)
    public String keyId;

    public static ListResourceTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceTagsRequest self = new ListResourceTagsRequest();
        return TeaModel.build(map, self);
    }

}
