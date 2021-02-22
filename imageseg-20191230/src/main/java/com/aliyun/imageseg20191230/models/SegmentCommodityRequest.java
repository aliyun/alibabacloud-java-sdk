// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentCommodityRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    @NameInMap("ReturnForm")
    public String returnForm;

    public static SegmentCommodityRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentCommodityRequest self = new SegmentCommodityRequest();
        return TeaModel.build(map, self);
    }

    public SegmentCommodityRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public SegmentCommodityRequest setReturnForm(String returnForm) {
        this.returnForm = returnForm;
        return this;
    }
    public String getReturnForm() {
        return this.returnForm;
    }

}
