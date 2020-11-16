// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainPushTrafficDataResponse extends TeaModel {
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

    @NameInMap("TrafficDataPerInterval")
    @Validation(required = true)
    public DescribeLiveDomainPushTrafficDataResponseTrafficDataPerInterval trafficDataPerInterval;

    public static DescribeLiveDomainPushTrafficDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainPushTrafficDataResponse self = new DescribeLiveDomainPushTrafficDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainPushTrafficDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDomainPushTrafficDataResponse setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveDomainPushTrafficDataResponse setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeLiveDomainPushTrafficDataResponse setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveDomainPushTrafficDataResponse setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeLiveDomainPushTrafficDataResponse setTrafficDataPerInterval(DescribeLiveDomainPushTrafficDataResponseTrafficDataPerInterval trafficDataPerInterval) {
        this.trafficDataPerInterval = trafficDataPerInterval;
        return this;
    }
    public DescribeLiveDomainPushTrafficDataResponseTrafficDataPerInterval getTrafficDataPerInterval() {
        return this.trafficDataPerInterval;
    }

    public static class DescribeLiveDomainPushTrafficDataResponseTrafficDataPerIntervalDataModule extends TeaModel {
        @NameInMap("TimeStamp")
        @Validation(required = true)
        public String timeStamp;

        @NameInMap("TrafficValue")
        @Validation(required = true)
        public String trafficValue;

        public static DescribeLiveDomainPushTrafficDataResponseTrafficDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainPushTrafficDataResponseTrafficDataPerIntervalDataModule self = new DescribeLiveDomainPushTrafficDataResponseTrafficDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainPushTrafficDataResponseTrafficDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeLiveDomainPushTrafficDataResponseTrafficDataPerIntervalDataModule setTrafficValue(String trafficValue) {
            this.trafficValue = trafficValue;
            return this;
        }
        public String getTrafficValue() {
            return this.trafficValue;
        }

    }

    public static class DescribeLiveDomainPushTrafficDataResponseTrafficDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        @Validation(required = true)
        public java.util.List<DescribeLiveDomainPushTrafficDataResponseTrafficDataPerIntervalDataModule> dataModule;

        public static DescribeLiveDomainPushTrafficDataResponseTrafficDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainPushTrafficDataResponseTrafficDataPerInterval self = new DescribeLiveDomainPushTrafficDataResponseTrafficDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainPushTrafficDataResponseTrafficDataPerInterval setDataModule(java.util.List<DescribeLiveDomainPushTrafficDataResponseTrafficDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeLiveDomainPushTrafficDataResponseTrafficDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
