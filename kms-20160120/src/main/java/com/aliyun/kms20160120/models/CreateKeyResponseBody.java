// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateKeyResponseBody extends TeaModel {
    @NameInMap("KeyMetadata")
    public CreateKeyResponseBodyKeyMetadata keyMetadata;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateKeyResponseBody self = new CreateKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateKeyResponseBody setKeyMetadata(CreateKeyResponseBodyKeyMetadata keyMetadata) {
        this.keyMetadata = keyMetadata;
        return this;
    }
    public CreateKeyResponseBodyKeyMetadata getKeyMetadata() {
        return this.keyMetadata;
    }

    public CreateKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateKeyResponseBodyKeyMetadata extends TeaModel {
        @NameInMap("Arn")
        public String arn;

        @NameInMap("AutomaticRotation")
        public String automaticRotation;

        @NameInMap("CreationDate")
        public String creationDate;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("DeleteDate")
        public String deleteDate;

        @NameInMap("Description")
        public String description;

        @NameInMap("KeyId")
        public String keyId;

        @NameInMap("KeySpec")
        public String keySpec;

        @NameInMap("KeyState")
        public String keyState;

        @NameInMap("KeyUsage")
        public String keyUsage;

        @NameInMap("LastRotationDate")
        public String lastRotationDate;

        @NameInMap("MaterialExpireTime")
        public String materialExpireTime;

        @NameInMap("NextRotationDate")
        public String nextRotationDate;

        @NameInMap("Origin")
        public String origin;

        @NameInMap("PrimaryKeyVersion")
        public String primaryKeyVersion;

        @NameInMap("ProtectionLevel")
        public String protectionLevel;

        @NameInMap("RotationInterval")
        public String rotationInterval;

        public static CreateKeyResponseBodyKeyMetadata build(java.util.Map<String, ?> map) throws Exception {
            CreateKeyResponseBodyKeyMetadata self = new CreateKeyResponseBodyKeyMetadata();
            return TeaModel.build(map, self);
        }

        public CreateKeyResponseBodyKeyMetadata setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public CreateKeyResponseBodyKeyMetadata setAutomaticRotation(String automaticRotation) {
            this.automaticRotation = automaticRotation;
            return this;
        }
        public String getAutomaticRotation() {
            return this.automaticRotation;
        }

        public CreateKeyResponseBodyKeyMetadata setCreationDate(String creationDate) {
            this.creationDate = creationDate;
            return this;
        }
        public String getCreationDate() {
            return this.creationDate;
        }

        public CreateKeyResponseBodyKeyMetadata setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public CreateKeyResponseBodyKeyMetadata setDeleteDate(String deleteDate) {
            this.deleteDate = deleteDate;
            return this;
        }
        public String getDeleteDate() {
            return this.deleteDate;
        }

        public CreateKeyResponseBodyKeyMetadata setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateKeyResponseBodyKeyMetadata setKeyId(String keyId) {
            this.keyId = keyId;
            return this;
        }
        public String getKeyId() {
            return this.keyId;
        }

        public CreateKeyResponseBodyKeyMetadata setKeySpec(String keySpec) {
            this.keySpec = keySpec;
            return this;
        }
        public String getKeySpec() {
            return this.keySpec;
        }

        public CreateKeyResponseBodyKeyMetadata setKeyState(String keyState) {
            this.keyState = keyState;
            return this;
        }
        public String getKeyState() {
            return this.keyState;
        }

        public CreateKeyResponseBodyKeyMetadata setKeyUsage(String keyUsage) {
            this.keyUsage = keyUsage;
            return this;
        }
        public String getKeyUsage() {
            return this.keyUsage;
        }

        public CreateKeyResponseBodyKeyMetadata setLastRotationDate(String lastRotationDate) {
            this.lastRotationDate = lastRotationDate;
            return this;
        }
        public String getLastRotationDate() {
            return this.lastRotationDate;
        }

        public CreateKeyResponseBodyKeyMetadata setMaterialExpireTime(String materialExpireTime) {
            this.materialExpireTime = materialExpireTime;
            return this;
        }
        public String getMaterialExpireTime() {
            return this.materialExpireTime;
        }

        public CreateKeyResponseBodyKeyMetadata setNextRotationDate(String nextRotationDate) {
            this.nextRotationDate = nextRotationDate;
            return this;
        }
        public String getNextRotationDate() {
            return this.nextRotationDate;
        }

        public CreateKeyResponseBodyKeyMetadata setOrigin(String origin) {
            this.origin = origin;
            return this;
        }
        public String getOrigin() {
            return this.origin;
        }

        public CreateKeyResponseBodyKeyMetadata setPrimaryKeyVersion(String primaryKeyVersion) {
            this.primaryKeyVersion = primaryKeyVersion;
            return this;
        }
        public String getPrimaryKeyVersion() {
            return this.primaryKeyVersion;
        }

        public CreateKeyResponseBodyKeyMetadata setProtectionLevel(String protectionLevel) {
            this.protectionLevel = protectionLevel;
            return this;
        }
        public String getProtectionLevel() {
            return this.protectionLevel;
        }

        public CreateKeyResponseBodyKeyMetadata setRotationInterval(String rotationInterval) {
            this.rotationInterval = rotationInterval;
            return this;
        }
        public String getRotationInterval() {
            return this.rotationInterval;
        }

    }

}
