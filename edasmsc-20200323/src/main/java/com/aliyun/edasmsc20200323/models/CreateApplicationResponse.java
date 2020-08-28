// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edasmsc20200323.models;

import com.aliyun.tea.*;

public class CreateApplicationResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public String success;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Data")
    @Validation(required = true)
    public CreateApplicationResponseData data;

    public static CreateApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationResponse self = new CreateApplicationResponse();
        return TeaModel.build(map, self);
    }

    public static class CreateApplicationResponseData extends TeaModel {
        @NameInMap("AppName")
        @Validation(required = true)
        public String appName;

        @NameInMap("LicenseKey")
        @Validation(required = true)
        public String licenseKey;

        @NameInMap("AppId")
        @Validation(required = true)
        public String appId;

        @NameInMap("UserId")
        @Validation(required = true)
        public String userId;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("Source")
        @Validation(required = true)
        public String source;

        @NameInMap("Language")
        @Validation(required = true)
        public String language;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public Long updateTime;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("ExtraInfo")
        @Validation(required = true)
        public String extraInfo;

        public static CreateApplicationResponseData build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationResponseData self = new CreateApplicationResponseData();
            return TeaModel.build(map, self);
        }

    }

}
