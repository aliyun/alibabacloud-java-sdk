// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edasmsc20200323.models;

import com.aliyun.tea.*;

public class GetOutlierApplicationListResponse extends TeaModel {
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
    public java.util.List<GetOutlierApplicationListResponseData> data;

    public static GetOutlierApplicationListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOutlierApplicationListResponse self = new GetOutlierApplicationListResponse();
        return TeaModel.build(map, self);
    }

    public static class GetOutlierApplicationListResponseData extends TeaModel {
        @NameInMap("AdminEdasId")
        @Validation(required = true)
        public String adminEdasId;

        @NameInMap("AppId")
        @Validation(required = true)
        public String appId;

        @NameInMap("AppName")
        @Validation(required = true)
        public String appName;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("Dockerize")
        @Validation(required = true)
        public Boolean dockerize;

        @NameInMap("Owner")
        @Validation(required = true)
        public String owner;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        public static GetOutlierApplicationListResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetOutlierApplicationListResponseData self = new GetOutlierApplicationListResponseData();
            return TeaModel.build(map, self);
        }

    }

}
