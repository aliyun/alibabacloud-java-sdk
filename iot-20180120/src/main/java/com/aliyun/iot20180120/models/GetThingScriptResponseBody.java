// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetThingScriptResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetThingScriptResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetThingScriptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetThingScriptResponseBody self = new GetThingScriptResponseBody();
        return TeaModel.build(map, self);
    }

    public GetThingScriptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetThingScriptResponseBody setData(GetThingScriptResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetThingScriptResponseBodyData getData() {
        return this.data;
    }

    public GetThingScriptResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetThingScriptResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetThingScriptResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetThingScriptResponseBodyData extends TeaModel {
        @NameInMap("ScriptType")
        public String scriptType;

        @NameInMap("ScriptUrl")
        public String scriptUrl;

        public static GetThingScriptResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetThingScriptResponseBodyData self = new GetThingScriptResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetThingScriptResponseBodyData setScriptType(String scriptType) {
            this.scriptType = scriptType;
            return this;
        }
        public String getScriptType() {
            return this.scriptType;
        }

        public GetThingScriptResponseBodyData setScriptUrl(String scriptUrl) {
            this.scriptUrl = scriptUrl;
            return this;
        }
        public String getScriptUrl() {
            return this.scriptUrl;
        }

    }

}
