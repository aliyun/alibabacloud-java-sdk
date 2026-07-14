// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ModifyFlowShrinkRequest extends TeaModel {
    /**
     * <p>The folder.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Categories")
    public String categoriesShrink;

    /**
     * <p>The space ID of the ISV sub-customer.</p>
     * 
     * <strong>example:</strong>
     * <p>cams-1sdkjwen2</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The URL of the WA Flow Endpoint</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.***.com">http://www.***.com</a></p>
     */
    @NameInMap("EndpointUri")
    public String endpointUri;

    /**
     * <p>The ID of the flow.</p>
     * 
     * <strong>example:</strong>
     * <p>21231232312</p>
     */
    @NameInMap("FlowId")
    public String flowId;

    /**
     * <p>The name of the flow.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Flow-**001</p>
     */
    @NameInMap("FlowName")
    public String flowName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyFlowShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyFlowShrinkRequest self = new ModifyFlowShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyFlowShrinkRequest setCategoriesShrink(String categoriesShrink) {
        this.categoriesShrink = categoriesShrink;
        return this;
    }
    public String getCategoriesShrink() {
        return this.categoriesShrink;
    }

    public ModifyFlowShrinkRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public ModifyFlowShrinkRequest setEndpointUri(String endpointUri) {
        this.endpointUri = endpointUri;
        return this;
    }
    public String getEndpointUri() {
        return this.endpointUri;
    }

    public ModifyFlowShrinkRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public ModifyFlowShrinkRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public ModifyFlowShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyFlowShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyFlowShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
