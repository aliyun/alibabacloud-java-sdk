// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class DetectImageQRCodesRequest extends TeaModel {
    @NameInMap("ImageUri")
    public String imageUri;

    @NameInMap("Project")
    public String project;

    public static DetectImageQRCodesRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectImageQRCodesRequest self = new DetectImageQRCodesRequest();
        return TeaModel.build(map, self);
    }

    public DetectImageQRCodesRequest setImageUri(String imageUri) {
        this.imageUri = imageUri;
        return this;
    }
    public String getImageUri() {
        return this.imageUri;
    }

    public DetectImageQRCodesRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

}
