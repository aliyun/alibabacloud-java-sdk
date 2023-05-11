// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetThingScriptResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned if the call is successful.</p>
     */
    @NameInMap("Data")
    public GetThingScriptResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <br>
     * <p>*   **true**: The call was successful.</p>
     * <p>*   **false**: The call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetThingScriptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetThingScriptResponseBody self = new GetThingScriptResponseBody();
        return TeaModel.build(map, self);
    }

    public GetThingScriptResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
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

    public GetThingScriptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetThingScriptResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetThingScriptResponseBodyData extends TeaModel {
        /**
         * <p>The type of the script. Valid values:</p>
         * <br>
         * <p>*   JavaScript</p>
         * <p>*   Python\_27: Python 2.7</p>
         * <p>*   PHP\_72: PHP 7.2</p>
         */
        @NameInMap("ScriptType")
        public String scriptType;

        /**
         * <p>The URL of the script payload.</p>
         */
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
