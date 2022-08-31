// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainHttpCodeDataByLayerResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    public String dataInterval;

    @NameInMap("HttpCodeDataInterval")
    public DescribeDcdnDomainHttpCodeDataByLayerResponseBodyHttpCodeDataInterval httpCodeDataInterval;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnDomainHttpCodeDataByLayerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainHttpCodeDataByLayerResponseBody self = new DescribeDcdnDomainHttpCodeDataByLayerResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainHttpCodeDataByLayerResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDcdnDomainHttpCodeDataByLayerResponseBody setHttpCodeDataInterval(DescribeDcdnDomainHttpCodeDataByLayerResponseBodyHttpCodeDataInterval httpCodeDataInterval) {
        this.httpCodeDataInterval = httpCodeDataInterval;
        return this;
    }
    public DescribeDcdnDomainHttpCodeDataByLayerResponseBodyHttpCodeDataInterval getHttpCodeDataInterval() {
        return this.httpCodeDataInterval;
    }

    public DescribeDcdnDomainHttpCodeDataByLayerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDcdnDomainHttpCodeDataByLayerResponseBodyHttpCodeDataIntervalDataModule extends TeaModel {
        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("TotalValue")
        public String totalValue;

        @NameInMap("Value")
        public java.util.Map<String, ?> value;

        public static DescribeDcdnDomainHttpCodeDataByLayerResponseBodyHttpCodeDataIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainHttpCodeDataByLayerResponseBodyHttpCodeDataIntervalDataModule self = new DescribeDcdnDomainHttpCodeDataByLayerResponseBodyHttpCodeDataIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainHttpCodeDataByLayerResponseBodyHttpCodeDataIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDcdnDomainHttpCodeDataByLayerResponseBodyHttpCodeDataIntervalDataModule setTotalValue(String totalValue) {
            this.totalValue = totalValue;
            return this;
        }
        public String getTotalValue() {
            return this.totalValue;
        }

        public DescribeDcdnDomainHttpCodeDataByLayerResponseBodyHttpCodeDataIntervalDataModule setValue(java.util.Map<String, ?> value) {
            this.value = value;
            return this;
        }
        public java.util.Map<String, ?> getValue() {
            return this.value;
        }

    }

    public static class DescribeDcdnDomainHttpCodeDataByLayerResponseBodyHttpCodeDataInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeDcdnDomainHttpCodeDataByLayerResponseBodyHttpCodeDataIntervalDataModule> dataModule;

        public static DescribeDcdnDomainHttpCodeDataByLayerResponseBodyHttpCodeDataInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainHttpCodeDataByLayerResponseBodyHttpCodeDataInterval self = new DescribeDcdnDomainHttpCodeDataByLayerResponseBodyHttpCodeDataInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainHttpCodeDataByLayerResponseBodyHttpCodeDataInterval setDataModule(java.util.List<DescribeDcdnDomainHttpCodeDataByLayerResponseBodyHttpCodeDataIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeDcdnDomainHttpCodeDataByLayerResponseBodyHttpCodeDataIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
