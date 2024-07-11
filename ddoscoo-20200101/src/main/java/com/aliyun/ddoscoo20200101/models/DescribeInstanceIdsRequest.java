// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeInstanceIdsRequest extends TeaModel {
    /**
     * <p>The type of the instance to query. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Anti-DDoS Proxy (Outside Chinese Mainland) instance of the Insurance mitigation plan</li>
     * <li><strong>1</strong>: Anti-DDoS Proxy (Outside Chinese Mainland) instance of the Unlimited mitigation plan</li>
     * <li><strong>2</strong>: Anti-DDoS Proxy (Outside Chinese Mainland) instance of the Chinese Mainland Acceleration (CMA) mitigation plan</li>
     * <li><strong>3</strong>: Anti-DDoS Proxy (Outside Chinese Mainland) instance of the Secure Chinese Mainland Acceleration (Sec-CMA) mitigation plan</li>
     * <li><strong>9</strong>: Anti-DDoS Proxy (Chinese Mainland) instance of the Profession mitigation plan</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("Edition")
    public Integer edition;

    /**
     * <p>The IDs of instances to query.</p>
     * 
     * <strong>example:</strong>
     * <p>ddoscoo-cn-mp91j1ao****</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <strong>example:</strong>
     * <p>rg-acfm2pz25js****</p>
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
