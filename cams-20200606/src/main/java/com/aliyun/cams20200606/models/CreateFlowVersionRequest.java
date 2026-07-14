// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreateFlowVersionRequest extends TeaModel {
    /**
     * <p>The business tenant code. The default value is ALICOM_OPAAS.</p>
     * 
     * <strong>example:</strong>
     * <p>ALICOM_OPAAS</p>
     */
    @NameInMap("BizCode")
    public String bizCode;

    /**
     * <p>The business extension information. The default value is an empty collection.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("BizExtend")
    public java.util.Map<String, ?> bizExtend;

    /**
     * <p>The code of the flow. You can view the flow code in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>9ccc41**************************</p>
     */
    @NameInMap("FlowCode")
    public String flowCode;

    /**
     * <p>The version of the flow to copy. To view the historical versions of a flow, go to the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a> and click a flow name to open the orchestration canvas.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FlowVersionCopyFrom")
    public String flowVersionCopyFrom;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The remarks for the version.</p>
     * 
     * <strong>example:</strong>
     * <p>修复发送WhatsApp消息错误</p>
     */
    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateFlowVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowVersionRequest self = new CreateFlowVersionRequest();
        return TeaModel.build(map, self);
    }

    public CreateFlowVersionRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public CreateFlowVersionRequest setBizExtend(java.util.Map<String, ?> bizExtend) {
        this.bizExtend = bizExtend;
        return this;
    }
    public java.util.Map<String, ?> getBizExtend() {
        return this.bizExtend;
    }

    public CreateFlowVersionRequest setFlowCode(String flowCode) {
        this.flowCode = flowCode;
        return this;
    }
    public String getFlowCode() {
        return this.flowCode;
    }

    public CreateFlowVersionRequest setFlowVersionCopyFrom(String flowVersionCopyFrom) {
        this.flowVersionCopyFrom = flowVersionCopyFrom;
        return this;
    }
    public String getFlowVersionCopyFrom() {
        return this.flowVersionCopyFrom;
    }

    public CreateFlowVersionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateFlowVersionRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateFlowVersionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateFlowVersionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
