// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ForkKnowledgeFileResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ForkKnowledgeFileResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ForkKnowledgeFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ForkKnowledgeFileResponseBody self = new ForkKnowledgeFileResponseBody();
        return TeaModel.build(map, self);
    }

    public ForkKnowledgeFileResponseBody setData(ForkKnowledgeFileResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ForkKnowledgeFileResponseBodyData getData() {
        return this.data;
    }

    public ForkKnowledgeFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ForkKnowledgeFileResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the newly created reference record, represented as a decimal string. Use this ID for subsequent management of the record. This parameter is returned only when the operation is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>456</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <p>The address of the new reference record, in the format of fork://<source file ID>/<new file ID>. This parameter is returned only when the operation is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>fork://123/456</p>
         */
        @NameInMap("FileLocation")
        public String fileLocation;

        /**
         * <p>The description of the operation result. If the business operation fails, this parameter indicates the cause or the security error code.</p>
         * 
         * <strong>example:</strong>
         * <p>Fork succeeded</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The ID of the content host file, represented as a decimal string. Currently, this value is the same as the source file ID. This parameter is returned only when the operation is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("OwnerFileId")
        public String ownerFileId;

        /**
         * <p>The status of the new reference record. The value is fixed to DUPLICATED. This parameter is returned only when the operation is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>DUPLICATED</p>
         */
        @NameInMap("ProcessStatus")
        public String processStatus;

        /**
         * <p>The ID of the source file, represented as a decimal string. This parameter is returned only when the operation is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("SourceFileId")
        public String sourceFileId;

        /**
         * <p>Indicates whether the business operation is successful. If the operation fails, the Data parameter contains only Success and Message.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static ForkKnowledgeFileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ForkKnowledgeFileResponseBodyData self = new ForkKnowledgeFileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ForkKnowledgeFileResponseBodyData setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public ForkKnowledgeFileResponseBodyData setFileLocation(String fileLocation) {
            this.fileLocation = fileLocation;
            return this;
        }
        public String getFileLocation() {
            return this.fileLocation;
        }

        public ForkKnowledgeFileResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ForkKnowledgeFileResponseBodyData setOwnerFileId(String ownerFileId) {
            this.ownerFileId = ownerFileId;
            return this;
        }
        public String getOwnerFileId() {
            return this.ownerFileId;
        }

        public ForkKnowledgeFileResponseBodyData setProcessStatus(String processStatus) {
            this.processStatus = processStatus;
            return this;
        }
        public String getProcessStatus() {
            return this.processStatus;
        }

        public ForkKnowledgeFileResponseBodyData setSourceFileId(String sourceFileId) {
            this.sourceFileId = sourceFileId;
            return this;
        }
        public String getSourceFileId() {
            return this.sourceFileId;
        }

        public ForkKnowledgeFileResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
