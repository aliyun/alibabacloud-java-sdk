// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class CreatePropertyRequest extends TeaModel {
    /**
     * <p>The name of the property.</p>
     */
    @NameInMap("PropertyKey")
    public String propertyKey;

    /**
     * <p>The values of the property. You can specify up to 50 values for a property.</p>
     */
    @NameInMap("PropertyValues")
    public java.util.List<String> propertyValues;

    public static CreatePropertyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePropertyRequest self = new CreatePropertyRequest();
        return TeaModel.build(map, self);
    }

    public CreatePropertyRequest setPropertyKey(String propertyKey) {
        this.propertyKey = propertyKey;
        return this;
    }
    public String getPropertyKey() {
        return this.propertyKey;
    }

    public CreatePropertyRequest setPropertyValues(java.util.List<String> propertyValues) {
        this.propertyValues = propertyValues;
        return this;
    }
    public java.util.List<String> getPropertyValues() {
        return this.propertyValues;
    }

}
