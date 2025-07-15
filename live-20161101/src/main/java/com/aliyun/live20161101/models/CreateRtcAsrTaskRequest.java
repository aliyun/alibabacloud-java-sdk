// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateRtcAsrTaskRequest extends TeaModel {
    /**
     * <p>The AuthKey that is used to generate the MD5 signature in callbacks.</p>
     * 
     * <strong>example:</strong>
     * <p>abcd</p>
     */
    @NameInMap("AuthKey")
    public String authKey;

    /**
     * <p>The maximum latency at which the task is automatically stopped. Unit: seconds. Valid values: 1 to 10.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("AutoTerminateDelay")
    public Long autoTerminateDelay;

    /**
     * <p>Specifies whether to automatically stop the task when the latency exceeds the specified limit. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoTerminateEnabled")
    public Boolean autoTerminateEnabled;

    /**
     * <p>The callback URL.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://xxx.com">http://xxx.com</a></p>
     */
    @NameInMap("CallbackURL")
    public String callbackURL;

    /**
     * <p>The ID of the channel.</p>
     * <blockquote>
     * <p> This parameter is required and takes effect only if you set the Mode parameter to rtc.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>channelId</p>
     */
    @NameInMap("ChannelID")
    public String channelID;

    /**
     * <p>The source language of the audio. Valid values:</p>
     * <ul>
     * <li>ja: Japanese</li>
     * <li>yue: Cantonese</li>
     * <li>fspk: mixed Mandarin and English</li>
     * <li>en: English</li>
     * <li>cn: Mandarin</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The type of the stream. Valid values: live and rtc. The value live specifies a regular live stream, such as a Real-Time Messaging Protocol (RTMP) stream.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>live</p>
     */
    @NameInMap("Mode")
    public String mode;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The interval at which callbacks are returned. Unit: milliseconds. Valid values: -1 and 0 to 500.</p>
     * <ul>
     * <li>\-1: accepts callbacks only for whole sentences, but not for incomplete sentences.</li>
     * <li>0 or an empty value: returns callbacks in real time.</li>
     * <li>A value that is greater than 0 and less than or equal to 500: returns callbacks at the specified interval.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ReportInterval")
    public Long reportInterval;

    /**
     * <p>The ID of the user who ingests the stream.</p>
     * <blockquote>
     * <p> This parameter is required and takes effect only if you set the Mode parameter to rtc. You can specify only one user ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>user1</p>
     */
    @NameInMap("RtcUserId")
    public String rtcUserId;

    /**
     * <p>The ID of the ApsaraVideo Real-time Communication (ARTC) application.</p>
     * <blockquote>
     * <p> This parameter is required and takes effect only if you set the Mode parameter to rtc.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>appId</p>
     */
    @NameInMap("SDKAppID")
    public String SDKAppID;

    /**
     * <p>The URL of the live stream.</p>
     * <blockquote>
     * <p> This parameter is required and takes effect only if you set the Mode parameter to live.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rtmp://xxx</p>
     */
    @NameInMap("StreamURL")
    public String streamURL;

    /**
     * <p>The language into which the subtitles are translated. Valid values:</p>
     * <ul>
     * <li>cn: Chinese</li>
     * <li>en: English</li>
     * <li>ja: Japanese</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("TargetLanguages")
    public String targetLanguages;

    /**
     * <p>Specifies whether to enable the translation feature.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("TranslateEnabled")
    public Boolean translateEnabled;

    public static CreateRtcAsrTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRtcAsrTaskRequest self = new CreateRtcAsrTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateRtcAsrTaskRequest setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

    public CreateRtcAsrTaskRequest setAutoTerminateDelay(Long autoTerminateDelay) {
        this.autoTerminateDelay = autoTerminateDelay;
        return this;
    }
    public Long getAutoTerminateDelay() {
        return this.autoTerminateDelay;
    }

    public CreateRtcAsrTaskRequest setAutoTerminateEnabled(Boolean autoTerminateEnabled) {
        this.autoTerminateEnabled = autoTerminateEnabled;
        return this;
    }
    public Boolean getAutoTerminateEnabled() {
        return this.autoTerminateEnabled;
    }

    public CreateRtcAsrTaskRequest setCallbackURL(String callbackURL) {
        this.callbackURL = callbackURL;
        return this;
    }
    public String getCallbackURL() {
        return this.callbackURL;
    }

    public CreateRtcAsrTaskRequest setChannelID(String channelID) {
        this.channelID = channelID;
        return this;
    }
    public String getChannelID() {
        return this.channelID;
    }

    public CreateRtcAsrTaskRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public CreateRtcAsrTaskRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public CreateRtcAsrTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateRtcAsrTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateRtcAsrTaskRequest setReportInterval(Long reportInterval) {
        this.reportInterval = reportInterval;
        return this;
    }
    public Long getReportInterval() {
        return this.reportInterval;
    }

    public CreateRtcAsrTaskRequest setRtcUserId(String rtcUserId) {
        this.rtcUserId = rtcUserId;
        return this;
    }
    public String getRtcUserId() {
        return this.rtcUserId;
    }

    public CreateRtcAsrTaskRequest setSDKAppID(String SDKAppID) {
        this.SDKAppID = SDKAppID;
        return this;
    }
    public String getSDKAppID() {
        return this.SDKAppID;
    }

    public CreateRtcAsrTaskRequest setStreamURL(String streamURL) {
        this.streamURL = streamURL;
        return this;
    }
    public String getStreamURL() {
        return this.streamURL;
    }

    public CreateRtcAsrTaskRequest setTargetLanguages(String targetLanguages) {
        this.targetLanguages = targetLanguages;
        return this;
    }
    public String getTargetLanguages() {
        return this.targetLanguages;
    }

    public CreateRtcAsrTaskRequest setTranslateEnabled(Boolean translateEnabled) {
        this.translateEnabled = translateEnabled;
        return this;
    }
    public Boolean getTranslateEnabled() {
        return this.translateEnabled;
    }

}
