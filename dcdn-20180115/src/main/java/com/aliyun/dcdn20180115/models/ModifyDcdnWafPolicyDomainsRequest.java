// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class ModifyDcdnWafPolicyDomainsRequest extends TeaModel {
    @NameInMap("BindDomains")
    public String bindDomains;

    @NameInMap("Method")
    public Integer method;

    @NameInMap("PolicyId")
    public Long policyId;

    @NameInMap("UnbindDomains")
    public String unbindDomains;

    public static ModifyDcdnWafPolicyDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDcdnWafPolicyDomainsRequest self = new ModifyDcdnWafPolicyDomainsRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDcdnWafPolicyDomainsRequest setBindDomains(String bindDomains) {
        this.bindDomains = bindDomains;
        return this;
    }
    public String getBindDomains() {
        return this.bindDomains;
    }

    public ModifyDcdnWafPolicyDomainsRequest setMethod(Integer method) {
        this.method = method;
        return this;
    }
    public Integer getMethod() {
        return this.method;
    }

    public ModifyDcdnWafPolicyDomainsRequest setPolicyId(Long policyId) {
        this.policyId = policyId;
        return this;
    }
    public Long getPolicyId() {
        return this.policyId;
    }

    public ModifyDcdnWafPolicyDomainsRequest setUnbindDomains(String unbindDomains) {
        this.unbindDomains = unbindDomains;
        return this;
    }
    public String getUnbindDomains() {
        return this.unbindDomains;
    }

}
