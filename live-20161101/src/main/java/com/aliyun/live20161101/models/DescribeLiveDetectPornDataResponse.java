// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDetectPornDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DetectPornData")
    @Validation(required = true)
    public DescribeLiveDetectPornDataResponseDetectPornData detectPornData;

    public static DescribeLiveDetectPornDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDetectPornDataResponse self = new DescribeLiveDetectPornDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDetectPornDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDetectPornDataResponse setDetectPornData(DescribeLiveDetectPornDataResponseDetectPornData detectPornData) {
        this.detectPornData = detectPornData;
        return this;
    }
    public DescribeLiveDetectPornDataResponseDetectPornData getDetectPornData() {
        return this.detectPornData;
    }

    public static class DescribeLiveDetectPornDataResponseDetectPornDataDataModule extends TeaModel {
        @NameInMap("TimeStamp")
        @Validation(required = true)
        public String timeStamp;

        @NameInMap("App")
        @Validation(required = true)
        public String app;

        @NameInMap("Domain")
        @Validation(required = true)
        public String domain;

        @NameInMap("Stream")
        @Validation(required = true)
        public String stream;

        @NameInMap("Fee")
        @Validation(required = true)
        public String fee;

        @NameInMap("Scene")
        @Validation(required = true)
        public String scene;

        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        @NameInMap("Count")
        @Validation(required = true)
        public Long count;

        public static DescribeLiveDetectPornDataResponseDetectPornDataDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDetectPornDataResponseDetectPornDataDataModule self = new DescribeLiveDetectPornDataResponseDetectPornDataDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDetectPornDataResponseDetectPornDataDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeLiveDetectPornDataResponseDetectPornDataDataModule setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public DescribeLiveDetectPornDataResponseDetectPornDataDataModule setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeLiveDetectPornDataResponseDetectPornDataDataModule setStream(String stream) {
            this.stream = stream;
            return this;
        }
        public String getStream() {
            return this.stream;
        }

        public DescribeLiveDetectPornDataResponseDetectPornDataDataModule setFee(String fee) {
            this.fee = fee;
            return this;
        }
        public String getFee() {
            return this.fee;
        }

        public DescribeLiveDetectPornDataResponseDetectPornDataDataModule setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public DescribeLiveDetectPornDataResponseDetectPornDataDataModule setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeLiveDetectPornDataResponseDetectPornDataDataModule setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

    }

    public static class DescribeLiveDetectPornDataResponseDetectPornData extends TeaModel {
        @NameInMap("DataModule")
        @Validation(required = true)
        public java.util.List<DescribeLiveDetectPornDataResponseDetectPornDataDataModule> dataModule;

        public static DescribeLiveDetectPornDataResponseDetectPornData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDetectPornDataResponseDetectPornData self = new DescribeLiveDetectPornDataResponseDetectPornData();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDetectPornDataResponseDetectPornData setDataModule(java.util.List<DescribeLiveDetectPornDataResponseDetectPornDataDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeLiveDetectPornDataResponseDetectPornDataDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
