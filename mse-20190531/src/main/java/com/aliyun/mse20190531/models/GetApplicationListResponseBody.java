// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetApplicationListResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetApplicationListResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetApplicationListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationListResponseBody self = new GetApplicationListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApplicationListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetApplicationListResponseBody setData(GetApplicationListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetApplicationListResponseBodyData getData() {
        return this.data;
    }

    public GetApplicationListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetApplicationListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetApplicationListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetApplicationListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetApplicationListResponseBodyDataResult extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("ExtraInfo")
        public String extraInfo;

        @NameInMap("InstancesNumber")
        public Integer instancesNumber;

        @NameInMap("Language")
        public String language;

        @NameInMap("LicenseKey")
        public String licenseKey;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Source")
        public String source;

        @NameInMap("Status")
        public Long status;

        @NameInMap("UserId")
        public String userId;

        public static GetApplicationListResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationListResponseBodyDataResult self = new GetApplicationListResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public GetApplicationListResponseBodyDataResult setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetApplicationListResponseBodyDataResult setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetApplicationListResponseBodyDataResult setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

        public GetApplicationListResponseBodyDataResult setInstancesNumber(Integer instancesNumber) {
            this.instancesNumber = instancesNumber;
            return this;
        }
        public Integer getInstancesNumber() {
            return this.instancesNumber;
        }

        public GetApplicationListResponseBodyDataResult setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public GetApplicationListResponseBodyDataResult setLicenseKey(String licenseKey) {
            this.licenseKey = licenseKey;
            return this;
        }
        public String getLicenseKey() {
            return this.licenseKey;
        }

        public GetApplicationListResponseBodyDataResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetApplicationListResponseBodyDataResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetApplicationListResponseBodyDataResult setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public GetApplicationListResponseBodyDataResult setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class GetApplicationListResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Result")
        public java.util.List<GetApplicationListResponseBodyDataResult> result;

        @NameInMap("TotalSize")
        public Integer totalSize;

        public static GetApplicationListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationListResponseBodyData self = new GetApplicationListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetApplicationListResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public GetApplicationListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetApplicationListResponseBodyData setResult(java.util.List<GetApplicationListResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<GetApplicationListResponseBodyDataResult> getResult() {
            return this.result;
        }

        public GetApplicationListResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
