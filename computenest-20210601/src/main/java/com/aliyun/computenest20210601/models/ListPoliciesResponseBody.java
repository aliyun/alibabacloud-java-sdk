// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListPoliciesResponseBody extends TeaModel {
    /**
     * <p>分页大小。</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Next Token</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAZ9FmxgN6wKfeK/GOKRnnjU=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Permission policy list</p>
     */
    @NameInMap("Policies")
    public java.util.List<ListPoliciesResponseBodyPolicies> policies;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>51945B04-6AA6-410D-93BA-236E0248B104</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPoliciesResponseBody self = new ListPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPoliciesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPoliciesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPoliciesResponseBody setPolicies(java.util.List<ListPoliciesResponseBodyPolicies> policies) {
        this.policies = policies;
        return this;
    }
    public java.util.List<ListPoliciesResponseBodyPolicies> getPolicies() {
        return this.policies;
    }

    public ListPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPoliciesResponseBodyPolicies extends TeaModel {
        /**
         * <p>Permission policy description.</p>
         * 
         * <strong>example:</strong>
         * <p>Only read permission policy</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Policy content.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Action&quot;:[&quot;<em>:Describe</em>&quot;,&quot;<em>:List</em>&quot;,&quot;<em>:Get</em>&quot;,&quot;<em>:BatchGet</em>&quot;,&quot;<em>:Query</em>&quot;,&quot;<em>:BatchQuery</em>&quot;,&quot;actiontrail:LookupEvents&quot;],&quot;Resource&quot;:[&quot;*&quot;],&quot;Effect&quot;:&quot;Allow&quot;}</p>
         */
        @NameInMap("PolicyDocument")
        public String policyDocument;

        /**
         * <p>Permission policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunComputeNestPolicyForReadOnly</p>
         */
        @NameInMap("PolicyName")
        public String policyName;

        /**
         * <p>Permission policy type.</p>
         * <ul>
         * <li>Custom: Custom policy.</li>
         * <li>System: System policy.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>System</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static ListPoliciesResponseBodyPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListPoliciesResponseBodyPolicies self = new ListPoliciesResponseBodyPolicies();
            return TeaModel.build(map, self);
        }

        public ListPoliciesResponseBodyPolicies setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPoliciesResponseBodyPolicies setPolicyDocument(String policyDocument) {
            this.policyDocument = policyDocument;
            return this;
        }
        public String getPolicyDocument() {
            return this.policyDocument;
        }

        public ListPoliciesResponseBodyPolicies setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public ListPoliciesResponseBodyPolicies setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

}
