// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class AiccsSmartCallOperateRequest extends TeaModel {
    /**
     * <p>The unique receipt ID of the call. You can obtain this ID by calling the <a href="https://help.aliyun.com/document_detail/311247.html">SendCcoSmartCall</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>116012854210^102814279****</p>
     */
    @NameInMap("CallId")
    public String callId;

    /**
     * <p>The action initiated by the called number during an intelligent outbound call.</p>
     * <blockquote>
     * <p>Currently, only the <strong>parallelBridge</strong> value is supported, which specifies that the action bridges the called number with a call center agent.</p>
     * </blockquote>
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

    /**
     * <p>The product name. Default value: <strong>aiccs</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>aiccs</p>
     */
    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static AiccsSmartCallOperateRequest build(java.util.Map<String, ?> map) throws Exception {
        AiccsSmartCallOperateRequest self = new AiccsSmartCallOperateRequest();
        return TeaModel.build(map, self);
    }

    public AiccsSmartCallOperateRequest setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public AiccsSmartCallOperateRequest setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public AiccsSmartCallOperateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AiccsSmartCallOperateRequest setParam(String param) {
        this.param = param;
        return this;
    }
    public String getParam() {
        return this.param;
    }

    public AiccsSmartCallOperateRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public AiccsSmartCallOperateRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AiccsSmartCallOperateRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
