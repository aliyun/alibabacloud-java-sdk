// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitTraceAbJobShrinkRequest extends TeaModel {
    /**
     * <p>The key that is encoded by using the Base64 algorithm.</p>
     * 
     * <strong>example:</strong>
     * <p>Qh6OdgIMcliQSI1fReOw****</p>
     */
    @NameInMap("CipherBase64ed")
    public String cipherBase64ed;

    /**
     * <p>The source video file for A/B watermarking.</p>
     * <blockquote>
     * <p>OSS object or media asset must reside in the same region as the IMS service region. This API supports only videos that last at least 3 minutes. If the video is too short, the call may fail, or no output may be returned.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public String inputShrink;

    /**
     * <p>The watermark level, which specifies the channel to embed watermarks. Valid values: 0 specifies the 0u channel, 1 specifies the 1uv channel, and 2 specifies the 2yuv channel.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Level")
    public Long level;

    /**
     * <p>The output directory path.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Output")
    public String outputShrink;

    /**
     * <p>The start point of watermark embedding. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The duration of the watermark embedding. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>360</p>
     */
    @NameInMap("TotalTime")
    public Long totalTime;

    /**
     * <p>The custom data, which can be up to 1,024 bytes in size.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitTraceAbJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitTraceAbJobShrinkRequest self = new SubmitTraceAbJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitTraceAbJobShrinkRequest setCipherBase64ed(String cipherBase64ed) {
        this.cipherBase64ed = cipherBase64ed;
        return this;
    }
    public String getCipherBase64ed() {
        return this.cipherBase64ed;
    }

    public SubmitTraceAbJobShrinkRequest setInputShrink(String inputShrink) {
        this.inputShrink = inputShrink;
        return this;
    }
    public String getInputShrink() {
        return this.inputShrink;
    }

    public SubmitTraceAbJobShrinkRequest setLevel(Long level) {
        this.level = level;
        return this;
    }
    public Long getLevel() {
        return this.level;
    }

    public SubmitTraceAbJobShrinkRequest setOutputShrink(String outputShrink) {
        this.outputShrink = outputShrink;
        return this;
    }
    public String getOutputShrink() {
        return this.outputShrink;
    }

    public SubmitTraceAbJobShrinkRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public SubmitTraceAbJobShrinkRequest setTotalTime(Long totalTime) {
        this.totalTime = totalTime;
        return this;
    }
    public Long getTotalTime() {
        return this.totalTime;
    }

    public SubmitTraceAbJobShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
