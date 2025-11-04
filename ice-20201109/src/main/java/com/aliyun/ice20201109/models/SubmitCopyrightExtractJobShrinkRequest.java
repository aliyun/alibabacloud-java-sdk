// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitCopyrightExtractJobShrinkRequest extends TeaModel {
    /**
     * <p>The source video file from which to extract the watermark.</p>
     * <blockquote>
     * <p>The OSS object or media asset must reside in the same region as the IMS service region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public String inputShrink;

    /**
     * <p>Additional parameters for the watermark job, provided as a JSON string. Supported parameter:</p>
     * <ul>
     * <li><p>algoType: The algorithm type. Defaults to v1. The extraction algorithm must match the one used for embedding.</p>
     * <ul>
     * <li>v1: Copyright watermark extraction algorithm for long videos.</li>
     * <li>v2: Copyright watermark extraction algorithm for short videos.</li>
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
     * <p>The custom data, which can be up to 1,024 bytes in size.</p>
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
