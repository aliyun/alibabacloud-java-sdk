// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class SetUserPropertyValueRequest extends TeaModel {
    /**
     * <p>The ID of the property.</p>
     */
    @NameInMap("PropertyId")
    public Long propertyId;

    /**
     * <p>The ID of the property value.</p>
     */
    @NameInMap("PropertyValueId")
    public Long propertyValueId;

    /**
     * <p>The ID of the user.</p>
     */
    @NameInMap("UserId")
    public Long userId;

    /**
     * <p>The name of the user.</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static SetUserPropertyValueRequest build(java.util.Map<String, ?> map) throws Exception {
        SetUserPropertyValueRequest self = new SetUserPropertyValueRequest();
        return TeaModel.build(map, self);
    }

    public SetUserPropertyValueRequest setPropertyId(Long propertyId) {
        this.propertyId = propertyId;
        return this;
    }
    public Long getPropertyId() {
        return this.propertyId;
    }

    public SetUserPropertyValueRequest setPropertyValueId(Long propertyValueId) {
        this.propertyValueId = propertyValueId;
        return this;
    }
    public Long getPropertyValueId() {
        return this.propertyValueId;
    }

    public SetUserPropertyValueRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public SetUserPropertyValueRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
