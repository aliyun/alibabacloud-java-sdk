// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DescribeFlowNodeInstanceContainerLogResponseBody extends TeaModel {
    @NameInMap("LogEnd")
    public Boolean logEnd;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LogEntrys")
    public DescribeFlowNodeInstanceContainerLogResponseBodyLogEntrys logEntrys;

    public static DescribeFlowNodeInstanceContainerLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowNodeInstanceContainerLogResponseBody self = new DescribeFlowNodeInstanceContainerLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFlowNodeInstanceContainerLogResponseBody setLogEnd(Boolean logEnd) {
        this.logEnd = logEnd;
        return this;
    }
    public Boolean getLogEnd() {
        return this.logEnd;
    }

    public DescribeFlowNodeInstanceContainerLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFlowNodeInstanceContainerLogResponseBody setLogEntrys(DescribeFlowNodeInstanceContainerLogResponseBodyLogEntrys logEntrys) {
        this.logEntrys = logEntrys;
        return this;
    }
    public DescribeFlowNodeInstanceContainerLogResponseBodyLogEntrys getLogEntrys() {
        return this.logEntrys;
    }

    public static class DescribeFlowNodeInstanceContainerLogResponseBodyLogEntrysLogEntry extends TeaModel {
        @NameInMap("Content")
        public String content;

        public static DescribeFlowNodeInstanceContainerLogResponseBodyLogEntrysLogEntry build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlowNodeInstanceContainerLogResponseBodyLogEntrysLogEntry self = new DescribeFlowNodeInstanceContainerLogResponseBodyLogEntrysLogEntry();
            return TeaModel.build(map, self);
        }

        public DescribeFlowNodeInstanceContainerLogResponseBodyLogEntrysLogEntry setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class DescribeFlowNodeInstanceContainerLogResponseBodyLogEntrys extends TeaModel {
        @NameInMap("LogEntry")
        public java.util.List<DescribeFlowNodeInstanceContainerLogResponseBodyLogEntrysLogEntry> logEntry;

        public static DescribeFlowNodeInstanceContainerLogResponseBodyLogEntrys build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlowNodeInstanceContainerLogResponseBodyLogEntrys self = new DescribeFlowNodeInstanceContainerLogResponseBodyLogEntrys();
            return TeaModel.build(map, self);
        }

        public DescribeFlowNodeInstanceContainerLogResponseBodyLogEntrys setLogEntry(java.util.List<DescribeFlowNodeInstanceContainerLogResponseBodyLogEntrysLogEntry> logEntry) {
            this.logEntry = logEntry;
            return this;
        }
        public java.util.List<DescribeFlowNodeInstanceContainerLogResponseBodyLogEntrysLogEntry> getLogEntry() {
            return this.logEntry;
        }

    }

}
