// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitTraceAbJobShrinkRequest extends TeaModel {
    /**
     * <p>The Base64-encoded encryption key.</p>
     * 
     * <strong>example:</strong>
     * <p>Qh6OdgIMcliQSI1fReOw****</p>
     */
    @NameInMap("CipherBase64ed")
    public String cipherBase64ed;

    /**
     * <p>The input video for the A/B stream forensic watermarking job.</p>
     * <blockquote>
     * <ul>
     * <li><p>The Object Storage Service (OSS) file or media asset must be in the same region where Intelligent Media Services (IMS) is deployed.</p>
     * </li>
     * <li><p>This operation supports only videos that are three minutes or longer. Using a shorter video may cause the API call to fail or produce no output.</p>
     * </li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public String inputShrink;

    /**
     * <p>The watermark level, which specifies the embedding channel. Valid values: <code>0</code> (U channel), <code>1</code> (UV channels), and <code>2</code> (YUV channels).</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Level")
    public Long level;

    /**
     * <p>The output location for the A/B stream job. This must be an OSS directory.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Output")
    public String outputShrink;

    /**
     * <p>The start time for watermark embedding, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The total duration for watermark embedding, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>360</p>
     */
    @NameInMap("TotalTime")
    public Long totalTime;

    /**
     * <p>User data to include in the request. The maximum length is 1,024 bytes.</p>
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
