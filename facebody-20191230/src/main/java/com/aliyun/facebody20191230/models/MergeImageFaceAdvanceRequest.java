// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class MergeImageFaceAdvanceRequest extends TeaModel {
    @NameInMap("ImageURL")
    public java.io.InputStream imageURLObject;

    @NameInMap("TemplateId")
    public String templateId;

    public static MergeImageFaceAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        MergeImageFaceAdvanceRequest self = new MergeImageFaceAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public MergeImageFaceAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

    public MergeImageFaceAdvanceRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
