// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class AddInboundNumberRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DLWERWLD</p>
     */
    @NameInMap("ApplicationCode")
    public String applicationCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InboundNumbers")
    public java.util.List<String> inboundNumbers;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("InboundType")
    public Long inboundType;

    /**
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

    public static AddInboundNumberRequest build(java.util.Map<String, ?> map) throws Exception {
        AddInboundNumberRequest self = new AddInboundNumberRequest();
        return TeaModel.build(map, self);
    }

    public AddInboundNumberRequest setApplicationCode(String applicationCode) {
        this.applicationCode = applicationCode;
        return this;
    }
    public String getApplicationCode() {
        return this.applicationCode;
    }

    public AddInboundNumberRequest setInboundNumbers(java.util.List<String> inboundNumbers) {
        this.inboundNumbers = inboundNumbers;
        return this;
    }
    public java.util.List<String> getInboundNumbers() {
        return this.inboundNumbers;
    }

    public AddInboundNumberRequest setInboundType(Long inboundType) {
        this.inboundType = inboundType;
        return this;
    }
    public Long getInboundType() {
        return this.inboundType;
    }

    public AddInboundNumberRequest setLineCode(String lineCode) {
        this.lineCode = lineCode;
        return this;
    }
    public String getLineCode() {
        return this.lineCode;
    }

    public AddInboundNumberRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddInboundNumberRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddInboundNumberRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
