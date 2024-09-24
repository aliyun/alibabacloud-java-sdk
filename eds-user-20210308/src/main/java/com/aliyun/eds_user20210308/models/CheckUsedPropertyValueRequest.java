// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class CheckUsedPropertyValueRequest extends TeaModel {
    /**
     * <p>The property ID. You can call the <a href="~~ListProperty~~">ListProperty</a> operation to query property ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>380</p>
     */
    @NameInMap("PropertyId")
    public Long propertyId;

    /**
     * <p>The ID of the property value. You can call the <a href="~~ListProperty~~">ListProperty</a> operation to query the ID of the property value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>978</p>
     */
    @NameInMap("PropertyValueId")
    public Long propertyValueId;

    public static CheckUsedPropertyValueRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckUsedPropertyValueRequest self = new CheckUsedPropertyValueRequest();
        return TeaModel.build(map, self);
    }

    public CheckUsedPropertyValueRequest setPropertyId(Long propertyId) {
        this.propertyId = propertyId;
        return this;
    }
    public Long getPropertyId() {
        return this.propertyId;
    }

    public CheckUsedPropertyValueRequest setPropertyValueId(Long propertyValueId) {
        this.propertyValueId = propertyValueId;
        return this;
    }
    public Long getPropertyValueId() {
        return this.propertyValueId;
    }

}
