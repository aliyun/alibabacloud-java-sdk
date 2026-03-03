// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class Namespace extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Catalog")
    public String catalog;

    @NameInMap("Comment")
    public String comment;

    @NameInMap("Name")
    public String name;

    @NameInMap("properties")
    public String properties;

    public static Namespace build(java.util.Map<String, ?> map) throws Exception {
        Namespace self = new Namespace();
        return TeaModel.build(map, self);
    }

    public Namespace setCatalog(String catalog) {
        this.catalog = catalog;
        return this;
    }
    public String getCatalog() {
        return this.catalog;
    }

    public Namespace setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public Namespace setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Namespace setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

}
