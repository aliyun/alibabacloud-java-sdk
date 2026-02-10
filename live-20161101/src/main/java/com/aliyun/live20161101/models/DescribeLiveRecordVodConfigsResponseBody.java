// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveRecordVodConfigsResponseBody extends TeaModel {
    @NameInMap("LiveRecordVodConfigs")
    public DescribeLiveRecordVodConfigsResponseBodyLiveRecordVodConfigs liveRecordVodConfigs;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5056369B-D337-499E-B8B7-B761BD37B08A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Total")
    public String total;

    public static DescribeLiveRecordVodConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveRecordVodConfigsResponseBody self = new DescribeLiveRecordVodConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveRecordVodConfigsResponseBody setLiveRecordVodConfigs(DescribeLiveRecordVodConfigsResponseBodyLiveRecordVodConfigs liveRecordVodConfigs) {
        this.liveRecordVodConfigs = liveRecordVodConfigs;
        return this;
    }
    public DescribeLiveRecordVodConfigsResponseBodyLiveRecordVodConfigs getLiveRecordVodConfigs() {
        return this.liveRecordVodConfigs;
    }

    public DescribeLiveRecordVodConfigsResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeLiveRecordVodConfigsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLiveRecordVodConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveRecordVodConfigsResponseBody setTotal(String total) {
        this.total = total;
        return this;
    }
    public String getTotal() {
        return this.total;
    }

    public static class DescribeLiveRecordVodConfigsResponseBodyLiveRecordVodConfigsLiveRecordVodConfig extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("AutoCompose")
        public String autoCompose;

        @NameInMap("ComposeVodTranscodeGroupId")
        public String composeVodTranscodeGroupId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CycleDuration")
        public Integer cycleDuration;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("OnDemand")
        public Integer onDemand;

        @NameInMap("StorageLocation")
        public String storageLocation;

        @NameInMap("StreamName")
        public String streamName;

        @NameInMap("VodTranscodeGroupId")
        public String vodTranscodeGroupId;

        public static DescribeLiveRecordVodConfigsResponseBodyLiveRecordVodConfigsLiveRecordVodConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveRecordVodConfigsResponseBodyLiveRecordVodConfigsLiveRecordVodConfig self = new DescribeLiveRecordVodConfigsResponseBodyLiveRecordVodConfigsLiveRecordVodConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLiveRecordVodConfigsResponseBodyLiveRecordVodConfigsLiveRecordVodConfig setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeLiveRecordVodConfigsResponseBodyLiveRecordVodConfigsLiveRecordVodConfig setAutoCompose(String autoCompose) {
            this.autoCompose = autoCompose;
            return this;
        }
        public String getAutoCompose() {
            return this.autoCompose;
        }

        public DescribeLiveRecordVodConfigsResponseBodyLiveRecordVodConfigsLiveRecordVodConfig setComposeVodTranscodeGroupId(String composeVodTranscodeGroupId) {
            this.composeVodTranscodeGroupId = composeVodTranscodeGroupId;
            return this;
        }
        public String getComposeVodTranscodeGroupId() {
            return this.composeVodTranscodeGroupId;
        }

        public DescribeLiveRecordVodConfigsResponseBodyLiveRecordVodConfigsLiveRecordVodConfig setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeLiveRecordVodConfigsResponseBodyLiveRecordVodConfigsLiveRecordVodConfig setCycleDuration(Integer cycleDuration) {
            this.cycleDuration = cycleDuration;
            return this;
        }
        public Integer getCycleDuration() {
            return this.cycleDuration;
        }

        public DescribeLiveRecordVodConfigsResponseBodyLiveRecordVodConfigsLiveRecordVodConfig setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveRecordVodConfigsResponseBodyLiveRecordVodConfigsLiveRecordVodConfig setOnDemand(Integer onDemand) {
            this.onDemand = onDemand;
            return this;
        }
        public Integer getOnDemand() {
            return this.onDemand;
        }

        public DescribeLiveRecordVodConfigsResponseBodyLiveRecordVodConfigsLiveRecordVodConfig setStorageLocation(String storageLocation) {
            this.storageLocation = storageLocation;
            return this;
        }
        public String getStorageLocation() {
            return this.storageLocation;
        }

        public DescribeLiveRecordVodConfigsResponseBodyLiveRecordVodConfigsLiveRecordVodConfig setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public DescribeLiveRecordVodConfigsResponseBodyLiveRecordVodConfigsLiveRecordVodConfig setVodTranscodeGroupId(String vodTranscodeGroupId) {
            this.vodTranscodeGroupId = vodTranscodeGroupId;
            return this;
        }
        public String getVodTranscodeGroupId() {
            return this.vodTranscodeGroupId;
        }

    }

    public static class DescribeLiveRecordVodConfigsResponseBodyLiveRecordVodConfigs extends TeaModel {
        @NameInMap("LiveRecordVodConfig")
        public java.util.List<DescribeLiveRecordVodConfigsResponseBodyLiveRecordVodConfigsLiveRecordVodConfig> liveRecordVodConfig;

        public static DescribeLiveRecordVodConfigsResponseBodyLiveRecordVodConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveRecordVodConfigsResponseBodyLiveRecordVodConfigs self = new DescribeLiveRecordVodConfigsResponseBodyLiveRecordVodConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeLiveRecordVodConfigsResponseBodyLiveRecordVodConfigs setLiveRecordVodConfig(java.util.List<DescribeLiveRecordVodConfigsResponseBodyLiveRecordVodConfigsLiveRecordVodConfig> liveRecordVodConfig) {
            this.liveRecordVodConfig = liveRecordVodConfig;
            return this;
        }
        public java.util.List<DescribeLiveRecordVodConfigsResponseBodyLiveRecordVodConfigsLiveRecordVodConfig> getLiveRecordVodConfig() {
            return this.liveRecordVodConfig;
        }

    }

}
