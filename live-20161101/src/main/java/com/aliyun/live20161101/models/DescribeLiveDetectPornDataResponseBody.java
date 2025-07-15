// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDetectPornDataResponseBody extends TeaModel {
    /**
     * <p>The bandwidth data returned at each interval.</p>
     */
    @NameInMap("DetectPornData")
    public DescribeLiveDetectPornDataResponseBodyDetectPornData detectPornData;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B955107D-E658-4E77-B913-E0AC3D31693E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLiveDetectPornDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDetectPornDataResponseBody self = new DescribeLiveDetectPornDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDetectPornDataResponseBody setDetectPornData(DescribeLiveDetectPornDataResponseBodyDetectPornData detectPornData) {
        this.detectPornData = detectPornData;
        return this;
    }
    public DescribeLiveDetectPornDataResponseBodyDetectPornData getDetectPornData() {
        return this.detectPornData;
    }

    public DescribeLiveDetectPornDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLiveDetectPornDataResponseBodyDetectPornDataDataModule extends TeaModel {
        /**
         * <p>The name of the application to which the live stream belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>liveApp****</p>
         */
        @NameInMap("App")
        public String app;

        /**
         * <p>The number of reviewed images.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The main streaming domain.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>Indicates whether a quota of free image scanning is available. Valid values:</p>
         * <ul>
         * <li><strong>free</strong></li>
         * <li><strong>charge</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>free</p>
         */
        @NameInMap("Fee")
        public String fee;

        /**
         * <p>The region in which the domain name resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The moderation scenario. Valid values:</p>
         * <ul>
         * <li><strong>porn</strong> (default): pornography</li>
         * <li><strong>terrorism</strong>: terrorism or politically sensitive content</li>
         * <li><strong>ad</strong>: ad violation</li>
         * <li><strong>live</strong>: undesirable scene</li>
         * <li><strong>logo</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>porn</p>
         */
        @NameInMap("Scene")
        public String scene;

        /**
         * <p>The name of the live stream.</p>
         * 
         * <strong>example:</strong>
         * <p>liveStream****</p>
         */
        @NameInMap("Stream")
        public String stream;

        /**
         * <p>The timestamp of the data returned. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-10T15:00:05Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeLiveDetectPornDataResponseBodyDetectPornDataDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDetectPornDataResponseBodyDetectPornDataDataModule self = new DescribeLiveDetectPornDataResponseBodyDetectPornDataDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDetectPornDataResponseBodyDetectPornDataDataModule setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public DescribeLiveDetectPornDataResponseBodyDetectPornDataDataModule setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeLiveDetectPornDataResponseBodyDetectPornDataDataModule setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeLiveDetectPornDataResponseBodyDetectPornDataDataModule setFee(String fee) {
            this.fee = fee;
            return this;
        }
        public String getFee() {
            return this.fee;
        }

        public DescribeLiveDetectPornDataResponseBodyDetectPornDataDataModule setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeLiveDetectPornDataResponseBodyDetectPornDataDataModule setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
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
