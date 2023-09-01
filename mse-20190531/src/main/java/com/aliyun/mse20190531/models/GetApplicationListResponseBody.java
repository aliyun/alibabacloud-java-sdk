// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetApplicationListResponseBody extends TeaModel {
    /**
     * <p>The data structure.</p>
     */
    @NameInMap("Data")
    public GetApplicationListResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   `true`: The request was successful.</p>
     * <p>*   `false`: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetApplicationListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationListResponseBody self = new GetApplicationListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApplicationListResponseBody setData(GetApplicationListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetApplicationListResponseBodyData getData() {
        return this.data;
    }

    public GetApplicationListResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
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
        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The additional information.</p>
         */
        @NameInMap("ExtraInfo")
        public String extraInfo;

        /**
         * <p>The number of instances.</p>
         */
        @NameInMap("InstancesNumber")
        public Integer instancesNumber;

        /**
         * <p>The programming language of the application.</p>
         */
        @NameInMap("Language")
        public String language;

        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The region ID of the instance.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The source of the application.</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The status.</p>
         */
        @NameInMap("Status")
        public Long status;

        @NameInMap("TagCount")
        public Long tagCount;

        /**
         * <p>The ID of the user.</p>
         */
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

        public GetApplicationListResponseBodyDataResult setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
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

        public GetApplicationListResponseBodyDataResult setTagCount(Long tagCount) {
            this.tagCount = tagCount;
            return this;
        }
        public Long getTagCount() {
            return this.tagCount;
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
        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The returned information.</p>
         */
        @NameInMap("Result")
        public java.util.List<GetApplicationListResponseBodyDataResult> result;

        /**
         * <p>The total number of entries returned.</p>
         */
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
