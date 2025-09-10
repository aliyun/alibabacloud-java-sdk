// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.goodstech20191230.models;

import com.aliyun.tea.*;

public class ClassifyCommodityAdvanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/goodstech/ClassifyCommodity/ClassifyCommodity1.jpg">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/goodstech/ClassifyCommodity/ClassifyCommodity1.jpg</a></p>
     */
    @NameInMap("ImageURL")
    public java.io.InputStream imageURLObject;

    public static ClassifyCommodityAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ClassifyCommodityAdvanceRequest self = new ClassifyCommodityAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public ClassifyCommodityAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

}
