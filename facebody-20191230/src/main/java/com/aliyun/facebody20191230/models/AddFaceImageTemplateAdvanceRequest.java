// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class AddFaceImageTemplateAdvanceRequest extends TeaModel {
    @NameInMap("ImageURL")
    public java.io.InputStream imageURLObject;

    @NameInMap("UserId")
    public String userId;

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

    public AddFaceImageTemplateAdvanceRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
