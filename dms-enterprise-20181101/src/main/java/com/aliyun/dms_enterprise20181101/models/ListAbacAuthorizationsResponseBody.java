// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListAbacAuthorizationsResponseBody extends TeaModel {
    @NameInMap("AuthorizationList")
    public java.util.List<ListAbacAuthorizationsResponseBodyAuthorizationList> authorizationList;

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

    /**
     * <strong>example:</strong>
     * <p>7FAD400F-7A5C-4193-8F9A-39D86C4F0231</p>
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
     * <p>3</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListAbacAuthorizationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAbacAuthorizationsResponseBody self = new ListAbacAuthorizationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAbacAuthorizationsResponseBody setAuthorizationList(java.util.List<ListAbacAuthorizationsResponseBodyAuthorizationList> authorizationList) {
        this.authorizationList = authorizationList;
        return this;
    }
    public java.util.List<ListAbacAuthorizationsResponseBodyAuthorizationList> getAuthorizationList() {
        return this.authorizationList;
    }

    public ListAbacAuthorizationsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListAbacAuthorizationsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListAbacAuthorizationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAbacAuthorizationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListAbacAuthorizationsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListAbacAuthorizationsResponseBodyAuthorizationList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>32****</p>
         */
        @NameInMap("AuthorizationId")
        public Long authorizationId;

        /**
         * <strong>example:</strong>
         * <p>51****</p>
         */
        @NameInMap("IdentityId")
        public Long identityId;

        /**
         * <strong>example:</strong>
         * <p>test_user</p>
         */
        @NameInMap("IdentityName")
        public String identityName;

        /**
         * <strong>example:</strong>
         * <p>USER</p>
         */
        @NameInMap("IdentityType")
        public String identityType;

        /**
         * <strong>example:</strong>
         * <p>12****</p>
         */
        @NameInMap("PolicyId")
        public Long policyId;

        /**
         * <strong>example:</strong>
         * <p>policy_test</p>
         */
        @NameInMap("PolicyName")
        public String policyName;

        /**
         * <strong>example:</strong>
         * <p>USER_DEFINE</p>
         */
        @NameInMap("PolicySource")
        public String policySource;

        public static ListAbacAuthorizationsResponseBodyAuthorizationList build(java.util.Map<String, ?> map) throws Exception {
            ListAbacAuthorizationsResponseBodyAuthorizationList self = new ListAbacAuthorizationsResponseBodyAuthorizationList();
            return TeaModel.build(map, self);
        }

        public ListAbacAuthorizationsResponseBodyAuthorizationList setAuthorizationId(Long authorizationId) {
            this.authorizationId = authorizationId;
            return this;
        }
        public Long getAuthorizationId() {
            return this.authorizationId;
        }

        public ListAbacAuthorizationsResponseBodyAuthorizationList setIdentityId(Long identityId) {
            this.identityId = identityId;
            return this;
        }
        public Long getIdentityId() {
            return this.identityId;
        }

        public ListAbacAuthorizationsResponseBodyAuthorizationList setIdentityName(String identityName) {
            this.identityName = identityName;
            return this;
        }
        public String getIdentityName() {
            return this.identityName;
        }

        public ListAbacAuthorizationsResponseBodyAuthorizationList setIdentityType(String identityType) {
            this.identityType = identityType;
            return this;
        }
        public String getIdentityType() {
            return this.identityType;
        }

        public ListAbacAuthorizationsResponseBodyAuthorizationList setPolicyId(Long policyId) {
            this.policyId = policyId;
            return this;
        }
        public Long getPolicyId() {
            return this.policyId;
        }

        public ListAbacAuthorizationsResponseBodyAuthorizationList setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public ListAbacAuthorizationsResponseBodyAuthorizationList setPolicySource(String policySource) {
            this.policySource = policySource;
            return this;
        }
        public String getPolicySource() {
            return this.policySource;
        }

    }

}
