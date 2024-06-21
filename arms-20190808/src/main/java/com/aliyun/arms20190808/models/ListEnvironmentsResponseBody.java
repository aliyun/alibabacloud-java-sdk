// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListEnvironmentsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. The status code 200 indicates that the request was successful.</p>
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
    public ListEnvironmentsResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1A9C645C-C83F-4C9D-8CCB-29BEC9E1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values: true and false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListEnvironmentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentsResponseBody self = new ListEnvironmentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListEnvironmentsResponseBody setData(ListEnvironmentsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListEnvironmentsResponseBodyData getData() {
        return this.data;
    }

    public ListEnvironmentsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListEnvironmentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEnvironmentsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListEnvironmentsResponseBodyDataEnvironmentsAddons extends TeaModel {
        /**
         * <p>The alias of the add-on.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL Exporter</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The description of the add-on.</p>
         * 
         * <strong>example:</strong>
         * <p>Collect mysql indicator information</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The URL of the icon.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxxx">http://xxxx</a></p>
         */
        @NameInMap("Icon")
        public String icon;

        /**
         * <p>The name of the add-on.</p>
         * 
         * <strong>example:</strong>
         * <p>metric-agent</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListEnvironmentsResponseBodyDataEnvironmentsAddons build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentsResponseBodyDataEnvironmentsAddons self = new ListEnvironmentsResponseBodyDataEnvironmentsAddons();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentsResponseBodyDataEnvironmentsAddons setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public ListEnvironmentsResponseBodyDataEnvironmentsAddons setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListEnvironmentsResponseBodyDataEnvironmentsAddons setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public ListEnvironmentsResponseBodyDataEnvironmentsAddons setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListEnvironmentsResponseBodyDataEnvironmentsFeatures extends TeaModel {
        /**
         * <p>The alias of the feature.</p>
         * 
         * <strong>example:</strong>
         * <p>Prometheus Agent</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The description of the feature.</p>
         * 
         * <strong>example:</strong>
         * <p>Collect Metric data using the Prometheus collection specification</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The URL of the icon.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxx">http://xxx</a></p>
         */
        @NameInMap("Icon")
        public String icon;

        /**
         * <p>The name of the feature.</p>
         * 
         * <strong>example:</strong>
         * <p>metirc-agent</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListEnvironmentsResponseBodyDataEnvironmentsFeatures build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentsResponseBodyDataEnvironmentsFeatures self = new ListEnvironmentsResponseBodyDataEnvironmentsFeatures();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentsResponseBodyDataEnvironmentsFeatures setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public ListEnvironmentsResponseBodyDataEnvironmentsFeatures setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListEnvironmentsResponseBodyDataEnvironmentsFeatures setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public ListEnvironmentsResponseBodyDataEnvironmentsFeatures setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListEnvironmentsResponseBodyDataEnvironmentsTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>fpx-tag</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListEnvironmentsResponseBodyDataEnvironmentsTags build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentsResponseBodyDataEnvironmentsTags self = new ListEnvironmentsResponseBodyDataEnvironmentsTags();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentsResponseBodyDataEnvironmentsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListEnvironmentsResponseBodyDataEnvironmentsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEnvironmentsResponseBodyDataEnvironments extends TeaModel {
        /**
         * <p>The add-ons.</p>
         */
        @NameInMap("Addons")
        public java.util.List<ListEnvironmentsResponseBodyDataEnvironmentsAddons> addons;

        /**
         * <p>The ID of the resource bound to the environment instance. The resource can be a Kubernetes cluster or a VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1bgo8ronn</p>
         */
        @NameInMap("BindResourceId")
        public String bindResourceId;

        /**
         * <p>The profile that is bound to the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("BindResourceProfile")
        public String bindResourceProfile;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("BindResourceType")
        public String bindResourceType;

        /**
         * <p>The CIDR block that is bound to the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.0.0/12</p>
         */
        @NameInMap("BindVpcCidr")
        public String bindVpcCidr;

        /**
         * <p>The time when the environment instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-24 11:58:35 +0800</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12378523784982</p>
         */
        @NameInMap("CreatedUserId")
        public String createdUserId;

        /**
         * <p>The ID of the environment instance.</p>
         * 
         * <strong>example:</strong>
         * <p>env-xxx</p>
         */
        @NameInMap("EnvironmentId")
        public String environmentId;

        /**
         * <p>The name of the environment instance.</p>
         * 
         * <strong>example:</strong>
         * <p>feiliks-biz-prod-edas</p>
         */
        @NameInMap("EnvironmentName")
        public String environmentName;

        /**
         * <p>The type of the environment instance. Valid values:</p>
         * <ul>
         * <li>CS: Container Service</li>
         * <li>ECS: Elastic Compute Service (ECS)</li>
         * <li>Cloud: cloud service</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CS</p>
         */
        @NameInMap("EnvironmentType")
        public String environmentType;

        /**
         * <p>The parameters of the feature.</p>
         */
        @NameInMap("Features")
        public java.util.List<ListEnvironmentsResponseBodyDataEnvironmentsFeatures> features;

        /**
         * <p>The payable resource plan. Valid values:</p>
         * <ul>
         * <li>If the EnvironmentType parameter is set to CS, set the value to CS_Basic or CS_Pro. Default value: CS_Basic.</li>
         * <li>Otherwise, leave the parameter empty.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CS_Pro</p>
         */
        @NameInMap("FeePackage")
        public String feePackage;

        /**
         * <p>The unique ID of the Grafana data source.</p>
         * 
         * <strong>example:</strong>
         * <p>12374890</p>
         */
        @NameInMap("GrafanaDatasourceUid")
        public String grafanaDatasourceUid;

        /**
         * <p>The name of the Grafana directory.</p>
         * 
         * <strong>example:</strong>
         * <p>filepath</p>
         */
        @NameInMap("GrafanaFolderTitle")
        public String grafanaFolderTitle;

        /**
         * <p>The unique ID of the Grafana directory.</p>
         * 
         * <strong>example:</strong>
         * <p>1798319482935</p>
         */
        @NameInMap("GrafanaFolderUid")
        public String grafanaFolderUid;

        /**
         * <p>The time when the last add-on was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-09-22T16:56:29+08:00</p>
         */
        @NameInMap("LatestReleaseCreateTime")
        public String latestReleaseCreateTime;

        /**
         * <p>Indicates whether agents or exporters are managed. Valid values:</p>
         * <ul>
         * <li>none: No. By default, no managed agents or exporters are provided for ACK clusters.</li>
         * <li>agent: Agents are managed. By default, managed agents are provided for ASK clusters, ACS clusters, and ACK One clusters.</li>
         * <li>agent-exproter: Agents and exporters are managed. By default, managed agents and exporters are provided for cloud services.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>agent</p>
         */
        @NameInMap("ManagedType")
        public String managedType;

        /**
         * <p>The Prometheus ID.</p>
         * 
         * <strong>example:</strong>
         * <p>124769812</p>
         */
        @NameInMap("PrometheusId")
        public Long prometheusId;

        /**
         * <p>The ID of the Prometheus instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-m5e4alj2i24ndbn</p>
         */
        @NameInMap("PrometheusInstanceId")
        public String prometheusInstanceId;

        /**
         * <p>The ID of the region where the Message Queue for RabbitMQ instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-zhangjiakou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The number of installed add-ons.</p>
         * 
         * <strong>example:</strong>
         * <p>122</p>
         */
        @NameInMap("ReleaseCount")
        public Integer releaseCount;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmvt3xpr5aema</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The tags of the environment resource.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListEnvironmentsResponseBodyDataEnvironmentsTags> tags;

        /**
         * <p>The ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>13990957477389</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ListEnvironmentsResponseBodyDataEnvironments build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentsResponseBodyDataEnvironments self = new ListEnvironmentsResponseBodyDataEnvironments();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentsResponseBodyDataEnvironments setAddons(java.util.List<ListEnvironmentsResponseBodyDataEnvironmentsAddons> addons) {
            this.addons = addons;
            return this;
        }
        public java.util.List<ListEnvironmentsResponseBodyDataEnvironmentsAddons> getAddons() {
            return this.addons;
        }

        public ListEnvironmentsResponseBodyDataEnvironments setBindResourceId(String bindResourceId) {
            this.bindResourceId = bindResourceId;
            return this;
        }
        public String getBindResourceId() {
            return this.bindResourceId;
        }

        public ListEnvironmentsResponseBodyDataEnvironments setBindResourceProfile(String bindResourceProfile) {
            this.bindResourceProfile = bindResourceProfile;
            return this;
        }
        public String getBindResourceProfile() {
            return this.bindResourceProfile;
        }

        public ListEnvironmentsResponseBodyDataEnvironments setBindResourceType(String bindResourceType) {
            this.bindResourceType = bindResourceType;
            return this;
        }
        public String getBindResourceType() {
            return this.bindResourceType;
        }

        public ListEnvironmentsResponseBodyDataEnvironments setBindVpcCidr(String bindVpcCidr) {
            this.bindVpcCidr = bindVpcCidr;
            return this;
        }
        public String getBindVpcCidr() {
            return this.bindVpcCidr;
        }

        public ListEnvironmentsResponseBodyDataEnvironments setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListEnvironmentsResponseBodyDataEnvironments setCreatedUserId(String createdUserId) {
            this.createdUserId = createdUserId;
            return this;
        }
        public String getCreatedUserId() {
            return this.createdUserId;
        }

        public ListEnvironmentsResponseBodyDataEnvironments setEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public String getEnvironmentId() {
            return this.environmentId;
        }

        public ListEnvironmentsResponseBodyDataEnvironments setEnvironmentName(String environmentName) {
            this.environmentName = environmentName;
            return this;
        }
        public String getEnvironmentName() {
            return this.environmentName;
        }

        public ListEnvironmentsResponseBodyDataEnvironments setEnvironmentType(String environmentType) {
            this.environmentType = environmentType;
            return this;
        }
        public String getEnvironmentType() {
            return this.environmentType;
        }

        public ListEnvironmentsResponseBodyDataEnvironments setFeatures(java.util.List<ListEnvironmentsResponseBodyDataEnvironmentsFeatures> features) {
            this.features = features;
            return this;
        }
        public java.util.List<ListEnvironmentsResponseBodyDataEnvironmentsFeatures> getFeatures() {
            return this.features;
        }

        public ListEnvironmentsResponseBodyDataEnvironments setFeePackage(String feePackage) {
            this.feePackage = feePackage;
            return this;
        }
        public String getFeePackage() {
            return this.feePackage;
        }

        public ListEnvironmentsResponseBodyDataEnvironments setGrafanaDatasourceUid(String grafanaDatasourceUid) {
            this.grafanaDatasourceUid = grafanaDatasourceUid;
            return this;
        }
        public String getGrafanaDatasourceUid() {
            return this.grafanaDatasourceUid;
        }

        public ListEnvironmentsResponseBodyDataEnvironments setGrafanaFolderTitle(String grafanaFolderTitle) {
            this.grafanaFolderTitle = grafanaFolderTitle;
            return this;
        }
        public String getGrafanaFolderTitle() {
            return this.grafanaFolderTitle;
        }

        public ListEnvironmentsResponseBodyDataEnvironments setGrafanaFolderUid(String grafanaFolderUid) {
            this.grafanaFolderUid = grafanaFolderUid;
            return this;
        }
        public String getGrafanaFolderUid() {
            return this.grafanaFolderUid;
        }

        public ListEnvironmentsResponseBodyDataEnvironments setLatestReleaseCreateTime(String latestReleaseCreateTime) {
            this.latestReleaseCreateTime = latestReleaseCreateTime;
            return this;
        }
        public String getLatestReleaseCreateTime() {
            return this.latestReleaseCreateTime;
        }

        public ListEnvironmentsResponseBodyDataEnvironments setManagedType(String managedType) {
            this.managedType = managedType;
            return this;
        }
        public String getManagedType() {
            return this.managedType;
        }

        public ListEnvironmentsResponseBodyDataEnvironments setPrometheusId(Long prometheusId) {
            this.prometheusId = prometheusId;
            return this;
        }
        public Long getPrometheusId() {
            return this.prometheusId;
        }

        public ListEnvironmentsResponseBodyDataEnvironments setPrometheusInstanceId(String prometheusInstanceId) {
            this.prometheusInstanceId = prometheusInstanceId;
            return this;
        }
        public String getPrometheusInstanceId() {
            return this.prometheusInstanceId;
        }

        public ListEnvironmentsResponseBodyDataEnvironments setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListEnvironmentsResponseBodyDataEnvironments setReleaseCount(Integer releaseCount) {
            this.releaseCount = releaseCount;
            return this;
        }
        public Integer getReleaseCount() {
            return this.releaseCount;
        }

        public ListEnvironmentsResponseBodyDataEnvironments setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListEnvironmentsResponseBodyDataEnvironments setTags(java.util.List<ListEnvironmentsResponseBodyDataEnvironmentsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListEnvironmentsResponseBodyDataEnvironmentsTags> getTags() {
            return this.tags;
        }

        public ListEnvironmentsResponseBodyDataEnvironments setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ListEnvironmentsResponseBodyData extends TeaModel {
        /**
         * <p>The parameters of the environment instance.</p>
         */
        @NameInMap("Environments")
        public java.util.List<ListEnvironmentsResponseBodyDataEnvironments> environments;

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListEnvironmentsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentsResponseBodyData self = new ListEnvironmentsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentsResponseBodyData setEnvironments(java.util.List<ListEnvironmentsResponseBodyDataEnvironments> environments) {
            this.environments = environments;
            return this;
        }
        public java.util.List<ListEnvironmentsResponseBodyDataEnvironments> getEnvironments() {
            return this.environments;
        }

        public ListEnvironmentsResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
