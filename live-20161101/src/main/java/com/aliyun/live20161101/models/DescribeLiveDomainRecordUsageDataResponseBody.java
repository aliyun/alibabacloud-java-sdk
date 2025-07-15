// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainRecordUsageDataResponseBody extends TeaModel {
    /**
     * <p>The end of the time range during which data was queried.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-05-10T21:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The recording data that was collected for each interval.</p>
     */
    @NameInMap("RecordUsageData")
    public DescribeLiveDomainRecordUsageDataResponseBodyRecordUsageData recordUsageData;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4B460F8B-993C-4F48-B98A-910811DEBFEB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The beginning of the time range during which data was queried.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-05-10T20:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeLiveDomainRecordUsageDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainRecordUsageDataResponseBody self = new DescribeLiveDomainRecordUsageDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainRecordUsageDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveDomainRecordUsageDataResponseBody setRecordUsageData(DescribeLiveDomainRecordUsageDataResponseBodyRecordUsageData recordUsageData) {
        this.recordUsageData = recordUsageData;
        return this;
    }
    public DescribeLiveDomainRecordUsageDataResponseBodyRecordUsageData getRecordUsageData() {
        return this.recordUsageData;
    }

    public DescribeLiveDomainRecordUsageDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDomainRecordUsageDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeLiveDomainRecordUsageDataResponseBodyRecordUsageDataDataModule extends TeaModel {
        /**
         * <p>The number of peak channels.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The main streaming domain. This parameter is returned if the value of the request parameter SplitBy contains <code>domain</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The recording length. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3560</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The time when recording started.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-10T20:00:00Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <p>The recording file type. This parameter is returned if the value of the request parameter SplitBy contains <code>record_fmt</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>MP4</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeLiveDomainRecordUsageDataResponseBodyRecordUsageDataDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainRecordUsageDataResponseBodyRecordUsageDataDataModule self = new DescribeLiveDomainRecordUsageDataResponseBodyRecordUsageDataDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainRecordUsageDataResponseBodyRecordUsageDataDataModule setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeLiveDomainRecordUsageDataResponseBodyRecordUsageDataDataModule setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeLiveDomainRecordUsageDataResponseBodyRecordUsageDataDataModule setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribeLiveDomainRecordUsageDataResponseBodyRecordUsageDataDataModule setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeLiveDomainRecordUsageDataResponseBodyRecordUsageDataDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeLiveDomainRecordUsageDataResponseBodyRecordUsageDataDataModule setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeLiveDomainRecordUsageDataResponseBodyRecordUsageData extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeLiveDomainRecordUsageDataResponseBodyRecordUsageDataDataModule> dataModule;

        public static DescribeLiveDomainRecordUsageDataResponseBodyRecordUsageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainRecordUsageDataResponseBodyRecordUsageData self = new DescribeLiveDomainRecordUsageDataResponseBodyRecordUsageData();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainRecordUsageDataResponseBodyRecordUsageData setDataModule(java.util.List<DescribeLiveDomainRecordUsageDataResponseBodyRecordUsageDataDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeLiveDomainRecordUsageDataResponseBodyRecordUsageDataDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
