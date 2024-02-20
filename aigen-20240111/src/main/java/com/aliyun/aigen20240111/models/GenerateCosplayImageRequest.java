// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aigen20240111.models;

import com.aliyun.tea.*;

public class GenerateCosplayImageRequest extends TeaModel {
    @NameInMap("FaceImageUrl")
    public String faceImageUrl;

    @NameInMap("Style")
    public Long style;

    @NameInMap("TemplateImageUrl")
    public String templateImageUrl;

    public static GenerateCosplayImageRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateCosplayImageRequest self = new GenerateCosplayImageRequest();
        return TeaModel.build(map, self);
    }

    public GenerateCosplayImageRequest setFaceImageUrl(String faceImageUrl) {
        this.faceImageUrl = faceImageUrl;
        return this;
    }
    public String getFaceImageUrl() {
        return this.faceImageUrl;
    }

    public GenerateCosplayImageRequest setStyle(Long style) {
        this.style = style;
        return this;
    }
    public Long getStyle() {
        return this.style;
    }

    public GenerateCosplayImageRequest setTemplateImageUrl(String templateImageUrl) {
        this.templateImageUrl = templateImageUrl;
        return this;
    }
    public String getTemplateImageUrl() {
        return this.templateImageUrl;
    }

}
