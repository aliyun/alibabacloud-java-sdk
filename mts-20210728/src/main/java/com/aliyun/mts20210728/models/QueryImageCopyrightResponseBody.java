// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728.models;

import com.aliyun.tea.*;

public class QueryImageCopyrightResponseBody extends TeaModel {
    // 返回数据
    @NameInMap("Data")
    public java.util.List<QueryImageCopyrightResponseBodyData> data;

    // 返回信息
    @NameInMap("Message")
    public String message;

    // 请求id
    @NameInMap("RequestId")
    public String requestId;

    // 状态码
    @NameInMap("StatusCode")
    public Long statusCode;

    public static QueryImageCopyrightResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryImageCopyrightResponseBody self = new QueryImageCopyrightResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryImageCopyrightResponseBody setData(java.util.List<QueryImageCopyrightResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryImageCopyrightResponseBodyData> getData() {
        return this.data;
    }

    public QueryImageCopyrightResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryImageCopyrightResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryImageCopyrightResponseBody setStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Long getStatusCode() {
        return this.statusCode;
    }

    public static class QueryImageCopyrightResponseBodyData extends TeaModel {
        // 创建时间
        @NameInMap("Gmt_create")
        public Long gmtCreate;

        // 最后修改时间
        @NameInMap("Gmt_modified")
        public Long gmtModified;

        // 水印图片输入oss地址
        @NameInMap("Input")
        public String input;

        // 任务id
        @NameInMap("Job_id")
        public String jobId;

        // 水印强度
        @NameInMap("Level")
        public Long level;

        // 水印信息
        @NameInMap("Message")
        public String message;

        // 水印信息id
        @NameInMap("Message_id")
        public Long messageId;

        // 加完水印后的输出oss地址
        @NameInMap("Output")
        public String output;

        // 任务状态
        @NameInMap("Status")
        public String status;

        // 用户自定义数据
        @NameInMap("User_data")
        public String userData;

        // uid
        @NameInMap("User_id")
        public Long userId;

        public static QueryImageCopyrightResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryImageCopyrightResponseBodyData self = new QueryImageCopyrightResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryImageCopyrightResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryImageCopyrightResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public QueryImageCopyrightResponseBodyData setInput(String input) {
            this.input = input;
            return this;
        }
        public String getInput() {
            return this.input;
        }

        public QueryImageCopyrightResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryImageCopyrightResponseBodyData setLevel(Long level) {
            this.level = level;
            return this;
        }
        public Long getLevel() {
            return this.level;
        }

        public QueryImageCopyrightResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryImageCopyrightResponseBodyData setMessageId(Long messageId) {
            this.messageId = messageId;
            return this;
        }
        public Long getMessageId() {
            return this.messageId;
        }

        public QueryImageCopyrightResponseBodyData setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public QueryImageCopyrightResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryImageCopyrightResponseBodyData setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public QueryImageCopyrightResponseBodyData setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
