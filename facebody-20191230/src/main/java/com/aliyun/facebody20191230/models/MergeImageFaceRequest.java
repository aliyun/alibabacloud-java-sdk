// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class MergeImageFaceRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    @NameInMap("TemplateId")
    public String templateId;

    // A short description of struct
    @NameInMap("UserId")
    public String userId;

    public static MergeImageFaceRequest build(java.util.Map<String, ?> map) throws Exception {
        MergeImageFaceRequest self = new MergeImageFaceRequest();
        return TeaModel.build(map, self);
    }

    public MergeImageFaceRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public MergeImageFaceRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public MergeImageFaceRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
