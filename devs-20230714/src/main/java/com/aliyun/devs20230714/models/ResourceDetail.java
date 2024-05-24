// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ResourceDetail extends TeaModel {
    @NameInMap("address")
    public String address;

    @NameInMap("attributeValues")
    public java.util.Map<String, ?> attributeValues;

    @NameInMap("mode")
    public String mode;

    @NameInMap("name")
    public String name;

    @NameInMap("type")
    public String type;

    public static ResourceDetail build(java.util.Map<String, ?> map) throws Exception {
        ResourceDetail self = new ResourceDetail();
        return TeaModel.build(map, self);
    }

    public ResourceDetail setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public ResourceDetail setAttributeValues(java.util.Map<String, ?> attributeValues) {
        this.attributeValues = attributeValues;
        return this;
    }
    public java.util.Map<String, ?> getAttributeValues() {
        return this.attributeValues;
    }

    public ResourceDetail setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public ResourceDetail setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ResourceDetail setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
