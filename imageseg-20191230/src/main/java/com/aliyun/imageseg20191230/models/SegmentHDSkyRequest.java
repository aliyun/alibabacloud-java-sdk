// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentHDSkyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageseg/SegmentHDSky/SegmentHDSky4.jpg">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageseg/SegmentHDSky/SegmentHDSky4.jpg</a></p>
     */
    @NameInMap("ImageURL")
    public String imageURL;

    public static SegmentHDSkyRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentHDSkyRequest self = new SegmentHDSkyRequest();
        return TeaModel.build(map, self);
    }

    public SegmentHDSkyRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
