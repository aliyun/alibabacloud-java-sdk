// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentBodyRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    @NameInMap("ReturnForm")
    public String returnForm;

    public static SegmentBodyRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentBodyRequest self = new SegmentBodyRequest();
        return TeaModel.build(map, self);
    }

    public SegmentBodyRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public SegmentBodyRequest setReturnForm(String returnForm) {
        this.returnForm = returnForm;
        return this;
    }
    public String getReturnForm() {
        return this.returnForm;
    }

}
