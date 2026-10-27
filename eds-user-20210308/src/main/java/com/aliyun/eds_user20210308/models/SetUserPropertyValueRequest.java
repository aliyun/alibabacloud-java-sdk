// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class SetUserPropertyValueRequest extends TeaModel {
    /**
     * <p>The business channel.</p>
     * 
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("BusinessChannel")
    public String businessChannel;

    /**
     * <p>The property ID. You can call the <a href="~~ListProperty~~">ListProperty</a> operation to obtain this parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>240**</p>
     */
    @NameInMap("PropertyId")
    public Long propertyId;

    /**
     * <p>The property value ID. You can call the <a href="~~ListProperty~~">ListProperty</a> operation to obtain this parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2251**</p>
     */
    @NameInMap("PropertyValueId")
    public Long propertyValueId;

    /**
     * <p>The user ID. You can call the <a href="~~DescribeUsers~~">DescribeUsers</a> operation to obtain this parameter, which corresponds to the value of the <code>Id</code> response parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>111****</p>
     */
    @NameInMap("UserId")
    public Long userId;

    /**
     * <p>The username. You can call the <a href="~~DescribeUsers~~">DescribeUsers</a> operation to obtain this parameter, which corresponds to the value of the <code>EndUserId</code> response parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static SetUserPropertyValueRequest build(java.util.Map<String, ?> map) throws Exception {
        SetUserPropertyValueRequest self = new SetUserPropertyValueRequest();
        return TeaModel.build(map, self);
    }

    public SetUserPropertyValueRequest setBusinessChannel(String businessChannel) {
        this.businessChannel = businessChannel;
        return this;
    }
    public String getBusinessChannel() {
        return this.businessChannel;
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
