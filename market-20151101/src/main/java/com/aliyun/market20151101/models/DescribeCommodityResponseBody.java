// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeCommodityResponseBody extends TeaModel {
    @NameInMap("Commodity")
    public DescribeCommodityResponseBodyCommodity commodity;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeCommodityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommodityResponseBody self = new DescribeCommodityResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCommodityResponseBody setCommodity(DescribeCommodityResponseBodyCommodity commodity) {
        this.commodity = commodity;
        return this;
    }
    public DescribeCommodityResponseBodyCommodity getCommodity() {
        return this.commodity;
    }

    public DescribeCommodityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCommodityResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeCommodityResponseBodyCommodity extends TeaModel {
        @NameInMap("ApplicationId")
        public String applicationId;

        @NameInMap("CommodityId")
        public String commodityId;

        @NameInMap("CommoditySpecs")
        public String commoditySpecs;

        @NameInMap("Properties")
        public String properties;

        public static DescribeCommodityResponseBodyCommodity build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommodityResponseBodyCommodity self = new DescribeCommodityResponseBodyCommodity();
            return TeaModel.build(map, self);
        }

        public DescribeCommodityResponseBodyCommodity setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public DescribeCommodityResponseBodyCommodity setCommodityId(String commodityId) {
            this.commodityId = commodityId;
            return this;
        }
        public String getCommodityId() {
            return this.commodityId;
        }

        public DescribeCommodityResponseBodyCommodity setCommoditySpecs(String commoditySpecs) {
            this.commoditySpecs = commoditySpecs;
            return this;
        }
        public String getCommoditySpecs() {
            return this.commoditySpecs;
        }

        public DescribeCommodityResponseBodyCommodity setProperties(String properties) {
            this.properties = properties;
            return this;
        }
        public String getProperties() {
            return this.properties;
        }

    }

}
