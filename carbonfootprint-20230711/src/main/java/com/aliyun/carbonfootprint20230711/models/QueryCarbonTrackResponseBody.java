// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.carbonfootprint20230711.models;

import com.aliyun.tea.*;

public class QueryCarbonTrackResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<QueryCarbonTrackResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryCarbonTrackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCarbonTrackResponseBody self = new QueryCarbonTrackResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCarbonTrackResponseBody setData(java.util.List<QueryCarbonTrackResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryCarbonTrackResponseBodyData> getData() {
        return this.data;
    }

    public QueryCarbonTrackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryCarbonTrackResponseBodyData extends TeaModel {
        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("QuotaValue")
        public Double quotaValue;

        @NameInMap("Region")
        public String region;

        @NameInMap("StatisticsDate")
        public Long statisticsDate;

        @NameInMap("SubUid")
        public String subUid;

        @NameInMap("Uid")
        public String uid;

        public static QueryCarbonTrackResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCarbonTrackResponseBodyData self = new QueryCarbonTrackResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCarbonTrackResponseBodyData setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public QueryCarbonTrackResponseBodyData setQuotaValue(Double quotaValue) {
            this.quotaValue = quotaValue;
            return this;
        }
        public Double getQuotaValue() {
            return this.quotaValue;
        }

        public QueryCarbonTrackResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QueryCarbonTrackResponseBodyData setStatisticsDate(Long statisticsDate) {
            this.statisticsDate = statisticsDate;
            return this;
        }
        public Long getStatisticsDate() {
            return this.statisticsDate;
        }

        public QueryCarbonTrackResponseBodyData setSubUid(String subUid) {
            this.subUid = subUid;
            return this;
        }
        public String getSubUid() {
            return this.subUid;
        }

        public QueryCarbonTrackResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
