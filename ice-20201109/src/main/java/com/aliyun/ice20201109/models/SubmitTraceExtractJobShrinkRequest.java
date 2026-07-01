// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitTraceExtractJobShrinkRequest extends TeaModel {
    /**
     * <p>The input video from which to extract the watermark.</p>
     * <blockquote>
     * <ul>
     * <li>The OSS object or media asset must be in the same region as your IMS service.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public String inputShrink;

    /**
     * <p>Extraction job parameters, specified as a JSON string. The following parameters are supported:</p>
     * <ul>
     * <li><p><code>m3u8Type</code>: The algorithm type. The default value is <code>v1</code>.</p>
     * <ul>
     * <li><p><code>v1</code>: Extracts an m3u8 playlist with absolute paths.</p>
     * </li>
     * <li><p><code>v2</code>: Extracts an m3u8 playlist with relative paths.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;m3u8Type&quot;:&quot;v1&quot;}</p>
     */
    @NameInMap("Params")
    public String params;

    /**
     * <p>The user-defined data. Maximum length: 1,024 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitTraceExtractJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitTraceExtractJobShrinkRequest self = new SubmitTraceExtractJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitTraceExtractJobShrinkRequest setInputShrink(String inputShrink) {
        this.inputShrink = inputShrink;
        return this;
    }
    public String getInputShrink() {
        return this.inputShrink;
    }

    public SubmitTraceExtractJobShrinkRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public SubmitTraceExtractJobShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
