// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class GetImageCroppingSuggestionsRequest extends TeaModel {
    @NameInMap("AspectRatios")
    public String aspectRatios;

    @NameInMap("ImageUri")
    public String imageUri;

    @NameInMap("Project")
    public String project;

    public static GetImageCroppingSuggestionsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetImageCroppingSuggestionsRequest self = new GetImageCroppingSuggestionsRequest();
        return TeaModel.build(map, self);
    }

    public GetImageCroppingSuggestionsRequest setAspectRatios(String aspectRatios) {
        this.aspectRatios = aspectRatios;
        return this;
    }
    public String getAspectRatios() {
        return this.aspectRatios;
    }

    public GetImageCroppingSuggestionsRequest setImageUri(String imageUri) {
        this.imageUri = imageUri;
        return this;
    }
    public String getImageUri() {
        return this.imageUri;
    }

    public GetImageCroppingSuggestionsRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

}
