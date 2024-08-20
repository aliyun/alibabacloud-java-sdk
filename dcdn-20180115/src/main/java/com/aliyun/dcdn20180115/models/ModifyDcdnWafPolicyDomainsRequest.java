// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class ModifyDcdnWafPolicyDomainsRequest extends TeaModel {
    /**
     * <p>The domain names that you want to bind to the protection policy. You can specify up to 50 domain names. Separate multiple domain names with commas (,).</p>
     * <blockquote>
     * <p>You can configure either <strong>BindDomains</strong> or <strong>UnbindDomains</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>example.com,example2.com</p>
     */
    @NameInMap("BindDomains")
    public String bindDomains;

    /**
     * <p>The association method. Valid values:</p>
     * <ul>
     * <li>0: replace.</li>
     * <li>1: add.</li>
     * <li>Default value: 0.</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This parameter takes effect only when you specify <strong>BindDomains</strong>. If you have associated a domain name indicated by <strong>BindDomains</strong> with the default protection policy, the <code>Policy.DefaultAndCustom.BindToSameDomain</code> error is returned.</p>
     * </li>
     * <li><p>You can only replace accelerated domain names that are bound to the default protection policy.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Method")
    public Integer method;

    /**
     * <p>The ID of the protection policy. You can specify only one ID in each request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000001</p>
     */
    @NameInMap("PolicyId")
    public Long policyId;

    /**
     * <p>The domain names that you want to unbind from the protection policy. You can specify up to 50 domain names. Separate multiple domain names with commas (,).</p>
     * <blockquote>
     * <p>You can configure either <strong>BindDomains</strong> or <strong>UnbindDomains</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>example3.com</p>
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
