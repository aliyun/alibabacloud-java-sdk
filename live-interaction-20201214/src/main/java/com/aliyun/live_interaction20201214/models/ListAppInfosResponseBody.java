// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class ListAppInfosResponseBody extends TeaModel {
    /**
     * <p>code</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>httpStatusCode</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>desc</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>requestId</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>result</p>
     */
    @NameInMap("Result")
    public ListAppInfosResponseBodyResult result;

    /**
     * <p>success</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListAppInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppInfosResponseBody self = new ListAppInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppInfosResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAppInfosResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    public ListAppInfosResponseBody setResult(ListAppInfosResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListAppInfosResponseBodyResult getResult() {
        return this.result;
    }

    public ListAppInfosResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAppInfosResponseBodyResultAppInfos extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppStatus")
        public Integer appStatus;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("InstanceId")
        public String instanceId;

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

        public ListAppInfosResponseBodyResultAppInfos setAppStatus(Integer appStatus) {
            this.appStatus = appStatus;
            return this;
        }
        public Integer getAppStatus() {
            return this.appStatus;
        }

        public ListAppInfosResponseBodyResultAppInfos setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAppInfosResponseBodyResultAppInfos setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
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
        @NameInMap("AppInfos")
        public java.util.List<ListAppInfosResponseBodyResultAppInfos> appInfos;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListAppInfosResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListAppInfosResponseBodyResult self = new ListAppInfosResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListAppInfosResponseBodyResult setAppInfos(java.util.List<ListAppInfosResponseBodyResultAppInfos> appInfos) {
            this.appInfos = appInfos;
            return this;
        }
        public java.util.List<ListAppInfosResponseBodyResultAppInfos> getAppInfos() {
            return this.appInfos;
        }

        public ListAppInfosResponseBodyResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
