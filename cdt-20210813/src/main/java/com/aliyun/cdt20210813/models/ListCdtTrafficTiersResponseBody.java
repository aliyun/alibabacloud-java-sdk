// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdt20210813.models;

import com.aliyun.tea.*;

public class ListCdtTrafficTiersResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TrafficTiers")
    public java.util.List<ListCdtTrafficTiersResponseBodyTrafficTiers> trafficTiers;

    public static ListCdtTrafficTiersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCdtTrafficTiersResponseBody self = new ListCdtTrafficTiersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCdtTrafficTiersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCdtTrafficTiersResponseBody setTrafficTiers(java.util.List<ListCdtTrafficTiersResponseBodyTrafficTiers> trafficTiers) {
        this.trafficTiers = trafficTiers;
        return this;
    }
    public java.util.List<ListCdtTrafficTiersResponseBodyTrafficTiers> getTrafficTiers() {
        return this.trafficTiers;
    }

    public static class ListCdtTrafficTiersResponseBodyTrafficTiers extends TeaModel {
        @NameInMap("HighestTraffic")
        public Long highestTraffic;

        @NameInMap("LowestTraffic")
        public Long lowestTraffic;

        @NameInMap("Tier")
        public Long tier;

        public static ListCdtTrafficTiersResponseBodyTrafficTiers build(java.util.Map<String, ?> map) throws Exception {
            ListCdtTrafficTiersResponseBodyTrafficTiers self = new ListCdtTrafficTiersResponseBodyTrafficTiers();
            return TeaModel.build(map, self);
        }

        public ListCdtTrafficTiersResponseBodyTrafficTiers setHighestTraffic(Long highestTraffic) {
            this.highestTraffic = highestTraffic;
            return this;
        }
        public Long getHighestTraffic() {
            return this.highestTraffic;
        }

        public ListCdtTrafficTiersResponseBodyTrafficTiers setLowestTraffic(Long lowestTraffic) {
            this.lowestTraffic = lowestTraffic;
            return this;
        }
        public Long getLowestTraffic() {
            return this.lowestTraffic;
        }

        public ListCdtTrafficTiersResponseBodyTrafficTiers setTier(Long tier) {
            this.tier = tier;
            return this;
        }
        public Long getTier() {
            return this.tier;
        }

    }

}
