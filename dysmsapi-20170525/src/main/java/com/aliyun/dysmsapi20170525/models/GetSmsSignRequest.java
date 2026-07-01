// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class GetSmsSignRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The signature name. The signature must be applied for by your account.</p>
     * <ul>
     * <li>After you call the <a href="https://help.aliyun.com/document_detail/2807427.html">CreateSmsSign</a> operation, obtain the signature name from the response.</li>
     * <li>View the signature on the <a href="https://dysms.console.aliyun.com/domestic/text/sign">Signatures</a> page.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>阿里云</p>
     */
    @NameInMap("SignName")
    public String signName;

    public static GetSmsSignRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSmsSignRequest self = new GetSmsSignRequest();
        return TeaModel.build(map, self);
    }

    public GetSmsSignRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetSmsSignRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetSmsSignRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GetSmsSignRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

}
