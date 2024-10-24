// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class UpdateExtCodeSignRequest extends TeaModel {
    /**
     * <p>要修改的扩展码A3</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("ExistExtCode")
    public String existExtCode;

    /**
     * <p>修改后的扩展码A3</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>02</p>
     */
    @NameInMap("NewExtCode")
    public String newExtCode;

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
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("SignName")
    public String signName;

    public static UpdateExtCodeSignRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateExtCodeSignRequest self = new UpdateExtCodeSignRequest();
        return TeaModel.build(map, self);
    }

    public UpdateExtCodeSignRequest setExistExtCode(String existExtCode) {
        this.existExtCode = existExtCode;
        return this;
    }
    public String getExistExtCode() {
        return this.existExtCode;
    }

    public UpdateExtCodeSignRequest setNewExtCode(String newExtCode) {
        this.newExtCode = newExtCode;
        return this;
    }
    public String getNewExtCode() {
        return this.newExtCode;
    }

    public UpdateExtCodeSignRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateExtCodeSignRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateExtCodeSignRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateExtCodeSignRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

}
