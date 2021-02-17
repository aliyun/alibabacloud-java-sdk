// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class CompareImageFacesRequest extends TeaModel {
    @NameInMap("Project")
    public String project;

    @NameInMap("SetId")
    public String setId;

    @NameInMap("ImageUriA")
    public String imageUriA;

    @NameInMap("ImageUriB")
    public String imageUriB;

    @NameInMap("FaceIdA")
    public String faceIdA;

    @NameInMap("FaceIdB")
    public String faceIdB;

    public static CompareImageFacesRequest build(java.util.Map<String, ?> map) throws Exception {
        CompareImageFacesRequest self = new CompareImageFacesRequest();
        return TeaModel.build(map, self);
    }

    public CompareImageFacesRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public CompareImageFacesRequest setSetId(String setId) {
        this.setId = setId;
        return this;
    }
    public String getSetId() {
        return this.setId;
    }

    public CompareImageFacesRequest setImageUriA(String imageUriA) {
        this.imageUriA = imageUriA;
        return this;
    }
    public String getImageUriA() {
        return this.imageUriA;
    }

    public CompareImageFacesRequest setImageUriB(String imageUriB) {
        this.imageUriB = imageUriB;
        return this;
    }
    public String getImageUriB() {
        return this.imageUriB;
    }

    public CompareImageFacesRequest setFaceIdA(String faceIdA) {
        this.faceIdA = faceIdA;
        return this;
    }
    public String getFaceIdA() {
        return this.faceIdA;
    }

    public CompareImageFacesRequest setFaceIdB(String faceIdB) {
        this.faceIdB = faceIdB;
        return this;
    }
    public String getFaceIdB() {
        return this.faceIdB;
    }

}
