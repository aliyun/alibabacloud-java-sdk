// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class CheckUsedPropertyValueRequest extends TeaModel {
    @NameInMap("PropertyId")
    public Long propertyId;

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
