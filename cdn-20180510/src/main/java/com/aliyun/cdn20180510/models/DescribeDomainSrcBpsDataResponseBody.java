// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainSrcBpsDataResponseBody extends TeaModel {
    // The time interval between the data entries returned. Unit: seconds.
    @NameInMap("DataInterval")
    public String dataInterval;

    // The accelerated domain name.
    @NameInMap("DomainName")
    public String domainName;

    // The end of the time range that was queried.
    @NameInMap("EndTime")
    public String endTime;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The bandwidth value at each time interval. Unit: bit/s.
    @NameInMap("SrcBpsDataPerInterval")
    public DescribeDomainSrcBpsDataResponseBodySrcBpsDataPerInterval srcBpsDataPerInterval;

    // The beginning of the time range that was queried.
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDomainSrcBpsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainSrcBpsDataResponseBody self = new DescribeDomainSrcBpsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainSrcBpsDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDomainSrcBpsDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainSrcBpsDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainSrcBpsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainSrcBpsDataResponseBody setSrcBpsDataPerInterval(DescribeDomainSrcBpsDataResponseBodySrcBpsDataPerInterval srcBpsDataPerInterval) {
        this.srcBpsDataPerInterval = srcBpsDataPerInterval;
        return this;
    }
    public DescribeDomainSrcBpsDataResponseBodySrcBpsDataPerInterval getSrcBpsDataPerInterval() {
        return this.srcBpsDataPerInterval;
    }

    public DescribeDomainSrcBpsDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeDomainSrcBpsDataResponseBodySrcBpsDataPerIntervalDataModule extends TeaModel {
        // The bandwidth values of HTTPS requests.
        @NameInMap("HttpsValue")
        public String httpsValue;

        // The timestamp of the data returned.
        @NameInMap("TimeStamp")
        public String timeStamp;

        // The bandwidth value.
        @NameInMap("Value")
        public String value;

        public static DescribeDomainSrcBpsDataResponseBodySrcBpsDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainSrcBpsDataResponseBodySrcBpsDataPerIntervalDataModule self = new DescribeDomainSrcBpsDataResponseBodySrcBpsDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDomainSrcBpsDataResponseBodySrcBpsDataPerIntervalDataModule setHttpsValue(String httpsValue) {
            this.httpsValue = httpsValue;
            return this;
        }
        public String getHttpsValue() {
            return this.httpsValue;
        }

        public DescribeDomainSrcBpsDataResponseBodySrcBpsDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDomainSrcBpsDataResponseBodySrcBpsDataPerIntervalDataModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDomainSrcBpsDataResponseBodySrcBpsDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeDomainSrcBpsDataResponseBodySrcBpsDataPerIntervalDataModule> dataModule;

        public static DescribeDomainSrcBpsDataResponseBodySrcBpsDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainSrcBpsDataResponseBodySrcBpsDataPerInterval self = new DescribeDomainSrcBpsDataResponseBodySrcBpsDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDomainSrcBpsDataResponseBodySrcBpsDataPerInterval setDataModule(java.util.List<DescribeDomainSrcBpsDataResponseBodySrcBpsDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeDomainSrcBpsDataResponseBodySrcBpsDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
