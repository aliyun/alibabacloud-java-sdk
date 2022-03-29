// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class ExtractWatermarkRequest extends TeaModel {
    @NameInMap("CarrierLink")
    public String carrierLink;

    @NameInMap("ExtendParams")
    public java.util.Map<String, ?> extendParams;

    @NameInMap("FileType")
    public String fileType;

    @NameInMap("Scene")
    public String scene;

    public static ExtractWatermarkRequest build(java.util.Map<String, ?> map) throws Exception {
        ExtractWatermarkRequest self = new ExtractWatermarkRequest();
        return TeaModel.build(map, self);
    }

    public ExtractWatermarkRequest setCarrierLink(String carrierLink) {
        this.carrierLink = carrierLink;
        return this;
    }
    public String getCarrierLink() {
        return this.carrierLink;
    }

    public ExtractWatermarkRequest setExtendParams(java.util.Map<String, ?> extendParams) {
        this.extendParams = extendParams;
        return this;
    }
    public java.util.Map<String, ?> getExtendParams() {
        return this.extendParams;
    }

    public ExtractWatermarkRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public ExtractWatermarkRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
