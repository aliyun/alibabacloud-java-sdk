// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class SendCcoSmartCallOperateRequest extends TeaModel {
    /**
     * <p>Unique receipt ID of the call. This can be obtained from the response of the <a href="https://help.aliyun.com/document_detail/311247.html">SendCcoSmartCall</a> API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>116012854210^102814279****</p>
     */
    @NameInMap("CallId")
    public String callId;

    /**
     * <p>Specifies the action to be performed for the called number during an Intelligent Outbound Call.  </p>
     * <blockquote>
     * <p>Currently, only the <strong>parallelBridge</strong> parameter is supported, which indicates bridging the called number with a call center agent.</p>
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
     * <p>Extension field.</p>
     * 
     * <strong>example:</strong>
     * <p>Param</p>
     */
    @NameInMap("Param")
    public String param;

    /**
     * <p>Product name. Default value: <strong>aiccs</strong>.</p>
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

    public static SendCcoSmartCallOperateRequest build(java.util.Map<String, ?> map) throws Exception {
        SendCcoSmartCallOperateRequest self = new SendCcoSmartCallOperateRequest();
        return TeaModel.build(map, self);
    }

    public SendCcoSmartCallOperateRequest setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public SendCcoSmartCallOperateRequest setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public SendCcoSmartCallOperateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SendCcoSmartCallOperateRequest setParam(String param) {
        this.param = param;
        return this;
    }
    public String getParam() {
        return this.param;
    }

    public SendCcoSmartCallOperateRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public SendCcoSmartCallOperateRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SendCcoSmartCallOperateRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
