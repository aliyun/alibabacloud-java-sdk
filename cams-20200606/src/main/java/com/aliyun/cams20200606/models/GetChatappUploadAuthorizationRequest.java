// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetChatappUploadAuthorizationRequest extends TeaModel {
    /**
     * <p>The space ID of the RAM user within the independent software vendor (ISV) account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>293483938849493</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static GetChatappUploadAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetChatappUploadAuthorizationRequest self = new GetChatappUploadAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public GetChatappUploadAuthorizationRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public GetChatappUploadAuthorizationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetChatappUploadAuthorizationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetChatappUploadAuthorizationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
