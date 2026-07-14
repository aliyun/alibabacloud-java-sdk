// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ReadFlowVersionRequest extends TeaModel {
    /**
     * <p>The business tenant code. Default value: ALICOM_OPAAS.</p>
     * 
     * <strong>example:</strong>
     * <p>ALICOM_OPAAS</p>
     */
    @NameInMap("BizCode")
    public String bizCode;

    /**
     * <p>The business extension information. Default value: an empty collection.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("BizExtend")
    public java.util.Map<String, ?> bizExtend;

    /**
     * <p>The flow code. You can view the flow code on the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">flow editor</a> page.</p>
     * 
     * <strong>example:</strong>
     * <p>9ccc41**************************</p>
     */
    @NameInMap("FlowCode")
    public String flowCode;

    /**
     * <p>The flow version. You can click a flow name on the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">flow editor</a> page to go to the canvas orchestration page and view the flow version, or call <a href="https://help.aliyun.com/document_detail/2937202.html">ListFlowVersion</a> to retrieve the flow version.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FlowVersion")
    public String flowVersion;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The flow version status. Valid values:</p>
     * <ul>
     * <li>DRAFT: draft.</li>
     * <li>DELETED: deleted.</li>
     * <li>ONLINE: online.</li>
     * <li>OFFLINE: offline.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DRAFT</p>
     */
    @NameInMap("Status")
    public String status;

    public static ReadFlowVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        ReadFlowVersionRequest self = new ReadFlowVersionRequest();
        return TeaModel.build(map, self);
    }

    public ReadFlowVersionRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public ReadFlowVersionRequest setBizExtend(java.util.Map<String, ?> bizExtend) {
        this.bizExtend = bizExtend;
        return this;
    }
    public java.util.Map<String, ?> getBizExtend() {
        return this.bizExtend;
    }

    public ReadFlowVersionRequest setFlowCode(String flowCode) {
        this.flowCode = flowCode;
        return this;
    }
    public String getFlowCode() {
        return this.flowCode;
    }

    public ReadFlowVersionRequest setFlowVersion(String flowVersion) {
        this.flowVersion = flowVersion;
        return this;
    }
    public String getFlowVersion() {
        return this.flowVersion;
    }

    public ReadFlowVersionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ReadFlowVersionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ReadFlowVersionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ReadFlowVersionRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
