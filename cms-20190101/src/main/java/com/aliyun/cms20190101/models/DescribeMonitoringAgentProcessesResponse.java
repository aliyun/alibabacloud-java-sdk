// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitoringAgentProcessesResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NodeProcesses")
    @Validation(required = true)
    public DescribeMonitoringAgentProcessesResponseNodeProcesses nodeProcesses;

    public static DescribeMonitoringAgentProcessesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitoringAgentProcessesResponse self = new DescribeMonitoringAgentProcessesResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeMonitoringAgentProcessesResponseNodeProcessesNodeProcess extends TeaModel {
        @NameInMap("ProcessId")
        @Validation(required = true)
        public Long processId;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("ProcessName")
        @Validation(required = true)
        public String processName;

        @NameInMap("ProcessUser")
        @Validation(required = true)
        public String processUser;

        @NameInMap("Command")
        @Validation(required = true)
        public String command;

        @NameInMap("GroupId")
        @Validation(required = true)
        public String groupId;

        public static DescribeMonitoringAgentProcessesResponseNodeProcessesNodeProcess build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitoringAgentProcessesResponseNodeProcessesNodeProcess self = new DescribeMonitoringAgentProcessesResponseNodeProcessesNodeProcess();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMonitoringAgentProcessesResponseNodeProcesses extends TeaModel {
        @NameInMap("NodeProcess")
        @Validation(required = true)
        public java.util.List<DescribeMonitoringAgentProcessesResponseNodeProcessesNodeProcess> nodeProcess;

        public static DescribeMonitoringAgentProcessesResponseNodeProcesses build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitoringAgentProcessesResponseNodeProcesses self = new DescribeMonitoringAgentProcessesResponseNodeProcesses();
            return TeaModel.build(map, self);
        }

    }

}
