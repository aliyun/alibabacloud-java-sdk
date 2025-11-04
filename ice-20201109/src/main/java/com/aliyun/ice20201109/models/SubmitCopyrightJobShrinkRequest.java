// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitCopyrightJobShrinkRequest extends TeaModel {
    /**
     * <p>The description of the watermark.</p>
     * 
     * <strong>example:</strong>
     * <p>Description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The source video file that you want to add a watermark to.</p>
     * <blockquote>
     * <p>The OSS object or media asset must reside in the same region as the IMS service region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Bucket&quot;:&quot;example-bucket&quot;,&quot;Location&quot;:&quot;oss-cn-shanghai&quot;,&quot;Object&quot;:&quot;example.mp4&quot;}</p>
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
     * <p>The information about the watermark to be added.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Test</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The URL of the output file.</p>
     * <blockquote>
     * <p>The OSS bucket must reside in the same region as the IMS service region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Bucket&quot;:&quot;example-bucket&quot;,&quot;Location&quot;:&quot;oss-cn-shanghai&quot;,&quot;Object&quot;:&quot;example_result.mp4&quot;}</p>
     */
    @NameInMap("Output")
    public String outputShrink;

    /**
     * <p>The parameters related to watermark jobs. The value is a JSON string. Supported parameter:</p>
     * <ul>
     * <li><p>algoType: the algorithm type. Default value: v1.</p>
     * <ul>
     * <li>v1: watermarking for long videos that last at least 3 minutes.</li>
     * <li>v2: watermarking for videos shorter than 3 minutes.</li>
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
     * <p>The start time of the watermark. Unit: seconds. If you do not specify this parameter, the default value 0 is used.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The end time of the watermark. Unit: seconds. If you do not specify this parameter, the default value is the video duration.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
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
