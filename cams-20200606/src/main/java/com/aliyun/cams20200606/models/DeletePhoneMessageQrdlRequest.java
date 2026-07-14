// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class DeletePhoneMessageQrdlRequest extends TeaModel {
    /**
     * <p>The space ID of the ISV sub-customer or the instance ID of the direct customer. You can view the Space ID on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement">Channel Management</a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList">Channel Management</a> page.</p>
     * 
     * <strong>example:</strong>
     * <p>cams-kei****</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The phone number. You can view the phone number on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList">Channel Management</a> &gt; <strong>Management</strong> &gt; <strong>WABA Management</strong> &gt; <strong>Number Management</strong> page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>86158********</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    /**
     * <p>The QR code encoding. This is the QrdlCode returned by the <a href="https://help.aliyun.com/document_detail/2638749.html">CreatePhoneMessageQrdl</a> operation when you created the message QR code, or the QrdlCode returned by the <a href="https://help.aliyun.com/document_detail/2638746.html">UpdatePhoneMessageQrdl</a> operation when you updated the QR code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>D9II3***</p>
     */
    @NameInMap("QrdlCode")
    public String qrdlCode;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DeletePhoneMessageQrdlRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePhoneMessageQrdlRequest self = new DeletePhoneMessageQrdlRequest();
        return TeaModel.build(map, self);
    }

    public DeletePhoneMessageQrdlRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public DeletePhoneMessageQrdlRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeletePhoneMessageQrdlRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public DeletePhoneMessageQrdlRequest setQrdlCode(String qrdlCode) {
        this.qrdlCode = qrdlCode;
        return this;
    }
    public String getQrdlCode() {
        return this.qrdlCode;
    }

    public DeletePhoneMessageQrdlRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeletePhoneMessageQrdlRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
