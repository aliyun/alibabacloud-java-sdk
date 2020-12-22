// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class SwapFacialFeaturesAdvanceRequest extends TeaModel {
    @NameInMap("SourceImageURLObject")
    @Validation(required = true)
    public java.io.InputStream sourceImageURLObject;

    @NameInMap("EditPart")
    public String editPart;

    @NameInMap("TargetImageURL")
    public String targetImageURL;

    public static SwapFacialFeaturesAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SwapFacialFeaturesAdvanceRequest self = new SwapFacialFeaturesAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public SwapFacialFeaturesAdvanceRequest setSourceImageURLObject(java.io.InputStream sourceImageURLObject) {
        this.sourceImageURLObject = sourceImageURLObject;
        return this;
    }
    public java.io.InputStream getSourceImageURLObject() {
        return this.sourceImageURLObject;
    }

    public SwapFacialFeaturesAdvanceRequest setEditPart(String editPart) {
        this.editPart = editPart;
        return this;
    }
    public String getEditPart() {
        return this.editPart;
    }

    public SwapFacialFeaturesAdvanceRequest setTargetImageURL(String targetImageURL) {
        this.targetImageURL = targetImageURL;
        return this;
    }
    public String getTargetImageURL() {
        return this.targetImageURL;
    }

}
