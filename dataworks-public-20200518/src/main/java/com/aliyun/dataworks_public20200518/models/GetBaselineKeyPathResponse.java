// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetBaselineKeyPathResponse extends TeaModel {
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
    public java.util.List<GetBaselineKeyPathResponseData> data;

    public static GetBaselineKeyPathResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBaselineKeyPathResponse self = new GetBaselineKeyPathResponse();
        return TeaModel.build(map, self);
    }

    public static class GetBaselineKeyPathResponseDataRuns extends TeaModel {
        @NameInMap("AbsTime")
        @Validation(required = true)
        public Long absTime;

        @NameInMap("BeginCast")
        @Validation(required = true)
        public Long beginCast;

        @NameInMap("BeginRunningTime")
        @Validation(required = true)
        public Long beginRunningTime;

        @NameInMap("BeginWaitResTime")
        @Validation(required = true)
        public Long beginWaitResTime;

        @NameInMap("BeginWaitTimeTime")
        @Validation(required = true)
        public Long beginWaitTimeTime;

        @NameInMap("Bizdate")
        @Validation(required = true)
        public Long bizdate;

        @NameInMap("CycTime")
        @Validation(required = true)
        public Long cycTime;

        @NameInMap("EndCast")
        @Validation(required = true)
        public Long endCast;

        @NameInMap("FinishTime")
        @Validation(required = true)
        public Long finishTime;

        @NameInMap("InGroupId")
        @Validation(required = true)
        public Integer inGroupId;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public Long instanceId;

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

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static GetBaselineKeyPathResponseDataRuns build(java.util.Map<String, ?> map) throws Exception {
            GetBaselineKeyPathResponseDataRuns self = new GetBaselineKeyPathResponseDataRuns();
            return TeaModel.build(map, self);
        }

    }

    public static class GetBaselineKeyPathResponseDataTopics extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public Long instanceId;

        @NameInMap("TopicId")
        @Validation(required = true)
        public Long topicId;

        @NameInMap("TopicName")
        @Validation(required = true)
        public Long topicName;

        @NameInMap("AddTime")
        @Validation(required = true)
        public Long addTime;

        public static GetBaselineKeyPathResponseDataTopics build(java.util.Map<String, ?> map) throws Exception {
            GetBaselineKeyPathResponseDataTopics self = new GetBaselineKeyPathResponseDataTopics();
            return TeaModel.build(map, self);
        }

    }

    public static class GetBaselineKeyPathResponseData extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public Long instanceId;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        @NameInMap("NodeId")
        @Validation(required = true)
        public Long nodeId;

        @NameInMap("NodeName")
        @Validation(required = true)
        public String nodeName;

        @NameInMap("Bizdate")
        @Validation(required = true)
        public Long bizdate;

        @NameInMap("InGroupId")
        @Validation(required = true)
        public Integer inGroupId;

        @NameInMap("Owner")
        @Validation(required = true)
        public String owner;

        @NameInMap("PrgType")
        @Validation(required = true)
        public Integer prgType;

        @NameInMap("Runs")
        @Validation(required = true)
        public java.util.List<GetBaselineKeyPathResponseDataRuns> runs;

        @NameInMap("Topics")
        @Validation(required = true)
        public java.util.List<GetBaselineKeyPathResponseDataTopics> topics;

        public static GetBaselineKeyPathResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetBaselineKeyPathResponseData self = new GetBaselineKeyPathResponseData();
            return TeaModel.build(map, self);
        }

    }

}
