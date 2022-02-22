// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdt20210813.models;

import com.aliyun.tea.*;

public class ListCdtInternetTrafficResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TrafficDetails")
    public java.util.List<ListCdtInternetTrafficResponseBodyTrafficDetails> trafficDetails;

    public static ListCdtInternetTrafficResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCdtInternetTrafficResponseBody self = new ListCdtInternetTrafficResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCdtInternetTrafficResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCdtInternetTrafficResponseBody setTrafficDetails(java.util.List<ListCdtInternetTrafficResponseBodyTrafficDetails> trafficDetails) {
        this.trafficDetails = trafficDetails;
        return this;
    }
    public java.util.List<ListCdtInternetTrafficResponseBodyTrafficDetails> getTrafficDetails() {
        return this.trafficDetails;
    }

    public static class ListCdtInternetTrafficResponseBodyTrafficDetailsProductTrafficDetails extends TeaModel {
        @NameInMap("Product")
        public String product;

        @NameInMap("Traffic")
        public Long traffic;

        public static ListCdtInternetTrafficResponseBodyTrafficDetailsProductTrafficDetails build(java.util.Map<String, ?> map) throws Exception {
            ListCdtInternetTrafficResponseBodyTrafficDetailsProductTrafficDetails self = new ListCdtInternetTrafficResponseBodyTrafficDetailsProductTrafficDetails();
            return TeaModel.build(map, self);
        }

        public ListCdtInternetTrafficResponseBodyTrafficDetailsProductTrafficDetails setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public ListCdtInternetTrafficResponseBodyTrafficDetailsProductTrafficDetails setTraffic(Long traffic) {
            this.traffic = traffic;
            return this;
        }
        public Long getTraffic() {
            return this.traffic;
        }

    }

    public static class ListCdtInternetTrafficResponseBodyTrafficDetailsTrafficTierDetails extends TeaModel {
        @NameInMap("HighestTraffic")
        public Long highestTraffic;

        @NameInMap("LowestTraffic")
        public Long lowestTraffic;

        @NameInMap("Tier")
        public Long tier;

        @NameInMap("Traffic")
        public Long traffic;

        public static ListCdtInternetTrafficResponseBodyTrafficDetailsTrafficTierDetails build(java.util.Map<String, ?> map) throws Exception {
            ListCdtInternetTrafficResponseBodyTrafficDetailsTrafficTierDetails self = new ListCdtInternetTrafficResponseBodyTrafficDetailsTrafficTierDetails();
            return TeaModel.build(map, self);
        }

        public ListCdtInternetTrafficResponseBodyTrafficDetailsTrafficTierDetails setHighestTraffic(Long highestTraffic) {
            this.highestTraffic = highestTraffic;
            return this;
        }
        public Long getHighestTraffic() {
            return this.highestTraffic;
        }

        public ListCdtInternetTrafficResponseBodyTrafficDetailsTrafficTierDetails setLowestTraffic(Long lowestTraffic) {
            this.lowestTraffic = lowestTraffic;
            return this;
        }
        public Long getLowestTraffic() {
            return this.lowestTraffic;
        }

        public ListCdtInternetTrafficResponseBodyTrafficDetailsTrafficTierDetails setTier(Long tier) {
            this.tier = tier;
            return this;
        }
        public Long getTier() {
            return this.tier;
        }

        public ListCdtInternetTrafficResponseBodyTrafficDetailsTrafficTierDetails setTraffic(Long traffic) {
            this.traffic = traffic;
            return this;
        }
        public Long getTraffic() {
            return this.traffic;
        }

    }

    public static class ListCdtInternetTrafficResponseBodyTrafficDetails extends TeaModel {
        @NameInMap("BusinessRegionId")
        public String businessRegionId;

        @NameInMap("ISPType")
        public String ISPType;

        @NameInMap("ProductTrafficDetails")
        public java.util.List<ListCdtInternetTrafficResponseBodyTrafficDetailsProductTrafficDetails> productTrafficDetails;

        @NameInMap("Traffic")
        public Long traffic;

        @NameInMap("TrafficTierDetails")
        public java.util.List<ListCdtInternetTrafficResponseBodyTrafficDetailsTrafficTierDetails> trafficTierDetails;

        public static ListCdtInternetTrafficResponseBodyTrafficDetails build(java.util.Map<String, ?> map) throws Exception {
            ListCdtInternetTrafficResponseBodyTrafficDetails self = new ListCdtInternetTrafficResponseBodyTrafficDetails();
            return TeaModel.build(map, self);
        }

        public ListCdtInternetTrafficResponseBodyTrafficDetails setBusinessRegionId(String businessRegionId) {
            this.businessRegionId = businessRegionId;
            return this;
        }
        public String getBusinessRegionId() {
            return this.businessRegionId;
        }

        public ListCdtInternetTrafficResponseBodyTrafficDetails setISPType(String ISPType) {
            this.ISPType = ISPType;
            return this;
        }
        public String getISPType() {
            return this.ISPType;
        }

        public ListCdtInternetTrafficResponseBodyTrafficDetails setProductTrafficDetails(java.util.List<ListCdtInternetTrafficResponseBodyTrafficDetailsProductTrafficDetails> productTrafficDetails) {
            this.productTrafficDetails = productTrafficDetails;
            return this;
        }
        public java.util.List<ListCdtInternetTrafficResponseBodyTrafficDetailsProductTrafficDetails> getProductTrafficDetails() {
            return this.productTrafficDetails;
        }

        public ListCdtInternetTrafficResponseBodyTrafficDetails setTraffic(Long traffic) {
            this.traffic = traffic;
            return this;
        }
        public Long getTraffic() {
            return this.traffic;
        }

        public ListCdtInternetTrafficResponseBodyTrafficDetails setTrafficTierDetails(java.util.List<ListCdtInternetTrafficResponseBodyTrafficDetailsTrafficTierDetails> trafficTierDetails) {
            this.trafficTierDetails = trafficTierDetails;
            return this;
        }
        public java.util.List<ListCdtInternetTrafficResponseBodyTrafficDetailsTrafficTierDetails> getTrafficTierDetails() {
            return this.trafficTierDetails;
        }

    }

}
