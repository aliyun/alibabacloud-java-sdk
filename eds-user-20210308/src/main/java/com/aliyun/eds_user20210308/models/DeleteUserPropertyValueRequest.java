// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DeleteUserPropertyValueRequest extends TeaModel {
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
     * <p>The property value ID. You can call the <a href="~~ListProperty~~">ListProperty</a> operation to query the property value ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>978</p>
     */
    @NameInMap("PropertyValueId")
    public Long propertyValueId;

    /**
     * <p>The user ID. You can call the <a href="~~DescribeUsers~~">DescribeUsers</a> operation to query the user ID, which is the return value of the <code>Id</code> parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
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
