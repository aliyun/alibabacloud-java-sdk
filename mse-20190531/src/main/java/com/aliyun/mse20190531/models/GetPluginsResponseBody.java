// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetPluginsResponseBody extends TeaModel {
    /**
     * <p>The name of the plug-in.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetPluginsResponseBodyData> data;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The returned code.</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>zh: Chinese en: English</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The type of the plug-in. Valid values:</p>
     * <br>
     * <p>*   0: custom</p>
     * <p>*   1: permission authorization</p>
     * <p>*   2: security protection</p>
     * <p>*   3: transmission protocol</p>
     * <p>*   4: traffic control</p>
     * <p>*   5: traffic observation</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Specifies whether to enable the plug-in.</p>
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
         * <p>The dynamic error message.</p>
         */
        @NameInMap("Category")
        public Integer category;

        /**
         * <p>The version of the plug-in.</p>
         */
        @NameInMap("ConfigCheck")
        public String configCheck;

        /**
         * <p>The message returned.</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("MaxVersion")
        public String maxVersion;

        @NameInMap("Mode")
        public Integer mode;

        /**
         * <p>The data entries returned.</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("NewVersionPublishingFlag")
        public Boolean newVersionPublishingFlag;

        /**
         * <p>The type of the plug-in. Valid values:</p>
         * <br>
         * <p>0: custom</p>
         * <br>
         * <p>1: permission authorization</p>
         * <br>
         * <p>2: security protection</p>
         * <br>
         * <p>3: transmission protocol</p>
         * <br>
         * <p>4: traffic control</p>
         * <br>
         * <p>5: traffic observation</p>
         */
        @NameInMap("Phase")
        public Integer phase;

        /**
         * <p>The dynamic part in the error message.</p>
         */
        @NameInMap("PrimaryUser")
        public String primaryUser;

        /**
         * <p>The name of the plug-in.</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The execution stage of the plug-in.</p>
         * <br>
         * <p>*   0: default stage</p>
         * <p>*   1: authorization stage</p>
         * <p>*   2: authentication stage</p>
         * <p>*   3: statistics stage</p>
         */
        @NameInMap("PublishState")
        public Integer publishState;

        /**
         * <p>The information about the plug-in configuration used for checking.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the plug-in.</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <p>The information about the plug-in.</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <p>The execution priority of the plug-in. A larger value indicates a higher priority.</p>
         */
        @NameInMap("WasmFile")
        public String wasmFile;

        /**
         * <p>This is a plug-in.</p>
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
