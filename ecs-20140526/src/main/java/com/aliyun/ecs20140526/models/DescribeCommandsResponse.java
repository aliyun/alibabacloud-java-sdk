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

    public static class DescribeCommandsResponseCommandsCommandParameterNames extends TeaModel {
        // ParameterName
        @NameInMap("ParameterName")
        @Validation(required = true)
        public java.util.List<String> parameterName;

        public static DescribeCommandsResponseCommandsCommandParameterNames build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommandsResponseCommandsCommandParameterNames self = new DescribeCommandsResponseCommandsCommandParameterNames();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeCommandsResponseCommands extends TeaModel {
        @NameInMap("Command")
        @Validation(required = true)
        public java.util.List<DescribeCommandsResponseCommandsCommand> command;

        public static DescribeCommandsResponseCommands build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommandsResponseCommands self = new DescribeCommandsResponseCommands();
            return TeaModel.build(map, self);
        }

    }

}
