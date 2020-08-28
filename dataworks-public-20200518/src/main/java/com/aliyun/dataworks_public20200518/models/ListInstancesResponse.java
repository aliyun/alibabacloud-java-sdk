// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListInstancesResponse extends TeaModel {
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
    public ListInstancesResponseData data;

    public static ListInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesResponse self = new ListInstancesResponse();
        return TeaModel.build(map, self);
    }

    public static class ListInstancesResponseDataInstances extends TeaModel {
        @NameInMap("NodeId")
        @Validation(required = true)
        public Integer nodeId;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public Long instanceId;

        @NameInMap("DagId")
        @Validation(required = true)
        public Integer dagId;

        @NameInMap("DagType")
        @Validation(required = true)
        public String dagType;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Bizdate")
        @Validation(required = true)
        public Long bizdate;

        @NameInMap("CycTime")
        @Validation(required = true)
        public Long cycTime;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("ModifyTime")
        @Validation(required = true)
        public Long modifyTime;

        @NameInMap("NodeName")
        @Validation(required = true)
        public String nodeName;

        @NameInMap("BeginWaitTimeTime")
        @Validation(required = true)
        public Long beginWaitTimeTime;

        @NameInMap("BeginWaitResTime")
        @Validation(required = true)
        public Long beginWaitResTime;

        @NameInMap("BeginRunningTime")
        @Validation(required = true)
        public Long beginRunningTime;

        @NameInMap("ParamValues")
        @Validation(required = true)
        public String paramValues;

        @NameInMap("FinishTime")
        @Validation(required = true)
        public Long finishTime;

        public static ListInstancesResponseDataInstances build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseDataInstances self = new ListInstancesResponseDataInstances();
            return TeaModel.build(map, self);
        }

    }

    public static class ListInstancesResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("Instances")
        @Validation(required = true)
        public java.util.List<ListInstancesResponseDataInstances> instances;

        public static ListInstancesResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseData self = new ListInstancesResponseData();
            return TeaModel.build(map, self);
        }

    }

}
