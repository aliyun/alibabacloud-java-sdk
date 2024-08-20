// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainWebsocketTrafficDataResponseBody extends TeaModel {
    /**
     * <p>The time interval between the data entries returned. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("DataInterval")
    public String dataInterval;

    /**
     * <p>The accelerated domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range during which data was queried.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-12-10T21:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B955107D-E658-4E77-B913-E0AC3D31693E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The start of the time range during which data was queried.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-12-10T20:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The network traffic returned at each time interval. Unit: bytes.</p>
     */
    @NameInMap("TrafficDataPerInterval")
    public DescribeDcdnDomainWebsocketTrafficDataResponseBodyTrafficDataPerInterval trafficDataPerInterval;

    public static DescribeDcdnDomainWebsocketTrafficDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainWebsocketTrafficDataResponseBody self = new DescribeDcdnDomainWebsocketTrafficDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainWebsocketTrafficDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDcdnDomainWebsocketTrafficDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnDomainWebsocketTrafficDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnDomainWebsocketTrafficDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnDomainWebsocketTrafficDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDcdnDomainWebsocketTrafficDataResponseBody setTrafficDataPerInterval(DescribeDcdnDomainWebsocketTrafficDataResponseBodyTrafficDataPerInterval trafficDataPerInterval) {
        this.trafficDataPerInterval = trafficDataPerInterval;
        return this;
    }
    public DescribeDcdnDomainWebsocketTrafficDataResponseBodyTrafficDataPerInterval getTrafficDataPerInterval() {
        return this.trafficDataPerInterval;
    }

    public static class DescribeDcdnDomainWebsocketTrafficDataResponseBodyTrafficDataPerIntervalDataModule extends TeaModel {
        /**
         * <p>The timestamp of the returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-10T20:00:00Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <p>The total volume of traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>423304182</p>
         */
        @NameInMap("WebsocketTraffic")
        public Float websocketTraffic;

        public static DescribeDcdnDomainWebsocketTrafficDataResponseBodyTrafficDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainWebsocketTrafficDataResponseBodyTrafficDataPerIntervalDataModule self = new DescribeDcdnDomainWebsocketTrafficDataResponseBodyTrafficDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainWebsocketTrafficDataResponseBodyTrafficDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDcdnDomainWebsocketTrafficDataResponseBodyTrafficDataPerIntervalDataModule setWebsocketTraffic(Float websocketTraffic) {
            this.websocketTraffic = websocketTraffic;
            return this;
        }
        public Float getWebsocketTraffic() {
            return this.websocketTraffic;
        }

    }

    public static class DescribeDcdnDomainWebsocketTrafficDataResponseBodyTrafficDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeDcdnDomainWebsocketTrafficDataResponseBodyTrafficDataPerIntervalDataModule> dataModule;

        public static DescribeDcdnDomainWebsocketTrafficDataResponseBodyTrafficDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainWebsocketTrafficDataResponseBodyTrafficDataPerInterval self = new DescribeDcdnDomainWebsocketTrafficDataResponseBodyTrafficDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainWebsocketTrafficDataResponseBodyTrafficDataPerInterval setDataModule(java.util.List<DescribeDcdnDomainWebsocketTrafficDataResponseBodyTrafficDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeDcdnDomainWebsocketTrafficDataResponseBodyTrafficDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
