// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DeleteUserPropertyValueRequest extends TeaModel {
    /**
     * <p>DeleteUserPropertyValue</p>
     */
    @NameInMap("PropertyId")
    public Long propertyId;

    @NameInMap("PropertyValueId")
    public Long propertyValueId;

    /**
     * <p>Dissociates a user property from a user.</p>
     */
    @NameInMap("UserId")
    public Long userId;

    public static DeleteUserPropertyValueRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserPropertyValueRequest self = new DeleteUserPropertyValueRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserPropertyValueRequest setPropertyId(Long propertyId) {
        this.propertyId = propertyId;
        return this;
    }
    public Long getPropertyId() {
        return this.propertyId;
    }

    public DeleteUserPropertyValueRequest setPropertyValueId(Long propertyValueId) {
        this.propertyValueId = propertyValueId;
        return this;
    }
    public Long getPropertyValueId() {
        return this.propertyValueId;
    }

    public DeleteUserPropertyValueRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
