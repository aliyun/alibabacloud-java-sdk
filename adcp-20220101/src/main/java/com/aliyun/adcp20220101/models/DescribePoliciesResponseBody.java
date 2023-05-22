// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DescribePoliciesResponseBody extends TeaModel {
    /**
     * <p>A list of policies.</p>
     */
    @NameInMap("Policies")
    public java.util.List<DescribePoliciesResponseBodyPolicies> policies;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePoliciesResponseBody self = new DescribePoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePoliciesResponseBody setPolicies(java.util.List<DescribePoliciesResponseBodyPolicies> policies) {
        this.policies = policies;
        return this;
    }
    public java.util.List<DescribePoliciesResponseBodyPolicies> getPolicies() {
        return this.policies;
    }

    public DescribePoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePoliciesResponseBodyPolicies extends TeaModel {
        /**
         * <p>The policy type.</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The names of the policies of each policy type.</p>
         */
        @NameInMap("Names")
        public java.util.List<String> names;

        public static DescribePoliciesResponseBodyPolicies build(java.util.Map<String, ?> map) throws Exception {
            DescribePoliciesResponseBodyPolicies self = new DescribePoliciesResponseBodyPolicies();
            return TeaModel.build(map, self);
        }

        public DescribePoliciesResponseBodyPolicies setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribePoliciesResponseBodyPolicies setNames(java.util.List<String> names) {
            this.names = names;
            return this;
        }
        public java.util.List<String> getNames() {
            return this.names;
        }

    }

}
