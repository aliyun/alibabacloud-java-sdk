// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitCopyrightExtractJobShrinkRequest extends TeaModel {
    /**
     * <p>The video file for watermark extraction.</p>
     * <blockquote>
     * <ul>
     * <li>The region of the Object Storage Service (OSS) file or media asset must match the region of the current Intelligent Media Service (IMS) instance.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public String inputShrink;

    /**
     * <p>The watermark job parameters, specified as a JSON string.</p>
     * <ul>
     * <li><p>algoType: The algorithm type. Default value: v1. The extraction algorithm type must match the algorithm type used for embedding the watermark.</p>
     * <ul>
     * <li><p>v1: The copyright extraction algorithm for long-form videos.</p>
     * </li>
     * <li><p>v2: The copyright extraction algorithm for short-form videos.</p>
     * </li>
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
     * <p>The user-defined data. The maximum length is 1,024 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitCopyrightExtractJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitCopyrightExtractJobShrinkRequest self = new SubmitCopyrightExtractJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitCopyrightExtractJobShrinkRequest setInputShrink(String inputShrink) {
        this.inputShrink = inputShrink;
        return this;
    }
    public String getInputShrink() {
        return this.inputShrink;
    }

    public SubmitCopyrightExtractJobShrinkRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public SubmitCopyrightExtractJobShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
