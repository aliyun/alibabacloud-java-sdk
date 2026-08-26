// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetCasterConfigRequest extends TeaModel {
    /**
     * <p>The automatic standby switchover configuration.
     * <code>eofThres</code>: the duration of stream interruption after which the system automatically switches to the standby video, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;eofThres&quot;:3}</p>
     */
    @NameInMap("AutoSwitchUrgentConfig")
    public String autoSwitchUrgentConfig;

    /**
     * <p>Specifies whether to enable automatic switchover to the standby video when the stream is interrupted.</p>
     * <ul>
     * <li><strong>true</strong>: enabled.</li>
     * <li><strong>false</strong>: disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoSwitchUrgentOn")
    public Boolean autoSwitchUrgentOn;

    /**
     * <p>The callback URL. To receive callback notifications, enter a valid receiving address that accepts the HTTP protocol. If this parameter is set to empty, callback notifications for the production studio are canceled by default.</p>
     * <blockquote>
     * <p>For more information about production studio callbacks, see <a href="https://help.aliyun.com/document_detail/213633.html">Cloud production studio callback information</a>.</p>
     * </blockquote>
     */
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    /**
     * <p>The production studio ID.</p>
     * <ul>
     * <li><p>If you created the production studio by calling the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation, check the CasterId value returned by the CreateCaster operation.</p>
     * </li>
     * <li><p>If you created the production studio in the ApsaraVideo Live console, go to <strong>ApsaraVideo Live console</strong> &gt; <strong>Production Studio</strong> &gt; <strong>Cloud Production Studio</strong> to view the ID.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The production studio name in the production studio list on the Cloud Production Studio page of the ApsaraVideo Live console is the production studio ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>The name of the production studio.</p>
     * 
     * <strong>example:</strong>
     * <p>liveCaster****</p>
     */
    @NameInMap("CasterName")
    public String casterName;

    /**
     * <p>Specifies whether to enable Channel. If Channel was previously enabled (ChannelEnable=1), you must explicitly pass ChannelEnable=1 in each call to maintain the channel status. Otherwise, the error InvalidCaster.ChannelDisableUnsupported is returned.</p>
     * <ul>
     * <li><strong>0</strong> (default): disabled.</li>
     * <li><strong>1</strong>: enabled.</li>
     * </ul>
     * <blockquote>
     * <p>Channel is disabled by default and cannot be disabled after it is enabled. When Channel is disabled, resources are directly referenced by layouts. To enable Channel for the first time, the production studio must be stopped. Existing layouts are discarded. Resources must first be assigned to a Channel, and new layouts directly reference the Channel. Through Channel, you can adjust the playback progress and status of video sources. In this mode, if the video source, PVW, and PGM areas reference the same resource, the corresponding views remain synchronized.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ChannelEnable")
    public Integer channelEnable;

    /**
     * <p>The stream delay, in seconds.</p>
     * <ul>
     * <li><strong>0</strong> (default): disables stream delay.</li>
     * <li>Greater than <strong>0</strong>: enables stream delay.</li>
     * <li><strong>Empty</strong>: clears the stream delay configuration by default.<blockquote>
     * <p>The maximum value is 300 seconds.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Delay")
    public Float delay;

    /**
     * <p>The primary streaming domain.</p>
     * <p>Complete the domain name configuration before starting the production studio. If this parameter is empty, the domain name configuration of the production studio is cleared by default.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Specifies whether the program list takes effect. </p>
     * <ul>
     * <li><strong>0</strong>: does not take effect.</li>
     * <li><strong>1</strong>: takes effect.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ProgramEffect")
    public Integer programEffect;

    /**
     * <p>The name of the program list. This parameter can be configured when the program list feature is used.</p>
     * 
     * <strong>example:</strong>
     * <p>program_name</p>
     */
    @NameInMap("ProgramName")
    public String programName;

    /**
     * <p>The recording configuration in JSON format. The configuration elements are as follows:</p>
     * <ul>
     * <li><strong>endpoint</strong>: the API endpoint of the Alibaba Cloud service.</li>
     * <li><strong>ossBucket</strong>: the name of the OSS bucket.</li>
     * <li><strong>videoFormat</strong>: the video file formats supported for export. Example: <code>[{\\&quot;OssObjectPrefix\\&quot;:\\&quot;record/{AppName}/{StreamName}/{StartTime}_{EndTime}\\&quot;,\\&quot;Format\\&quot;:\\&quot;m3u8\\&quot;,\\&quot;CycleDuration\\&quot;:21600,\\&quot;SliceOssObjectPrefix\\&quot;:\\&quot;record/{AppName}/{StreamName}/{UnixTimestamp}\\&quot;},{\\&quot;OssObjectPrefix\\&quot;:\\&quot;record/{AppName}/{StreamName}/{StartTime}_{EndTime}\\&quot;,\\&quot;Format\\&quot;:\\&quot;flv\\&quot;,\\&quot;CycleDuration\\&quot;:21600}]</code>.</li>
     * <li><strong>interval</strong>: the time interval, in milliseconds (ms).</li>
     * </ul>
     * <blockquote>
     * <p>If this parameter is set to empty, the recording feature is not enabled. If this parameter is set to empty, the recording configuration is cleared by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;endpoint&quot;: &quot;<a href="http://oss-cn-********.aliyuncs.com/api">http://oss-cn-********.aliyuncs.com/api</a>&quot;,  &quot;ossBucket****&quot;: &quot;liveBucket****&quot;, &quot;VideoFormat&quot;:[{\&quot;OssObjectPrefix\&quot;:\&quot;record/{AppName}/{StreamName}/{StartTime}<em>{EndTime}\&quot;,\&quot;Format\&quot;:\&quot;m3u8\&quot;,\&quot;CycleDuration\&quot;:21600,\&quot;SliceOssObjectPrefix\&quot;:\&quot;record/{AppName}/{StreamName}/{UnixTimestamp}\&quot;},{\&quot;OssObjectPrefix\&quot;:\&quot;record/{AppName}/{StreamName}/{StartTime}</em>{EndTime}\&quot;,\&quot;Format\&quot;:\&quot;flv\&quot;,\&quot;CycleDuration\&quot;:21600}] &quot;interval&quot;: 5 }</p>
     */
    @NameInMap("RecordConfig")
    public String recordConfig;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ingest URL that corresponds to the custom bypass output address of the production studio. 
     * If this parameter is empty, the ingest URL that corresponds to the output address automatically generated by Alibaba Cloud is used by default.</p>
     * <blockquote>
     * <p>Currently, SideOutputUrl supports only the RTMP protocol for stream ingest.</p>
     * </blockquote>
     */
    @NameInMap("SideOutputUrl")
    public String sideOutputUrl;

    /**
     * <p>The list of multi-destination relay streaming addresses. The addresses can be CDN ingest URLs from Alibaba Cloud or third-party providers. A maximum of 20 RTMP relay addresses can be added to a production studio.</p>
     * <blockquote>
     * <p>Specify multiple addresses in the array format: [&quot;rtmp://domain/app1/stream1&quot;,&quot;rtmp://domain/app2/stream2&quot;].</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rtmp://domain/app/stream?***</p>
     */
    @NameInMap("SideOutputUrlList")
    public String sideOutputUrlList;

    /**
     * <p>The multi-view synchronization configuration that synchronizes multiple video sources.
     * Multi-view synchronization has two modes:</p>
     * <ul>
     * <li><p>mode: 0 (streamer mode. Multiple video sources are synchronized based on the specified mode.)</p>
     * </li>
     * <li><p>mode: 1 (conference mode. There is no concept of a streamer video. All video sources are synchronized with each other.)</p>
     * </li>
     * </ul>
     * <p>Streamer mode: hostResourceId: the streamer video source in streamer mode.</p>
     * <p>Conference mode: the hostResourceId field is not required. Only the resource IDs in resourceIds need to be provided.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;[{\&quot;mode\&quot;:0,\&quot;resourceIds\&quot;:[\&quot;5a6c1c33-8424-46f6-813c-c152220a****\&quot;,\&quot;4e6521dc-a40a-4077-b6bf-1fb12a76****\&quot;],\&quot;hostResourceId\&quot;:\&quot;3aa2b39a-fd0e-4b8c-be73-b7af31c4****\&quot;}]&quot;</p>
     */
    @NameInMap("SyncGroupsConfig")
    public String syncGroupsConfig;

    /**
     * <p>The transcoding configuration. </p>
     * <p>A JSON-formatted string. Use upper camel case for internal fields of the struct. If this parameter is set to empty, the transcoding configuration is cleared by default. If the transcoding template is empty, an error is returned when the production studio starts.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;casterTemplate&quot;: &quot;lp_ld&quot;}</p>
     */
    @NameInMap("TranscodeConfig")
    public String transcodeConfig;

    /**
     * <p>The media asset ID of the standby image in the media library.</p>
     * 
     * <strong>example:</strong>
     * <p>a089175eb5f4427684fc0715159a****</p>
     */
    @NameInMap("UrgentImageId")
    public String urgentImageId;

    /**
     * <p>The URL of the standby image.</p>
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
     * <p>The media asset ID of the standby video in the media library. If this parameter is set to empty, the standby configuration is cleared by default.</p>
     * 
     * <strong>example:</strong>
     * <p>a2b8e671</p>
     */
    @NameInMap("UrgentMaterialId")
    public String urgentMaterialId;

    public static SetCasterConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetCasterConfigRequest self = new SetCasterConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetCasterConfigRequest setAutoSwitchUrgentConfig(String autoSwitchUrgentConfig) {
        this.autoSwitchUrgentConfig = autoSwitchUrgentConfig;
        return this;
    }
    public String getAutoSwitchUrgentConfig() {
        return this.autoSwitchUrgentConfig;
    }

    public SetCasterConfigRequest setAutoSwitchUrgentOn(Boolean autoSwitchUrgentOn) {
        this.autoSwitchUrgentOn = autoSwitchUrgentOn;
        return this;
    }
    public Boolean getAutoSwitchUrgentOn() {
        return this.autoSwitchUrgentOn;
    }

    public SetCasterConfigRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public SetCasterConfigRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public SetCasterConfigRequest setCasterName(String casterName) {
        this.casterName = casterName;
        return this;
    }
    public String getCasterName() {
        return this.casterName;
    }

    public SetCasterConfigRequest setChannelEnable(Integer channelEnable) {
        this.channelEnable = channelEnable;
        return this;
    }
    public Integer getChannelEnable() {
        return this.channelEnable;
    }

    public SetCasterConfigRequest setDelay(Float delay) {
        this.delay = delay;
        return this;
    }
    public Float getDelay() {
        return this.delay;
    }

    public SetCasterConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetCasterConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetCasterConfigRequest setProgramEffect(Integer programEffect) {
        this.programEffect = programEffect;
        return this;
    }
    public Integer getProgramEffect() {
        return this.programEffect;
    }

    public SetCasterConfigRequest setProgramName(String programName) {
        this.programName = programName;
        return this;
    }
    public String getProgramName() {
        return this.programName;
    }

    public SetCasterConfigRequest setRecordConfig(String recordConfig) {
        this.recordConfig = recordConfig;
        return this;
    }
    public String getRecordConfig() {
        return this.recordConfig;
    }

    public SetCasterConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetCasterConfigRequest setSideOutputUrl(String sideOutputUrl) {
        this.sideOutputUrl = sideOutputUrl;
        return this;
    }
    public String getSideOutputUrl() {
        return this.sideOutputUrl;
    }

    public SetCasterConfigRequest setSideOutputUrlList(String sideOutputUrlList) {
        this.sideOutputUrlList = sideOutputUrlList;
        return this;
    }
    public String getSideOutputUrlList() {
        return this.sideOutputUrlList;
    }

    public SetCasterConfigRequest setSyncGroupsConfig(String syncGroupsConfig) {
        this.syncGroupsConfig = syncGroupsConfig;
        return this;
    }
    public String getSyncGroupsConfig() {
        return this.syncGroupsConfig;
    }

    public SetCasterConfigRequest setTranscodeConfig(String transcodeConfig) {
        this.transcodeConfig = transcodeConfig;
        return this;
    }
    public String getTranscodeConfig() {
        return this.transcodeConfig;
    }

    public SetCasterConfigRequest setUrgentImageId(String urgentImageId) {
        this.urgentImageId = urgentImageId;
        return this;
    }
    public String getUrgentImageId() {
        return this.urgentImageId;
    }

    public SetCasterConfigRequest setUrgentImageUrl(String urgentImageUrl) {
        this.urgentImageUrl = urgentImageUrl;
        return this;
    }
    public String getUrgentImageUrl() {
        return this.urgentImageUrl;
    }

    public SetCasterConfigRequest setUrgentLiveStreamUrl(String urgentLiveStreamUrl) {
        this.urgentLiveStreamUrl = urgentLiveStreamUrl;
        return this;
    }
    public String getUrgentLiveStreamUrl() {
        return this.urgentLiveStreamUrl;
    }

    public SetCasterConfigRequest setUrgentMaterialId(String urgentMaterialId) {
        this.urgentMaterialId = urgentMaterialId;
        return this;
    }
    public String getUrgentMaterialId() {
        return this.urgentMaterialId;
    }

}
