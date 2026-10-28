// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeGadInstancesRequest extends TeaModel {
    /**
     * <p>The list of database engine types. Separate multiple types with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL,PostgreSQL,SQLServer</p>
     */
    @NameInMap("DbEngineTypes")
    public String dbEngineTypes;

    /**
     * <p>The name of the active geo-redundancy instance group.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("MasterDbInstanceId")
    public String masterDbInstanceId;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID. Specify this parameter to indicate the region where the instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzawhxxc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the secondary database instance.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-a1b2c3d4e5f6g7h8i</p>
     */
    @NameInMap("SlaveDbInstanceId")
    public String slaveDbInstanceId;

    public static DescribeGadInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGadInstancesRequest self = new DescribeGadInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGadInstancesRequest setDbEngineTypes(String dbEngineTypes) {
        this.dbEngineTypes = dbEngineTypes;
        return this;
    }
    public String getDbEngineTypes() {
        return this.dbEngineTypes;
    }

    public DescribeGadInstancesRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeGadInstancesRequest setMasterDbInstanceId(String masterDbInstanceId) {
        this.masterDbInstanceId = masterDbInstanceId;
        return this;
    }
    public String getMasterDbInstanceId() {
        return this.masterDbInstanceId;
    }

    public DescribeGadInstancesRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DescribeGadInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGadInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGadInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeGadInstancesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeGadInstancesRequest setSlaveDbInstanceId(String slaveDbInstanceId) {
        this.slaveDbInstanceId = slaveDbInstanceId;
        return this;
    }
    public String getSlaveDbInstanceId() {
        return this.slaveDbInstanceId;
    }

}
