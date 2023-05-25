// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetDomainRequest extends TeaModel {
    @NameInMap("BindStageName")
    public String bindStageName;

    @NameInMap("CustomDomainType")
    public String customDomainType;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("IsForce")
    public Boolean isForce;

    @NameInMap("IsHttpRedirectToHttps")
    public Boolean isHttpRedirectToHttps;

    public static SetDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDomainRequest self = new SetDomainRequest();
        return TeaModel.build(map, self);
    }

    public SetDomainRequest setBindStageName(String bindStageName) {
        this.bindStageName = bindStageName;
        return this;
    }
    public String getBindStageName() {
        return this.bindStageName;
    }

    public SetDomainRequest setCustomDomainType(String customDomainType) {
        this.customDomainType = customDomainType;
        return this;
    }
    public String getCustomDomainType() {
        return this.customDomainType;
    }

    public SetDomainRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetDomainRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public SetDomainRequest setIsForce(Boolean isForce) {
        this.isForce = isForce;
        return this;
    }
    public Boolean getIsForce() {
        return this.isForce;
    }

    public SetDomainRequest setIsHttpRedirectToHttps(Boolean isHttpRedirectToHttps) {
        this.isHttpRedirectToHttps = isHttpRedirectToHttps;
        return this;
    }
    public Boolean getIsHttpRedirectToHttps() {
        return this.isHttpRedirectToHttps;
    }

}
