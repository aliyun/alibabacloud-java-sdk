// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetThingScriptResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
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
     * 
     * <strong>example:</strong>
     * <p>BB71E443-4447-4024-A000-EDE09922891E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * <ul>
         * <li>JavaScript</li>
         * <li>Python_27: Python 2.7</li>
         * <li>PHP_72: PHP 7.2</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>JavaScript</p>
         */
        @NameInMap("ScriptType")
        public String scriptType;

        /**
         * <p>The URL of the script payload.</p>
         * 
         * <strong>example:</strong>
         * <p>http://***</p>
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
