// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DescribeSecretResponseBody extends TeaModel {
    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the secret.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:kms:cn-hangzhou:154035569884****:secret/secret001</p>
     */
    @NameInMap("Arn")
    public String arn;

    /**
     * <p>Indicates whether automatic rotation is enabled. Valid values:</p>
     * <ul>
     * <li>Enabled: indicates that automatic rotation is enabled.</li>
     * <li>Disabled: indicates that automatic rotation is disabled.</li>
     * <li>Invalid: indicates that the status of automatic rotation is abnormal. In this case, Secrets Manager cannot automatically rotate the secret.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is returned only for a managed ApsaraDB RDS secret, a managed RAM secret, or a managed ECS secret.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("AutomaticRotation")
    public String automaticRotation;

    /**
     * <p>The time when the secret was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-02-21T15:39:26Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The ID of the dedicated KMS instance.</p>
     * 
     * <strong>example:</strong>
     * <p>kst-bjj62d8f5e0sgtx8h****</p>
     */
    @NameInMap("DKMSInstanceId")
    public String DKMSInstanceId;

    /**
     * <p>The description of the secret.</p>
     * 
     * <strong>example:</strong>
     * <p>userinfo</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the customer master key (CMK) that is used to encrypt the secret value.</p>
     * 
     * <strong>example:</strong>
     * <p>00aa68af-2c02-4f68-95fe-3435d330****</p>
     */
    @NameInMap("EncryptionKeyId")
    public String encryptionKeyId;

    /**
     * <p>The extended configuration of the secret.</p>
     * <blockquote>
     * <p> This parameter is returned only for a managed ApsaraDB RDS secret, a managed Resource Access Management (RAM) secret, or a managed Elastic Compute Service (ECS) secret.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;SecretSubType\&quot;:\&quot;SingleUser\&quot;, \&quot;DBInstanceId\&quot;:\&quot;rm-uf667446pc955****\&quot;,  \&quot;CustomData\&quot;:{} }</p>
     */
    @NameInMap("ExtendedConfig")
    public String extendedConfig;

    /**
     * <p>The time when the last rotation was performed.</p>
     * <blockquote>
     * <p> This parameter is returned if the secret was rotated.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2022-07-05T08:22:03Z</p>
     */
    @NameInMap("LastRotationDate")
    public String lastRotationDate;

    /**
     * <p>The time when the next rotation will be performed.</p>
     * <blockquote>
     * <p> This parameter is returned when automatic rotation is enabled.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2022-07-06T18:22:03Z</p>
     */
    @NameInMap("NextRotationDate")
    public String nextRotationDate;

    /**
     * <p>The time when the secret is scheduled to be deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-03-21T15:45:12Z</p>
     */
    @NameInMap("PlannedDeleteTime")
    public String plannedDeleteTime;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>93348dfb-3627-4417-8d90-487a76a909c9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The interval for automatic rotation.</p>
     * <p>The value is in the <code>integer[unit]</code> format. <code>integer</code> indicates the length of time. <code>unit</code>: indicates the time unit. The value of <code>unit</code> is fixed as s. For example, if the value is 604800s, automatic rotation is performed at a 7-day interval.</p>
     * <blockquote>
     * <p> This parameter is returned when automatic rotation is enabled.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3153600s</p>
     */
    @NameInMap("RotationInterval")
    public String rotationInterval;

    /**
     * <p>The name of the secret.</p>
     * 
     * <strong>example:</strong>
     * <p>secret001</p>
     */
    @NameInMap("SecretName")
    public String secretName;

    /**
     * <p>The type of the secret. Valid values:</p>
     * <ul>
     * <li>Generic: indicates a generic secret.</li>
     * <li>Rds: indicates a managed ApsaraDB RDS secret.</li>
     * <li>RAMCredentials: indicates a managed RAM secret.</li>
     * <li>ECS: indicates a managed ECS secret.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Rds</p>
     */
    @NameInMap("SecretType")
    public String secretType;

    /**
     * <p>The resource tags of the secret.</p>
     * <p>This parameter is not returned if you set the FetchTags parameter to false or you do not specify the FetchTags parameter.</p>
     */
    @NameInMap("Tags")
    public DescribeSecretResponseBodyTags tags;

    /**
     * <p>The time when the secret was updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-02-21T15:39:26Z</p>
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
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>val1</p>
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
