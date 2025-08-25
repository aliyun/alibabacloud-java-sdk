// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class AssessExposureRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageenhan/AssessExposure/AssessExposure1.jpg">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageenhan/AssessExposure/AssessExposure1.jpg</a></p>
     */
    @NameInMap("ImageURL")
    public String imageURL;

    public static AssessExposureRequest build(java.util.Map<String, ?> map) throws Exception {
        AssessExposureRequest self = new AssessExposureRequest();
        return TeaModel.build(map, self);
    }

    public AssessExposureRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
