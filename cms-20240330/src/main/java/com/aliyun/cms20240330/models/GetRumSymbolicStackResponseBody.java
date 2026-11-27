// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetRumSymbolicStackResponseBody extends TeaModel {
    /**
     * <p>The column number restored by the JS SourceMap.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("column")
    public Long column;

    /**
     * <p>The line number restored by the JS SourceMap.</p>
     * 
     * <strong>example:</strong>
     * <p>42</p>
     */
    @NameInMap("line")
    public Long line;

    /**
     * <p>The list of symbolicated stack lines.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;\tat com.example.UserService.getUser(UserService.java:25)&quot;]</p>
     */
    @NameInMap("lines")
    public java.util.List<String> lines;

    /**
     * <p>The symbol name restored by the JS SourceMap.</p>
     * 
     * <strong>example:</strong>
     * <p>handleClick</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>request-1</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The source file path restored by the JS SourceMap.</p>
     * 
     * <strong>example:</strong>
     * <p>src/app.js</p>
     */
    @NameInMap("source")
    public String source;

    /**
     * <p>The ID of the exception thread.</p>
     * 
     * <strong>example:</strong>
     * <p>main-thread</p>
     */
    @NameInMap("threadId")
    public String threadId;

    /**
     * <p>The list of source code context lines.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;line1&quot;]</p>
     */
    @NameInMap("traceInfo")
    public java.util.List<String> traceInfo;

    /**
     * <p>The highlighted line number of the error line in traceInfo.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("traceMarkLine")
    public Long traceMarkLine;

    public static GetRumSymbolicStackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRumSymbolicStackResponseBody self = new GetRumSymbolicStackResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRumSymbolicStackResponseBody setColumn(Long column) {
        this.column = column;
        return this;
    }
    public Long getColumn() {
        return this.column;
    }

    public GetRumSymbolicStackResponseBody setLine(Long line) {
        this.line = line;
        return this;
    }
    public Long getLine() {
        return this.line;
    }

    public GetRumSymbolicStackResponseBody setLines(java.util.List<String> lines) {
        this.lines = lines;
        return this;
    }
    public java.util.List<String> getLines() {
        return this.lines;
    }

    public GetRumSymbolicStackResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetRumSymbolicStackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRumSymbolicStackResponseBody setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public GetRumSymbolicStackResponseBody setThreadId(String threadId) {
        this.threadId = threadId;
        return this;
    }
    public String getThreadId() {
        return this.threadId;
    }

    public GetRumSymbolicStackResponseBody setTraceInfo(java.util.List<String> traceInfo) {
        this.traceInfo = traceInfo;
        return this;
    }
    public java.util.List<String> getTraceInfo() {
        return this.traceInfo;
    }

    public GetRumSymbolicStackResponseBody setTraceMarkLine(Long traceMarkLine) {
        this.traceMarkLine = traceMarkLine;
        return this;
    }
    public Long getTraceMarkLine() {
        return this.traceMarkLine;
    }

}
