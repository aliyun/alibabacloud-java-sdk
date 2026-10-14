// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeInstanceIdsRequest extends TeaModel {
    /**
     * <p>The edition of the Anti-DDoS Pro or Anti-DDoS Premium instance to query. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Anti-DDoS Pro or Anti-DDoS Premium (outside the Chinese mainland) Insurance Edition.</li>
     * <li><strong>1</strong>: Anti-DDoS Pro or Anti-DDoS Premium (outside the Chinese mainland) Unlimited Edition.</li>
     * <li><strong>2</strong>: Anti-DDoS Pro or Anti-DDoS Premium (outside the Chinese mainland) Acceleration Line.</li>
     * <li><strong>3</strong>: Anti-DDoS Pro or Anti-DDoS Premium (outside the Chinese mainland) Secure Acceleration Line.</li>
     * <li><strong>9</strong>: Anti-DDoS Pro or Anti-DDoS Premium (the Chinese mainland) Professional Edition.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("Edition")
    public Integer edition;

    /**
     * <p>The IDs of the Anti-DDoS Pro or Anti-DDoS Premium instances to query. Maximum value of N: 200.</p>
     * 
     * <strong>example:</strong>
     * <p>ddoscoo-cn-mp91j1ao****</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The ID of the resource group to which the Anti-DDoS Pro or Anti-DDoS Premium instance belongs in Resource Management.</p>
     * <p>If you do not specify this parameter, the default resource group is used.</p>
     * 
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
