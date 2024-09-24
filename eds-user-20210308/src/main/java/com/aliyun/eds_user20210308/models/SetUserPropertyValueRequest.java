// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class SetUserPropertyValueRequest extends TeaModel {
    /**
     * <p>The property ID. You can call the <a href="~~ListProperty~~">ListProperty</a> operation to query the property ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>390</p>
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

    /**
     * <p>The ID of the convenience user. You can call the <a href="~~DescribeUsers~~">DescribeUsers</a> operation to query the user ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("UserId")
    public Long userId;

    /**
     * <p>The username of the convenience user.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
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
