// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreateFlowVersionShrinkRequest extends TeaModel {
    /**
     * <p>Business tenant code, default is “ALICOM_OPAAS”.</p>
     * 
     * <strong>example:</strong>
     * <p>ALICOM_OPAAS</p>
     */
    @NameInMap("BizCode")
    public String bizCode;

    /**
     * <p>Business extension information, default is “{}”.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("BizExtend")
    public String bizExtendShrink;

    /**
     * <p>Flow code.</p>
     * 
     * <strong>example:</strong>
     * <p>f4912c16943b4dfba44bd6fedacf****</p>
     */
    @NameInMap("FlowCode")
    public String flowCode;

    /**
     * <p>The flow version to be copied.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FlowVersionCopyFrom")
    public String flowVersionCopyFrom;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Version remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>Fix Send WhatsApp Message Error</p>
     */
    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateFlowVersionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowVersionShrinkRequest self = new CreateFlowVersionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateFlowVersionShrinkRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public CreateFlowVersionShrinkRequest setBizExtendShrink(String bizExtendShrink) {
        this.bizExtendShrink = bizExtendShrink;
        return this;
    }
    public String getBizExtendShrink() {
        return this.bizExtendShrink;
    }

    public CreateFlowVersionShrinkRequest setFlowCode(String flowCode) {
        this.flowCode = flowCode;
        return this;
    }
    public String getFlowCode() {
        return this.flowCode;
    }

    public CreateFlowVersionShrinkRequest setFlowVersionCopyFrom(String flowVersionCopyFrom) {
        this.flowVersionCopyFrom = flowVersionCopyFrom;
        return this;
    }
    public String getFlowVersionCopyFrom() {
        return this.flowVersionCopyFrom;
    }

    public CreateFlowVersionShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateFlowVersionShrinkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateFlowVersionShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateFlowVersionShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
