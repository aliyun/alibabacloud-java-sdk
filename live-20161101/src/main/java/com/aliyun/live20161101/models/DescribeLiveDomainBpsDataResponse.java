// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainBpsDataResponse extends TeaModel {
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
    public DescribeLiveDomainBpsDataResponseBpsDataPerInterval bpsDataPerInterval;

    public static DescribeLiveDomainBpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainBpsDataResponse self = new DescribeLiveDomainBpsDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainBpsDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDomainBpsDataResponse setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveDomainBpsDataResponse setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeLiveDomainBpsDataResponse setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveDomainBpsDataResponse setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeLiveDomainBpsDataResponse setBpsDataPerInterval(DescribeLiveDomainBpsDataResponseBpsDataPerInterval bpsDataPerInterval) {
        this.bpsDataPerInterval = bpsDataPerInterval;
        return this;
    }
    public DescribeLiveDomainBpsDataResponseBpsDataPerInterval getBpsDataPerInterval() {
        return this.bpsDataPerInterval;
    }

    public static class DescribeLiveDomainBpsDataResponseBpsDataPerIntervalDataModule extends TeaModel {
        @NameInMap("TimeStamp")
        @Validation(required = true)
        public String timeStamp;

        @NameInMap("BpsValue")
        @Validation(required = true)
        public String bpsValue;

        @NameInMap("HttpBpsValue")
        @Validation(required = true)
        public String httpBpsValue;

        @NameInMap("HttpsBpsValue")
        @Validation(required = true)
        public String httpsBpsValue;

        public static DescribeLiveDomainBpsDataResponseBpsDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainBpsDataResponseBpsDataPerIntervalDataModule self = new DescribeLiveDomainBpsDataResponseBpsDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainBpsDataResponseBpsDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeLiveDomainBpsDataResponseBpsDataPerIntervalDataModule setBpsValue(String bpsValue) {
            this.bpsValue = bpsValue;
            return this;
        }
        public String getBpsValue() {
            return this.bpsValue;
        }

        public DescribeLiveDomainBpsDataResponseBpsDataPerIntervalDataModule setHttpBpsValue(String httpBpsValue) {
            this.httpBpsValue = httpBpsValue;
            return this;
        }
        public String getHttpBpsValue() {
            return this.httpBpsValue;
        }

        public DescribeLiveDomainBpsDataResponseBpsDataPerIntervalDataModule setHttpsBpsValue(String httpsBpsValue) {
            this.httpsBpsValue = httpsBpsValue;
            return this;
        }
        public String getHttpsBpsValue() {
            return this.httpsBpsValue;
        }

    }

    public static class DescribeLiveDomainBpsDataResponseBpsDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        @Validation(required = true)
        public java.util.List<DescribeLiveDomainBpsDataResponseBpsDataPerIntervalDataModule> dataModule;

        public static DescribeLiveDomainBpsDataResponseBpsDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainBpsDataResponseBpsDataPerInterval self = new DescribeLiveDomainBpsDataResponseBpsDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainBpsDataResponseBpsDataPerInterval setDataModule(java.util.List<DescribeLiveDomainBpsDataResponseBpsDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeLiveDomainBpsDataResponseBpsDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
