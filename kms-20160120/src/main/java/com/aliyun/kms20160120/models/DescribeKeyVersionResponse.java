// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DescribeKeyVersionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("KeyVersion")
    @Validation(required = true)
    public DescribeKeyVersionResponseKeyVersion keyVersion;

    public static DescribeKeyVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeKeyVersionResponse self = new DescribeKeyVersionResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeKeyVersionResponseKeyVersion extends TeaModel {
        @NameInMap("KeyId")
        @Validation(required = true)
        public String keyId;

        @NameInMap("KeyVersionId")
        @Validation(required = true)
        public String keyVersionId;

        @NameInMap("CreationDate")
        @Validation(required = true)
        public String creationDate;

        public static DescribeKeyVersionResponseKeyVersion build(java.util.Map<String, ?> map) throws Exception {
            DescribeKeyVersionResponseKeyVersion self = new DescribeKeyVersionResponseKeyVersion();
            return TeaModel.build(map, self);
        }

    }

}
