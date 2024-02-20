// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aigen20240111.models;

import com.aliyun.tea.*;

public class InteractiveFullSegmentationRequest extends TeaModel {
    @NameInMap("ImageUrl")
    public String imageUrl;

    @NameInMap("ReturnFormat")
    public String returnFormat;

    public static InteractiveFullSegmentationRequest build(java.util.Map<String, ?> map) throws Exception {
        InteractiveFullSegmentationRequest self = new InteractiveFullSegmentationRequest();
        return TeaModel.build(map, self);
    }

    public InteractiveFullSegmentationRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public InteractiveFullSegmentationRequest setReturnFormat(String returnFormat) {
        this.returnFormat = returnFormat;
        return this;
    }
    public String getReturnFormat() {
        return this.returnFormat;
    }

}
