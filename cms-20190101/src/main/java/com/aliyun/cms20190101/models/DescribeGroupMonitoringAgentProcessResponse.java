// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeGroupMonitoringAgentProcessResponse extends TeaModel {
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

    @NameInMap("Total")
    @Validation(required = true)
    public String total;

    @NameInMap("PageSize")
    @Validation(required = true)
    public String pageSize;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public String pageNumber;

    @NameInMap("Processes")
    @Validation(required = true)
    public DescribeGroupMonitoringAgentProcessResponseProcesses processes;

    public static DescribeGroupMonitoringAgentProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupMonitoringAgentProcessResponse self = new DescribeGroupMonitoringAgentProcessResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeGroupMonitoringAgentProcessResponseProcessesProcessMatchExpressMatchExpress extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Function")
        @Validation(required = true)
        public String function;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static DescribeGroupMonitoringAgentProcessResponseProcessesProcessMatchExpressMatchExpress build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupMonitoringAgentProcessResponseProcessesProcessMatchExpressMatchExpress self = new DescribeGroupMonitoringAgentProcessResponseProcessesProcessMatchExpressMatchExpress();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeGroupMonitoringAgentProcessResponseProcessesProcessMatchExpress extends TeaModel {
        @NameInMap("MatchExpress")
        @Validation(required = true)
        public java.util.List<DescribeGroupMonitoringAgentProcessResponseProcessesProcessMatchExpressMatchExpress> matchExpress;

        public static DescribeGroupMonitoringAgentProcessResponseProcessesProcessMatchExpress build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupMonitoringAgentProcessResponseProcessesProcessMatchExpress self = new DescribeGroupMonitoringAgentProcessResponseProcessesProcessMatchExpress();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeGroupMonitoringAgentProcessResponseProcessesProcessAlertConfigAlertConfig extends TeaModel {
        @NameInMap("EffectiveInterval")
        @Validation(required = true)
        public String effectiveInterval;

        @NameInMap("NoEffectiveInterval")
        @Validation(required = true)
        public String noEffectiveInterval;

        @NameInMap("SilenceTime")
        @Validation(required = true)
        public String silenceTime;

        @NameInMap("Webhook")
        @Validation(required = true)
        public String webhook;

        @NameInMap("EscalationsLevel")
        @Validation(required = true)
        public String escalationsLevel;

        @NameInMap("ComparisonOperator")
        @Validation(required = true)
        public String comparisonOperator;

        @NameInMap("Statistics")
        @Validation(required = true)
        public String statistics;

        @NameInMap("Threshold")
        @Validation(required = true)
        public String threshold;

        @NameInMap("Times")
        @Validation(required = true)
        public String times;

        public static DescribeGroupMonitoringAgentProcessResponseProcessesProcessAlertConfigAlertConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupMonitoringAgentProcessResponseProcessesProcessAlertConfigAlertConfig self = new DescribeGroupMonitoringAgentProcessResponseProcessesProcessAlertConfigAlertConfig();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeGroupMonitoringAgentProcessResponseProcessesProcessAlertConfig extends TeaModel {
        @NameInMap("AlertConfig")
        @Validation(required = true)
        public java.util.List<DescribeGroupMonitoringAgentProcessResponseProcessesProcessAlertConfigAlertConfig> alertConfig;

        public static DescribeGroupMonitoringAgentProcessResponseProcessesProcessAlertConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupMonitoringAgentProcessResponseProcessesProcessAlertConfig self = new DescribeGroupMonitoringAgentProcessResponseProcessesProcessAlertConfig();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeGroupMonitoringAgentProcessResponseProcessesProcess extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        @NameInMap("GroupId")
        @Validation(required = true)
        public String groupId;

        @NameInMap("ProcessName")
        @Validation(required = true)
        public String processName;

        @NameInMap("MatchExpressFilterRelation")
        @Validation(required = true)
        public String matchExpressFilterRelation;

        @NameInMap("MatchExpress")
        @Validation(required = true)
        public DescribeGroupMonitoringAgentProcessResponseProcessesProcessMatchExpress matchExpress;

        @NameInMap("AlertConfig")
        @Validation(required = true)
        public DescribeGroupMonitoringAgentProcessResponseProcessesProcessAlertConfig alertConfig;

        public static DescribeGroupMonitoringAgentProcessResponseProcessesProcess build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupMonitoringAgentProcessResponseProcessesProcess self = new DescribeGroupMonitoringAgentProcessResponseProcessesProcess();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeGroupMonitoringAgentProcessResponseProcesses extends TeaModel {
        @NameInMap("Process")
        @Validation(required = true)
        public java.util.List<DescribeGroupMonitoringAgentProcessResponseProcessesProcess> process;

        public static DescribeGroupMonitoringAgentProcessResponseProcesses build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupMonitoringAgentProcessResponseProcesses self = new DescribeGroupMonitoringAgentProcessResponseProcesses();
            return TeaModel.build(map, self);
        }

    }

}
