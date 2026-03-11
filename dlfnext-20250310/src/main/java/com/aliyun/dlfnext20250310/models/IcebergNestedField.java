// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class IcebergNestedField extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>desc1</p>
     */
    @NameInMap("doc")
    public String doc;

    /**
     * <p>id</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>col1</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("optional")
    public Boolean optional;

    /**
     * <strong>example:</strong>
     * <p>string</p>
     */
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
