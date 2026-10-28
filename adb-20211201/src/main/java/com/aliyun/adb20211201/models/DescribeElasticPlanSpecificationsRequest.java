// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeElasticPlanSpecificationsRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/454250.html">DescribeDBClusters</a> operation to query the cluster ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-wz9509beptiz****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The name of the resource group.</p>
     * <blockquote>
     * <ul>
     * <li>To query the specifications supported by the elastic plan of an Interactive resource group (compute resource type), you must specify the resource group name. To query the specifications supported by the elastic plan of the storage acceleration service (EIU), you do not need to specify the resource group name.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/459446.html">DescribeDBResourceGroup</a> operation to query the resource group name of a specific cluster.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ResourceGroupName")
    public String resourceGroupName;

    /**
     * <p>The type of the elastic plan. Valid values:</p>
     * <ul>
     * <li>EXECUTOR: Interactive resource group, which is the compute resource type.</li>
     * <li>WORKER: storage acceleration service (EIU).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>EXECUTOR</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeElasticPlanSpecificationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticPlanSpecificationsRequest self = new DescribeElasticPlanSpecificationsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeElasticPlanSpecificationsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeElasticPlanSpecificationsRequest setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public DescribeElasticPlanSpecificationsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
