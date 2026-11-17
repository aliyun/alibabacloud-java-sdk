// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class DescribeShareImageRequest extends TeaModel {
    /**
     * <p>The image ID.</p>
     * 
     * <strong>example:</strong>
     * <p>img-bp13mu****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    public static DescribeShareImageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeShareImageRequest self = new DescribeShareImageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeShareImageRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

}
