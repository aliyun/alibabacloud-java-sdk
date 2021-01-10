// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainRealTimeTrafficDataResponseBody extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("RealTimeTrafficDataPerInterval")
    public DescribeLiveDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerInterval realTimeTrafficDataPerInterval;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("DataInterval")
    public String dataInterval;

    public static DescribeLiveDomainRealTimeTrafficDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainRealTimeTrafficDataResponseBody self = new DescribeLiveDomainRealTimeTrafficDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainRealTimeTrafficDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveDomainRealTimeTrafficDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDomainRealTimeTrafficDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveDomainRealTimeTrafficDataResponseBody setRealTimeTrafficDataPerInterval(DescribeLiveDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerInterval realTimeTrafficDataPerInterval) {
        this.realTimeTrafficDataPerInterval = realTimeTrafficDataPerInterval;
        return this;
    }
    public DescribeLiveDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerInterval getRealTimeTrafficDataPerInterval() {
        return this.realTimeTrafficDataPerInterval;
    }

    public DescribeLiveDomainRealTimeTrafficDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeLiveDomainRealTimeTrafficDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public static class DescribeLiveDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerIntervalDataModule extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeLiveDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerIntervalDataModule self = new DescribeLiveDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerIntervalDataModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeLiveDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeLiveDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeLiveDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerIntervalDataModule> dataModule;

        public static DescribeLiveDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerInterval self = new DescribeLiveDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerInterval setDataModule(java.util.List<DescribeLiveDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeLiveDomainRealTimeTrafficDataResponseBodyRealTimeTrafficDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
