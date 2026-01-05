// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class GetSmsTemplateListRequest extends TeaModel {
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
    public java.util.List<String> usableStateList;

    public static GetSmsTemplateListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSmsTemplateListRequest self = new GetSmsTemplateListRequest();
        return TeaModel.build(map, self);
    }

    public GetSmsTemplateListRequest setAuditStatus(Long auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }
    public Long getAuditStatus() {
        return this.auditStatus;
    }

    public GetSmsTemplateListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetSmsTemplateListRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public GetSmsTemplateListRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetSmsTemplateListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetSmsTemplateListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GetSmsTemplateListRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public GetSmsTemplateListRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public GetSmsTemplateListRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public GetSmsTemplateListRequest setTemplateTag(String templateTag) {
        this.templateTag = templateTag;
        return this;
    }
    public String getTemplateTag() {
        return this.templateTag;
    }

    public GetSmsTemplateListRequest setTemplateType(Long templateType) {
        this.templateType = templateType;
        return this;
    }
    public Long getTemplateType() {
        return this.templateType;
    }

    public GetSmsTemplateListRequest setUsableStateList(java.util.List<String> usableStateList) {
        this.usableStateList = usableStateList;
        return this;
    }
    public java.util.List<String> getUsableStateList() {
        return this.usableStateList;
    }

}
