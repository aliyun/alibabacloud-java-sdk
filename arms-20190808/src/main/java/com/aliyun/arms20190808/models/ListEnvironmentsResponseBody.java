// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListEnvironmentsResponseBody extends TeaModel {
    /**
     * <p>Status code: 200 indicates success.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Data")
    public ListEnvironmentsResponseBodyData data;

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

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   `true`</p>
     * <p>*   `false`</p>
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
         * <p>Alias of Addon.</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>Description of Addon.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Icon of Addon.</p>
         */
        @NameInMap("Icon")
        public String icon;

        /**
         * <p>Name of Addon.</p>
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
         * <p>Alias of Feature.</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>Description of Feature.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Icon address.</p>
         */
        @NameInMap("Icon")
        public String icon;

        /**
         * <p>Name of Feature.</p>
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
         * <p>Tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Tag value.</p>
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
         * <p>Addon list.</p>
         */
        @NameInMap("Addons")
        public java.util.List<ListEnvironmentsResponseBodyDataEnvironmentsAddons> addons;

        /**
         * <p>Id of the resource to be bound.</p>
         */
        @NameInMap("BindResourceId")
        public String bindResourceId;

        /**
         * <p>Profile of the resource to be bound.</p>
         */
        @NameInMap("BindResourceProfile")
        public String bindResourceProfile;

        /**
         * <p>Type of the resource to be bound.</p>
         */
        @NameInMap("BindResourceType")
        public String bindResourceType;

        /**
         * <p>Bound Vpc IP Cidr.</p>
         */
        @NameInMap("BindVpcCidr")
        public String bindVpcCidr;

        /**
         * <p>Create time.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Created User ID.</p>
         */
        @NameInMap("CreatedUserId")
        public String createdUserId;

        /**
         * <p>Environment ID.</p>
         */
        @NameInMap("EnvironmentId")
        public String environmentId;

        /**
         * <p>Environment name.</p>
         */
        @NameInMap("EnvironmentName")
        public String environmentName;

        /**
         * <p>Environment type.</p>
         */
        @NameInMap("EnvironmentType")
        public String environmentType;

        /**
         * <p>Featyre list.</p>
         */
        @NameInMap("Features")
        public java.util.List<ListEnvironmentsResponseBodyDataEnvironmentsFeatures> features;

        /**
         * <p>Grafana datasource UID.</p>
         */
        @NameInMap("GrafanaDatasourceUid")
        public String grafanaDatasourceUid;

        /**
         * <p>Grafana folder title.</p>
         */
        @NameInMap("GrafanaFolderTitle")
        public String grafanaFolderTitle;

        /**
         * <p>Grafana folder UID.</p>
         */
        @NameInMap("GrafanaFolderUid")
        public String grafanaFolderUid;

        /**
         * <p>Latest Release create time.</p>
         */
        @NameInMap("LatestReleaseCreateTime")
        public String latestReleaseCreateTime;

        @NameInMap("ManagedType")
        public String managedType;

        /**
         * <p>Prometheus ID.</p>
         */
        @NameInMap("PrometheusId")
        public Long prometheusId;

        /**
         * <p>Prometheus instance ID.</p>
         */
        @NameInMap("PrometheusInstanceId")
        public String prometheusInstanceId;

        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>Number of Release.</p>
         */
        @NameInMap("ReleaseCount")
        public Integer releaseCount;

        /**
         * <p>The ID of the resource group.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListEnvironmentsResponseBodyDataEnvironmentsTags> tags;

        /**
         * <p>User ID.</p>
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
         * <p>Environment list.</p>
         */
        @NameInMap("Environments")
        public java.util.List<ListEnvironmentsResponseBodyDataEnvironments> environments;

        /**
         * <p>The total number of entries returned.</p>
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
