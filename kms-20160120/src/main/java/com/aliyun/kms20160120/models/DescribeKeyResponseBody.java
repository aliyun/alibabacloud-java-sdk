// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DescribeKeyResponseBody extends TeaModel {
    /**
     * <p>The metadata of the CMK.</p>
     */
    @NameInMap("KeyMetadata")
    public DescribeKeyResponseBodyKeyMetadata keyMetadata;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeKeyResponseBody self = new DescribeKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeKeyResponseBody setKeyMetadata(DescribeKeyResponseBodyKeyMetadata keyMetadata) {
        this.keyMetadata = keyMetadata;
        return this;
    }
    public DescribeKeyResponseBodyKeyMetadata getKeyMetadata() {
        return this.keyMetadata;
    }

    public DescribeKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeKeyResponseBodyKeyMetadata extends TeaModel {
        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the CMK.</p>
         */
        @NameInMap("Arn")
        public String arn;

        /**
         * <p>Indicates whether automatic key rotation is enabled. Valid values:</p>
         * <br>
         * <p>*   Enabled</p>
         * <p>*   Disabled</p>
         * <p>*   Suspended</p>
         * <br>
         * <p>For more information, see [Automatic key rotation](https://help.aliyun.com/document_detail/134270.html).</p>
         * <br>
         * <p>>  Only symmetric CMKs support automatic key rotation.</p>
         */
        @NameInMap("AutomaticRotation")
        public String automaticRotation;

        /**
         * <p>The time when the CMK was created. The time is displayed in UTC.</p>
         */
        @NameInMap("CreationDate")
        public String creationDate;

        /**
         * <p>The Alibaba Cloud account that is used to create the CMK.</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The ID of the dedicated KMS instance.</p>
         */
        @NameInMap("DKMSInstanceId")
        public String DKMSInstanceId;

        /**
         * <p>The time at which the CMK is scheduled for deletion. The time is displayed in UTC.</p>
         * <br>
         * <p>For more information, see [ScheduleKeyDeletion](https://help.aliyun.com/document_detail/44196.html).</p>
         * <br>
         * <p>>  This parameter is returned only when the value of the KeyState parameter is PendingDeletion.</p>
         */
        @NameInMap("DeleteDate")
        public String deleteDate;

        /**
         * <p>Indicates whether deletion protection is enabled. Valid values:</p>
         * <br>
         * <p>*   Enabled</p>
         * <p>*   Disabled</p>
         */
        @NameInMap("DeletionProtection")
        public String deletionProtection;

        /**
         * <p>The description of deletion protection.</p>
         */
        @NameInMap("DeletionProtectionDescription")
        public String deletionProtectionDescription;

        /**
         * <p>The description of the CMK.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the CMK. The ID must be globally unique.</p>
         */
        @NameInMap("KeyId")
        public String keyId;

        /**
         * <p>The type of the CMK.</p>
         */
        @NameInMap("KeySpec")
        public String keySpec;

        /**
         * <p>The status of the CMK.</p>
         * <br>
         * <p>For more information, see [Impact of CMK status on API operations](https://help.aliyun.com/document_detail/44211.html).</p>
         */
        @NameInMap("KeyState")
        public String keyState;

        /**
         * <p>The usage of the CMK.</p>
         */
        @NameInMap("KeyUsage")
        public String keyUsage;

        /**
         * <p>The time when the last rotation was performed. The time is displayed in UTC. For a new CMK, the value of this parameter is the time when the initial version of the CMK was generated.</p>
         */
        @NameInMap("LastRotationDate")
        public String lastRotationDate;

        /**
         * <p>The time when the key material expires. The time is displayed in UTC. If this parameter value is empty, the key material does not expire.</p>
         */
        @NameInMap("MaterialExpireTime")
        public String materialExpireTime;

        /**
         * <p>The time when the next rotation will be performed.</p>
         * <br>
         * <p>>  This parameter is returned only when the value of the AutomaticRotation parameter is Enabled or Suspended.</p>
         */
        @NameInMap("NextRotationDate")
        public String nextRotationDate;

        /**
         * <p>The source of the key material for the CMK.</p>
         */
        @NameInMap("Origin")
        public String origin;

        /**
         * <p>The ID of the current primary key version for the symmetric CMK.</p>
         */
        @NameInMap("PrimaryKeyVersion")
        public String primaryKeyVersion;

        /**
         * <p>The protection level of the CMK.</p>
         */
        @NameInMap("ProtectionLevel")
        public String protectionLevel;

        /**
         * <p>The interval for automatic key rotation.</p>
         * <br>
         * <p>Unit: seconds.</p>
         * <br>
         * <p>For example, if the value is 604800s, automatic key rotation is performed at a 7-day interval.</p>
         * <br>
         * <p>>  This parameter is returned only when the value of the AutomaticRotation parameter is Enabled or Suspended.</p>
         */
        @NameInMap("RotationInterval")
        public String rotationInterval;

        public static DescribeKeyResponseBodyKeyMetadata build(java.util.Map<String, ?> map) throws Exception {
            DescribeKeyResponseBodyKeyMetadata self = new DescribeKeyResponseBodyKeyMetadata();
            return TeaModel.build(map, self);
        }

        public DescribeKeyResponseBodyKeyMetadata setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public DescribeKeyResponseBodyKeyMetadata setAutomaticRotation(String automaticRotation) {
            this.automaticRotation = automaticRotation;
            return this;
        }
        public String getAutomaticRotation() {
            return this.automaticRotation;
        }

        public DescribeKeyResponseBodyKeyMetadata setCreationDate(String creationDate) {
            this.creationDate = creationDate;
            return this;
        }
        public String getCreationDate() {
            return this.creationDate;
        }

        public DescribeKeyResponseBodyKeyMetadata setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DescribeKeyResponseBodyKeyMetadata setDKMSInstanceId(String DKMSInstanceId) {
            this.DKMSInstanceId = DKMSInstanceId;
            return this;
        }
        public String getDKMSInstanceId() {
            return this.DKMSInstanceId;
        }

        public DescribeKeyResponseBodyKeyMetadata setDeleteDate(String deleteDate) {
            this.deleteDate = deleteDate;
            return this;
        }
        public String getDeleteDate() {
            return this.deleteDate;
        }

        public DescribeKeyResponseBodyKeyMetadata setDeletionProtection(String deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }
        public String getDeletionProtection() {
            return this.deletionProtection;
        }

        public DescribeKeyResponseBodyKeyMetadata setDeletionProtectionDescription(String deletionProtectionDescription) {
            this.deletionProtectionDescription = deletionProtectionDescription;
            return this;
        }
        public String getDeletionProtectionDescription() {
            return this.deletionProtectionDescription;
        }

        public DescribeKeyResponseBodyKeyMetadata setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeKeyResponseBodyKeyMetadata setKeyId(String keyId) {
            this.keyId = keyId;
            return this;
        }
        public String getKeyId() {
            return this.keyId;
        }

        public DescribeKeyResponseBodyKeyMetadata setKeySpec(String keySpec) {
            this.keySpec = keySpec;
            return this;
        }
        public String getKeySpec() {
            return this.keySpec;
        }

        public DescribeKeyResponseBodyKeyMetadata setKeyState(String keyState) {
            this.keyState = keyState;
            return this;
        }
        public String getKeyState() {
            return this.keyState;
        }

        public DescribeKeyResponseBodyKeyMetadata setKeyUsage(String keyUsage) {
            this.keyUsage = keyUsage;
            return this;
        }
        public String getKeyUsage() {
            return this.keyUsage;
        }

        public DescribeKeyResponseBodyKeyMetadata setLastRotationDate(String lastRotationDate) {
            this.lastRotationDate = lastRotationDate;
            return this;
        }
        public String getLastRotationDate() {
            return this.lastRotationDate;
        }

        public DescribeKeyResponseBodyKeyMetadata setMaterialExpireTime(String materialExpireTime) {
            this.materialExpireTime = materialExpireTime;
            return this;
        }
        public String getMaterialExpireTime() {
            return this.materialExpireTime;
        }

        public DescribeKeyResponseBodyKeyMetadata setNextRotationDate(String nextRotationDate) {
            this.nextRotationDate = nextRotationDate;
            return this;
        }
        public String getNextRotationDate() {
            return this.nextRotationDate;
        }

        public DescribeKeyResponseBodyKeyMetadata setOrigin(String origin) {
            this.origin = origin;
            return this;
        }
        public String getOrigin() {
            return this.origin;
        }

        public DescribeKeyResponseBodyKeyMetadata setPrimaryKeyVersion(String primaryKeyVersion) {
            this.primaryKeyVersion = primaryKeyVersion;
            return this;
        }
        public String getPrimaryKeyVersion() {
            return this.primaryKeyVersion;
        }

        public DescribeKeyResponseBodyKeyMetadata setProtectionLevel(String protectionLevel) {
            this.protectionLevel = protectionLevel;
            return this;
        }
        public String getProtectionLevel() {
            return this.protectionLevel;
        }

        public DescribeKeyResponseBodyKeyMetadata setRotationInterval(String rotationInterval) {
            this.rotationInterval = rotationInterval;
            return this;
        }
        public String getRotationInterval() {
            return this.rotationInterval;
        }

    }

}
