// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainRealTimeBpsDataResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeDomainRealTimeBpsDataResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDomainRealTimeBpsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRealTimeBpsDataResponseBody self = new DescribeDomainRealTimeBpsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainRealTimeBpsDataResponseBody setData(DescribeDomainRealTimeBpsDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDomainRealTimeBpsDataResponseBodyData getData() {
        return this.data;
    }

    public DescribeDomainRealTimeBpsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDomainRealTimeBpsDataResponseBodyDataBpsModel extends TeaModel {
        @NameInMap("Bps")
        public Float bps;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeDomainRealTimeBpsDataResponseBodyDataBpsModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainRealTimeBpsDataResponseBodyDataBpsModel self = new DescribeDomainRealTimeBpsDataResponseBodyDataBpsModel();
            return TeaModel.build(map, self);
        }

        public DescribeDomainRealTimeBpsDataResponseBodyDataBpsModel setBps(Float bps) {
            this.bps = bps;
            return this;
        }
        public Float getBps() {
            return this.bps;
        }

        public DescribeDomainRealTimeBpsDataResponseBodyDataBpsModel setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeDomainRealTimeBpsDataResponseBodyData extends TeaModel {
        @NameInMap("BpsModel")
        public java.util.List<DescribeDomainRealTimeBpsDataResponseBodyDataBpsModel> bpsModel;

        public static DescribeDomainRealTimeBpsDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainRealTimeBpsDataResponseBodyData self = new DescribeDomainRealTimeBpsDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDomainRealTimeBpsDataResponseBodyData setBpsModel(java.util.List<DescribeDomainRealTimeBpsDataResponseBodyDataBpsModel> bpsModel) {
            this.bpsModel = bpsModel;
            return this;
        }
        public java.util.List<DescribeDomainRealTimeBpsDataResponseBodyDataBpsModel> getBpsModel() {
            return this.bpsModel;
        }

    }

}
