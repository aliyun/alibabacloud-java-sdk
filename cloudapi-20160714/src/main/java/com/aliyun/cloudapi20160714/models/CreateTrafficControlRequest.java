// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateTrafficControlRequest extends TeaModel {
    /**
     * <p>The default throttling value for each API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ApiDefault")
    public Integer apiDefault;

    /**
     * <p>The default throttling value for each app.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("AppDefault")
    public Integer appDefault;

    /**
     * <p>The description of the throttling policy.</p>
     * 
     * <strong>example:</strong>
     * <p>ThrottlingTestDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The security token included in the WebSocket request header. The system uses this token to authenticate the request.</p>
     * 
     * <strong>example:</strong>
     * <p>436fa39b-b3b9-40c5-ae5d-ce3e000e38c5</p>
     */
    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The name of the throttling policy. The name must be 4 to 50 characters in length and can contain letters, digits, and underscores (_). It cannot start with an underscore.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ThrottlingTest</p>
     */
    @NameInMap("TrafficControlName")
    public String trafficControlName;

    /**
     * <p>The unit to be used in the throttling policy. Valid values:</p>
     * <ul>
     * <li><strong>SECOND</strong></li>
     * <li><strong>MINUTE</strong></li>
     * <li><strong>HOUR</strong></li>
     * <li><strong>DAY</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MINUTE</p>
     */
    @NameInMap("TrafficControlUnit")
    public String trafficControlUnit;

    /**
     * <p>The default throttling value for each user.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("UserDefault")
    public Integer userDefault;

    public static CreateTrafficControlRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTrafficControlRequest self = new CreateTrafficControlRequest();
        return TeaModel.build(map, self);
    }

    public CreateTrafficControlRequest setApiDefault(Integer apiDefault) {
        this.apiDefault = apiDefault;
        return this;
    }
    public Integer getApiDefault() {
        return this.apiDefault;
    }

    public CreateTrafficControlRequest setAppDefault(Integer appDefault) {
        this.appDefault = appDefault;
        return this;
    }
    public Integer getAppDefault() {
        return this.appDefault;
    }

    public CreateTrafficControlRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTrafficControlRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateTrafficControlRequest setTrafficControlName(String trafficControlName) {
        this.trafficControlName = trafficControlName;
        return this;
    }
    public String getTrafficControlName() {
        return this.trafficControlName;
    }

    public CreateTrafficControlRequest setTrafficControlUnit(String trafficControlUnit) {
        this.trafficControlUnit = trafficControlUnit;
        return this;
    }
    public String getTrafficControlUnit() {
        return this.trafficControlUnit;
    }

    public CreateTrafficControlRequest setUserDefault(Integer userDefault) {
        this.userDefault = userDefault;
        return this;
    }
    public Integer getUserDefault() {
        return this.userDefault;
    }

}
