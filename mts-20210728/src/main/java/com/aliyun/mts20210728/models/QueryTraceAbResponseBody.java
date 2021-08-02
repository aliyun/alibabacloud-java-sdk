// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728.models;

import com.aliyun.tea.*;

public class QueryTraceAbResponseBody extends TeaModel {
    // 返回结构
    @NameInMap("Data")
    public java.util.List<QueryTraceAbResponseBodyData> data;

    // 返回信息
    @NameInMap("Message")
    public String message;

    // 请求id
    @NameInMap("RequestId")
    public String requestId;

    // 状态码
    @NameInMap("StatusCode")
    public Long statusCode;

    public static QueryTraceAbResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTraceAbResponseBody self = new QueryTraceAbResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTraceAbResponseBody setData(java.util.List<QueryTraceAbResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryTraceAbResponseBodyData> getData() {
        return this.data;
    }

    public QueryTraceAbResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryTraceAbResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTraceAbResponseBody setStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Long getStatusCode() {
        return this.statusCode;
    }

    public static class QueryTraceAbResponseBodyData extends TeaModel {
        // 任务结果回调
        @NameInMap("Callback")
        public String callback;

        // 创建时间
        @NameInMap("Gmt_create")
        public Long gmtCreate;

        // 最后修改时间
        @NameInMap("Gmt_modified")
        public Long gmtModified;

        // 输入oss地址
        @NameInMap("Input")
        public String input;

        // 任务id
        @NameInMap("Job_id")
        public String jobId;

        // 水印强度
        @NameInMap("Level")
        public Long level;

        // 媒体id
        @NameInMap("Media_id")
        public String mediaId;

        // 输出地址
        @NameInMap("Output")
        public String output;

        // 任务状态
        @NameInMap("Status")
        public String status;

        // 用户数据
        @NameInMap("User_data")
        public String userData;

        // uid
        @NameInMap("User_id")
        public Long userId;

        public static QueryTraceAbResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTraceAbResponseBodyData self = new QueryTraceAbResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTraceAbResponseBodyData setCallback(String callback) {
            this.callback = callback;
            return this;
        }
        public String getCallback() {
            return this.callback;
        }

        public QueryTraceAbResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryTraceAbResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public QueryTraceAbResponseBodyData setInput(String input) {
            this.input = input;
            return this;
        }
        public String getInput() {
            return this.input;
        }

        public QueryTraceAbResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryTraceAbResponseBodyData setLevel(Long level) {
            this.level = level;
            return this;
        }
        public Long getLevel() {
            return this.level;
        }

        public QueryTraceAbResponseBodyData setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public QueryTraceAbResponseBodyData setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public QueryTraceAbResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryTraceAbResponseBodyData setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public QueryTraceAbResponseBodyData setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
