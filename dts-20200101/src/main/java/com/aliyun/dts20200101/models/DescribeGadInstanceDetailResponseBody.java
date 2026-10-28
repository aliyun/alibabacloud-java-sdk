// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeGadInstanceDetailResponseBody extends TeaModel {
    /**
     * <p>The creation timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1770393523000</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The database engine.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("DbEngineType")
    public String dbEngineType;

    /**
     * <p>The database list mode in disaster recovery scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DbListMode")
    public Integer dbListMode;

    /**
     * <p>The dynamic error code. This parameter will be deprecated soon.</p>
     * 
     * <strong>example:</strong>
     * <p>403</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic error message related to the request.</p>
     * 
     * <strong>example:</strong>
     * <p>DtsJobId</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error code returned when an error occurs during the call.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalError</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned when an error occurs during the call.</p>
     * 
     * <strong>example:</strong>
     * <p>The request processing has failed due to some unknown error.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <p>The ID of the global active instance group.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp162d4tp0500****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the global active instance group.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The GAD instance type.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The instance ID of the primary instance.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp162d4tp0500**</p>
     */
    @NameInMap("MasterDbInstanceId")
    public String masterDbInstanceId;

    /**
     * <p>The region of the primary instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("MasterDbInstanceRegion")
    public String masterDbInstanceRegion;

    /**
     * <p>The zone of the primary instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("MasterDblnstanceZoneld")
    public String masterDblnstanceZoneld;

    /**
     * <p>The architecture type of the primary MongoDB instance. This parameter is specific to MongoDB. Valid values:</p>
     * <ul>
     * <li>1: replica set</li>
     * <li>2: sharded cluster</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MasterEngineArchType")
    public Integer masterEngineArchType;

    /**
     * <p>The region ID. You can specify this parameter to indicate the region where the instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C166D79D-436B-45F0-B5A5-25E1959F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzawhxxc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SlaveDbInstances")
    public DescribeGadInstanceDetailResponseBodySlaveDbInstances slaveDbInstances;

    /**
     * <p>The status of the global active instance group.</p>
     * 
     * <strong>example:</strong>
     * <p>Finished</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static DescribeGadInstanceDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGadInstanceDetailResponseBody self = new DescribeGadInstanceDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGadInstanceDetailResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public DescribeGadInstanceDetailResponseBody setDbEngineType(String dbEngineType) {
        this.dbEngineType = dbEngineType;
        return this;
    }
    public String getDbEngineType() {
        return this.dbEngineType;
    }

    public DescribeGadInstanceDetailResponseBody setDbListMode(Integer dbListMode) {
        this.dbListMode = dbListMode;
        return this;
    }
    public Integer getDbListMode() {
        return this.dbListMode;
    }

    public DescribeGadInstanceDetailResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeGadInstanceDetailResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeGadInstanceDetailResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeGadInstanceDetailResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeGadInstanceDetailResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeGadInstanceDetailResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeGadInstanceDetailResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeGadInstanceDetailResponseBody setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeGadInstanceDetailResponseBody setMasterDbInstanceId(String masterDbInstanceId) {
        this.masterDbInstanceId = masterDbInstanceId;
        return this;
    }
    public String getMasterDbInstanceId() {
        return this.masterDbInstanceId;
    }

    public DescribeGadInstanceDetailResponseBody setMasterDbInstanceRegion(String masterDbInstanceRegion) {
        this.masterDbInstanceRegion = masterDbInstanceRegion;
        return this;
    }
    public String getMasterDbInstanceRegion() {
        return this.masterDbInstanceRegion;
    }

    public DescribeGadInstanceDetailResponseBody setMasterDblnstanceZoneld(String masterDblnstanceZoneld) {
        this.masterDblnstanceZoneld = masterDblnstanceZoneld;
        return this;
    }
    public String getMasterDblnstanceZoneld() {
        return this.masterDblnstanceZoneld;
    }

    public DescribeGadInstanceDetailResponseBody setMasterEngineArchType(Integer masterEngineArchType) {
        this.masterEngineArchType = masterEngineArchType;
        return this;
    }
    public Integer getMasterEngineArchType() {
        return this.masterEngineArchType;
    }

    public DescribeGadInstanceDetailResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeGadInstanceDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGadInstanceDetailResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeGadInstanceDetailResponseBody setSlaveDbInstances(DescribeGadInstanceDetailResponseBodySlaveDbInstances slaveDbInstances) {
        this.slaveDbInstances = slaveDbInstances;
        return this;
    }
    public DescribeGadInstanceDetailResponseBodySlaveDbInstances getSlaveDbInstances() {
        return this.slaveDbInstances;
    }

    public DescribeGadInstanceDetailResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeGadInstanceDetailResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeGadInstanceDetailResponseBodySlaveDbInstancesSlaveDbInstances extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("DbInstanceId")
        public String dbInstanceId;

        @NameInMap("DbInstanceRegion")
        public String dbInstanceRegion;

        @NameInMap("DtsInstanceId")
        public String dtsInstanceId;

        @NameInMap("SyncArchitecture")
        public String syncArchitecture;

        public static DescribeGadInstanceDetailResponseBodySlaveDbInstancesSlaveDbInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeGadInstanceDetailResponseBodySlaveDbInstancesSlaveDbInstances self = new DescribeGadInstanceDetailResponseBodySlaveDbInstancesSlaveDbInstances();
            return TeaModel.build(map, self);
        }

        public DescribeGadInstanceDetailResponseBodySlaveDbInstancesSlaveDbInstances setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeGadInstanceDetailResponseBodySlaveDbInstancesSlaveDbInstances setDbInstanceId(String dbInstanceId) {
            this.dbInstanceId = dbInstanceId;
            return this;
        }
        public String getDbInstanceId() {
            return this.dbInstanceId;
        }

        public DescribeGadInstanceDetailResponseBodySlaveDbInstancesSlaveDbInstances setDbInstanceRegion(String dbInstanceRegion) {
            this.dbInstanceRegion = dbInstanceRegion;
            return this;
        }
        public String getDbInstanceRegion() {
            return this.dbInstanceRegion;
        }

        public DescribeGadInstanceDetailResponseBodySlaveDbInstancesSlaveDbInstances setDtsInstanceId(String dtsInstanceId) {
            this.dtsInstanceId = dtsInstanceId;
            return this;
        }
        public String getDtsInstanceId() {
            return this.dtsInstanceId;
        }

        public DescribeGadInstanceDetailResponseBodySlaveDbInstancesSlaveDbInstances setSyncArchitecture(String syncArchitecture) {
            this.syncArchitecture = syncArchitecture;
            return this;
        }
        public String getSyncArchitecture() {
            return this.syncArchitecture;
        }

    }

    public static class DescribeGadInstanceDetailResponseBodySlaveDbInstances extends TeaModel {
        @NameInMap("SlaveDbInstances")
        public java.util.List<DescribeGadInstanceDetailResponseBodySlaveDbInstancesSlaveDbInstances> slaveDbInstances;

        public static DescribeGadInstanceDetailResponseBodySlaveDbInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeGadInstanceDetailResponseBodySlaveDbInstances self = new DescribeGadInstanceDetailResponseBodySlaveDbInstances();
            return TeaModel.build(map, self);
        }

        public DescribeGadInstanceDetailResponseBodySlaveDbInstances setSlaveDbInstances(java.util.List<DescribeGadInstanceDetailResponseBodySlaveDbInstancesSlaveDbInstances> slaveDbInstances) {
            this.slaveDbInstances = slaveDbInstances;
            return this;
        }
        public java.util.List<DescribeGadInstanceDetailResponseBodySlaveDbInstancesSlaveDbInstances> getSlaveDbInstances() {
            return this.slaveDbInstances;
        }

    }

}
