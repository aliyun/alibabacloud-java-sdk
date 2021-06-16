// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainHttpCodeDataByLayerResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    public String dataInterval;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpCodeDataInterval")
    public DescribeDomainHttpCodeDataByLayerResponseBodyHttpCodeDataInterval httpCodeDataInterval;

    public static DescribeDomainHttpCodeDataByLayerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainHttpCodeDataByLayerResponseBody self = new DescribeDomainHttpCodeDataByLayerResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainHttpCodeDataByLayerResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDomainHttpCodeDataByLayerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainHttpCodeDataByLayerResponseBody setHttpCodeDataInterval(DescribeDomainHttpCodeDataByLayerResponseBodyHttpCodeDataInterval httpCodeDataInterval) {
        this.httpCodeDataInterval = httpCodeDataInterval;
        return this;
    }
    public DescribeDomainHttpCodeDataByLayerResponseBodyHttpCodeDataInterval getHttpCodeDataInterval() {
        return this.httpCodeDataInterval;
    }

    public static class DescribeDomainHttpCodeDataByLayerResponseBodyHttpCodeDataIntervalDataModule extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("TotalValue")
        public String totalValue;

        public static DescribeDomainHttpCodeDataByLayerResponseBodyHttpCodeDataIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainHttpCodeDataByLayerResponseBodyHttpCodeDataIntervalDataModule self = new DescribeDomainHttpCodeDataByLayerResponseBodyHttpCodeDataIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDomainHttpCodeDataByLayerResponseBodyHttpCodeDataIntervalDataModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeDomainHttpCodeDataByLayerResponseBodyHttpCodeDataIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDomainHttpCodeDataByLayerResponseBodyHttpCodeDataIntervalDataModule setTotalValue(String totalValue) {
            this.totalValue = totalValue;
            return this;
        }
        public String getTotalValue() {
            return this.totalValue;
        }

    }

    public static class DescribeDomainHttpCodeDataByLayerResponseBodyHttpCodeDataInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeDomainHttpCodeDataByLayerResponseBodyHttpCodeDataIntervalDataModule> dataModule;

        public static DescribeDomainHttpCodeDataByLayerResponseBodyHttpCodeDataInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainHttpCodeDataByLayerResponseBodyHttpCodeDataInterval self = new DescribeDomainHttpCodeDataByLayerResponseBodyHttpCodeDataInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDomainHttpCodeDataByLayerResponseBodyHttpCodeDataInterval setDataModule(java.util.List<DescribeDomainHttpCodeDataByLayerResponseBodyHttpCodeDataIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeDomainHttpCodeDataByLayerResponseBodyHttpCodeDataIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
