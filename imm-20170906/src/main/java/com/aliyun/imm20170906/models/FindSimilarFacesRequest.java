// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class FindSimilarFacesRequest extends TeaModel {
    @NameInMap("FaceId")
    public String faceId;

    @NameInMap("ImageUri")
    public String imageUri;

    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("MinSimilarity")
    public Float minSimilarity;

    @NameInMap("Project")
    public String project;

    @NameInMap("ResponseFormat")
    public String responseFormat;

    @NameInMap("SetId")
    public String setId;

    public static FindSimilarFacesRequest build(java.util.Map<String, ?> map) throws Exception {
        FindSimilarFacesRequest self = new FindSimilarFacesRequest();
        return TeaModel.build(map, self);
    }

    public FindSimilarFacesRequest setFaceId(String faceId) {
        this.faceId = faceId;
        return this;
    }
    public String getFaceId() {
        return this.faceId;
    }

    public FindSimilarFacesRequest setImageUri(String imageUri) {
        this.imageUri = imageUri;
        return this;
    }
    public String getImageUri() {
        return this.imageUri;
    }

    public FindSimilarFacesRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public FindSimilarFacesRequest setMinSimilarity(Float minSimilarity) {
        this.minSimilarity = minSimilarity;
        return this;
    }
    public Float getMinSimilarity() {
        return this.minSimilarity;
    }

    public FindSimilarFacesRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public FindSimilarFacesRequest setResponseFormat(String responseFormat) {
        this.responseFormat = responseFormat;
        return this;
    }
    public String getResponseFormat() {
        return this.responseFormat;
    }

    public FindSimilarFacesRequest setSetId(String setId) {
        this.setId = setId;
        return this;
    }
    public String getSetId() {
        return this.setId;
    }

}
