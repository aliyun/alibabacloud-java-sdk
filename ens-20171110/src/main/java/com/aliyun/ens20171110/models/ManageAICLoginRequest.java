// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ManageAICLoginRequest extends TeaModel {
    /**
     * <p>The management action.
     * When this parameter is set to open, the AIC instance must be in the running state. You can call DescribeAICInstances to query the state.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>open</p>
     */
    @NameInMap("ActionName")
    public String actionName;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aic-xxx-1</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The group of the public key.
     * When you set ActionName to open and use the public key to log on, you must first upload the public key by calling UploadAICPublicKey and provide the corresponding KeyName and KeyGroup.</p>
     * 
     * <strong>example:</strong>
     * <p>g-test</p>
     */
    @NameInMap("KeyGroup")
    public String keyGroup;

    /**
     * <p>The name of the public key.
     * When you set ActionName to open and use the public key to log on, you must first upload the public key by calling UploadAICPublicKey and provide the corresponding KeyName and KeyGroup.</p>
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
