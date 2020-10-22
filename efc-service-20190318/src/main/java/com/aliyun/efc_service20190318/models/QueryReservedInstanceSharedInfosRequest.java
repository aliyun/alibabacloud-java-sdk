// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.efc_service20190318.models;

import com.aliyun.tea.*;

public class QueryReservedInstanceSharedInfosRequest extends TeaModel {
    @NameInMap("Uid")
    @Validation(required = true)
    public Long uid;

    @NameInMap("RiInfos")
    public java.util.List<QueryReservedInstanceSharedInfosRequestRiInfos> riInfos;

    @NameInMap("PageNo")
    @Validation(required = true)
    public Integer pageNo;

    @NameInMap("AccountType")
    @Validation(required = true)
    public String accountType;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Region")
    public String region;

    public static QueryReservedInstanceSharedInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryReservedInstanceSharedInfosRequest self = new QueryReservedInstanceSharedInfosRequest();
        return TeaModel.build(map, self);
    }

    public QueryReservedInstanceSharedInfosRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

    public QueryReservedInstanceSharedInfosRequest setRiInfos(java.util.List<QueryReservedInstanceSharedInfosRequestRiInfos> riInfos) {
        this.riInfos = riInfos;
        return this;
    }
    public java.util.List<QueryReservedInstanceSharedInfosRequestRiInfos> getRiInfos() {
        return this.riInfos;
    }

    public QueryReservedInstanceSharedInfosRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryReservedInstanceSharedInfosRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public QueryReservedInstanceSharedInfosRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryReservedInstanceSharedInfosRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public static class QueryReservedInstanceSharedInfosRequestRiInfos extends TeaModel {
        @NameInMap("CommodityCode")
        @Validation(required = true)
        public String commodityCode;

        @NameInMap("RiInstanceId")
        @Validation(required = true)
        public String riInstanceId;

        public static QueryReservedInstanceSharedInfosRequestRiInfos build(java.util.Map<String, ?> map) throws Exception {
            QueryReservedInstanceSharedInfosRequestRiInfos self = new QueryReservedInstanceSharedInfosRequestRiInfos();
            return TeaModel.build(map, self);
        }

        public QueryReservedInstanceSharedInfosRequestRiInfos setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public QueryReservedInstanceSharedInfosRequestRiInfos setRiInstanceId(String riInstanceId) {
            this.riInstanceId = riInstanceId;
            return this;
        }
        public String getRiInstanceId() {
            return this.riInstanceId;
        }

    }

}
