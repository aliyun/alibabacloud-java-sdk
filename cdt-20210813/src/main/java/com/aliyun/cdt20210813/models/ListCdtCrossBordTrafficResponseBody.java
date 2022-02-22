// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdt20210813.models;

import com.aliyun.tea.*;

public class ListCdtCrossBordTrafficResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TrafficDetails")
    public java.util.List<ListCdtCrossBordTrafficResponseBodyTrafficDetails> trafficDetails;

    public static ListCdtCrossBordTrafficResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCdtCrossBordTrafficResponseBody self = new ListCdtCrossBordTrafficResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCdtCrossBordTrafficResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCdtCrossBordTrafficResponseBody setTrafficDetails(java.util.List<ListCdtCrossBordTrafficResponseBodyTrafficDetails> trafficDetails) {
        this.trafficDetails = trafficDetails;
        return this;
    }
    public java.util.List<ListCdtCrossBordTrafficResponseBodyTrafficDetails> getTrafficDetails() {
        return this.trafficDetails;
    }

    public static class ListCdtCrossBordTrafficResponseBodyTrafficDetailsProductTrafficDetails extends TeaModel {
        @NameInMap("Product")
        public String product;

        @NameInMap("Traffic")
        public Long traffic;

        public static ListCdtCrossBordTrafficResponseBodyTrafficDetailsProductTrafficDetails build(java.util.Map<String, ?> map) throws Exception {
            ListCdtCrossBordTrafficResponseBodyTrafficDetailsProductTrafficDetails self = new ListCdtCrossBordTrafficResponseBodyTrafficDetailsProductTrafficDetails();
            return TeaModel.build(map, self);
        }

        public ListCdtCrossBordTrafficResponseBodyTrafficDetailsProductTrafficDetails setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public ListCdtCrossBordTrafficResponseBodyTrafficDetailsProductTrafficDetails setTraffic(Long traffic) {
            this.traffic = traffic;
            return this;
        }
        public Long getTraffic() {
            return this.traffic;
        }

    }

    public static class ListCdtCrossBordTrafficResponseBodyTrafficDetails extends TeaModel {
        @NameInMap("BusinessRegionId")
        public String businessRegionId;

        @NameInMap("ProductTrafficDetails")
        public java.util.List<ListCdtCrossBordTrafficResponseBodyTrafficDetailsProductTrafficDetails> productTrafficDetails;

        @NameInMap("Traffic")
        public Long traffic;

        public static ListCdtCrossBordTrafficResponseBodyTrafficDetails build(java.util.Map<String, ?> map) throws Exception {
            ListCdtCrossBordTrafficResponseBodyTrafficDetails self = new ListCdtCrossBordTrafficResponseBodyTrafficDetails();
            return TeaModel.build(map, self);
        }

        public ListCdtCrossBordTrafficResponseBodyTrafficDetails setBusinessRegionId(String businessRegionId) {
            this.businessRegionId = businessRegionId;
            return this;
        }
        public String getBusinessRegionId() {
            return this.businessRegionId;
        }

        public ListCdtCrossBordTrafficResponseBodyTrafficDetails setProductTrafficDetails(java.util.List<ListCdtCrossBordTrafficResponseBodyTrafficDetailsProductTrafficDetails> productTrafficDetails) {
            this.productTrafficDetails = productTrafficDetails;
            return this;
        }
        public java.util.List<ListCdtCrossBordTrafficResponseBodyTrafficDetailsProductTrafficDetails> getProductTrafficDetails() {
            return this.productTrafficDetails;
        }

        public ListCdtCrossBordTrafficResponseBodyTrafficDetails setTraffic(Long traffic) {
            this.traffic = traffic;
            return this;
        }
        public Long getTraffic() {
            return this.traffic;
        }

    }

}
