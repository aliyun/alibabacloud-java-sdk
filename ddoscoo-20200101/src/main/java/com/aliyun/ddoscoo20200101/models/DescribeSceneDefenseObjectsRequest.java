// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeSceneDefenseObjectsRequest extends TeaModel {
    /**
     * <p>The ID of the policy that you want to query.</p>
     * <br>
     * <p>> You can call the [DescribeSceneDefensePolicies](https://help.aliyun.com/document_detail/159382.html) operation to query the IDs of all policies.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The ID of the resource group to which the instance belongs in Resource Management.</p>
     * <br>
     * <p>If you do not configure this parameter, the instance belongs to the default resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeSceneDefenseObjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSceneDefenseObjectsRequest self = new DescribeSceneDefenseObjectsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSceneDefenseObjectsRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public DescribeSceneDefenseObjectsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
