// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetParserResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetParserResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>E4C0FF92-2A86-41DB-92D3-73B60310D25E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetParserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetParserResponseBody self = new GetParserResponseBody();
        return TeaModel.build(map, self);
    }

    public GetParserResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetParserResponseBody setData(GetParserResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetParserResponseBodyData getData() {
        return this.data;
    }

    public GetParserResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetParserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetParserResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetParserResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1003</p>
         */
        @NameInMap("DataSourceId")
        public Long dataSourceId;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>DataParser</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("ParserId")
        public Long parserId;

        /**
         * <strong>example:</strong>
         * <p>var data = payload(&quot;json&quot;); var h = data.items.Humidity.value; var t = data.items.Temperature.value; writeTsdb(1000,timestamp(),&quot;temperature&quot;, t , {&quot;deviceName&quot;:deviceName()}); writeTsdb(1000,timestamp(),&quot;humidity&quot;, h , {&quot;deviceName&quot;:deviceName()});</p>
         */
        @NameInMap("Script")
        public String script;

        /**
         * <strong>example:</strong>
         * <p>var data = payload(&quot;json&quot;); var h = data.items.Humidity.value; var t = data.items.Temperature.value; writeTsdb(1000,timestamp(),&quot;temperature&quot;, t , {&quot;deviceName&quot;:deviceName()}); writeTsdb(1000,timestamp(),&quot;humidity&quot;, h , {&quot;deviceName&quot;:deviceName()});</p>
         */
        @NameInMap("ScriptDraft")
        public String scriptDraft;

        /**
         * <strong>example:</strong>
         * <p>STOP</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>2022-03-27T12:45:43.000Z</p>
         */
        @NameInMap("UtcCreated")
        public String utcCreated;

        /**
         * <strong>example:</strong>
         * <p>2022-04-27T12:45:43.000Z</p>
         */
        @NameInMap("UtcModified")
        public String utcModified;

        public static GetParserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetParserResponseBodyData self = new GetParserResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetParserResponseBodyData setDataSourceId(Long dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public Long getDataSourceId() {
            return this.dataSourceId;
        }

        public GetParserResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetParserResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetParserResponseBodyData setParserId(Long parserId) {
            this.parserId = parserId;
            return this;
        }
        public Long getParserId() {
            return this.parserId;
        }

        public GetParserResponseBodyData setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

        public GetParserResponseBodyData setScriptDraft(String scriptDraft) {
            this.scriptDraft = scriptDraft;
            return this;
        }
        public String getScriptDraft() {
            return this.scriptDraft;
        }

        public GetParserResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetParserResponseBodyData setUtcCreated(String utcCreated) {
            this.utcCreated = utcCreated;
            return this;
        }
        public String getUtcCreated() {
            return this.utcCreated;
        }

        public GetParserResponseBodyData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

    }

}
