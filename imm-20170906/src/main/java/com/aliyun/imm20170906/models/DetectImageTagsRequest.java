// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class DetectImageTagsRequest extends TeaModel {
    @NameInMap("Project")
    public String project;

    @NameInMap("ImageUri")
    public String imageUri;

    public static DetectImageTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectImageTagsRequest self = new DetectImageTagsRequest();
        return TeaModel.build(map, self);
    }

    public DetectImageTagsRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public DetectImageTagsRequest setImageUri(String imageUri) {
        this.imageUri = imageUri;
        return this;
    }
    public String getImageUri() {
        return this.imageUri;
    }

}
