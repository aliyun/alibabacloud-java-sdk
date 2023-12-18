// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class GetBucketLifecycleResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
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
         */
        @NameInMap("CreatedBeforeDate")
        public String createdBeforeDate;

        /**
         * <p>The validity period, in days.</p>
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
         */
        @NameInMap("ID")
        public String ID;

        /**
         * <p>The prefix that is applied to the rule.</p>
         */
        @NameInMap("Prefix")
        public String prefix;

        /**
         * <p>The status of the rule. Valid values:</p>
         * <br>
         * <p>*   **Enabled**: The rule is periodically executed.</p>
         * <p>*   **Disabled**: The rule is ignored.</p>
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
