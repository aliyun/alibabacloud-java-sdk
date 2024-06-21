// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeEnvironmentResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. The status code 200 indicates that the request was successful. Other status codes indicate that the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned struct.</p>
     */
    @NameInMap("Data")
    public DescribeEnvironmentResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>message</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C21AB7CF-B7AF-410F-BD61-82D1567F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeEnvironmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnvironmentResponseBody self = new DescribeEnvironmentResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEnvironmentResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeEnvironmentResponseBody setData(DescribeEnvironmentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeEnvironmentResponseBodyData getData() {
        return this.data;
    }

    public DescribeEnvironmentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeEnvironmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeEnvironmentResponseBodyDataTags extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>user1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag</p>
         * 
         * <strong>example:</strong>
         * <p>p_dev</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeEnvironmentResponseBodyDataTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnvironmentResponseBodyDataTags self = new DescribeEnvironmentResponseBodyDataTags();
            return TeaModel.build(map, self);
        }

        public DescribeEnvironmentResponseBodyDataTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeEnvironmentResponseBodyDataTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeEnvironmentResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the resource associated with the environment, such as the ACK cluster ID or VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-xxxxx</p>
         */
        @NameInMap("BindResourceId")
        public String bindResourceId;

        /**
         * <p>The profile of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        @NameInMap("BindResourceProfile")
        public String bindResourceProfile;

        /**
         * <p>The status of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("BindResourceStatus")
        public String bindResourceStatus;

        /**
         * <p>The retention period of the resource. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("BindResourceStoreDuration")
        public String bindResourceStoreDuration;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("BindResourceType")
        public String bindResourceType;

        /**
         * <p>The VPC CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/16</p>
         */
        @NameInMap("BindVpcCidr")
        public String bindVpcCidr;

        /**
         * <p>The status of the database that is bound to the Prometheus instance.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>UNINSTALLING</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>INSTALLING</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>UNINSTALLED</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>RUNNING</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>MODIFYING</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("DbInstanceStatus")
        public String dbInstanceStatus;

        /**
         * <p>The ID of the environment instance.</p>
         * 
         * <strong>example:</strong>
         * <p>env-xxxxx</p>
         */
        @NameInMap("EnvironmentId")
        public String environmentId;

        /**
         * <p>The environment name.</p>
         * 
         * <strong>example:</strong>
         * <p>env1</p>
         */
        @NameInMap("EnvironmentName")
        public String environmentName;

        /**
         * <p>Environment subtypes:</p>
         * <ul>
         * <li>CS: Currently supports ACK.</li>
         * <li>ECS: ECS is currently supported.</li>
         * <li>Cloud: Currently supports Cloud.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACK</p>
         */
        @NameInMap("EnvironmentSubType")
        public String environmentSubType;

        /**
         * <p>The type of the environment. Valid values:</p>
         * <ul>
         * <li>CS: Container Service for Kubernetes (ACK)</li>
         * <li>ECS: Elastic Compute Service</li>
         * <li>Cloud: cloud service</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CS</p>
         */
        @NameInMap("EnvironmentType")
        public String environmentType;

        /**
         * <p>The payable resource plan. Valid values:</p>
         * <ul>
         * <li>If the EnvironmentType parameter is set to CS, set the value to CS_Basic or CS_Pro.</li>
         * <li>Otherwise, leave the parameter empty.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CS_Basic</p>
         */
        @NameInMap("FeePackage")
        public String feePackage;

        /**
         * <p>The name of the Grafana data source.</p>
         * 
         * <strong>example:</strong>
         * <p>datasource1</p>
         */
        @NameInMap("GrafaDataSourceName")
        public String grafaDataSourceName;

        /**
         * <p>The unique ID of the Grafana data source.</p>
         * 
         * <strong>example:</strong>
         * <p>zuvw</p>
         */
        @NameInMap("GrafanaDatasourceUid")
        public String grafanaDatasourceUid;

        /**
         * <p>The name of the Grafana directory.</p>
         * 
         * <strong>example:</strong>
         * <p>folder1</p>
         */
        @NameInMap("GrafanaFolderTitle")
        public String grafanaFolderTitle;

        /**
         * <p>The unique ID of the Grafana directory.</p>
         * 
         * <strong>example:</strong>
         * <p>xyz</p>
         */
        @NameInMap("GrafanaFolderUid")
        public String grafanaFolderUid;

        /**
         * <p>The URL of the Grafana directory.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://g.console.aliyun.com/dashboards/f/xxx/yyyy">https://g.console.aliyun.com/dashboards/f/xxx/yyyy</a></p>
         */
        @NameInMap("GrafanaFolderUrl")
        public String grafanaFolderUrl;

        /**
         * <p>grafana工作区id</p>
         * 
         * <strong>example:</strong>
         * <p>grafana-cn-27a3m8eem0a</p>
         */
        @NameInMap("GrafanaWorkspaceId")
        public String grafanaWorkspaceId;

        /**
         * <p>managed type:</p>
         * <ul>
         * <li>none: unmanaged. The default value for ACK clusters.</li>
         * <li>agent: managed agent (including KSM). The default values for ASK, ACS, and AckOne clusters.</li>
         * <li>agent-exporter: managed agent and exporters. The default value for the cloud service type.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("ManagedType")
        public String managedType;

        /**
         * <p>The ID of the Prometheus instance.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxyyyyyzzzzz</p>
         */
        @NameInMap("PrometheusInstanceId")
        public String prometheusInstanceId;

        /**
         * <p>The name of the Prometheus instance.</p>
         * 
         * <strong>example:</strong>
         * <p>name1</p>
         */
        @NameInMap("PrometheusInstanceName")
        public String prometheusInstanceName;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2vezare****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeEnvironmentResponseBodyDataTags> tags;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>13002222xxxx</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-8vb02uk57qbcktqcvqqqj</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeEnvironmentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnvironmentResponseBodyData self = new DescribeEnvironmentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeEnvironmentResponseBodyData setBindResourceId(String bindResourceId) {
            this.bindResourceId = bindResourceId;
            return this;
        }
        public String getBindResourceId() {
            return this.bindResourceId;
        }

        public DescribeEnvironmentResponseBodyData setBindResourceProfile(String bindResourceProfile) {
            this.bindResourceProfile = bindResourceProfile;
            return this;
        }
        public String getBindResourceProfile() {
            return this.bindResourceProfile;
        }

        public DescribeEnvironmentResponseBodyData setBindResourceStatus(String bindResourceStatus) {
            this.bindResourceStatus = bindResourceStatus;
            return this;
        }
        public String getBindResourceStatus() {
            return this.bindResourceStatus;
        }

        public DescribeEnvironmentResponseBodyData setBindResourceStoreDuration(String bindResourceStoreDuration) {
            this.bindResourceStoreDuration = bindResourceStoreDuration;
            return this;
        }
        public String getBindResourceStoreDuration() {
            return this.bindResourceStoreDuration;
        }

        public DescribeEnvironmentResponseBodyData setBindResourceType(String bindResourceType) {
            this.bindResourceType = bindResourceType;
            return this;
        }
        public String getBindResourceType() {
            return this.bindResourceType;
        }

        public DescribeEnvironmentResponseBodyData setBindVpcCidr(String bindVpcCidr) {
            this.bindVpcCidr = bindVpcCidr;
            return this;
        }
        public String getBindVpcCidr() {
            return this.bindVpcCidr;
        }

        public DescribeEnvironmentResponseBodyData setDbInstanceStatus(String dbInstanceStatus) {
            this.dbInstanceStatus = dbInstanceStatus;
            return this;
        }
        public String getDbInstanceStatus() {
            return this.dbInstanceStatus;
        }

        public DescribeEnvironmentResponseBodyData setEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public String getEnvironmentId() {
            return this.environmentId;
        }

        public DescribeEnvironmentResponseBodyData setEnvironmentName(String environmentName) {
            this.environmentName = environmentName;
            return this;
        }
        public String getEnvironmentName() {
            return this.environmentName;
        }

        public DescribeEnvironmentResponseBodyData setEnvironmentSubType(String environmentSubType) {
            this.environmentSubType = environmentSubType;
            return this;
        }
        public String getEnvironmentSubType() {
            return this.environmentSubType;
        }

        public DescribeEnvironmentResponseBodyData setEnvironmentType(String environmentType) {
            this.environmentType = environmentType;
            return this;
        }
        public String getEnvironmentType() {
            return this.environmentType;
        }

        public DescribeEnvironmentResponseBodyData setFeePackage(String feePackage) {
            this.feePackage = feePackage;
            return this;
        }
        public String getFeePackage() {
            return this.feePackage;
        }

        public DescribeEnvironmentResponseBodyData setGrafaDataSourceName(String grafaDataSourceName) {
            this.grafaDataSourceName = grafaDataSourceName;
            return this;
        }
        public String getGrafaDataSourceName() {
            return this.grafaDataSourceName;
        }

        public DescribeEnvironmentResponseBodyData setGrafanaDatasourceUid(String grafanaDatasourceUid) {
            this.grafanaDatasourceUid = grafanaDatasourceUid;
            return this;
        }
        public String getGrafanaDatasourceUid() {
            return this.grafanaDatasourceUid;
        }

        public DescribeEnvironmentResponseBodyData setGrafanaFolderTitle(String grafanaFolderTitle) {
            this.grafanaFolderTitle = grafanaFolderTitle;
            return this;
        }
        public String getGrafanaFolderTitle() {
            return this.grafanaFolderTitle;
        }

        public DescribeEnvironmentResponseBodyData setGrafanaFolderUid(String grafanaFolderUid) {
            this.grafanaFolderUid = grafanaFolderUid;
            return this;
        }
        public String getGrafanaFolderUid() {
            return this.grafanaFolderUid;
        }

        public DescribeEnvironmentResponseBodyData setGrafanaFolderUrl(String grafanaFolderUrl) {
            this.grafanaFolderUrl = grafanaFolderUrl;
            return this;
        }
        public String getGrafanaFolderUrl() {
            return this.grafanaFolderUrl;
        }

        public DescribeEnvironmentResponseBodyData setGrafanaWorkspaceId(String grafanaWorkspaceId) {
            this.grafanaWorkspaceId = grafanaWorkspaceId;
            return this;
        }
        public String getGrafanaWorkspaceId() {
            return this.grafanaWorkspaceId;
        }

        public DescribeEnvironmentResponseBodyData setManagedType(String managedType) {
            this.managedType = managedType;
            return this;
        }
        public String getManagedType() {
            return this.managedType;
        }

        public DescribeEnvironmentResponseBodyData setPrometheusInstanceId(String prometheusInstanceId) {
            this.prometheusInstanceId = prometheusInstanceId;
            return this;
        }
        public String getPrometheusInstanceId() {
            return this.prometheusInstanceId;
        }

        public DescribeEnvironmentResponseBodyData setPrometheusInstanceName(String prometheusInstanceName) {
            this.prometheusInstanceName = prometheusInstanceName;
            return this;
        }
        public String getPrometheusInstanceName() {
            return this.prometheusInstanceName;
        }

        public DescribeEnvironmentResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeEnvironmentResponseBodyData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeEnvironmentResponseBodyData setTags(java.util.List<DescribeEnvironmentResponseBodyDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeEnvironmentResponseBodyDataTags> getTags() {
            return this.tags;
        }

        public DescribeEnvironmentResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public DescribeEnvironmentResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
