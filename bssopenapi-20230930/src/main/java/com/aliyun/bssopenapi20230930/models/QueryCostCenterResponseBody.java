// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class QueryCostCenterResponseBody extends TeaModel {
    /**
     * <p>The list of financial unit data.</p>
     */
    @NameInMap("CostCenterDtoList")
    public java.util.List<QueryCostCenterResponseBodyCostCenterDtoList> costCenterDtoList;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The metadata of the response struct.</p>
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
     * <p>Id of the request</p>
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
     * <p>30</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static QueryCostCenterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCostCenterResponseBody self = new QueryCostCenterResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCostCenterResponseBody setCostCenterDtoList(java.util.List<QueryCostCenterResponseBodyCostCenterDtoList> costCenterDtoList) {
        this.costCenterDtoList = costCenterDtoList;
        return this;
    }
    public java.util.List<QueryCostCenterResponseBodyCostCenterDtoList> getCostCenterDtoList() {
        return this.costCenterDtoList;
    }

    public QueryCostCenterResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryCostCenterResponseBody setMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }
    public Object getMetadata() {
        return this.metadata;
    }

    public QueryCostCenterResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryCostCenterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCostCenterResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class QueryCostCenterResponseBodyCostCenterDtoList extends TeaModel {
        /**
         * <p>The code of the financial unit.</p>
         * 
         * <strong>example:</strong>
         * <p>15945703968#</p>
         */
        @NameInMap("CostCenterCode")
        public String costCenterCode;

        /**
         * <p>The ID of the financial unit.</p>
         * 
         * <strong>example:</strong>
         * <p>485938</p>
         */
        @NameInMap("CostCenterId")
        public Long costCenterId;

        /**
         * <p>The name of the financial unit. The name must be unique within the same account.</p>
         * 
         * <strong>example:</strong>
         * <p>资源组</p>
         */
        @NameInMap("CostCenterName")
        public String costCenterName;

        /**
         * <p>The level of the financial unit node.</p>
         * 
         * <strong>example:</strong>
         * <p>loose</p>
         */
        @NameInMap("Level")
        public Integer level;

        /**
         * <p>The ID of the user who owns the financial unit.</p>
         * 
         * <strong>example:</strong>
         * <p>1314839403940987</p>
         */
        @NameInMap("OwnerAccountId")
        public Long ownerAccountId;

        /**
         * <p>The ID of the parent financial unit.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("ParentCostCenterId")
        public Long parentCostCenterId;

        /**
         * <p>The ID of the previous financial unit.</p>
         * 
         * <strong>example:</strong>
         * <p>485996</p>
         */
        @NameInMap("PrevCostCenterId")
        public Long prevCostCenterId;

        @NameInMap("Priority")
        public Integer priority;

        public static QueryCostCenterResponseBodyCostCenterDtoList build(java.util.Map<String, ?> map) throws Exception {
            QueryCostCenterResponseBodyCostCenterDtoList self = new QueryCostCenterResponseBodyCostCenterDtoList();
            return TeaModel.build(map, self);
        }

        public QueryCostCenterResponseBodyCostCenterDtoList setCostCenterCode(String costCenterCode) {
            this.costCenterCode = costCenterCode;
            return this;
        }
        public String getCostCenterCode() {
            return this.costCenterCode;
        }

        public QueryCostCenterResponseBodyCostCenterDtoList setCostCenterId(Long costCenterId) {
            this.costCenterId = costCenterId;
            return this;
        }
        public Long getCostCenterId() {
            return this.costCenterId;
        }

        public QueryCostCenterResponseBodyCostCenterDtoList setCostCenterName(String costCenterName) {
            this.costCenterName = costCenterName;
            return this;
        }
        public String getCostCenterName() {
            return this.costCenterName;
        }

        public QueryCostCenterResponseBodyCostCenterDtoList setLevel(Integer level) {
            this.level = level;
            return this;
        }
        public Integer getLevel() {
            return this.level;
        }

        public QueryCostCenterResponseBodyCostCenterDtoList setOwnerAccountId(Long ownerAccountId) {
            this.ownerAccountId = ownerAccountId;
            return this;
        }
        public Long getOwnerAccountId() {
            return this.ownerAccountId;
        }

        public QueryCostCenterResponseBodyCostCenterDtoList setParentCostCenterId(Long parentCostCenterId) {
            this.parentCostCenterId = parentCostCenterId;
            return this;
        }
        public Long getParentCostCenterId() {
            return this.parentCostCenterId;
        }

        public QueryCostCenterResponseBodyCostCenterDtoList setPrevCostCenterId(Long prevCostCenterId) {
            this.prevCostCenterId = prevCostCenterId;
            return this;
        }
        public Long getPrevCostCenterId() {
            return this.prevCostCenterId;
        }

        public QueryCostCenterResponseBodyCostCenterDtoList setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

}
