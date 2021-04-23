// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDetectPornDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DetectPornData")
    public DescribeLiveDetectPornDataResponseBodyDetectPornData detectPornData;

    public static DescribeLiveDetectPornDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDetectPornDataResponseBody self = new DescribeLiveDetectPornDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDetectPornDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDetectPornDataResponseBody setDetectPornData(DescribeLiveDetectPornDataResponseBodyDetectPornData detectPornData) {
        this.detectPornData = detectPornData;
        return this;
    }
    public DescribeLiveDetectPornDataResponseBodyDetectPornData getDetectPornData() {
        return this.detectPornData;
    }

    public static class DescribeLiveDetectPornDataResponseBodyDetectPornDataDataModule extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("Region")
        public String region;

        @NameInMap("App")
        public String app;

        @NameInMap("Stream")
        public String stream;

        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("Count")
        public Long count;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("Fee")
        public String fee;

        public static DescribeLiveDetectPornDataResponseBodyDetectPornDataDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDetectPornDataResponseBodyDetectPornDataDataModule self = new DescribeLiveDetectPornDataResponseBodyDetectPornDataDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDetectPornDataResponseBodyDetectPornDataDataModule setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeLiveDetectPornDataResponseBodyDetectPornDataDataModule setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeLiveDetectPornDataResponseBodyDetectPornDataDataModule setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public DescribeLiveDetectPornDataResponseBodyDetectPornDataDataModule setStream(String stream) {
            this.stream = stream;
            return this;
        }
        public String getStream() {
            return this.stream;
        }

        public DescribeLiveDetectPornDataResponseBodyDetectPornDataDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeLiveDetectPornDataResponseBodyDetectPornDataDataModule setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeLiveDetectPornDataResponseBodyDetectPornDataDataModule setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public DescribeLiveDetectPornDataResponseBodyDetectPornDataDataModule setFee(String fee) {
            this.fee = fee;
            return this;
        }
        public String getFee() {
            return this.fee;
        }

    }

    public static class DescribeLiveDetectPornDataResponseBodyDetectPornData extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeLiveDetectPornDataResponseBodyDetectPornDataDataModule> dataModule;

        public static DescribeLiveDetectPornDataResponseBodyDetectPornData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDetectPornDataResponseBodyDetectPornData self = new DescribeLiveDetectPornDataResponseBodyDetectPornData();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDetectPornDataResponseBodyDetectPornData setDataModule(java.util.List<DescribeLiveDetectPornDataResponseBodyDetectPornDataDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeLiveDetectPornDataResponseBodyDetectPornDataDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
