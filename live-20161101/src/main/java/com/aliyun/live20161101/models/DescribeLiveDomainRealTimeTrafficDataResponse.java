// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainRealTimeTrafficDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("DataInterval")
    @Validation(required = true)
    public String dataInterval;

    @NameInMap("RealTimeTrafficDataPerInterval")
    @Validation(required = true)
    public DescribeLiveDomainRealTimeTrafficDataResponseRealTimeTrafficDataPerInterval realTimeTrafficDataPerInterval;

    public static DescribeLiveDomainRealTimeTrafficDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainRealTimeTrafficDataResponse self = new DescribeLiveDomainRealTimeTrafficDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainRealTimeTrafficDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDomainRealTimeTrafficDataResponse setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveDomainRealTimeTrafficDataResponse setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeLiveDomainRealTimeTrafficDataResponse setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveDomainRealTimeTrafficDataResponse setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeLiveDomainRealTimeTrafficDataResponse setRealTimeTrafficDataPerInterval(DescribeLiveDomainRealTimeTrafficDataResponseRealTimeTrafficDataPerInterval realTimeTrafficDataPerInterval) {
        this.realTimeTrafficDataPerInterval = realTimeTrafficDataPerInterval;
        return this;
    }
    public DescribeLiveDomainRealTimeTrafficDataResponseRealTimeTrafficDataPerInterval getRealTimeTrafficDataPerInterval() {
        return this.realTimeTrafficDataPerInterval;
    }

    public static class DescribeLiveDomainRealTimeTrafficDataResponseRealTimeTrafficDataPerIntervalDataModule extends TeaModel {
        @NameInMap("TimeStamp")
        @Validation(required = true)
        public String timeStamp;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static DescribeLiveDomainRealTimeTrafficDataResponseRealTimeTrafficDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainRealTimeTrafficDataResponseRealTimeTrafficDataPerIntervalDataModule self = new DescribeLiveDomainRealTimeTrafficDataResponseRealTimeTrafficDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainRealTimeTrafficDataResponseRealTimeTrafficDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeLiveDomainRealTimeTrafficDataResponseRealTimeTrafficDataPerIntervalDataModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeLiveDomainRealTimeTrafficDataResponseRealTimeTrafficDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        @Validation(required = true)
        public java.util.List<DescribeLiveDomainRealTimeTrafficDataResponseRealTimeTrafficDataPerIntervalDataModule> dataModule;

        public static DescribeLiveDomainRealTimeTrafficDataResponseRealTimeTrafficDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainRealTimeTrafficDataResponseRealTimeTrafficDataPerInterval self = new DescribeLiveDomainRealTimeTrafficDataResponseRealTimeTrafficDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainRealTimeTrafficDataResponseRealTimeTrafficDataPerInterval setDataModule(java.util.List<DescribeLiveDomainRealTimeTrafficDataResponseRealTimeTrafficDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeLiveDomainRealTimeTrafficDataResponseRealTimeTrafficDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
