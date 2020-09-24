// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryCostUnitResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryCostUnitResponseData data;

    public static QueryCostUnitResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCostUnitResponse self = new QueryCostUnitResponse();
        return TeaModel.build(map, self);
    }

    public QueryCostUnitResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCostUnitResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryCostUnitResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCostUnitResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCostUnitResponse setData(QueryCostUnitResponseData data) {
        this.data = data;
        return this;
    }
    public QueryCostUnitResponseData getData() {
        return this.data;
    }

    public static class QueryCostUnitResponseDataCostUnitDtoList extends TeaModel {
        @NameInMap("OwnerUid")
        @Validation(required = true)
        public Long ownerUid;

        @NameInMap("ParentUnitId")
        @Validation(required = true)
        public Long parentUnitId;

        @NameInMap("UnitId")
        @Validation(required = true)
        public Long unitId;

        @NameInMap("UnitName")
        @Validation(required = true)
        public String unitName;

        public static QueryCostUnitResponseDataCostUnitDtoList build(java.util.Map<String, ?> map) throws Exception {
            QueryCostUnitResponseDataCostUnitDtoList self = new QueryCostUnitResponseDataCostUnitDtoList();
            return TeaModel.build(map, self);
        }

        public QueryCostUnitResponseDataCostUnitDtoList setOwnerUid(Long ownerUid) {
            this.ownerUid = ownerUid;
            return this;
        }
        public Long getOwnerUid() {
            return this.ownerUid;
        }

        public QueryCostUnitResponseDataCostUnitDtoList setParentUnitId(Long parentUnitId) {
            this.parentUnitId = parentUnitId;
            return this;
        }
        public Long getParentUnitId() {
            return this.parentUnitId;
        }

        public QueryCostUnitResponseDataCostUnitDtoList setUnitId(Long unitId) {
            this.unitId = unitId;
            return this;
        }
        public Long getUnitId() {
            return this.unitId;
        }

        public QueryCostUnitResponseDataCostUnitDtoList setUnitName(String unitName) {
            this.unitName = unitName;
            return this;
        }
        public String getUnitName() {
            return this.unitName;
        }

    }

    public static class QueryCostUnitResponseData extends TeaModel {
        @NameInMap("PageNum")
        @Validation(required = true)
        public Integer pageNum;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("CostUnitDtoList")
        @Validation(required = true)
        public java.util.List<QueryCostUnitResponseDataCostUnitDtoList> costUnitDtoList;

        public static QueryCostUnitResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryCostUnitResponseData self = new QueryCostUnitResponseData();
            return TeaModel.build(map, self);
        }

        public QueryCostUnitResponseData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QueryCostUnitResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryCostUnitResponseData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public QueryCostUnitResponseData setCostUnitDtoList(java.util.List<QueryCostUnitResponseDataCostUnitDtoList> costUnitDtoList) {
            this.costUnitDtoList = costUnitDtoList;
            return this;
        }
        public java.util.List<QueryCostUnitResponseDataCostUnitDtoList> getCostUnitDtoList() {
            return this.costUnitDtoList;
        }

    }

}
