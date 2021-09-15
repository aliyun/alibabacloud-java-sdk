// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class SearchFaceAdvanceRequest extends TeaModel {
    @NameInMap("ImageUrlObject")
    @Validation(required = true)
    public java.io.InputStream imageUrlObject;

    @NameInMap("DbName")
    public String dbName;

    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("DbNames")
    public String dbNames;

    @NameInMap("QualityScoreThreshold")
    public Float qualityScoreThreshold;

    public static SearchFaceAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchFaceAdvanceRequest self = new SearchFaceAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public SearchFaceAdvanceRequest setImageUrlObject(java.io.InputStream imageUrlObject) {
        this.imageUrlObject = imageUrlObject;
        return this;
    }
    public java.io.InputStream getImageUrlObject() {
        return this.imageUrlObject;
    }

    public SearchFaceAdvanceRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public SearchFaceAdvanceRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public SearchFaceAdvanceRequest setDbNames(String dbNames) {
        this.dbNames = dbNames;
        return this;
    }
    public String getDbNames() {
        return this.dbNames;
    }

    public SearchFaceAdvanceRequest setQualityScoreThreshold(Float qualityScoreThreshold) {
        this.qualityScoreThreshold = qualityScoreThreshold;
        return this;
    }
    public Float getQualityScoreThreshold() {
        return this.qualityScoreThreshold;
    }

}
