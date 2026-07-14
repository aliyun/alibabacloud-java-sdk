// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class UpdatePhoneEncryptionPublicKeyRequest extends TeaModel {
    /**
     * <p>The space ID of the ISV sub-customer or the instance ID of the direct customer. You can view the Space ID on the
     * &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement">Channel Management</a>
     * &lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList">Channel Management</a>
     * page.</p>
     * 
     * <strong>example:</strong>
     * <p>cams-kei****</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The public key.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN PUBLIC KEY-----\nMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAt+PMrYw4zUDEk+VeTrp0\n8LZaoVpiVFErX7iuoDjUs4F9vkxMQuIABjcXw\/swzTMEopLORQV28uqN\/2\/x9hjU\****\/Zwa\/Vk5Svp4\niVY4e22FsJCCWUEMvayO8Q+3UGq0eXXQ+8SlUWEMq1VaJ4pwCLsMnmgybA+VmJxi\nkwIDAQAB\n-----END PUBLIC KEY-----&quot;</p>
     */
    @NameInMap("EncryptionPublicKey")
    public String encryptionPublicKey;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The phone number. You can view the phone number on the
     * &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>
     * &lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList">Channel Management</a>&gt; <strong>Manage</strong> &gt; <strong>WABA Management</strong> &gt; <strong>Number Management</strong> page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>86158********</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static UpdatePhoneEncryptionPublicKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePhoneEncryptionPublicKeyRequest self = new UpdatePhoneEncryptionPublicKeyRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePhoneEncryptionPublicKeyRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public UpdatePhoneEncryptionPublicKeyRequest setEncryptionPublicKey(String encryptionPublicKey) {
        this.encryptionPublicKey = encryptionPublicKey;
        return this;
    }
    public String getEncryptionPublicKey() {
        return this.encryptionPublicKey;
    }

    public UpdatePhoneEncryptionPublicKeyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdatePhoneEncryptionPublicKeyRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public UpdatePhoneEncryptionPublicKeyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdatePhoneEncryptionPublicKeyRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
