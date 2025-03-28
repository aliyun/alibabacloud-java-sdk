// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeGadInstancesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>403</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <strong>example:</strong>
     * <p>present environment is not support,so skip.</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <strong>example:</strong>
     * <p>InternalError</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>The request processing has failed due to some unknown error.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("Instances")
    public DescribeGadInstancesResponseBodyInstances instances;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <strong>example:</strong>
     * <p>C166D79D-436B-45F0-B5A5-25E1959F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeGadInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGadInstancesResponseBody self = new DescribeGadInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGadInstancesResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeGadInstancesResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeGadInstancesResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeGadInstancesResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeGadInstancesResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeGadInstancesResponseBody setInstances(DescribeGadInstancesResponseBodyInstances instances) {
        this.instances = instances;
        return this;
    }
    public DescribeGadInstancesResponseBodyInstances getInstances() {
        return this.instances;
    }

    public DescribeGadInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGadInstancesResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeGadInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGadInstancesResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public DescribeGadInstancesResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeGadInstancesResponseBodyInstancesInstances extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-05-29 23:55:58</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("DbEngineType")
        public String dbEngineType;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DbInstanceCount")
        public Integer dbInstanceCount;

        /**
         * <strong>example:</strong>
         * <p>rg-a76s8afa****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("InstanceRegion")
        public String instanceRegion;

        /**
         * <strong>example:</strong>
         * <p>DR</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <strong>example:</strong>
         * <p>rm-sadfasfa****</p>
         */
        @NameInMap("MasterDbInstanceId")
        public String masterDbInstanceId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("MasterDbInstanceName")
        public String masterDbInstanceName;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("MasterDbInstanceRegion")
        public String masterDbInstanceRegion;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("MasterDbInstanceZoneId")
        public String masterDbInstanceZoneId;

        /**
         * <strong>example:</strong>
         * <p>rg-aekzq276dmnaxqa</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeGadInstancesResponseBodyInstancesInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeGadInstancesResponseBodyInstancesInstances self = new DescribeGadInstancesResponseBodyInstancesInstances();
            return TeaModel.build(map, self);
        }

        public DescribeGadInstancesResponseBodyInstancesInstances setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeGadInstancesResponseBodyInstancesInstances setDbEngineType(String dbEngineType) {
            this.dbEngineType = dbEngineType;
            return this;
        }
        public String getDbEngineType() {
            return this.dbEngineType;
        }

        public DescribeGadInstancesResponseBodyInstancesInstances setDbInstanceCount(Integer dbInstanceCount) {
            this.dbInstanceCount = dbInstanceCount;
            return this;
        }
        public Integer getDbInstanceCount() {
            return this.dbInstanceCount;
        }

        public DescribeGadInstancesResponseBodyInstancesInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeGadInstancesResponseBodyInstancesInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeGadInstancesResponseBodyInstancesInstances setInstanceRegion(String instanceRegion) {
            this.instanceRegion = instanceRegion;
            return this;
        }
        public String getInstanceRegion() {
            return this.instanceRegion;
        }

        public DescribeGadInstancesResponseBodyInstancesInstances setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeGadInstancesResponseBodyInstancesInstances setMasterDbInstanceId(String masterDbInstanceId) {
            this.masterDbInstanceId = masterDbInstanceId;
            return this;
        }
        public String getMasterDbInstanceId() {
            return this.masterDbInstanceId;
        }

        public DescribeGadInstancesResponseBodyInstancesInstances setMasterDbInstanceName(String masterDbInstanceName) {
            this.masterDbInstanceName = masterDbInstanceName;
            return this;
        }
        public String getMasterDbInstanceName() {
            return this.masterDbInstanceName;
        }

        public DescribeGadInstancesResponseBodyInstancesInstances setMasterDbInstanceRegion(String masterDbInstanceRegion) {
            this.masterDbInstanceRegion = masterDbInstanceRegion;
            return this;
        }
        public String getMasterDbInstanceRegion() {
            return this.masterDbInstanceRegion;
        }

        public DescribeGadInstancesResponseBodyInstancesInstances setMasterDbInstanceZoneId(String masterDbInstanceZoneId) {
            this.masterDbInstanceZoneId = masterDbInstanceZoneId;
            return this;
        }
        public String getMasterDbInstanceZoneId() {
            return this.masterDbInstanceZoneId;
        }

        public DescribeGadInstancesResponseBodyInstancesInstances setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeGadInstancesResponseBodyInstancesInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeGadInstancesResponseBodyInstances extends TeaModel {
        @NameInMap("Instances")
        public java.util.List<DescribeGadInstancesResponseBodyInstancesInstances> instances;

        public static DescribeGadInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeGadInstancesResponseBodyInstances self = new DescribeGadInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeGadInstancesResponseBodyInstances setInstances(java.util.List<DescribeGadInstancesResponseBodyInstancesInstances> instances) {
            this.instances = instances;
            return this;
        }
        public java.util.List<DescribeGadInstancesResponseBodyInstancesInstances> getInstances() {
            return this.instances;
        }

    }

}
