// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class MediaConvertTransConfig extends TeaModel {
    /**
     * <p>The method for adjusting the resolution. This parameter takes effect only if both the Width and Height parameters are specified. You can use this parameter together with the LongShortMode parameter.</p>
     * <ul>
     * <li>Valid values: rescale, crop, pad, and none.</li>
     * <li>Default value: none.</li>
     * <li></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>rescale</p>
     */
    @NameInMap("AdjDarMethod")
    public String adjDarMethod;

    /**
     * <p>Specifies whether to check the audio bitrate. Mutually exclusive with IsCheckVideoBitrateFail. IsCheckVideoBitrateFail has a higher priority.</p>
     * <ul>
     * <li><p>true: checks the audio bitrate. If the source bitrate is lower than the target, the task will transcode using the source bitrate.</p>
     * </li>
     * <li><p>false: does not check the audio bitrate.</p>
     * </li>
     * <li><p>Default value:</p>
     * <ul>
     * <li>If this parameter is not specified and the codec of the output audio is different from that of the input audio, the default value is false.</li>
     * <li>If this parameter is not specified and the codec of the output audio is the same as that of the input audio, the default value is true.</li>
     * </ul>
     * </li>
     * </ul>
     */
    @NameInMap("IsCheckAudioBitrate")
    public Boolean isCheckAudioBitrate;

    /**
     * <p>Specifies whether to check the audio bitrate. Mutually exclusive with IsCheckAudioBitrate. This parameter has a higher priority.</p>
     * <ul>
     * <li>true: checks the audio bitrate. If the source bitrate is lower than the target, the task will fail.</li>
     * <li>false: does not check the audio bitrate.</li>
     * <li>Default value: false.</li>
     * </ul>
     */
    @NameInMap("IsCheckAudioBitrateFail")
    public Boolean isCheckAudioBitrateFail;

    /**
     * <p>Specifies whether to check the video resolution. Mutually exclusive with IsCheckResoFail. IsCheckResoFail has a higher priority.</p>
     * <ul>
     * <li>true: checks the video resolution. If the source resolution (width or height) is smaller than the target, the task will transcode using the source resolution.</li>
     * <li>false: does not check the video resolution.</li>
     * <li>Default value: false.</li>
     * </ul>
     */
    @NameInMap("IsCheckReso")
    public Boolean isCheckReso;

    /**
     * <p>Specifies whether to check the video resolution. Mutually exclusive with IsCheckReso. This parameter has a higher priority.</p>
     * <ul>
     * <li>true: checks the video resolution. If the source resolution (width or height) is smaller than the target, the task will fail.</li>
     * <li>false: does not check the video resolution.</li>
     * <li>Default value: false.</li>
     * </ul>
     */
    @NameInMap("IsCheckResoFail")
    public Boolean isCheckResoFail;

    /**
     * <p>Specifies whether to check the video bitrate. Mutually exclusive with IsCheckVideoBitrateFail. IsCheckVideoBitrateFail has a higher priority.</p>
     * <ul>
     * <li>true: checks the video bitrate. If the source bitrate is lower than the target, the task will transcode using the source bitrate.</li>
     * <li>false: does not check the video bitrate.</li>
     * <li>Default value: false.</li>
     * </ul>
     */
    @NameInMap("IsCheckVideoBitrate")
    public Boolean isCheckVideoBitrate;

    /**
     * <p>Specifies whether to check the video bitrate. Mutually exclusive with IsCheckVideoBitrate. This parameter has a higher priority.</p>
     * <ul>
     * <li>true: checks the video bitrate. If the source bitrate is lower than the target, the task will fail.</li>
     * <li>false: does not check the video bitrate.</li>
     * <li>Default value: false.</li>
     * </ul>
     */
    @NameInMap("IsCheckVideoBitrateFail")
    public Boolean isCheckVideoBitrateFail;

    /**
     * <p>The video bitrate control mode. This is only valid for H.264, H.265, and AV1 codecs and must be used with the correct Bitrate or Crf settings. Valid values:</p>
     * <ul>
     * <li>CBR: Constant bitrate mode.</li>
     * <li>onepass: Typically used for Average bitrate mode (ABR). Faster than twopass.</li>
     * <li>twopass: Typically used for variable bitrate mode (VBR). Slower than onepass.</li>
     * <li>fixCRF: Constant Rate Factor (quality-based) mode.</li>
     * <li>If you specify the Bitrate parameter, the default value of this parameter is onepass. If you do not specify the Bitrate parameter, the default value of this parameter is fixCRF, and the default value of the Crf parameter is used.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>onepass</p>
     */
    @NameInMap("TransMode")
    public String transMode;

    public static MediaConvertTransConfig build(java.util.Map<String, ?> map) throws Exception {
        MediaConvertTransConfig self = new MediaConvertTransConfig();
        return TeaModel.build(map, self);
    }

    public MediaConvertTransConfig setAdjDarMethod(String adjDarMethod) {
        this.adjDarMethod = adjDarMethod;
        return this;
    }
    public String getAdjDarMethod() {
        return this.adjDarMethod;
    }

    public MediaConvertTransConfig setIsCheckAudioBitrate(Boolean isCheckAudioBitrate) {
        this.isCheckAudioBitrate = isCheckAudioBitrate;
        return this;
    }
    public Boolean getIsCheckAudioBitrate() {
        return this.isCheckAudioBitrate;
    }

    public MediaConvertTransConfig setIsCheckAudioBitrateFail(Boolean isCheckAudioBitrateFail) {
        this.isCheckAudioBitrateFail = isCheckAudioBitrateFail;
        return this;
    }
    public Boolean getIsCheckAudioBitrateFail() {
        return this.isCheckAudioBitrateFail;
    }

    public MediaConvertTransConfig setIsCheckReso(Boolean isCheckReso) {
        this.isCheckReso = isCheckReso;
        return this;
    }
    public Boolean getIsCheckReso() {
        return this.isCheckReso;
    }

    public MediaConvertTransConfig setIsCheckResoFail(Boolean isCheckResoFail) {
        this.isCheckResoFail = isCheckResoFail;
        return this;
    }
    public Boolean getIsCheckResoFail() {
        return this.isCheckResoFail;
    }

    public MediaConvertTransConfig setIsCheckVideoBitrate(Boolean isCheckVideoBitrate) {
        this.isCheckVideoBitrate = isCheckVideoBitrate;
        return this;
    }
    public Boolean getIsCheckVideoBitrate() {
        return this.isCheckVideoBitrate;
    }

    public MediaConvertTransConfig setIsCheckVideoBitrateFail(Boolean isCheckVideoBitrateFail) {
        this.isCheckVideoBitrateFail = isCheckVideoBitrateFail;
        return this;
    }
    public Boolean getIsCheckVideoBitrateFail() {
        return this.isCheckVideoBitrateFail;
    }

    public MediaConvertTransConfig setTransMode(String transMode) {
        this.transMode = transMode;
        return this;
    }
    public String getTransMode() {
        return this.transMode;
    }

}
