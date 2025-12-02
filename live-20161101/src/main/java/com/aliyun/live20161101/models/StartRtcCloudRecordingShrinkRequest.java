// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StartRtcCloudRecordingShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>********-7074-<strong><strong>-9ef5-85c19a4</strong></strong>*</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>room1024</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("MaxIdleTime")
    public Long maxIdleTime;

    @NameInMap("MixLayoutParams")
    public String mixLayoutParamsShrink;

    @NameInMap("MixTranscodeParams")
    public String mixTranscodeParamsShrink;

    @NameInMap("NotifyAuthKey")
    public String notifyAuthKey;

    @NameInMap("NotifyFileUploadedFormat")
    public java.util.List<String> notifyFileUploadedFormat;

    /**
     * <strong>example:</strong>
     * <p><a href="http://xxxx/test/mycallback">http://xxxx/test/mycallback</a></p>
     */
    @NameInMap("NotifyUrl")
    public String notifyUrl;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RecordParams")
    public String recordParamsShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StorageParams")
    public String storageParamsShrink;

    /**
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
