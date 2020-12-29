// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeCommandsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("Commands")
    public DescribeCommandsResponseBodyCommands commands;

    public static DescribeCommandsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommandsResponseBody self = new DescribeCommandsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCommandsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeCommandsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeCommandsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCommandsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCommandsResponseBody setCommands(DescribeCommandsResponseBodyCommands commands) {
        this.commands = commands;
        return this;
    }
    public DescribeCommandsResponseBodyCommands getCommands() {
        return this.commands;
    }

    public static class DescribeCommandsResponseBodyCommandsCommandParameterNames extends TeaModel {
        @NameInMap("ParameterName")
        public java.util.List<String> parameterName;

        public static DescribeCommandsResponseBodyCommandsCommandParameterNames build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommandsResponseBodyCommandsCommandParameterNames self = new DescribeCommandsResponseBodyCommandsCommandParameterNames();
            return TeaModel.build(map, self);
        }

        public DescribeCommandsResponseBodyCommandsCommandParameterNames setParameterName(java.util.List<String> parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public java.util.List<String> getParameterName() {
            return this.parameterName;
        }

    }

    public static class DescribeCommandsResponseBodyCommandsCommand extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Timeout")
        public Long timeout;

        @NameInMap("Type")
        public String type;

        @NameInMap("ParameterNames")
        public DescribeCommandsResponseBodyCommandsCommandParameterNames parameterNames;

        @NameInMap("InvokeTimes")
        public Integer invokeTimes;

        @NameInMap("WorkingDir")
        public String workingDir;

        @NameInMap("Description")
        public String description;

        @NameInMap("CommandContent")
        public String commandContent;

        @NameInMap("CommandId")
        public String commandId;

        @NameInMap("Name")
        public String name;

        @NameInMap("EnableParameter")
        public Boolean enableParameter;

        public static DescribeCommandsResponseBodyCommandsCommand build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommandsResponseBodyCommandsCommand self = new DescribeCommandsResponseBodyCommandsCommand();
            return TeaModel.build(map, self);
        }

        public DescribeCommandsResponseBodyCommandsCommand setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeCommandsResponseBodyCommandsCommand setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public DescribeCommandsResponseBodyCommandsCommand setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeCommandsResponseBodyCommandsCommand setParameterNames(DescribeCommandsResponseBodyCommandsCommandParameterNames parameterNames) {
            this.parameterNames = parameterNames;
            return this;
        }
        public DescribeCommandsResponseBodyCommandsCommandParameterNames getParameterNames() {
            return this.parameterNames;
        }

        public DescribeCommandsResponseBodyCommandsCommand setInvokeTimes(Integer invokeTimes) {
            this.invokeTimes = invokeTimes;
            return this;
        }
        public Integer getInvokeTimes() {
            return this.invokeTimes;
        }

        public DescribeCommandsResponseBodyCommandsCommand setWorkingDir(String workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public String getWorkingDir() {
            return this.workingDir;
        }

        public DescribeCommandsResponseBodyCommandsCommand setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCommandsResponseBodyCommandsCommand setCommandContent(String commandContent) {
            this.commandContent = commandContent;
            return this;
        }
        public String getCommandContent() {
            return this.commandContent;
        }

        public DescribeCommandsResponseBodyCommandsCommand setCommandId(String commandId) {
            this.commandId = commandId;
            return this;
        }
        public String getCommandId() {
            return this.commandId;
        }

        public DescribeCommandsResponseBodyCommandsCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCommandsResponseBodyCommandsCommand setEnableParameter(Boolean enableParameter) {
            this.enableParameter = enableParameter;
            return this;
        }
        public Boolean getEnableParameter() {
            return this.enableParameter;
        }

    }

    public static class DescribeCommandsResponseBodyCommands extends TeaModel {
        @NameInMap("Command")
        public java.util.List<DescribeCommandsResponseBodyCommandsCommand> command;

        public static DescribeCommandsResponseBodyCommands build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommandsResponseBodyCommands self = new DescribeCommandsResponseBodyCommands();
            return TeaModel.build(map, self);
        }

        public DescribeCommandsResponseBodyCommands setCommand(java.util.List<DescribeCommandsResponseBodyCommandsCommand> command) {
            this.command = command;
            return this;
        }
        public java.util.List<DescribeCommandsResponseBodyCommandsCommand> getCommand() {
            return this.command;
        }

    }

}
