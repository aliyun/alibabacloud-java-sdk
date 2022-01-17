// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class CreateCommodityResponseBody extends TeaModel {
    @NameInMap("Commodity")
    public CreateCommodityResponseBodyCommodity commodity;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateCommodityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCommodityResponseBody self = new CreateCommodityResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCommodityResponseBody setCommodity(CreateCommodityResponseBodyCommodity commodity) {
        this.commodity = commodity;
        return this;
    }
    public CreateCommodityResponseBodyCommodity getCommodity() {
        return this.commodity;
    }

    public CreateCommodityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCommodityResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateCommodityResponseBodyCommodity extends TeaModel {
        @NameInMap("CommodityId")
        public String commodityId;

        public static CreateCommodityResponseBodyCommodity build(java.util.Map<String, ?> map) throws Exception {
            CreateCommodityResponseBodyCommodity self = new CreateCommodityResponseBodyCommodity();
            return TeaModel.build(map, self);
        }

        public CreateCommodityResponseBodyCommodity setCommodityId(String commodityId) {
            this.commodityId = commodityId;
            return this;
        }
        public String getCommodityId() {
            return this.commodityId;
        }

    }

}
