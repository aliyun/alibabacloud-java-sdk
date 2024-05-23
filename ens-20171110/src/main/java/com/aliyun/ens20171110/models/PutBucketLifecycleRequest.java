// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class PutBucketLifecycleRequest extends TeaModel {
    /**
     * <p>Specifies whether to allow overlapped prefixes. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false** (default)</p>
     */
    @NameInMap("AllowSameActionOverlap")
    public String allowSameActionOverlap;

    /**
     * <p>The name of the bucket.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("BucketName")
    public String bucketName;

    /**
     * <p>The expiration data. EOS executes a lifecycle rule for objects that were last updated before the expiration date.</p>
     * <br>
     * <p>Specify the time that follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>> ExpirationDays and CreateBeforeDate are mutually exclusive.</p>
     */
    @NameInMap("CreatedBeforeDate")
    public String createdBeforeDate;

    /**
     * <p>The number of days from when the objects were last modified to when the lifecycle rule takes effect. The value must be a positive integer that is greater than 0.</p>
     * <br>
     * <p>> ExpirationDays and CreateBeforeDate are mutually exclusive.</p>
     */
    @NameInMap("ExpirationDays")
    public Long expirationDays;

    /**
     * <p>The prefix of a rule. The prefix must be unique.</p>
     * <br>
     * <p>*   If you specify a prefix, the rule applies only to objects in the bucket that match the prefix.</p>
     * <p>*   If you do not specify a prefix, the rule applies to all objects in the bucket.</p>
     */
    @NameInMap("Prefix")
    public String prefix;

    /**
     * <p>The unique ID of the rule. The ID of a lifecycle rule can be up to 255 bytes in length.</p>
     * <br>
     * <p>*   You do not need to configure this parameter when you create a rule. The system automatically generates a unique ID.</p>
     * <p>*   When you update a rule, you need to specify the rule ID, and the rule must exist. Otherwise, an error occurs.</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    /**
     * <p>The status of the rule. Valid values:</p>
     * <br>
     * <p>*   **Enabled**: The rule is periodically executed.</p>
     * <p>*   **Disabled**: The rule is ignored.</p>
     * <br>
     * <p>This parameter is required.</p>
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
