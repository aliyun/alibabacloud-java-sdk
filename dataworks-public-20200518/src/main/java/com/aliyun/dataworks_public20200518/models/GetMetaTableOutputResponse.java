// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableOutputResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public GetMetaTableOutputResponseData data;

    public static GetMetaTableOutputResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableOutputResponse self = new GetMetaTableOutputResponse();
        return TeaModel.build(map, self);
    }

    public static class GetMetaTableOutputResponseDataDataEntityList extends TeaModel {
        @NameInMap("TableGuid")
        @Validation(required = true)
        public String tableGuid;

        @NameInMap("TaskId")
        @Validation(required = true)
        public String taskId;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public String endTime;

        @NameInMap("WaitTime")
        @Validation(required = true)
        public String waitTime;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        @NameInMap("TaskInstanceId")
        @Validation(required = true)
        public Long taskInstanceId;

        public static GetMetaTableOutputResponseDataDataEntityList build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableOutputResponseDataDataEntityList self = new GetMetaTableOutputResponseDataDataEntityList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMetaTableOutputResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Long totalCount;

        @NameInMap("DataEntityList")
        @Validation(required = true)
        public java.util.List<GetMetaTableOutputResponseDataDataEntityList> dataEntityList;

        public static GetMetaTableOutputResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableOutputResponseData self = new GetMetaTableOutputResponseData();
            return TeaModel.build(map, self);
        }

    }

}
