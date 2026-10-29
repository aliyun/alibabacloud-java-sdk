// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class PutBucketLifecycleRequest extends TeaModel {
    /**
     * <p>Specifies whether to allow overlapping prefixes. Valid values:</p>
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
     * <p>The bucket name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("BucketName")
    public String bucketName;

    /**
     * <p>The expiration date. The system performs lifecycle operations on objects that were last modified before this date.</p>
     * <p>The date must be specified in the ISO 8601 standard and in UTC. The format is yyyy-MM-ddTHH:mm:ssZ.</p>
     * <blockquote>
     * <p>ExpirationDays and CreatedBeforeDate are mutually exclusive. You must specify one of them.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2023-10-12T05:45:00Z</p>
     */
    @NameInMap("CreatedBeforeDate")
    public String createdBeforeDate;

    /**
     * <p>The number of days after the last modification time of an object before the lifecycle rule takes effect. The value must be a positive integer greater than 0.</p>
     * <blockquote>
     * <p>ExpirationDays and CreatedBeforeDate are mutually exclusive. You must specify one of them.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ExpirationDays")
    public Long expirationDays;

    /**
     * <p>The prefix to which the rule applies. You cannot specify the same prefix for multiple rules.</p>
     * <ul>
     * <li><p>If you specify a prefix, the rule applies only to objects whose names match the prefix in the bucket.</p>
     * </li>
     * <li><p>If you leave the prefix empty, the rule applies to all objects in the bucket.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>image</p>
     */
    @NameInMap("Prefix")
    public String prefix;

    /**
     * <p>The unique ID that identifies the rule. The ID can be up to 255 bytes in length.</p>
     * <ul>
     * <li><p>You do not need to specify this parameter when you create a rule. The system automatically generates a unique ID.</p>
     * </li>
     * <li><p>You must specify the RuleId when you update an existing rule. The rule corresponding to the RuleId must exist. Otherwise, an error is returned.</p>
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
     * <li><p><strong>Enabled</strong>: The rule is executed periodically.</p>
     * </li>
     * <li><p><strong>Disabled</strong>: The rule is ignored.</p>
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
