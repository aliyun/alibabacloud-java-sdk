// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class GetAvailableParserTypesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DataCenter.Throttling</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAvailableParserTypesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>User not authorized to operate on the specified resource</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>17204B98-7734-4F9A-8464-2446XXXXXXX</p>
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
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAvailableParserTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAvailableParserTypesResponseBody self = new GetAvailableParserTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAvailableParserTypesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAvailableParserTypesResponseBody setData(GetAvailableParserTypesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAvailableParserTypesResponseBodyData getData() {
        return this.data;
    }

    public GetAvailableParserTypesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAvailableParserTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAvailableParserTypesResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetAvailableParserTypesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAvailableParserTypesResponseBodyDataParserList extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>DOCMIND</p>
         */
        @NameInMap("Parser")
        public String parser;

        public static GetAvailableParserTypesResponseBodyDataParserList build(java.util.Map<String, ?> map) throws Exception {
            GetAvailableParserTypesResponseBodyDataParserList self = new GetAvailableParserTypesResponseBodyDataParserList();
            return TeaModel.build(map, self);
        }

        public GetAvailableParserTypesResponseBodyDataParserList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetAvailableParserTypesResponseBodyDataParserList setParser(String parser) {
            this.parser = parser;
            return this;
        }
        public String getParser() {
            return this.parser;
        }

    }

    public static class GetAvailableParserTypesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>pdf</p>
         */
        @NameInMap("FileType")
        public String fileType;

        @NameInMap("ParserList")
        public java.util.List<GetAvailableParserTypesResponseBodyDataParserList> parserList;

        public static GetAvailableParserTypesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAvailableParserTypesResponseBodyData self = new GetAvailableParserTypesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAvailableParserTypesResponseBodyData setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public GetAvailableParserTypesResponseBodyData setParserList(java.util.List<GetAvailableParserTypesResponseBodyDataParserList> parserList) {
            this.parserList = parserList;
            return this;
        }
        public java.util.List<GetAvailableParserTypesResponseBodyDataParserList> getParserList() {
            return this.parserList;
        }

    }

}
