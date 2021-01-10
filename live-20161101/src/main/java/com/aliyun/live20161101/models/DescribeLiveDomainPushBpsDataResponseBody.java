// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainPushBpsDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("DataInterval")
    public String dataInterval;

    @NameInMap("BpsDataPerInterval")
    public DescribeLiveDomainPushBpsDataResponseBodyBpsDataPerInterval bpsDataPerInterval;

    public static DescribeLiveDomainPushBpsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainPushBpsDataResponseBody self = new DescribeLiveDomainPushBpsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainPushBpsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDomainPushBpsDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveDomainPushBpsDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeLiveDomainPushBpsDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveDomainPushBpsDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeLiveDomainPushBpsDataResponseBody setBpsDataPerInterval(DescribeLiveDomainPushBpsDataResponseBodyBpsDataPerInterval bpsDataPerInterval) {
        this.bpsDataPerInterval = bpsDataPerInterval;
        return this;
    }
    public DescribeLiveDomainPushBpsDataResponseBodyBpsDataPerInterval getBpsDataPerInterval() {
        return this.bpsDataPerInterval;
    }

    public static class DescribeLiveDomainPushBpsDataResponseBodyBpsDataPerIntervalDataModule extends TeaModel {
        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("BpsValue")
        public String bpsValue;

        public static DescribeLiveDomainPushBpsDataResponseBodyBpsDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainPushBpsDataResponseBodyBpsDataPerIntervalDataModule self = new DescribeLiveDomainPushBpsDataResponseBodyBpsDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainPushBpsDataResponseBodyBpsDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeLiveDomainPushBpsDataResponseBodyBpsDataPerIntervalDataModule setBpsValue(String bpsValue) {
            this.bpsValue = bpsValue;
            return this;
        }
        public String getBpsValue() {
            return this.bpsValue;
        }

    }

    public static class DescribeLiveDomainPushBpsDataResponseBodyBpsDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeLiveDomainPushBpsDataResponseBodyBpsDataPerIntervalDataModule> dataModule;

        public static DescribeLiveDomainPushBpsDataResponseBodyBpsDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainPushBpsDataResponseBodyBpsDataPerInterval self = new DescribeLiveDomainPushBpsDataResponseBodyBpsDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainPushBpsDataResponseBodyBpsDataPerInterval setDataModule(java.util.List<DescribeLiveDomainPushBpsDataResponseBodyBpsDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeLiveDomainPushBpsDataResponseBodyBpsDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
