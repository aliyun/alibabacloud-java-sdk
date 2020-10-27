// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeCommandsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Long pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("Commands")
    @Validation(required = true)
    public DescribeCommandsResponseCommands commands;

    public static DescribeCommandsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommandsResponse self = new DescribeCommandsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCommandsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCommandsResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeCommandsResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCommandsResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeCommandsResponse setCommands(DescribeCommandsResponseCommands commands) {
        this.commands = commands;
        return this;
    }
    public DescribeCommandsResponseCommands getCommands() {
        return this.commands;
    }

    public static class DescribeCommandsResponseCommandsCommandParameterNames extends TeaModel {
        // ParameterName
        @NameInMap("ParameterName")
        @Validation(required = true)
        public java.util.List<String> parameterName;

        public static DescribeCommandsResponseCommandsCommandParameterNames build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommandsResponseCommandsCommandParameterNames self = new DescribeCommandsResponseCommandsCommandParameterNames();
            return TeaModel.build(map, self);
        }

        public DescribeCommandsResponseCommandsCommandParameterNames setParameterName(java.util.List<String> parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public java.util.List<String> getParameterName() {
            return this.parameterName;
        }

    }

    public static class DescribeCommandsResponseCommandsCommand extends TeaModel {
        @NameInMap("CommandId")
        @Validation(required = true)
        public String commandId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("CommandContent")
        @Validation(required = true)
        public String commandContent;

        @NameInMap("WorkingDir")
        @Validation(required = true)
        public String workingDir;

        @NameInMap("Timeout")
        @Validation(required = true)
        public Long timeout;

        @NameInMap("InvokeTimes")
        @Validation(required = true)
        public Integer invokeTimes;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("EnableParameter")
        @Validation(required = true)
        public Boolean enableParameter;

        @NameInMap("ParameterNames")
        @Validation(required = true)
        public DescribeCommandsResponseCommandsCommandParameterNames parameterNames;

        public static DescribeCommandsResponseCommandsCommand build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommandsResponseCommandsCommand self = new DescribeCommandsResponseCommandsCommand();
            return TeaModel.build(map, self);
        }

        public DescribeCommandsResponseCommandsCommand setCommandId(String commandId) {
            this.commandId = commandId;
            return this;
        }
        public String getCommandId() {
            return this.commandId;
        }

        public DescribeCommandsResponseCommandsCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCommandsResponseCommandsCommand setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeCommandsResponseCommandsCommand setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCommandsResponseCommandsCommand setCommandContent(String commandContent) {
            this.commandContent = commandContent;
            return this;
        }
        public String getCommandContent() {
            return this.commandContent;
        }

        public DescribeCommandsResponseCommandsCommand setWorkingDir(String workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public String getWorkingDir() {
            return this.workingDir;
        }

        public DescribeCommandsResponseCommandsCommand setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public DescribeCommandsResponseCommandsCommand setInvokeTimes(Integer invokeTimes) {
            this.invokeTimes = invokeTimes;
            return this;
        }
        public Integer getInvokeTimes() {
            return this.invokeTimes;
        }

        public DescribeCommandsResponseCommandsCommand setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeCommandsResponseCommandsCommand setEnableParameter(Boolean enableParameter) {
            this.enableParameter = enableParameter;
            return this;
        }
        public Boolean getEnableParameter() {
            return this.enableParameter;
        }

        public DescribeCommandsResponseCommandsCommand setParameterNames(DescribeCommandsResponseCommandsCommandParameterNames parameterNames) {
            this.parameterNames = parameterNames;
            return this;
        }
        public DescribeCommandsResponseCommandsCommandParameterNames getParameterNames() {
            return this.parameterNames;
        }

    }

    public static class DescribeCommandsResponseCommands extends TeaModel {
        @NameInMap("Command")
        @Validation(required = true)
        public java.util.List<DescribeCommandsResponseCommandsCommand> command;

        public static DescribeCommandsResponseCommands build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommandsResponseCommands self = new DescribeCommandsResponseCommands();
            return TeaModel.build(map, self);
        }

        public DescribeCommandsResponseCommands setCommand(java.util.List<DescribeCommandsResponseCommandsCommand> command) {
            this.command = command;
            return this;
        }
        public java.util.List<DescribeCommandsResponseCommandsCommand> getCommand() {
            return this.command;
        }

    }

}
