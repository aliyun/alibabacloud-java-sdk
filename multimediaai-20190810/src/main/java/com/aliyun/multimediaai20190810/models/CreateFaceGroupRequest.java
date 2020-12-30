// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.multimediaai20190810.models;

import com.aliyun.tea.*;

public class CreateFaceGroupRequest extends TeaModel {
    @NameInMap("FaceGroupName")
    public String faceGroupName;

    @NameInMap("Description")
    public String description;

    public static CreateFaceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFaceGroupRequest self = new CreateFaceGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateFaceGroupRequest setFaceGroupName(String faceGroupName) {
        this.faceGroupName = faceGroupName;
        return this;
    }
    public String getFaceGroupName() {
        return this.faceGroupName;
    }

    public CreateFaceGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
