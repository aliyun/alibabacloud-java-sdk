// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectBodyCountRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/facebody/DetectBodyCount/DetectBodyCount3.jpg">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/facebody/DetectBodyCount/DetectBodyCount3.jpg</a></p>
     */
    @NameInMap("ImageURL")
    public String imageURL;

    public static DetectBodyCountRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectBodyCountRequest self = new DetectBodyCountRequest();
        return TeaModel.build(map, self);
    }

    public DetectBodyCountRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
