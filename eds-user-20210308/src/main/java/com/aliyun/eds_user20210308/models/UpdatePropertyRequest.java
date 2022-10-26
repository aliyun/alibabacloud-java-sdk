// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class UpdatePropertyRequest extends TeaModel {
    @NameInMap("PropertyId")
    public Long propertyId;

    @NameInMap("PropertyKey")
    public String propertyKey;

    @NameInMap("PropertyValues")
    public java.util.List<UpdatePropertyRequestPropertyValues> propertyValues;

    public static UpdatePropertyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePropertyRequest self = new UpdatePropertyRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePropertyRequest setPropertyId(Long propertyId) {
        this.propertyId = propertyId;
        return this;
    }
    public Long getPropertyId() {
        return this.propertyId;
    }

    public UpdatePropertyRequest setPropertyKey(String propertyKey) {
        this.propertyKey = propertyKey;
        return this;
    }
    public String getPropertyKey() {
        return this.propertyKey;
    }

    public UpdatePropertyRequest setPropertyValues(java.util.List<UpdatePropertyRequestPropertyValues> propertyValues) {
        this.propertyValues = propertyValues;
        return this;
    }
    public java.util.List<UpdatePropertyRequestPropertyValues> getPropertyValues() {
        return this.propertyValues;
    }

    public static class UpdatePropertyRequestPropertyValues extends TeaModel {
        @NameInMap("PropertyValue")
        public String propertyValue;

        @NameInMap("PropertyValueId")
        public Long propertyValueId;

        public static UpdatePropertyRequestPropertyValues build(java.util.Map<String, ?> map) throws Exception {
            UpdatePropertyRequestPropertyValues self = new UpdatePropertyRequestPropertyValues();
            return TeaModel.build(map, self);
        }

        public UpdatePropertyRequestPropertyValues setPropertyValue(String propertyValue) {
            this.propertyValue = propertyValue;
            return this;
        }
        public String getPropertyValue() {
            return this.propertyValue;
        }

        public UpdatePropertyRequestPropertyValues setPropertyValueId(Long propertyValueId) {
            this.propertyValueId = propertyValueId;
            return this;
        }
        public Long getPropertyValueId() {
            return this.propertyValueId;
        }

    }

}
