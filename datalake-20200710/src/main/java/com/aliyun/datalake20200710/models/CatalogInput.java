// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class CatalogInput extends TeaModel {
    @NameInMap("CatalogId")
    public String catalogId;

    @NameInMap("Description")
    public String description;

    @NameInMap("LocationUri")
    public String locationUri;

    @NameInMap("Owner")
    public String owner;

    public static CatalogInput build(java.util.Map<String, ?> map) throws Exception {
        CatalogInput self = new CatalogInput();
        return TeaModel.build(map, self);
    }

    public CatalogInput setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public CatalogInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CatalogInput setLocationUri(String locationUri) {
        this.locationUri = locationUri;
        return this;
    }
    public String getLocationUri() {
        return this.locationUri;
    }

    public CatalogInput setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

}
