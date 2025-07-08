// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreateSmsInternalApplyRequest extends TeaModel {
    @NameInMap("AppDownloadLink")
    public String appDownloadLink;

    @NameInMap("Country")
    public String country;

    @NameInMap("Industry")
    public String industry;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageLink")
    public String pageLink;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TemplateName")
    public String templateName;

    public static CreateSmsInternalApplyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSmsInternalApplyRequest self = new CreateSmsInternalApplyRequest();
        return TeaModel.build(map, self);
    }

    public CreateSmsInternalApplyRequest setAppDownloadLink(String appDownloadLink) {
        this.appDownloadLink = appDownloadLink;
        return this;
    }
    public String getAppDownloadLink() {
        return this.appDownloadLink;
    }

    public CreateSmsInternalApplyRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public CreateSmsInternalApplyRequest setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

    public CreateSmsInternalApplyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateSmsInternalApplyRequest setPageLink(String pageLink) {
        this.pageLink = pageLink;
        return this;
    }
    public String getPageLink() {
        return this.pageLink;
    }

    public CreateSmsInternalApplyRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public CreateSmsInternalApplyRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateSmsInternalApplyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateSmsInternalApplyRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateSmsInternalApplyRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
