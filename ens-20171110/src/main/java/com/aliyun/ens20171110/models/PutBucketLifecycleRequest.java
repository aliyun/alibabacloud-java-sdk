// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class PutBucketLifecycleRequest extends TeaModel {
    /**
     * <p>Whether to allow overlapping prefixes. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Overlapping prefixes are allowed.</p>
     * </li>
     * <li><p><strong>false</strong> (default): Overlapping prefixes are not allowed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AllowSameActionOverlap")
    public Boolean allowSameActionOverlap;

    /**
     * <p>The name of the bucket.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("BucketName")
    public String bucketName;

    /**
     * <p>The date before which objects expire. The system applies the lifecycle rule to objects last modified before this date.</p>
     * <p>Use ISO 8601 format and UTC time. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
     * <blockquote>
     * <p>ExpirationDays and CreatedBeforeDate are mutually exclusive. Specify one.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2023-10-12T05:45:00Z</p>
     */
    @NameInMap("CreatedBeforeDate")
    public String createdBeforeDate;

    /**
     * <p>The number of days after an object\&quot;s last modification when the lifecycle rule takes effect. Must be a positive integer greater than zero.</p>
     * <blockquote>
     * <p>ExpirationDays and CreatedBeforeDate are mutually exclusive. Specify one.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ExpirationDays")
    public Long expirationDays;

    /**
     * <p>The prefix that the rule applies to. You cannot set duplicate prefixes.</p>
     * <ul>
     * <li><p>If you specify a prefix, the rule applies only to objects in the bucket whose names start with that prefix.</p>
     * </li>
     * <li><p>If you leave Prefix empty, the rule applies to all objects in the bucket.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>image</p>
     */
    @NameInMap("Prefix")
    public String prefix;

    /**
     * <p>A unique ID that identifies the rule. Maximum length is 255 bytes.</p>
     * <ul>
     * <li><p>Omit this parameter when creating a new rule. The system generates a unique ID automatically.</p>
     * </li>
     * <li><p>Specify RuleId when updating an existing rule. The rule must exist. Otherwise, the call fails.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>b8f93xxxxx4881xxxxxc71d991</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    /**
     * <p>The status of the rule. Valid values:</p>
     * <ul>
     * <li><p><strong>Enabled</strong>: The system runs the rule on schedule.</p>
     * </li>
     * <li><p><strong>Disabled</strong>: The system ignores the rule.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("Status")
    public String status;

    public static PutBucketLifecycleRequest build(java.util.Map<String, ?> map) throws Exception {
        PutBucketLifecycleRequest self = new PutBucketLifecycleRequest();
        return TeaModel.build(map, self);
    }

    public PutBucketLifecycleRequest setAllowSameActionOverlap(Boolean allowSameActionOverlap) {
        this.allowSameActionOverlap = allowSameActionOverlap;
        return this;
    }
    public Boolean getAllowSameActionOverlap() {
        return this.allowSameActionOverlap;
    }

    public PutBucketLifecycleRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public PutBucketLifecycleRequest setCreatedBeforeDate(String createdBeforeDate) {
        this.createdBeforeDate = createdBeforeDate;
        return this;
    }
    public String getCreatedBeforeDate() {
        return this.createdBeforeDate;
    }

    public PutBucketLifecycleRequest setExpirationDays(Long expirationDays) {
        this.expirationDays = expirationDays;
        return this;
    }
    public Long getExpirationDays() {
        return this.expirationDays;
    }

    public PutBucketLifecycleRequest setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public PutBucketLifecycleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public PutBucketLifecycleRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
