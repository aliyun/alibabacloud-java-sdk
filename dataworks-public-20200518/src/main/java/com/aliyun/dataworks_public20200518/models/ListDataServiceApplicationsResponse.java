// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataServiceApplicationsResponse extends TeaModel {
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

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public ListDataServiceApplicationsResponseData data;

    public static ListDataServiceApplicationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceApplicationsResponse self = new ListDataServiceApplicationsResponse();
        return TeaModel.build(map, self);
    }

    public static class ListDataServiceApplicationsResponseDataApplications extends TeaModel {
        @NameInMap("ApplicationId")
        @Validation(required = true)
        public Long applicationId;

        @NameInMap("ApplicationName")
        @Validation(required = true)
        public String applicationName;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        public static ListDataServiceApplicationsResponseDataApplications build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApplicationsResponseDataApplications self = new ListDataServiceApplicationsResponseDataApplications();
            return TeaModel.build(map, self);
        }

    }

    public static class ListDataServiceApplicationsResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("Applications")
        @Validation(required = true)
        public java.util.List<ListDataServiceApplicationsResponseDataApplications> applications;

        public static ListDataServiceApplicationsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApplicationsResponseData self = new ListDataServiceApplicationsResponseData();
            return TeaModel.build(map, self);
        }

    }

}
