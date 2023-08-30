// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class ModifyDcdnWafPolicyDomainsRequest extends TeaModel {
    /**
     * <p>The domain names that you want to bind to the protection policy. You can specify up to 50 domain names. Separate multiple domain names with commas (,).</p>
     * <br>
     * <p>> You can configure either **BindDomains** or **UnbindDomains**.</p>
     */
    @NameInMap("BindDomains")
    public String bindDomains;

    /**
     * <p>The association method. Valid values:</p>
     * <br>
     * <p>*   0: replace.</p>
     * <p>*   1: add.</p>
     * <p>*   Default value: 0.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   This parameter takes effect only when you specify **BindDomains**. If you have associated a domain name indicated by **BindDomains** with the default protection policy, the `Policy.DefaultAndCustom.BindToSameDomain` error is returned.</p>
     * <br>
     * <p>*   You can only replace accelerated domain names that are bound to the default protection policy.</p>
     */
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
     * <p>> You can configure either **BindDomains** or **UnbindDomains**.</p>
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
