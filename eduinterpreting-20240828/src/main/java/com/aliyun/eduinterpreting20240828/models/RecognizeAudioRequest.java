// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eduinterpreting20240828.models;

import com.aliyun.tea.*;

public class RecognizeAudioRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://xx.com/abc.mp3">http://xx.com/abc.mp3</a></p>
     */
    @NameInMap("AudioFileUrl")
    public String audioFileUrl;

    /**
     * <strong>example:</strong>
     * <p><a href="https://abc.edu.org.cn/en/callback">https://abc.edu.org.cn/en/callback</a></p>
     */
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableCallBack")
    public Boolean enableCallBack;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>433c1361-0f6e-48fc-ad51</p>
     */
    @NameInMap("OuterBizId")
    public String outerBizId;

    public static RecognizeAudioRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeAudioRequest self = new RecognizeAudioRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeAudioRequest setAudioFileUrl(String audioFileUrl) {
        this.audioFileUrl = audioFileUrl;
        return this;
    }
    public String getAudioFileUrl() {
        return this.audioFileUrl;
    }

    public RecognizeAudioRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public RecognizeAudioRequest setEnableCallBack(Boolean enableCallBack) {
        this.enableCallBack = enableCallBack;
        return this;
    }
    public Boolean getEnableCallBack() {
        return this.enableCallBack;
    }

    public RecognizeAudioRequest setOuterBizId(String outerBizId) {
        this.outerBizId = outerBizId;
        return this;
    }
    public String getOuterBizId() {
        return this.outerBizId;
    }

}
