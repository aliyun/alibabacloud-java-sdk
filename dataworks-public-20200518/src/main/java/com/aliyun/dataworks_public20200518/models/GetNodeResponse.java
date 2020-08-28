// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetNodeResponse extends TeaModel {
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
    public GetNodeResponseData data;

    public static GetNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNodeResponse self = new GetNodeResponse();
        return TeaModel.build(map, self);
    }

    public static class GetNodeResponseData extends TeaModel {
        @NameInMap("NodeId")
        @Validation(required = true)
        public Long nodeId;

        @NameInMap("OwnerId")
        @Validation(required = true)
        public String ownerId;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("ResGroupName")
        @Validation(required = true)
        public String resGroupName;

        @NameInMap("NodeName")
        @Validation(required = true)
        public String nodeName;

        @NameInMap("CronExpress")
        @Validation(required = true)
        public String cronExpress;

        @NameInMap("Repeatability")
        @Validation(required = true)
        public String repeatability;

        @NameInMap("ProgramType")
        @Validation(required = true)
        public String programType;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        @NameInMap("SchedulerType")
        @Validation(required = true)
        public String schedulerType;

        @NameInMap("ParamValues")
        @Validation(required = true)
        public String paramValues;

        public static GetNodeResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetNodeResponseData self = new GetNodeResponseData();
            return TeaModel.build(map, self);
        }

    }

}
