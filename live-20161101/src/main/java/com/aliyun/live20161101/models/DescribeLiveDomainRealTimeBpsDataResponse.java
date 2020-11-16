// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainRealTimeBpsDataResponse extends TeaModel {
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

    @NameInMap("RealTimeBpsDataPerInterval")
    @Validation(required = true)
    public DescribeLiveDomainRealTimeBpsDataResponseRealTimeBpsDataPerInterval realTimeBpsDataPerInterval;

    public static DescribeLiveDomainRealTimeBpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainRealTimeBpsDataResponse self = new DescribeLiveDomainRealTimeBpsDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainRealTimeBpsDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDomainRealTimeBpsDataResponse setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveDomainRealTimeBpsDataResponse setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeLiveDomainRealTimeBpsDataResponse setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveDomainRealTimeBpsDataResponse setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeLiveDomainRealTimeBpsDataResponse setRealTimeBpsDataPerInterval(DescribeLiveDomainRealTimeBpsDataResponseRealTimeBpsDataPerInterval realTimeBpsDataPerInterval) {
        this.realTimeBpsDataPerInterval = realTimeBpsDataPerInterval;
        return this;
    }
    public DescribeLiveDomainRealTimeBpsDataResponseRealTimeBpsDataPerInterval getRealTimeBpsDataPerInterval() {
        return this.realTimeBpsDataPerInterval;
    }

    public static class DescribeLiveDomainRealTimeBpsDataResponseRealTimeBpsDataPerIntervalDataModule extends TeaModel {
        @NameInMap("TimeStamp")
        @Validation(required = true)
        public String timeStamp;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static DescribeLiveDomainRealTimeBpsDataResponseRealTimeBpsDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainRealTimeBpsDataResponseRealTimeBpsDataPerIntervalDataModule self = new DescribeLiveDomainRealTimeBpsDataResponseRealTimeBpsDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainRealTimeBpsDataResponseRealTimeBpsDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeLiveDomainRealTimeBpsDataResponseRealTimeBpsDataPerIntervalDataModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeLiveDomainRealTimeBpsDataResponseRealTimeBpsDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        @Validation(required = true)
        public java.util.List<DescribeLiveDomainRealTimeBpsDataResponseRealTimeBpsDataPerIntervalDataModule> dataModule;

        public static DescribeLiveDomainRealTimeBpsDataResponseRealTimeBpsDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainRealTimeBpsDataResponseRealTimeBpsDataPerInterval self = new DescribeLiveDomainRealTimeBpsDataResponseRealTimeBpsDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainRealTimeBpsDataResponseRealTimeBpsDataPerInterval setDataModule(java.util.List<DescribeLiveDomainRealTimeBpsDataResponseRealTimeBpsDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeLiveDomainRealTimeBpsDataResponseRealTimeBpsDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
