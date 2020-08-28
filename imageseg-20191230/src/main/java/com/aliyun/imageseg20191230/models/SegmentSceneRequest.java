// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentSceneRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    public static SegmentSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentSceneRequest self = new SegmentSceneRequest();
        return TeaModel.build(map, self);
    }

}
