// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class QueryCostByCostCenterResponseBody extends TeaModel {
    /**
     * <p>The list of cost center consumption amount details.</p>
     */
    @NameInMap("ConsumeAmountList")
    public java.util.List<QueryCostByCostCenterResponseBodyConsumeAmountList> consumeAmountList;

    /**
     * <p>The response structure metadata.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Metadata")
    public Object metadata;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>79EE7556-0CFD-44EB-9CD6-B3B526E3A85F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The sum of totalAllocatedAmount across all cost centers.</p>
     * 
     * <strong>example:</strong>
     * <p>130296.64</p>
     */
    @NameInMap("TotalAmount")
    public String totalAmount;

    public static QueryCostByCostCenterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCostByCostCenterResponseBody self = new QueryCostByCostCenterResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCostByCostCenterResponseBody setConsumeAmountList(java.util.List<QueryCostByCostCenterResponseBodyConsumeAmountList> consumeAmountList) {
        this.consumeAmountList = consumeAmountList;
        return this;
    }
    public java.util.List<QueryCostByCostCenterResponseBodyConsumeAmountList> getConsumeAmountList() {
        return this.consumeAmountList;
    }

    public QueryCostByCostCenterResponseBody setMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }
    public Object getMetadata() {
        return this.metadata;
    }

    public QueryCostByCostCenterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCostByCostCenterResponseBody setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public String getTotalAmount() {
        return this.totalAmount;
    }

    public static class QueryCostByCostCenterResponseBodyConsumeAmountList extends TeaModel {
        /**
         * <p>The apportioned amount.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("AllocatedAmount")
        public String allocatedAmount;

        /**
         * <p>The financial unit code.</p>
         * 
         * <strong>example:</strong>
         * <p>15945703968#</p>
         */
        @NameInMap("CostCenterCode")
        public String costCenterCode;

        /**
         * <p>The financial unit ID.</p>
         * 
         * <strong>example:</strong>
         * <p>530658</p>
         */
        @NameInMap("CostCenterId")
        public Long costCenterId;

        /**
         * <p>The financial unit name.</p>
         * 
         * <strong>example:</strong>
         * <p>Project Team A</p>
         */
        @NameInMap("CostCenterName")
        public String costCenterName;

        /**
         * <p>The cost type amount.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("DirectAmount")
        public String directAmount;

        /**
         * <p>The level.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Level")
        public Integer level;

        /**
         * <p>The account ID of the resource ownership.</p>
         * 
         * <strong>example:</strong>
         * <p>1857464601594004</p>
         */
        @NameInMap("OwnerAccountId")
        public Long ownerAccountId;

        /**
         * <p>The account name of the resource ownership.</p>
         * 
         * <strong>example:</strong>
         * <p>R&amp;D Team Test Account</p>
         */
        @NameInMap("OwnerAccountName")
        public String ownerAccountName;

        /**
         * <p>The parent financial unit ID.</p>
         * 
         * <strong>example:</strong>
         * <p>637537</p>
         */
        @NameInMap("ParentCostCenterId")
        public Long parentCostCenterId;

        /**
         * <p>The preceding financial unit ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6375371</p>
         */
        @NameInMap("PreCostCenterId")
        public Long preCostCenterId;

        /**
         * <p>The total amount (the sum of the cost type amount and the apportioned amount).</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalAllocatedAmount")
        public String totalAllocatedAmount;

        /**
         * <p>The percentage of the cost type amount.</p>
         * 
         * <strong>example:</strong>
         * <p>0.01</p>
         */
        @NameInMap("TotalAllocatedAmountPercent")
        public String totalAllocatedAmountPercent;

        public static QueryCostByCostCenterResponseBodyConsumeAmountList build(java.util.Map<String, ?> map) throws Exception {
            QueryCostByCostCenterResponseBodyConsumeAmountList self = new QueryCostByCostCenterResponseBodyConsumeAmountList();
            return TeaModel.build(map, self);
        }

        public QueryCostByCostCenterResponseBodyConsumeAmountList setAllocatedAmount(String allocatedAmount) {
            this.allocatedAmount = allocatedAmount;
            return this;
        }
        public String getAllocatedAmount() {
            return this.allocatedAmount;
        }

        public QueryCostByCostCenterResponseBodyConsumeAmountList setCostCenterCode(String costCenterCode) {
            this.costCenterCode = costCenterCode;
            return this;
        }
        public String getCostCenterCode() {
            return this.costCenterCode;
        }

        public QueryCostByCostCenterResponseBodyConsumeAmountList setCostCenterId(Long costCenterId) {
            this.costCenterId = costCenterId;
            return this;
        }
        public Long getCostCenterId() {
            return this.costCenterId;
        }

        public QueryCostByCostCenterResponseBodyConsumeAmountList setCostCenterName(String costCenterName) {
            this.costCenterName = costCenterName;
            return this;
        }
        public String getCostCenterName() {
            return this.costCenterName;
        }

        public QueryCostByCostCenterResponseBodyConsumeAmountList setDirectAmount(String directAmount) {
            this.directAmount = directAmount;
            return this;
        }
        public String getDirectAmount() {
            return this.directAmount;
        }

        public QueryCostByCostCenterResponseBodyConsumeAmountList setLevel(Integer level) {
            this.level = level;
            return this;
        }
        public Integer getLevel() {
            return this.level;
        }

        public QueryCostByCostCenterResponseBodyConsumeAmountList setOwnerAccountId(Long ownerAccountId) {
            this.ownerAccountId = ownerAccountId;
            return this;
        }
        public Long getOwnerAccountId() {
            return this.ownerAccountId;
        }

        public QueryCostByCostCenterResponseBodyConsumeAmountList setOwnerAccountName(String ownerAccountName) {
            this.ownerAccountName = ownerAccountName;
            return this;
        }
        public String getOwnerAccountName() {
            return this.ownerAccountName;
        }

        public QueryCostByCostCenterResponseBodyConsumeAmountList setParentCostCenterId(Long parentCostCenterId) {
            this.parentCostCenterId = parentCostCenterId;
            return this;
        }
        public Long getParentCostCenterId() {
            return this.parentCostCenterId;
        }

        public QueryCostByCostCenterResponseBodyConsumeAmountList setPreCostCenterId(Long preCostCenterId) {
            this.preCostCenterId = preCostCenterId;
            return this;
        }
        public Long getPreCostCenterId() {
            return this.preCostCenterId;
        }

        public QueryCostByCostCenterResponseBodyConsumeAmountList setTotalAllocatedAmount(String totalAllocatedAmount) {
            this.totalAllocatedAmount = totalAllocatedAmount;
            return this;
        }
        public String getTotalAllocatedAmount() {
            return this.totalAllocatedAmount;
        }

        public QueryCostByCostCenterResponseBodyConsumeAmountList setTotalAllocatedAmountPercent(String totalAllocatedAmountPercent) {
            this.totalAllocatedAmountPercent = totalAllocatedAmountPercent;
            return this;
        }
        public String getTotalAllocatedAmountPercent() {
            return this.totalAllocatedAmountPercent;
        }

    }

}
