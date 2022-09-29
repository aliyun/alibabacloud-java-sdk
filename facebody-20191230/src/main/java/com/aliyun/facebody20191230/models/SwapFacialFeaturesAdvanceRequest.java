// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class SwapFacialFeaturesAdvanceRequest extends TeaModel {
    @NameInMap("EditPart")
    public String editPart;

    @NameInMap("SourceImageData")
    public byte[] sourceImageData;

    @NameInMap("SourceImageURL")
    public java.io.InputStream sourceImageURLObject;

    @NameInMap("TargetImageData")
    public byte[] targetImageData;

    @NameInMap("TargetImageURL")
    public java.io.InputStream targetImageURLObject;

    public static SwapFacialFeaturesAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SwapFacialFeaturesAdvanceRequest self = new SwapFacialFeaturesAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public SwapFacialFeaturesAdvanceRequest setEditPart(String editPart) {
        this.editPart = editPart;
        return this;
    }
    public String getEditPart() {
        return this.editPart;
    }

    public SwapFacialFeaturesAdvanceRequest setSourceImageData(byte[] sourceImageData) {
        this.sourceImageData = sourceImageData;
        return this;
    }
    public byte[] getSourceImageData() {
        return this.sourceImageData;
    }

    public SwapFacialFeaturesAdvanceRequest setSourceImageURLObject(java.io.InputStream sourceImageURLObject) {
        this.sourceImageURLObject = sourceImageURLObject;
        return this;
    }
    public java.io.InputStream getSourceImageURLObject() {
        return this.sourceImageURLObject;
    }

    public SwapFacialFeaturesAdvanceRequest setTargetImageData(byte[] targetImageData) {
        this.targetImageData = targetImageData;
        return this;
    }
    public byte[] getTargetImageData() {
        return this.targetImageData;
    }

    public SwapFacialFeaturesAdvanceRequest setTargetImageURLObject(java.io.InputStream targetImageURLObject) {
        this.targetImageURLObject = targetImageURLObject;
        return this;
    }
    public java.io.InputStream getTargetImageURLObject() {
        return this.targetImageURLObject;
    }

}
