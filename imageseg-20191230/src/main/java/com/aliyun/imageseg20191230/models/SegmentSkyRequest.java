// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentSkyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageseg/SegmentSky/SegmentSky5.jpg">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageseg/SegmentSky/SegmentSky5.jpg</a></p>
     */
    @NameInMap("ImageURL")
    public String imageURL;

    public static SegmentSkyRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentSkyRequest self = new SegmentSkyRequest();
        return TeaModel.build(map, self);
    }

    public SegmentSkyRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
