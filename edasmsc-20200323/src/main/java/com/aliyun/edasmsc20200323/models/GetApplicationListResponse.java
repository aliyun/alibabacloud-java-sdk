// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edasmsc20200323.models;

import com.aliyun.tea.*;

public class GetApplicationListResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("HttpCode")
    @Validation(required = true)
    public String httpCode;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public GetApplicationListResponseData data;

    public static GetApplicationListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationListResponse self = new GetApplicationListResponse();
        return TeaModel.build(map, self);
    }

    public static class GetApplicationListResponseDataResult extends TeaModel {
        @NameInMap("AppId")
        @Validation(required = true)
        public String appId;

        @NameInMap("AppName")
        @Validation(required = true)
        public String appName;

        @NameInMap("LicenseKey")
        @Validation(required = true)
        public String licenseKey;

        @NameInMap("Source")
        @Validation(required = true)
        public String source;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("UserId")
        @Validation(required = true)
        public String userId;

        @NameInMap("ExtraInfo")
        @Validation(required = true)
        public String extraInfo;

        @NameInMap("InstancesNumber")
        @Validation(required = true)
        public Integer instancesNumber;

        public static GetApplicationListResponseDataResult build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationListResponseDataResult self = new GetApplicationListResponseDataResult();
            return TeaModel.build(map, self);
        }

    }

    public static class GetApplicationListResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalSize")
        @Validation(required = true)
        public Integer totalSize;

        @NameInMap("Result")
        @Validation(required = true)
        public java.util.List<GetApplicationListResponseDataResult> result;

        public static GetApplicationListResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationListResponseData self = new GetApplicationListResponseData();
            return TeaModel.build(map, self);
        }

    }

}
