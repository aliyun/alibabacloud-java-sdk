// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeInstanceIdsRequest extends TeaModel {
    /**
     * <p>The type of the instance that you want to query. Valid values:</p>
     * <br>
     * <p>*   **0**: Anti-DDoS Premium instance of the Insurance mitigation plan</p>
     * <p>*   **1**: Anti-DDoS Premium instance of the Unlimited mitigation plan</p>
     * <p>*   **2**: Anti-DDoS Premium instance of the Chinese Mainland Acceleration (CMA) mitigation plan</p>
     * <p>*   **9**: Anti-DDoS Pro instance of the Profession mitigation plan</p>
     */
    @NameInMap("Edition")
    public Integer edition;

    /**
     * <p>An array that consists of the IDs of instances to query.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The ID of the resource group to which the instance belongs in Resource Management.</p>
     * <br>
     * <p>If you do not configure this parameter, the instance belongs to the default resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeInstanceIdsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceIdsRequest self = new DescribeInstanceIdsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceIdsRequest setEdition(Integer edition) {
        this.edition = edition;
        return this;
    }
    public Integer getEdition() {
        return this.edition;
    }

    public DescribeInstanceIdsRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeInstanceIdsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
