// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CustomParams extends TeaModel {
    /**
     * <p>The name of the parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>Normalize</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The properties.</p>
     */
    @NameInMap("Properties")
    public java.util.List<Property> properties;

    public static CustomParams build(java.util.Map<String, ?> map) throws Exception {
        CustomParams self = new CustomParams();
        return TeaModel.build(map, self);
    }

    public CustomParams setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CustomParams setProperties(java.util.List<Property> properties) {
        this.properties = properties;
        return this;
    }
    public java.util.List<Property> getProperties() {
        return this.properties;
    }

}
