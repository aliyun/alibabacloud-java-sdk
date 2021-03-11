// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class SwapFacialFeaturesRequest extends TeaModel {
    @NameInMap("EditPart")
    public String editPart;

    @NameInMap("SourceImageURL")
    public String sourceImageURL;

    @NameInMap("TargetImageURL")
    public String targetImageURL;

    @NameInMap("SourceImageData")
    public byte[] sourceImageData;

    @NameInMap("TargetImageData")
    public byte[] targetImageData;

    public static SwapFacialFeaturesRequest build(java.util.Map<String, ?> map) throws Exception {
        SwapFacialFeaturesRequest self = new SwapFacialFeaturesRequest();
        return TeaModel.build(map, self);
    }

    public SwapFacialFeaturesRequest setEditPart(String editPart) {
        this.editPart = editPart;
        return this;
    }
    public String getEditPart() {
        return this.editPart;
    }

    public SwapFacialFeaturesRequest setSourceImageURL(String sourceImageURL) {
        this.sourceImageURL = sourceImageURL;
        return this;
    }
    public String getSourceImageURL() {
        return this.sourceImageURL;
    }

    public SwapFacialFeaturesRequest setTargetImageURL(String targetImageURL) {
        this.targetImageURL = targetImageURL;
        return this;
    }
    public String getTargetImageURL() {
        return this.targetImageURL;
    }

    public SwapFacialFeaturesRequest setSourceImageData(byte[] sourceImageData) {
        this.sourceImageData = sourceImageData;
        return this;
    }
    public byte[] getSourceImageData() {
        return this.sourceImageData;
    }

    public SwapFacialFeaturesRequest setTargetImageData(byte[] targetImageData) {
        this.targetImageData = targetImageData;
        return this;
    }
    public byte[] getTargetImageData() {
        return this.targetImageData;
    }

}
