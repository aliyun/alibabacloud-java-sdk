// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class GenerateCartoonizedImageAdvanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>girl</p>
     */
    @NameInMap("ImageType")
    public String imageType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://viapi-test.oss-cn-shanghai.aliyuncs.com/test-team/zhangchaorun/1025.jpg">https://viapi-test.oss-cn-shanghai.aliyuncs.com/test-team/zhangchaorun/1025.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public java.io.InputStream imageUrlObject;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Index")
    public String index;

    public static GenerateCartoonizedImageAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateCartoonizedImageAdvanceRequest self = new GenerateCartoonizedImageAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public GenerateCartoonizedImageAdvanceRequest setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }
    public String getImageType() {
        return this.imageType;
    }

    public GenerateCartoonizedImageAdvanceRequest setImageUrlObject(java.io.InputStream imageUrlObject) {
        this.imageUrlObject = imageUrlObject;
        return this;
    }
    public java.io.InputStream getImageUrlObject() {
        return this.imageUrlObject;
    }

    public GenerateCartoonizedImageAdvanceRequest setIndex(String index) {
        this.index = index;
        return this;
    }
    public String getIndex() {
        return this.index;
    }

}
