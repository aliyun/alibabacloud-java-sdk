// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetPluginConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetPluginConfigResponseBodyData data;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Config")
        public String config;

        @NameInMap("ConfigLevel")
        public Integer configLevel;

        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("GatewayId")
        public Long gatewayId;

        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

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
        @NameInMap("Category")
        public Integer category;

        @NameInMap("ConfigCheck")
        public String configCheck;

        @NameInMap("GatewayConfigList")
        public java.util.List<GetPluginConfigResponseBodyDataGatewayConfigList> gatewayConfigList;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ImageName")
        public String imageName;

        @NameInMap("Mode")
        public Integer mode;

        @NameInMap("Name")
        public String name;

        @NameInMap("Phase")
        public Integer phase;

        @NameInMap("PrimaryUser")
        public String primaryUser;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("PublishState")
        public Integer publishState;

        @NameInMap("Readme")
        public String readme;

        @NameInMap("ReadmeEn")
        public String readmeEn;

        @NameInMap("Status")
        public String status;

        @NameInMap("Summary")
        public String summary;

        @NameInMap("Type")
        public Integer type;

        @NameInMap("Version")
        public String version;

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

        public GetPluginConfigResponseBodyData setWasmLang(Integer wasmLang) {
            this.wasmLang = wasmLang;
            return this;
        }
        public Integer getWasmLang() {
            return this.wasmLang;
        }

    }

}
