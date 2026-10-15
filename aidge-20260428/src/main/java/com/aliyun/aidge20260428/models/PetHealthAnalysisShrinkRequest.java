// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class PetHealthAnalysisShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ImageUrl")
    public String imageUrlShrink;

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
