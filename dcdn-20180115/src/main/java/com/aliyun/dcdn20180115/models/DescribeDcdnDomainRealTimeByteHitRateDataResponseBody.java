// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainRealTimeByteHitRateDataResponseBody extends TeaModel {
    /**
     * <p>The list of byte hit ratios.</p>
     */
    @NameInMap("Data")
    public DescribeDcdnDomainRealTimeByteHitRateDataResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B955107D-E658-4E77-B913-E0AC3D31693E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnDomainRealTimeByteHitRateDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainRealTimeByteHitRateDataResponseBody self = new DescribeDcdnDomainRealTimeByteHitRateDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainRealTimeByteHitRateDataResponseBody setData(DescribeDcdnDomainRealTimeByteHitRateDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDcdnDomainRealTimeByteHitRateDataResponseBodyData getData() {
        return this.data;
    }

    public DescribeDcdnDomainRealTimeByteHitRateDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDcdnDomainRealTimeByteHitRateDataResponseBodyDataByteHitRateDataModel extends TeaModel {
        /**
         * <p>The byte hit ratio.</p>
         * 
         * <strong>example:</strong>
         * <p>0.8956940476262277</p>
         */
        @NameInMap("ByteHitRate")
        public Float byteHitRate;

        /**
         * <p>The timestamp of the data returned. The time follows the ISO 8601 standard. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-10-20T04:00:00Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeDcdnDomainRealTimeByteHitRateDataResponseBodyDataByteHitRateDataModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainRealTimeByteHitRateDataResponseBodyDataByteHitRateDataModel self = new DescribeDcdnDomainRealTimeByteHitRateDataResponseBodyDataByteHitRateDataModel();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainRealTimeByteHitRateDataResponseBodyDataByteHitRateDataModel setByteHitRate(Float byteHitRate) {
            this.byteHitRate = byteHitRate;
            return this;
        }
        public Float getByteHitRate() {
            return this.byteHitRate;
        }

        public DescribeDcdnDomainRealTimeByteHitRateDataResponseBodyDataByteHitRateDataModel setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeDcdnDomainRealTimeByteHitRateDataResponseBodyData extends TeaModel {
        @NameInMap("ByteHitRateDataModel")
        public java.util.List<DescribeDcdnDomainRealTimeByteHitRateDataResponseBodyDataByteHitRateDataModel> byteHitRateDataModel;

        public static DescribeDcdnDomainRealTimeByteHitRateDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainRealTimeByteHitRateDataResponseBodyData self = new DescribeDcdnDomainRealTimeByteHitRateDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainRealTimeByteHitRateDataResponseBodyData setByteHitRateDataModel(java.util.List<DescribeDcdnDomainRealTimeByteHitRateDataResponseBodyDataByteHitRateDataModel> byteHitRateDataModel) {
            this.byteHitRateDataModel = byteHitRateDataModel;
            return this;
        }
        public java.util.List<DescribeDcdnDomainRealTimeByteHitRateDataResponseBodyDataByteHitRateDataModel> getByteHitRateDataModel() {
            return this.byteHitRateDataModel;
        }

    }

}
