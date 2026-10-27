// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class CreatePropertyRequest extends TeaModel {
    /**
     * <p>The channel.</p>
     * 
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("BusinessChannel")
    public String businessChannel;

    /**
     * <p>The property key.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>department</p>
     */
    @NameInMap("PropertyKey")
    public String propertyKey;

    /**
     * <p>The property values. You can add up to 50 different property values to a single property.</p>
     */
    @NameInMap("PropertyValues")
    public java.util.List<String> propertyValues;

    public static CreatePropertyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePropertyRequest self = new CreatePropertyRequest();
        return TeaModel.build(map, self);
    }

    public CreatePropertyRequest setBusinessChannel(String businessChannel) {
        this.businessChannel = businessChannel;
        return this;
    }
    public String getBusinessChannel() {
        return this.businessChannel;
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
