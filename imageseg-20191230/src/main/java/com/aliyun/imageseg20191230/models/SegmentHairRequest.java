// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentHairRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageseg/SegmentHair/SegmentHair1.jpg">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageseg/SegmentHair/SegmentHair1.jpg</a></p>
     */
    @NameInMap("ImageURL")
    public String imageURL;

    public static SegmentHairRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentHairRequest self = new SegmentHairRequest();
        return TeaModel.build(map, self);
    }

    public SegmentHairRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
