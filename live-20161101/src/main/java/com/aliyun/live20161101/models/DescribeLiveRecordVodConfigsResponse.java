// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveRecordVodConfigsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNum")
    @Validation(required = true)
    public Integer pageNum;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Total")
    @Validation(required = true)
    public String total;

    @NameInMap("LiveRecordVodConfigs")
    @Validation(required = true)
    public DescribeLiveRecordVodConfigsResponseLiveRecordVodConfigs liveRecordVodConfigs;

    public static DescribeLiveRecordVodConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveRecordVodConfigsResponse self = new DescribeLiveRecordVodConfigsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveRecordVodConfigsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveRecordVodConfigsResponse setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeLiveRecordVodConfigsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLiveRecordVodConfigsResponse setTotal(String total) {
        this.total = total;
        return this;
    }
    public String getTotal() {
        return this.total;
    }

    public DescribeLiveRecordVodConfigsResponse setLiveRecordVodConfigs(DescribeLiveRecordVodConfigsResponseLiveRecordVodConfigs liveRecordVodConfigs) {
        this.liveRecordVodConfigs = liveRecordVodConfigs;
        return this;
    }
    public DescribeLiveRecordVodConfigsResponseLiveRecordVodConfigs getLiveRecordVodConfigs() {
        return this.liveRecordVodConfigs;
    }

    public static class DescribeLiveRecordVodConfigsResponseLiveRecordVodConfigsLiveRecordVodConfig extends TeaModel {
        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("AppName")
        @Validation(required = true)
        public String appName;

        @NameInMap("StreamName")
        @Validation(required = true)
        public String streamName;

        @NameInMap("VodTranscodeGroupId")
        @Validation(required = true)
        public String vodTranscodeGroupId;

        @NameInMap("CycleDuration")
        @Validation(required = true)
        public Integer cycleDuration;

        @NameInMap("AutoCompose")
        @Validation(required = true)
        public String autoCompose;

        @NameInMap("ComposeVodTranscodeGroupId")
        @Validation(required = true)
        public String composeVodTranscodeGroupId;

        public static DescribeLiveRecordVodConfigsResponseLiveRecordVodConfigsLiveRecordVodConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveRecordVodConfigsResponseLiveRecordVodConfigsLiveRecordVodConfig self = new DescribeLiveRecordVodConfigsResponseLiveRecordVodConfigsLiveRecordVodConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLiveRecordVodConfigsResponseLiveRecordVodConfigsLiveRecordVodConfig setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeLiveRecordVodConfigsResponseLiveRecordVodConfigsLiveRecordVodConfig setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveRecordVodConfigsResponseLiveRecordVodConfigsLiveRecordVodConfig setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeLiveRecordVodConfigsResponseLiveRecordVodConfigsLiveRecordVodConfig setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public DescribeLiveRecordVodConfigsResponseLiveRecordVodConfigsLiveRecordVodConfig setVodTranscodeGroupId(String vodTranscodeGroupId) {
            this.vodTranscodeGroupId = vodTranscodeGroupId;
            return this;
        }
        public String getVodTranscodeGroupId() {
            return this.vodTranscodeGroupId;
        }

        public DescribeLiveRecordVodConfigsResponseLiveRecordVodConfigsLiveRecordVodConfig setCycleDuration(Integer cycleDuration) {
            this.cycleDuration = cycleDuration;
            return this;
        }
        public Integer getCycleDuration() {
            return this.cycleDuration;
        }

        public DescribeLiveRecordVodConfigsResponseLiveRecordVodConfigsLiveRecordVodConfig setAutoCompose(String autoCompose) {
            this.autoCompose = autoCompose;
            return this;
        }
        public String getAutoCompose() {
            return this.autoCompose;
        }

        public DescribeLiveRecordVodConfigsResponseLiveRecordVodConfigsLiveRecordVodConfig setComposeVodTranscodeGroupId(String composeVodTranscodeGroupId) {
            this.composeVodTranscodeGroupId = composeVodTranscodeGroupId;
            return this;
        }
        public String getComposeVodTranscodeGroupId() {
            return this.composeVodTranscodeGroupId;
        }

    }

    public static class DescribeLiveRecordVodConfigsResponseLiveRecordVodConfigs extends TeaModel {
        @NameInMap("LiveRecordVodConfig")
        @Validation(required = true)
        public java.util.List<DescribeLiveRecordVodConfigsResponseLiveRecordVodConfigsLiveRecordVodConfig> liveRecordVodConfig;

        public static DescribeLiveRecordVodConfigsResponseLiveRecordVodConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveRecordVodConfigsResponseLiveRecordVodConfigs self = new DescribeLiveRecordVodConfigsResponseLiveRecordVodConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeLiveRecordVodConfigsResponseLiveRecordVodConfigs setLiveRecordVodConfig(java.util.List<DescribeLiveRecordVodConfigsResponseLiveRecordVodConfigsLiveRecordVodConfig> liveRecordVodConfig) {
            this.liveRecordVodConfig = liveRecordVodConfig;
            return this;
        }
        public java.util.List<DescribeLiveRecordVodConfigsResponseLiveRecordVodConfigsLiveRecordVodConfig> getLiveRecordVodConfig() {
            return this.liveRecordVodConfig;
        }

    }

}
