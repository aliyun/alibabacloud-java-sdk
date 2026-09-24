// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class PetHealthAnalysisShrinkRequest extends TeaModel {
    /**
     * <p>The list of HTTPS URLs of images to analyze. At least one accessible image must be provided.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ImageUrl")
    public String imageUrlShrink;

    /**
     * <p>The system prompt used to specify the response role or requirements. The value must comply with JSON string escaping rules.</p>
     * 
     * <strong>example:</strong>
     * <p>You are a professional veterinarian</p>
     */
    @NameInMap("SystemPrompt")
    public String systemPrompt;

    /**
     * <p>The custom analysis requirement. If not specified or set to an empty string, excrement analysis is performed by default. The value must comply with JSON string escaping rules.</p>
     * 
     * <strong>example:</strong>
     * <p>Please analyze the health condition of this pet</p>
     */
    @NameInMap("UserPrompt")
    public String userPrompt;

    public static PetHealthAnalysisShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PetHealthAnalysisShrinkRequest self = new PetHealthAnalysisShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PetHealthAnalysisShrinkRequest setImageUrlShrink(String imageUrlShrink) {
        this.imageUrlShrink = imageUrlShrink;
        return this;
    }
    public String getImageUrlShrink() {
        return this.imageUrlShrink;
    }

    public PetHealthAnalysisShrinkRequest setSystemPrompt(String systemPrompt) {
        this.systemPrompt = systemPrompt;
        return this;
    }
    public String getSystemPrompt() {
        return this.systemPrompt;
    }

    public PetHealthAnalysisShrinkRequest setUserPrompt(String userPrompt) {
        this.userPrompt = userPrompt;
        return this;
    }
    public String getUserPrompt() {
        return this.userPrompt;
    }

}
