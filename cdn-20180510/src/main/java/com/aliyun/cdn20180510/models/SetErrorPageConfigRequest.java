// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetErrorPageConfigRequest extends TeaModel {
    @NameInMap("CustomPageUrl")
    public String customPageUrl;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageType")
    public String pageType;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static SetErrorPageConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetErrorPageConfigRequest self = new SetErrorPageConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetErrorPageConfigRequest setCustomPageUrl(String customPageUrl) {
        this.customPageUrl = customPageUrl;
        return this;
    }
    public String getCustomPageUrl() {
        return this.customPageUrl;
    }

    public SetErrorPageConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetErrorPageConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetErrorPageConfigRequest setPageType(String pageType) {
        this.pageType = pageType;
        return this;
    }
    public String getPageType() {
        return this.pageType;
    }

    public SetErrorPageConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
