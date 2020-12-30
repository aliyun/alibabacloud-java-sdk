// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetRefererConfigRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("ReferType")
    public String referType;

    @NameInMap("ReferList")
    public String referList;

    @NameInMap("AllowEmpty")
    public String allowEmpty;

    @NameInMap("DisableAst")
    public String disableAst;

    public static SetRefererConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetRefererConfigRequest self = new SetRefererConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetRefererConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetRefererConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public SetRefererConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetRefererConfigRequest setReferType(String referType) {
        this.referType = referType;
        return this;
    }
    public String getReferType() {
        return this.referType;
    }

    public SetRefererConfigRequest setReferList(String referList) {
        this.referList = referList;
        return this;
    }
    public String getReferList() {
        return this.referList;
    }

    public SetRefererConfigRequest setAllowEmpty(String allowEmpty) {
        this.allowEmpty = allowEmpty;
        return this;
    }
    public String getAllowEmpty() {
        return this.allowEmpty;
    }

    public SetRefererConfigRequest setDisableAst(String disableAst) {
        this.disableAst = disableAst;
        return this;
    }
    public String getDisableAst() {
        return this.disableAst;
    }

}
