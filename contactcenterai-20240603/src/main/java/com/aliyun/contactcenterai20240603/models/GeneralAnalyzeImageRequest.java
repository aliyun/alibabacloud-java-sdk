// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.contactcenterai20240603.models;

import com.aliyun.tea.*;

public class GeneralAnalyzeImageRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Analyze the content in the image</p>
     */
    @NameInMap("customPrompt")
    public String customPrompt;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("imageUrls")
    public java.util.List<String> imageUrls;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("stream")
    public Boolean stream;

    @NameInMap("templateIds")
    public java.util.List<Long> templateIds;

    public static GeneralAnalyzeImageRequest build(java.util.Map<String, ?> map) throws Exception {
        GeneralAnalyzeImageRequest self = new GeneralAnalyzeImageRequest();
        return TeaModel.build(map, self);
    }

    public GeneralAnalyzeImageRequest setCustomPrompt(String customPrompt) {
        this.customPrompt = customPrompt;
        return this;
    }
    public String getCustomPrompt() {
        return this.customPrompt;
    }

    public GeneralAnalyzeImageRequest setImageUrls(java.util.List<String> imageUrls) {
        this.imageUrls = imageUrls;
        return this;
    }
    public java.util.List<String> getImageUrls() {
        return this.imageUrls;
    }

    public GeneralAnalyzeImageRequest setStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
    public Boolean getStream() {
        return this.stream;
    }

    public GeneralAnalyzeImageRequest setTemplateIds(java.util.List<Long> templateIds) {
        this.templateIds = templateIds;
        return this;
    }
    public java.util.List<Long> getTemplateIds() {
        return this.templateIds;
    }

}
