// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class PutBucketLifecycleRequest extends TeaModel {
    /**
     * <p>Specifies whether to allow overlapped prefixes. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong> (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AllowSameActionOverlap")
    public String allowSameActionOverlap;

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
     * <p>The expiration time. EOS executes a lifecycle rule for objects that were last updated before the expiration time.</p>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <blockquote>
     * <p> ExpirationDays and CreateBeforeDate are mutually exclusive.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2023-10-12T05:45:00Z</p>
     */
    @NameInMap("CreatedBeforeDate")
    public String createdBeforeDate;

    /**
     * <p>The number of days from when the objects were last modified to when the lifecycle rule takes effect. The value must be a positive integer that is greater than 0.</p>
     * <blockquote>
     * <p> ExpirationDays and CreateBeforeDate are mutually exclusive.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ExpirationDays")
    public Long expirationDays;

    /**
     * <p>The prefix of a object name. The prefix must be unique.</p>
     * <ul>
     * <li>If you specify a prefix, the rule applies only to objects in the bucket that match the prefix.</li>
     * <li>If you do not specify a prefix, the rule applies to all objects in the bucket.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>image</p>
     */
    @NameInMap("Prefix")
    public String prefix;

    /**
     * <p>The unique ID of the rule. The ID of a lifecycle rule can be up to 255 bytes in length.</p>
     * <ul>
     * <li>You do not need to configure this parameter when you create a rule. The system automatically generates a unique ID.</li>
     * <li>When you update a rule, you need to specify this parameter. Make sure that the rule specified by RuleId exists. Otherwise, an error occurs.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    /**
     * <p>The status of the rule. Valid values:</p>
     * <ul>
     * <li><strong>Enabled</strong></li>
     * <li><strong>Disabled</strong></li>
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

    public PutBucketLifecycleRequest setAllowSameActionOverlap(String allowSameActionOverlap) {
        this.allowSameActionOverlap = allowSameActionOverlap;
        return this;
    }
    public String getAllowSameActionOverlap() {
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
