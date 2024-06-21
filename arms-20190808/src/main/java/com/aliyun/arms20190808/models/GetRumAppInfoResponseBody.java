// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRumAppInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetRumAppInfoResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>StartTime is mandatory for this action.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A5EC8221-08F2-4C95-9AF1-49FD998C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetRumAppInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRumAppInfoResponseBody self = new GetRumAppInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRumAppInfoResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetRumAppInfoResponseBody setData(GetRumAppInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRumAppInfoResponseBodyData getData() {
        return this.data;
    }

    public GetRumAppInfoResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetRumAppInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRumAppInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRumAppInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetRumAppInfoResponseBodyDataServiceDomainConfigs extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("PropagatorTypes")
        public java.util.List<String> propagatorTypes;

        @NameInMap("Tracing")
        public Boolean tracing;

        public static GetRumAppInfoResponseBodyDataServiceDomainConfigs build(java.util.Map<String, ?> map) throws Exception {
            GetRumAppInfoResponseBodyDataServiceDomainConfigs self = new GetRumAppInfoResponseBodyDataServiceDomainConfigs();
            return TeaModel.build(map, self);
        }

        public GetRumAppInfoResponseBodyDataServiceDomainConfigs setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetRumAppInfoResponseBodyDataServiceDomainConfigs setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public GetRumAppInfoResponseBodyDataServiceDomainConfigs setPropagatorTypes(java.util.List<String> propagatorTypes) {
            this.propagatorTypes = propagatorTypes;
            return this;
        }
        public java.util.List<String> getPropagatorTypes() {
            return this.propagatorTypes;
        }

        public GetRumAppInfoResponseBodyDataServiceDomainConfigs setTracing(Boolean tracing) {
            this.tracing = tracing;
            return this;
        }
        public Boolean getTracing() {
            return this.tracing;
        }

    }

    public static class GetRumAppInfoResponseBodyDataTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Label</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>Value</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetRumAppInfoResponseBodyDataTags build(java.util.Map<String, ?> map) throws Exception {
            GetRumAppInfoResponseBodyDataTags self = new GetRumAppInfoResponseBodyDataTags();
            return TeaModel.build(map, self);
        }

        public GetRumAppInfoResponseBodyDataTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetRumAppInfoResponseBodyDataTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetRumAppInfoResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>web</p>
         */
        @NameInMap("AppType")
        public String appType;

        /**
         * <strong>example:</strong>
         * <p>1683353594000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

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
        public String isSubscription;

        /**
         * <strong>example:</strong>
         * <p>tomcat-demo-test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>nickname</p>
         */
        @NameInMap("NickName")
        public String nickName;

        /**
         * <strong>example:</strong>
         * <p>com.alibaba.rum</p>
         */
        @NameInMap("PackageName")
        public String packageName;

        /**
         * <strong>example:</strong>
         * <p>avccccefy0@24cccccbf384dc6</p>
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
         * <p>rg-aek2vezare****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ServiceDomainConfigs")
        public java.util.List<GetRumAppInfoResponseBodyDataServiceDomainConfigs> serviceDomainConfigs;

        /**
         * <strong>example:</strong>
         * <p>logstore-rum</p>
         */
        @NameInMap("SlsLogstore")
        public String slsLogstore;

        /**
         * <strong>example:</strong>
         * <p>proj-xtrace-xxxxxxxxxxxxxxxxxxxxxxx-cn-hangzhou</p>
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
        public java.util.List<GetRumAppInfoResponseBodyDataTags> tags;

        /**
         * <strong>example:</strong>
         * <p>RUM</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetRumAppInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRumAppInfoResponseBodyData self = new GetRumAppInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRumAppInfoResponseBodyData setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public GetRumAppInfoResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetRumAppInfoResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetRumAppInfoResponseBodyData setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetRumAppInfoResponseBodyData setIsSubscription(String isSubscription) {
            this.isSubscription = isSubscription;
            return this;
        }
        public String getIsSubscription() {
            return this.isSubscription;
        }

        public GetRumAppInfoResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetRumAppInfoResponseBodyData setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public GetRumAppInfoResponseBodyData setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }
        public String getPackageName() {
            return this.packageName;
        }

        public GetRumAppInfoResponseBodyData setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
        }

        public GetRumAppInfoResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetRumAppInfoResponseBodyData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetRumAppInfoResponseBodyData setServiceDomainConfigs(java.util.List<GetRumAppInfoResponseBodyDataServiceDomainConfigs> serviceDomainConfigs) {
            this.serviceDomainConfigs = serviceDomainConfigs;
            return this;
        }
        public java.util.List<GetRumAppInfoResponseBodyDataServiceDomainConfigs> getServiceDomainConfigs() {
            return this.serviceDomainConfigs;
        }

        public GetRumAppInfoResponseBodyData setSlsLogstore(String slsLogstore) {
            this.slsLogstore = slsLogstore;
            return this;
        }
        public String getSlsLogstore() {
            return this.slsLogstore;
        }

        public GetRumAppInfoResponseBodyData setSlsProject(String slsProject) {
            this.slsProject = slsProject;
            return this;
        }
        public String getSlsProject() {
            return this.slsProject;
        }

        public GetRumAppInfoResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetRumAppInfoResponseBodyData setTags(java.util.List<GetRumAppInfoResponseBodyDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetRumAppInfoResponseBodyDataTags> getTags() {
            return this.tags;
        }

        public GetRumAppInfoResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
