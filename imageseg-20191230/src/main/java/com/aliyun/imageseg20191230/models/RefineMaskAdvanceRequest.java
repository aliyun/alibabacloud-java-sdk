// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class RefineMaskAdvanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageseg/RefineMask/RefineMask1.jpg">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageseg/RefineMask/RefineMask1.jpg</a></p>
     */
    @NameInMap("ImageURL")
    public java.io.InputStream imageURLObject;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageseg/RefineMask/RefineMask6.jpg">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageseg/RefineMask/RefineMask6.jpg</a></p>
     */
    @NameInMap("MaskImageURL")
    public java.io.InputStream maskImageURLObject;

    public static RefineMaskAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RefineMaskAdvanceRequest self = new RefineMaskAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public RefineMaskAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

    public RefineMaskAdvanceRequest setMaskImageURLObject(java.io.InputStream maskImageURLObject) {
        this.maskImageURLObject = maskImageURLObject;
        return this;
    }
    public java.io.InputStream getMaskImageURLObject() {
        return this.maskImageURLObject;
    }

}
