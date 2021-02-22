// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentCommonImageRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    @NameInMap("ReturnForm")
    public String returnForm;

    public static SegmentCommonImageRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentCommonImageRequest self = new SegmentCommonImageRequest();
        return TeaModel.build(map, self);
    }

    public SegmentCommonImageRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public SegmentCommonImageRequest setReturnForm(String returnForm) {
        this.returnForm = returnForm;
        return this;
    }
    public String getReturnForm() {
        return this.returnForm;
    }

}
