// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsCommodityCodeResponseBody extends TeaModel {
    @NameInMap("CommodityCodeInfo")
    public java.util.List<DescribeEnsCommodityCodeResponseBodyCommodityCodeInfo> commodityCodeInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeEnsCommodityCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsCommodityCodeResponseBody self = new DescribeEnsCommodityCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEnsCommodityCodeResponseBody setCommodityCodeInfo(java.util.List<DescribeEnsCommodityCodeResponseBodyCommodityCodeInfo> commodityCodeInfo) {
        this.commodityCodeInfo = commodityCodeInfo;
        return this;
    }
    public java.util.List<DescribeEnsCommodityCodeResponseBodyCommodityCodeInfo> getCommodityCodeInfo() {
        return this.commodityCodeInfo;
    }

    public DescribeEnsCommodityCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeEnsCommodityCodeResponseBodyCommodityCodeInfo extends TeaModel {
        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("CommodityName")
        public String commodityName;

        public static DescribeEnsCommodityCodeResponseBodyCommodityCodeInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsCommodityCodeResponseBodyCommodityCodeInfo self = new DescribeEnsCommodityCodeResponseBodyCommodityCodeInfo();
            return TeaModel.build(map, self);
        }

        public DescribeEnsCommodityCodeResponseBodyCommodityCodeInfo setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeEnsCommodityCodeResponseBodyCommodityCodeInfo setCommodityName(String commodityName) {
            this.commodityName = commodityName;
            return this;
        }
        public String getCommodityName() {
            return this.commodityName;
        }

    }

}
