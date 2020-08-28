// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitoringAgentStatusesResponse extends TeaModel {
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

    @NameInMap("NodeStatusList")
    @Validation(required = true)
    public DescribeMonitoringAgentStatusesResponseNodeStatusList nodeStatusList;

    public static DescribeMonitoringAgentStatusesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitoringAgentStatusesResponse self = new DescribeMonitoringAgentStatusesResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeMonitoringAgentStatusesResponseNodeStatusListNodeStatus extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("AutoInstall")
        @Validation(required = true)
        public Boolean autoInstall;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static DescribeMonitoringAgentStatusesResponseNodeStatusListNodeStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitoringAgentStatusesResponseNodeStatusListNodeStatus self = new DescribeMonitoringAgentStatusesResponseNodeStatusListNodeStatus();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMonitoringAgentStatusesResponseNodeStatusList extends TeaModel {
        @NameInMap("NodeStatus")
        @Validation(required = true)
        public java.util.List<DescribeMonitoringAgentStatusesResponseNodeStatusListNodeStatus> nodeStatus;

        public static DescribeMonitoringAgentStatusesResponseNodeStatusList build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitoringAgentStatusesResponseNodeStatusList self = new DescribeMonitoringAgentStatusesResponseNodeStatusList();
            return TeaModel.build(map, self);
        }

    }

}
