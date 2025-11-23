// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DeleteAbacPolicyRequest extends TeaModel {
    /**
     * <p>The ID of the policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12****</p>
     */
    @NameInMap("AbacPolicyId")
    public Long abacPolicyId;

    /**
     * <p>The ID of the tenant.</p>
     * <blockquote>
     * <p>To view the tenant ID, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see the <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a> section of the &quot;Manage DMS tenants&quot; topic.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static DeleteAbacPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAbacPolicyRequest self = new DeleteAbacPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAbacPolicyRequest setAbacPolicyId(Long abacPolicyId) {
        this.abacPolicyId = abacPolicyId;
        return this;
    }
    public Long getAbacPolicyId() {
        return this.abacPolicyId;
    }

    public DeleteAbacPolicyRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
