// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainRealTimeBpsDataResponseBody extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("DataInterval")
    public String dataInterval;

    @NameInMap("RealTimeBpsDataPerInterval")
    public DescribeLiveDomainRealTimeBpsDataResponseBodyRealTimeBpsDataPerInterval realTimeBpsDataPerInterval;

    public static DescribeLiveDomainRealTimeBpsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainRealTimeBpsDataResponseBody self = new DescribeLiveDomainRealTimeBpsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainRealTimeBpsDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveDomainRealTimeBpsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDomainRealTimeBpsDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveDomainRealTimeBpsDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeLiveDomainRealTimeBpsDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeLiveDomainRealTimeBpsDataResponseBody setRealTimeBpsDataPerInterval(DescribeLiveDomainRealTimeBpsDataResponseBodyRealTimeBpsDataPerInterval realTimeBpsDataPerInterval) {
        this.realTimeBpsDataPerInterval = realTimeBpsDataPerInterval;
        return this;
    }
    public DescribeLiveDomainRealTimeBpsDataResponseBodyRealTimeBpsDataPerInterval getRealTimeBpsDataPerInterval() {
        return this.realTimeBpsDataPerInterval;
    }

    public static class DescribeLiveDomainRealTimeBpsDataResponseBodyRealTimeBpsDataPerIntervalDataModule extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeLiveDomainRealTimeBpsDataResponseBodyRealTimeBpsDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainRealTimeBpsDataResponseBodyRealTimeBpsDataPerIntervalDataModule self = new DescribeLiveDomainRealTimeBpsDataResponseBodyRealTimeBpsDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainRealTimeBpsDataResponseBodyRealTimeBpsDataPerIntervalDataModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeLiveDomainRealTimeBpsDataResponseBodyRealTimeBpsDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeLiveDomainRealTimeBpsDataResponseBodyRealTimeBpsDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeLiveDomainRealTimeBpsDataResponseBodyRealTimeBpsDataPerIntervalDataModule> dataModule;

        public static DescribeLiveDomainRealTimeBpsDataResponseBodyRealTimeBpsDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainRealTimeBpsDataResponseBodyRealTimeBpsDataPerInterval self = new DescribeLiveDomainRealTimeBpsDataResponseBodyRealTimeBpsDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainRealTimeBpsDataResponseBodyRealTimeBpsDataPerInterval setDataModule(java.util.List<DescribeLiveDomainRealTimeBpsDataResponseBodyRealTimeBpsDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeLiveDomainRealTimeBpsDataResponseBodyRealTimeBpsDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
