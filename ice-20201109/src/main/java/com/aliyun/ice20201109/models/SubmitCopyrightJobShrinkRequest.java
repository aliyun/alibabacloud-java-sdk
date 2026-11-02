// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitCopyrightJobShrinkRequest extends TeaModel {
    /**
     * <p>The description of the watermark information.</p>
     * 
     * <strong>example:</strong>
     * <p>Task description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The video file to which the watermark is to be added.</p>
     * <blockquote>
     * <ul>
     * <li>The region of the OSS file or media asset must be the same as the region of the current IMS.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public String inputShrink;

    /**
     * <p>The watermark level, which indicates the embedding channel. Valid values: 0 (0u), 1 (1uv), and 2 (2yuv).</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Level")
    public Long level;

    /**
     * <p>The watermark information to be added.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Copyright watermark test</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The URL of the output file.</p>
     * <blockquote>
     * <ul>
     * <li>The region of OSS must be the same as the region of the current IMS.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Output")
    public String outputShrink;

    /**
     * <p>The parameters of the watermark job, in the JSON string format. The following parameters are supported:</p>
     * <ul>
     * <li>algoType: the algorithm type. Default value: v1.<ul>
     * <li>v1: long video copyright watermark, which supports only videos longer than 3 minutes.</li>
     * <li>v2: short video copyright watermark.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;algoType&quot;:&quot;v2&quot;}</p>
     */
    @NameInMap("Params")
    public String params;

    /**
     * <p>The start time of the watermark, in seconds. If you do not specify this parameter, the default value is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The end time of the watermark, in seconds. If you do not specify this parameter, the default value is the duration of the video.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalTime")
    public Long totalTime;

    /**
     * <p>The user-defined data, with a maximum length of 1,024 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitCopyrightJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitCopyrightJobShrinkRequest self = new SubmitCopyrightJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitCopyrightJobShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SubmitCopyrightJobShrinkRequest setInputShrink(String inputShrink) {
        this.inputShrink = inputShrink;
        return this;
    }
    public String getInputShrink() {
        return this.inputShrink;
    }

    public SubmitCopyrightJobShrinkRequest setLevel(Long level) {
        this.level = level;
        return this;
    }
    public Long getLevel() {
        return this.level;
    }

    public SubmitCopyrightJobShrinkRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitCopyrightJobShrinkRequest setOutputShrink(String outputShrink) {
        this.outputShrink = outputShrink;
        return this;
    }
    public String getOutputShrink() {
        return this.outputShrink;
    }

    public SubmitCopyrightJobShrinkRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public SubmitCopyrightJobShrinkRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public SubmitCopyrightJobShrinkRequest setTotalTime(Long totalTime) {
        this.totalTime = totalTime;
        return this;
    }
    public Long getTotalTime() {
        return this.totalTime;
    }

    public SubmitCopyrightJobShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
