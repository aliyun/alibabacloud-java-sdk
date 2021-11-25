// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class GetImageQualityRequest extends TeaModel {
    @NameInMap("ImageUri")
    public String imageUri;

    @NameInMap("Project")
    public String project;

    public static GetImageQualityRequest build(java.util.Map<String, ?> map) throws Exception {
        GetImageQualityRequest self = new GetImageQualityRequest();
        return TeaModel.build(map, self);
    }

    public GetImageQualityRequest setImageUri(String imageUri) {
        this.imageUri = imageUri;
        return this;
    }
    public String getImageUri() {
        return this.imageUri;
    }

    public GetImageQualityRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

}
