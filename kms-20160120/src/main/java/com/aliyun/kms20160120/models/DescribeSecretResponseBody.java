// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DescribeSecretResponseBody extends TeaModel {
    @NameInMap("Arn")
    public String arn;

    @NameInMap("AutomaticRotation")
    public String automaticRotation;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("EncryptionKeyId")
    public String encryptionKeyId;

    @NameInMap("ExtendedConfig")
    public String extendedConfig;

    @NameInMap("LastRotationDate")
    public String lastRotationDate;

    @NameInMap("NextRotationDate")
    public String nextRotationDate;

    @NameInMap("PlannedDeleteTime")
    public String plannedDeleteTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RotationInterval")
    public String rotationInterval;

    @NameInMap("SecretName")
    public String secretName;

    @NameInMap("SecretType")
    public String secretType;

    @NameInMap("Tags")
    public DescribeSecretResponseBodyTags tags;

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
        @NameInMap("TagKey")
        public String tagKey;

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
