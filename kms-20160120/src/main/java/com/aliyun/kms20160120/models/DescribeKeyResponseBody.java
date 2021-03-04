// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DescribeKeyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("KeyMetadata")
    public DescribeKeyResponseBodyKeyMetadata keyMetadata;

    public static DescribeKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeKeyResponseBody self = new DescribeKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeKeyResponseBody setKeyMetadata(DescribeKeyResponseBodyKeyMetadata keyMetadata) {
        this.keyMetadata = keyMetadata;
        return this;
    }
    public DescribeKeyResponseBodyKeyMetadata getKeyMetadata() {
        return this.keyMetadata;
    }

    public static class DescribeKeyResponseBodyKeyMetadata extends TeaModel {
        @NameInMap("KeyId")
        public String keyId;

        @NameInMap("NextRotationDate")
        public String nextRotationDate;

        @NameInMap("KeyState")
        public String keyState;

        @NameInMap("RotationInterval")
        public String rotationInterval;

        @NameInMap("Arn")
        public String arn;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("DeleteDate")
        public String deleteDate;

        @NameInMap("LastRotationDate")
        public String lastRotationDate;

        @NameInMap("Description")
        public String description;

        @NameInMap("PrimaryKeyVersion")
        public String primaryKeyVersion;

        @NameInMap("Origin")
        public String origin;

        @NameInMap("KeySpec")
        public String keySpec;

        @NameInMap("MaterialExpireTime")
        public String materialExpireTime;

        @NameInMap("AutomaticRotation")
        public String automaticRotation;

        @NameInMap("ProtectionLevel")
        public String protectionLevel;

        @NameInMap("KeyUsage")
        public String keyUsage;

        @NameInMap("CreationDate")
        public String creationDate;

        public static DescribeKeyResponseBodyKeyMetadata build(java.util.Map<String, ?> map) throws Exception {
            DescribeKeyResponseBodyKeyMetadata self = new DescribeKeyResponseBodyKeyMetadata();
            return TeaModel.build(map, self);
        }

        public DescribeKeyResponseBodyKeyMetadata setKeyId(String keyId) {
            this.keyId = keyId;
            return this;
        }
        public String getKeyId() {
            return this.keyId;
        }

        public DescribeKeyResponseBodyKeyMetadata setNextRotationDate(String nextRotationDate) {
            this.nextRotationDate = nextRotationDate;
            return this;
        }
        public String getNextRotationDate() {
            return this.nextRotationDate;
        }

        public DescribeKeyResponseBodyKeyMetadata setKeyState(String keyState) {
            this.keyState = keyState;
            return this;
        }
        public String getKeyState() {
            return this.keyState;
        }

        public DescribeKeyResponseBodyKeyMetadata setRotationInterval(String rotationInterval) {
            this.rotationInterval = rotationInterval;
            return this;
        }
        public String getRotationInterval() {
            return this.rotationInterval;
        }

        public DescribeKeyResponseBodyKeyMetadata setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public DescribeKeyResponseBodyKeyMetadata setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DescribeKeyResponseBodyKeyMetadata setDeleteDate(String deleteDate) {
            this.deleteDate = deleteDate;
            return this;
        }
        public String getDeleteDate() {
            return this.deleteDate;
        }

        public DescribeKeyResponseBodyKeyMetadata setLastRotationDate(String lastRotationDate) {
            this.lastRotationDate = lastRotationDate;
            return this;
        }
        public String getLastRotationDate() {
            return this.lastRotationDate;
        }

        public DescribeKeyResponseBodyKeyMetadata setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeKeyResponseBodyKeyMetadata setPrimaryKeyVersion(String primaryKeyVersion) {
            this.primaryKeyVersion = primaryKeyVersion;
            return this;
        }
        public String getPrimaryKeyVersion() {
            return this.primaryKeyVersion;
        }

        public DescribeKeyResponseBodyKeyMetadata setOrigin(String origin) {
            this.origin = origin;
            return this;
        }
        public String getOrigin() {
            return this.origin;
        }

        public DescribeKeyResponseBodyKeyMetadata setKeySpec(String keySpec) {
            this.keySpec = keySpec;
            return this;
        }
        public String getKeySpec() {
            return this.keySpec;
        }

        public DescribeKeyResponseBodyKeyMetadata setMaterialExpireTime(String materialExpireTime) {
            this.materialExpireTime = materialExpireTime;
            return this;
        }
        public String getMaterialExpireTime() {
            return this.materialExpireTime;
        }

        public DescribeKeyResponseBodyKeyMetadata setAutomaticRotation(String automaticRotation) {
            this.automaticRotation = automaticRotation;
            return this;
        }
        public String getAutomaticRotation() {
            return this.automaticRotation;
        }

        public DescribeKeyResponseBodyKeyMetadata setProtectionLevel(String protectionLevel) {
            this.protectionLevel = protectionLevel;
            return this;
        }
        public String getProtectionLevel() {
            return this.protectionLevel;
        }

        public DescribeKeyResponseBodyKeyMetadata setKeyUsage(String keyUsage) {
            this.keyUsage = keyUsage;
            return this;
        }
        public String getKeyUsage() {
            return this.keyUsage;
        }

        public DescribeKeyResponseBodyKeyMetadata setCreationDate(String creationDate) {
            this.creationDate = creationDate;
            return this;
        }
        public String getCreationDate() {
            return this.creationDate;
        }

    }

}
