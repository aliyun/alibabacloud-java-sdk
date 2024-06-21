// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRumAppsResponseBody extends TeaModel {
    @NameInMap("AppList")
    public java.util.List<GetRumAppsResponseBodyAppList> appList;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>70675725-8F11-4817-8106-CFE0AD71****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetRumAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRumAppsResponseBody self = new GetRumAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRumAppsResponseBody setAppList(java.util.List<GetRumAppsResponseBodyAppList> appList) {
        this.appList = appList;
        return this;
    }
    public java.util.List<GetRumAppsResponseBodyAppList> getAppList() {
        return this.appList;
    }

    public GetRumAppsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetRumAppsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetRumAppsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRumAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRumAppsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetRumAppsResponseBodyAppListServiceDomainConfigs extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("PropagatorTypes")
        public java.util.List<String> propagatorTypes;

        @NameInMap("Tracing")
        public String tracing;

        public static GetRumAppsResponseBodyAppListServiceDomainConfigs build(java.util.Map<String, ?> map) throws Exception {
            GetRumAppsResponseBodyAppListServiceDomainConfigs self = new GetRumAppsResponseBodyAppListServiceDomainConfigs();
            return TeaModel.build(map, self);
        }

        public GetRumAppsResponseBodyAppListServiceDomainConfigs setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetRumAppsResponseBodyAppListServiceDomainConfigs setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public GetRumAppsResponseBodyAppListServiceDomainConfigs setPropagatorTypes(java.util.List<String> propagatorTypes) {
            this.propagatorTypes = propagatorTypes;
            return this;
        }
        public java.util.List<String> getPropagatorTypes() {
            return this.propagatorTypes;
        }

        public GetRumAppsResponseBodyAppListServiceDomainConfigs setTracing(String tracing) {
            this.tracing = tracing;
            return this;
        }
        public String getTracing() {
            return this.tracing;
        }

    }

    public static class GetRumAppsResponseBodyAppListTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>tag1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetRumAppsResponseBodyAppListTags build(java.util.Map<String, ?> map) throws Exception {
            GetRumAppsResponseBodyAppListTags self = new GetRumAppsResponseBodyAppListTags();
            return TeaModel.build(map, self);
        }

        public GetRumAppsResponseBodyAppListTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetRumAppsResponseBodyAppListTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetRumAppsResponseBodyAppList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>web</p>
         */
        @NameInMap("AppType")
        public String appType;

        /**
         * <strong>example:</strong>
         * <p>1685686960872</p>
         */
        @NameInMap("CreateTime")
        public Object createTime;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>xxxxxxxx-default-cn.rum.aliyuncs.com</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsSubscription")
        public Boolean isSubscription;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>Williamtag</p>
         */
        @NameInMap("NickName")
        public String nickName;

        /**
         * <strong>example:</strong>
         * <p>com.zy.yxws</p>
         */
        @NameInMap("PackageName")
        public String packageName;

        /**
         * <strong>example:</strong>
         * <p>xxxxx@cc08bdxxxx20b15</p>
         */
        @NameInMap("Pid")
        public String pid;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>rg-acfmzaq3ypaqkdy</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ServiceDomainConfigs")
        public java.util.List<GetRumAppsResponseBodyAppListServiceDomainConfigs> serviceDomainConfigs;

        /**
         * <strong>example:</strong>
         * <p>logstore-rum</p>
         */
        @NameInMap("SlsLogstore")
        public String slsLogstore;

        /**
         * <strong>example:</strong>
         * <p>proj-xtrace-xxxxxxxba6ef5466b5debf9e2f951-cn-hangzhou</p>
         */
        @NameInMap("SlsProject")
        public String slsProject;

        /**
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public java.util.List<GetRumAppsResponseBodyAppListTags> tags;

        /**
         * <strong>example:</strong>
         * <p>RUM</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetRumAppsResponseBodyAppList build(java.util.Map<String, ?> map) throws Exception {
            GetRumAppsResponseBodyAppList self = new GetRumAppsResponseBodyAppList();
            return TeaModel.build(map, self);
        }

        public GetRumAppsResponseBodyAppList setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public GetRumAppsResponseBodyAppList setCreateTime(Object createTime) {
            this.createTime = createTime;
            return this;
        }
        public Object getCreateTime() {
            return this.createTime;
        }

        public GetRumAppsResponseBodyAppList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetRumAppsResponseBodyAppList setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetRumAppsResponseBodyAppList setIsSubscription(Boolean isSubscription) {
            this.isSubscription = isSubscription;
            return this;
        }
        public Boolean getIsSubscription() {
            return this.isSubscription;
        }

        public GetRumAppsResponseBodyAppList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetRumAppsResponseBodyAppList setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public GetRumAppsResponseBodyAppList setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }
        public String getPackageName() {
            return this.packageName;
        }

        public GetRumAppsResponseBodyAppList setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
        }

        public GetRumAppsResponseBodyAppList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetRumAppsResponseBodyAppList setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetRumAppsResponseBodyAppList setServiceDomainConfigs(java.util.List<GetRumAppsResponseBodyAppListServiceDomainConfigs> serviceDomainConfigs) {
            this.serviceDomainConfigs = serviceDomainConfigs;
            return this;
        }
        public java.util.List<GetRumAppsResponseBodyAppListServiceDomainConfigs> getServiceDomainConfigs() {
            return this.serviceDomainConfigs;
        }

        public GetRumAppsResponseBodyAppList setSlsLogstore(String slsLogstore) {
            this.slsLogstore = slsLogstore;
            return this;
        }
        public String getSlsLogstore() {
            return this.slsLogstore;
        }

        public GetRumAppsResponseBodyAppList setSlsProject(String slsProject) {
            this.slsProject = slsProject;
            return this;
        }
        public String getSlsProject() {
            return this.slsProject;
        }

        public GetRumAppsResponseBodyAppList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetRumAppsResponseBodyAppList setTags(java.util.List<GetRumAppsResponseBodyAppListTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetRumAppsResponseBodyAppListTags> getTags() {
            return this.tags;
        }

        public GetRumAppsResponseBodyAppList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
