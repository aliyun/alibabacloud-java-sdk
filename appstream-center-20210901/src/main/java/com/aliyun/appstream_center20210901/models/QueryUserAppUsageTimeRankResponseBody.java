// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class QueryUserAppUsageTimeRankResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of <code>200</code> indicates that the request is processed successfully. Other values indicate that the processing failed.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The ranking list of user application usage duration, sorted in descending order of cumulative usage duration.</p>
     */
    @NameInMap("IndexData")
    public java.util.List<QueryUserAppUsageTimeRankResponseBodyIndexData> indexData;

    /**
     * <p>The description of the request processing result. If the request is successful, <code>success</code> is usually returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique identifier of the request, which can be used to troubleshoot request issues.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryUserAppUsageTimeRankResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryUserAppUsageTimeRankResponseBody self = new QueryUserAppUsageTimeRankResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryUserAppUsageTimeRankResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryUserAppUsageTimeRankResponseBody setIndexData(java.util.List<QueryUserAppUsageTimeRankResponseBodyIndexData> indexData) {
        this.indexData = indexData;
        return this;
    }
    public java.util.List<QueryUserAppUsageTimeRankResponseBodyIndexData> getIndexData() {
        return this.indexData;
    }

    public QueryUserAppUsageTimeRankResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryUserAppUsageTimeRankResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryUserAppUsageTimeRankResponseBodyIndexData extends TeaModel {
        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>app-9ciijz60n4xsv****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>Visual Studio Code</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The cumulative usage duration of the application within the statistical range. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("AppTimeCnt")
        public String appTimeCnt;

        /**
         * <p>The application version. The current version may not return this value, and callers should not rely on this field. A non-empty value indicates the application version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.96.0</p>
         */
        @NameInMap("AppVersion")
        public String appVersion;

        public static QueryUserAppUsageTimeRankResponseBodyIndexData build(java.util.Map<String, ?> map) throws Exception {
            QueryUserAppUsageTimeRankResponseBodyIndexData self = new QueryUserAppUsageTimeRankResponseBodyIndexData();
            return TeaModel.build(map, self);
        }

        public QueryUserAppUsageTimeRankResponseBodyIndexData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QueryUserAppUsageTimeRankResponseBodyIndexData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryUserAppUsageTimeRankResponseBodyIndexData setAppTimeCnt(String appTimeCnt) {
            this.appTimeCnt = appTimeCnt;
            return this;
        }
        public String getAppTimeCnt() {
            return this.appTimeCnt;
        }

        public QueryUserAppUsageTimeRankResponseBodyIndexData setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

    }

}
