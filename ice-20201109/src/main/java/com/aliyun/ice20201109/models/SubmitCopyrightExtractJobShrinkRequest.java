// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitCopyrightExtractJobShrinkRequest extends TeaModel {
    /**
     * <p>The video file from which the watermark is to be extracted.</p>
     * <blockquote>
     * <ul>
     * <li>The region of the OSS file or media asset must be the same as the region of the current IMS instance.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public String inputShrink;

    /**
     * <p>The watermark job parameters in JSON string format. The following parameters are supported:</p>
     * <ul>
     * <li><p>algoType: the algorithm type. Default value: v1. The extraction algorithm type must be the same as the algorithm type used for embedding.</p>
     * <ul>
     * <li>v1: the copyright extraction API operation for long videos.</li>
     * <li>v2: the copyright extraction API operation for short videos.</li>
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
     * <p>The custom user data. The maximum length is 1,024 bytes.</p>
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
