// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkastreaming20260202.models;

import com.aliyun.tea.*;

public class CheckSqlContentResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public CheckSqlContentResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CheckSqlContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckSqlContentResponseBody self = new CheckSqlContentResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckSqlContentResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public CheckSqlContentResponseBody setData(CheckSqlContentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CheckSqlContentResponseBodyData getData() {
        return this.data;
    }

    public CheckSqlContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckSqlContentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CheckSqlContentResponseBodyDataErrorList extends TeaModel {
        @NameInMap("CodeSnippet")
        public String codeSnippet;

        @NameInMap("ColumnNumber")
        public Integer columnNumber;

        @NameInMap("EndColumnNumber")
        public Integer endColumnNumber;

        @NameInMap("EndLineNumber")
        public Integer endLineNumber;

        @NameInMap("ErrorType")
        public String errorType;

        @NameInMap("LineNumber")
        public Integer lineNumber;

        @NameInMap("Message")
        public String message;

        public static CheckSqlContentResponseBodyDataErrorList build(java.util.Map<String, ?> map) throws Exception {
            CheckSqlContentResponseBodyDataErrorList self = new CheckSqlContentResponseBodyDataErrorList();
            return TeaModel.build(map, self);
        }

        public CheckSqlContentResponseBodyDataErrorList setCodeSnippet(String codeSnippet) {
            this.codeSnippet = codeSnippet;
            return this;
        }
        public String getCodeSnippet() {
            return this.codeSnippet;
        }

        public CheckSqlContentResponseBodyDataErrorList setColumnNumber(Integer columnNumber) {
            this.columnNumber = columnNumber;
            return this;
        }
        public Integer getColumnNumber() {
            return this.columnNumber;
        }

        public CheckSqlContentResponseBodyDataErrorList setEndColumnNumber(Integer endColumnNumber) {
            this.endColumnNumber = endColumnNumber;
            return this;
        }
        public Integer getEndColumnNumber() {
            return this.endColumnNumber;
        }

        public CheckSqlContentResponseBodyDataErrorList setEndLineNumber(Integer endLineNumber) {
            this.endLineNumber = endLineNumber;
            return this;
        }
        public Integer getEndLineNumber() {
            return this.endLineNumber;
        }

        public CheckSqlContentResponseBodyDataErrorList setErrorType(String errorType) {
            this.errorType = errorType;
            return this;
        }
        public String getErrorType() {
            return this.errorType;
        }

        public CheckSqlContentResponseBodyDataErrorList setLineNumber(Integer lineNumber) {
            this.lineNumber = lineNumber;
            return this;
        }
        public Integer getLineNumber() {
            return this.lineNumber;
        }

        public CheckSqlContentResponseBodyDataErrorList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class CheckSqlContentResponseBodyData extends TeaModel {
        @NameInMap("ErrorList")
        public java.util.List<CheckSqlContentResponseBodyDataErrorList> errorList;

        @NameInMap("Valid")
        public Boolean valid;

        public static CheckSqlContentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CheckSqlContentResponseBodyData self = new CheckSqlContentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CheckSqlContentResponseBodyData setErrorList(java.util.List<CheckSqlContentResponseBodyDataErrorList> errorList) {
            this.errorList = errorList;
            return this;
        }
        public java.util.List<CheckSqlContentResponseBodyDataErrorList> getErrorList() {
            return this.errorList;
        }

        public CheckSqlContentResponseBodyData setValid(Boolean valid) {
            this.valid = valid;
            return this;
        }
        public Boolean getValid() {
            return this.valid;
        }

    }

}
