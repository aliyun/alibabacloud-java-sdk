// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class PetHealthAnalysisRequest extends TeaModel {
    /**
     * <p>The list of HTTPS URLs of images to analyze. At least one accessible image must be provided.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ImageUrl")
    public java.util.List<String> imageUrl;

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

    public static PetHealthAnalysisRequest build(java.util.Map<String, ?> map) throws Exception {
        PetHealthAnalysisRequest self = new PetHealthAnalysisRequest();
        return TeaModel.build(map, self);
    }

    public PetHealthAnalysisRequest setImageUrl(java.util.List<String> imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public java.util.List<String> getImageUrl() {
        return this.imageUrl;
    }

    public PetHealthAnalysisRequest setSystemPrompt(String systemPrompt) {
        this.systemPrompt = systemPrompt;
        return this;
    }
    public String getSystemPrompt() {
        return this.systemPrompt;
    }

    public PetHealthAnalysisRequest setUserPrompt(String userPrompt) {
        this.userPrompt = userPrompt;
        return this;
    }
    public String getUserPrompt() {
        return this.userPrompt;
    }

}
