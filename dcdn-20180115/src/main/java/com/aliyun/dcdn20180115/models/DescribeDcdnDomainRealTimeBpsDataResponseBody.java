// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainRealTimeBpsDataResponseBody extends TeaModel {
    /**
     * <p>The list of the data returned.</p>
     */
    @NameInMap("Data")
    public DescribeDcdnDomainRealTimeBpsDataResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnDomainRealTimeBpsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainRealTimeBpsDataResponseBody self = new DescribeDcdnDomainRealTimeBpsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainRealTimeBpsDataResponseBody setData(DescribeDcdnDomainRealTimeBpsDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDcdnDomainRealTimeBpsDataResponseBodyData getData() {
        return this.data;
    }

    public DescribeDcdnDomainRealTimeBpsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDcdnDomainRealTimeBpsDataResponseBodyDataBpsModel extends TeaModel {
        /**
         * <p>The bandwidth, in bit/s.</p>
         */
        @NameInMap("Bps")
        public Float bps;

        /**
         * <p>The timestamp of the data returned. The time follows the ISO 8601 standard. The time is displayed in UTC.</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeDcdnDomainRealTimeBpsDataResponseBodyDataBpsModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainRealTimeBpsDataResponseBodyDataBpsModel self = new DescribeDcdnDomainRealTimeBpsDataResponseBodyDataBpsModel();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainRealTimeBpsDataResponseBodyDataBpsModel setBps(Float bps) {
            this.bps = bps;
            return this;
        }
        public Float getBps() {
            return this.bps;
        }

        public DescribeDcdnDomainRealTimeBpsDataResponseBodyDataBpsModel setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeDcdnDomainRealTimeBpsDataResponseBodyData extends TeaModel {
        @NameInMap("BpsModel")
        public java.util.List<DescribeDcdnDomainRealTimeBpsDataResponseBodyDataBpsModel> bpsModel;

        public static DescribeDcdnDomainRealTimeBpsDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainRealTimeBpsDataResponseBodyData self = new DescribeDcdnDomainRealTimeBpsDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainRealTimeBpsDataResponseBodyData setBpsModel(java.util.List<DescribeDcdnDomainRealTimeBpsDataResponseBodyDataBpsModel> bpsModel) {
            this.bpsModel = bpsModel;
            return this;
        }
        public java.util.List<DescribeDcdnDomainRealTimeBpsDataResponseBodyDataBpsModel> getBpsModel() {
            return this.bpsModel;
        }

    }

}
