// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aigen20240111.models;

import com.aliyun.tea.*;

public class InteractiveScribbleSegmentationAdvanceRequest extends TeaModel {
    @NameInMap("EdgeFeathering")
    public String edgeFeathering;

    @NameInMap("ImageUrl")
    public java.io.InputStream imageUrlObject;

    @NameInMap("IntegratedMaskUrl")
    public java.io.InputStream integratedMaskUrlObject;

    @NameInMap("MaskImageUrl")
    public java.io.InputStream maskImageUrlObject;

    @NameInMap("NegScribbleImageUrl")
    public java.io.InputStream negScribbleImageUrlObject;

    @NameInMap("PosScribbleImageUrl")
    public java.io.InputStream posScribbleImageUrlObject;

    @NameInMap("PostprocessOption")
    public String postprocessOption;

    @NameInMap("ReturnForm")
    public String returnForm;

    @NameInMap("ReturnFormat")
    public String returnFormat;

    public static InteractiveScribbleSegmentationAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        InteractiveScribbleSegmentationAdvanceRequest self = new InteractiveScribbleSegmentationAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public InteractiveScribbleSegmentationAdvanceRequest setEdgeFeathering(String edgeFeathering) {
        this.edgeFeathering = edgeFeathering;
        return this;
    }
    public String getEdgeFeathering() {
        return this.edgeFeathering;
    }

    public InteractiveScribbleSegmentationAdvanceRequest setImageUrlObject(java.io.InputStream imageUrlObject) {
        this.imageUrlObject = imageUrlObject;
        return this;
    }
    public java.io.InputStream getImageUrlObject() {
        return this.imageUrlObject;
    }

    public InteractiveScribbleSegmentationAdvanceRequest setIntegratedMaskUrlObject(java.io.InputStream integratedMaskUrlObject) {
        this.integratedMaskUrlObject = integratedMaskUrlObject;
        return this;
    }
    public java.io.InputStream getIntegratedMaskUrlObject() {
        return this.integratedMaskUrlObject;
    }

    public InteractiveScribbleSegmentationAdvanceRequest setMaskImageUrlObject(java.io.InputStream maskImageUrlObject) {
        this.maskImageUrlObject = maskImageUrlObject;
        return this;
    }
    public java.io.InputStream getMaskImageUrlObject() {
        return this.maskImageUrlObject;
    }

    public InteractiveScribbleSegmentationAdvanceRequest setNegScribbleImageUrlObject(java.io.InputStream negScribbleImageUrlObject) {
        this.negScribbleImageUrlObject = negScribbleImageUrlObject;
        return this;
    }
    public java.io.InputStream getNegScribbleImageUrlObject() {
        return this.negScribbleImageUrlObject;
    }

    public InteractiveScribbleSegmentationAdvanceRequest setPosScribbleImageUrlObject(java.io.InputStream posScribbleImageUrlObject) {
        this.posScribbleImageUrlObject = posScribbleImageUrlObject;
        return this;
    }
    public java.io.InputStream getPosScribbleImageUrlObject() {
        return this.posScribbleImageUrlObject;
    }

    public InteractiveScribbleSegmentationAdvanceRequest setPostprocessOption(String postprocessOption) {
        this.postprocessOption = postprocessOption;
        return this;
    }
    public String getPostprocessOption() {
        return this.postprocessOption;
    }

    public InteractiveScribbleSegmentationAdvanceRequest setReturnForm(String returnForm) {
        this.returnForm = returnForm;
        return this;
    }
    public String getReturnForm() {
        return this.returnForm;
    }

    public InteractiveScribbleSegmentationAdvanceRequest setReturnFormat(String returnFormat) {
        this.returnFormat = returnFormat;
        return this;
    }
    public String getReturnFormat() {
        return this.returnFormat;
    }

}
