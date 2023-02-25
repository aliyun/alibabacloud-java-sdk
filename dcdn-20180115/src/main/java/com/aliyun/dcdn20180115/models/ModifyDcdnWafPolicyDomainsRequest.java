// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class ModifyDcdnWafPolicyDomainsRequest extends TeaModel {
    /**
     * <p>The domain names that you want to bind to the protection policy. You can specify up to 50 domain names. Separate multiple domain names with commas (,).</p>
     * <br>
     * <p>> You can configure only one of the **BindDomains** and **UnbindDomains** parameters.</p>
     */
    @NameInMap("BindDomains")
    public String bindDomains;

    @NameInMap("Method")
    public Integer method;

    /**
     * <p>The ID of the protection policy. You can specify only one ID in each request.</p>
     */
    @NameInMap("PolicyId")
    public Long policyId;

    /**
     * <p>The domain names that you want to unbind from the protection policy. You can specify up to 50 domain names. Separate multiple domain names with commas (,).</p>
     * <br>
     * <p>> You can configure only one of the **BindDomains** and **UnbindDomains** parameters.</p>
     */
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
