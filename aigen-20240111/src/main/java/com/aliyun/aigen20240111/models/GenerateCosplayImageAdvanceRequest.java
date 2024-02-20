// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aigen20240111.models;

import com.aliyun.tea.*;

public class GenerateCosplayImageAdvanceRequest extends TeaModel {
    @NameInMap("FaceImageUrl")
    public java.io.InputStream faceImageUrlObject;

    @NameInMap("Style")
    public Long style;

    @NameInMap("TemplateImageUrl")
    public java.io.InputStream templateImageUrlObject;

    public static GenerateCosplayImageAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateCosplayImageAdvanceRequest self = new GenerateCosplayImageAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public GenerateCosplayImageAdvanceRequest setFaceImageUrlObject(java.io.InputStream faceImageUrlObject) {
        this.faceImageUrlObject = faceImageUrlObject;
        return this;
    }
    public java.io.InputStream getFaceImageUrlObject() {
        return this.faceImageUrlObject;
    }

    public GenerateCosplayImageAdvanceRequest setStyle(Long style) {
        this.style = style;
        return this;
    }
    public Long getStyle() {
        return this.style;
    }

    public GenerateCosplayImageAdvanceRequest setTemplateImageUrlObject(java.io.InputStream templateImageUrlObject) {
        this.templateImageUrlObject = templateImageUrlObject;
        return this;
    }
    public java.io.InputStream getTemplateImageUrlObject() {
        return this.templateImageUrlObject;
    }

}
