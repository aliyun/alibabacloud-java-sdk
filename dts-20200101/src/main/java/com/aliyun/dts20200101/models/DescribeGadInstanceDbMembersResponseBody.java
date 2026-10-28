// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeGadInstanceDbMembersResponseBody extends TeaModel {
    /**
     * <p>The timestamp when the instance was created.</p>
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
     * <p>SQLServer</p>
     */
    @NameInMap("DbEngineType")
    public String dbEngineType;

    /**
     * <p>The dynamic error code associated with the request.</p>
     * 
     * <strong>example:</strong>
     * <p>403</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic error message, which is used to replace the <strong>%s</strong> placeholder in the <strong>ErrMessage</strong> error message.</p>
     * <blockquote>
     * <p>If <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong> and <strong>DynamicMessage</strong> returns <strong>Type</strong>, it indicates that the <strong>Type</strong> request parameter is invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>DtsJobId</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error code returned if the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalError</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned if the call fails.</p>
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
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>gad-pfx10jt8b8m***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the instance group.</p>
     * 
     * <strong>example:</strong>
     * <p>gad-sqlserver-**-set4</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The instance ID of the primary role.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-j6c685****1kb05</p>
     */
    @NameInMap("MasterDbInstanceId")
    public String masterDbInstanceId;

    /**
     * <p>The region where the DTS instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
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
     * <p>FC3BAAF2-74E3-4471-8EB5-96202D6A****</p>
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
    public DescribeGadInstanceDbMembersResponseBodySlaveDbInstances slaveDbInstances;

    /**
     * <p>The status of the active geo-redundancy instance group.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public String success;

    public static DescribeGadInstanceDbMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGadInstanceDbMembersResponseBody self = new DescribeGadInstanceDbMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGadInstanceDbMembersResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public DescribeGadInstanceDbMembersResponseBody setDbEngineType(String dbEngineType) {
        this.dbEngineType = dbEngineType;
        return this;
    }
    public String getDbEngineType() {
        return this.dbEngineType;
    }

    public DescribeGadInstanceDbMembersResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeGadInstanceDbMembersResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeGadInstanceDbMembersResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeGadInstanceDbMembersResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeGadInstanceDbMembersResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeGadInstanceDbMembersResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeGadInstanceDbMembersResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeGadInstanceDbMembersResponseBody setMasterDbInstanceId(String masterDbInstanceId) {
        this.masterDbInstanceId = masterDbInstanceId;
        return this;
    }
    public String getMasterDbInstanceId() {
        return this.masterDbInstanceId;
    }

    public DescribeGadInstanceDbMembersResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeGadInstanceDbMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGadInstanceDbMembersResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeGadInstanceDbMembersResponseBody setSlaveDbInstances(DescribeGadInstanceDbMembersResponseBodySlaveDbInstances slaveDbInstances) {
        this.slaveDbInstances = slaveDbInstances;
        return this;
    }
    public DescribeGadInstanceDbMembersResponseBodySlaveDbInstances getSlaveDbInstances() {
        return this.slaveDbInstances;
    }

    public DescribeGadInstanceDbMembersResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeGadInstanceDbMembersResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeGadInstanceDbMembersResponseBodySlaveDbInstancesSlaveDbInstances extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("DbInstanceId")
        public String dbInstanceId;

        @NameInMap("DtsInstanceId")
        public String dtsInstanceId;

        @NameInMap("SyncArchitecture")
        public String syncArchitecture;

        public static DescribeGadInstanceDbMembersResponseBodySlaveDbInstancesSlaveDbInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeGadInstanceDbMembersResponseBodySlaveDbInstancesSlaveDbInstances self = new DescribeGadInstanceDbMembersResponseBodySlaveDbInstancesSlaveDbInstances();
            return TeaModel.build(map, self);
        }

        public DescribeGadInstanceDbMembersResponseBodySlaveDbInstancesSlaveDbInstances setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeGadInstanceDbMembersResponseBodySlaveDbInstancesSlaveDbInstances setDbInstanceId(String dbInstanceId) {
            this.dbInstanceId = dbInstanceId;
            return this;
        }
        public String getDbInstanceId() {
            return this.dbInstanceId;
        }

        public DescribeGadInstanceDbMembersResponseBodySlaveDbInstancesSlaveDbInstances setDtsInstanceId(String dtsInstanceId) {
            this.dtsInstanceId = dtsInstanceId;
            return this;
        }
        public String getDtsInstanceId() {
            return this.dtsInstanceId;
        }

        public DescribeGadInstanceDbMembersResponseBodySlaveDbInstancesSlaveDbInstances setSyncArchitecture(String syncArchitecture) {
            this.syncArchitecture = syncArchitecture;
            return this;
        }
        public String getSyncArchitecture() {
            return this.syncArchitecture;
        }

    }

    public static class DescribeGadInstanceDbMembersResponseBodySlaveDbInstances extends TeaModel {
        @NameInMap("SlaveDbInstances")
        public java.util.List<DescribeGadInstanceDbMembersResponseBodySlaveDbInstancesSlaveDbInstances> slaveDbInstances;

        public static DescribeGadInstanceDbMembersResponseBodySlaveDbInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeGadInstanceDbMembersResponseBodySlaveDbInstances self = new DescribeGadInstanceDbMembersResponseBodySlaveDbInstances();
            return TeaModel.build(map, self);
        }

        public DescribeGadInstanceDbMembersResponseBodySlaveDbInstances setSlaveDbInstances(java.util.List<DescribeGadInstanceDbMembersResponseBodySlaveDbInstancesSlaveDbInstances> slaveDbInstances) {
            this.slaveDbInstances = slaveDbInstances;
            return this;
        }
        public java.util.List<DescribeGadInstanceDbMembersResponseBodySlaveDbInstancesSlaveDbInstances> getSlaveDbInstances() {
            return this.slaveDbInstances;
        }

    }

}
