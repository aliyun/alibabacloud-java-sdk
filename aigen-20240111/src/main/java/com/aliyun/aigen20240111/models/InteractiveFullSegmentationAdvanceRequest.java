// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aigen20240111.models;

import com.aliyun.tea.*;

public class InteractiveFullSegmentationAdvanceRequest extends TeaModel {
    @NameInMap("ImageUrl")
    public java.io.InputStream imageUrlObject;

    @NameInMap("ReturnFormat")
    public String returnFormat;

    public static InteractiveFullSegmentationAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        InteractiveFullSegmentationAdvanceRequest self = new InteractiveFullSegmentationAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public InteractiveFullSegmentationAdvanceRequest setImageUrlObject(java.io.InputStream imageUrlObject) {
        this.imageUrlObject = imageUrlObject;
        return this;
    }
    public java.io.InputStream getImageUrlObject() {
        return this.imageUrlObject;
    }

    public InteractiveFullSegmentationAdvanceRequest setReturnFormat(String returnFormat) {
        this.returnFormat = returnFormat;
        return this;
    }
    public String getReturnFormat() {
        return this.returnFormat;
    }

}
