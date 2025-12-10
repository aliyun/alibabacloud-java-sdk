// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ManageAICLoginRequest extends TeaModel {
    /**
     * <p>Manage actions</p>
     * <p>Valid value:</p>
     * <ul>
     * <li>open</li>
     * <li>close</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>open</p>
     */
    @NameInMap("ActionName")
    public String actionName;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aic-xxx-1</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Public Key Grouping</p>
     * 
     * <strong>example:</strong>
     * <p>g-test</p>
     */
    @NameInMap("KeyGroup")
    public String keyGroup;

    /**
     * <p>Public Key Name</p>
     * 
     * <strong>example:</strong>
     * <p>mykey</p>
     */
    @NameInMap("KeyName")
    public String keyName;

    public static ManageAICLoginRequest build(java.util.Map<String, ?> map) throws Exception {
        ManageAICLoginRequest self = new ManageAICLoginRequest();
        return TeaModel.build(map, self);
    }

    public ManageAICLoginRequest setActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }
    public String getActionName() {
        return this.actionName;
    }

    public ManageAICLoginRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ManageAICLoginRequest setKeyGroup(String keyGroup) {
        this.keyGroup = keyGroup;
        return this;
    }
    public String getKeyGroup() {
        return this.keyGroup;
    }

    public ManageAICLoginRequest setKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }
    public String getKeyName() {
        return this.keyName;
    }

}
