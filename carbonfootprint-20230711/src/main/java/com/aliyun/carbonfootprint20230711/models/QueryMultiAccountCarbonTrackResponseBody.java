// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.carbonfootprint20230711.models;

import com.aliyun.tea.*;

public class QueryMultiAccountCarbonTrackResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<QueryMultiAccountCarbonTrackResponseBodyData> data;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryMultiAccountCarbonTrackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMultiAccountCarbonTrackResponseBody self = new QueryMultiAccountCarbonTrackResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMultiAccountCarbonTrackResponseBody setData(java.util.List<QueryMultiAccountCarbonTrackResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryMultiAccountCarbonTrackResponseBodyData> getData() {
        return this.data;
    }

    public QueryMultiAccountCarbonTrackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryMultiAccountCarbonTrackResponseBodyData extends TeaModel {
        @NameInMap("CarbonActualEmission")
        public String carbonActualEmission;

        @NameInMap("Month")
        public String month;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("Region")
        public String region;

        @NameInMap("Uid")
        public String uid;

        public static QueryMultiAccountCarbonTrackResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryMultiAccountCarbonTrackResponseBodyData self = new QueryMultiAccountCarbonTrackResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryMultiAccountCarbonTrackResponseBodyData setCarbonActualEmission(String carbonActualEmission) {
            this.carbonActualEmission = carbonActualEmission;
            return this;
        }
        public String getCarbonActualEmission() {
            return this.carbonActualEmission;
        }

        public QueryMultiAccountCarbonTrackResponseBodyData setMonth(String month) {
            this.month = month;
            return this;
        }
        public String getMonth() {
            return this.month;
        }

        public QueryMultiAccountCarbonTrackResponseBodyData setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public QueryMultiAccountCarbonTrackResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QueryMultiAccountCarbonTrackResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
