// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class GetIndexJobStatusResponseBody extends TeaModel {
    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>Index.Forbidden</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetIndexJobStatusResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>User not authorized to operate on the specified resource.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>17204B98-xxxx-4F9A-8464-2446A84821CA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indications whether the API call is successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetIndexJobStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIndexJobStatusResponseBody self = new GetIndexJobStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIndexJobStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetIndexJobStatusResponseBody setData(GetIndexJobStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetIndexJobStatusResponseBodyData getData() {
        return this.data;
    }

    public GetIndexJobStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetIndexJobStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetIndexJobStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetIndexJobStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetIndexJobStatusResponseBodyDataDocuments extends TeaModel {
        /**
         * <p>HTTP status code</p>
         * 
         * <strong>example:</strong>
         * <p>Index.Document.ChunkError</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The primary key ID of the document.</p>
         * 
         * <strong>example:</strong>
         * <p>file_9a65732555b54d5ea10796ca5742ba22_XXXXXXXX</p>
         */
        @NameInMap("DocId")
        public String docId;

        /**
         * <p>The name of the document.</p>
         */
        @NameInMap("DocName")
        public String docName;

        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>document parse error</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The import status of the document. Valid values:</p>
         * <ul>
         * <li>INSERT_ERROR</li>
         * <li>RUNNING</li>
         * <li>DELETED</li>
         * <li>FINISH</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetIndexJobStatusResponseBodyDataDocuments build(java.util.Map<String, ?> map) throws Exception {
            GetIndexJobStatusResponseBodyDataDocuments self = new GetIndexJobStatusResponseBodyDataDocuments();
            return TeaModel.build(map, self);
        }

        public GetIndexJobStatusResponseBodyDataDocuments setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetIndexJobStatusResponseBodyDataDocuments setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public GetIndexJobStatusResponseBodyDataDocuments setDocName(String docName) {
            this.docName = docName;
            return this;
        }
        public String getDocName() {
            return this.docName;
        }

        public GetIndexJobStatusResponseBodyDataDocuments setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public GetIndexJobStatusResponseBodyDataDocuments setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetIndexJobStatusResponseBodyDataDocuments setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetIndexJobStatusResponseBodyData extends TeaModel {
        /**
         * <p>The list of imported documents.</p>
         */
        @NameInMap("Documents")
        public java.util.List<GetIndexJobStatusResponseBodyDataDocuments> documents;

        /**
         * <p>The ID of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>66122af12a4e45ddae6bd6c845556647</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The status of the knowledge base job. Valid values:</p>
         * <ul>
         * <li>COMPLETED</li>
         * <li>FAILED</li>
         * <li>RUNNING</li>
         * <li>PENDING</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PENDING</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetIndexJobStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetIndexJobStatusResponseBodyData self = new GetIndexJobStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetIndexJobStatusResponseBodyData setDocuments(java.util.List<GetIndexJobStatusResponseBodyDataDocuments> documents) {
            this.documents = documents;
            return this;
        }
        public java.util.List<GetIndexJobStatusResponseBodyDataDocuments> getDocuments() {
            return this.documents;
        }

        public GetIndexJobStatusResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetIndexJobStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
