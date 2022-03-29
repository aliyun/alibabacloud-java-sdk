// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class ExtractWatermarkShrinkRequest extends TeaModel {
    @NameInMap("CarrierLink")
    public String carrierLink;

    @NameInMap("ExtendParams")
    public String extendParamsShrink;

    @NameInMap("FileType")
    public String fileType;

    @NameInMap("Scene")
    public String scene;

    public static ExtractWatermarkShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ExtractWatermarkShrinkRequest self = new ExtractWatermarkShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ExtractWatermarkShrinkRequest setCarrierLink(String carrierLink) {
        this.carrierLink = carrierLink;
        return this;
    }
    public String getCarrierLink() {
        return this.carrierLink;
    }

    public ExtractWatermarkShrinkRequest setExtendParamsShrink(String extendParamsShrink) {
        this.extendParamsShrink = extendParamsShrink;
        return this;
    }
    public String getExtendParamsShrink() {
        return this.extendParamsShrink;
    }

    public ExtractWatermarkShrinkRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public ExtractWatermarkShrinkRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
