// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DescribeKeyVersionRequest extends TeaModel {
    @NameInMap("KeyId")
    @Validation(required = true)
    public String keyId;

    @NameInMap("KeyVersionId")
    @Validation(required = true)
    public String keyVersionId;

    public static DescribeKeyVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeKeyVersionRequest self = new DescribeKeyVersionRequest();
        return TeaModel.build(map, self);
    }

}
