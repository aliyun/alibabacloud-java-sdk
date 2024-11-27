// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateAbacPolicyRequest extends TeaModel {
    /**
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
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("AbacPolicyDesc")
    public String abacPolicyDesc;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12****</p>
     */
    @NameInMap("AbacPolicyId")
    public Long abacPolicyId;

    /**
     * <strong>example:</strong>
     * <p>policy_test</p>
     */
    @NameInMap("AbacPolicyName")
    public String abacPolicyName;

    /**
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static UpdateAbacPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAbacPolicyRequest self = new UpdateAbacPolicyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAbacPolicyRequest setAbacPolicyContent(String abacPolicyContent) {
        this.abacPolicyContent = abacPolicyContent;
        return this;
    }
    public String getAbacPolicyContent() {
        return this.abacPolicyContent;
    }

    public UpdateAbacPolicyRequest setAbacPolicyDesc(String abacPolicyDesc) {
        this.abacPolicyDesc = abacPolicyDesc;
        return this;
    }
    public String getAbacPolicyDesc() {
        return this.abacPolicyDesc;
    }

    public UpdateAbacPolicyRequest setAbacPolicyId(Long abacPolicyId) {
        this.abacPolicyId = abacPolicyId;
        return this;
    }
    public Long getAbacPolicyId() {
        return this.abacPolicyId;
    }

    public UpdateAbacPolicyRequest setAbacPolicyName(String abacPolicyName) {
        this.abacPolicyName = abacPolicyName;
        return this;
    }
    public String getAbacPolicyName() {
        return this.abacPolicyName;
    }

    public UpdateAbacPolicyRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
