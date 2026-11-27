// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListDialogResponseBody extends TeaModel {
    /**
     * <p>The request status code. A value of OK indicates that the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The call interaction content.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListDialogResponseBodyData> data;

    /**
     * <p>The status code description.</p>
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
     * <p>Indicates whether the operation was called successfully. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListDialogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDialogResponseBody self = new ListDialogResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDialogResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDialogResponseBody setData(java.util.List<ListDialogResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDialogResponseBodyData> getData() {
        return this.data;
    }

    public ListDialogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDialogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDialogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDialogResponseBodyData extends TeaModel {
        /**
         * <p>The script content.</p>
         * 
         * <strong>example:</strong>
         * <p>Hello</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The node type.</p>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>The role of the speaker. Valid values:</p>
         * <ul>
         * <li><p>robot: The speaker is a robot.</p>
         * </li>
         * <li><p>user: The speaker is a user.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>robot</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The intent tag.</p>
         * 
         * <strong>example:</strong>
         * <p>Affirmative</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The start time. The value is a timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1619763900718</p>
         */
        @NameInMap("Time")
        public String time;

        public static ListDialogResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDialogResponseBodyData self = new ListDialogResponseBodyData();
            return TeaModel.build(map, self);
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

        public ListDialogResponseBodyData setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListDialogResponseBodyData setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public ListDialogResponseBodyData setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

}
