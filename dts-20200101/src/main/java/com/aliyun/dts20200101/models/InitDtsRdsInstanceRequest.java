// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class InitDtsRdsInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the data synchronization task.</p>
     * 
     * <strong>example:</strong>
     * <p>dtszvxa4qmot6p****</p>
     */
    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    /**
     * <p>If the node is a self-managed MySQL database that is connected over CEN, you must specify the ID of the CEN instance.</p>
     * <blockquote>
     * <p>You must specify the <strong>EndpointRegion</strong> and <strong>EndpointInstanceId</strong> parameters or the EndpointCenId parameter based on the type of the node.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cen-9kqshqum*******</p>
     */
    @NameInMap("EndpointCenId")
    public String endpointCenId;

    /**
     * <p>If the node is an ApsaraDB RDS for MySQL instance, you must specify the ID of the ApsaraDB RDS for MySQL instance.</p>
     * <blockquote>
     * <ul>
     * <li>You must also specify the <strong>EndpointRegion</strong> parameter.</li>
     * <li>You must specify the EndpointInstanceId parameter or the <strong>EndpointCenId</strong> parameter based on the type of the node.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rm-bp1162kryivb8****</p>
     */
    @NameInMap("EndpointInstanceId")
    public String endpointInstanceId;

    /**
     * <p>The type of the node. Valid values:</p>
     * <ul>
     * <li><strong>RDS</strong>: an ApsaraDB RDS for MySQL instance</li>
     * <li><strong>CEN</strong>: a self-managed MySQL database that is connected over CEN</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("EndpointInstanceType")
    public String endpointInstanceType;

    /**
     * <p>If the node is an ApsaraDB RDS for MySQL instance, you must specify the region in which the ApsaraDB RDS for MySQL instance resides.</p>
     * <blockquote>
     * <ul>
     * <li>You must also specify the <strong>EndpointInstanceId</strong> parameter.</li>
     * <li>You must specify the EndpointRegion parameter or the <strong>EndpointCenId</strong> parameter based on the type of the node.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("EndpointRegion")
    public String endpointRegion;

    /**
     * <p>The ID of the region in which the active geo-redundancy database cluster resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

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
