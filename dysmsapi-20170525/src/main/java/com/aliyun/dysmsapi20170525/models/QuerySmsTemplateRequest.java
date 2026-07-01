// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySmsTemplateRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The template code.</p>
     * <ul>
     * <li><p>The template code is returned in the response of the <a href="https://help.aliyun.com/document_detail/121208.html">AddSmsTemplate</a> API.</p>
     * </li>
     * <li><p>The template code is available on the <a href="https://dysms.console.aliyun.com/domestic/text/template">Template Management</a> page.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SMS_1525****</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    public static QuerySmsTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsTemplateRequest self = new QuerySmsTemplateRequest();
        return TeaModel.build(map, self);
    }

    public QuerySmsTemplateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QuerySmsTemplateRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QuerySmsTemplateRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QuerySmsTemplateRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

}
