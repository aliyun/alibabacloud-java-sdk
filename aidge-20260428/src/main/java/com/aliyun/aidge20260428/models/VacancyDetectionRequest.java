// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class VacancyDetectionRequest extends TeaModel {
    /**
     * <p>The HTTPS URL of the single image to be detected. Arrays or other image encodings are not supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/shelf.jpg">https://example.com/shelf.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The optional system prompt.</p>
     * 
     * <strong>example:</strong>
     * <p>You are a helpful assistant.</p>
     */
    @NameInMap("SystemPrompt")
    public String systemPrompt;

    /**
     * <p>The optional user prompt. If left empty, the full empty space detection prompt is used. Plain text and JSON that contains only text in messages/content are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Detect empty spaces and underfilled areas on the shelf</p>
     */
    @NameInMap("UserPrompt")
    public String userPrompt;

    public static VacancyDetectionRequest build(java.util.Map<String, ?> map) throws Exception {
        VacancyDetectionRequest self = new VacancyDetectionRequest();
        return TeaModel.build(map, self);
    }

    public VacancyDetectionRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public VacancyDetectionRequest setSystemPrompt(String systemPrompt) {
        this.systemPrompt = systemPrompt;
        return this;
    }
    public String getSystemPrompt() {
        return this.systemPrompt;
    }

    public VacancyDetectionRequest setUserPrompt(String userPrompt) {
        this.userPrompt = userPrompt;
        return this;
    }
    public String getUserPrompt() {
        return this.userPrompt;
    }

}
