// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class SmartCallOperateRequest extends TeaModel {
    /**
     * <p>The unique receipt ID of the call. You can call the <a href="https://help.aliyun.com/document_detail/393526.html">SmartCall</a> operation to obtain the receipt ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>116012854210^1028142****</p>
     */
    @NameInMap("CallId")
    public String callId;

    /**
     * <p>The action that is initiated to the called number of an outbound robocall.</p>
     * <blockquote>
     * <p>Only the value <strong>parallelBridge</strong> is supported. This value indicates that a bridge action is initiated between a called number and an agent of the call center.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>parallelBridge</p>
     */
    @NameInMap("Command")
    public String command;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The extended field.</p>
     * 
     * <strong>example:</strong>
     * <p>Param</p>
     */
    @NameInMap("Param")
    public String param;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static SmartCallOperateRequest build(java.util.Map<String, ?> map) throws Exception {
        SmartCallOperateRequest self = new SmartCallOperateRequest();
        return TeaModel.build(map, self);
    }

    public SmartCallOperateRequest setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public SmartCallOperateRequest setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public SmartCallOperateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SmartCallOperateRequest setParam(String param) {
        this.param = param;
        return this;
    }
    public String getParam() {
        return this.param;
    }

    public SmartCallOperateRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SmartCallOperateRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
