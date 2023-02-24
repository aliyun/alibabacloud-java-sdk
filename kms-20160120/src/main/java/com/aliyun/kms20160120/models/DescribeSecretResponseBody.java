// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DescribeSecretResponseBody extends TeaModel {
    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the secret.</p>
     */
    @NameInMap("Arn")
    public String arn;

    /**
     * <p>Indicates whether automatic rotation is enabled. Valid values:</p>
     * <br>
     * <p>*   Enabled: indicates that automatic rotation is enabled.</p>
     * <p>*   Disabled: indicates that automatic rotation is disabled.</p>
     * <p>*   Invalid: indicates that the status of automatic rotation is abnormal. In this case, Secrets Manager cannot automatically rotate the secret.</p>
     * <br>
     * <p>>  This parameter is returned only for a managed ApsaraDB RDS secret, a managed RAM secret, or a managed ECS secret.</p>
     */
    @NameInMap("AutomaticRotation")
    public String automaticRotation;

    /**
     * <p>The time when the secret was created.</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The ID of the dedicated KMS instance.</p>
     */
    @NameInMap("DKMSInstanceId")
    public String DKMSInstanceId;

    /**
     * <p>The description of the secret.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the customer master key (CMK) that is used to encrypt the secret value.</p>
     */
    @NameInMap("EncryptionKeyId")
    public String encryptionKeyId;

    /**
     * <p>The extended configuration of the secret.</p>
     * <br>
     * <p>>  This parameter is returned only for a managed ApsaraDB RDS secret, a managed Resource Access Management (RAM) secret, or a managed Elastic Compute Service (ECS) secret.</p>
     */
    @NameInMap("ExtendedConfig")
    public String extendedConfig;

    /**
     * <p>The time when the last rotation was performed.</p>
     * <br>
     * <p>>  This parameter is returned if the secret was rotated.</p>
     */
    @NameInMap("LastRotationDate")
    public String lastRotationDate;

    /**
     * <p>The time when the next rotation will be performed.</p>
     * <br>
     * <p>>  This parameter is returned when automatic rotation is enabled.</p>
     */
    @NameInMap("NextRotationDate")
    public String nextRotationDate;

    /**
     * <p>The time when the secret is scheduled to be deleted.</p>
     */
    @NameInMap("PlannedDeleteTime")
    public String plannedDeleteTime;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The interval for automatic rotation.</p>
     * <br>
     * <p>The value is in the `integer[unit]` format. `integer` indicates the length of time. `unit`: indicates the time unit. The value of `unit` is fixed as s. For example, if the value is 604800s, automatic rotation is performed at a 7-day interval.</p>
     * <br>
     * <p>>  This parameter is returned when automatic rotation is enabled.</p>
     */
    @NameInMap("RotationInterval")
    public String rotationInterval;

    /**
     * <p>The name of the secret.</p>
     */
    @NameInMap("SecretName")
    public String secretName;

    /**
     * <p>The type of the secret. Valid values:</p>
     * <br>
     * <p>*   Generic: indicates a generic secret.</p>
     * <p>*   Rds: indicates a managed ApsaraDB RDS secret.</p>
     * <p>*   RAMCredentials: indicates a managed RAM secret.</p>
     * <p>*   ECS: indicates a managed ECS secret.</p>
     */
    @NameInMap("SecretType")
    public String secretType;

    /**
     * <p>The resource tags of the secret.</p>
     * <br>
     * <p>This parameter is not returned if you set the FetchTags parameter to false or you do not specify the FetchTags parameter.</p>
     */
    @NameInMap("Tags")
    public DescribeSecretResponseBodyTags tags;

    /**
     * <p>The time when the secret was updated.</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    public static DescribeSecretResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecretResponseBody self = new DescribeSecretResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSecretResponseBody setArn(String arn) {
        this.arn = arn;
        return this;
    }
    public String getArn() {
        return this.arn;
    }

    public DescribeSecretResponseBody setAutomaticRotation(String automaticRotation) {
        this.automaticRotation = automaticRotation;
        return this;
    }
    public String getAutomaticRotation() {
        return this.automaticRotation;
    }

    public DescribeSecretResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeSecretResponseBody setDKMSInstanceId(String DKMSInstanceId) {
        this.DKMSInstanceId = DKMSInstanceId;
        return this;
    }
    public String getDKMSInstanceId() {
        return this.DKMSInstanceId;
    }

    public DescribeSecretResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeSecretResponseBody setEncryptionKeyId(String encryptionKeyId) {
        this.encryptionKeyId = encryptionKeyId;
        return this;
    }
    public String getEncryptionKeyId() {
        return this.encryptionKeyId;
    }

    public DescribeSecretResponseBody setExtendedConfig(String extendedConfig) {
        this.extendedConfig = extendedConfig;
        return this;
    }
    public String getExtendedConfig() {
        return this.extendedConfig;
    }

    public DescribeSecretResponseBody setLastRotationDate(String lastRotationDate) {
        this.lastRotationDate = lastRotationDate;
        return this;
    }
    public String getLastRotationDate() {
        return this.lastRotationDate;
    }

    public DescribeSecretResponseBody setNextRotationDate(String nextRotationDate) {
        this.nextRotationDate = nextRotationDate;
        return this;
    }
    public String getNextRotationDate() {
        return this.nextRotationDate;
    }

    public DescribeSecretResponseBody setPlannedDeleteTime(String plannedDeleteTime) {
        this.plannedDeleteTime = plannedDeleteTime;
        return this;
    }
    public String getPlannedDeleteTime() {
        return this.plannedDeleteTime;
    }

    public DescribeSecretResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSecretResponseBody setRotationInterval(String rotationInterval) {
        this.rotationInterval = rotationInterval;
        return this;
    }
    public String getRotationInterval() {
        return this.rotationInterval;
    }

    public DescribeSecretResponseBody setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

    public DescribeSecretResponseBody setSecretType(String secretType) {
        this.secretType = secretType;
        return this;
    }
    public String getSecretType() {
        return this.secretType;
    }

    public DescribeSecretResponseBody setTags(DescribeSecretResponseBodyTags tags) {
        this.tags = tags;
        return this;
    }
    public DescribeSecretResponseBodyTags getTags() {
        return this.tags;
    }

    public DescribeSecretResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static class DescribeSecretResponseBodyTagsTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeSecretResponseBodyTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecretResponseBodyTagsTag self = new DescribeSecretResponseBodyTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeSecretResponseBodyTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeSecretResponseBodyTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeSecretResponseBodyTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeSecretResponseBodyTagsTag> tag;

        public static DescribeSecretResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecretResponseBodyTags self = new DescribeSecretResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DescribeSecretResponseBodyTags setTag(java.util.List<DescribeSecretResponseBodyTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeSecretResponseBodyTagsTag> getTag() {
            return this.tag;
        }

    }

}
