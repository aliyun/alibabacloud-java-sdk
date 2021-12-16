// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainHttpCodeDataResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    public String dataInterval;

    @NameInMap("DataPerInterval")
    public DescribeDcdnDomainHttpCodeDataResponseBodyDataPerInterval dataPerInterval;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDcdnDomainHttpCodeDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainHttpCodeDataResponseBody self = new DescribeDcdnDomainHttpCodeDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainHttpCodeDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDcdnDomainHttpCodeDataResponseBody setDataPerInterval(DescribeDcdnDomainHttpCodeDataResponseBodyDataPerInterval dataPerInterval) {
        this.dataPerInterval = dataPerInterval;
        return this;
    }
    public DescribeDcdnDomainHttpCodeDataResponseBodyDataPerInterval getDataPerInterval() {
        return this.dataPerInterval;
    }

    public DescribeDcdnDomainHttpCodeDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnDomainHttpCodeDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnDomainHttpCodeDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnDomainHttpCodeDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeDcdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModuleHttpCodeDataPerIntervalHttpCodeDataModule extends TeaModel {
        @NameInMap("Code")
        public Integer code;

        @NameInMap("Count")
        public Float count;

        @NameInMap("Proportion")
        public Float proportion;

        public static DescribeDcdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModuleHttpCodeDataPerIntervalHttpCodeDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModuleHttpCodeDataPerIntervalHttpCodeDataModule self = new DescribeDcdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModuleHttpCodeDataPerIntervalHttpCodeDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModuleHttpCodeDataPerIntervalHttpCodeDataModule setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public DescribeDcdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModuleHttpCodeDataPerIntervalHttpCodeDataModule setCount(Float count) {
            this.count = count;
            return this;
        }
        public Float getCount() {
            return this.count;
        }

        public DescribeDcdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModuleHttpCodeDataPerIntervalHttpCodeDataModule setProportion(Float proportion) {
            this.proportion = proportion;
            return this;
        }
        public Float getProportion() {
            return this.proportion;
        }

    }

    public static class DescribeDcdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModuleHttpCodeDataPerInterval extends TeaModel {
        @NameInMap("HttpCodeDataModule")
        public java.util.List<DescribeDcdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModuleHttpCodeDataPerIntervalHttpCodeDataModule> httpCodeDataModule;

        public static DescribeDcdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModuleHttpCodeDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModuleHttpCodeDataPerInterval self = new DescribeDcdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModuleHttpCodeDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModuleHttpCodeDataPerInterval setHttpCodeDataModule(java.util.List<DescribeDcdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModuleHttpCodeDataPerIntervalHttpCodeDataModule> httpCodeDataModule) {
            this.httpCodeDataModule = httpCodeDataModule;
            return this;
        }
        public java.util.List<DescribeDcdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModuleHttpCodeDataPerIntervalHttpCodeDataModule> getHttpCodeDataModule() {
            return this.httpCodeDataModule;
        }

    }

    public static class DescribeDcdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModule extends TeaModel {
        @NameInMap("HttpCodeDataPerInterval")
        public DescribeDcdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModuleHttpCodeDataPerInterval httpCodeDataPerInterval;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeDcdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModule self = new DescribeDcdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModule setHttpCodeDataPerInterval(DescribeDcdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModuleHttpCodeDataPerInterval httpCodeDataPerInterval) {
            this.httpCodeDataPerInterval = httpCodeDataPerInterval;
            return this;
        }
        public DescribeDcdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModuleHttpCodeDataPerInterval getHttpCodeDataPerInterval() {
            return this.httpCodeDataPerInterval;
        }

        public DescribeDcdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeDcdnDomainHttpCodeDataResponseBodyDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeDcdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModule> dataModule;

        public static DescribeDcdnDomainHttpCodeDataResponseBodyDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainHttpCodeDataResponseBodyDataPerInterval self = new DescribeDcdnDomainHttpCodeDataResponseBodyDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainHttpCodeDataResponseBodyDataPerInterval setDataModule(java.util.List<DescribeDcdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeDcdnDomainHttpCodeDataResponseBodyDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
