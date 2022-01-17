// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeCommoditiesResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeCommoditiesResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeCommoditiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommoditiesResponseBody self = new DescribeCommoditiesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCommoditiesResponseBody setData(DescribeCommoditiesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeCommoditiesResponseBodyData getData() {
        return this.data;
    }

    public DescribeCommoditiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCommoditiesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeCommoditiesResponseBodyDataCommoditiesCommodity extends TeaModel {
        @NameInMap("ApplicationId")
        public String applicationId;

        @NameInMap("CommodityId")
        public String commodityId;

        @NameInMap("Properties")
        public String properties;

        public static DescribeCommoditiesResponseBodyDataCommoditiesCommodity build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommoditiesResponseBodyDataCommoditiesCommodity self = new DescribeCommoditiesResponseBodyDataCommoditiesCommodity();
            return TeaModel.build(map, self);
        }

        public DescribeCommoditiesResponseBodyDataCommoditiesCommodity setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public DescribeCommoditiesResponseBodyDataCommoditiesCommodity setCommodityId(String commodityId) {
            this.commodityId = commodityId;
            return this;
        }
        public String getCommodityId() {
            return this.commodityId;
        }

        public DescribeCommoditiesResponseBodyDataCommoditiesCommodity setProperties(String properties) {
            this.properties = properties;
            return this;
        }
        public String getProperties() {
            return this.properties;
        }

    }

    public static class DescribeCommoditiesResponseBodyDataCommodities extends TeaModel {
        @NameInMap("Commodity")
        public java.util.List<DescribeCommoditiesResponseBodyDataCommoditiesCommodity> commodity;

        public static DescribeCommoditiesResponseBodyDataCommodities build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommoditiesResponseBodyDataCommodities self = new DescribeCommoditiesResponseBodyDataCommodities();
            return TeaModel.build(map, self);
        }

        public DescribeCommoditiesResponseBodyDataCommodities setCommodity(java.util.List<DescribeCommoditiesResponseBodyDataCommoditiesCommodity> commodity) {
            this.commodity = commodity;
            return this;
        }
        public java.util.List<DescribeCommoditiesResponseBodyDataCommoditiesCommodity> getCommodity() {
            return this.commodity;
        }

    }

    public static class DescribeCommoditiesResponseBodyDataPageable extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        public static DescribeCommoditiesResponseBodyDataPageable build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommoditiesResponseBodyDataPageable self = new DescribeCommoditiesResponseBodyDataPageable();
            return TeaModel.build(map, self);
        }

        public DescribeCommoditiesResponseBodyDataPageable setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeCommoditiesResponseBodyDataPageable setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

    public static class DescribeCommoditiesResponseBodyData extends TeaModel {
        @NameInMap("Commodities")
        public DescribeCommoditiesResponseBodyDataCommodities commodities;

        @NameInMap("Pageable")
        public DescribeCommoditiesResponseBodyDataPageable pageable;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeCommoditiesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommoditiesResponseBodyData self = new DescribeCommoditiesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeCommoditiesResponseBodyData setCommodities(DescribeCommoditiesResponseBodyDataCommodities commodities) {
            this.commodities = commodities;
            return this;
        }
        public DescribeCommoditiesResponseBodyDataCommodities getCommodities() {
            return this.commodities;
        }

        public DescribeCommoditiesResponseBodyData setPageable(DescribeCommoditiesResponseBodyDataPageable pageable) {
            this.pageable = pageable;
            return this;
        }
        public DescribeCommoditiesResponseBodyDataPageable getPageable() {
            return this.pageable;
        }

        public DescribeCommoditiesResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
