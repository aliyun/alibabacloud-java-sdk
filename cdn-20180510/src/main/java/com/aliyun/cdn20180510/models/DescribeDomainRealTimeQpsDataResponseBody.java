// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainRealTimeQpsDataResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeDomainRealTimeQpsDataResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDomainRealTimeQpsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRealTimeQpsDataResponseBody self = new DescribeDomainRealTimeQpsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainRealTimeQpsDataResponseBody setData(DescribeDomainRealTimeQpsDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDomainRealTimeQpsDataResponseBodyData getData() {
        return this.data;
    }

    public DescribeDomainRealTimeQpsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDomainRealTimeQpsDataResponseBodyDataQpsModel extends TeaModel {
        @NameInMap("Qps")
        public Float qps;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeDomainRealTimeQpsDataResponseBodyDataQpsModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainRealTimeQpsDataResponseBodyDataQpsModel self = new DescribeDomainRealTimeQpsDataResponseBodyDataQpsModel();
            return TeaModel.build(map, self);
        }

        public DescribeDomainRealTimeQpsDataResponseBodyDataQpsModel setQps(Float qps) {
            this.qps = qps;
            return this;
        }
        public Float getQps() {
            return this.qps;
        }

        public DescribeDomainRealTimeQpsDataResponseBodyDataQpsModel setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeDomainRealTimeQpsDataResponseBodyData extends TeaModel {
        @NameInMap("QpsModel")
        public java.util.List<DescribeDomainRealTimeQpsDataResponseBodyDataQpsModel> qpsModel;

        public static DescribeDomainRealTimeQpsDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainRealTimeQpsDataResponseBodyData self = new DescribeDomainRealTimeQpsDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDomainRealTimeQpsDataResponseBodyData setQpsModel(java.util.List<DescribeDomainRealTimeQpsDataResponseBodyDataQpsModel> qpsModel) {
            this.qpsModel = qpsModel;
            return this;
        }
        public java.util.List<DescribeDomainRealTimeQpsDataResponseBodyDataQpsModel> getQpsModel() {
            return this.qpsModel;
        }

    }

}
