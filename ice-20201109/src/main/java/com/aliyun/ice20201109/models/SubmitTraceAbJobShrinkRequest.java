// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitTraceAbJobShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Qh6OdgIMcliQSI1fReOw****</p>
     */
    @NameInMap("CipherBase64ed")
    public String cipherBase64ed;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public String inputShrink;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Level")
    public Long level;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Output")
    public String outputShrink;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <strong>example:</strong>
     * <p>360</p>
     */
    @NameInMap("TotalTime")
    public Long totalTime;

    /**
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
