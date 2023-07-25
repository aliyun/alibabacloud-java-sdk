// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateAccountComplianceByPackResponseBody extends TeaModel {
    /**
     * <p>The compliance evaluation results of member accounts for which the compliance package takes effect in an account group.</p>
     */
    @NameInMap("AccountComplianceResult")
    public GetAggregateAccountComplianceByPackResponseBodyAccountComplianceResult accountComplianceResult;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAggregateAccountComplianceByPackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateAccountComplianceByPackResponseBody self = new GetAggregateAccountComplianceByPackResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAggregateAccountComplianceByPackResponseBody setAccountComplianceResult(GetAggregateAccountComplianceByPackResponseBodyAccountComplianceResult accountComplianceResult) {
        this.accountComplianceResult = accountComplianceResult;
        return this;
    }
    public GetAggregateAccountComplianceByPackResponseBodyAccountComplianceResult getAccountComplianceResult() {
        return this.accountComplianceResult;
    }

    public GetAggregateAccountComplianceByPackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAggregateAccountComplianceByPackResponseBodyAccountComplianceResultAccountCompliances extends TeaModel {
        /**
         * <p>The ID of the member account in the account group.</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The name of the member account in the account group.</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The compliance evaluation result. Valid values:</p>
         * <br>
         * <p>*   COMPLIANT: The resource was evaluated as compliant.</p>
         * <p>*   NON_COMPLIANT: The resource was evaluated as incompliant.</p>
         * <p>*   NOT_APPLICABLE: The rule did not apply to your resource.</p>
         * <p>*   INSUFFICIENT_DATA: No resource data was available.</p>
         */
        @NameInMap("ComplianceType")
        public String complianceType;

        public static GetAggregateAccountComplianceByPackResponseBodyAccountComplianceResultAccountCompliances build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateAccountComplianceByPackResponseBodyAccountComplianceResultAccountCompliances self = new GetAggregateAccountComplianceByPackResponseBodyAccountComplianceResultAccountCompliances();
            return TeaModel.build(map, self);
        }

        public GetAggregateAccountComplianceByPackResponseBodyAccountComplianceResultAccountCompliances setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public GetAggregateAccountComplianceByPackResponseBodyAccountComplianceResultAccountCompliances setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public GetAggregateAccountComplianceByPackResponseBodyAccountComplianceResultAccountCompliances setComplianceType(String complianceType) {
            this.complianceType = complianceType;
            return this;
        }
        public String getComplianceType() {
            return this.complianceType;
        }

    }

    public static class GetAggregateAccountComplianceByPackResponseBodyAccountComplianceResult extends TeaModel {
        /**
         * <p>The compliance evaluation result of member accounts.</p>
         */
        @NameInMap("AccountCompliances")
        public java.util.List<GetAggregateAccountComplianceByPackResponseBodyAccountComplianceResultAccountCompliances> accountCompliances;

        /**
         * <p>The ID of the compliance package.</p>
         */
        @NameInMap("CompliancePackId")
        public String compliancePackId;

        /**
         * <p>The number of non-compliant member accounts.</p>
         */
        @NameInMap("NonCompliantCount")
        public Integer nonCompliantCount;

        /**
         * <p>The total number of member accounts.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static GetAggregateAccountComplianceByPackResponseBodyAccountComplianceResult build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateAccountComplianceByPackResponseBodyAccountComplianceResult self = new GetAggregateAccountComplianceByPackResponseBodyAccountComplianceResult();
            return TeaModel.build(map, self);
        }

        public GetAggregateAccountComplianceByPackResponseBodyAccountComplianceResult setAccountCompliances(java.util.List<GetAggregateAccountComplianceByPackResponseBodyAccountComplianceResultAccountCompliances> accountCompliances) {
            this.accountCompliances = accountCompliances;
            return this;
        }
        public java.util.List<GetAggregateAccountComplianceByPackResponseBodyAccountComplianceResultAccountCompliances> getAccountCompliances() {
            return this.accountCompliances;
        }

        public GetAggregateAccountComplianceByPackResponseBodyAccountComplianceResult setCompliancePackId(String compliancePackId) {
            this.compliancePackId = compliancePackId;
            return this;
        }
        public String getCompliancePackId() {
            return this.compliancePackId;
        }

        public GetAggregateAccountComplianceByPackResponseBodyAccountComplianceResult setNonCompliantCount(Integer nonCompliantCount) {
            this.nonCompliantCount = nonCompliantCount;
            return this;
        }
        public Integer getNonCompliantCount() {
            return this.nonCompliantCount;
        }

        public GetAggregateAccountComplianceByPackResponseBodyAccountComplianceResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
