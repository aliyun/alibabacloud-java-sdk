// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentClothAdvanceRequest extends TeaModel {
    @NameInMap("ClothClass")
    public java.util.List<String> clothClass;

    @NameInMap("ImageURL")
    public java.io.InputStream imageURLObject;

    @NameInMap("ReturnForm")
    public String returnForm;

    public static SegmentClothAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentClothAdvanceRequest self = new SegmentClothAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public SegmentClothAdvanceRequest setClothClass(java.util.List<String> clothClass) {
        this.clothClass = clothClass;
        return this;
    }
    public java.util.List<String> getClothClass() {
        return this.clothClass;
    }

    public SegmentClothAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

    public SegmentClothAdvanceRequest setReturnForm(String returnForm) {
        this.returnForm = returnForm;
        return this;
    }
    public String getReturnForm() {
        return this.returnForm;
    }

}
