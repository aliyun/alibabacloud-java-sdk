// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ErasePersonAdvanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageenhan/ErasePerson/ErasePerson1.jpg">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageenhan/ErasePerson/ErasePerson1.jpg</a></p>
     */
    @NameInMap("ImageURL")
    public java.io.InputStream imageURLObject;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageenhan/ErasePerson/ErasePerson6.jpg">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageenhan/ErasePerson/ErasePerson6.jpg</a></p>
     */
    @NameInMap("UserMask")
    public java.io.InputStream userMaskObject;

    public static ErasePersonAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ErasePersonAdvanceRequest self = new ErasePersonAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public ErasePersonAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

    public ErasePersonAdvanceRequest setUserMaskObject(java.io.InputStream userMaskObject) {
        this.userMaskObject = userMaskObject;
        return this;
    }
    public java.io.InputStream getUserMaskObject() {
        return this.userMaskObject;
    }

}
