// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribePriceForCreateDesktopOversoldGroupResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribePriceForCreateDesktopOversoldGroupResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribePriceForCreateDesktopOversoldGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePriceForCreateDesktopOversoldGroupResponseBody self = new DescribePriceForCreateDesktopOversoldGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePriceForCreateDesktopOversoldGroupResponseBody setData(DescribePriceForCreateDesktopOversoldGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribePriceForCreateDesktopOversoldGroupResponseBodyData getData() {
        return this.data;
    }

    public DescribePriceForCreateDesktopOversoldGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePriceForCreateDesktopOversoldGroupResponseBodyData extends TeaModel {
        @NameInMap("Price")
        public String price;

        public static DescribePriceForCreateDesktopOversoldGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceForCreateDesktopOversoldGroupResponseBodyData self = new DescribePriceForCreateDesktopOversoldGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribePriceForCreateDesktopOversoldGroupResponseBodyData setPrice(String price) {
            this.price = price;
            return this;
        }
        public String getPrice() {
            return this.price;
        }

    }

}
