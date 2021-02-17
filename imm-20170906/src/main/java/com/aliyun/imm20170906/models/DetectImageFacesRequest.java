// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class DetectImageFacesRequest extends TeaModel {
    @NameInMap("Project")
    public String project;

    @NameInMap("ImageUri")
    public String imageUri;

    @NameInMap("RealUid")
    public String realUid;

    public static DetectImageFacesRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectImageFacesRequest self = new DetectImageFacesRequest();
        return TeaModel.build(map, self);
    }

    public DetectImageFacesRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public DetectImageFacesRequest setImageUri(String imageUri) {
        this.imageUri = imageUri;
        return this;
    }
    public String getImageUri() {
        return this.imageUri;
    }

    public DetectImageFacesRequest setRealUid(String realUid) {
        this.realUid = realUid;
        return this;
    }
    public String getRealUid() {
        return this.realUid;
    }

}
