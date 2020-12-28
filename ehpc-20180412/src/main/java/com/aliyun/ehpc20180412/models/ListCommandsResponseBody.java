// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListCommandsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Commands")
    public java.util.List<ListCommandsResponseBodyCommands> commands;

    public static ListCommandsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCommandsResponseBody self = new ListCommandsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCommandsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListCommandsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCommandsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCommandsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCommandsResponseBody setCommands(java.util.List<ListCommandsResponseBodyCommands> commands) {
        this.commands = commands;
        return this;
    }
    public java.util.List<ListCommandsResponseBodyCommands> getCommands() {
        return this.commands;
    }

    public static class ListCommandsResponseBodyCommands extends TeaModel {
        @NameInMap("Timeout")
        public String timeout;

        @NameInMap("WorkingDir")
        public String workingDir;

        @NameInMap("CommandContent")
        public String commandContent;

        @NameInMap("CommandId")
        public String commandId;

        public static ListCommandsResponseBodyCommands build(java.util.Map<String, ?> map) throws Exception {
            ListCommandsResponseBodyCommands self = new ListCommandsResponseBodyCommands();
            return TeaModel.build(map, self);
        }

        public ListCommandsResponseBodyCommands setTimeout(String timeout) {
            this.timeout = timeout;
            return this;
        }
        public String getTimeout() {
            return this.timeout;
        }

        public ListCommandsResponseBodyCommands setWorkingDir(String workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public String getWorkingDir() {
            return this.workingDir;
        }

        public ListCommandsResponseBodyCommands setCommandContent(String commandContent) {
            this.commandContent = commandContent;
            return this;
        }
        public String getCommandContent() {
            return this.commandContent;
        }

        public ListCommandsResponseBodyCommands setCommandId(String commandId) {
            this.commandId = commandId;
            return this;
        }
        public String getCommandId() {
            return this.commandId;
        }

    }

}
