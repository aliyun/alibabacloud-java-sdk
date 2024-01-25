// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyInstanceSpecRequest extends TeaModel {
    /**
     * <p>Specifies whether payment is automatically made during renewal. Valid values:</p>
     * <br>
     * <p>*   **True**: Automatic payment is enabled. Make sure that your Alibaba Cloud account has adequate balance.</p>
     * <p>*   **False**: Automatic payment is disabled. You have to manually pay in the console. Log on to the console. In the upper-right corner, choose **Expenses > User Center**. In the left-side navigation pane, click **Orders**. On the page that appears, find your order and complete the payment.</p>
     * <br>
     * <p>Default value: **False**.</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The specifications of the instance.</p>
     */
    @NameInMap("InstanceSpec")
    public String instanceSpec;

    /**
     * <p>Specifies whether to upgrade or downgrade the instance. Valid values:</p>
     * <br>
     * <p>*   **UPGRADE**</p>
     * <p>*   **DOWNGRADE**</p>
     * <br>
     * <p>Default value: **UPGRADE**.</p>
     */
    @NameInMap("ModifyAction")
    public String modifyAction;

    /**
     * <p>Specifies whether to skip the Waiting for Traffic Switchover state. During the upgrade or downgrade, a new outbound IP address may be added to the API Gateway instance. The Waiting for Traffic Switchover state is used to remind users of adding the new outbound IP address to the whitelist. If you set the SkipWaitSwitch parameter to true, the instance does not enter the Waiting for Traffic Switchover state when a new outbound IP address is available. Instead, the system sends internal messages to the user.</p>
     */
    @NameInMap("SkipWaitSwitch")
    public Boolean skipWaitSwitch;

    /**
     * <p>The password.</p>
     */
    @NameInMap("Token")
    public String token;

    public static ModifyInstanceSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceSpecRequest self = new ModifyInstanceSpecRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceSpecRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public ModifyInstanceSpecRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceSpecRequest setInstanceSpec(String instanceSpec) {
        this.instanceSpec = instanceSpec;
        return this;
    }
    public String getInstanceSpec() {
        return this.instanceSpec;
    }

    public ModifyInstanceSpecRequest setModifyAction(String modifyAction) {
        this.modifyAction = modifyAction;
        return this;
    }
    public String getModifyAction() {
        return this.modifyAction;
    }

    public ModifyInstanceSpecRequest setSkipWaitSwitch(Boolean skipWaitSwitch) {
        this.skipWaitSwitch = skipWaitSwitch;
        return this;
    }
    public Boolean getSkipWaitSwitch() {
        return this.skipWaitSwitch;
    }

    public ModifyInstanceSpecRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
