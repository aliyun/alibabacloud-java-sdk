// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class DetectImageFacesRequest extends TeaModel {
    @NameInMap("ImageUri")
    public String imageUri;

    @NameInMap("Project")
    public String project;

    public static DetectImageFacesRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectImageFacesRequest self = new DetectImageFacesRequest();
        return TeaModel.build(map, self);
    }

    public DetectImageFacesRequest setImageUri(String imageUri) {
        this.imageUri = imageUri;
        return this;
    }
    public String getImageUri() {
        return this.imageUri;
    }

    public DetectImageFacesRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

}
