// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainPushBpsDataResponse extends TeaModel {
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

    @NameInMap("BpsDataPerInterval")
    @Validation(required = true)
    public DescribeLiveDomainPushBpsDataResponseBpsDataPerInterval bpsDataPerInterval;

    public static DescribeLiveDomainPushBpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainPushBpsDataResponse self = new DescribeLiveDomainPushBpsDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainPushBpsDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDomainPushBpsDataResponse setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveDomainPushBpsDataResponse setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeLiveDomainPushBpsDataResponse setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveDomainPushBpsDataResponse setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeLiveDomainPushBpsDataResponse setBpsDataPerInterval(DescribeLiveDomainPushBpsDataResponseBpsDataPerInterval bpsDataPerInterval) {
        this.bpsDataPerInterval = bpsDataPerInterval;
        return this;
    }
    public DescribeLiveDomainPushBpsDataResponseBpsDataPerInterval getBpsDataPerInterval() {
        return this.bpsDataPerInterval;
    }

    public static class DescribeLiveDomainPushBpsDataResponseBpsDataPerIntervalDataModule extends TeaModel {
        @NameInMap("TimeStamp")
        @Validation(required = true)
        public String timeStamp;

        @NameInMap("BpsValue")
        @Validation(required = true)
        public String bpsValue;

        public static DescribeLiveDomainPushBpsDataResponseBpsDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainPushBpsDataResponseBpsDataPerIntervalDataModule self = new DescribeLiveDomainPushBpsDataResponseBpsDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainPushBpsDataResponseBpsDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeLiveDomainPushBpsDataResponseBpsDataPerIntervalDataModule setBpsValue(String bpsValue) {
            this.bpsValue = bpsValue;
            return this;
        }
        public String getBpsValue() {
            return this.bpsValue;
        }

    }

    public static class DescribeLiveDomainPushBpsDataResponseBpsDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        @Validation(required = true)
        public java.util.List<DescribeLiveDomainPushBpsDataResponseBpsDataPerIntervalDataModule> dataModule;

        public static DescribeLiveDomainPushBpsDataResponseBpsDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainPushBpsDataResponseBpsDataPerInterval self = new DescribeLiveDomainPushBpsDataResponseBpsDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainPushBpsDataResponseBpsDataPerInterval setDataModule(java.util.List<DescribeLiveDomainPushBpsDataResponseBpsDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeLiveDomainPushBpsDataResponseBpsDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
