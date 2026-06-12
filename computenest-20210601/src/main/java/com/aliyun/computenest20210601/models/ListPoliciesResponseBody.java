// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListPoliciesResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAZ9FmxgN6wKfeK/GOKRnnjU=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The list of access policies.</p>
     */
    @NameInMap("Policies")
    public java.util.List<ListPoliciesResponseBodyPolicies> policies;

    /**
     * <p>The request ID.</p>
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
         * <p>The description of the access policy.</p>
         * 
         * <strong>example:</strong>
         * <p>Read-only permission</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The content of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Action&quot;:[&quot;<em>:Describe</em>&quot;,&quot;<em>:List</em>&quot;,&quot;<em>:Get</em>&quot;,&quot;<em>:BatchGet</em>&quot;,&quot;<em>:Query</em>&quot;,&quot;<em>:BatchQuery</em>&quot;,&quot;actiontrail:LookupEvents&quot;],&quot;Resource&quot;:[&quot;*&quot;],&quot;Effect&quot;:&quot;Allow&quot;}</p>
         */
        @NameInMap("PolicyDocument")
        public String policyDocument;

        /**
         * <p>The name of the access policy.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunComputeNestPolicyForReadOnly</p>
         */
        @NameInMap("PolicyName")
        public String policyName;

        /**
         * <p>The type of the access policy.</p>
         * <ul>
         * <li><p>Custom: A custom policy.</p>
         * </li>
         * <li><p>System: A system policy.</p>
         * </li>
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
