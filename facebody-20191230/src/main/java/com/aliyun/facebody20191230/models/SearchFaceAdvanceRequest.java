// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class SearchFaceAdvanceRequest extends TeaModel {
    @NameInMap("ImageUrlObject")
    @Validation(required = true)
    public java.io.InputStream imageUrlObject;

    @NameInMap("DbName")
    @Validation(required = true)
    public String dbName;

    @NameInMap("Limit")
    @Validation(required = true)
    public Integer limit;

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

}
