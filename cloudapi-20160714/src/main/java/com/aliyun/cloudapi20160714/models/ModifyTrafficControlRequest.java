// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyTrafficControlRequest extends TeaModel {
    /**
     * <p>The default throttling value for each API.</p>
     */
    @NameInMap("ApiDefault")
    public Integer apiDefault;

    /**
     * <p>The default throttling value for each app.</p>
     */
    @NameInMap("AppDefault")
    public Integer appDefault;

    /**
     * <p>The description of the throttling policy.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The security token included in the WebSocket request header. The system uses this token to authenticate the request.</p>
     */
    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The ID of the throttling policy.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TrafficControlId")
    public String trafficControlId;

    /**
     * <p>The throttling policy name. The name must be 4 to 50 characters in length and can contain letters, digits, and underscores (_). It cannot start with an underscore.</p>
     */
    @NameInMap("TrafficControlName")
    public String trafficControlName;

    /**
     * <p>The unit to be used in the throttling policy. Valid values:</p>
     * <br>
     * <p>*   **SECOND**</p>
     * <p>*   **MINUTE**</p>
     * <p>*   **HOUR**</p>
     * <p>*   **DAY**</p>
     */
    @NameInMap("TrafficControlUnit")
    public String trafficControlUnit;

    /**
     * <p>The default throttling value for each user.</p>
     */
    @NameInMap("UserDefault")
    public Integer userDefault;

    public static ModifyTrafficControlRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTrafficControlRequest self = new ModifyTrafficControlRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTrafficControlRequest setApiDefault(Integer apiDefault) {
        this.apiDefault = apiDefault;
        return this;
    }
    public Integer getApiDefault() {
        return this.apiDefault;
    }

    public ModifyTrafficControlRequest setAppDefault(Integer appDefault) {
        this.appDefault = appDefault;
        return this;
    }
    public Integer getAppDefault() {
        return this.appDefault;
    }

    public ModifyTrafficControlRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyTrafficControlRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ModifyTrafficControlRequest setTrafficControlId(String trafficControlId) {
        this.trafficControlId = trafficControlId;
        return this;
    }
    public String getTrafficControlId() {
        return this.trafficControlId;
    }

    public ModifyTrafficControlRequest setTrafficControlName(String trafficControlName) {
        this.trafficControlName = trafficControlName;
        return this;
    }
    public String getTrafficControlName() {
        return this.trafficControlName;
    }

    public ModifyTrafficControlRequest setTrafficControlUnit(String trafficControlUnit) {
        this.trafficControlUnit = trafficControlUnit;
        return this;
    }
    public String getTrafficControlUnit() {
        return this.trafficControlUnit;
    }

    public ModifyTrafficControlRequest setUserDefault(Integer userDefault) {
        this.userDefault = userDefault;
        return this;
    }
    public Integer getUserDefault() {
        return this.userDefault;
    }

}
