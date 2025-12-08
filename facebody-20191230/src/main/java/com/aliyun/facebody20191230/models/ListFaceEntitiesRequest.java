// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class ListFaceEntitiesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <strong>example:</strong>
     * <p>U1</p>
     */
    @NameInMap("EntityIdPrefix")
    public String entityIdPrefix;

    @NameInMap("Labels")
    public String labels;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Offset")
    public Integer offset;

    /**
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Token")
    public String token;

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

    public ListFaceEntitiesRequest setEntityIdPrefix(String entityIdPrefix) {
        this.entityIdPrefix = entityIdPrefix;
        return this;
    }
    public String getEntityIdPrefix() {
        return this.entityIdPrefix;
    }

    public ListFaceEntitiesRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public ListFaceEntitiesRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListFaceEntitiesRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public ListFaceEntitiesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListFaceEntitiesRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
