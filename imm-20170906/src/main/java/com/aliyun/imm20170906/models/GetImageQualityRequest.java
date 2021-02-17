// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class GetImageQualityRequest extends TeaModel {
    @NameInMap("Project")
    public String project;

    @NameInMap("ImageUri")
    public String imageUri;

    public static GetImageQualityRequest build(java.util.Map<String, ?> map) throws Exception {
        GetImageQualityRequest self = new GetImageQualityRequest();
        return TeaModel.build(map, self);
    }

    public GetImageQualityRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public GetImageQualityRequest setImageUri(String imageUri) {
        this.imageUri = imageUri;
        return this;
    }
    public String getImageUri() {
        return this.imageUri;
    }

}
