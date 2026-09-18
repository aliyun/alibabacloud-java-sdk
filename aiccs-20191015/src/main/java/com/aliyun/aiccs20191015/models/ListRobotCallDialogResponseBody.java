// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListRobotCallDialogResponseBody extends TeaModel {
    /**
     * <p>The request status code. OK indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The conversation records.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListRobotCallDialogResponseBodyData> data;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D9CB3933-9FE3-4870-BA8E-2BEE91B69D23</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Successful.</li>
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
         * <p>The script content.</p>
         * 
         * <strong>example:</strong>
         * <p>I am a customer service representative from XX. I noticed that you previously looked for a job with us. I am doing a follow-up. How is your work going?</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The node type.</p>
         * 
         * <strong>example:</strong>
         * <p>Opening</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>The role in the conversation.</p>
         * 
         * <strong>example:</strong>
         * <p>robot</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The intent label.</p>
         * 
         * <strong>example:</strong>
         * <p>Rejection</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The start time. The value is a UNIX timestamp. Unit: milliseconds.</p>
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
