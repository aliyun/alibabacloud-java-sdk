// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class GetParseSettingsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetParseSettingsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>workspace id is null or invalid.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>35A267BF-xxxx-54DB-8394-AA3B0742D833</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetParseSettingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetParseSettingsResponseBody self = new GetParseSettingsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetParseSettingsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetParseSettingsResponseBody setData(java.util.List<GetParseSettingsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetParseSettingsResponseBodyData> getData() {
        return this.data;
    }

    public GetParseSettingsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetParseSettingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetParseSettingsResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetParseSettingsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetParseSettingsResponseBodyDataParserConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <ul>
         * <li>qwen-vl-max</li>
         * <li>qwen-vl-plus</li>
         * </ul>
         */
        @NameInMap("ModelName")
        public String modelName;

        @NameInMap("ModelPrompt")
        public String modelPrompt;

        public static GetParseSettingsResponseBodyDataParserConfig build(java.util.Map<String, ?> map) throws Exception {
            GetParseSettingsResponseBodyDataParserConfig self = new GetParseSettingsResponseBodyDataParserConfig();
            return TeaModel.build(map, self);
        }

        public GetParseSettingsResponseBodyDataParserConfig setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public GetParseSettingsResponseBodyDataParserConfig setModelPrompt(String modelPrompt) {
            this.modelPrompt = modelPrompt;
            return this;
        }
        public String getModelPrompt() {
            return this.modelPrompt;
        }

    }

    public static class GetParseSettingsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>pdf</p>
         */
        @NameInMap("FileType")
        public String fileType;

        /**
         * <strong>example:</strong>
         * <p>DOCMIND</p>
         */
        @NameInMap("Parser")
        public String parser;

        @NameInMap("ParserConfig")
        public GetParseSettingsResponseBodyDataParserConfig parserConfig;

        @NameInMap("ParserDisplayName")
        public String parserDisplayName;

        public static GetParseSettingsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetParseSettingsResponseBodyData self = new GetParseSettingsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetParseSettingsResponseBodyData setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public GetParseSettingsResponseBodyData setParser(String parser) {
            this.parser = parser;
            return this;
        }
        public String getParser() {
            return this.parser;
        }

        public GetParseSettingsResponseBodyData setParserConfig(GetParseSettingsResponseBodyDataParserConfig parserConfig) {
            this.parserConfig = parserConfig;
            return this;
        }
        public GetParseSettingsResponseBodyDataParserConfig getParserConfig() {
            return this.parserConfig;
        }

        public GetParseSettingsResponseBodyData setParserDisplayName(String parserDisplayName) {
            this.parserDisplayName = parserDisplayName;
            return this;
        }
        public String getParserDisplayName() {
            return this.parserDisplayName;
        }

    }

}
