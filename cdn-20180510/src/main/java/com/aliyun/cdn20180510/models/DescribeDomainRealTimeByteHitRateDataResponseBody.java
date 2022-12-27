// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainRealTimeByteHitRateDataResponseBody extends TeaModel {
    // The response parameters.
    @NameInMap("Data")
    public DescribeDomainRealTimeByteHitRateDataResponseBodyData data;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDomainRealTimeByteHitRateDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRealTimeByteHitRateDataResponseBody self = new DescribeDomainRealTimeByteHitRateDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainRealTimeByteHitRateDataResponseBody setData(DescribeDomainRealTimeByteHitRateDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDomainRealTimeByteHitRateDataResponseBodyData getData() {
        return this.data;
    }

    public DescribeDomainRealTimeByteHitRateDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDomainRealTimeByteHitRateDataResponseBodyDataByteHitRateDataModel extends TeaModel {
        // The byte hit ratio. The byte hit ratio is measured in percentage.
        @NameInMap("ByteHitRate")
        public Float byteHitRate;

        // The timestamp of the data returned. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeDomainRealTimeByteHitRateDataResponseBodyDataByteHitRateDataModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainRealTimeByteHitRateDataResponseBodyDataByteHitRateDataModel self = new DescribeDomainRealTimeByteHitRateDataResponseBodyDataByteHitRateDataModel();
            return TeaModel.build(map, self);
        }

        public DescribeDomainRealTimeByteHitRateDataResponseBodyDataByteHitRateDataModel setByteHitRate(Float byteHitRate) {
            this.byteHitRate = byteHitRate;
            return this;
        }
        public Float getByteHitRate() {
            return this.byteHitRate;
        }

        public DescribeDomainRealTimeByteHitRateDataResponseBodyDataByteHitRateDataModel setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeDomainRealTimeByteHitRateDataResponseBodyData extends TeaModel {
        @NameInMap("ByteHitRateDataModel")
        public java.util.List<DescribeDomainRealTimeByteHitRateDataResponseBodyDataByteHitRateDataModel> byteHitRateDataModel;

        public static DescribeDomainRealTimeByteHitRateDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainRealTimeByteHitRateDataResponseBodyData self = new DescribeDomainRealTimeByteHitRateDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDomainRealTimeByteHitRateDataResponseBodyData setByteHitRateDataModel(java.util.List<DescribeDomainRealTimeByteHitRateDataResponseBodyDataByteHitRateDataModel> byteHitRateDataModel) {
            this.byteHitRateDataModel = byteHitRateDataModel;
            return this;
        }
        public java.util.List<DescribeDomainRealTimeByteHitRateDataResponseBodyDataByteHitRateDataModel> getByteHitRateDataModel() {
            return this.byteHitRateDataModel;
        }

    }

}
