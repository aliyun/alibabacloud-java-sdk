// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class AddInboundNumberShrinkRequest extends TeaModel {
    /**
     * <p>The code of the large model application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DLWERWLD</p>
     */
    @NameInMap("ApplicationCode")
    public String applicationCode;

    /**
     * <p>A list of inbound numbers.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InboundNumbers")
    public String inboundNumbersShrink;

    /**
     * <p>The line type. Valid values: <code>1</code> (cloud communication resource) and <code>2</code> (customer-owned line).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("InboundType")
    public Long inboundType;

    /**
     * <p>The code for the custom line.</p>
     * 
     * <strong>example:</strong>
     * <p>JILIANG_*****_TEST_NET</p>
     */
    @NameInMap("LineCode")
    public String lineCode;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static AddInboundNumberShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddInboundNumberShrinkRequest self = new AddInboundNumberShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddInboundNumberShrinkRequest setApplicationCode(String applicationCode) {
        this.applicationCode = applicationCode;
        return this;
    }
    public String getApplicationCode() {
        return this.applicationCode;
    }

    public AddInboundNumberShrinkRequest setInboundNumbersShrink(String inboundNumbersShrink) {
        this.inboundNumbersShrink = inboundNumbersShrink;
        return this;
    }
    public String getInboundNumbersShrink() {
        return this.inboundNumbersShrink;
    }

    public AddInboundNumberShrinkRequest setInboundType(Long inboundType) {
        this.inboundType = inboundType;
        return this;
    }
    public Long getInboundType() {
        return this.inboundType;
    }

    public AddInboundNumberShrinkRequest setLineCode(String lineCode) {
        this.lineCode = lineCode;
        return this;
    }
    public String getLineCode() {
        return this.lineCode;
    }

    public AddInboundNumberShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddInboundNumberShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddInboundNumberShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
