// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class ChangeSkyAdvanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageseg/ChangeSky/ChangeSky2.jpg">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageseg/ChangeSky/ChangeSky2.jpg</a></p>
     */
    @NameInMap("ImageURL")
    public java.io.InputStream imageURLObject;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageseg/ChangeSky/ChangeSky6.jpg">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageseg/ChangeSky/ChangeSky6.jpg</a></p>
     */
    @NameInMap("ReplaceImageURL")
    public java.io.InputStream replaceImageURLObject;

    public static ChangeSkyAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeSkyAdvanceRequest self = new ChangeSkyAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public ChangeSkyAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

    public ChangeSkyAdvanceRequest setReplaceImageURLObject(java.io.InputStream replaceImageURLObject) {
        this.replaceImageURLObject = replaceImageURLObject;
        return this;
    }
    public java.io.InputStream getReplaceImageURLObject() {
        return this.replaceImageURLObject;
    }

}
