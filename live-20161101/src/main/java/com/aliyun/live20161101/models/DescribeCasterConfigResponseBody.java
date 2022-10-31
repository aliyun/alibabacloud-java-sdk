// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterConfigResponseBody extends TeaModel {
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    @NameInMap("CasterId")
    public String casterId;

    @NameInMap("CasterName")
    public String casterName;

    @NameInMap("ChannelEnable")
    public Integer channelEnable;

    @NameInMap("Delay")
    public Float delay;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("ProgramEffect")
    public Integer programEffect;

    @NameInMap("ProgramName")
    public String programName;

    @NameInMap("RecordConfig")
    public DescribeCasterConfigResponseBodyRecordConfig recordConfig;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SideOutputUrl")
    public String sideOutputUrl;

    @NameInMap("SideOutputUrlList")
    public String sideOutputUrlList;

    @NameInMap("SyncGroupsConfig")
    public DescribeCasterConfigResponseBodySyncGroupsConfig syncGroupsConfig;

    @NameInMap("TranscodeConfig")
    public DescribeCasterConfigResponseBodyTranscodeConfig transcodeConfig;

    @NameInMap("UrgentLiveStreamUrl")
    public String urgentLiveStreamUrl;

    @NameInMap("UrgentMaterialId")
    public String urgentMaterialId;

    public static DescribeCasterConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterConfigResponseBody self = new DescribeCasterConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCasterConfigResponseBody setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public DescribeCasterConfigResponseBody setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public DescribeCasterConfigResponseBody setCasterName(String casterName) {
        this.casterName = casterName;
        return this;
    }
    public String getCasterName() {
        return this.casterName;
    }

    public DescribeCasterConfigResponseBody setChannelEnable(Integer channelEnable) {
        this.channelEnable = channelEnable;
        return this;
    }
    public Integer getChannelEnable() {
        return this.channelEnable;
    }

    public DescribeCasterConfigResponseBody setDelay(Float delay) {
        this.delay = delay;
        return this;
    }
    public Float getDelay() {
        return this.delay;
    }

    public DescribeCasterConfigResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeCasterConfigResponseBody setProgramEffect(Integer programEffect) {
        this.programEffect = programEffect;
        return this;
    }
    public Integer getProgramEffect() {
        return this.programEffect;
    }

    public DescribeCasterConfigResponseBody setProgramName(String programName) {
        this.programName = programName;
        return this;
    }
    public String getProgramName() {
        return this.programName;
    }

    public DescribeCasterConfigResponseBody setRecordConfig(DescribeCasterConfigResponseBodyRecordConfig recordConfig) {
        this.recordConfig = recordConfig;
        return this;
    }
    public DescribeCasterConfigResponseBodyRecordConfig getRecordConfig() {
        return this.recordConfig;
    }

    public DescribeCasterConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCasterConfigResponseBody setSideOutputUrl(String sideOutputUrl) {
        this.sideOutputUrl = sideOutputUrl;
        return this;
    }
    public String getSideOutputUrl() {
        return this.sideOutputUrl;
    }

    public DescribeCasterConfigResponseBody setSideOutputUrlList(String sideOutputUrlList) {
        this.sideOutputUrlList = sideOutputUrlList;
        return this;
    }
    public String getSideOutputUrlList() {
        return this.sideOutputUrlList;
    }

    public DescribeCasterConfigResponseBody setSyncGroupsConfig(DescribeCasterConfigResponseBodySyncGroupsConfig syncGroupsConfig) {
        this.syncGroupsConfig = syncGroupsConfig;
        return this;
    }
    public DescribeCasterConfigResponseBodySyncGroupsConfig getSyncGroupsConfig() {
        return this.syncGroupsConfig;
    }

    public DescribeCasterConfigResponseBody setTranscodeConfig(DescribeCasterConfigResponseBodyTranscodeConfig transcodeConfig) {
        this.transcodeConfig = transcodeConfig;
        return this;
    }
    public DescribeCasterConfigResponseBodyTranscodeConfig getTranscodeConfig() {
        return this.transcodeConfig;
    }

    public DescribeCasterConfigResponseBody setUrgentLiveStreamUrl(String urgentLiveStreamUrl) {
        this.urgentLiveStreamUrl = urgentLiveStreamUrl;
        return this;
    }
    public String getUrgentLiveStreamUrl() {
        return this.urgentLiveStreamUrl;
    }

    public DescribeCasterConfigResponseBody setUrgentMaterialId(String urgentMaterialId) {
        this.urgentMaterialId = urgentMaterialId;
        return this;
    }
    public String getUrgentMaterialId() {
        return this.urgentMaterialId;
    }

    public static class DescribeCasterConfigResponseBodyRecordConfigRecordFormatRecordFormat extends TeaModel {
        @NameInMap("CycleDuration")
        public Integer cycleDuration;

        @NameInMap("Format")
        public String format;

        @NameInMap("OssObjectPrefix")
        public String ossObjectPrefix;

        @NameInMap("SliceOssObjectPrefix")
        public String sliceOssObjectPrefix;

        public static DescribeCasterConfigResponseBodyRecordConfigRecordFormatRecordFormat build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterConfigResponseBodyRecordConfigRecordFormatRecordFormat self = new DescribeCasterConfigResponseBodyRecordConfigRecordFormatRecordFormat();
            return TeaModel.build(map, self);
        }

        public DescribeCasterConfigResponseBodyRecordConfigRecordFormatRecordFormat setCycleDuration(Integer cycleDuration) {
            this.cycleDuration = cycleDuration;
            return this;
        }
        public Integer getCycleDuration() {
            return this.cycleDuration;
        }

        public DescribeCasterConfigResponseBodyRecordConfigRecordFormatRecordFormat setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public DescribeCasterConfigResponseBodyRecordConfigRecordFormatRecordFormat setOssObjectPrefix(String ossObjectPrefix) {
            this.ossObjectPrefix = ossObjectPrefix;
            return this;
        }
        public String getOssObjectPrefix() {
            return this.ossObjectPrefix;
        }

        public DescribeCasterConfigResponseBodyRecordConfigRecordFormatRecordFormat setSliceOssObjectPrefix(String sliceOssObjectPrefix) {
            this.sliceOssObjectPrefix = sliceOssObjectPrefix;
            return this;
        }
        public String getSliceOssObjectPrefix() {
            return this.sliceOssObjectPrefix;
        }

    }

    public static class DescribeCasterConfigResponseBodyRecordConfigRecordFormat extends TeaModel {
        @NameInMap("RecordFormat")
        public java.util.List<DescribeCasterConfigResponseBodyRecordConfigRecordFormatRecordFormat> recordFormat;

        public static DescribeCasterConfigResponseBodyRecordConfigRecordFormat build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterConfigResponseBodyRecordConfigRecordFormat self = new DescribeCasterConfigResponseBodyRecordConfigRecordFormat();
            return TeaModel.build(map, self);
        }

        public DescribeCasterConfigResponseBodyRecordConfigRecordFormat setRecordFormat(java.util.List<DescribeCasterConfigResponseBodyRecordConfigRecordFormatRecordFormat> recordFormat) {
            this.recordFormat = recordFormat;
            return this;
        }
        public java.util.List<DescribeCasterConfigResponseBodyRecordConfigRecordFormatRecordFormat> getRecordFormat() {
            return this.recordFormat;
        }

    }

    public static class DescribeCasterConfigResponseBodyRecordConfig extends TeaModel {
        @NameInMap("OssBucket")
        public String ossBucket;

        @NameInMap("OssEndpoint")
        public String ossEndpoint;

        @NameInMap("RecordFormat")
        public DescribeCasterConfigResponseBodyRecordConfigRecordFormat recordFormat;

        public static DescribeCasterConfigResponseBodyRecordConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterConfigResponseBodyRecordConfig self = new DescribeCasterConfigResponseBodyRecordConfig();
            return TeaModel.build(map, self);
        }

        public DescribeCasterConfigResponseBodyRecordConfig setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public DescribeCasterConfigResponseBodyRecordConfig setOssEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

        public DescribeCasterConfigResponseBodyRecordConfig setRecordFormat(DescribeCasterConfigResponseBodyRecordConfigRecordFormat recordFormat) {
            this.recordFormat = recordFormat;
            return this;
        }
        public DescribeCasterConfigResponseBodyRecordConfigRecordFormat getRecordFormat() {
            return this.recordFormat;
        }

    }

    public static class DescribeCasterConfigResponseBodySyncGroupsConfigSyncGroupResourceIds extends TeaModel {
        @NameInMap("ResourceId")
        public java.util.List<String> resourceId;

        public static DescribeCasterConfigResponseBodySyncGroupsConfigSyncGroupResourceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterConfigResponseBodySyncGroupsConfigSyncGroupResourceIds self = new DescribeCasterConfigResponseBodySyncGroupsConfigSyncGroupResourceIds();
            return TeaModel.build(map, self);
        }

        public DescribeCasterConfigResponseBodySyncGroupsConfigSyncGroupResourceIds setResourceId(java.util.List<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public java.util.List<String> getResourceId() {
            return this.resourceId;
        }

    }

    public static class DescribeCasterConfigResponseBodySyncGroupsConfigSyncGroup extends TeaModel {
        @NameInMap("HostResourceId")
        public String hostResourceId;

        @NameInMap("Mode")
        public Integer mode;

        @NameInMap("ResourceIds")
        public DescribeCasterConfigResponseBodySyncGroupsConfigSyncGroupResourceIds resourceIds;

        public static DescribeCasterConfigResponseBodySyncGroupsConfigSyncGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterConfigResponseBodySyncGroupsConfigSyncGroup self = new DescribeCasterConfigResponseBodySyncGroupsConfigSyncGroup();
            return TeaModel.build(map, self);
        }

        public DescribeCasterConfigResponseBodySyncGroupsConfigSyncGroup setHostResourceId(String hostResourceId) {
            this.hostResourceId = hostResourceId;
            return this;
        }
        public String getHostResourceId() {
            return this.hostResourceId;
        }

        public DescribeCasterConfigResponseBodySyncGroupsConfigSyncGroup setMode(Integer mode) {
            this.mode = mode;
            return this;
        }
        public Integer getMode() {
            return this.mode;
        }

        public DescribeCasterConfigResponseBodySyncGroupsConfigSyncGroup setResourceIds(DescribeCasterConfigResponseBodySyncGroupsConfigSyncGroupResourceIds resourceIds) {
            this.resourceIds = resourceIds;
            return this;
        }
        public DescribeCasterConfigResponseBodySyncGroupsConfigSyncGroupResourceIds getResourceIds() {
            return this.resourceIds;
        }

    }

    public static class DescribeCasterConfigResponseBodySyncGroupsConfig extends TeaModel {
        @NameInMap("SyncGroup")
        public java.util.List<DescribeCasterConfigResponseBodySyncGroupsConfigSyncGroup> syncGroup;

        public static DescribeCasterConfigResponseBodySyncGroupsConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterConfigResponseBodySyncGroupsConfig self = new DescribeCasterConfigResponseBodySyncGroupsConfig();
            return TeaModel.build(map, self);
        }

        public DescribeCasterConfigResponseBodySyncGroupsConfig setSyncGroup(java.util.List<DescribeCasterConfigResponseBodySyncGroupsConfigSyncGroup> syncGroup) {
            this.syncGroup = syncGroup;
            return this;
        }
        public java.util.List<DescribeCasterConfigResponseBodySyncGroupsConfigSyncGroup> getSyncGroup() {
            return this.syncGroup;
        }

    }

    public static class DescribeCasterConfigResponseBodyTranscodeConfigLiveTemplateIds extends TeaModel {
        @NameInMap("LocationId")
        public java.util.List<String> locationId;

        public static DescribeCasterConfigResponseBodyTranscodeConfigLiveTemplateIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterConfigResponseBodyTranscodeConfigLiveTemplateIds self = new DescribeCasterConfigResponseBodyTranscodeConfigLiveTemplateIds();
            return TeaModel.build(map, self);
        }

        public DescribeCasterConfigResponseBodyTranscodeConfigLiveTemplateIds setLocationId(java.util.List<String> locationId) {
            this.locationId = locationId;
            return this;
        }
        public java.util.List<String> getLocationId() {
            return this.locationId;
        }

    }

    public static class DescribeCasterConfigResponseBodyTranscodeConfig extends TeaModel {
        @NameInMap("CasterTemplate")
        public String casterTemplate;

        @NameInMap("LiveTemplateIds")
        public DescribeCasterConfigResponseBodyTranscodeConfigLiveTemplateIds liveTemplateIds;

        public static DescribeCasterConfigResponseBodyTranscodeConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterConfigResponseBodyTranscodeConfig self = new DescribeCasterConfigResponseBodyTranscodeConfig();
            return TeaModel.build(map, self);
        }

        public DescribeCasterConfigResponseBodyTranscodeConfig setCasterTemplate(String casterTemplate) {
            this.casterTemplate = casterTemplate;
            return this;
        }
        public String getCasterTemplate() {
            return this.casterTemplate;
        }

        public DescribeCasterConfigResponseBodyTranscodeConfig setLiveTemplateIds(DescribeCasterConfigResponseBodyTranscodeConfigLiveTemplateIds liveTemplateIds) {
            this.liveTemplateIds = liveTemplateIds;
            return this;
        }
        public DescribeCasterConfigResponseBodyTranscodeConfigLiveTemplateIds getLiveTemplateIds() {
            return this.liveTemplateIds;
        }

    }

}
