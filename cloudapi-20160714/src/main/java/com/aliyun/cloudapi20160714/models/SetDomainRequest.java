// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetDomainRequest extends TeaModel {
    /**
     * <p>The network type of the domain name to be bound. Default value: INTERNET. Valid values:</p>
     * <br>
     * <p>*   INTERNET</p>
     * <p>*   INTRANET. If you set this parameter to this value, the domain name cannot be used on the Internet.</p>
     */
    @NameInMap("BindStageName")
    public String bindStageName;

    /**
     * <p>Specifies whether this binding relationship takes precedence over the binding relationships between the domain name and other API groups. If you set this parameter to true, this binding relationship takes precedence, and the domain name is automatically unbound from other API groups. This operation brings risks. Proceed with caution.</p>
     */
    @NameInMap("CustomDomainType")
    public String customDomainType;

    /**
     * <p>The environment which you can access by using the domain name. If you do not specify this parameter, the domain name can be used to access all environments.</p>
     * <br>
     * <p>If you specify an environment, the domain name can be used to access only the specified environment. Valid values:</p>
     * <br>
     * <p>*   TEST</p>
     * <p>*   PRE</p>
     * <p>*   RELEASE</p>
     * <br>
     * <p>If you want to use the domain name to access all environments, set this parameter to an empty string ("").</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The custom domain name.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>Specifies whether to redirect HTTP requests to HTTPS requests.</p>
     */
    @NameInMap("IsForce")
    public Boolean isForce;

    /**
     * <p>The ID of the request.</p>
     */
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
