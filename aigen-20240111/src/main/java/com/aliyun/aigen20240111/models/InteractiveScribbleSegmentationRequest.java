// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aigen20240111.models;

import com.aliyun.tea.*;

public class InteractiveScribbleSegmentationRequest extends TeaModel {
    @NameInMap("EdgeFeathering")
    public String edgeFeathering;

    @NameInMap("ImageUrl")
    public String imageUrl;

    @NameInMap("IntegratedMaskUrl")
    public String integratedMaskUrl;

    @NameInMap("MaskImageUrl")
    public String maskImageUrl;

    @NameInMap("NegScribbleImageUrl")
    public String negScribbleImageUrl;

    @NameInMap("PosScribbleImageUrl")
    public String posScribbleImageUrl;

    @NameInMap("PostprocessOption")
    public String postprocessOption;

    @NameInMap("ReturnForm")
    public String returnForm;

    @NameInMap("ReturnFormat")
    public String returnFormat;

    public static InteractiveScribbleSegmentationRequest build(java.util.Map<String, ?> map) throws Exception {
        InteractiveScribbleSegmentationRequest self = new InteractiveScribbleSegmentationRequest();
        return TeaModel.build(map, self);
    }

    public InteractiveScribbleSegmentationRequest setEdgeFeathering(String edgeFeathering) {
        this.edgeFeathering = edgeFeathering;
        return this;
    }
    public String getEdgeFeathering() {
        return this.edgeFeathering;
    }

    public InteractiveScribbleSegmentationRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public InteractiveScribbleSegmentationRequest setIntegratedMaskUrl(String integratedMaskUrl) {
        this.integratedMaskUrl = integratedMaskUrl;
        return this;
    }
    public String getIntegratedMaskUrl() {
        return this.integratedMaskUrl;
    }

    public InteractiveScribbleSegmentationRequest setMaskImageUrl(String maskImageUrl) {
        this.maskImageUrl = maskImageUrl;
        return this;
    }
    public String getMaskImageUrl() {
        return this.maskImageUrl;
    }

    public InteractiveScribbleSegmentationRequest setNegScribbleImageUrl(String negScribbleImageUrl) {
        this.negScribbleImageUrl = negScribbleImageUrl;
        return this;
    }
    public String getNegScribbleImageUrl() {
        return this.negScribbleImageUrl;
    }

    public InteractiveScribbleSegmentationRequest setPosScribbleImageUrl(String posScribbleImageUrl) {
        this.posScribbleImageUrl = posScribbleImageUrl;
        return this;
    }
    public String getPosScribbleImageUrl() {
        return this.posScribbleImageUrl;
    }

    public InteractiveScribbleSegmentationRequest setPostprocessOption(String postprocessOption) {
        this.postprocessOption = postprocessOption;
        return this;
    }
    public String getPostprocessOption() {
        return this.postprocessOption;
    }

    public InteractiveScribbleSegmentationRequest setReturnForm(String returnForm) {
        this.returnForm = returnForm;
        return this;
    }
    public String getReturnForm() {
        return this.returnForm;
    }

    public InteractiveScribbleSegmentationRequest setReturnFormat(String returnFormat) {
        this.returnFormat = returnFormat;
        return this;
    }
    public String getReturnFormat() {
        return this.returnFormat;
    }

}
