// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListDialogResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<ListDialogResponseBodyData> data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Success")
    public Boolean success;

    public static ListDialogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDialogResponseBody self = new ListDialogResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDialogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDialogResponseBody setData(java.util.List<ListDialogResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDialogResponseBodyData> getData() {
        return this.data;
    }

    public ListDialogResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDialogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDialogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDialogResponseBodyData extends TeaModel {
        @NameInMap("Role")
        public String role;

        @NameInMap("Content")
        public String content;

        @NameInMap("NodeType")
        public String nodeType;

        @NameInMap("Time")
        public String time;

        @NameInMap("Tag")
        public String tag;

        public static ListDialogResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDialogResponseBodyData self = new ListDialogResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDialogResponseBodyData setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListDialogResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListDialogResponseBodyData setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public ListDialogResponseBodyData setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public ListDialogResponseBodyData setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

}
