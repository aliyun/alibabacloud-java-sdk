// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class GetSmsTemplateListShrinkRequest extends TeaModel {
    /**
     * <p>模板审核状态</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AuditStatus")
    public Long auditStatus;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>页码, 默认1</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageIndex")
    public Long pageIndex;

    /**
     * <p>每页数量，默认10</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>签名</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("SignName")
    public String signName;

    /**
     * <p>模板code</p>
     * 
     * <strong>example:</strong>
     * <p>SMS_1688168</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    /**
     * <p>模板名称</p>
     * 
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>模板标签</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("TemplateTag")
    public String templateTag;

    /**
     * <p>模板类型</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TemplateType")
    public Long templateType;

    /**
     * <p>模板状态</p>
     */
    @NameInMap("UsableStateList")
    public String usableStateListShrink;

    public static GetSmsTemplateListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSmsTemplateListShrinkRequest self = new GetSmsTemplateListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetSmsTemplateListShrinkRequest setAuditStatus(Long auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }
    public Long getAuditStatus() {
        return this.auditStatus;
    }

    public GetSmsTemplateListShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetSmsTemplateListShrinkRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public GetSmsTemplateListShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetSmsTemplateListShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetSmsTemplateListShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GetSmsTemplateListShrinkRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public GetSmsTemplateListShrinkRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public GetSmsTemplateListShrinkRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public GetSmsTemplateListShrinkRequest setTemplateTag(String templateTag) {
        this.templateTag = templateTag;
        return this;
    }
    public String getTemplateTag() {
        return this.templateTag;
    }

    public GetSmsTemplateListShrinkRequest setTemplateType(Long templateType) {
        this.templateType = templateType;
        return this;
    }
    public Long getTemplateType() {
        return this.templateType;
    }

    public GetSmsTemplateListShrinkRequest setUsableStateListShrink(String usableStateListShrink) {
        this.usableStateListShrink = usableStateListShrink;
        return this;
    }
    public String getUsableStateListShrink() {
        return this.usableStateListShrink;
    }

}
