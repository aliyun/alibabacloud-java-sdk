// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class AddFaceImageTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://invi-label.oss-cn-shanghai.aliyuncs.com/label/temp/faceswap/img_facefusion/template/sucai1.jpg">https://invi-label.oss-cn-shanghai.aliyuncs.com/label/temp/faceswap/img_facefusion/template/sucai1.jpg</a></p>
     */
    @NameInMap("ImageURL")
    public String imageURL;

    public static AddFaceImageTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        AddFaceImageTemplateRequest self = new AddFaceImageTemplateRequest();
        return TeaModel.build(map, self);
    }

    public AddFaceImageTemplateRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
