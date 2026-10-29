// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class TriggerKnowledgeFileParseResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public TriggerKnowledgeFileParseResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static TriggerKnowledgeFileParseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TriggerKnowledgeFileParseResponseBody self = new TriggerKnowledgeFileParseResponseBody();
        return TeaModel.build(map, self);
    }

    public TriggerKnowledgeFileParseResponseBody setData(TriggerKnowledgeFileParseResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TriggerKnowledgeFileParseResponseBodyData getData() {
        return this.data;
    }

    public TriggerKnowledgeFileParseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class TriggerKnowledgeFileParseResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the file submitted for reparsing, which is a decimal string. This parameter is returned only when the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <p>The description of the operation result. If the operation fails, this parameter indicates the cause or the security error code.</p>
         * 
         * <strong>example:</strong>
         * <p>Reparse task submitted</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The status before submission. Valid values: PENDING, COMPLETED, FAILED, SKIPPED, and DUPLICATED. This parameter is returned only when the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>COMPLETED</p>
         */
        @NameInMap("PreviousStatus")
        public String previousStatus;

        /**
         * <p>The status after submission. The value is fixed to PENDING. This parameter is returned only when the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>PENDING</p>
         */
        @NameInMap("ProcessStatus")
        public String processStatus;

        /**
         * <p>Indicates whether the operation is successful. If the operation fails, the Data parameter contains only the Success and Message parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static TriggerKnowledgeFileParseResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TriggerKnowledgeFileParseResponseBodyData self = new TriggerKnowledgeFileParseResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TriggerKnowledgeFileParseResponseBodyData setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public TriggerKnowledgeFileParseResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public TriggerKnowledgeFileParseResponseBodyData setPreviousStatus(String previousStatus) {
            this.previousStatus = previousStatus;
            return this;
        }
        public String getPreviousStatus() {
            return this.previousStatus;
        }

        public TriggerKnowledgeFileParseResponseBodyData setProcessStatus(String processStatus) {
            this.processStatus = processStatus;
            return this;
        }
        public String getProcessStatus() {
            return this.processStatus;
        }

        public TriggerKnowledgeFileParseResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
