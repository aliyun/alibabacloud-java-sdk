// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StartRtcCloudRecordingShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the app to which the channel to be recorded belongs. The app must belong to the primary account associated with the current API caller\&quot;s account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>********-7074-<strong><strong>-9ef5-85c19a4</strong></strong>*</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the channel to be recorded. Make sure that the channel has active users when you call this operation. Otherwise, the recording task fails to be created.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>room1024</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>The idle timeout period. When the task remains idle for longer than MaxIdleTime, the task is automatically stopped. Unit: seconds. The value must be within [10,14400], which is a maximum of 4 hours. Default value: 300.</p>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("MaxIdleTime")
    public Long maxIdleTime;

    /**
     * <p>The layout parameters. This parameter is not required in single-stream recording mode and is required in stream mixing recording mode when the output is not audio-only.</p>
     */
    @NameInMap("MixLayoutParams")
    public String mixLayoutParamsShrink;

    /**
     * <p>The transcoding parameters. This parameter is not required in single-stream recording mode and is required in stream mixing recording mode.</p>
     */
    @NameInMap("MixTranscodeParams")
    public String mixTranscodeParamsShrink;

    /**
     * <p>The authentication key for callback messages. Leave this parameter empty to skip authentication. If specified, the key must be 16 to 64 characters in length and consist of only uppercase and lowercase letters and digits.</p>
     * 
     * <strong>example:</strong>
     * <p>mytestkeymytestkey</p>
     */
    @NameInMap("NotifyAuthKey")
    public String notifyAuthKey;

    /**
     * <p>The specified formats for which a callback message is sent when the recording file upload event (RecordFileUploaded) is triggered.</p>
     */
    @NameInMap("NotifyFileUploadedFormat")
    public java.util.List<String> notifyFileUploadedFormat;

    /**
     * <p>The URL for receiving callback messages. Task status messages are pushed to this URL in JSON format by using the POST method. The maximum length is 2048 characters.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://xxxx/test/mycallback">http://xxxx/test/mycallback</a></p>
     */
    @NameInMap("NotifyUrl")
    public String notifyUrl;

    /**
     * <p>The recording parameters.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RecordParams")
    public String recordParamsShrink;

    /**
     * <p>The storage parameters.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("StorageParams")
    public String storageParamsShrink;

    /**
     * <p>The subscription parameters.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SubscribeParams")
    public String subscribeParamsShrink;

    public static StartRtcCloudRecordingShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StartRtcCloudRecordingShrinkRequest self = new StartRtcCloudRecordingShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StartRtcCloudRecordingShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StartRtcCloudRecordingShrinkRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public StartRtcCloudRecordingShrinkRequest setMaxIdleTime(Long maxIdleTime) {
        this.maxIdleTime = maxIdleTime;
        return this;
    }
    public Long getMaxIdleTime() {
        return this.maxIdleTime;
    }

    public StartRtcCloudRecordingShrinkRequest setMixLayoutParamsShrink(String mixLayoutParamsShrink) {
        this.mixLayoutParamsShrink = mixLayoutParamsShrink;
        return this;
    }
    public String getMixLayoutParamsShrink() {
        return this.mixLayoutParamsShrink;
    }

    public StartRtcCloudRecordingShrinkRequest setMixTranscodeParamsShrink(String mixTranscodeParamsShrink) {
        this.mixTranscodeParamsShrink = mixTranscodeParamsShrink;
        return this;
    }
    public String getMixTranscodeParamsShrink() {
        return this.mixTranscodeParamsShrink;
    }

    public StartRtcCloudRecordingShrinkRequest setNotifyAuthKey(String notifyAuthKey) {
        this.notifyAuthKey = notifyAuthKey;
        return this;
    }
    public String getNotifyAuthKey() {
        return this.notifyAuthKey;
    }

    public StartRtcCloudRecordingShrinkRequest setNotifyFileUploadedFormat(java.util.List<String> notifyFileUploadedFormat) {
        this.notifyFileUploadedFormat = notifyFileUploadedFormat;
        return this;
    }
    public java.util.List<String> getNotifyFileUploadedFormat() {
        return this.notifyFileUploadedFormat;
    }

    public StartRtcCloudRecordingShrinkRequest setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    public StartRtcCloudRecordingShrinkRequest setRecordParamsShrink(String recordParamsShrink) {
        this.recordParamsShrink = recordParamsShrink;
        return this;
    }
    public String getRecordParamsShrink() {
        return this.recordParamsShrink;
    }

    public StartRtcCloudRecordingShrinkRequest setStorageParamsShrink(String storageParamsShrink) {
        this.storageParamsShrink = storageParamsShrink;
        return this;
    }
    public String getStorageParamsShrink() {
        return this.storageParamsShrink;
    }

    public StartRtcCloudRecordingShrinkRequest setSubscribeParamsShrink(String subscribeParamsShrink) {
        this.subscribeParamsShrink = subscribeParamsShrink;
        return this;
    }
    public String getSubscribeParamsShrink() {
        return this.subscribeParamsShrink;
    }

}
