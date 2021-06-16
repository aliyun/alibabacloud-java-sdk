// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainSrcQpsDataResponseBody extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("DataInterval")
    public String dataInterval;

    @NameInMap("SrcQpsDataPerInterval")
    public DescribeDomainSrcQpsDataResponseBodySrcQpsDataPerInterval srcQpsDataPerInterval;

    public static DescribeDomainSrcQpsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainSrcQpsDataResponseBody self = new DescribeDomainSrcQpsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainSrcQpsDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainSrcQpsDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDomainSrcQpsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainSrcQpsDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainSrcQpsDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDomainSrcQpsDataResponseBody setSrcQpsDataPerInterval(DescribeDomainSrcQpsDataResponseBodySrcQpsDataPerInterval srcQpsDataPerInterval) {
        this.srcQpsDataPerInterval = srcQpsDataPerInterval;
        return this;
    }
    public DescribeDomainSrcQpsDataResponseBodySrcQpsDataPerInterval getSrcQpsDataPerInterval() {
        return this.srcQpsDataPerInterval;
    }

    public static class DescribeDomainSrcQpsDataResponseBodySrcQpsDataPerIntervalDataModule extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeDomainSrcQpsDataResponseBodySrcQpsDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainSrcQpsDataResponseBodySrcQpsDataPerIntervalDataModule self = new DescribeDomainSrcQpsDataResponseBodySrcQpsDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDomainSrcQpsDataResponseBodySrcQpsDataPerIntervalDataModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeDomainSrcQpsDataResponseBodySrcQpsDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeDomainSrcQpsDataResponseBodySrcQpsDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeDomainSrcQpsDataResponseBodySrcQpsDataPerIntervalDataModule> dataModule;

        public static DescribeDomainSrcQpsDataResponseBodySrcQpsDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainSrcQpsDataResponseBodySrcQpsDataPerInterval self = new DescribeDomainSrcQpsDataResponseBodySrcQpsDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDomainSrcQpsDataResponseBodySrcQpsDataPerInterval setDataModule(java.util.List<DescribeDomainSrcQpsDataResponseBodySrcQpsDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeDomainSrcQpsDataResponseBodySrcQpsDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
