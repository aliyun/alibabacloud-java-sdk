// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectCelebrityRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://viapi-oss.oss-cn-shanghai.aliyuncs.com/doc/facebody/xxx.jpg">https://viapi-oss.oss-cn-shanghai.aliyuncs.com/doc/facebody/xxx.jpg</a></p>
     */
    @NameInMap("ImageURL")
    public String imageURL;

    public static DetectCelebrityRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectCelebrityRequest self = new DetectCelebrityRequest();
        return TeaModel.build(map, self);
    }

    public DetectCelebrityRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
