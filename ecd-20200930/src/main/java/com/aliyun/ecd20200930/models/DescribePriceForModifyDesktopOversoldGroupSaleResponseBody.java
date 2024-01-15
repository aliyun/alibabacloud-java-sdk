// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribePriceForModifyDesktopOversoldGroupSaleResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribePriceForModifyDesktopOversoldGroupSaleResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribePriceForModifyDesktopOversoldGroupSaleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePriceForModifyDesktopOversoldGroupSaleResponseBody self = new DescribePriceForModifyDesktopOversoldGroupSaleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePriceForModifyDesktopOversoldGroupSaleResponseBody setData(DescribePriceForModifyDesktopOversoldGroupSaleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribePriceForModifyDesktopOversoldGroupSaleResponseBodyData getData() {
        return this.data;
    }

    public DescribePriceForModifyDesktopOversoldGroupSaleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePriceForModifyDesktopOversoldGroupSaleResponseBodyData extends TeaModel {
        @NameInMap("Price")
        public String price;

        public static DescribePriceForModifyDesktopOversoldGroupSaleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceForModifyDesktopOversoldGroupSaleResponseBodyData self = new DescribePriceForModifyDesktopOversoldGroupSaleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribePriceForModifyDesktopOversoldGroupSaleResponseBodyData setPrice(String price) {
            this.price = price;
            return this;
        }
        public String getPrice() {
            return this.price;
        }

    }

}
