// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DeletePolicyBindingRequest extends TeaModel {
    /**
     * <p>The IDs of the data sources that you want to disassociate from the backup policy.</p>
     */
    @NameInMap("DataSourceIds")
    public java.util.List<String> dataSourceIds;

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

    public static DeletePolicyBindingRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePolicyBindingRequest self = new DeletePolicyBindingRequest();
        return TeaModel.build(map, self);
    }

    public DeletePolicyBindingRequest setDataSourceIds(java.util.List<String> dataSourceIds) {
        this.dataSourceIds = dataSourceIds;
        return this;
    }
    public java.util.List<String> getDataSourceIds() {
        return this.dataSourceIds;
    }

    public DeletePolicyBindingRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public DeletePolicyBindingRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
