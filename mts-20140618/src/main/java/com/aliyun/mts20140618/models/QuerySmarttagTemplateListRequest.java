// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QuerySmarttagTemplateListRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the template. You can obtain the template ID from the response of the <a href="https://help.aliyun.com/document_detail/187759.html">AddSmarttagTemplate</a> operation. If you set this parameter to a specific value, the information about the corresponding template is returned. If you do not specify this parameter, the operation returns the information about all the templates that are created by the current RAM user.</p>
     * 
     * <strong>example:</strong>
     * <p>05de22f255284c7a8d2aab535dde****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static QuerySmarttagTemplateListRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySmarttagTemplateListRequest self = new QuerySmarttagTemplateListRequest();
        return TeaModel.build(map, self);
    }

    public QuerySmarttagTemplateListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public QuerySmarttagTemplateListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QuerySmarttagTemplateListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QuerySmarttagTemplateListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QuerySmarttagTemplateListRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
