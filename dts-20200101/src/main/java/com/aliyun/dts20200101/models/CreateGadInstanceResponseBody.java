// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CreateGadInstanceResponseBody extends TeaModel {
    /**
     * <p>The timestamp when the instance was created.</p>
     * 
     * <strong>example:</strong>
     * <p>1733821662000</p>
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
     * <p>The dynamic error code.</p>
     * 
     * <strong>example:</strong>
     * <p>403</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic error message, which is used to replace the %s placeholder in the error message of the ErrMessage response parameter.</p>
     * <blockquote>
     * <p>If ErrMessage returns The Value of Input Parameter %s is not valid and DynamicMessage returns JobId, the JobId request parameter is invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Type</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error code returned when the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalError</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned when the call fails.</p>
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
     * <p>rm-bpxxxxxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the group. The name must be globally unique.</p>
     * 
     * <strong>example:</strong>
     * <p>gad-sqlserver-hk-set4</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The instance type. Valid values: DR (disaster recovery) and GAD (active geo-redundancy).</p>
     * 
     * <strong>example:</strong>
     * <p>DR</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The ID of the primary ApsaraDB RDS instance.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-j6c497vzndgd8m***</p>
     */
    @NameInMap("MasterDbInstanceId")
    public String masterDbInstanceId;

    /**
     * <p>The region of the primary instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hongkong</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C306C198-7807-409D-930A-D6CE6C32****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek3d****4mxya</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The status of the group. The status is Running immediately after the group is created.</p>
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
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static CreateGadInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGadInstanceResponseBody self = new CreateGadInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGadInstanceResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public CreateGadInstanceResponseBody setDbEngineType(String dbEngineType) {
        this.dbEngineType = dbEngineType;
        return this;
    }
    public String getDbEngineType() {
        return this.dbEngineType;
    }

    public CreateGadInstanceResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public CreateGadInstanceResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public CreateGadInstanceResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public CreateGadInstanceResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public CreateGadInstanceResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateGadInstanceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateGadInstanceResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateGadInstanceResponseBody setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateGadInstanceResponseBody setMasterDbInstanceId(String masterDbInstanceId) {
        this.masterDbInstanceId = masterDbInstanceId;
        return this;
    }
    public String getMasterDbInstanceId() {
        return this.masterDbInstanceId;
    }

    public CreateGadInstanceResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateGadInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateGadInstanceResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateGadInstanceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateGadInstanceResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
