// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainRealTimeQpsDataResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeDcdnDomainRealTimeQpsDataResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnDomainRealTimeQpsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainRealTimeQpsDataResponseBody self = new DescribeDcdnDomainRealTimeQpsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainRealTimeQpsDataResponseBody setData(DescribeDcdnDomainRealTimeQpsDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDcdnDomainRealTimeQpsDataResponseBodyData getData() {
        return this.data;
    }

    public DescribeDcdnDomainRealTimeQpsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDcdnDomainRealTimeQpsDataResponseBodyDataQpsModel extends TeaModel {
        @NameInMap("Qps")
        public Float qps;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeDcdnDomainRealTimeQpsDataResponseBodyDataQpsModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainRealTimeQpsDataResponseBodyDataQpsModel self = new DescribeDcdnDomainRealTimeQpsDataResponseBodyDataQpsModel();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainRealTimeQpsDataResponseBodyDataQpsModel setQps(Float qps) {
            this.qps = qps;
            return this;
        }
        public Float getQps() {
            return this.qps;
        }

        public DescribeDcdnDomainRealTimeQpsDataResponseBodyDataQpsModel setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeDcdnDomainRealTimeQpsDataResponseBodyData extends TeaModel {
        @NameInMap("QpsModel")
        public java.util.List<DescribeDcdnDomainRealTimeQpsDataResponseBodyDataQpsModel> qpsModel;

        public static DescribeDcdnDomainRealTimeQpsDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainRealTimeQpsDataResponseBodyData self = new DescribeDcdnDomainRealTimeQpsDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainRealTimeQpsDataResponseBodyData setQpsModel(java.util.List<DescribeDcdnDomainRealTimeQpsDataResponseBodyDataQpsModel> qpsModel) {
            this.qpsModel = qpsModel;
            return this;
        }
        public java.util.List<DescribeDcdnDomainRealTimeQpsDataResponseBodyDataQpsModel> getQpsModel() {
            return this.qpsModel;
        }

    }

}
