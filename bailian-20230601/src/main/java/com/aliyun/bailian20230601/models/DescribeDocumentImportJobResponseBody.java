// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class DescribeDocumentImportJobResponseBody extends TeaModel {
    @NameInMap("Docs")
    public java.util.List<DescribeDocumentImportJobResponseBodyDocs> docs;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static DescribeDocumentImportJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDocumentImportJobResponseBody self = new DescribeDocumentImportJobResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDocumentImportJobResponseBody setDocs(java.util.List<DescribeDocumentImportJobResponseBodyDocs> docs) {
        this.docs = docs;
        return this;
    }
    public java.util.List<DescribeDocumentImportJobResponseBodyDocs> getDocs() {
        return this.docs;
    }

    public DescribeDocumentImportJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public DescribeDocumentImportJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDocumentImportJobResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class DescribeDocumentImportJobResponseBodyDocs extends TeaModel {
        @NameInMap("DocId")
        public String docId;

        @NameInMap("FailReason")
        public String failReason;

        @NameInMap("Name")
        public String name;

        @NameInMap("Status")
        public String status;

        public static DescribeDocumentImportJobResponseBodyDocs build(java.util.Map<String, ?> map) throws Exception {
            DescribeDocumentImportJobResponseBodyDocs self = new DescribeDocumentImportJobResponseBodyDocs();
            return TeaModel.build(map, self);
        }

        public DescribeDocumentImportJobResponseBodyDocs setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public DescribeDocumentImportJobResponseBodyDocs setFailReason(String failReason) {
            this.failReason = failReason;
            return this;
        }
        public String getFailReason() {
            return this.failReason;
        }

        public DescribeDocumentImportJobResponseBodyDocs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDocumentImportJobResponseBodyDocs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
