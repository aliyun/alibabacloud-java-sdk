// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DeletePolicyBindingShrinkRequest extends TeaModel {
    /**
     * <p>The IDs of the data sources that you want to disassociate from the backup policy.</p>
     */
    @NameInMap("DataSourceIds")
    public String dataSourceIdsShrink;

    /**
     * <p>The ID of the backup policy.</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The type of the data source. Valid values:</p>
     * <br>
     * <p>*   **UDM_ECS**: ECS instance backup</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    public static DeletePolicyBindingShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePolicyBindingShrinkRequest self = new DeletePolicyBindingShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeletePolicyBindingShrinkRequest setDataSourceIdsShrink(String dataSourceIdsShrink) {
        this.dataSourceIdsShrink = dataSourceIdsShrink;
        return this;
    }
    public String getDataSourceIdsShrink() {
        return this.dataSourceIdsShrink;
    }

    public DeletePolicyBindingShrinkRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public DeletePolicyBindingShrinkRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
