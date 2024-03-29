// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imgsearch20200320.models;

import com.aliyun.tea.*;

public class ListImagesRequest extends TeaModel {
    @NameInMap("DbName")
    public String dbName;

    @NameInMap("EntityIdPrefix")
    public String entityIdPrefix;

    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("Offset")
    public Integer offset;

    @NameInMap("Order")
    public String order;

    @NameInMap("Token")
    public String token;

    public static ListImagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListImagesRequest self = new ListImagesRequest();
        return TeaModel.build(map, self);
    }

    public ListImagesRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public ListImagesRequest setEntityIdPrefix(String entityIdPrefix) {
        this.entityIdPrefix = entityIdPrefix;
        return this;
    }
    public String getEntityIdPrefix() {
        return this.entityIdPrefix;
    }

    public ListImagesRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListImagesRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public ListImagesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListImagesRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
