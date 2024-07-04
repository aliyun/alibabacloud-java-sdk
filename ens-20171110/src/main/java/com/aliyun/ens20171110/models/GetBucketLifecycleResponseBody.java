// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class GetBucketLifecycleResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A2583E8B-B930-4F59-ADC0-0E209A90C46E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The detailed information about the rule.</p>
     */
    @NameInMap("Rule")
    public java.util.List<GetBucketLifecycleResponseBodyRule> rule;

    public static GetBucketLifecycleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBucketLifecycleResponseBody self = new GetBucketLifecycleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBucketLifecycleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBucketLifecycleResponseBody setRule(java.util.List<GetBucketLifecycleResponseBodyRule> rule) {
        this.rule = rule;
        return this;
    }
    public java.util.List<GetBucketLifecycleResponseBodyRule> getRule() {
        return this.rule;
    }

    public static class GetBucketLifecycleResponseBodyRuleExpiration extends TeaModel {
        /**
         * <p>The expiration date.</p>
         * 
         * <strong>example:</strong>
         * <p>yyy-MM-DDThh:mm:ssZ</p>
         */
        @NameInMap("CreatedBeforeDate")
        public String createdBeforeDate;

        /**
         * <p>The validity period, in days.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Days")
        public String days;

        public static GetBucketLifecycleResponseBodyRuleExpiration build(java.util.Map<String, ?> map) throws Exception {
            GetBucketLifecycleResponseBodyRuleExpiration self = new GetBucketLifecycleResponseBodyRuleExpiration();
            return TeaModel.build(map, self);
        }

        public GetBucketLifecycleResponseBodyRuleExpiration setCreatedBeforeDate(String createdBeforeDate) {
            this.createdBeforeDate = createdBeforeDate;
            return this;
        }
        public String getCreatedBeforeDate() {
            return this.createdBeforeDate;
        }

        public GetBucketLifecycleResponseBodyRuleExpiration setDays(String days) {
            this.days = days;
            return this;
        }
        public String getDays() {
            return this.days;
        }

    }

    public static class GetBucketLifecycleResponseBodyRule extends TeaModel {
        /**
         * <p>The expiration time.</p>
         */
        @NameInMap("Expiration")
        public GetBucketLifecycleResponseBodyRuleExpiration expiration;

        /**
         * <p>The unique ID of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ID")
        public String ID;

        /**
         * <p>The prefix that is applied to the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>image</p>
         */
        @NameInMap("Prefix")
        public String prefix;

        /**
         * <p>The status of the rule. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: The rule is periodically executed.</li>
         * <li><strong>Disabled</strong>: The rule is ignored.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetBucketLifecycleResponseBodyRule build(java.util.Map<String, ?> map) throws Exception {
            GetBucketLifecycleResponseBodyRule self = new GetBucketLifecycleResponseBodyRule();
            return TeaModel.build(map, self);
        }

        public GetBucketLifecycleResponseBodyRule setExpiration(GetBucketLifecycleResponseBodyRuleExpiration expiration) {
            this.expiration = expiration;
            return this;
        }
        public GetBucketLifecycleResponseBodyRuleExpiration getExpiration() {
            return this.expiration;
        }

        public GetBucketLifecycleResponseBodyRule setID(String ID) {
            this.ID = ID;
            return this;
        }
        public String getID() {
            return this.ID;
        }

        public GetBucketLifecycleResponseBodyRule setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public GetBucketLifecycleResponseBodyRule setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
