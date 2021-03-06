// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainQpsDataResponseBody extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("DataInterval")
    public String dataInterval;

    @NameInMap("QpsDataPerInterval")
    public DescribeDcdnDomainQpsDataResponseBodyQpsDataPerInterval qpsDataPerInterval;

    public static DescribeDcdnDomainQpsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainQpsDataResponseBody self = new DescribeDcdnDomainQpsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainQpsDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnDomainQpsDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDcdnDomainQpsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnDomainQpsDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnDomainQpsDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDcdnDomainQpsDataResponseBody setQpsDataPerInterval(DescribeDcdnDomainQpsDataResponseBodyQpsDataPerInterval qpsDataPerInterval) {
        this.qpsDataPerInterval = qpsDataPerInterval;
        return this;
    }
    public DescribeDcdnDomainQpsDataResponseBodyQpsDataPerInterval getQpsDataPerInterval() {
        return this.qpsDataPerInterval;
    }

    public static class DescribeDcdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule extends TeaModel {
        @NameInMap("DynamicHttpsAcc")
        public Float dynamicHttpsAcc;

        @NameInMap("DynamicHttpAcc")
        public Float dynamicHttpAcc;

        @NameInMap("Qps")
        public Float qps;

        @NameInMap("StaticHttpsAcc")
        public Float staticHttpsAcc;

        @NameInMap("StaticHttpQps")
        public Float staticHttpQps;

        @NameInMap("StaticHttpAcc")
        public Float staticHttpAcc;

        @NameInMap("DynamicHttpsQps")
        public Float dynamicHttpsQps;

        @NameInMap("Acc")
        public Float acc;

        @NameInMap("StaticHttpsQps")
        public Float staticHttpsQps;

        @NameInMap("DynamicHttpQps")
        public Float dynamicHttpQps;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeDcdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule self = new DescribeDcdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule setDynamicHttpsAcc(Float dynamicHttpsAcc) {
            this.dynamicHttpsAcc = dynamicHttpsAcc;
            return this;
        }
        public Float getDynamicHttpsAcc() {
            return this.dynamicHttpsAcc;
        }

        public DescribeDcdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule setDynamicHttpAcc(Float dynamicHttpAcc) {
            this.dynamicHttpAcc = dynamicHttpAcc;
            return this;
        }
        public Float getDynamicHttpAcc() {
            return this.dynamicHttpAcc;
        }

        public DescribeDcdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule setQps(Float qps) {
            this.qps = qps;
            return this;
        }
        public Float getQps() {
            return this.qps;
        }

        public DescribeDcdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule setStaticHttpsAcc(Float staticHttpsAcc) {
            this.staticHttpsAcc = staticHttpsAcc;
            return this;
        }
        public Float getStaticHttpsAcc() {
            return this.staticHttpsAcc;
        }

        public DescribeDcdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule setStaticHttpQps(Float staticHttpQps) {
            this.staticHttpQps = staticHttpQps;
            return this;
        }
        public Float getStaticHttpQps() {
            return this.staticHttpQps;
        }

        public DescribeDcdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule setStaticHttpAcc(Float staticHttpAcc) {
            this.staticHttpAcc = staticHttpAcc;
            return this;
        }
        public Float getStaticHttpAcc() {
            return this.staticHttpAcc;
        }

        public DescribeDcdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule setDynamicHttpsQps(Float dynamicHttpsQps) {
            this.dynamicHttpsQps = dynamicHttpsQps;
            return this;
        }
        public Float getDynamicHttpsQps() {
            return this.dynamicHttpsQps;
        }

        public DescribeDcdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule setAcc(Float acc) {
            this.acc = acc;
            return this;
        }
        public Float getAcc() {
            return this.acc;
        }

        public DescribeDcdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule setStaticHttpsQps(Float staticHttpsQps) {
            this.staticHttpsQps = staticHttpsQps;
            return this;
        }
        public Float getStaticHttpsQps() {
            return this.staticHttpsQps;
        }

        public DescribeDcdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule setDynamicHttpQps(Float dynamicHttpQps) {
            this.dynamicHttpQps = dynamicHttpQps;
            return this;
        }
        public Float getDynamicHttpQps() {
            return this.dynamicHttpQps;
        }

        public DescribeDcdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeDcdnDomainQpsDataResponseBodyQpsDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeDcdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule> dataModule;

        public static DescribeDcdnDomainQpsDataResponseBodyQpsDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainQpsDataResponseBodyQpsDataPerInterval self = new DescribeDcdnDomainQpsDataResponseBodyQpsDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainQpsDataResponseBodyQpsDataPerInterval setDataModule(java.util.List<DescribeDcdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeDcdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
