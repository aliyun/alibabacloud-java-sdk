// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateKeyResponseBody extends TeaModel {
    /**
     * <p>The metadata of the key.</p>
     */
    @NameInMap("KeyMetadata")
    public CreateKeyResponseBodyKeyMetadata keyMetadata;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>381D5D33-BB8F-395F-8EE4-AE3BB4B523C4</p>
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
         * <p>The Alibaba Cloud Resource Name (ARN) of the key.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:kms:cn-qingdao:154035569884****:key/key-hzz62f1cb66fa42qo****</p>
         */
        @NameInMap("Arn")
        public String arn;

        /**
         * <p>The status of automatic key rotation. Valid values:</p>
         * <ul>
         * <li>Enabled</li>
         * <li>Disabled</li>
         * <li>Suspended</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("AutomaticRotation")
        public String automaticRotation;

        /**
         * <p>The date and time (UTC) when the key was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-25T10:00:00Z</p>
         */
        @NameInMap("CreationDate")
        public String creationDate;

        /**
         * <p>The user who created the key.</p>
         * 
         * <strong>example:</strong>
         * <p>154035569884****</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The ID of the KMS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>kst-bjj62d8f5e0sgtx8h****</p>
         */
        @NameInMap("DKMSInstanceId")
        public String DKMSInstanceId;

        /**
         * <p>The time when the key is scheduled for deletion. For more information, see ScheduleKeyDeletion.</p>
         * <p>This parameter is returned only when the value of KeyState is PendingDeletion.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-25T10:00:00Z</p>
         */
        @NameInMap("DeleteDate")
        public String deleteDate;

        /**
         * <p>The description of the key.</p>
         * 
         * <strong>example:</strong>
         * <p>key description example</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The globally unique ID of the key.</p>
         * 
         * <strong>example:</strong>
         * <p>key-hzz62f1cb66fa42qo****</p>
         */
        @NameInMap("KeyId")
        public String keyId;

        /**
         * <p>The specification of the key.</p>
         * 
         * <strong>example:</strong>
         * <p>Aliyun_AES_256</p>
         */
        @NameInMap("KeySpec")
        public String keySpec;

        /**
         * <p>The status of the key.</p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/44211.html">Impacts of key status on API operations</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("KeyState")
        public String keyState;

        /**
         * <p>The usage of the key.</p>
         * 
         * <strong>example:</strong>
         * <p>ENCRYPT/DECRYPT</p>
         */
        @NameInMap("KeyUsage")
        public String keyUsage;

        /**
         * <p>The time when the last rotation was performed. The time is displayed in UTC.</p>
         * <p>For a new key, this parameter value is the time when the initial version of the key was generated.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-25T10:00:00Z</p>
         */
        @NameInMap("LastRotationDate")
        public String lastRotationDate;

        /**
         * <p>The time when the key material expires. The time is displayed in UTC.</p>
         * <p>If this parameter value is empty, the key material does not expire.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-25T10:00:00Z</p>
         */
        @NameInMap("MaterialExpireTime")
        public String materialExpireTime;

        /**
         * <p>The time when the key is next rotated.</p>
         * <p>This value is returned only when the value of AutomaticRotation is Enabled or Suspended.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-25T10:00:00Z</p>
         */
        @NameInMap("NextRotationDate")
        public String nextRotationDate;

        /**
         * <p>The key material origin.</p>
         * 
         * <strong>example:</strong>
         * <p>Aliyun_KMS</p>
         */
        @NameInMap("Origin")
        public String origin;

        /**
         * <p>The current primary version identifier of the key.</p>
         * 
         * <strong>example:</strong>
         * <p>7ce1d081-06cb-42e6-aab6-5c5de030****</p>
         */
        @NameInMap("PrimaryKeyVersion")
        public String primaryKeyVersion;

        /**
         * <p>The protection level of the key.</p>
         * 
         * <strong>example:</strong>
         * <p>SOFTWARE</p>
         */
        @NameInMap("ProtectionLevel")
        public String protectionLevel;

        /**
         * <p>The interval for automatic key rotation. Unit: seconds. The format is an integer value followed by the character s. For example, if the rotation period is seven days, this parameter is set to 604800s.</p>
         * <p>This value is returned only when the value of AutomaticRotation is Enabled or Suspended.</p>
         * 
         * <strong>example:</strong>
         * <p>31536000s</p>
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
