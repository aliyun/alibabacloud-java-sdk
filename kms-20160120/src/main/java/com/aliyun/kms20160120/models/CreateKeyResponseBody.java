// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateKeyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("KeyMetadata")
    public CreateKeyResponseBodyKeyMetadata keyMetadata;

    /**
     * <p>The ID of the dedicated KMS instance.</p>
     */
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
        /**
         * <p>The period of automatic key rotation. Unit: seconds. The value is in the format of an integer followed by the letter s. For example, if the rotation period is seven days, this parameter is set to 604800s. This value is returned only when the value of the AutomaticRotation parameter is Enabled or Suspended.</p>
         */
        @NameInMap("Arn")
        public String arn;

        /**
         * <p>The time when the key material expires. The time is displayed in UTC.</p>
         * <br>
         * <p>If this parameter value is empty, the key material does not expire.</p>
         */
        @NameInMap("AutomaticRotation")
        public String automaticRotation;

        /**
         * <p>The usage of the CMK.</p>
         */
        @NameInMap("CreationDate")
        public String creationDate;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the CMK.</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The date and time when the CMK was created. The time is displayed in UTC.</p>
         */
        @NameInMap("DKMSInstanceId")
        public String DKMSInstanceId;

        /**
         * <p>The time when the last rotation was performed. The time is displayed in UTC.</p>
         * <br>
         * <p>For a new CMK, this parameter value is the time when the initial version of the CMK was generated.</p>
         */
        @NameInMap("DeleteDate")
        public String deleteDate;

        /**
         * <p>The ID of the current primary key version of the symmetric CMK.</p>
         * <br>
         * <p>> * The primary key version of a symmetric CMK is an active encryption key. KMS uses the primary key version of a specified CMK to encrypt data.</p>
         * <p>> * This parameter is unavailable for asymmetric CMKs.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The metadata of the CMK.</p>
         */
        @NameInMap("KeyId")
        public String keyId;

        /**
         * <p>The description of the CMK.</p>
         */
        @NameInMap("KeySpec")
        public String keySpec;

        /**
         * <p>The time when the next rotation will be performed.</p>
         * <br>
         * <p>>  This value is returned only when the value of the AutomaticRotation parameter is Enabled or Suspended.</p>
         */
        @NameInMap("KeyState")
        public String keyState;

        /**
         * <p>The protection level of the CMK.</p>
         */
        @NameInMap("KeyUsage")
        public String keyUsage;

        /**
         * <p>The creator of the CMK.</p>
         */
        @NameInMap("LastRotationDate")
        public String lastRotationDate;

        /**
         * <p>The source of the key material for the CMK.</p>
         */
        @NameInMap("MaterialExpireTime")
        public String materialExpireTime;

        /**
         * <p>The ID of the CMK. The ID must be globally unique.</p>
         */
        @NameInMap("NextRotationDate")
        public String nextRotationDate;

        /**
         * <p>The type of the CMK.</p>
         */
        @NameInMap("Origin")
        public String origin;

        /**
         * <p>The time when the CMK is scheduled for deletion.</p>
         * <br>
         * <p>For more information, see [ScheduleKeyDeletion](~~44196~~).</p>
         * <br>
         * <p>>  This value is returned only when the value of the KeyState parameter is PendingDeletion.</p>
         */
        @NameInMap("PrimaryKeyVersion")
        public String primaryKeyVersion;

        /**
         * <p>Indicates whether automatic key rotation is enabled. Valid values:</p>
         * <br>
         * <p>*   Enabled: Automatic key rotation is enabled.</p>
         * <p>*   Disabled: Automatic key rotation is disabled.</p>
         * <p>*   Suspended: Automatic key rotation is suspended. For more information, see [Automatic key rotation](~~134270~~).</p>
         * <br>
         * <p>>  Automatic key rotation is available only for symmetric CMKs.</p>
         */
        @NameInMap("ProtectionLevel")
        public String protectionLevel;

        /**
         * <p>The status of the CMK.</p>
         * <br>
         * <p>For more information, see [Impact of CMK status on API operations](~~44211~~).</p>
         */
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

        public CreateKeyResponseBodyKeyMetadata setDKMSInstanceId(String DKMSInstanceId) {
            this.DKMSInstanceId = DKMSInstanceId;
            return this;
        }
        public String getDKMSInstanceId() {
            return this.DKMSInstanceId;
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
