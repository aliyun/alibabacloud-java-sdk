// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class EmbedWatermarkShrinkRequest extends TeaModel {
    @NameInMap("CarrierLink")
    public String carrierLink;

    @NameInMap("ExtendParams")
    public String extendParamsShrink;

    @NameInMap("FileType")
    public String fileType;

    @NameInMap("InvisibleText")
    public String invisibleText;

    @NameInMap("MarkMode")
    public String markMode;

    @NameInMap("Scene")
    public String scene;

    @NameInMap("VisibleText")
    public String visibleText;

    public static EmbedWatermarkShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        EmbedWatermarkShrinkRequest self = new EmbedWatermarkShrinkRequest();
        return TeaModel.build(map, self);
    }

    public EmbedWatermarkShrinkRequest setCarrierLink(String carrierLink) {
        this.carrierLink = carrierLink;
        return this;
    }
    public String getCarrierLink() {
        return this.carrierLink;
    }

    public EmbedWatermarkShrinkRequest setExtendParamsShrink(String extendParamsShrink) {
        this.extendParamsShrink = extendParamsShrink;
        return this;
    }
    public String getExtendParamsShrink() {
        return this.extendParamsShrink;
    }

    public EmbedWatermarkShrinkRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public EmbedWatermarkShrinkRequest setInvisibleText(String invisibleText) {
        this.invisibleText = invisibleText;
        return this;
    }
    public String getInvisibleText() {
        return this.invisibleText;
    }

    public EmbedWatermarkShrinkRequest setMarkMode(String markMode) {
        this.markMode = markMode;
        return this;
    }
    public String getMarkMode() {
        return this.markMode;
    }

    public EmbedWatermarkShrinkRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public EmbedWatermarkShrinkRequest setVisibleText(String visibleText) {
        this.visibleText = visibleText;
        return this;
    }
    public String getVisibleText() {
        return this.visibleText;
    }

}
