// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitTraceExtractJobShrinkRequest extends TeaModel {
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
     * <li><p>m3u8Type: The extraction algorithm type. Defaults to v1.</p>
     * <ul>
     * <li>v1: Extracts from an M3U8 with absolute paths.</li>
     * <li>v2: Extracts from an M3U8 with relative paths.</li>
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
     * <p>The custom data, which can be up to 1,024 bytes in size.</p>
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
