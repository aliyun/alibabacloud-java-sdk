// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeElasticPlanSpecificationsRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/454250.html">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL Data Lakehouse Edition (V3.0) clusters within a region.</p>
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
     * </blockquote>
     * <ul>
     * <li><p>This parameter must be specified only when you query the resource specifications that are supported by an interactive resource group.</p>
     * </li>
     * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/459446.html">DescribeDBResourceGroup</a> operation to query the name of a resource group within a cluster.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ResourceGroupName")
    public String resourceGroupName;

    /**
     * <p>The type of the scaling plan. Valid values:</p>
     * <ul>
     * <li>EXECUTOR: the interactive resource group type, which specifies the computing resource type.</li>
     * <li>WORKER: the elastic I/O unit (EIU) type.</li>
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
