// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20141111.models;

import com.aliyun.tea.*;

public class DescribeDomainSrcFlowDataResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    public String dataInterval;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SrcFlowDataPerInterval")
    public DescribeDomainSrcFlowDataResponseBodySrcFlowDataPerInterval srcFlowDataPerInterval;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDomainSrcFlowDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainSrcFlowDataResponseBody self = new DescribeDomainSrcFlowDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainSrcFlowDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDomainSrcFlowDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainSrcFlowDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainSrcFlowDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainSrcFlowDataResponseBody setSrcFlowDataPerInterval(DescribeDomainSrcFlowDataResponseBodySrcFlowDataPerInterval srcFlowDataPerInterval) {
        this.srcFlowDataPerInterval = srcFlowDataPerInterval;
        return this;
    }
    public DescribeDomainSrcFlowDataResponseBodySrcFlowDataPerInterval getSrcFlowDataPerInterval() {
        return this.srcFlowDataPerInterval;
    }

    public DescribeDomainSrcFlowDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeDomainSrcFlowDataResponseBodySrcFlowDataPerIntervalDataModule extends TeaModel {
        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("Value")
        public String value;

        public static DescribeDomainSrcFlowDataResponseBodySrcFlowDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainSrcFlowDataResponseBodySrcFlowDataPerIntervalDataModule self = new DescribeDomainSrcFlowDataResponseBodySrcFlowDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDomainSrcFlowDataResponseBodySrcFlowDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDomainSrcFlowDataResponseBodySrcFlowDataPerIntervalDataModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDomainSrcFlowDataResponseBodySrcFlowDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeDomainSrcFlowDataResponseBodySrcFlowDataPerIntervalDataModule> dataModule;

        public static DescribeDomainSrcFlowDataResponseBodySrcFlowDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainSrcFlowDataResponseBodySrcFlowDataPerInterval self = new DescribeDomainSrcFlowDataResponseBodySrcFlowDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDomainSrcFlowDataResponseBodySrcFlowDataPerInterval setDataModule(java.util.List<DescribeDomainSrcFlowDataResponseBodySrcFlowDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeDomainSrcFlowDataResponseBodySrcFlowDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
