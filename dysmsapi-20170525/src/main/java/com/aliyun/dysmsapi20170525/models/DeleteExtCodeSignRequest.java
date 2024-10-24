// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class DeleteExtCodeSignRequest extends TeaModel {
    /**
     * <p>扩展码A3</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("ExtCode")
    public String extCode;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>签名</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("SignName")
    public String signName;

    public static DeleteExtCodeSignRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteExtCodeSignRequest self = new DeleteExtCodeSignRequest();
        return TeaModel.build(map, self);
    }

    public DeleteExtCodeSignRequest setExtCode(String extCode) {
        this.extCode = extCode;
        return this;
    }
    public String getExtCode() {
        return this.extCode;
    }

    public DeleteExtCodeSignRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteExtCodeSignRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteExtCodeSignRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteExtCodeSignRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

}
