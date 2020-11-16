// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("CasterId")
    @Validation(required = true)
    public String casterId;

    @NameInMap("CasterName")
    @Validation(required = true)
    public String casterName;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("Delay")
    @Validation(required = true)
    public Float delay;

    @NameInMap("UrgentMaterialId")
    @Validation(required = true)
    public String urgentMaterialId;

    @NameInMap("SideOutputUrl")
    @Validation(required = true)
    public String sideOutputUrl;

    @NameInMap("CallbackUrl")
    @Validation(required = true)
    public String callbackUrl;

    @NameInMap("ProgramName")
    @Validation(required = true)
    public String programName;

    @NameInMap("ProgramEffect")
    @Validation(required = true)
    public Integer programEffect;

    @NameInMap("ChannelEnable")
    @Validation(required = true)
    public Integer channelEnable;

    @NameInMap("TranscodeConfig")
    @Validation(required = true)
    public DescribeCasterConfigResponseTranscodeConfig transcodeConfig;

    @NameInMap("RecordConfig")
    @Validation(required = true)
    public DescribeCasterConfigResponseRecordConfig recordConfig;

    public static DescribeCasterConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterConfigResponse self = new DescribeCasterConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCasterConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCasterConfigResponse setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public DescribeCasterConfigResponse setCasterName(String casterName) {
        this.casterName = casterName;
        return this;
    }
    public String getCasterName() {
        return this.casterName;
    }

    public DescribeCasterConfigResponse setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeCasterConfigResponse setDelay(Float delay) {
        this.delay = delay;
        return this;
    }
    public Float getDelay() {
        return this.delay;
    }

    public DescribeCasterConfigResponse setUrgentMaterialId(String urgentMaterialId) {
        this.urgentMaterialId = urgentMaterialId;
        return this;
    }
    public String getUrgentMaterialId() {
        return this.urgentMaterialId;
    }

    public DescribeCasterConfigResponse setSideOutputUrl(String sideOutputUrl) {
        this.sideOutputUrl = sideOutputUrl;
        return this;
    }
    public String getSideOutputUrl() {
        return this.sideOutputUrl;
    }

    public DescribeCasterConfigResponse setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public DescribeCasterConfigResponse setProgramName(String programName) {
        this.programName = programName;
        return this;
    }
    public String getProgramName() {
        return this.programName;
    }

    public DescribeCasterConfigResponse setProgramEffect(Integer programEffect) {
        this.programEffect = programEffect;
        return this;
    }
    public Integer getProgramEffect() {
        return this.programEffect;
    }

    public DescribeCasterConfigResponse setChannelEnable(Integer channelEnable) {
        this.channelEnable = channelEnable;
        return this;
    }
    public Integer getChannelEnable() {
        return this.channelEnable;
    }

    public DescribeCasterConfigResponse setTranscodeConfig(DescribeCasterConfigResponseTranscodeConfig transcodeConfig) {
        this.transcodeConfig = transcodeConfig;
        return this;
    }
    public DescribeCasterConfigResponseTranscodeConfig getTranscodeConfig() {
        return this.transcodeConfig;
    }

    public DescribeCasterConfigResponse setRecordConfig(DescribeCasterConfigResponseRecordConfig recordConfig) {
        this.recordConfig = recordConfig;
        return this;
    }
    public DescribeCasterConfigResponseRecordConfig getRecordConfig() {
        return this.recordConfig;
    }

    public static class DescribeCasterConfigResponseTranscodeConfigLiveTemplateIds extends TeaModel {
        // LocationId
        @NameInMap("LocationId")
        @Validation(required = true)
        public java.util.List<String> locationId;

        public static DescribeCasterConfigResponseTranscodeConfigLiveTemplateIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterConfigResponseTranscodeConfigLiveTemplateIds self = new DescribeCasterConfigResponseTranscodeConfigLiveTemplateIds();
            return TeaModel.build(map, self);
        }

        public DescribeCasterConfigResponseTranscodeConfigLiveTemplateIds setLocationId(java.util.List<String> locationId) {
            this.locationId = locationId;
            return this;
        }
        public java.util.List<String> getLocationId() {
            return this.locationId;
        }

    }

    public static class DescribeCasterConfigResponseTranscodeConfig extends TeaModel {
        @NameInMap("CasterTemplate")
        @Validation(required = true)
        public String casterTemplate;

        @NameInMap("LiveTemplateIds")
        @Validation(required = true)
        public DescribeCasterConfigResponseTranscodeConfigLiveTemplateIds liveTemplateIds;

        public static DescribeCasterConfigResponseTranscodeConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterConfigResponseTranscodeConfig self = new DescribeCasterConfigResponseTranscodeConfig();
            return TeaModel.build(map, self);
        }

        public DescribeCasterConfigResponseTranscodeConfig setCasterTemplate(String casterTemplate) {
            this.casterTemplate = casterTemplate;
            return this;
        }
        public String getCasterTemplate() {
            return this.casterTemplate;
        }

        public DescribeCasterConfigResponseTranscodeConfig setLiveTemplateIds(DescribeCasterConfigResponseTranscodeConfigLiveTemplateIds liveTemplateIds) {
            this.liveTemplateIds = liveTemplateIds;
            return this;
        }
        public DescribeCasterConfigResponseTranscodeConfigLiveTemplateIds getLiveTemplateIds() {
            return this.liveTemplateIds;
        }

    }

    public static class DescribeCasterConfigResponseRecordConfigRecordFormatRecordFormat extends TeaModel {
        @NameInMap("Format")
        @Validation(required = true)
        public String format;

        @NameInMap("OssObjectPrefix")
        @Validation(required = true)
        public String ossObjectPrefix;

        @NameInMap("SliceOssObjectPrefix")
        @Validation(required = true)
        public String sliceOssObjectPrefix;

        @NameInMap("CycleDuration")
        @Validation(required = true)
        public Integer cycleDuration;

        public static DescribeCasterConfigResponseRecordConfigRecordFormatRecordFormat build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterConfigResponseRecordConfigRecordFormatRecordFormat self = new DescribeCasterConfigResponseRecordConfigRecordFormatRecordFormat();
            return TeaModel.build(map, self);
        }

        public DescribeCasterConfigResponseRecordConfigRecordFormatRecordFormat setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public DescribeCasterConfigResponseRecordConfigRecordFormatRecordFormat setOssObjectPrefix(String ossObjectPrefix) {
            this.ossObjectPrefix = ossObjectPrefix;
            return this;
        }
        public String getOssObjectPrefix() {
            return this.ossObjectPrefix;
        }

        public DescribeCasterConfigResponseRecordConfigRecordFormatRecordFormat setSliceOssObjectPrefix(String sliceOssObjectPrefix) {
            this.sliceOssObjectPrefix = sliceOssObjectPrefix;
            return this;
        }
        public String getSliceOssObjectPrefix() {
            return this.sliceOssObjectPrefix;
        }

        public DescribeCasterConfigResponseRecordConfigRecordFormatRecordFormat setCycleDuration(Integer cycleDuration) {
            this.cycleDuration = cycleDuration;
            return this;
        }
        public Integer getCycleDuration() {
            return this.cycleDuration;
        }

    }

    public static class DescribeCasterConfigResponseRecordConfigRecordFormat extends TeaModel {
        @NameInMap("RecordFormat")
        @Validation(required = true)
        public java.util.List<DescribeCasterConfigResponseRecordConfigRecordFormatRecordFormat> recordFormat;

        public static DescribeCasterConfigResponseRecordConfigRecordFormat build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterConfigResponseRecordConfigRecordFormat self = new DescribeCasterConfigResponseRecordConfigRecordFormat();
            return TeaModel.build(map, self);
        }

        public DescribeCasterConfigResponseRecordConfigRecordFormat setRecordFormat(java.util.List<DescribeCasterConfigResponseRecordConfigRecordFormatRecordFormat> recordFormat) {
            this.recordFormat = recordFormat;
            return this;
        }
        public java.util.List<DescribeCasterConfigResponseRecordConfigRecordFormatRecordFormat> getRecordFormat() {
            return this.recordFormat;
        }

    }

    public static class DescribeCasterConfigResponseRecordConfig extends TeaModel {
        @NameInMap("OssEndpoint")
        @Validation(required = true)
        public String ossEndpoint;

        @NameInMap("OssBucket")
        @Validation(required = true)
        public String ossBucket;

        @NameInMap("RecordFormat")
        @Validation(required = true)
        public DescribeCasterConfigResponseRecordConfigRecordFormat recordFormat;

        public static DescribeCasterConfigResponseRecordConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterConfigResponseRecordConfig self = new DescribeCasterConfigResponseRecordConfig();
            return TeaModel.build(map, self);
        }

        public DescribeCasterConfigResponseRecordConfig setOssEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

        public DescribeCasterConfigResponseRecordConfig setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public DescribeCasterConfigResponseRecordConfig setRecordFormat(DescribeCasterConfigResponseRecordConfigRecordFormat recordFormat) {
            this.recordFormat = recordFormat;
            return this;
        }
        public DescribeCasterConfigResponseRecordConfigRecordFormat getRecordFormat() {
            return this.recordFormat;
        }

    }

}
