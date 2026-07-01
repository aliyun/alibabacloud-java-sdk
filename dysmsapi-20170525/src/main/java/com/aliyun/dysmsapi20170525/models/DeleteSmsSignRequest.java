// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class DeleteSmsSignRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The SMS signature. You can delete signatures that are in the Withdrawn, Failed, or Approved state. You cannot delete signatures that are in the Pending Approval state.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/419282.html">QuerySmsSignList</a> operation to query the signatures that have been applied for under the current account, or view the signature list on the <a href="https://dysms.console.aliyun.com/domestic/text/sign">Signature Management</a> page in the SMS console.</p>
     * <blockquote>
     * <p>Notice: Deleted SMS signatures cannot be recovered, and the signature can no longer be used to send SMS messages. Proceed with caution.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>阿里云</p>
     */
    @NameInMap("SignName")
    public String signName;

    public static DeleteSmsSignRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSmsSignRequest self = new DeleteSmsSignRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSmsSignRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteSmsSignRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteSmsSignRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteSmsSignRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

}
