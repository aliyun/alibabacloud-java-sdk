// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetPluginConfigResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetPluginConfigResponseBodyData data;

    /**
     * <p>The dynamic error code.</p>
     * 
     * <strong>example:</strong>
     * <p>code</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic error message.</p>
     * 
     * <strong>example:</strong>
     * <p>message</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>03A3E2F4-6804-5663-9D5D-2EC47A1*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetPluginConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPluginConfigResponseBody self = new GetPluginConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPluginConfigResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetPluginConfigResponseBody setData(GetPluginConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPluginConfigResponseBodyData getData() {
        return this.data;
    }

    public GetPluginConfigResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetPluginConfigResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetPluginConfigResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetPluginConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetPluginConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPluginConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPluginConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPluginConfigResponseBodyDataGatewayConfigListResourceList extends TeaModel {
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>test-route</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetPluginConfigResponseBodyDataGatewayConfigListResourceList build(java.util.Map<String, ?> map) throws Exception {
            GetPluginConfigResponseBodyDataGatewayConfigListResourceList self = new GetPluginConfigResponseBodyDataGatewayConfigListResourceList();
            return TeaModel.build(map, self);
        }

        public GetPluginConfigResponseBodyDataGatewayConfigListResourceList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetPluginConfigResponseBodyDataGatewayConfigListResourceList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetPluginConfigResponseBodyDataGatewayConfigList extends TeaModel {
        /**
         * <p>The plug-in configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>\# Configure a check for the required fields of the plug-in, such as name, age, and friends. Sample configuration: name: John age: 18 friends: - David - Anne</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The application scope of the plug-in. Valid values:</p>
         * <p>0: global</p>
         * <p>1: domain names</p>
         * <p>2: routes</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ConfigLevel")
        public Integer configLevel;

        /**
         * <p>Indicates whether the plug-in is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("GatewayId")
        public Long gatewayId;

        /**
         * <p>The unique ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-ubuwqygbq4783gqb2y3f87q****</p>
         */
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1667309705000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>1667309705000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the plug-in configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The ID of the gateway plug-in.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PluginId")
        public Long pluginId;

        @NameInMap("ResourceList")
        public java.util.List<GetPluginConfigResponseBodyDataGatewayConfigListResourceList> resourceList;

        public static GetPluginConfigResponseBodyDataGatewayConfigList build(java.util.Map<String, ?> map) throws Exception {
            GetPluginConfigResponseBodyDataGatewayConfigList self = new GetPluginConfigResponseBodyDataGatewayConfigList();
            return TeaModel.build(map, self);
        }

        public GetPluginConfigResponseBodyDataGatewayConfigList setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public GetPluginConfigResponseBodyDataGatewayConfigList setConfigLevel(Integer configLevel) {
            this.configLevel = configLevel;
            return this;
        }
        public Integer getConfigLevel() {
            return this.configLevel;
        }

        public GetPluginConfigResponseBodyDataGatewayConfigList setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetPluginConfigResponseBodyDataGatewayConfigList setGatewayId(Long gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public Long getGatewayId() {
            return this.gatewayId;
        }

        public GetPluginConfigResponseBodyDataGatewayConfigList setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public GetPluginConfigResponseBodyDataGatewayConfigList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetPluginConfigResponseBodyDataGatewayConfigList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetPluginConfigResponseBodyDataGatewayConfigList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetPluginConfigResponseBodyDataGatewayConfigList setPluginId(Long pluginId) {
            this.pluginId = pluginId;
            return this;
        }
        public Long getPluginId() {
            return this.pluginId;
        }

        public GetPluginConfigResponseBodyDataGatewayConfigList setResourceList(java.util.List<GetPluginConfigResponseBodyDataGatewayConfigListResourceList> resourceList) {
            this.resourceList = resourceList;
            return this;
        }
        public java.util.List<GetPluginConfigResponseBodyDataGatewayConfigListResourceList> getResourceList() {
            return this.resourceList;
        }

    }

    public static class GetPluginConfigResponseBodyData extends TeaModel {
        /**
         * <p>The category of the plug-in. Valid values:</p>
         * <p>0: user-defined</p>
         * <p>1: permission authentication</p>
         * <p>2: security protection</p>
         * <p>3: transmission protocol</p>
         * <p>4: traffic control</p>
         * <p>5: traffic observation</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Category")
        public Integer category;

        /**
         * <p>The information about the plug-in configuration used for checking.</p>
         * 
         * <strong>example:</strong>
         * <p>\# The configuration includes the fields required for checking, such as name, age, and friends. Sample configuration: name: John age: 18 friends: - David - Anne</p>
         */
        @NameInMap("ConfigCheck")
        public String configCheck;

        @NameInMap("ConfigExample")
        public String configExample;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("DomainConfigStartIndex")
        public Integer domainConfigStartIndex;

        /**
         * <p>The list of gateway plug-in configurations.</p>
         */
        @NameInMap("GatewayConfigList")
        public java.util.List<GetPluginConfigResponseBodyDataGatewayConfigList> gatewayConfigList;

        /**
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("GatewayConfigStartIndex")
        public Integer gatewayConfigStartIndex;

        /**
         * <p>The ID of the plug-in.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>The mode.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Mode")
        public Integer mode;

        /**
         * <p>The name of the plug-in.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The execution stage of the plug-in. Valid values:</p>
         * <p>0: default stage</p>
         * <p>1: authorization stage</p>
         * <p>2: authentication stage</p>
         * <p>3: statistics stage</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Phase")
        public Integer phase;

        /**
         * <p>The ID of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("PrimaryUser")
        public String primaryUser;

        /**
         * <p>The execution priority of the plug-in. A larger value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The publish status.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PublishState")
        public Integer publishState;

        /**
         * <p>The description of the README file.</p>
         * 
         * <strong>example:</strong>
         * <p>read me</p>
         */
        @NameInMap("Readme")
        public String readme;

        /**
         * <p>The description of the README file that is edited in English.</p>
         * 
         * <strong>example:</strong>
         * <p>read me</p>
         */
        @NameInMap("ReadmeEn")
        public String readmeEn;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RouteConfigStartIndex")
        public Integer routeConfigStartIndex;

        /**
         * <p>Indicates whether the plug-in is enabled. Valid values:</p>
         * <p>0: disabled</p>
         * <p>1: enabled</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The summary of the plug-in.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a plug-in.</p>
         */
        @NameInMap("Summary")
        public String summary;

        @NameInMap("SummaryEn")
        public String summaryEn;

        /**
         * <p>The type.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Type")
        public Integer type;

        /**
         * <p>The version of the plug-in.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("Version")
        public String version;

        @NameInMap("VersionJson")
        public String versionJson;

        /**
         * <p>The WebAssembly language. Valid values:</p>
         * <p>0: C++</p>
         * <p>1: TinyGo</p>
         * <p>2: Rust</p>
         * <p>3: AssemblyScript</p>
         * <p>4: Zig</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("WasmLang")
        public Integer wasmLang;

        public static GetPluginConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPluginConfigResponseBodyData self = new GetPluginConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPluginConfigResponseBodyData setCategory(Integer category) {
            this.category = category;
            return this;
        }
        public Integer getCategory() {
            return this.category;
        }

        public GetPluginConfigResponseBodyData setConfigCheck(String configCheck) {
            this.configCheck = configCheck;
            return this;
        }
        public String getConfigCheck() {
            return this.configCheck;
        }

        public GetPluginConfigResponseBodyData setConfigExample(String configExample) {
            this.configExample = configExample;
            return this;
        }
        public String getConfigExample() {
            return this.configExample;
        }

        public GetPluginConfigResponseBodyData setDomainConfigStartIndex(Integer domainConfigStartIndex) {
            this.domainConfigStartIndex = domainConfigStartIndex;
            return this;
        }
        public Integer getDomainConfigStartIndex() {
            return this.domainConfigStartIndex;
        }

        public GetPluginConfigResponseBodyData setGatewayConfigList(java.util.List<GetPluginConfigResponseBodyDataGatewayConfigList> gatewayConfigList) {
            this.gatewayConfigList = gatewayConfigList;
            return this;
        }
        public java.util.List<GetPluginConfigResponseBodyDataGatewayConfigList> getGatewayConfigList() {
            return this.gatewayConfigList;
        }

        public GetPluginConfigResponseBodyData setGatewayConfigStartIndex(Integer gatewayConfigStartIndex) {
            this.gatewayConfigStartIndex = gatewayConfigStartIndex;
            return this;
        }
        public Integer getGatewayConfigStartIndex() {
            return this.gatewayConfigStartIndex;
        }

        public GetPluginConfigResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetPluginConfigResponseBodyData setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public GetPluginConfigResponseBodyData setMode(Integer mode) {
            this.mode = mode;
            return this;
        }
        public Integer getMode() {
            return this.mode;
        }

        public GetPluginConfigResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPluginConfigResponseBodyData setPhase(Integer phase) {
            this.phase = phase;
            return this;
        }
        public Integer getPhase() {
            return this.phase;
        }

        public GetPluginConfigResponseBodyData setPrimaryUser(String primaryUser) {
            this.primaryUser = primaryUser;
            return this;
        }
        public String getPrimaryUser() {
            return this.primaryUser;
        }

        public GetPluginConfigResponseBodyData setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetPluginConfigResponseBodyData setPublishState(Integer publishState) {
            this.publishState = publishState;
            return this;
        }
        public Integer getPublishState() {
            return this.publishState;
        }

        public GetPluginConfigResponseBodyData setReadme(String readme) {
            this.readme = readme;
            return this;
        }
        public String getReadme() {
            return this.readme;
        }

        public GetPluginConfigResponseBodyData setReadmeEn(String readmeEn) {
            this.readmeEn = readmeEn;
            return this;
        }
        public String getReadmeEn() {
            return this.readmeEn;
        }

        public GetPluginConfigResponseBodyData setRouteConfigStartIndex(Integer routeConfigStartIndex) {
            this.routeConfigStartIndex = routeConfigStartIndex;
            return this;
        }
        public Integer getRouteConfigStartIndex() {
            return this.routeConfigStartIndex;
        }

        public GetPluginConfigResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPluginConfigResponseBodyData setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public GetPluginConfigResponseBodyData setSummaryEn(String summaryEn) {
            this.summaryEn = summaryEn;
            return this;
        }
        public String getSummaryEn() {
            return this.summaryEn;
        }

        public GetPluginConfigResponseBodyData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public GetPluginConfigResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GetPluginConfigResponseBodyData setVersionJson(String versionJson) {
            this.versionJson = versionJson;
            return this;
        }
        public String getVersionJson() {
            return this.versionJson;
        }

        public GetPluginConfigResponseBodyData setWasmLang(Integer wasmLang) {
            this.wasmLang = wasmLang;
            return this;
        }
        public Integer getWasmLang() {
            return this.wasmLang;
        }

    }

}
