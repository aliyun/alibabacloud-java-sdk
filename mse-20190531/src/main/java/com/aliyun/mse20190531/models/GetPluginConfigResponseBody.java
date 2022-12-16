// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetPluginConfigResponseBody extends TeaModel {
    // Code.
    @NameInMap("Code")
    public Integer code;

    // The returned data.
    @NameInMap("Data")
    public GetPluginConfigResponseBodyData data;

    // The dynamic error code.
    @NameInMap("DynamicCode")
    public String dynamicCode;

    // The dynamic error message.
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    // The error code returned if the request failed.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The HTTP status code returned.
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // The message returned.
    @NameInMap("Message")
    public String message;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request was successful.
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

    public static class GetPluginConfigResponseBodyDataGatewayConfigList extends TeaModel {
        // The plug-in configuration.
        @NameInMap("Config")
        public String config;

        // The application scope of the plug-in.
        // 
        // 0: global
        // 
        // 1: domain names
        // 
        // 2: routes
        @NameInMap("ConfigLevel")
        public Integer configLevel;

        // Indicates whether the plug-in is enabled.
        @NameInMap("Enable")
        public Boolean enable;

        // The ID of the gateway.
        @NameInMap("GatewayId")
        public Long gatewayId;

        // The unique ID of the gateway.
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        // The creation time.
        @NameInMap("GmtCreate")
        public String gmtCreate;

        // The update time.
        @NameInMap("GmtModified")
        public String gmtModified;

        // The ID of the plug-in configuration.
        @NameInMap("Id")
        public Long id;

        // The ID of the gateway plug-in.
        @NameInMap("PluginId")
        public Long pluginId;

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

    }

    public static class GetPluginConfigResponseBodyData extends TeaModel {
        // The category of the plug-in.
        // 
        // 0: custom
        // 
        // 1: permission authorization
        // 
        // 2: security protection
        // 
        // 3: transmission protocol
        // 
        // 4: traffic control
        // 
        // 5: traffic observation
        @NameInMap("Category")
        public Integer category;

        // The information about the plug-in configuration used for checking.
        @NameInMap("ConfigCheck")
        public String configCheck;

        // The list of gateway plug-in configurations.
        @NameInMap("GatewayConfigList")
        public java.util.List<GetPluginConfigResponseBodyDataGatewayConfigList> gatewayConfigList;

        // The ID of the plug-in.
        @NameInMap("Id")
        public Long id;

        // The name of the image.
        @NameInMap("ImageName")
        public String imageName;

        // The mode.
        @NameInMap("Mode")
        public Integer mode;

        // The name of the plug-in.
        @NameInMap("Name")
        public String name;

        // The execution stage of the plug-in.
        // 
        // 0: default stage
        // 
        // 1: authorization stage
        // 
        // 2: authentication stage
        // 
        // 3: statistics stage
        @NameInMap("Phase")
        public Integer phase;

        // The ID of the creator.
        @NameInMap("PrimaryUser")
        public String primaryUser;

        // The execution priority of the plug-in. A larger value indicates a higher priority.
        @NameInMap("Priority")
        public Integer priority;

        // The publish status.
        @NameInMap("PublishState")
        public Integer publishState;

        // The description of the README file.
        @NameInMap("Readme")
        public String readme;

        // The description of the README file that is edited in English.
        @NameInMap("ReadmeEn")
        public String readmeEn;

        // Indicates whether the plug-in is enabled.
        // 
        // 0: disabled
        // 
        // 1: enabled
        @NameInMap("Status")
        public String status;

        // The summary of the plug-in.
        @NameInMap("Summary")
        public String summary;

        // The type.
        @NameInMap("Type")
        public Integer type;

        // The version of the plug-in.
        @NameInMap("Version")
        public String version;

        @NameInMap("VersionJson")
        public String versionJson;

        // The WebAssembly language.
        // 
        // 0: C++
        // 
        // 1: TinyGo
        // 
        // 2: Rust
        // 
        // 3: AssemblyScript
        // 
        // 4: Zig
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

        public GetPluginConfigResponseBodyData setGatewayConfigList(java.util.List<GetPluginConfigResponseBodyDataGatewayConfigList> gatewayConfigList) {
            this.gatewayConfigList = gatewayConfigList;
            return this;
        }
        public java.util.List<GetPluginConfigResponseBodyDataGatewayConfigList> getGatewayConfigList() {
            return this.gatewayConfigList;
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
