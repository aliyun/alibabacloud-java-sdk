// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterConfigResponseBody extends TeaModel {
    /**
     * <p>The configuration for automatic switchover to the standby resource. The <code>eofThres</code> field specifies the duration after which the production studio automatically switches to the standby resource if a stream interruption occurs. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;eofThres&quot;:3}</p>
     */
    @NameInMap("AutoSwitchUrgentConfig")
    public String autoSwitchUrgentConfig;

    /**
     * <p>Indicates whether the production studio automatically switches to the standby resource in case of a stream interruption.</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoSwitchUrgentOn")
    public String autoSwitchUrgentOn;

    /**
     * <p>The callback URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://learn.aliyundoc.com/callBackLive">http://learn.aliyundoc.com/callBackLive</a></p>
     */
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    /**
     * <p>The ID of the production studio.</p>
     * 
     * <strong>example:</strong>
     * <p>LIVEPRODUCER_POST-cn-0pp1czt****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>The name of the production studio.</p>
     * 
     * <strong>example:</strong>
     * <p>coco-caster10</p>
     */
    @NameInMap("CasterName")
    public String casterName;

    /**
     * <p>Indicates whether channels are enabled for the production studio. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Channels are disabled.</li>
     * <li><strong>1</strong>: Channels are enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ChannelEnable")
    public Integer channelEnable;

    /**
     * <p>Indicates whether stream delay is enabled. Unit: seconds.</p>
     * <ul>
     * <li><strong>0</strong>: Stream delay is disabled.</li>
     * <li><strong>A value greater than 0</strong>: Stream delay is enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Delay")
    public Float delay;

    /**
     * <p>The main streaming domain.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>Indicates whether the carousel playback feature is enabled. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: The carousel playback feature is disabled.</li>
     * <li><strong>1</strong>: The carousel playback feature is enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ProgramEffect")
    public Integer programEffect;

    /**
     * <p>The name of the playlist for carousel playback.</p>
     * 
     * <strong>example:</strong>
     * <p>program_name</p>
     */
    @NameInMap("ProgramName")
    public String programName;

    /**
     * <p>The recording configuration. If this parameter is empty, the recording feature is disabled.</p>
     */
    @NameInMap("RecordConfig")
    public DescribeCasterConfigResponseBodyRecordConfig recordConfig;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>97df6b7f-3490-47d2-ac50-8833e1b64597</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The custom stream redirect URL.</p>
     * 
     * <strong>example:</strong>
     * <p>rtmp://sophon-developer.aliyundoc.com/caster/4a82a3d1b7f0462ea37348366201****?auth_key=1608953344-0-0-ac8c628078541d7055a170ec59a5****</p>
     */
    @NameInMap("SideOutputUrl")
    public String sideOutputUrl;

    /**
     * <p>The list of custom stream redirect URLs.</p>
     * 
     * <strong>example:</strong>
     * <p>rtmp://sophon-developer.aliyundoc.com/caster/4a82a3d1b7f0462ea37348366201****?auth_key=1608953344-0-0-ac8c628078541d7055a170ec59a5****</p>
     */
    @NameInMap("SideOutputUrlList")
    public String sideOutputUrlList;

    @NameInMap("SyncGroupsConfig")
    public DescribeCasterConfigResponseBodySyncGroupsConfig syncGroupsConfig;

    /**
     * <p>The transcoding configuration.</p>
     */
    @NameInMap("TranscodeConfig")
    public DescribeCasterConfigResponseBodyTranscodeConfig transcodeConfig;

    /**
     * <p>Prepared broadcast image media asset ID.</p>
     * 
     * <strong>example:</strong>
     * <p>a089175eb5f4427684fc0715159a****</p>
     */
    @NameInMap("UrgentImageId")
    public String urgentImageId;

    /**
     * <p>URL of the standby image material.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://learn.aliyundoc.com/AppName/image.jpg">http://learn.aliyundoc.com/AppName/image.jpg</a></p>
     */
    @NameInMap("UrgentImageUrl")
    public String urgentImageUrl;

    /**
     * <p>The URL of the standby live stream.</p>
     * 
     * <strong>example:</strong>
     * <p>rtmp://demo.aliyundoc.com</p>
     */
    @NameInMap("UrgentLiveStreamUrl")
    public String urgentLiveStreamUrl;

    /**
     * <p>The ID of the material that is used as the standby video from the media library.</p>
     * 
     * <strong>example:</strong>
     * <p>98646538-bcf9-4aef-bd4a-e6bb76588****</p>
     */
    @NameInMap("UrgentMaterialId")
    public String urgentMaterialId;

    public static DescribeCasterConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterConfigResponseBody self = new DescribeCasterConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCasterConfigResponseBody setAutoSwitchUrgentConfig(String autoSwitchUrgentConfig) {
        this.autoSwitchUrgentConfig = autoSwitchUrgentConfig;
        return this;
    }
    public String getAutoSwitchUrgentConfig() {
        return this.autoSwitchUrgentConfig;
    }

    public DescribeCasterConfigResponseBody setAutoSwitchUrgentOn(String autoSwitchUrgentOn) {
        this.autoSwitchUrgentOn = autoSwitchUrgentOn;
        return this;
    }
    public String getAutoSwitchUrgentOn() {
        return this.autoSwitchUrgentOn;
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

    public DescribeCasterConfigResponseBody setUrgentImageId(String urgentImageId) {
        this.urgentImageId = urgentImageId;
        return this;
    }
    public String getUrgentImageId() {
        return this.urgentImageId;
    }

    public DescribeCasterConfigResponseBody setUrgentImageUrl(String urgentImageUrl) {
        this.urgentImageUrl = urgentImageUrl;
        return this;
    }
    public String getUrgentImageUrl() {
        return this.urgentImageUrl;
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
        /**
         * <p>On-demand recording. Values:</p>
         * <ul>
         * <li>0: Off. </li>
         * <li>1: Via HTTP callback. </li>
         * <li>2: Parse streaming parameters for on-demand recording. </li>
         * <li>7: Default to not record.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("OnDemand")
        public Integer onDemand;

        /**
         * <p>The OSS bucket for storage.</p>
         * 
         * <strong>example:</strong>
         * <p>liveBucket****</p>
         */
        @NameInMap("OssBucket")
        public String ossBucket;

        /**
         * <p>The Object Storage Service (OSS) endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-shanghai.aliyundoc.com</p>
         */
        @NameInMap("OssEndpoint")
        public String ossEndpoint;

        @NameInMap("RecordFormat")
        public DescribeCasterConfigResponseBodyRecordConfigRecordFormat recordFormat;

        public static DescribeCasterConfigResponseBodyRecordConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterConfigResponseBodyRecordConfig self = new DescribeCasterConfigResponseBodyRecordConfig();
            return TeaModel.build(map, self);
        }

        public DescribeCasterConfigResponseBodyRecordConfig setOnDemand(Integer onDemand) {
            this.onDemand = onDemand;
            return this;
        }
        public Integer getOnDemand() {
            return this.onDemand;
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

    public static class DescribeCasterConfigResponseBodyTranscodeConfigCustomParamsVideo extends TeaModel {
        /**
         * <p>The video bitrate.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("bitrate")
        public Integer bitrate;

        /**
         * <p>The video frame rate.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("fps")
        public Integer fps;

        /**
         * <p>The video height. Unit: pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>720</p>
         */
        @NameInMap("height")
        public Integer height;

        /**
         * <p>The video width. Unit: pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>1080</p>
         */
        @NameInMap("width")
        public Integer width;

        public static DescribeCasterConfigResponseBodyTranscodeConfigCustomParamsVideo build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterConfigResponseBodyTranscodeConfigCustomParamsVideo self = new DescribeCasterConfigResponseBodyTranscodeConfigCustomParamsVideo();
            return TeaModel.build(map, self);
        }

        public DescribeCasterConfigResponseBodyTranscodeConfigCustomParamsVideo setBitrate(Integer bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public Integer getBitrate() {
            return this.bitrate;
        }

        public DescribeCasterConfigResponseBodyTranscodeConfigCustomParamsVideo setFps(Integer fps) {
            this.fps = fps;
            return this;
        }
        public Integer getFps() {
            return this.fps;
        }

        public DescribeCasterConfigResponseBodyTranscodeConfigCustomParamsVideo setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public DescribeCasterConfigResponseBodyTranscodeConfigCustomParamsVideo setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class DescribeCasterConfigResponseBodyTranscodeConfigCustomParams extends TeaModel {
        /**
         * <p>The video parameters.</p>
         */
        @NameInMap("video")
        public DescribeCasterConfigResponseBodyTranscodeConfigCustomParamsVideo video;

        public static DescribeCasterConfigResponseBodyTranscodeConfigCustomParams build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterConfigResponseBodyTranscodeConfigCustomParams self = new DescribeCasterConfigResponseBodyTranscodeConfigCustomParams();
            return TeaModel.build(map, self);
        }

        public DescribeCasterConfigResponseBodyTranscodeConfigCustomParams setVideo(DescribeCasterConfigResponseBodyTranscodeConfigCustomParamsVideo video) {
            this.video = video;
            return this;
        }
        public DescribeCasterConfigResponseBodyTranscodeConfigCustomParamsVideo getVideo() {
            return this.video;
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
        /**
         * <p>The transcoding template of the production studio. Valid values:</p>
         * <ul>
         * <li><strong>lp_ld</strong>: low definition</li>
         * <li><strong>lp_sd</strong>: standard definition</li>
         * <li><strong>lp_hd</strong>: high definition</li>
         * <li><strong>lp_ud</strong>: ultra high definition</li>
         * <li><strong>lp_ld_v</strong>: low definition (portrait mode)</li>
         * <li><strong>lp_sd_v</strong>: standard definition (portrait mode)</li>
         * <li><strong>lp_hd_v</strong>: high definition (portrait mode)</li>
         * <li><strong>lp_ud_v</strong>: ultra high definition (portrait mode)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>lp_hd</p>
         */
        @NameInMap("CasterTemplate")
        public String casterTemplate;

        /**
         * <p>The custom settings.</p>
         */
        @NameInMap("CustomParams")
        public DescribeCasterConfigResponseBodyTranscodeConfigCustomParams customParams;

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

        public DescribeCasterConfigResponseBodyTranscodeConfig setCustomParams(DescribeCasterConfigResponseBodyTranscodeConfigCustomParams customParams) {
            this.customParams = customParams;
            return this;
        }
        public DescribeCasterConfigResponseBodyTranscodeConfigCustomParams getCustomParams() {
            return this.customParams;
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
