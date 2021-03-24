// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class ListAppInfosResponseBody extends TeaModel {
    // desc
    @NameInMap("Message")
    public String message;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // httpStatusCode
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // code
    @NameInMap("Code")
    public String code;

    // success
    @NameInMap("Success")
    public Boolean success;

    // result
    @NameInMap("Result")
    public ListAppInfosResponseBodyResult result;

    public static ListAppInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppInfosResponseBody self = new ListAppInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppInfosResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAppInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppInfosResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAppInfosResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAppInfosResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListAppInfosResponseBody setResult(ListAppInfosResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListAppInfosResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListAppInfosResponseBodyResultAppInfos extends TeaModel {
        // 应用Id
        @NameInMap("AppId")
        public String appId;

        // 应用名
        @NameInMap("AppName")
        public String appName;

        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 应用状态
        @NameInMap("AppStatus")
        public Integer appStatus;

        // 产品版本
        @NameInMap("ProdVersion")
        public String prodVersion;

        public static ListAppInfosResponseBodyResultAppInfos build(java.util.Map<String, ?> map) throws Exception {
            ListAppInfosResponseBodyResultAppInfos self = new ListAppInfosResponseBodyResultAppInfos();
            return TeaModel.build(map, self);
        }

        public ListAppInfosResponseBodyResultAppInfos setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListAppInfosResponseBodyResultAppInfos setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListAppInfosResponseBodyResultAppInfos setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAppInfosResponseBodyResultAppInfos setAppStatus(Integer appStatus) {
            this.appStatus = appStatus;
            return this;
        }
        public Integer getAppStatus() {
            return this.appStatus;
        }

        public ListAppInfosResponseBodyResultAppInfos setProdVersion(String prodVersion) {
            this.prodVersion = prodVersion;
            return this;
        }
        public String getProdVersion() {
            return this.prodVersion;
        }

    }

    public static class ListAppInfosResponseBodyResult extends TeaModel {
        // 总数，用于分页
        @NameInMap("TotalCount")
        public Integer totalCount;

        // 应用信息列表
        @NameInMap("AppInfos")
        public java.util.List<ListAppInfosResponseBodyResultAppInfos> appInfos;

        public static ListAppInfosResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListAppInfosResponseBodyResult self = new ListAppInfosResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListAppInfosResponseBodyResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListAppInfosResponseBodyResult setAppInfos(java.util.List<ListAppInfosResponseBodyResultAppInfos> appInfos) {
            this.appInfos = appInfos;
            return this;
        }
        public java.util.List<ListAppInfosResponseBodyResultAppInfos> getAppInfos() {
            return this.appInfos;
        }

    }

}
