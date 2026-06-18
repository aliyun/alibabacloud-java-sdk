// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListRobotCallDialogResponseBody extends TeaModel {
    /**
     * <p>Request status code. A return value of OK indicates that the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Conversation records.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListRobotCallDialogResponseBodyData> data;

    /**
     * <p>Description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D9CB3933-9FE3-4870-BA8E-2BEE91B69D23</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the API invocation succeeded. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Succeeded.</li>
     * <li><strong>false</strong>: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>Script content.</p>
         * 
         * <strong>example:</strong>
         * <p>我是某某的客服，看您之前在我们家找过工作，做个回访，现在工作怎么样？</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>File Type.</p>
         * 
         * <strong>example:</strong>
         * <p>开场白</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>Role in the conversation content.</p>
         * 
         * <strong>example:</strong>
         * <p>robot</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>Intent label.</p>
         * 
         * <strong>example:</strong>
         * <p>拒绝</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>Start Time. UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1621483557000</p>
         */
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
