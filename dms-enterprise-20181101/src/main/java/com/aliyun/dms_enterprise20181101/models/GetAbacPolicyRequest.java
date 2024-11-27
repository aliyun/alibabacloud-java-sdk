// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetAbacPolicyRequest extends TeaModel {
    /**
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

    public static GetAbacPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAbacPolicyRequest self = new GetAbacPolicyRequest();
        return TeaModel.build(map, self);
    }

    public GetAbacPolicyRequest setAbacPolicyId(Long abacPolicyId) {
        this.abacPolicyId = abacPolicyId;
        return this;
    }
    public Long getAbacPolicyId() {
        return this.abacPolicyId;
    }

    public GetAbacPolicyRequest setAbacPolicyName(String abacPolicyName) {
        this.abacPolicyName = abacPolicyName;
        return this;
    }
    public String getAbacPolicyName() {
        return this.abacPolicyName;
    }

    public GetAbacPolicyRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
