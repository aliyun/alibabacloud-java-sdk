// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetThingScriptResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public GetThingScriptResponseData data;

    public static GetThingScriptResponse build(java.util.Map<String, ?> map) throws Exception {
        GetThingScriptResponse self = new GetThingScriptResponse();
        return TeaModel.build(map, self);
    }

    public GetThingScriptResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetThingScriptResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetThingScriptResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetThingScriptResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetThingScriptResponse setData(GetThingScriptResponseData data) {
        this.data = data;
        return this;
    }
    public GetThingScriptResponseData getData() {
        return this.data;
    }

    public static class GetThingScriptResponseData extends TeaModel {
        @NameInMap("ScriptType")
        @Validation(required = true)
        public String scriptType;

        @NameInMap("ScriptUrl")
        @Validation(required = true)
        public String scriptUrl;

        public static GetThingScriptResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetThingScriptResponseData self = new GetThingScriptResponseData();
            return TeaModel.build(map, self);
        }

        public GetThingScriptResponseData setScriptType(String scriptType) {
            this.scriptType = scriptType;
            return this;
        }
        public String getScriptType() {
            return this.scriptType;
        }

        public GetThingScriptResponseData setScriptUrl(String scriptUrl) {
            this.scriptUrl = scriptUrl;
            return this;
        }
        public String getScriptUrl() {
            return this.scriptUrl;
        }

    }

}
