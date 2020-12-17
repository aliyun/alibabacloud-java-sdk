// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentFoodRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    @NameInMap("ReturnForm")
    public String returnForm;

    public static SegmentFoodRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentFoodRequest self = new SegmentFoodRequest();
        return TeaModel.build(map, self);
    }

    public SegmentFoodRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public SegmentFoodRequest setReturnForm(String returnForm) {
        this.returnForm = returnForm;
        return this;
    }
    public String getReturnForm() {
        return this.returnForm;
    }

}
