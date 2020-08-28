// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetBaselineStatusResponse extends TeaModel {
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
    public GetBaselineStatusResponseData data;

    public static GetBaselineStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBaselineStatusResponse self = new GetBaselineStatusResponse();
        return TeaModel.build(map, self);
    }

    public static class GetBaselineStatusResponseDataLastInstance extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public Long instanceId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        @NameInMap("Owner")
        @Validation(required = true)
        public String owner;

        @NameInMap("NodeId")
        @Validation(required = true)
        public Long nodeId;

        @NameInMap("FinishTime")
        @Validation(required = true)
        public Long finishTime;

        @NameInMap("EndCast")
        @Validation(required = true)
        public Long endCast;

        @NameInMap("NodeName")
        @Validation(required = true)
        public String nodeName;

        public static GetBaselineStatusResponseDataLastInstance build(java.util.Map<String, ?> map) throws Exception {
            GetBaselineStatusResponseDataLastInstance self = new GetBaselineStatusResponseDataLastInstance();
            return TeaModel.build(map, self);
        }

    }

    public static class GetBaselineStatusResponseDataBlockInstance extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public Long instanceId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        @NameInMap("Owner")
        @Validation(required = true)
        public String owner;

        @NameInMap("NodeId")
        @Validation(required = true)
        public Long nodeId;

        @NameInMap("FinishTime")
        @Validation(required = true)
        public Long finishTime;

        @NameInMap("EndCast")
        @Validation(required = true)
        public Long endCast;

        @NameInMap("NodeName")
        @Validation(required = true)
        public String nodeName;

        public static GetBaselineStatusResponseDataBlockInstance build(java.util.Map<String, ?> map) throws Exception {
            GetBaselineStatusResponseDataBlockInstance self = new GetBaselineStatusResponseDataBlockInstance();
            return TeaModel.build(map, self);
        }

    }

    public static class GetBaselineStatusResponseData extends TeaModel {
        @NameInMap("BaselineName")
        @Validation(required = true)
        public String baselineName;

        @NameInMap("BaselineId")
        @Validation(required = true)
        public Long baselineId;

        @NameInMap("Bizdate")
        @Validation(required = true)
        public Long bizdate;

        @NameInMap("Owner")
        @Validation(required = true)
        public String owner;

        @NameInMap("ExpTime")
        @Validation(required = true)
        public Long expTime;

        @NameInMap("FinishTime")
        @Validation(required = true)
        public Long finishTime;

        @NameInMap("EndCast")
        @Validation(required = true)
        public Long endCast;

        @NameInMap("SlaTime")
        @Validation(required = true)
        public Long slaTime;

        @NameInMap("Priority")
        @Validation(required = true)
        public Integer priority;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        @NameInMap("Buffer")
        @Validation(required = true)
        public Double buffer;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("FinishStatus")
        @Validation(required = true)
        public String finishStatus;

        @NameInMap("InGroupId")
        @Validation(required = true)
        public Integer inGroupId;

        @NameInMap("LastInstance")
        @Validation(required = true)
        public GetBaselineStatusResponseDataLastInstance lastInstance;

        @NameInMap("BlockInstance")
        @Validation(required = true)
        public GetBaselineStatusResponseDataBlockInstance blockInstance;

        public static GetBaselineStatusResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetBaselineStatusResponseData self = new GetBaselineStatusResponseData();
            return TeaModel.build(map, self);
        }

    }

}
