// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListBaselineStatusesResponse extends TeaModel {
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
    public ListBaselineStatusesResponseData data;

    public static ListBaselineStatusesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBaselineStatusesResponse self = new ListBaselineStatusesResponse();
        return TeaModel.build(map, self);
    }

    public static class ListBaselineStatusesResponseDataBaselineStatuses extends TeaModel {
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
        public Long buffer;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("FinishStatus")
        @Validation(required = true)
        public String finishStatus;

        @NameInMap("InGroupId")
        @Validation(required = true)
        public Integer inGroupId;

        public static ListBaselineStatusesResponseDataBaselineStatuses build(java.util.Map<String, ?> map) throws Exception {
            ListBaselineStatusesResponseDataBaselineStatuses self = new ListBaselineStatusesResponseDataBaselineStatuses();
            return TeaModel.build(map, self);
        }

    }

    public static class ListBaselineStatusesResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("BaselineStatuses")
        @Validation(required = true)
        public java.util.List<ListBaselineStatusesResponseDataBaselineStatuses> baselineStatuses;

        public static ListBaselineStatusesResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListBaselineStatusesResponseData self = new ListBaselineStatusesResponseData();
            return TeaModel.build(map, self);
        }

    }

}
