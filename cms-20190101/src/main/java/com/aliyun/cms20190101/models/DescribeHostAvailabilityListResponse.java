// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeHostAvailabilityListResponse extends TeaModel {
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
    public Integer total;

    @NameInMap("TaskList")
    @Validation(required = true)
    public DescribeHostAvailabilityListResponseTaskList taskList;

    public static DescribeHostAvailabilityListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHostAvailabilityListResponse self = new DescribeHostAvailabilityListResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeHostAvailabilityListResponseTaskListNodeTaskConfigTaskOption extends TeaModel {
        @NameInMap("HttpURI")
        @Validation(required = true)
        public String httpURI;

        @NameInMap("TelnetOrPingHost")
        @Validation(required = true)
        public String telnetOrPingHost;

        @NameInMap("HttpResponseCharset")
        @Validation(required = true)
        public String httpResponseCharset;

        @NameInMap("HttpKeyword")
        @Validation(required = true)
        public String httpKeyword;

        @NameInMap("HttpMethod")
        @Validation(required = true)
        public String httpMethod;

        @NameInMap("HttpNegative")
        @Validation(required = true)
        public Boolean httpNegative;

        public static DescribeHostAvailabilityListResponseTaskListNodeTaskConfigTaskOption build(java.util.Map<String, ?> map) throws Exception {
            DescribeHostAvailabilityListResponseTaskListNodeTaskConfigTaskOption self = new DescribeHostAvailabilityListResponseTaskListNodeTaskConfigTaskOption();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeHostAvailabilityListResponseTaskListNodeTaskConfigAlertConfigEscalationListEscalationList extends TeaModel {
        @NameInMap("MetricName")
        @Validation(required = true)
        public String metricName;

        @NameInMap("Aggregate")
        @Validation(required = true)
        public String aggregate;

        @NameInMap("Operator")
        @Validation(required = true)
        public String operator;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        @NameInMap("Times")
        @Validation(required = true)
        public String times;

        public static DescribeHostAvailabilityListResponseTaskListNodeTaskConfigAlertConfigEscalationListEscalationList build(java.util.Map<String, ?> map) throws Exception {
            DescribeHostAvailabilityListResponseTaskListNodeTaskConfigAlertConfigEscalationListEscalationList self = new DescribeHostAvailabilityListResponseTaskListNodeTaskConfigAlertConfigEscalationListEscalationList();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeHostAvailabilityListResponseTaskListNodeTaskConfigAlertConfigEscalationList extends TeaModel {
        @NameInMap("escalationList")
        @Validation(required = true)
        public java.util.List<DescribeHostAvailabilityListResponseTaskListNodeTaskConfigAlertConfigEscalationListEscalationList> escalationList;

        public static DescribeHostAvailabilityListResponseTaskListNodeTaskConfigAlertConfigEscalationList build(java.util.Map<String, ?> map) throws Exception {
            DescribeHostAvailabilityListResponseTaskListNodeTaskConfigAlertConfigEscalationList self = new DescribeHostAvailabilityListResponseTaskListNodeTaskConfigAlertConfigEscalationList();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeHostAvailabilityListResponseTaskListNodeTaskConfigAlertConfig extends TeaModel {
        @NameInMap("NotifyType")
        @Validation(required = true)
        public Integer notifyType;

        @NameInMap("StartTime")
        @Validation(required = true)
        public Integer startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public Integer endTime;

        @NameInMap("SilenceTime")
        @Validation(required = true)
        public Integer silenceTime;

        @NameInMap("WebHook")
        @Validation(required = true)
        public String webHook;

        @NameInMap("EscalationList")
        @Validation(required = true)
        public DescribeHostAvailabilityListResponseTaskListNodeTaskConfigAlertConfigEscalationList escalationList;

        public static DescribeHostAvailabilityListResponseTaskListNodeTaskConfigAlertConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeHostAvailabilityListResponseTaskListNodeTaskConfigAlertConfig self = new DescribeHostAvailabilityListResponseTaskListNodeTaskConfigAlertConfig();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeHostAvailabilityListResponseTaskListNodeTaskConfigInstances extends TeaModel {
        @NameInMap("Instance")
        @Validation(required = true)
        public java.util.List<String> instance;

        public static DescribeHostAvailabilityListResponseTaskListNodeTaskConfigInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeHostAvailabilityListResponseTaskListNodeTaskConfigInstances self = new DescribeHostAvailabilityListResponseTaskListNodeTaskConfigInstances();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeHostAvailabilityListResponseTaskListNodeTaskConfig extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("TaskName")
        @Validation(required = true)
        public String taskName;

        @NameInMap("TaskType")
        @Validation(required = true)
        public String taskType;

        @NameInMap("TaskScope")
        @Validation(required = true)
        public String taskScope;

        @NameInMap("Disabled")
        @Validation(required = true)
        public Boolean disabled;

        @NameInMap("GroupId")
        @Validation(required = true)
        public Long groupId;

        @NameInMap("GroupName")
        @Validation(required = true)
        public String groupName;

        @NameInMap("TaskOption")
        @Validation(required = true)
        public DescribeHostAvailabilityListResponseTaskListNodeTaskConfigTaskOption taskOption;

        @NameInMap("AlertConfig")
        @Validation(required = true)
        public DescribeHostAvailabilityListResponseTaskListNodeTaskConfigAlertConfig alertConfig;

        @NameInMap("Instances")
        @Validation(required = true)
        public DescribeHostAvailabilityListResponseTaskListNodeTaskConfigInstances instances;

        public static DescribeHostAvailabilityListResponseTaskListNodeTaskConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeHostAvailabilityListResponseTaskListNodeTaskConfig self = new DescribeHostAvailabilityListResponseTaskListNodeTaskConfig();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeHostAvailabilityListResponseTaskList extends TeaModel {
        @NameInMap("NodeTaskConfig")
        @Validation(required = true)
        public java.util.List<DescribeHostAvailabilityListResponseTaskListNodeTaskConfig> nodeTaskConfig;

        public static DescribeHostAvailabilityListResponseTaskList build(java.util.Map<String, ?> map) throws Exception {
            DescribeHostAvailabilityListResponseTaskList self = new DescribeHostAvailabilityListResponseTaskList();
            return TeaModel.build(map, self);
        }

    }

}
