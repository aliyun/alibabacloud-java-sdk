// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class AddFaceImageTemplateAdvanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://invi-label.oss-cn-shanghai.aliyuncs.com/label/temp/faceswap/img_facefusion/template/sucai1.jpg">https://invi-label.oss-cn-shanghai.aliyuncs.com/label/temp/faceswap/img_facefusion/template/sucai1.jpg</a></p>
     */
    @NameInMap("ImageURL")
    public java.io.InputStream imageURLObject;

    public static AddFaceImageTemplateAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddFaceImageTemplateAdvanceRequest self = new AddFaceImageTemplateAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public AddFaceImageTemplateAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

}
