// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DescribeKeyRequest extends TeaModel {
    /**
     * <p>The ID of the CMK. The ID must be globally unique.</p>
     * <p>You can also set this parameter to an alias that is bound to the CMK. For more information, see <a href="https://help.aliyun.com/document_detail/68522.html">Overview of aliases</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>05754286-3ba2-4fa6-8d41-4323aca6****</p>
     */
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
