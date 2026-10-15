// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class PetHealthAnalysisRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ImageUrl")
    public java.util.List<String> imageUrl;

    /**
     * <strong>example:</strong>
     * <p>你是一名专业的宠物医生</p>
     */
    @NameInMap("SystemPrompt")
    public String systemPrompt;

    /**
     * <strong>example:</strong>
     * <p>请分析这只宠物的健康状况</p>
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
