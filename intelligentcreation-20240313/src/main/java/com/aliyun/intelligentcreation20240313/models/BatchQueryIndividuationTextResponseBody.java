// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class BatchQueryIndividuationTextResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>14878724-A835-578D-9DD5-4779ADCE9221</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("textList")
    public java.util.List<BatchQueryIndividuationTextResponseBodyTextList> textList;

    public static BatchQueryIndividuationTextResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchQueryIndividuationTextResponseBody self = new BatchQueryIndividuationTextResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchQueryIndividuationTextResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchQueryIndividuationTextResponseBody setTextList(java.util.List<BatchQueryIndividuationTextResponseBodyTextList> textList) {
        this.textList = textList;
        return this;
    }
    public java.util.List<BatchQueryIndividuationTextResponseBodyTextList> getTextList() {
        return this.textList;
    }

    public static class BatchQueryIndividuationTextResponseBodyTextList extends TeaModel {
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>yyyy-MM-dd HH:mm:ss</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("errorMsg")
        public String errorMsg;

        /**
         * <strong>example:</strong>
         * <p>2849286</p>
         */
        @NameInMap("itemId")
        public String itemId;

        /**
         * <strong>example:</strong>
         * <p>812884915104530432</p>
         */
        @NameInMap("projectId")
        public String projectId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>837074737851613184</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>110825</p>
         */
        @NameInMap("textId")
        public String textId;

        /**
         * <strong>example:</strong>
         * <p>yyyy-MM-dd HH:mm:ss</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("userId")
        public String userId;

        public static BatchQueryIndividuationTextResponseBodyTextList build(java.util.Map<String, ?> map) throws Exception {
            BatchQueryIndividuationTextResponseBodyTextList self = new BatchQueryIndividuationTextResponseBodyTextList();
            return TeaModel.build(map, self);
        }

        public BatchQueryIndividuationTextResponseBodyTextList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public BatchQueryIndividuationTextResponseBodyTextList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public BatchQueryIndividuationTextResponseBodyTextList setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public BatchQueryIndividuationTextResponseBodyTextList setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public BatchQueryIndividuationTextResponseBodyTextList setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public BatchQueryIndividuationTextResponseBodyTextList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public BatchQueryIndividuationTextResponseBodyTextList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public BatchQueryIndividuationTextResponseBodyTextList setTextId(String textId) {
            this.textId = textId;
            return this;
        }
        public String getTextId() {
            return this.textId;
        }

        public BatchQueryIndividuationTextResponseBodyTextList setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public BatchQueryIndividuationTextResponseBodyTextList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
