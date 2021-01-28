// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainWebsocketHttpCodeDataResponseBody extends TeaModel {
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

    @NameInMap("DataPerInterval")
    public DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyDataPerInterval dataPerInterval;

    public static DescribeDcdnDomainWebsocketHttpCodeDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainWebsocketHttpCodeDataResponseBody self = new DescribeDcdnDomainWebsocketHttpCodeDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainWebsocketHttpCodeDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnDomainWebsocketHttpCodeDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnDomainWebsocketHttpCodeDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnDomainWebsocketHttpCodeDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDcdnDomainWebsocketHttpCodeDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDcdnDomainWebsocketHttpCodeDataResponseBody setDataPerInterval(DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyDataPerInterval dataPerInterval) {
        this.dataPerInterval = dataPerInterval;
        return this;
    }
    public DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyDataPerInterval getDataPerInterval() {
        return this.dataPerInterval;
    }

    public static class DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyDataPerIntervalDataModuleWebsocketHttpCodeDataPerIntervalHttpCodeDataModule extends TeaModel {
        @NameInMap("Code")
        public Integer code;

        @NameInMap("Proportion")
        public Float proportion;

        @NameInMap("Count")
        public Float count;

        public static DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyDataPerIntervalDataModuleWebsocketHttpCodeDataPerIntervalHttpCodeDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyDataPerIntervalDataModuleWebsocketHttpCodeDataPerIntervalHttpCodeDataModule self = new DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyDataPerIntervalDataModuleWebsocketHttpCodeDataPerIntervalHttpCodeDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyDataPerIntervalDataModuleWebsocketHttpCodeDataPerIntervalHttpCodeDataModule setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyDataPerIntervalDataModuleWebsocketHttpCodeDataPerIntervalHttpCodeDataModule setProportion(Float proportion) {
            this.proportion = proportion;
            return this;
        }
        public Float getProportion() {
            return this.proportion;
        }

        public DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyDataPerIntervalDataModuleWebsocketHttpCodeDataPerIntervalHttpCodeDataModule setCount(Float count) {
            this.count = count;
            return this;
        }
        public Float getCount() {
            return this.count;
        }

    }

    public static class DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyDataPerIntervalDataModuleWebsocketHttpCodeDataPerInterval extends TeaModel {
        @NameInMap("HttpCodeDataModule")
        public java.util.List<DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyDataPerIntervalDataModuleWebsocketHttpCodeDataPerIntervalHttpCodeDataModule> httpCodeDataModule;

        public static DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyDataPerIntervalDataModuleWebsocketHttpCodeDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyDataPerIntervalDataModuleWebsocketHttpCodeDataPerInterval self = new DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyDataPerIntervalDataModuleWebsocketHttpCodeDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyDataPerIntervalDataModuleWebsocketHttpCodeDataPerInterval setHttpCodeDataModule(java.util.List<DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyDataPerIntervalDataModuleWebsocketHttpCodeDataPerIntervalHttpCodeDataModule> httpCodeDataModule) {
            this.httpCodeDataModule = httpCodeDataModule;
            return this;
        }
        public java.util.List<DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyDataPerIntervalDataModuleWebsocketHttpCodeDataPerIntervalHttpCodeDataModule> getHttpCodeDataModule() {
            return this.httpCodeDataModule;
        }

    }

    public static class DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyDataPerIntervalDataModule extends TeaModel {
        @NameInMap("WebsocketHttpCodeDataPerInterval")
        public DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyDataPerIntervalDataModuleWebsocketHttpCodeDataPerInterval websocketHttpCodeDataPerInterval;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyDataPerIntervalDataModule self = new DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyDataPerIntervalDataModule setWebsocketHttpCodeDataPerInterval(DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyDataPerIntervalDataModuleWebsocketHttpCodeDataPerInterval websocketHttpCodeDataPerInterval) {
            this.websocketHttpCodeDataPerInterval = websocketHttpCodeDataPerInterval;
            return this;
        }
        public DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyDataPerIntervalDataModuleWebsocketHttpCodeDataPerInterval getWebsocketHttpCodeDataPerInterval() {
            return this.websocketHttpCodeDataPerInterval;
        }

        public DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyDataPerIntervalDataModule> dataModule;

        public static DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyDataPerInterval self = new DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyDataPerInterval setDataModule(java.util.List<DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
