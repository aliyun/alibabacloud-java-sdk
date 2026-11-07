// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetPluginsResponseBody extends TeaModel {
    /**
     * <p>The code.</p>
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
    public java.util.List<GetPluginsResponseBodyData> data;

    /**
     * <p>The placeholder in the dynamic error message.</p>
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
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

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

    public static GetPluginsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPluginsResponseBody self = new GetPluginsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPluginsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetPluginsResponseBody setData(java.util.List<GetPluginsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetPluginsResponseBodyData> getData() {
        return this.data;
    }

    public GetPluginsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetPluginsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetPluginsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetPluginsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetPluginsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPluginsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPluginsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPluginsResponseBodyData extends TeaModel {
        /**
         * <p>The plug-in type. Valid values:</p>
         * <ul>
         * <li>0: Custom.</li>
         * <li>1: Authentication and authorization.</li>
         * <li>2: Security protection.</li>
         * <li>3: Transport protocol.</li>
         * <li>4: Traffic control.</li>
         * <li>5: Traffic observability.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Category")
        public Integer category;

        /**
         * <p>The configuration validation.</p>
         * 
         * <strong>example:</strong>
         * <h1>Validate required fields in the configuration. As shown in the following example, the plug-in configuration must contain the &quot;name&quot;, &quot;age&quot;, and &quot;friends&quot; fields.</h1>
         * <p>name: John
         * age: 18
         * friends:</p>
         * <ul>
         * <li>David</li>
         * <li>Anne</li>
         * </ul>
         */
        @NameInMap("ConfigCheck")
        public String configCheck;

        /**
         * <p>The plug-in ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The latest version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("MaxVersion")
        public String maxVersion;

        /**
         * <p>The plug-in language. Valid values:</p>
         * <ul>
         * <li>0: Wasm plug-in.</li>
         * <li>2: Lua plug-in.</li>
         * </ul>
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
         * <p>key-auth</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether the latest version is being published.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("NewVersionPublishingFlag")
        public Boolean newVersionPublishingFlag;

        /**
         * <p>The plug-in execution phase. Valid values:</p>
         * <ul>
         * <li>0: Default phase.</li>
         * <li>1: Authentication phase.</li>
         * <li>2: Authorization phase.</li>
         * <li>3: Statistics phase.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>The publish status. Valid values:</p>
         * <ul>
         * <li>0: Successful.</li>
         * <li>1: Publishing.</li>
         * <li>2: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PublishState")
        public Integer publishState;

        /**
         * <p>The enabling status. Valid values:</p>
         * <ul>
         * <li>0: Disabled.</li>
         * <li>1: Enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The plug-in summary.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a plug-in</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <p>The English plug-in summary.</p>
         * 
         * <strong>example:</strong>
         * <p>Authentication based on API Key.</p>
         */
        @NameInMap("SummaryEn")
        public String summaryEn;

        /**
         * <p>The plug-in version.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <p>The OSS object of the Wasm plug-in.</p>
         */
        @NameInMap("WasmFile")
        public String wasmFile;

        /**
         * <p>The WebAssembly (Wasm) implementation language. Valid values:</p>
         * <ul>
         * <li>0: C++.</li>
         * <li>1: TinyGo.</li>
         * <li>2: Rust.</li>
         * <li>3: AssemblyScript.</li>
         * <li>4: Zig.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("WasmLang")
        public Integer wasmLang;

        public static GetPluginsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPluginsResponseBodyData self = new GetPluginsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPluginsResponseBodyData setCategory(Integer category) {
            this.category = category;
            return this;
        }
        public Integer getCategory() {
            return this.category;
        }

        public GetPluginsResponseBodyData setConfigCheck(String configCheck) {
            this.configCheck = configCheck;
            return this;
        }
        public String getConfigCheck() {
            return this.configCheck;
        }

        public GetPluginsResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetPluginsResponseBodyData setMaxVersion(String maxVersion) {
            this.maxVersion = maxVersion;
            return this;
        }
        public String getMaxVersion() {
            return this.maxVersion;
        }

        public GetPluginsResponseBodyData setMode(Integer mode) {
            this.mode = mode;
            return this;
        }
        public Integer getMode() {
            return this.mode;
        }

        public GetPluginsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPluginsResponseBodyData setNewVersionPublishingFlag(Boolean newVersionPublishingFlag) {
            this.newVersionPublishingFlag = newVersionPublishingFlag;
            return this;
        }
        public Boolean getNewVersionPublishingFlag() {
            return this.newVersionPublishingFlag;
        }

        public GetPluginsResponseBodyData setPhase(Integer phase) {
            this.phase = phase;
            return this;
        }
        public Integer getPhase() {
            return this.phase;
        }

        public GetPluginsResponseBodyData setPrimaryUser(String primaryUser) {
            this.primaryUser = primaryUser;
            return this;
        }
        public String getPrimaryUser() {
            return this.primaryUser;
        }

        public GetPluginsResponseBodyData setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetPluginsResponseBodyData setPublishState(Integer publishState) {
            this.publishState = publishState;
            return this;
        }
        public Integer getPublishState() {
            return this.publishState;
        }

        public GetPluginsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPluginsResponseBodyData setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public GetPluginsResponseBodyData setSummaryEn(String summaryEn) {
            this.summaryEn = summaryEn;
            return this;
        }
        public String getSummaryEn() {
            return this.summaryEn;
        }

        public GetPluginsResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GetPluginsResponseBodyData setWasmFile(String wasmFile) {
            this.wasmFile = wasmFile;
            return this;
        }
        public String getWasmFile() {
            return this.wasmFile;
        }

        public GetPluginsResponseBodyData setWasmLang(Integer wasmLang) {
            this.wasmLang = wasmLang;
            return this;
        }
        public Integer getWasmLang() {
            return this.wasmLang;
        }

    }

}
