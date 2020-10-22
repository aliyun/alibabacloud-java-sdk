// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.efc_service20190318.models;

import com.aliyun.tea.*;

public class QueryReservedInstanceSharedInfosResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Count")
    @Validation(required = true)
    public Integer count;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("CurrentPage")
    @Validation(required = true)
    public Integer currentPage;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Region")
    @Validation(required = true)
    public String region;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<QueryReservedInstanceSharedInfosResponseData> data;

    public static QueryReservedInstanceSharedInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryReservedInstanceSharedInfosResponse self = new QueryReservedInstanceSharedInfosResponse();
        return TeaModel.build(map, self);
    }

    public QueryReservedInstanceSharedInfosResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryReservedInstanceSharedInfosResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryReservedInstanceSharedInfosResponse setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public QueryReservedInstanceSharedInfosResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryReservedInstanceSharedInfosResponse setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryReservedInstanceSharedInfosResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public QueryReservedInstanceSharedInfosResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryReservedInstanceSharedInfosResponse setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public QueryReservedInstanceSharedInfosResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryReservedInstanceSharedInfosResponse setData(java.util.List<QueryReservedInstanceSharedInfosResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryReservedInstanceSharedInfosResponseData> getData() {
        return this.data;
    }

    public static class QueryReservedInstanceSharedInfosResponseData extends TeaModel {
        @NameInMap("MainAccountPk")
        @Validation(required = true)
        public Long mainAccountPk;

        @NameInMap("SubAccountPk")
        @Validation(required = true)
        public Long subAccountPk;

        @NameInMap("RelationType")
        @Validation(required = true)
        public String relationType;

        @NameInMap("RiInstanceId")
        @Validation(required = true)
        public String riInstanceId;

        @NameInMap("EffectTime")
        @Validation(required = true)
        public Long effectTime;

        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        public static QueryReservedInstanceSharedInfosResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryReservedInstanceSharedInfosResponseData self = new QueryReservedInstanceSharedInfosResponseData();
            return TeaModel.build(map, self);
        }

        public QueryReservedInstanceSharedInfosResponseData setMainAccountPk(Long mainAccountPk) {
            this.mainAccountPk = mainAccountPk;
            return this;
        }
        public Long getMainAccountPk() {
            return this.mainAccountPk;
        }

        public QueryReservedInstanceSharedInfosResponseData setSubAccountPk(Long subAccountPk) {
            this.subAccountPk = subAccountPk;
            return this;
        }
        public Long getSubAccountPk() {
            return this.subAccountPk;
        }

        public QueryReservedInstanceSharedInfosResponseData setRelationType(String relationType) {
            this.relationType = relationType;
            return this;
        }
        public String getRelationType() {
            return this.relationType;
        }

        public QueryReservedInstanceSharedInfosResponseData setRiInstanceId(String riInstanceId) {
            this.riInstanceId = riInstanceId;
            return this;
        }
        public String getRiInstanceId() {
            return this.riInstanceId;
        }

        public QueryReservedInstanceSharedInfosResponseData setEffectTime(Long effectTime) {
            this.effectTime = effectTime;
            return this;
        }
        public Long getEffectTime() {
            return this.effectTime;
        }

        public QueryReservedInstanceSharedInfosResponseData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
