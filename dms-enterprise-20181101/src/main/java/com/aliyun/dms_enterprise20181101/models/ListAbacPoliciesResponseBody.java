// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListAbacPoliciesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("PolicyList")
    public java.util.List<ListAbacPoliciesResponseBodyPolicyList> policyList;

    /**
     * <strong>example:</strong>
     * <p>0C1CB646-1DE4-4AD0-B4A4-7D47DD52E931</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListAbacPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAbacPoliciesResponseBody self = new ListAbacPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAbacPoliciesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListAbacPoliciesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListAbacPoliciesResponseBody setPolicyList(java.util.List<ListAbacPoliciesResponseBodyPolicyList> policyList) {
        this.policyList = policyList;
        return this;
    }
    public java.util.List<ListAbacPoliciesResponseBodyPolicyList> getPolicyList() {
        return this.policyList;
    }

    public ListAbacPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAbacPoliciesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListAbacPoliciesResponseBody setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public ListAbacPoliciesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListAbacPoliciesResponseBodyPolicyList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{
         *   &quot;Statement&quot;: [
         *     {
         *       &quot;Action&quot;: &quot;<em>&quot;,
         *       &quot;Effect&quot;: &quot;Allow&quot;,
         *       &quot;Resource&quot;: &quot;</em>&quot;,
         *       &quot;Condition&quot;: {
         *         &quot;StringEqualsIgnoreCase&quot;: {
         *           &quot;dms:DbType&quot;: [
         *             &quot;redis&quot;
         *           ]
         *         }
         *       }
         *     }
         *   ],
         *   &quot;Version&quot;: &quot;1&quot;
         * }</p>
         */
        @NameInMap("AbacPolicyContent")
        public String abacPolicyContent;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AbacPolicyDesc")
        public String abacPolicyDesc;

        /**
         * <strong>example:</strong>
         * <p>12****</p>
         */
        @NameInMap("AbacPolicyId")
        public Long abacPolicyId;

        /**
         * <strong>example:</strong>
         * <p>policy_test</p>
         */
        @NameInMap("AbacPolicyName")
        public String abacPolicyName;

        /**
         * <strong>example:</strong>
         * <p>USER_DEFINE</p>
         */
        @NameInMap("AbacPolicySource")
        public String abacPolicySource;

        /**
         * <strong>example:</strong>
         * <p>51****</p>
         */
        @NameInMap("CreatorId")
        public Long creatorId;

        public static ListAbacPoliciesResponseBodyPolicyList build(java.util.Map<String, ?> map) throws Exception {
            ListAbacPoliciesResponseBodyPolicyList self = new ListAbacPoliciesResponseBodyPolicyList();
            return TeaModel.build(map, self);
        }

        public ListAbacPoliciesResponseBodyPolicyList setAbacPolicyContent(String abacPolicyContent) {
            this.abacPolicyContent = abacPolicyContent;
            return this;
        }
        public String getAbacPolicyContent() {
            return this.abacPolicyContent;
        }

        public ListAbacPoliciesResponseBodyPolicyList setAbacPolicyDesc(String abacPolicyDesc) {
            this.abacPolicyDesc = abacPolicyDesc;
            return this;
        }
        public String getAbacPolicyDesc() {
            return this.abacPolicyDesc;
        }

        public ListAbacPoliciesResponseBodyPolicyList setAbacPolicyId(Long abacPolicyId) {
            this.abacPolicyId = abacPolicyId;
            return this;
        }
        public Long getAbacPolicyId() {
            return this.abacPolicyId;
        }

        public ListAbacPoliciesResponseBodyPolicyList setAbacPolicyName(String abacPolicyName) {
            this.abacPolicyName = abacPolicyName;
            return this;
        }
        public String getAbacPolicyName() {
            return this.abacPolicyName;
        }

        public ListAbacPoliciesResponseBodyPolicyList setAbacPolicySource(String abacPolicySource) {
            this.abacPolicySource = abacPolicySource;
            return this;
        }
        public String getAbacPolicySource() {
            return this.abacPolicySource;
        }

        public ListAbacPoliciesResponseBodyPolicyList setCreatorId(Long creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public Long getCreatorId() {
            return this.creatorId;
        }

    }

}
