// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeSceneDefenseObjectsRequest extends TeaModel {
    @NameInMap("PolicyId")
    public String policyId;

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
