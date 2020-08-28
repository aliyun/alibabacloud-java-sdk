// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edasmsc20200323.models;

import com.aliyun.tea.*;

public class GetServiceListPageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("HttpCode")
    @Validation(required = true)
    public String httpCode;

    @NameInMap("Data")
    @Validation(required = true)
    public GetServiceListPageResponseData data;

    public static GetServiceListPageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceListPageResponse self = new GetServiceListPageResponse();
        return TeaModel.build(map, self);
    }

    public static class GetServiceListPageResponseDataResult extends TeaModel {
        @NameInMap("ServiceName")
        @Validation(required = true)
        public String serviceName;

        @NameInMap("Version")
        @Validation(required = true)
        public String version;

        @NameInMap("Group")
        @Validation(required = true)
        public String group;

        @NameInMap("EdasAppId")
        @Validation(required = true)
        public String edasAppId;

        @NameInMap("EdasAppName")
        @Validation(required = true)
        public String edasAppName;

        @NameInMap("InstanceNum")
        @Validation(required = true)
        public Integer instanceNum;

        @NameInMap("GmtModifyTime")
        @Validation(required = true)
        public String gmtModifyTime;

        public static GetServiceListPageResponseDataResult build(java.util.Map<String, ?> map) throws Exception {
            GetServiceListPageResponseDataResult self = new GetServiceListPageResponseDataResult();
            return TeaModel.build(map, self);
        }

    }

    public static class GetServiceListPageResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public String pageNumber;

        @NameInMap("TotalSize")
        @Validation(required = true)
        public String totalSize;

        @NameInMap("PageSize")
        @Validation(required = true)
        public String pageSize;

        @NameInMap("CurrentPage")
        @Validation(required = true)
        public String currentPage;

        @NameInMap("Result")
        @Validation(required = true)
        public java.util.List<GetServiceListPageResponseDataResult> result;

        public static GetServiceListPageResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetServiceListPageResponseData self = new GetServiceListPageResponseData();
            return TeaModel.build(map, self);
        }

    }

}
