// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class GetRelatedByCreativeIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<GetRelatedByCreativeIdResponseBodyData> data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetRelatedByCreativeIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRelatedByCreativeIdResponseBody self = new GetRelatedByCreativeIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRelatedByCreativeIdResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetRelatedByCreativeIdResponseBody setData(java.util.List<GetRelatedByCreativeIdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetRelatedByCreativeIdResponseBodyData> getData() {
        return this.data;
    }

    public GetRelatedByCreativeIdResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetRelatedByCreativeIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRelatedByCreativeIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetRelatedByCreativeIdResponseBodyData extends TeaModel {
        @NameInMap("ContentId")
        public Long contentId;

        @NameInMap("ContentName")
        public String contentName;

        @NameInMap("TaskId")
        public Long taskId;

        @NameInMap("TaskName")
        public String taskName;

        public static GetRelatedByCreativeIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRelatedByCreativeIdResponseBodyData self = new GetRelatedByCreativeIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRelatedByCreativeIdResponseBodyData setContentId(Long contentId) {
            this.contentId = contentId;
            return this;
        }
        public Long getContentId() {
            return this.contentId;
        }

        public GetRelatedByCreativeIdResponseBodyData setContentName(String contentName) {
            this.contentName = contentName;
            return this;
        }
        public String getContentName() {
            return this.contentName;
        }

        public GetRelatedByCreativeIdResponseBodyData setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public GetRelatedByCreativeIdResponseBodyData setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

}
