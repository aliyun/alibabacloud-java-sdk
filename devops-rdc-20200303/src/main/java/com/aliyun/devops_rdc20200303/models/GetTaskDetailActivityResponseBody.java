// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class GetTaskDetailActivityResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("Object")
    public java.util.List<GetTaskDetailActivityResponseBodyObject> object;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Successful")
    public Boolean successful;

    public static GetTaskDetailActivityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskDetailActivityResponseBody self = new GetTaskDetailActivityResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskDetailActivityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskDetailActivityResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetTaskDetailActivityResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetTaskDetailActivityResponseBody setObject(java.util.List<GetTaskDetailActivityResponseBodyObject> object) {
        this.object = object;
        return this;
    }
    public java.util.List<GetTaskDetailActivityResponseBodyObject> getObject() {
        return this.object;
    }

    public GetTaskDetailActivityResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetTaskDetailActivityResponseBody setSuccessful(Boolean successful) {
        this.successful = successful;
        return this;
    }
    public Boolean getSuccessful() {
        return this.successful;
    }

    public static class GetTaskDetailActivityResponseBodyObject extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("Updated")
        public String updated;

        @NameInMap("Title")
        public String title;

        @NameInMap("Created")
        public String created;

        @NameInMap("Content")
        public java.util.Map<String, ?> content;

        public static GetTaskDetailActivityResponseBodyObject build(java.util.Map<String, ?> map) throws Exception {
            GetTaskDetailActivityResponseBodyObject self = new GetTaskDetailActivityResponseBodyObject();
            return TeaModel.build(map, self);
        }

        public GetTaskDetailActivityResponseBodyObject setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GetTaskDetailActivityResponseBodyObject setUpdated(String updated) {
            this.updated = updated;
            return this;
        }
        public String getUpdated() {
            return this.updated;
        }

        public GetTaskDetailActivityResponseBodyObject setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetTaskDetailActivityResponseBodyObject setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public GetTaskDetailActivityResponseBodyObject setContent(java.util.Map<String, ?> content) {
            this.content = content;
            return this;
        }
        public java.util.Map<String, ?> getContent() {
            return this.content;
        }

    }

}
