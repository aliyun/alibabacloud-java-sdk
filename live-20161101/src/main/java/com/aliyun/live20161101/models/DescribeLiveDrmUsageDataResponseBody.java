// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDrmUsageDataResponseBody extends TeaModel {
    /**
     * <p>The usage of the DRM encryption service at each time interval.</p>
     */
    @NameInMap("DrmUsageData")
    public DescribeLiveDrmUsageDataResponseBodyDrmUsageData drmUsageData;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>91FC2D9D-B042-4634-8A5C-7B8E7482C22D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLiveDrmUsageDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDrmUsageDataResponseBody self = new DescribeLiveDrmUsageDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDrmUsageDataResponseBody setDrmUsageData(DescribeLiveDrmUsageDataResponseBodyDrmUsageData drmUsageData) {
        this.drmUsageData = drmUsageData;
        return this;
    }
    public DescribeLiveDrmUsageDataResponseBodyDrmUsageData getDrmUsageData() {
        return this.drmUsageData;
    }

    public DescribeLiveDrmUsageDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLiveDrmUsageDataResponseBodyDrmUsageDataDataModule extends TeaModel {
        /**
         * <p>The number of times DRM-encrypted live streams are requested.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The domain name. If the value of SplitBy includes domain, the returned data is grouped by domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The DRM type. If the value of SplitBy includes drm_type, the returned data is grouped by DRM type.</p>
         * 
         * <strong>example:</strong>
         * <p>Widevine</p>
         */
        @NameInMap("DrmType")
        public String drmType;

        /**
         * <p>The ID of the region. If the value of SplitBy includes region, the returned data is grouped by region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The timestamp of the returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-01T16:00:00Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeLiveDrmUsageDataResponseBodyDrmUsageDataDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDrmUsageDataResponseBodyDrmUsageDataDataModule self = new DescribeLiveDrmUsageDataResponseBodyDrmUsageDataDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDrmUsageDataResponseBodyDrmUsageDataDataModule setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeLiveDrmUsageDataResponseBodyDrmUsageDataDataModule setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeLiveDrmUsageDataResponseBodyDrmUsageDataDataModule setDrmType(String drmType) {
            this.drmType = drmType;
            return this;
        }
        public String getDrmType() {
            return this.drmType;
        }

        public DescribeLiveDrmUsageDataResponseBodyDrmUsageDataDataModule setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeLiveDrmUsageDataResponseBodyDrmUsageDataDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeLiveDrmUsageDataResponseBodyDrmUsageData extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeLiveDrmUsageDataResponseBodyDrmUsageDataDataModule> dataModule;

        public static DescribeLiveDrmUsageDataResponseBodyDrmUsageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDrmUsageDataResponseBodyDrmUsageData self = new DescribeLiveDrmUsageDataResponseBodyDrmUsageData();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDrmUsageDataResponseBodyDrmUsageData setDataModule(java.util.List<DescribeLiveDrmUsageDataResponseBodyDrmUsageDataDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeLiveDrmUsageDataResponseBodyDrmUsageDataDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
