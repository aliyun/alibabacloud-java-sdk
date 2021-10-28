// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListRobotCallDialogResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListRobotCallDialogResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListRobotCallDialogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRobotCallDialogResponseBody self = new ListRobotCallDialogResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRobotCallDialogResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRobotCallDialogResponseBody setData(java.util.List<ListRobotCallDialogResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListRobotCallDialogResponseBodyData> getData() {
        return this.data;
    }

    public ListRobotCallDialogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRobotCallDialogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRobotCallDialogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListRobotCallDialogResponseBodyData extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("NodeType")
        public String nodeType;

        @NameInMap("Role")
        public String role;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("Time")
        public String time;

        public static ListRobotCallDialogResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListRobotCallDialogResponseBodyData self = new ListRobotCallDialogResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListRobotCallDialogResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListRobotCallDialogResponseBodyData setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public ListRobotCallDialogResponseBodyData setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListRobotCallDialogResponseBodyData setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public ListRobotCallDialogResponseBodyData setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

}
