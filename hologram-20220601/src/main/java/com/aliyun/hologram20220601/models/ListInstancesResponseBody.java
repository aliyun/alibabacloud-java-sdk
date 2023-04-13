// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ListInstancesResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("InstanceList")
    public java.util.List<ListInstancesResponseBodyInstanceList> instanceList;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static ListInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesResponseBody self = new ListInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstancesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListInstancesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListInstancesResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListInstancesResponseBody setInstanceList(java.util.List<ListInstancesResponseBodyInstanceList> instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public java.util.List<ListInstancesResponseBodyInstanceList> getInstanceList() {
        return this.instanceList;
    }

    public ListInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstancesResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class ListInstancesResponseBodyInstanceListEndpoints extends TeaModel {
        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("Type")
        public String type;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>VPC ID。</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VpcInstanceId")
        public String vpcInstanceId;

        public static ListInstancesResponseBodyInstanceListEndpoints build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstanceListEndpoints self = new ListInstancesResponseBodyInstanceListEndpoints();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstanceListEndpoints setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListInstancesResponseBodyInstanceListEndpoints setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListInstancesResponseBodyInstanceListEndpoints setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListInstancesResponseBodyInstanceListEndpoints setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListInstancesResponseBodyInstanceListEndpoints setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListInstancesResponseBodyInstanceListEndpoints setVpcInstanceId(String vpcInstanceId) {
            this.vpcInstanceId = vpcInstanceId;
            return this;
        }
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

    }

    public static class ListInstancesResponseBodyInstanceListTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListInstancesResponseBodyInstanceListTags build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstanceListTags self = new ListInstancesResponseBodyInstanceListTags();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstanceListTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListInstancesResponseBodyInstanceListTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListInstancesResponseBodyInstanceList extends TeaModel {
        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("EnableHiveAccess")
        public String enableHiveAccess;

        @NameInMap("Endpoints")
        public java.util.List<ListInstancesResponseBodyInstanceListEndpoints> endpoints;

        @NameInMap("ExpirationTime")
        public String expirationTime;

        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InstanceStatus")
        public String instanceStatus;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("LeaderInstanceId")
        public String leaderInstanceId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("SuspendReason")
        public String suspendReason;

        @NameInMap("Tags")
        public java.util.List<ListInstancesResponseBodyInstanceListTags> tags;

        @NameInMap("Version")
        public String version;

        public static ListInstancesResponseBodyInstanceList build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstanceList self = new ListInstancesResponseBodyInstanceList();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstanceList setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public ListInstancesResponseBodyInstanceList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListInstancesResponseBodyInstanceList setEnableHiveAccess(String enableHiveAccess) {
            this.enableHiveAccess = enableHiveAccess;
            return this;
        }
        public String getEnableHiveAccess() {
            return this.enableHiveAccess;
        }

        public ListInstancesResponseBodyInstanceList setEndpoints(java.util.List<ListInstancesResponseBodyInstanceListEndpoints> endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public java.util.List<ListInstancesResponseBodyInstanceListEndpoints> getEndpoints() {
            return this.endpoints;
        }

        public ListInstancesResponseBodyInstanceList setExpirationTime(String expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }
        public String getExpirationTime() {
            return this.expirationTime;
        }

        public ListInstancesResponseBodyInstanceList setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public ListInstancesResponseBodyInstanceList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstancesResponseBodyInstanceList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListInstancesResponseBodyInstanceList setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public ListInstancesResponseBodyInstanceList setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListInstancesResponseBodyInstanceList setLeaderInstanceId(String leaderInstanceId) {
            this.leaderInstanceId = leaderInstanceId;
            return this;
        }
        public String getLeaderInstanceId() {
            return this.leaderInstanceId;
        }

        public ListInstancesResponseBodyInstanceList setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListInstancesResponseBodyInstanceList setSuspendReason(String suspendReason) {
            this.suspendReason = suspendReason;
            return this;
        }
        public String getSuspendReason() {
            return this.suspendReason;
        }

        public ListInstancesResponseBodyInstanceList setTags(java.util.List<ListInstancesResponseBodyInstanceListTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListInstancesResponseBodyInstanceListTags> getTags() {
            return this.tags;
        }

        public ListInstancesResponseBodyInstanceList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
