// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DescribeKeyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("KeyMetadata")
    @Validation(required = true)
    public DescribeKeyResponseKeyMetadata keyMetadata;

    public static DescribeKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeKeyResponse self = new DescribeKeyResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeKeyResponseKeyMetadata extends TeaModel {
        @NameInMap("CreationDate")
        @Validation(required = true)
        public String creationDate;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("KeyId")
        @Validation(required = true)
        public String keyId;

        @NameInMap("KeyState")
        @Validation(required = true)
        public String keyState;

        @NameInMap("KeyUsage")
        @Validation(required = true)
        public String keyUsage;

        @NameInMap("DeleteDate")
        @Validation(required = true)
        public String deleteDate;

        @NameInMap("Creator")
        @Validation(required = true)
        public String creator;

        @NameInMap("Arn")
        @Validation(required = true)
        public String arn;

        @NameInMap("Origin")
        @Validation(required = true)
        public String origin;

        @NameInMap("MaterialExpireTime")
        @Validation(required = true)
        public String materialExpireTime;

        @NameInMap("ProtectionLevel")
        @Validation(required = true)
        public String protectionLevel;

        @NameInMap("PrimaryKeyVersion")
        @Validation(required = true)
        public String primaryKeyVersion;

        @NameInMap("LastRotationDate")
        @Validation(required = true)
        public String lastRotationDate;

        @NameInMap("AutomaticRotation")
        @Validation(required = true)
        public String automaticRotation;

        @NameInMap("RotationInterval")
        @Validation(required = true)
        public String rotationInterval;

        @NameInMap("NextRotationDate")
        @Validation(required = true)
        public String nextRotationDate;

        @NameInMap("KeySpec")
        @Validation(required = true)
        public String keySpec;

        public static DescribeKeyResponseKeyMetadata build(java.util.Map<String, ?> map) throws Exception {
            DescribeKeyResponseKeyMetadata self = new DescribeKeyResponseKeyMetadata();
            return TeaModel.build(map, self);
        }

    }

}
