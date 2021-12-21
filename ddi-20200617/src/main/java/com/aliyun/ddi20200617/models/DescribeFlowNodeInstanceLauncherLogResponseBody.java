// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DescribeFlowNodeInstanceLauncherLogResponseBody extends TeaModel {
    @NameInMap("LogEnd")
    public Boolean logEnd;

    @NameInMap("LogEntrys")
    public DescribeFlowNodeInstanceLauncherLogResponseBodyLogEntrys logEntrys;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeFlowNodeInstanceLauncherLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowNodeInstanceLauncherLogResponseBody self = new DescribeFlowNodeInstanceLauncherLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFlowNodeInstanceLauncherLogResponseBody setLogEnd(Boolean logEnd) {
        this.logEnd = logEnd;
        return this;
    }
    public Boolean getLogEnd() {
        return this.logEnd;
    }

    public DescribeFlowNodeInstanceLauncherLogResponseBody setLogEntrys(DescribeFlowNodeInstanceLauncherLogResponseBodyLogEntrys logEntrys) {
        this.logEntrys = logEntrys;
        return this;
    }
    public DescribeFlowNodeInstanceLauncherLogResponseBodyLogEntrys getLogEntrys() {
        return this.logEntrys;
    }

    public DescribeFlowNodeInstanceLauncherLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeFlowNodeInstanceLauncherLogResponseBodyLogEntrysLogEntry extends TeaModel {
        @NameInMap("Content")
        public String content;

        public static DescribeFlowNodeInstanceLauncherLogResponseBodyLogEntrysLogEntry build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlowNodeInstanceLauncherLogResponseBodyLogEntrysLogEntry self = new DescribeFlowNodeInstanceLauncherLogResponseBodyLogEntrysLogEntry();
            return TeaModel.build(map, self);
        }

        public DescribeFlowNodeInstanceLauncherLogResponseBodyLogEntrysLogEntry setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class DescribeFlowNodeInstanceLauncherLogResponseBodyLogEntrys extends TeaModel {
        @NameInMap("LogEntry")
        public java.util.List<DescribeFlowNodeInstanceLauncherLogResponseBodyLogEntrysLogEntry> logEntry;

        public static DescribeFlowNodeInstanceLauncherLogResponseBodyLogEntrys build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlowNodeInstanceLauncherLogResponseBodyLogEntrys self = new DescribeFlowNodeInstanceLauncherLogResponseBodyLogEntrys();
            return TeaModel.build(map, self);
        }

        public DescribeFlowNodeInstanceLauncherLogResponseBodyLogEntrys setLogEntry(java.util.List<DescribeFlowNodeInstanceLauncherLogResponseBodyLogEntrysLogEntry> logEntry) {
            this.logEntry = logEntry;
            return this;
        }
        public java.util.List<DescribeFlowNodeInstanceLauncherLogResponseBodyLogEntrysLogEntry> getLogEntry() {
            return this.logEntry;
        }

    }

}
