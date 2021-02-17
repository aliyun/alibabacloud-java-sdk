// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class DetectImageLogosRequest extends TeaModel {
    @NameInMap("Project")
    public String project;

    @NameInMap("ImageUri")
    public String imageUri;

    public static DetectImageLogosRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectImageLogosRequest self = new DetectImageLogosRequest();
        return TeaModel.build(map, self);
    }

    public DetectImageLogosRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public DetectImageLogosRequest setImageUri(String imageUri) {
        this.imageUri = imageUri;
        return this;
    }
    public String getImageUri() {
        return this.imageUri;
    }

}
