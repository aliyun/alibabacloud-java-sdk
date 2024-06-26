// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeSmartContractResultContentResponseBody extends TeaModel {
    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeSmartContractResultContentResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeSmartContractResultContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmartContractResultContentResponseBody self = new DescribeSmartContractResultContentResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSmartContractResultContentResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeSmartContractResultContentResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeSmartContractResultContentResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeSmartContractResultContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSmartContractResultContentResponseBody setResult(java.util.List<DescribeSmartContractResultContentResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeSmartContractResultContentResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeSmartContractResultContentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeSmartContractResultContentResponseBodyResultDiagnosticsRange extends TeaModel {
        @NameInMap("Character")
        public Integer character;

        @NameInMap("Line")
        public Integer line;

        public static DescribeSmartContractResultContentResponseBodyResultDiagnosticsRange build(java.util.Map<String, ?> map) throws Exception {
            DescribeSmartContractResultContentResponseBodyResultDiagnosticsRange self = new DescribeSmartContractResultContentResponseBodyResultDiagnosticsRange();
            return TeaModel.build(map, self);
        }

        public DescribeSmartContractResultContentResponseBodyResultDiagnosticsRange setCharacter(Integer character) {
            this.character = character;
            return this;
        }
        public Integer getCharacter() {
            return this.character;
        }

        public DescribeSmartContractResultContentResponseBodyResultDiagnosticsRange setLine(Integer line) {
            this.line = line;
            return this;
        }
        public Integer getLine() {
            return this.line;
        }

    }

    public static class DescribeSmartContractResultContentResponseBodyResultDiagnosticsTraceLocationRange extends TeaModel {
        @NameInMap("Character")
        public Integer character;

        @NameInMap("Line")
        public Integer line;

        public static DescribeSmartContractResultContentResponseBodyResultDiagnosticsTraceLocationRange build(java.util.Map<String, ?> map) throws Exception {
            DescribeSmartContractResultContentResponseBodyResultDiagnosticsTraceLocationRange self = new DescribeSmartContractResultContentResponseBodyResultDiagnosticsTraceLocationRange();
            return TeaModel.build(map, self);
        }

        public DescribeSmartContractResultContentResponseBodyResultDiagnosticsTraceLocationRange setCharacter(Integer character) {
            this.character = character;
            return this;
        }
        public Integer getCharacter() {
            return this.character;
        }

        public DescribeSmartContractResultContentResponseBodyResultDiagnosticsTraceLocationRange setLine(Integer line) {
            this.line = line;
            return this;
        }
        public Integer getLine() {
            return this.line;
        }

    }

    public static class DescribeSmartContractResultContentResponseBodyResultDiagnosticsTraceLocation extends TeaModel {
        @NameInMap("Range")
        public java.util.List<DescribeSmartContractResultContentResponseBodyResultDiagnosticsTraceLocationRange> range;

        @NameInMap("Uri")
        public String uri;

        public static DescribeSmartContractResultContentResponseBodyResultDiagnosticsTraceLocation build(java.util.Map<String, ?> map) throws Exception {
            DescribeSmartContractResultContentResponseBodyResultDiagnosticsTraceLocation self = new DescribeSmartContractResultContentResponseBodyResultDiagnosticsTraceLocation();
            return TeaModel.build(map, self);
        }

        public DescribeSmartContractResultContentResponseBodyResultDiagnosticsTraceLocation setRange(java.util.List<DescribeSmartContractResultContentResponseBodyResultDiagnosticsTraceLocationRange> range) {
            this.range = range;
            return this;
        }
        public java.util.List<DescribeSmartContractResultContentResponseBodyResultDiagnosticsTraceLocationRange> getRange() {
            return this.range;
        }

        public DescribeSmartContractResultContentResponseBodyResultDiagnosticsTraceLocation setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

    public static class DescribeSmartContractResultContentResponseBodyResultDiagnosticsTrace extends TeaModel {
        @NameInMap("Location")
        public DescribeSmartContractResultContentResponseBodyResultDiagnosticsTraceLocation location;

        @NameInMap("Message")
        public String message;

        public static DescribeSmartContractResultContentResponseBodyResultDiagnosticsTrace build(java.util.Map<String, ?> map) throws Exception {
            DescribeSmartContractResultContentResponseBodyResultDiagnosticsTrace self = new DescribeSmartContractResultContentResponseBodyResultDiagnosticsTrace();
            return TeaModel.build(map, self);
        }

        public DescribeSmartContractResultContentResponseBodyResultDiagnosticsTrace setLocation(DescribeSmartContractResultContentResponseBodyResultDiagnosticsTraceLocation location) {
            this.location = location;
            return this;
        }
        public DescribeSmartContractResultContentResponseBodyResultDiagnosticsTraceLocation getLocation() {
            return this.location;
        }

        public DescribeSmartContractResultContentResponseBodyResultDiagnosticsTrace setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class DescribeSmartContractResultContentResponseBodyResultDiagnostics extends TeaModel {
        @NameInMap("Advice")
        public String advice;

        @NameInMap("Code")
        public String code;

        @NameInMap("Detail")
        public String detail;

        @NameInMap("Message")
        public String message;

        @NameInMap("Range")
        public java.util.List<DescribeSmartContractResultContentResponseBodyResultDiagnosticsRange> range;

        @NameInMap("Severity")
        public Integer severity;

        @NameInMap("Source")
        public String source;

        @NameInMap("Trace")
        public java.util.List<DescribeSmartContractResultContentResponseBodyResultDiagnosticsTrace> trace;

        public static DescribeSmartContractResultContentResponseBodyResultDiagnostics build(java.util.Map<String, ?> map) throws Exception {
            DescribeSmartContractResultContentResponseBodyResultDiagnostics self = new DescribeSmartContractResultContentResponseBodyResultDiagnostics();
            return TeaModel.build(map, self);
        }

        public DescribeSmartContractResultContentResponseBodyResultDiagnostics setAdvice(String advice) {
            this.advice = advice;
            return this;
        }
        public String getAdvice() {
            return this.advice;
        }

        public DescribeSmartContractResultContentResponseBodyResultDiagnostics setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeSmartContractResultContentResponseBodyResultDiagnostics setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public DescribeSmartContractResultContentResponseBodyResultDiagnostics setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeSmartContractResultContentResponseBodyResultDiagnostics setRange(java.util.List<DescribeSmartContractResultContentResponseBodyResultDiagnosticsRange> range) {
            this.range = range;
            return this;
        }
        public java.util.List<DescribeSmartContractResultContentResponseBodyResultDiagnosticsRange> getRange() {
            return this.range;
        }

        public DescribeSmartContractResultContentResponseBodyResultDiagnostics setSeverity(Integer severity) {
            this.severity = severity;
            return this;
        }
        public Integer getSeverity() {
            return this.severity;
        }

        public DescribeSmartContractResultContentResponseBodyResultDiagnostics setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeSmartContractResultContentResponseBodyResultDiagnostics setTrace(java.util.List<DescribeSmartContractResultContentResponseBodyResultDiagnosticsTrace> trace) {
            this.trace = trace;
            return this;
        }
        public java.util.List<DescribeSmartContractResultContentResponseBodyResultDiagnosticsTrace> getTrace() {
            return this.trace;
        }

    }

    public static class DescribeSmartContractResultContentResponseBodyResult extends TeaModel {
        @NameInMap("Diagnostics")
        public java.util.List<DescribeSmartContractResultContentResponseBodyResultDiagnostics> diagnostics;

        @NameInMap("Uri")
        public String uri;

        public static DescribeSmartContractResultContentResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeSmartContractResultContentResponseBodyResult self = new DescribeSmartContractResultContentResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeSmartContractResultContentResponseBodyResult setDiagnostics(java.util.List<DescribeSmartContractResultContentResponseBodyResultDiagnostics> diagnostics) {
            this.diagnostics = diagnostics;
            return this;
        }
        public java.util.List<DescribeSmartContractResultContentResponseBodyResultDiagnostics> getDiagnostics() {
            return this.diagnostics;
        }

        public DescribeSmartContractResultContentResponseBodyResult setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

}
