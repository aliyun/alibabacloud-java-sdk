// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class InitDtsRdsInstanceRequest extends TeaModel {
    /**
     * <p>The instance ID of the synchronization node.</p>
     * 
     * <strong>example:</strong>
     * <p>dtszvxa4qmot6p****</p>
     */
    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    /**
     * <p>The instance ID of the CEN instance. This parameter is required if the unit node is a self-managed MySQL database connected through CEN.</p>
     * <blockquote>
     * <p>You must specify either this parameter or the ApsaraDB RDS for MySQL-related parameters (<strong>EndpointRegion</strong> and <strong>EndpointInstanceId</strong>).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cen-9kqshqum*******</p>
     */
    @NameInMap("EndpointCenId")
    public String endpointCenId;

    /**
     * <p>The instance ID of the ApsaraDB RDS for MySQL instance. This parameter is required if the unit node is an ApsaraDB RDS for MySQL instance.</p>
     * <blockquote>
     * <ul>
     * <li>You must also specify the <strong>EndpointRegion</strong> parameter.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>You must specify either this parameter or <strong>EndpointCenId</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>rm-bp1162kryivb8****</p>
     */
    @NameInMap("EndpointInstanceId")
    public String endpointInstanceId;

    /**
     * <p>The instance type of the unit node. Valid values:</p>
     * <ul>
     * <li><strong>RDS</strong>: ApsaraDB RDS for MySQL instance.</li>
     * <li><strong>CEN</strong>: self-managed MySQL database connected through CEN.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("EndpointInstanceType")
    public String endpointInstanceType;

    /**
     * <p>The region in which the ApsaraDB RDS for MySQL instance resides. This parameter is required if the unit node is an ApsaraDB RDS for MySQL instance.</p>
     * <blockquote>
     * <ul>
     * <li>You must also specify the <strong>EndpointInstanceId</strong> parameter.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>You must specify either this parameter or <strong>EndpointCenId</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("EndpointRegion")
    public String endpointRegion;

    /**
     * <p>The region in which the active geo-redundancy database cluster resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group. This is a global parameter and does not need to be specified for this operation.</p>
     * 
     * <strong>example:</strong>
     * <p>资源组ID，全局参数，当前API无需传入。</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static InitDtsRdsInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        InitDtsRdsInstanceRequest self = new InitDtsRdsInstanceRequest();
        return TeaModel.build(map, self);
    }

    public InitDtsRdsInstanceRequest setDtsInstanceId(String dtsInstanceId) {
        this.dtsInstanceId = dtsInstanceId;
        return this;
    }
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    public InitDtsRdsInstanceRequest setEndpointCenId(String endpointCenId) {
        this.endpointCenId = endpointCenId;
        return this;
    }
    public String getEndpointCenId() {
        return this.endpointCenId;
    }

    public InitDtsRdsInstanceRequest setEndpointInstanceId(String endpointInstanceId) {
        this.endpointInstanceId = endpointInstanceId;
        return this;
    }
    public String getEndpointInstanceId() {
        return this.endpointInstanceId;
    }

    public InitDtsRdsInstanceRequest setEndpointInstanceType(String endpointInstanceType) {
        this.endpointInstanceType = endpointInstanceType;
        return this;
    }
    public String getEndpointInstanceType() {
        return this.endpointInstanceType;
    }

    public InitDtsRdsInstanceRequest setEndpointRegion(String endpointRegion) {
        this.endpointRegion = endpointRegion;
        return this;
    }
    public String getEndpointRegion() {
        return this.endpointRegion;
    }

    public InitDtsRdsInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public InitDtsRdsInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
