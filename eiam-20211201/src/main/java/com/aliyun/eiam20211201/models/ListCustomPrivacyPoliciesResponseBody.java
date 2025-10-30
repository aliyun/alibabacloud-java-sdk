// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListCustomPrivacyPoliciesResponseBody extends TeaModel {
    @NameInMap("CustomPrivacyPolicies")
    public java.util.List<ListCustomPrivacyPoliciesResponseBodyCustomPrivacyPolicies> customPrivacyPolicies;

    /**
     * <p>分页查询时每页行数。</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>本次调用返回的查询凭证（Token）值，用于下一次翻页查询。</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>本次调用返回的查询凭证（Token）值，用于上一次翻页查询。</p>
     * 
     * <strong>example:</strong>
     * <p>PTxxxexample</p>
     */
    @NameInMap("PreviousToken")
    public String previousToken;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListCustomPrivacyPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCustomPrivacyPoliciesResponseBody self = new ListCustomPrivacyPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCustomPrivacyPoliciesResponseBody setCustomPrivacyPolicies(java.util.List<ListCustomPrivacyPoliciesResponseBodyCustomPrivacyPolicies> customPrivacyPolicies) {
        this.customPrivacyPolicies = customPrivacyPolicies;
        return this;
    }
    public java.util.List<ListCustomPrivacyPoliciesResponseBodyCustomPrivacyPolicies> getCustomPrivacyPolicies() {
        return this.customPrivacyPolicies;
    }

    public ListCustomPrivacyPoliciesResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListCustomPrivacyPoliciesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListCustomPrivacyPoliciesResponseBody setPreviousToken(String previousToken) {
        this.previousToken = previousToken;
        return this;
    }
    public String getPreviousToken() {
        return this.previousToken;
    }

    public ListCustomPrivacyPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCustomPrivacyPoliciesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListCustomPrivacyPoliciesResponseBodyCustomPrivacyPolicies extends TeaModel {
        /**
         * <p>自定义条款Id</p>
         * 
         * <strong>example:</strong>
         * <p>pp_xxxxx</p>
         */
        @NameInMap("CustomPrivacyPolicyId")
        public String customPrivacyPolicyId;

        /**
         * <p>自定义条款名称</p>
         * 
         * <strong>example:</strong>
         * <p>Custom Privacy Policy Name</p>
         */
        @NameInMap("CustomPrivacyPolicyName")
        public String customPrivacyPolicyName;

        /**
         * <p>若显示语言未配置时，门户侧展示默认语言展示条款。</p>
         * 
         * <strong>example:</strong>
         * <p>zh-Hans-CN</p>
         */
        @NameInMap("DefaultLanguageCode")
        public String defaultLanguageCode;

        /**
         * <p>实例id</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>自定义条款状态</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>自定义条款同意类型，是默认同意，还是用户勾选同意</p>
         * 
         * <strong>example:</strong>
         * <p>implied_consent</p>
         */
        @NameInMap("UserConsentType")
        public String userConsentType;

        public static ListCustomPrivacyPoliciesResponseBodyCustomPrivacyPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListCustomPrivacyPoliciesResponseBodyCustomPrivacyPolicies self = new ListCustomPrivacyPoliciesResponseBodyCustomPrivacyPolicies();
            return TeaModel.build(map, self);
        }

        public ListCustomPrivacyPoliciesResponseBodyCustomPrivacyPolicies setCustomPrivacyPolicyId(String customPrivacyPolicyId) {
            this.customPrivacyPolicyId = customPrivacyPolicyId;
            return this;
        }
        public String getCustomPrivacyPolicyId() {
            return this.customPrivacyPolicyId;
        }

        public ListCustomPrivacyPoliciesResponseBodyCustomPrivacyPolicies setCustomPrivacyPolicyName(String customPrivacyPolicyName) {
            this.customPrivacyPolicyName = customPrivacyPolicyName;
            return this;
        }
        public String getCustomPrivacyPolicyName() {
            return this.customPrivacyPolicyName;
        }

        public ListCustomPrivacyPoliciesResponseBodyCustomPrivacyPolicies setDefaultLanguageCode(String defaultLanguageCode) {
            this.defaultLanguageCode = defaultLanguageCode;
            return this;
        }
        public String getDefaultLanguageCode() {
            return this.defaultLanguageCode;
        }

        public ListCustomPrivacyPoliciesResponseBodyCustomPrivacyPolicies setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListCustomPrivacyPoliciesResponseBodyCustomPrivacyPolicies setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCustomPrivacyPoliciesResponseBodyCustomPrivacyPolicies setUserConsentType(String userConsentType) {
            this.userConsentType = userConsentType;
            return this;
        }
        public String getUserConsentType() {
            return this.userConsentType;
        }

    }

}
