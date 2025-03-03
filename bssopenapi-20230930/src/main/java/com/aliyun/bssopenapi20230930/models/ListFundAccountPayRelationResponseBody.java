// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class ListFundAccountPayRelationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Data")
    public java.util.List<ListFundAccountPayRelationResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Metadata")
    public Object metadata;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>79EE7556-0CFD-44EB-9CD6-B3B526E3A85F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>32812132121</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <strong>example:</strong>
         * <p>云某的名称</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <strong>example:</strong>
         * <p>213231232</p>
         */
        @NameInMap("Ecid")
        public String ecid;

        /**
         * <strong>example:</strong>
         * <p>2024-12-01 12:00:10</p>
         */
        @NameInMap("EffectiveTime")
        public String effectiveTime;

        /**
         * <strong>example:</strong>
         * <p>123231213</p>
         */
        @NameInMap("FundAccountId")
        public String fundAccountId;

        /**
         * <strong>example:</strong>
         * <p>312328912</p>
         */
        @NameInMap("FundAccountOwnerAccountId")
        public String fundAccountOwnerAccountId;

        /**
         * <strong>example:</strong>
         * <p>2025-01-01 12:12:12</p>
         */
        @NameInMap("IneffectiveTime")
        public String ineffectiveTime;

        /**
         * <strong>example:</strong>
         * <p>2684210001</p>
         */
        @NameInMap("Nbid")
        public String nbid;

        /**
         * <strong>example:</strong>
         * <p>云某的名称</p>
         */
        @NameInMap("OperatorName")
        public String operatorName;

        /**
         * <strong>example:</strong>
         * <p>1232343423</p>
         */
        @NameInMap("OperatorNo")
        public String operatorNo;

        /**
         * <strong>example:</strong>
         * <p>aliyun_pk</p>
         */
        @NameInMap("OperatorType")
        public String operatorType;

        /**
         * <strong>example:</strong>
         * <p>PAYMENT</p>
         */
        @NameInMap("RelationType")
        public String relationType;

        /**
         * <strong>example:</strong>
         * <p>26842</p>
         */
        @NameInMap("Site")
        public String site;

        /**
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
