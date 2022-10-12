// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentCommodityAdvanceRequest extends TeaModel {
    @NameInMap("ImageURL")
    public java.io.InputStream imageURLObject;

    @NameInMap("ReturnForm")
    public String returnForm;

    public static SegmentCommodityAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentCommodityAdvanceRequest self = new SegmentCommodityAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public SegmentCommodityAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

    public SegmentCommodityAdvanceRequest setReturnForm(String returnForm) {
        this.returnForm = returnForm;
        return this;
    }
    public String getReturnForm() {
        return this.returnForm;
    }

}
