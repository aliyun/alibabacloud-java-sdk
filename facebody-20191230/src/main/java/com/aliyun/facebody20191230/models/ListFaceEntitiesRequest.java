// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class ListFaceEntitiesRequest extends TeaModel {
    @NameInMap("DbName")
    @Validation(required = true)
    public String dbName;

    @NameInMap("Offset")
    public Integer offset;

    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("Token")
    public String token;

    @NameInMap("Labels")
    public String labels;

    @NameInMap("EntityIdPrefix")
    public String entityIdPrefix;

    @NameInMap("Order")
    public String order;

    public static ListFaceEntitiesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFaceEntitiesRequest self = new ListFaceEntitiesRequest();
        return TeaModel.build(map, self);
    }

    public ListFaceEntitiesRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public ListFaceEntitiesRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public ListFaceEntitiesRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListFaceEntitiesRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public ListFaceEntitiesRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public ListFaceEntitiesRequest setEntityIdPrefix(String entityIdPrefix) {
        this.entityIdPrefix = entityIdPrefix;
        return this;
    }
    public String getEntityIdPrefix() {
        return this.entityIdPrefix;
    }

    public ListFaceEntitiesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

}
