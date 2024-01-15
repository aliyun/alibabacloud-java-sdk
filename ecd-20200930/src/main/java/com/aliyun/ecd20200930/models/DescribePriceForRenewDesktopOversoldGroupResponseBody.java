// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribePriceForRenewDesktopOversoldGroupResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribePriceForRenewDesktopOversoldGroupResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribePriceForRenewDesktopOversoldGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePriceForRenewDesktopOversoldGroupResponseBody self = new DescribePriceForRenewDesktopOversoldGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePriceForRenewDesktopOversoldGroupResponseBody setData(DescribePriceForRenewDesktopOversoldGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribePriceForRenewDesktopOversoldGroupResponseBodyData getData() {
        return this.data;
    }

    public DescribePriceForRenewDesktopOversoldGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePriceForRenewDesktopOversoldGroupResponseBodyData extends TeaModel {
        @NameInMap("Price")
        public String price;

        public static DescribePriceForRenewDesktopOversoldGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceForRenewDesktopOversoldGroupResponseBodyData self = new DescribePriceForRenewDesktopOversoldGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribePriceForRenewDesktopOversoldGroupResponseBodyData setPrice(String price) {
            this.price = price;
            return this;
        }
        public String getPrice() {
            return this.price;
        }

    }

}
