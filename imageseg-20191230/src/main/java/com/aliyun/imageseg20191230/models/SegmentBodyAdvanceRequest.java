// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentBodyAdvanceRequest extends TeaModel {
    @NameInMap("ImageURL")
    public java.io.InputStream imageURLObject;

    @NameInMap("ReturnForm")
    public String returnForm;

    public static SegmentBodyAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentBodyAdvanceRequest self = new SegmentBodyAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public SegmentBodyAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

    public SegmentBodyAdvanceRequest setReturnForm(String returnForm) {
        this.returnForm = returnForm;
        return this;
    }
    public String getReturnForm() {
        return this.returnForm;
    }

}
