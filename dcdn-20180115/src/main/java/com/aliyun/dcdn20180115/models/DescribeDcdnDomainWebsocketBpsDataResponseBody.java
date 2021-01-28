// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainWebsocketBpsDataResponseBody extends TeaModel {
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

    @NameInMap("BpsDataPerInterval")
    public DescribeDcdnDomainWebsocketBpsDataResponseBodyBpsDataPerInterval bpsDataPerInterval;

    public static DescribeDcdnDomainWebsocketBpsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainWebsocketBpsDataResponseBody self = new DescribeDcdnDomainWebsocketBpsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainWebsocketBpsDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnDomainWebsocketBpsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnDomainWebsocketBpsDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnDomainWebsocketBpsDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDcdnDomainWebsocketBpsDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDcdnDomainWebsocketBpsDataResponseBody setBpsDataPerInterval(DescribeDcdnDomainWebsocketBpsDataResponseBodyBpsDataPerInterval bpsDataPerInterval) {
        this.bpsDataPerInterval = bpsDataPerInterval;
        return this;
    }
    public DescribeDcdnDomainWebsocketBpsDataResponseBodyBpsDataPerInterval getBpsDataPerInterval() {
        return this.bpsDataPerInterval;
    }

    public static class DescribeDcdnDomainWebsocketBpsDataResponseBodyBpsDataPerIntervalDataModule extends TeaModel {
        @NameInMap("WebsocketBps")
        public Float websocketBps;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeDcdnDomainWebsocketBpsDataResponseBodyBpsDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainWebsocketBpsDataResponseBodyBpsDataPerIntervalDataModule self = new DescribeDcdnDomainWebsocketBpsDataResponseBodyBpsDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainWebsocketBpsDataResponseBodyBpsDataPerIntervalDataModule setWebsocketBps(Float websocketBps) {
            this.websocketBps = websocketBps;
            return this;
        }
        public Float getWebsocketBps() {
            return this.websocketBps;
        }

        public DescribeDcdnDomainWebsocketBpsDataResponseBodyBpsDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeDcdnDomainWebsocketBpsDataResponseBodyBpsDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeDcdnDomainWebsocketBpsDataResponseBodyBpsDataPerIntervalDataModule> dataModule;

        public static DescribeDcdnDomainWebsocketBpsDataResponseBodyBpsDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainWebsocketBpsDataResponseBodyBpsDataPerInterval self = new DescribeDcdnDomainWebsocketBpsDataResponseBodyBpsDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainWebsocketBpsDataResponseBodyBpsDataPerInterval setDataModule(java.util.List<DescribeDcdnDomainWebsocketBpsDataResponseBodyBpsDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeDcdnDomainWebsocketBpsDataResponseBodyBpsDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
