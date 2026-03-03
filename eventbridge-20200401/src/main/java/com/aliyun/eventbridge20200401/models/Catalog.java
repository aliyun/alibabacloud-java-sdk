// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class Catalog extends TeaModel {
    @NameInMap("Comment")
    public String comment;

    @NameInMap("Name")
    public String name;

    @NameInMap("Properties")
    public java.util.Map<String, ?> properties;

    @NameInMap("Provider")
    public String provider;

    @NameInMap("Type")
    public String type;

    public static Catalog build(java.util.Map<String, ?> map) throws Exception {
        Catalog self = new Catalog();
        return TeaModel.build(map, self);
    }

    public Catalog setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public Catalog setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Catalog setProperties(java.util.Map<String, ?> properties) {
        this.properties = properties;
        return this;
    }
    public java.util.Map<String, ?> getProperties() {
        return this.properties;
    }

    public Catalog setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public Catalog setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
