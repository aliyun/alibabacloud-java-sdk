// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class ListFundAccountPayRelationResponseBody extends TeaModel {
    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The data list.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListFundAccountPayRelationResponseBodyData> data;

    /**
     * <p>The response metadata.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Metadata")
    public Object metadata;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>79EE7556-0CFD-44EB-9CD6-B3B526E3A85F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListFundAccountPayRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFundAccountPayRelationResponseBody self = new ListFundAccountPayRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFundAccountPayRelationResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListFundAccountPayRelationResponseBody setData(java.util.List<ListFundAccountPayRelationResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListFundAccountPayRelationResponseBodyData> getData() {
        return this.data;
    }

    public ListFundAccountPayRelationResponseBody setMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }
    public Object getMetadata() {
        return this.metadata;
    }

    public ListFundAccountPayRelationResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFundAccountPayRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFundAccountPayRelationResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListFundAccountPayRelationResponseBodyData extends TeaModel {
        /**
         * <p>The account ID of the user associated with the payment relationship, that is, the account that uses this account for payment.</p>
         * 
         * <strong>example:</strong>
         * <p>32812132121</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The user name.</p>
         * 
         * <strong>example:</strong>
         * <p>云某的名称</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The enterprise entity ID of the user associated with the payment relationship.</p>
         * 
         * <strong>example:</strong>
         * <p>213231232</p>
         */
        @NameInMap("Ecid")
        public String ecid;

        /**
         * <p>The time when the payment relationship takes effect.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-01 12:00:10</p>
         */
        @NameInMap("EffectiveTime")
        public String effectiveTime;

        /**
         * <p>The account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123231213</p>
         */
        @NameInMap("FundAccountId")
        public String fundAccountId;

        /**
         * <p>The Alibaba Cloud account ID of the account owner.</p>
         * 
         * <strong>example:</strong>
         * <p>312328912</p>
         */
        @NameInMap("FundAccountOwnerAccountId")
        public String fundAccountOwnerAccountId;

        /**
         * <p>The time when the payment relationship expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-01 12:12:12</p>
         */
        @NameInMap("IneffectiveTime")
        public String ineffectiveTime;

        /**
         * <p>The primary marketplace.</p>
         * 
         * <strong>example:</strong>
         * <p>2684210001</p>
         */
        @NameInMap("Nbid")
        public String nbid;

        /**
         * <p>The operator name.
         * When the operator type is aliyun_pk, the operator name is the Alibaba Cloud nickname.
         * When the operator type is system, the operator name is &quot;Alibaba Cloud assistant&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>云某的名称</p>
         */
        @NameInMap("OperatorName")
        public String operatorName;

        /**
         * <p>The authorized operator.
         * When the operator type is aliyun_pk, operatorNo is the Alibaba Cloud account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1232343423</p>
         */
        @NameInMap("OperatorNo")
        public String operatorNo;

        /**
         * <p>The type of the authorized operator.
         * aliyun_pk: user.
         * system: Alibaba Cloud system.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun_pk</p>
         */
        @NameInMap("OperatorType")
        public String operatorType;

        /**
         * <p>The relationship type, which can be collection relationship or payment relationship.</p>
         * 
         * <strong>example:</strong>
         * <p>PAYMENT</p>
         */
        @NameInMap("RelationType")
        public String relationType;

        /**
         * <p>The site.</p>
         * 
         * <strong>example:</strong>
         * <p>26842</p>
         */
        @NameInMap("Site")
        public String site;

        /**
         * <p>The relationship status.
         * valid: valid.
         * expired: invalid.</p>
         * 
         * <strong>example:</strong>
         * <p>valid</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListFundAccountPayRelationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListFundAccountPayRelationResponseBodyData self = new ListFundAccountPayRelationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListFundAccountPayRelationResponseBodyData setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListFundAccountPayRelationResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public ListFundAccountPayRelationResponseBodyData setEcid(String ecid) {
            this.ecid = ecid;
            return this;
        }
        public String getEcid() {
            return this.ecid;
        }

        public ListFundAccountPayRelationResponseBodyData setEffectiveTime(String effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }
        public String getEffectiveTime() {
            return this.effectiveTime;
        }

        public ListFundAccountPayRelationResponseBodyData setFundAccountId(String fundAccountId) {
            this.fundAccountId = fundAccountId;
            return this;
        }
        public String getFundAccountId() {
            return this.fundAccountId;
        }

        public ListFundAccountPayRelationResponseBodyData setFundAccountOwnerAccountId(String fundAccountOwnerAccountId) {
            this.fundAccountOwnerAccountId = fundAccountOwnerAccountId;
            return this;
        }
        public String getFundAccountOwnerAccountId() {
            return this.fundAccountOwnerAccountId;
        }

        public ListFundAccountPayRelationResponseBodyData setIneffectiveTime(String ineffectiveTime) {
            this.ineffectiveTime = ineffectiveTime;
            return this;
        }
        public String getIneffectiveTime() {
            return this.ineffectiveTime;
        }

        public ListFundAccountPayRelationResponseBodyData setNbid(String nbid) {
            this.nbid = nbid;
            return this;
        }
        public String getNbid() {
            return this.nbid;
        }

        public ListFundAccountPayRelationResponseBodyData setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

        public ListFundAccountPayRelationResponseBodyData setOperatorNo(String operatorNo) {
            this.operatorNo = operatorNo;
            return this;
        }
        public String getOperatorNo() {
            return this.operatorNo;
        }

        public ListFundAccountPayRelationResponseBodyData setOperatorType(String operatorType) {
            this.operatorType = operatorType;
            return this;
        }
        public String getOperatorType() {
            return this.operatorType;
        }

        public ListFundAccountPayRelationResponseBodyData setRelationType(String relationType) {
            this.relationType = relationType;
            return this;
        }
        public String getRelationType() {
            return this.relationType;
        }

        public ListFundAccountPayRelationResponseBodyData setSite(String site) {
            this.site = site;
            return this;
        }
        public String getSite() {
            return this.site;
        }

        public ListFundAccountPayRelationResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
