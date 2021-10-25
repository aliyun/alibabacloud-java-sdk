// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListCommandsResponseBody extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Commands")
    public ListCommandsResponseBodyCommands commands;

    public static ListCommandsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCommandsResponseBody self = new ListCommandsResponseBody();
        return TeaModel.build(map, self);
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

    public ListCommandsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListCommandsResponseBody setCommands(ListCommandsResponseBodyCommands commands) {
        this.commands = commands;
        return this;
    }
    public ListCommandsResponseBodyCommands getCommands() {
        return this.commands;
    }

    public static class ListCommandsResponseBodyCommandsCommand extends TeaModel {
        @NameInMap("Timeout")
        public String timeout;

        @NameInMap("CommandId")
        public String commandId;

        @NameInMap("WorkingDir")
        public String workingDir;

        @NameInMap("CommandContent")
        public String commandContent;

        public static ListCommandsResponseBodyCommandsCommand build(java.util.Map<String, ?> map) throws Exception {
            ListCommandsResponseBodyCommandsCommand self = new ListCommandsResponseBodyCommandsCommand();
            return TeaModel.build(map, self);
        }

        public ListCommandsResponseBodyCommandsCommand setTimeout(String timeout) {
            this.timeout = timeout;
            return this;
        }
        public String getTimeout() {
            return this.timeout;
        }

        public ListCommandsResponseBodyCommandsCommand setCommandId(String commandId) {
            this.commandId = commandId;
            return this;
        }
        public String getCommandId() {
            return this.commandId;
        }

        public ListCommandsResponseBodyCommandsCommand setWorkingDir(String workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public String getWorkingDir() {
            return this.workingDir;
        }

        public ListCommandsResponseBodyCommandsCommand setCommandContent(String commandContent) {
            this.commandContent = commandContent;
            return this;
        }
        public String getCommandContent() {
            return this.commandContent;
        }

    }

    public static class ListCommandsResponseBodyCommands extends TeaModel {
        @NameInMap("Command")
        public java.util.List<ListCommandsResponseBodyCommandsCommand> command;

        public static ListCommandsResponseBodyCommands build(java.util.Map<String, ?> map) throws Exception {
            ListCommandsResponseBodyCommands self = new ListCommandsResponseBodyCommands();
            return TeaModel.build(map, self);
        }

        public ListCommandsResponseBodyCommands setCommand(java.util.List<ListCommandsResponseBodyCommandsCommand> command) {
            this.command = command;
            return this;
        }
        public java.util.List<ListCommandsResponseBodyCommandsCommand> getCommand() {
            return this.command;
        }

    }

}
