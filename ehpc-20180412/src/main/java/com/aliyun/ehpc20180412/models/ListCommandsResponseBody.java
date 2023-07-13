// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListCommandsResponseBody extends TeaModel {
    /**
     * <p>The list of commands.</p>
     */
    @NameInMap("Commands")
    public ListCommandsResponseBodyCommands commands;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListCommandsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCommandsResponseBody self = new ListCommandsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCommandsResponseBody setCommands(ListCommandsResponseBodyCommands commands) {
        this.commands = commands;
        return this;
    }
    public ListCommandsResponseBodyCommands getCommands() {
        return this.commands;
    }

    public ListCommandsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
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

    public ListCommandsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListCommandsResponseBodyCommandsCommand extends TeaModel {
        /**
         * <p>The content of the command.</p>
         */
        @NameInMap("CommandContent")
        public String commandContent;

        /**
         * <p>The ID of the command.</p>
         */
        @NameInMap("CommandId")
        public String commandId;

        /**
         * <p>The timeout period. Unit: seconds.</p>
         */
        @NameInMap("Timeout")
        public String timeout;

        /**
         * <p>The working directory of the command.</p>
         */
        @NameInMap("WorkingDir")
        public String workingDir;

        public static ListCommandsResponseBodyCommandsCommand build(java.util.Map<String, ?> map) throws Exception {
            ListCommandsResponseBodyCommandsCommand self = new ListCommandsResponseBodyCommandsCommand();
            return TeaModel.build(map, self);
        }

        public ListCommandsResponseBodyCommandsCommand setCommandContent(String commandContent) {
            this.commandContent = commandContent;
            return this;
        }
        public String getCommandContent() {
            return this.commandContent;
        }

        public ListCommandsResponseBodyCommandsCommand setCommandId(String commandId) {
            this.commandId = commandId;
            return this;
        }
        public String getCommandId() {
            return this.commandId;
        }

        public ListCommandsResponseBodyCommandsCommand setTimeout(String timeout) {
            this.timeout = timeout;
            return this;
        }
        public String getTimeout() {
            return this.timeout;
        }

        public ListCommandsResponseBodyCommandsCommand setWorkingDir(String workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public String getWorkingDir() {
            return this.workingDir;
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
