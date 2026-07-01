// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class DeleteSmsTemplateRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The SMS template code. You can delete SMS templates that are recalled, rejected, or approved. You cannot delete SMS templates that are being reviewed.</p>
     * <ul>
     * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/419288.html">QuerySmsTemplateList</a> operation to obtain the SMS template code.</p>
     * </li>
     * <li><p>You can also obtain the SMS template code on the <a href="https://dysms.console.aliyun.com/domestic/text/template">Template Management</a> page of the Short Message Service (SMS) console.</p>
     * <blockquote>
     * <p>Notice: Deleted SMS templates cannot be recovered and cannot be used to send messages. Proceed with caution..</p>
     * </blockquote>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SMS_152550****</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    public static DeleteSmsTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSmsTemplateRequest self = new DeleteSmsTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSmsTemplateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteSmsTemplateRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteSmsTemplateRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteSmsTemplateRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

}
