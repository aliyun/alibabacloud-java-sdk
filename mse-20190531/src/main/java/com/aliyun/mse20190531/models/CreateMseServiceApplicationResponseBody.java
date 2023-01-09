// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateMseServiceApplicationResponseBody extends TeaModel {
    // The status code returned.
    @NameInMap("Code")
    public Integer code;

    // The data structure.
    @NameInMap("Data")
    public CreateMseServiceApplicationResponseBodyData data;

    // The HTTP status code returned.
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // The message returned.
    @NameInMap("Message")
    public String message;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request was successful. Valid values:
    // 
    // *   `true`: The request was successful.
    // *   `false`: The request failed.
    @NameInMap("Success")
    public String success;

    public static CreateMseServiceApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMseServiceApplicationResponseBody self = new CreateMseServiceApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMseServiceApplicationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateMseServiceApplicationResponseBody setData(CreateMseServiceApplicationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateMseServiceApplicationResponseBodyData getData() {
        return this.data;
    }

    public CreateMseServiceApplicationResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateMseServiceApplicationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateMseServiceApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMseServiceApplicationResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class CreateMseServiceApplicationResponseBodyData extends TeaModel {
        // The ID of the application.
        @NameInMap("AppId")
        public String appId;

        // The name of the application.
        @NameInMap("AppName")
        public String appName;

        // The creation time.
        @NameInMap("CreateTime")
        public Long createTime;

        // The additional information.
        @NameInMap("ExtraInfo")
        public String extraInfo;

        // The programming language of the application.
        @NameInMap("Language")
        public String language;

        // The license key in use.
        @NameInMap("LicenseKey")
        public String licenseKey;

        // The region ID.
        @NameInMap("RegionId")
        public String regionId;

        // The source type.
        @NameInMap("Source")
        public String source;

        // The status.
        @NameInMap("Status")
        public Integer status;

        // The last modification time.
        @NameInMap("UpdateTime")
        public Long updateTime;

        // The ID of the user.
        @NameInMap("UserId")
        public String userId;

        // The version information.
        @NameInMap("Version")
        public String version;

        public static CreateMseServiceApplicationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateMseServiceApplicationResponseBodyData self = new CreateMseServiceApplicationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateMseServiceApplicationResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CreateMseServiceApplicationResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public CreateMseServiceApplicationResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public CreateMseServiceApplicationResponseBodyData setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

        public CreateMseServiceApplicationResponseBodyData setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public CreateMseServiceApplicationResponseBodyData setLicenseKey(String licenseKey) {
            this.licenseKey = licenseKey;
            return this;
        }
        public String getLicenseKey() {
            return this.licenseKey;
        }

        public CreateMseServiceApplicationResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateMseServiceApplicationResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public CreateMseServiceApplicationResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public CreateMseServiceApplicationResponseBodyData setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public CreateMseServiceApplicationResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public CreateMseServiceApplicationResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
