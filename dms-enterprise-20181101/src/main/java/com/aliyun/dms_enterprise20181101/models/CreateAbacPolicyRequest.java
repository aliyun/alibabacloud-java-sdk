// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateAbacPolicyRequest extends TeaModel {
    /**
     * <p>The content of the policy. Specifies whether the authorized user can access and use the resources and features defined in the policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;Statement&quot;: [
     *     {
     *       &quot;Action&quot;: &quot;<em>&quot;,
     *       &quot;Effect&quot;: &quot;Allow&quot;,
     *       &quot;Resource&quot;: &quot;</em>&quot;,
     *       &quot;Condition&quot;: {
     *         &quot;StringEqualsIgnoreCase&quot;: {
     *           &quot;dms:DbType&quot;: [
     *             &quot;redis&quot;
     *           ]
     *         }
     *       }
     *     }
     *   ],
     *   &quot;Version&quot;: &quot;1&quot;
     * }</p>
     */
    @NameInMap("AbacPolicyContent")
    public String abacPolicyContent;

    /**
     * <p>The description of the policy.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("AbacPolicyDesc")
    public String abacPolicyDesc;

    /**
     * <p>The name of the policy. The name must be unique for the tenant.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>policy_test</p>
     */
    @NameInMap("AbacPolicyName")
    public String abacPolicyName;

    /**
     * <p>The ID of the tenant.</p>
     * <blockquote>
     * <p>To view the ID of the tenant, go to the DMS console and move the pointer over the profile picture in the upper-right corner. For more information, see the <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a> section of the &quot;Manage DMS tenants&quot; topic.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static CreateAbacPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAbacPolicyRequest self = new CreateAbacPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateAbacPolicyRequest setAbacPolicyContent(String abacPolicyContent) {
        this.abacPolicyContent = abacPolicyContent;
        return this;
    }
    public String getAbacPolicyContent() {
        return this.abacPolicyContent;
    }

    public CreateAbacPolicyRequest setAbacPolicyDesc(String abacPolicyDesc) {
        this.abacPolicyDesc = abacPolicyDesc;
        return this;
    }
    public String getAbacPolicyDesc() {
        return this.abacPolicyDesc;
    }

    public CreateAbacPolicyRequest setAbacPolicyName(String abacPolicyName) {
        this.abacPolicyName = abacPolicyName;
        return this;
    }
    public String getAbacPolicyName() {
        return this.abacPolicyName;
    }

    public CreateAbacPolicyRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
