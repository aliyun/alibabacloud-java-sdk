// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DescribeKeyRequest extends TeaModel {
    @NameInMap("KeyId")
    public String keyId;

    public static DescribeKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeKeyRequest self = new DescribeKeyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeKeyRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

}
