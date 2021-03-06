// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentSceneRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    public static SegmentSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentSceneRequest self = new SegmentSceneRequest();
        return TeaModel.build(map, self);
    }

    public SegmentSceneRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
