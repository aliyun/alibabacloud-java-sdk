// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class UpdatePropertyRequest extends TeaModel {
    /**
     * <p>The business channel.</p>
     * 
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("BusinessChannel")
    public String businessChannel;

    /**
     * <p>The ID of the property to update. You can call <a href="~~ListProperty~~">ListProperty</a> to query the property ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>390</p>
     */
    @NameInMap("PropertyId")
    public Long propertyId;

    /**
     * <p>The updated property name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testkey</p>
     */
    @NameInMap("PropertyKey")
    public String propertyKey;

    /**
     * <p>The list of all updated property values for the property.</p>
     * <blockquote>
     * <p>Notice: The property values specified here overwrite the existing property values instead of appending to them.</p>
     * </blockquote>
     */
    @NameInMap("PropertyValues")
    public java.util.List<UpdatePropertyRequestPropertyValues> propertyValues;

    public static UpdatePropertyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePropertyRequest self = new UpdatePropertyRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePropertyRequest setBusinessChannel(String businessChannel) {
        this.businessChannel = businessChannel;
        return this;
    }
    public String getBusinessChannel() {
        return this.businessChannel;
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
        /**
         * <p>The updated property value.</p>
         * 
         * <strong>example:</strong>
         * <p>testvalue</p>
         */
        @NameInMap("PropertyValue")
        public String propertyValue;

        /**
         * <p>The ID of the updated property value.</p>
         * 
         * <strong>example:</strong>
         * <p>978</p>
         */
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
