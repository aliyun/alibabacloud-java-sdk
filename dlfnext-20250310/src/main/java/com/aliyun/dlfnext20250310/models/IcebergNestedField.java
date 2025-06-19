// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class IcebergNestedField extends TeaModel {
    @NameInMap("doc")
    public String doc;

    @NameInMap("id")
    public Long id;

    @NameInMap("name")
    public String name;

    @NameInMap("optional")
    public Boolean optional;

    @NameInMap("type")
    public String type;

    public static IcebergNestedField build(java.util.Map<String, ?> map) throws Exception {
        IcebergNestedField self = new IcebergNestedField();
        return TeaModel.build(map, self);
    }

    public IcebergNestedField setDoc(String doc) {
        this.doc = doc;
        return this;
    }
    public String getDoc() {
        return this.doc;
    }

    public IcebergNestedField setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public IcebergNestedField setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public IcebergNestedField setOptional(Boolean optional) {
        this.optional = optional;
        return this;
    }
    public Boolean getOptional() {
        return this.optional;
    }

    public IcebergNestedField setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
