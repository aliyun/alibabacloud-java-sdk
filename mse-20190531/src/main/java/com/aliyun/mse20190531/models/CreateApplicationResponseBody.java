// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateApplicationResponseBody extends TeaModel {
    // The response code returned.
    @NameInMap("Code")
    public Integer code;

    // The data of the node.
    @NameInMap("Data")
    public CreateApplicationResponseBodyData data;

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

    public static CreateApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationResponseBody self = new CreateApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateApplicationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateApplicationResponseBody setData(CreateApplicationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateApplicationResponseBodyData getData() {
        return this.data;
    }

    public CreateApplicationResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateApplicationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateApplicationResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class CreateApplicationResponseBodyData extends TeaModel {
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

        // The service where the application is deployed. Valid values:
        // 
        // *   \- ACK: Container Service for Kubernetes
        // *   \- Normal: another service
        @NameInMap("Source")
        public String source;

        // The status of the application. A value of 1 indicates that the application is in a normal state.
        @NameInMap("Status")
        public Integer status;

        // The update time.
        @NameInMap("UpdateTime")
        public Long updateTime;

        // The ID of the Alibaba Cloud account.
        @NameInMap("UserId")
        public String userId;

        public static CreateApplicationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationResponseBodyData self = new CreateApplicationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateApplicationResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CreateApplicationResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public CreateApplicationResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public CreateApplicationResponseBodyData setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

        public CreateApplicationResponseBodyData setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public CreateApplicationResponseBodyData setLicenseKey(String licenseKey) {
            this.licenseKey = licenseKey;
            return this;
        }
        public String getLicenseKey() {
            return this.licenseKey;
        }

        public CreateApplicationResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateApplicationResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public CreateApplicationResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public CreateApplicationResponseBodyData setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public CreateApplicationResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
