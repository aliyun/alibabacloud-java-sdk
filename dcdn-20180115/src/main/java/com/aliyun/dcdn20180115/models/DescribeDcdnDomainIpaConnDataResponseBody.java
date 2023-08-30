// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainIpaConnDataResponseBody extends TeaModel {
    /**
     * <p>The number of user connections at each time interval.</p>
     */
    @NameInMap("ConnectionDataPerInterval")
    public DescribeDcdnDomainIpaConnDataResponseBodyConnectionDataPerInterval connectionDataPerInterval;

    /**
     * <p>The end of the time range during which data was queried.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The beginning of the time range during which data was queried.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDcdnDomainIpaConnDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainIpaConnDataResponseBody self = new DescribeDcdnDomainIpaConnDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainIpaConnDataResponseBody setConnectionDataPerInterval(DescribeDcdnDomainIpaConnDataResponseBodyConnectionDataPerInterval connectionDataPerInterval) {
        this.connectionDataPerInterval = connectionDataPerInterval;
        return this;
    }
    public DescribeDcdnDomainIpaConnDataResponseBodyConnectionDataPerInterval getConnectionDataPerInterval() {
        return this.connectionDataPerInterval;
    }

    public DescribeDcdnDomainIpaConnDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnDomainIpaConnDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnDomainIpaConnDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeDcdnDomainIpaConnDataResponseBodyConnectionDataPerIntervalDataModule extends TeaModel {
        /**
         * <p>The number of IPA user connections.</p>
         */
        @NameInMap("Connections")
        public Long connections;

        /**
         * <p>The accelerated domain name.</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The timestamp of the data returned.</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeDcdnDomainIpaConnDataResponseBodyConnectionDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainIpaConnDataResponseBodyConnectionDataPerIntervalDataModule self = new DescribeDcdnDomainIpaConnDataResponseBodyConnectionDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainIpaConnDataResponseBodyConnectionDataPerIntervalDataModule setConnections(Long connections) {
            this.connections = connections;
            return this;
        }
        public Long getConnections() {
            return this.connections;
        }

        public DescribeDcdnDomainIpaConnDataResponseBodyConnectionDataPerIntervalDataModule setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeDcdnDomainIpaConnDataResponseBodyConnectionDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeDcdnDomainIpaConnDataResponseBodyConnectionDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeDcdnDomainIpaConnDataResponseBodyConnectionDataPerIntervalDataModule> dataModule;

        public static DescribeDcdnDomainIpaConnDataResponseBodyConnectionDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainIpaConnDataResponseBodyConnectionDataPerInterval self = new DescribeDcdnDomainIpaConnDataResponseBodyConnectionDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainIpaConnDataResponseBodyConnectionDataPerInterval setDataModule(java.util.List<DescribeDcdnDomainIpaConnDataResponseBodyConnectionDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeDcdnDomainIpaConnDataResponseBodyConnectionDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
