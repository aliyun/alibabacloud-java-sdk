// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListAgenticSecurityPoliciesResponseBody extends TeaModel {
    /**
     * <p>The list of security policies returned by this query. Enabled system default policies are placed at the beginning, followed by the user policies on the current page. You can use Readonly to distinguish between the two types of policies.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListAgenticSecurityPoliciesResponseBodyData> data;

    /**
     * <p>The error code returned when the request fails. This parameter is empty when the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>INVALID_PARAMETER</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned when the request fails. This parameter is empty when the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>invalid policyStatus: ARCHIVED</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID, which is used to locate and trace this call.</p>
     * 
     * <strong>example:</strong>
     * <p>request-1234567890</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li>true: The request is successful.</li>
     * <li>false: The request fails.</li>
     * </ul>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of policies that meet the query conditions. The value is the sum of the number of all enabled system default policies and the number of user policies of the current account that meet the filter conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListAgenticSecurityPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAgenticSecurityPoliciesResponseBody self = new ListAgenticSecurityPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAgenticSecurityPoliciesResponseBody setData(java.util.List<ListAgenticSecurityPoliciesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAgenticSecurityPoliciesResponseBodyData> getData() {
        return this.data;
    }

    public ListAgenticSecurityPoliciesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListAgenticSecurityPoliciesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListAgenticSecurityPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAgenticSecurityPoliciesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListAgenticSecurityPoliciesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListAgenticSecurityPoliciesResponseBodyData extends TeaModel {
        /**
         * <p>The UID of the Alibaba Cloud account to which the user policy belongs. This value is not returned for system default policies.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789012****</p>
         */
        @NameInMap("AliyunAccountUid")
        public String aliyunAccountUid;

        /**
         * <p>The ID of the system default policy inherited by the user policy. This value is empty if no inheritance relationship is configured. This value is not returned for system default policies.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-sys-default</p>
         */
        @NameInMap("BasePolicyId")
        public String basePolicyId;

        /**
         * <p>The description of the security policy. The description of a system default policy is returned in the language of the request context.</p>
         * 
         * <strong>example:</strong>
         * <p>Read-only access policy for analytics</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the security policy was created. The time is in the yyyy-MM-dd HH:mm:ss format and does not contain a time zone offset.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-13 14:30:00</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the security policy was last modified. The time is in the yyyy-MM-dd HH:mm:ss format and does not contain a time zone offset.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-13 14:35:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The business ID of the security policy. A system default policy ID starts with sp-sys-, and a user policy ID starts with sp-usr-.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-sys-default</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>The Policy Name of the security policy. The Policy Name of a system default policy is returned in the language of the request context.</p>
         * 
         * <strong>example:</strong>
         * <p>team-readonly-policy</p>
         */
        @NameInMap("PolicyName")
        public String policyName;

        /**
         * <p>The current state of the security policy. Valid values:</p>
         * <ul>
         * <li>ON: Enabled.</li>
         * <li>OFF: Disabled.</li>
         * <li>ARCHIVED: Archived.
         * All system default policies returned by this operation are in the ON state.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("PolicyStatus")
        public String policyStatus;

        /**
         * <p>Specifies whether the policy is read-only. Valid values:</p>
         * <ul>
         * <li>true: The policy is a system default policy.</li>
         * <li>false: The policy is a user policy of the current account.</li>
         * </ul>
         */
        @NameInMap("Readonly")
        public Boolean readonly;

        /**
         * <p>The tags of the system default policy. Multiple tags are separated by commas (,). This value is not returned for user policies.</p>
         * 
         * <strong>example:</strong>
         * <p>default,phase1</p>
         */
        @NameInMap("Tags")
        public String tags;

        /**
         * <p>The identifier of the operator that last modified the policy. For a user policy, the operator ID is recorded first. If no operator ID is available, the UID of the current Alibaba Cloud account is recorded.</p>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("UpdatedBy")
        public String updatedBy;

        public static ListAgenticSecurityPoliciesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAgenticSecurityPoliciesResponseBodyData self = new ListAgenticSecurityPoliciesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAgenticSecurityPoliciesResponseBodyData setAliyunAccountUid(String aliyunAccountUid) {
            this.aliyunAccountUid = aliyunAccountUid;
            return this;
        }
        public String getAliyunAccountUid() {
            return this.aliyunAccountUid;
        }

        public ListAgenticSecurityPoliciesResponseBodyData setBasePolicyId(String basePolicyId) {
            this.basePolicyId = basePolicyId;
            return this;
        }
        public String getBasePolicyId() {
            return this.basePolicyId;
        }

        public ListAgenticSecurityPoliciesResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAgenticSecurityPoliciesResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListAgenticSecurityPoliciesResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListAgenticSecurityPoliciesResponseBodyData setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public ListAgenticSecurityPoliciesResponseBodyData setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public ListAgenticSecurityPoliciesResponseBodyData setPolicyStatus(String policyStatus) {
            this.policyStatus = policyStatus;
            return this;
        }
        public String getPolicyStatus() {
            return this.policyStatus;
        }

        public ListAgenticSecurityPoliciesResponseBodyData setReadonly(Boolean readonly) {
            this.readonly = readonly;
            return this;
        }
        public Boolean getReadonly() {
            return this.readonly;
        }

        public ListAgenticSecurityPoliciesResponseBodyData setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public ListAgenticSecurityPoliciesResponseBodyData setUpdatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }
        public String getUpdatedBy() {
            return this.updatedBy;
        }

    }

}
