// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListNodesResponse extends TeaModel {
    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ListNodesResponseData data;

    public static ListNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNodesResponse self = new ListNodesResponse();
        return TeaModel.build(map, self);
    }

    public static class ListNodesResponseDataNodes extends TeaModel {
        @NameInMap("NodeId")
        @Validation(required = true)
        public Long nodeId;

        @NameInMap("NodeName")
        @Validation(required = true)
        public String nodeName;

        @NameInMap("CronExpress")
        @Validation(required = true)
        public String cronExpress;

        @NameInMap("SchedulerType")
        @Validation(required = true)
        public String schedulerType;

        @NameInMap("ProgramType")
        @Validation(required = true)
        public String programType;

        @NameInMap("OwnerId")
        @Validation(required = true)
        public String ownerId;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        @NameInMap("Repeatability")
        @Validation(required = true)
        public Boolean repeatability;

        @NameInMap("ParamValues")
        @Validation(required = true)
        public String paramValues;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("ResGroupName")
        @Validation(required = true)
        public String resGroupName;

        public static ListNodesResponseDataNodes build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseDataNodes self = new ListNodesResponseDataNodes();
            return TeaModel.build(map, self);
        }

    }

    public static class ListNodesResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("Nodes")
        @Validation(required = true)
        public java.util.List<ListNodesResponseDataNodes> nodes;

        public static ListNodesResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseData self = new ListNodesResponseData();
            return TeaModel.build(map, self);
        }

    }

}
