// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryCostUnitResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public QueryCostUnitResponseBodyData data;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryCostUnitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCostUnitResponseBody self = new QueryCostUnitResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCostUnitResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCostUnitResponseBody setData(QueryCostUnitResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryCostUnitResponseBodyData getData() {
        return this.data;
    }

    public QueryCostUnitResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCostUnitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCostUnitResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryCostUnitResponseBodyDataCostUnitDtoList extends TeaModel {
        /**
         * <p>The user ID of the cost center owner.</p>
         */
        @NameInMap("OwnerUid")
        public Long ownerUid;

        /**
         * <p>The ID of the parent cost center. A value of -1 indicates the root cost center.</p>
         */
        @NameInMap("ParentUnitId")
        public Long parentUnitId;

        /**
         * <p>The ID of the cost center.</p>
         */
        @NameInMap("UnitId")
        public Long unitId;

        /**
         * <p>The name of the cost center.</p>
         */
        @NameInMap("UnitName")
        public String unitName;

        public static QueryCostUnitResponseBodyDataCostUnitDtoList build(java.util.Map<String, ?> map) throws Exception {
            QueryCostUnitResponseBodyDataCostUnitDtoList self = new QueryCostUnitResponseBodyDataCostUnitDtoList();
            return TeaModel.build(map, self);
        }

        public QueryCostUnitResponseBodyDataCostUnitDtoList setOwnerUid(Long ownerUid) {
            this.ownerUid = ownerUid;
            return this;
        }
        public Long getOwnerUid() {
            return this.ownerUid;
        }

        public QueryCostUnitResponseBodyDataCostUnitDtoList setParentUnitId(Long parentUnitId) {
            this.parentUnitId = parentUnitId;
            return this;
        }
        public Long getParentUnitId() {
            return this.parentUnitId;
        }

        public QueryCostUnitResponseBodyDataCostUnitDtoList setUnitId(Long unitId) {
            this.unitId = unitId;
            return this;
        }
        public Long getUnitId() {
            return this.unitId;
        }

        public QueryCostUnitResponseBodyDataCostUnitDtoList setUnitName(String unitName) {
            this.unitName = unitName;
            return this;
        }
        public String getUnitName() {
            return this.unitName;
        }

    }

    public static class QueryCostUnitResponseBodyData extends TeaModel {
        /**
         * <p>The cost centers.</p>
         */
        @NameInMap("CostUnitDtoList")
        public java.util.List<QueryCostUnitResponseBodyDataCostUnitDtoList> costUnitDtoList;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>The number of entries returned on each page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of returned entries.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static QueryCostUnitResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCostUnitResponseBodyData self = new QueryCostUnitResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCostUnitResponseBodyData setCostUnitDtoList(java.util.List<QueryCostUnitResponseBodyDataCostUnitDtoList> costUnitDtoList) {
            this.costUnitDtoList = costUnitDtoList;
            return this;
        }
        public java.util.List<QueryCostUnitResponseBodyDataCostUnitDtoList> getCostUnitDtoList() {
            return this.costUnitDtoList;
        }

        public QueryCostUnitResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QueryCostUnitResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryCostUnitResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
