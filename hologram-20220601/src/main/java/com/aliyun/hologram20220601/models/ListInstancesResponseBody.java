// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ListInstancesResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <p>The list of queried instances.</p>
     */
    @NameInMap("InstanceList")
    public java.util.List<ListInstancesResponseBodyInstanceList> instanceList;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
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
        /**
         * <p>Indicates whether the endpoint is enabled.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   false</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The endpoint.</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The network type.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   VPCSingleTunnel</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    virtual private cloud (VPC)</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    .</p>
         * <br>
         * <p>*   Intranet</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    internal network</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   VPCAnyTunnel</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    : This value is not supported by new instances</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    .</p>
         * <br>
         * <p>*   Internet</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    Internet</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    .</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The vSwitch ID.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The VPC ID.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of the VPC to which the instance belongs.</p>
         */
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
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
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
        /**
         * <p>The commodity code, which is the same as that on the Billing Management page.</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The time when the cluster was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>Indicates whether lakehouse acceleration is enabled.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   false</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("EnableHiveAccess")
        public String enableHiveAccess;

        /**
         * <p>The list of endpoints.</p>
         */
        @NameInMap("Endpoints")
        public java.util.List<ListInstancesResponseBodyInstanceListEndpoints> endpoints;

        /**
         * <p>The time when the cluster expires.</p>
         */
        @NameInMap("ExpirationTime")
        public String expirationTime;

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   PostPaid</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    pay-as-you-go</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    .</p>
         * <br>
         * <p>*   PrePaid</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    subscription</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    .</p>
         */
        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the instance.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The status of the instance.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   Creating</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   Running</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   Suspended</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   Allocating</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("InstanceStatus")
        public String instanceStatus;

        /**
         * <p>The type of the instance.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   Follower</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    read-only secondary instance</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    .</p>
         * <br>
         * <p>*   Standard</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    normal instance</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    .</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The ID of the primary instance.</p>
         */
        @NameInMap("LeaderInstanceId")
        public String leaderInstanceId;

        /**
         * <p>The ID of the resource group.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The reason for the suspension.</p>
         */
        @NameInMap("SuspendReason")
        public String suspendReason;

        /**
         * <p>The tags that are added to the resource.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListInstancesResponseBodyInstanceListTags> tags;

        /**
         * <p>The version of the cluster.</p>
         */
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
