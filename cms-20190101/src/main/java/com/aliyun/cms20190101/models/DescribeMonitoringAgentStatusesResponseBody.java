// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitoringAgentStatusesResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("NodeStatusList")
    public DescribeMonitoringAgentStatusesResponseBodyNodeStatusList nodeStatusList;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeMonitoringAgentStatusesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitoringAgentStatusesResponseBody self = new DescribeMonitoringAgentStatusesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMonitoringAgentStatusesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeMonitoringAgentStatusesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMonitoringAgentStatusesResponseBody setNodeStatusList(DescribeMonitoringAgentStatusesResponseBodyNodeStatusList nodeStatusList) {
        this.nodeStatusList = nodeStatusList;
        return this;
    }
    public DescribeMonitoringAgentStatusesResponseBodyNodeStatusList getNodeStatusList() {
        return this.nodeStatusList;
    }

    public DescribeMonitoringAgentStatusesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeMonitoringAgentStatusesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeMonitoringAgentStatusesResponseBodyNodeStatusListNodeStatus extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("AutoInstall")
        public Boolean autoInstall;

        @NameInMap("InstanceId")
        public String instanceId;

        public static DescribeMonitoringAgentStatusesResponseBodyNodeStatusListNodeStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitoringAgentStatusesResponseBodyNodeStatusListNodeStatus self = new DescribeMonitoringAgentStatusesResponseBodyNodeStatusListNodeStatus();
            return TeaModel.build(map, self);
        }

        public DescribeMonitoringAgentStatusesResponseBodyNodeStatusListNodeStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeMonitoringAgentStatusesResponseBodyNodeStatusListNodeStatus setAutoInstall(Boolean autoInstall) {
            this.autoInstall = autoInstall;
            return this;
        }
        public Boolean getAutoInstall() {
            return this.autoInstall;
        }

        public DescribeMonitoringAgentStatusesResponseBodyNodeStatusListNodeStatus setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class DescribeMonitoringAgentStatusesResponseBodyNodeStatusList extends TeaModel {
        @NameInMap("NodeStatus")
        public java.util.List<DescribeMonitoringAgentStatusesResponseBodyNodeStatusListNodeStatus> nodeStatus;

        public static DescribeMonitoringAgentStatusesResponseBodyNodeStatusList build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitoringAgentStatusesResponseBodyNodeStatusList self = new DescribeMonitoringAgentStatusesResponseBodyNodeStatusList();
            return TeaModel.build(map, self);
        }

        public DescribeMonitoringAgentStatusesResponseBodyNodeStatusList setNodeStatus(java.util.List<DescribeMonitoringAgentStatusesResponseBodyNodeStatusListNodeStatus> nodeStatus) {
            this.nodeStatus = nodeStatus;
            return this;
        }
        public java.util.List<DescribeMonitoringAgentStatusesResponseBodyNodeStatusListNodeStatus> getNodeStatus() {
            return this.nodeStatus;
        }

    }

}
