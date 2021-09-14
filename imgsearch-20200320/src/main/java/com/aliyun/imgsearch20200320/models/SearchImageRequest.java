// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imgsearch20200320.models;

import com.aliyun.tea.*;

public class SearchImageRequest extends TeaModel {
    @NameInMap("DbName")
    public String dbName;

    @NameInMap("ImageUrl")
    public String imageUrl;

    @NameInMap("Limit")
    public Integer limit;

    public static SearchImageRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchImageRequest self = new SearchImageRequest();
        return TeaModel.build(map, self);
    }

    public SearchImageRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public SearchImageRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public SearchImageRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

}
