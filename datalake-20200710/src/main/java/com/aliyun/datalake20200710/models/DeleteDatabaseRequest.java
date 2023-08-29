// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class DeleteDatabaseRequest extends TeaModel {
    @NameInMap("Async")
    public Boolean async;

    @NameInMap("Cascade")
    public Boolean cascade;

    @NameInMap("CatalogId")
    public String catalogId;

    @NameInMap("Name")
    public String name;

    public static DeleteDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatabaseRequest self = new DeleteDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDatabaseRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

    public DeleteDatabaseRequest setCascade(Boolean cascade) {
        this.cascade = cascade;
        return this;
    }
    public Boolean getCascade() {
        return this.cascade;
    }

    public DeleteDatabaseRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public DeleteDatabaseRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
