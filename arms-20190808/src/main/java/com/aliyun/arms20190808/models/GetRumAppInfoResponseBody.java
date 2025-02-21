// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRumAppInfoResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. The status code 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The details of the application.</p>
     */
    @NameInMap("Data")
    public GetRumAppInfoResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>StartTime is mandatory for this action.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A5EC8221-08F2-4C95-9AF1-49FD998C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code></li>
     * </ul>
     * 
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

    public static class GetRumAppInfoResponseBodyDataBonreeSDKConfigModuleConfig extends TeaModel {
        /**
         * <p>The default configuration of the application.</p>
         */
        @NameInMap("defaultConfig")
        public java.util.Map<String, DataBonreeSDKConfigModuleConfigDefaultConfigValue> defaultConfig;

        /**
         * <p>Indicates whether the configuration is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The version configurations of the application.</p>
         */
        @NameInMap("versionConfigs")
        public java.util.Map<String, DataBonreeSDKConfigModuleConfigVersionConfigsValue> versionConfigs;

        public static GetRumAppInfoResponseBodyDataBonreeSDKConfigModuleConfig build(java.util.Map<String, ?> map) throws Exception {
            GetRumAppInfoResponseBodyDataBonreeSDKConfigModuleConfig self = new GetRumAppInfoResponseBodyDataBonreeSDKConfigModuleConfig();
            return TeaModel.build(map, self);
        }

        public GetRumAppInfoResponseBodyDataBonreeSDKConfigModuleConfig setDefaultConfig(java.util.Map<String, DataBonreeSDKConfigModuleConfigDefaultConfigValue> defaultConfig) {
            this.defaultConfig = defaultConfig;
            return this;
        }
        public java.util.Map<String, DataBonreeSDKConfigModuleConfigDefaultConfigValue> getDefaultConfig() {
            return this.defaultConfig;
        }

        public GetRumAppInfoResponseBodyDataBonreeSDKConfigModuleConfig setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetRumAppInfoResponseBodyDataBonreeSDKConfigModuleConfig setVersionConfigs(java.util.Map<String, DataBonreeSDKConfigModuleConfigVersionConfigsValue> versionConfigs) {
            this.versionConfigs = versionConfigs;
            return this;
        }
        public java.util.Map<String, DataBonreeSDKConfigModuleConfigVersionConfigsValue> getVersionConfigs() {
            return this.versionConfigs;
        }

    }

    public static class GetRumAppInfoResponseBodyDataBonreeSDKConfigSamplingConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("samplingRate")
        public Integer samplingRate;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("samplingType")
        public Integer samplingType;

        public static GetRumAppInfoResponseBodyDataBonreeSDKConfigSamplingConfig build(java.util.Map<String, ?> map) throws Exception {
            GetRumAppInfoResponseBodyDataBonreeSDKConfigSamplingConfig self = new GetRumAppInfoResponseBodyDataBonreeSDKConfigSamplingConfig();
            return TeaModel.build(map, self);
        }

        public GetRumAppInfoResponseBodyDataBonreeSDKConfigSamplingConfig setSamplingRate(Integer samplingRate) {
            this.samplingRate = samplingRate;
            return this;
        }
        public Integer getSamplingRate() {
            return this.samplingRate;
        }

        public GetRumAppInfoResponseBodyDataBonreeSDKConfigSamplingConfig setSamplingType(Integer samplingType) {
            this.samplingType = samplingType;
            return this;
        }
        public Integer getSamplingType() {
            return this.samplingType;
        }

    }

    public static class GetRumAppInfoResponseBodyDataBonreeSDKConfig extends TeaModel {
        /**
         * <p>The module configuration.</p>
         */
        @NameInMap("moduleConfig")
        public GetRumAppInfoResponseBodyDataBonreeSDKConfigModuleConfig moduleConfig;

        @NameInMap("samplingConfig")
        public GetRumAppInfoResponseBodyDataBonreeSDKConfigSamplingConfig samplingConfig;

        public static GetRumAppInfoResponseBodyDataBonreeSDKConfig build(java.util.Map<String, ?> map) throws Exception {
            GetRumAppInfoResponseBodyDataBonreeSDKConfig self = new GetRumAppInfoResponseBodyDataBonreeSDKConfig();
            return TeaModel.build(map, self);
        }

        public GetRumAppInfoResponseBodyDataBonreeSDKConfig setModuleConfig(GetRumAppInfoResponseBodyDataBonreeSDKConfigModuleConfig moduleConfig) {
            this.moduleConfig = moduleConfig;
            return this;
        }
        public GetRumAppInfoResponseBodyDataBonreeSDKConfigModuleConfig getModuleConfig() {
            return this.moduleConfig;
        }

        public GetRumAppInfoResponseBodyDataBonreeSDKConfig setSamplingConfig(GetRumAppInfoResponseBodyDataBonreeSDKConfigSamplingConfig samplingConfig) {
            this.samplingConfig = samplingConfig;
            return this;
        }
        public GetRumAppInfoResponseBodyDataBonreeSDKConfigSamplingConfig getSamplingConfig() {
            return this.samplingConfig;
        }

    }

    public static class GetRumAppInfoResponseBodyDataServiceDomainConfigs extends TeaModel {
        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The domain name or IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The trace propagation protocols. This parameter is required if the tracing analysis feature is enabled.</p>
         */
        @NameInMap("PropagatorTypes")
        public java.util.List<String> propagatorTypes;

        @NameInMap("SamplingRate")
        public Integer samplingRate;

        /**
         * <p>Indicates whether the tracing analysis feature is enabled. To enable the tracing analysis feature, you must activate Managed Service for OpenTelemetry. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enables the tracing analysis feature. If you enable the tracing analysis feature, related headers are inserted into requests for the domain name.</li>
         * <li><code>false</code>: disables the tracing analysis feature.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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

        public GetRumAppInfoResponseBodyDataServiceDomainConfigs setSamplingRate(Integer samplingRate) {
            this.samplingRate = samplingRate;
            return this;
        }
        public Integer getSamplingRate() {
            return this.samplingRate;
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
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>Label</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
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
        @NameInMap("AppConfig")
        public String appConfig;

        /**
         * <p>The group to which the application belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("AppGroup")
        public String appGroup;

        /**
         * <p>The application type. Valid values: web, miniapp, ios, and android.</p>
         * 
         * <strong>example:</strong>
         * <p>web</p>
         */
        @NameInMap("AppType")
        public String appType;

        /**
         * <p>The region where the backend is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("BackendServiceTraceRegion")
        public String backendServiceTraceRegion;

        /**
         * <p>The collection configurations.</p>
         */
        @NameInMap("BonreeSDKConfig")
        public GetRumAppInfoResponseBodyDataBonreeSDKConfig bonreeSDKConfig;

        /**
         * <p>The domain name of the SDK.</p>
         * 
         * <strong>example:</strong>
         * <p>b59xxxxxxxx-sdk.rum.aliyuncs.com/v2/browser-sdk.js</p>
         */
        @NameInMap("CdnDomain")
        public String cdnDomain;

        /**
         * <p>The time when the application was created. The value is a timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1683353594000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the application.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The endpoint that is used to report application data.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxxxx-default-cn.rum.aliyuncs.com</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>Indicates whether the application is subscribed. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsSubscription")
        public String isSubscription;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>tomcat-demo-test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The alias of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>nickname</p>
         */
        @NameInMap("NickName")
        public String nickName;

        /**
         * <p>The name of the application package.</p>
         * 
         * <strong>example:</strong>
         * <p>com.alibaba.rum</p>
         */
        @NameInMap("PackageName")
        public String packageName;

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>avccccefy0@24cccccbf384dc6</p>
         */
        @NameInMap("Pid")
        public String pid;

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
         * <p>The list of service domain configurations. Only mobile applications are supported.</p>
         */
        @NameInMap("ServiceDomainConfigs")
        public java.util.List<GetRumAppInfoResponseBodyDataServiceDomainConfigs> serviceDomainConfigs;

        /**
         * <p>The name of the Simple Log Service Logstore that stores application data.</p>
         * 
         * <strong>example:</strong>
         * <p>logstore-rum</p>
         */
        @NameInMap("SlsLogstore")
        public String slsLogstore;

        /**
         * <p>The name of the Simple Log Service project that stores application data.</p>
         * 
         * <strong>example:</strong>
         * <p>proj-xtrace-xxxxxxxxxxxxxxxxxxxxxxx-cn-hangzhou</p>
         */
        @NameInMap("SlsProject")
        public String slsProject;

        /**
         * <p>The status of the application. Valid values: created, running, and stopped.</p>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<GetRumAppInfoResponseBodyDataTags> tags;

        /**
         * <p>The type of the application. Valid value: RUM.</p>
         * 
         * <strong>example:</strong>
         * <p>RUM</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetRumAppInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRumAppInfoResponseBodyData self = new GetRumAppInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRumAppInfoResponseBodyData setAppConfig(String appConfig) {
            this.appConfig = appConfig;
            return this;
        }
        public String getAppConfig() {
            return this.appConfig;
        }

        public GetRumAppInfoResponseBodyData setAppGroup(String appGroup) {
            this.appGroup = appGroup;
            return this;
        }
        public String getAppGroup() {
            return this.appGroup;
        }

        public GetRumAppInfoResponseBodyData setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public GetRumAppInfoResponseBodyData setBackendServiceTraceRegion(String backendServiceTraceRegion) {
            this.backendServiceTraceRegion = backendServiceTraceRegion;
            return this;
        }
        public String getBackendServiceTraceRegion() {
            return this.backendServiceTraceRegion;
        }

        public GetRumAppInfoResponseBodyData setBonreeSDKConfig(GetRumAppInfoResponseBodyDataBonreeSDKConfig bonreeSDKConfig) {
            this.bonreeSDKConfig = bonreeSDKConfig;
            return this;
        }
        public GetRumAppInfoResponseBodyDataBonreeSDKConfig getBonreeSDKConfig() {
            return this.bonreeSDKConfig;
        }

        public GetRumAppInfoResponseBodyData setCdnDomain(String cdnDomain) {
            this.cdnDomain = cdnDomain;
            return this;
        }
        public String getCdnDomain() {
            return this.cdnDomain;
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
