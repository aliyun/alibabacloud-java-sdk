// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeElasticPlanRequest extends TeaModel {
    /**
     * <p>The ID of the AnalyticDB for MySQL Data Warehouse Edition (V3.0) cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL Data Warehouse Edition (V3.0) clusters within a region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-bp278jg9****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Specifies whether the scaling plan takes effect. Valid values:</p>
     * <ul>
     * <li><strong>true</strong> (default)</li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ElasticPlanEnable")
    public Boolean elasticPlanEnable;

    /**
     * <p>The name of the scaling plan.</p>
     * <ul>
     * <li>The name must be 2 to 30 characters in length.</li>
     * <li>The name can contain letters, digits, and underscores (_).</li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify this parameter, the information about all scaling plans for the specified cluster is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>realtime</p>
     */
    @NameInMap("ElasticPlanName")
    public String elasticPlanName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The name of the resource group.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/466685.html">DescribeDBResourceGroup</a> operation to query the resource group name.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>USER_DEFAULT</p>
     */
    @NameInMap("ResourcePoolName")
    public String resourcePoolName;

    public static DescribeElasticPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticPlanRequest self = new DescribeElasticPlanRequest();
        return TeaModel.build(map, self);
    }

    public DescribeElasticPlanRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeElasticPlanRequest setElasticPlanEnable(Boolean elasticPlanEnable) {
        this.elasticPlanEnable = elasticPlanEnable;
        return this;
    }
    public Boolean getElasticPlanEnable() {
        return this.elasticPlanEnable;
    }

    public DescribeElasticPlanRequest setElasticPlanName(String elasticPlanName) {
        this.elasticPlanName = elasticPlanName;
        return this;
    }
    public String getElasticPlanName() {
        return this.elasticPlanName;
    }

    public DescribeElasticPlanRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeElasticPlanRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeElasticPlanRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeElasticPlanRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeElasticPlanRequest setResourcePoolName(String resourcePoolName) {
        this.resourcePoolName = resourcePoolName;
        return this;
    }
    public String getResourcePoolName() {
        return this.resourcePoolName;
    }

}
