// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectPedestrianRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/facebody/DetectPedestrian/DetectPedestrian8.jpg">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/facebody/DetectPedestrian/DetectPedestrian8.jpg</a></p>
     */
    @NameInMap("ImageURL")
    public String imageURL;

    public static DetectPedestrianRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectPedestrianRequest self = new DetectPedestrianRequest();
        return TeaModel.build(map, self);
    }

    public DetectPedestrianRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
