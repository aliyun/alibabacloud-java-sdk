// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetCasterConfigRequest extends TeaModel {
    /**
     * <p>The configuration for automatic switchover to the standby resource.</p>
     * <p>The <code>eofThres</code> field specifies the duration after which the production studio automatically switches to the standby resource if a stream interruption occurs. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;eofThres&quot;:3}</p>
     */
    @NameInMap("AutoSwitchUrgentConfig")
    public String autoSwitchUrgentConfig;

    /**
     * <p>Specifies whether the production studio automatically switches to the standby resource in case of a stream interruption.</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoSwitchUrgentOn")
    public Boolean autoSwitchUrgentOn;

    /**
     * <p>The callback URL. Enter a valid HTTP address for receiving callback notifications. If you do not specify this parameter, the production studio does not send callback notifications.</p>
     * <blockquote>
     * <p> For more information about production studio callbacks, see <a href="https://help.aliyun.com/document_detail/213633.html">Production studio callbacks</a>.</p>
     * </blockquote>
     */
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    /**
     * <p>The ID of the production studio.</p>
     * <ul>
     * <li>If the production studio was created by calling the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation, check the value of the response parameter CasterId to obtain the ID.</li>
     * <li>If the production studio was created by using the ApsaraVideo Live console, obtain the ID on the <strong>Production Studio Management</strong> page. To go to the page, log on to the <strong>ApsaraVideo Live console</strong> and click <strong>Production Studios</strong> in the left-side navigation pane.</li>
     * </ul>
     * <blockquote>
     * <p> You can find the ID of the production studio in the Instance ID/Name column.</p>
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
     * <p>Specifies whether to enable channels. Valid values:</p>
     * <ul>
     * <li><strong>0</strong> (default): disables channels.</li>
     * <li><strong>1</strong>: enables channels.</li>
     * </ul>
     * <blockquote>
     * <p>You cannot disable channels after you enable them. If you set this parameter to 0, the production studio references video resources in a layout without using channels. If you enable channels for the first time, make sure that the production studio is in the idle state. After you enable channels, a new layout that references video resources by using channels is generated to replace the original one. Therefore, you must specify video resources for channels. You can use the channels to change the playback progress or status. If the video resource, preview, and program modules of the production studio use the same video source, the three modules display the same content.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ChannelEnable")
    public Integer channelEnable;

    /**
     * <p>Specifies whether to enable stream delay. Unit: seconds. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong> (default): disables stream delay.</p>
     * </li>
     * <li><p><strong>A value greater than 0</strong>: enables stream delay.</p>
     * </li>
     * <li><p><strong>Empty</strong>: clears the stream delay configuration.</p>
     * <p>**</p>
     * <p>**Note **The maximum value can be 300 seconds.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Delay")
    public Float delay;

    /**
     * <p>The main streaming domain.</p>
     * <p>Complete the configuration of the domain name before the production studio is started. If you do not specify this parameter, the domain configuration for the production studio is cleared.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Specifies whether to enable the carousel playback feature. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: disables carousel playback.</li>
     * <li><strong>1</strong>: enables carousel playback.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ProgramEffect")
    public Integer programEffect;

    /**
     * <p>The name of the playlist for carousel playback. You can specify this parameter if you enable the carousel playback feature.</p>
     * 
     * <strong>example:</strong>
     * <p>program_name</p>
     */
    @NameInMap("ProgramName")
    public String programName;

    /**
     * <p>The recording configuration. The value is a JSON string. You can configure the following fields:</p>
     * <ul>
     * <li><strong>endpoint</strong>: the API server address of an Alibaba Cloud service.</li>
     * <li><strong>ossBucket</strong>: the name of the Object Storage Service (OSS) bucket.</li>
     * <li><strong>videoFormat</strong>: the format in which the video file can be exported. Example: <code>[{\\&quot;OssObjectPrefix\\&quot;:\\&quot;record/{AppName}/{StreamName}/{StartTime}_{EndTime}\\&quot;,\\&quot;Format\\&quot;:\\&quot;m3u8\\&quot;,\\&quot;CycleDuration\\&quot;:21600,\\&quot;SliceOssObjectPrefix\\&quot;:\\&quot;record/{AppName}/{StreamName}/{UnixTimestamp}\\&quot;},{\\&quot;OssObjectPrefix\\&quot;:\\&quot;record/{AppName}/{StreamName}/{StartTime}_{EndTime}\\&quot;,\\&quot;Format\\&quot;:\\&quot;flv\\&quot;,\\&quot;CycleDuration\\&quot;:21600}]</code>.</li>
     * <li><strong>interval</strong>: the interval between recordings. Unit: milliseconds.</li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify this parameter, the recording feature is disabled and the recording configuration for the production studio is cleared.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;endpoint&quot;: &quot;<a href="http://oss-cn-********.aliyuncs.com/api">http://oss-cn-********.aliyuncs.com/api</a>&quot;,  &quot;ossBucket****&quot;: &quot;liveBucket****&quot;, &quot;VideoFormat&quot;:[{\&quot;OssObjectPrefix\&quot;:\&quot;record/{AppName}/{StreamName}/{StartTime}<em>{EndTime}\&quot;,\&quot;Format\&quot;:\&quot;m3u8\&quot;,\&quot;CycleDuration\&quot;:21600,\&quot;SliceOssObjectPrefix\&quot;:\&quot;record/{AppName}/{StreamName}/{UnixTimestamp}\&quot;},{\&quot;OssObjectPrefix\&quot;:\&quot;record/{AppName}/{StreamName}/{StartTime}</em>{EndTime}\&quot;,\&quot;Format\&quot;:\&quot;flv\&quot;,\&quot;CycleDuration\&quot;:21600}] &quot;interval&quot;: 5 }</p>
     */
    @NameInMap("RecordConfig")
    public String recordConfig;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The custom stream redirect URL.</p>
     * <p>If you do not specify this parameter, the production studio uses the redirect URL generated by the system.</p>
     * <blockquote>
     * <p>Redirect URLs support only the Real-Time Messaging Protocol (RTMP) protocol.</p>
     * </blockquote>
     */
    @NameInMap("SideOutputUrl")
    public String sideOutputUrl;

    /**
     * <p>The stream relay URLs. A relay URL can be an Alibaba Cloud URL or a URL from a third-party CDN provider. You can specify up to 20 relay URLs over the RTMP protocol.</p>
     * <blockquote>
     * <p>Use the following format to specify multiple relay URLs: &quot;rtmp://domain/app1/stream1&quot;,&quot;rtmp://domain/app2/stream2&quot;.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rtmp://domain/app/stream?***</p>
     */
    @NameInMap("SideOutputUrlList")
    public String sideOutputUrlList;

    /**
     * <p>The multi-view synchronization configuration. You can specify this parameter to synchronize multiple video sources.</p>
     * <p>There are two modes of multi-view synchronization.</p>
     * <ul>
     * <li>A value of 0 for the mode field specifies the streamer mode. In this mode, multiple video sources are synchronized based on the settings by the streamer.</li>
     * <li>A value of 1 for the mode field specifies the conference mode. In this mode, all video sources are synchronized.</li>
     * </ul>
     * <p>In the streamer mode, the hostResourceId field specifies the video source on the streamer side.</p>
     * <p>In the conference mode, the hostResourceId field is not available. You need to provide only resource IDs that are required.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;[{\&quot;mode\&quot;:0,\&quot;resourceIds\&quot;:[\&quot;5a6c1c33-8424-46f6-813c-c152220a****\&quot;,\&quot;4e6521dc-a40a-4077-b6bf-1fb12a76****\&quot;],\&quot;hostResourceId\&quot;:\&quot;3aa2b39a-fd0e-4b8c-be73-b7af31c4****\&quot;}]&quot;</p>
     */
    @NameInMap("SyncGroupsConfig")
    public String syncGroupsConfig;

    /**
     * <p>The transcoding configuration.</p>
     * <p>The value is a JSON string. Use upper camel case for fields of the string. If you do not specify this parameter, the transcoding configuration is cleared. If no transcoding template is available, an error occurs when the production studio is started.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;casterTemplate&quot;: &quot;lp_ld&quot;}</p>
     */
    @NameInMap("TranscodeConfig")
    public String transcodeConfig;

    /**
     * <p>The ID of the standby image from the media library.</p>
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
     * <p>The ID of the standby video from the media library. If you do not specify this parameter, the standby video configuration for the production studio is cleared.</p>
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
