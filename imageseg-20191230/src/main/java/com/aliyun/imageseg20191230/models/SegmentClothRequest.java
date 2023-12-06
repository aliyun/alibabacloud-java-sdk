// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentClothRequest extends TeaModel {
    @NameInMap("ClothClass")
    public java.util.List<String> clothClass;

    @NameInMap("ImageURL")
    public String imageURL;

    @NameInMap("ReturnForm")
    public String returnForm;

    public static SegmentClothRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentClothRequest self = new SegmentClothRequest();
        return TeaModel.build(map, self);
    }

    public SegmentClothRequest setClothClass(java.util.List<String> clothClass) {
        this.clothClass = clothClass;
        return this;
    }
    public java.util.List<String> getClothClass() {
        return this.clothClass;
    }

    public SegmentClothRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public SegmentClothRequest setReturnForm(String returnForm) {
        this.returnForm = returnForm;
        return this;
    }
    public String getReturnForm() {
        return this.returnForm;
    }

}
