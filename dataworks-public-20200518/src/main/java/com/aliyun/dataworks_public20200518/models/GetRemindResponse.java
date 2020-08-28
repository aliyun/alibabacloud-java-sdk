// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetRemindResponse extends TeaModel {
    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public GetRemindResponseData data;

    public static GetRemindResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRemindResponse self = new GetRemindResponse();
        return TeaModel.build(map, self);
    }

    public static class GetRemindResponseDataRobots extends TeaModel {
        @NameInMap("WebUrl")
        @Validation(required = true)
        public String webUrl;

        @NameInMap("AtAll")
        @Validation(required = true)
        public Boolean atAll;

        public static GetRemindResponseDataRobots build(java.util.Map<String, ?> map) throws Exception {
            GetRemindResponseDataRobots self = new GetRemindResponseDataRobots();
            return TeaModel.build(map, self);
        }

    }

    public static class GetRemindResponseDataNodes extends TeaModel {
        @NameInMap("NodeId")
        @Validation(required = true)
        public Long nodeId;

        @NameInMap("NodeName")
        @Validation(required = true)
        public String nodeName;

        @NameInMap("Owner")
        @Validation(required = true)
        public String owner;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        public static GetRemindResponseDataNodes build(java.util.Map<String, ?> map) throws Exception {
            GetRemindResponseDataNodes self = new GetRemindResponseDataNodes();
            return TeaModel.build(map, self);
        }

    }

    public static class GetRemindResponseDataBaselines extends TeaModel {
        @NameInMap("BaselineId")
        @Validation(required = true)
        public Long baselineId;

        @NameInMap("BaselineName")
        @Validation(required = true)
        public String baselineName;

        public static GetRemindResponseDataBaselines build(java.util.Map<String, ?> map) throws Exception {
            GetRemindResponseDataBaselines self = new GetRemindResponseDataBaselines();
            return TeaModel.build(map, self);
        }

    }

    public static class GetRemindResponseDataProjects extends TeaModel {
        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        public static GetRemindResponseDataProjects build(java.util.Map<String, ?> map) throws Exception {
            GetRemindResponseDataProjects self = new GetRemindResponseDataProjects();
            return TeaModel.build(map, self);
        }

    }

    public static class GetRemindResponseDataBizProcesses extends TeaModel {
        @NameInMap("BizId")
        @Validation(required = true)
        public Long bizId;

        @NameInMap("BizProcessName")
        @Validation(required = true)
        public String bizProcessName;

        public static GetRemindResponseDataBizProcesses build(java.util.Map<String, ?> map) throws Exception {
            GetRemindResponseDataBizProcesses self = new GetRemindResponseDataBizProcesses();
            return TeaModel.build(map, self);
        }

    }

    public static class GetRemindResponseData extends TeaModel {
        @NameInMap("RemindId")
        @Validation(required = true)
        public Long remindId;

        @NameInMap("RemindName")
        @Validation(required = true)
        public String remindName;

        @NameInMap("DndStart")
        @Validation(required = true)
        public String dndStart;

        @NameInMap("DndEnd")
        @Validation(required = true)
        public String dndEnd;

        @NameInMap("RemindUnit")
        @Validation(required = true)
        public String remindUnit;

        @NameInMap("RemindType")
        @Validation(required = true)
        public String remindType;

        @NameInMap("AlertUnit")
        @Validation(required = true)
        public String alertUnit;

        @NameInMap("Useflag")
        @Validation(required = true)
        public Boolean useflag;

        @NameInMap("Founder")
        @Validation(required = true)
        public String founder;

        @NameInMap("AlertInterval")
        @Validation(required = true)
        public Integer alertInterval;

        @NameInMap("Detail")
        @Validation(required = true)
        public String detail;

        @NameInMap("MaxAlertTimes")
        @Validation(required = true)
        public Integer maxAlertTimes;

        @NameInMap("Robots")
        @Validation(required = true)
        public java.util.List<GetRemindResponseDataRobots> robots;

        @NameInMap("Nodes")
        @Validation(required = true)
        public java.util.List<GetRemindResponseDataNodes> nodes;

        @NameInMap("Baselines")
        @Validation(required = true)
        public java.util.List<GetRemindResponseDataBaselines> baselines;

        @NameInMap("Projects")
        @Validation(required = true)
        public java.util.List<GetRemindResponseDataProjects> projects;

        @NameInMap("BizProcesses")
        @Validation(required = true)
        public java.util.List<GetRemindResponseDataBizProcesses> bizProcesses;

        @NameInMap("AlertMethods")
        @Validation(required = true)
        public java.util.List<String> alertMethods;

        @NameInMap("AlertTargets")
        @Validation(required = true)
        public java.util.List<String> alertTargets;

        public static GetRemindResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetRemindResponseData self = new GetRemindResponseData();
            return TeaModel.build(map, self);
        }

    }

}
