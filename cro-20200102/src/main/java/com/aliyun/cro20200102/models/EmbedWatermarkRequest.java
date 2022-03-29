// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class EmbedWatermarkRequest extends TeaModel {
    @NameInMap("CarrierLink")
    public String carrierLink;

    @NameInMap("ExtendParams")
    public java.util.Map<String, ?> extendParams;

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

    public static EmbedWatermarkRequest build(java.util.Map<String, ?> map) throws Exception {
        EmbedWatermarkRequest self = new EmbedWatermarkRequest();
        return TeaModel.build(map, self);
    }

    public EmbedWatermarkRequest setCarrierLink(String carrierLink) {
        this.carrierLink = carrierLink;
        return this;
    }
    public String getCarrierLink() {
        return this.carrierLink;
    }

    public EmbedWatermarkRequest setExtendParams(java.util.Map<String, ?> extendParams) {
        this.extendParams = extendParams;
        return this;
    }
    public java.util.Map<String, ?> getExtendParams() {
        return this.extendParams;
    }

    public EmbedWatermarkRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public EmbedWatermarkRequest setInvisibleText(String invisibleText) {
        this.invisibleText = invisibleText;
        return this;
    }
    public String getInvisibleText() {
        return this.invisibleText;
    }

    public EmbedWatermarkRequest setMarkMode(String markMode) {
        this.markMode = markMode;
        return this;
    }
    public String getMarkMode() {
        return this.markMode;
    }

    public EmbedWatermarkRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public EmbedWatermarkRequest setVisibleText(String visibleText) {
        this.visibleText = visibleText;
        return this;
    }
    public String getVisibleText() {
        return this.visibleText;
    }

}
