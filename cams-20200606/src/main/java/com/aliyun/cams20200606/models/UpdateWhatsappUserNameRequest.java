// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class UpdateWhatsappUserNameRequest extends TeaModel {
    /**
     * <p>The space ID of the ISV sub-customer or the instance ID of the direct customer. You can view the space ID on the
     * &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement">Channel Management</a>
     * &lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList">Channel Management</a>
     * page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cams-kskd****</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The business phone number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8613800***</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    /**
     * <p>The transfer action that controls what happens when the requested username is currently used by another business phone number in the same business asset portfolio. For example, use this parameter when you want to move an existing username to another phone number. Valid values:</p>
     * <ul>
     * <li><p>none (default): does not transfer the account. If another business phone number in the same business asset portfolio already uses this username, the request fails with error code 147005.</p>
     * </li>
     * <li><p>force_transfer: transfers the account from the other business phone number to this business phone number. The account is removed from the other phone number and assigned to this phone number.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>none</p>
     */
    @NameInMap("TransferAction")
    public String transferAction;

    /**
     * <p>Whatsapp user name</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alibaba</p>
     */
    @NameInMap("Username")
    public String username;

    public static UpdateWhatsappUserNameRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWhatsappUserNameRequest self = new UpdateWhatsappUserNameRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWhatsappUserNameRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public UpdateWhatsappUserNameRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public UpdateWhatsappUserNameRequest setTransferAction(String transferAction) {
        this.transferAction = transferAction;
        return this;
    }
    public String getTransferAction() {
        return this.transferAction;
    }

    public UpdateWhatsappUserNameRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
