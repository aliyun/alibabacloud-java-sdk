// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeEnvironmentResponseBody extends TeaModel {
    /**
     * <p>The status code or error code.</p>
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
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
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
        @NameInMap("Key")
        public String key;

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
         * <p>Resource instance ID bound to the environment, including container instance ID or VpcId.</p>
         */
        @NameInMap("BindResourceId")
        public String bindResourceId;

        /**
         * <p>Profile of bound resources.</p>
         */
        @NameInMap("BindResourceProfile")
        public String bindResourceProfile;

        /**
         * <p>The state of the bound resource.</p>
         */
        @NameInMap("BindResourceStatus")
        public String bindResourceStatus;

        /**
         * <p>The storage duration of bound resources (days).</p>
         */
        @NameInMap("BindResourceStoreDuration")
        public String bindResourceStoreDuration;

        /**
         * <p>The bound resource type.</p>
         */
        @NameInMap("BindResourceType")
        public String bindResourceType;

        /**
         * <p>Bind the network segment of the vpc.</p>
         */
        @NameInMap("BindVpcCidr")
        public String bindVpcCidr;

        /**
         * <p>Environment instance ID.</p>
         */
        @NameInMap("EnvironmentId")
        public String environmentId;

        /**
         * <p>Environment name.</p>
         */
        @NameInMap("EnvironmentName")
        public String environmentName;

        /**
         * <p>Environment type:</p>
         * <p>- CS: Container Service.</p>
         * <p>- ECS.</p>
         * <p>- Cloud: cloud service.</p>
         */
        @NameInMap("EnvironmentType")
        public String environmentType;

        /**
         * <p>Grafana data source name.</p>
         */
        @NameInMap("GrafaDataSourceName")
        public String grafaDataSourceName;

        /**
         * <p>Grafana data source unique ID.</p>
         */
        @NameInMap("GrafanaDatasourceUid")
        public String grafanaDatasourceUid;

        /**
         * <p>Grafana directory name.</p>
         */
        @NameInMap("GrafanaFolderTitle")
        public String grafanaFolderTitle;

        /**
         * <p>Grafana directory unique ID.</p>
         */
        @NameInMap("GrafanaFolderUid")
        public String grafanaFolderUid;

        /**
         * <p>Grafana directory URL.</p>
         */
        @NameInMap("GrafanaFolderUrl")
        public String grafanaFolderUrl;

        /**
         * <p>The bound prometheus instance ID.</p>
         */
        @NameInMap("PrometheusInstanceId")
        public String prometheusInstanceId;

        /**
         * <p>The name of the bound prometheus instance.</p>
         */
        @NameInMap("PrometheusInstanceName")
        public String prometheusInstanceName;

        /**
         * <p>The region ID.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeEnvironmentResponseBodyDataTags> tags;

        /**
         * <p>UserId.</p>
         */
        @NameInMap("UserId")
        public String userId;

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

        public DescribeEnvironmentResponseBodyData setEnvironmentType(String environmentType) {
            this.environmentType = environmentType;
            return this;
        }
        public String getEnvironmentType() {
            return this.environmentType;
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
