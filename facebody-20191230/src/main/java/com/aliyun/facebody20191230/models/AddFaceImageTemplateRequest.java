// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class AddFaceImageTemplateRequest extends TeaModel {
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
