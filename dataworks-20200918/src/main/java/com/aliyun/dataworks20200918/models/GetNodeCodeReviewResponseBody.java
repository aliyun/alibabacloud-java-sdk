// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class GetNodeCodeReviewResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetNodeCodeReviewResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetNodeCodeReviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNodeCodeReviewResponseBody self = new GetNodeCodeReviewResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNodeCodeReviewResponseBody setData(GetNodeCodeReviewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetNodeCodeReviewResponseBodyData getData() {
        return this.data;
    }

    public GetNodeCodeReviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetNodeCodeReviewResponseBodyData extends TeaModel {
        @NameInMap("Executor")
        public String executor;

        @NameInMap("FileId")
        public String fileId;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("FileType")
        public Long fileType;

        @NameInMap("Id")
        public Long id;

        @NameInMap("LastReviewTime")
        public String lastReviewTime;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("RequestDesc")
        public String requestDesc;

        @NameInMap("ReviewedObjectType")
        public String reviewedObjectType;

        @NameInMap("Status")
        public String status;

        @NameInMap("SubmitTime")
        public String submitTime;

        @NameInMap("Submitter")
        public String submitter;

        @NameInMap("Version")
        public Long version;

        public static GetNodeCodeReviewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetNodeCodeReviewResponseBodyData self = new GetNodeCodeReviewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetNodeCodeReviewResponseBodyData setExecutor(String executor) {
            this.executor = executor;
            return this;
        }
        public String getExecutor() {
            return this.executor;
        }

        public GetNodeCodeReviewResponseBodyData setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public GetNodeCodeReviewResponseBodyData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetNodeCodeReviewResponseBodyData setFileType(Long fileType) {
            this.fileType = fileType;
            return this;
        }
        public Long getFileType() {
            return this.fileType;
        }

        public GetNodeCodeReviewResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetNodeCodeReviewResponseBodyData setLastReviewTime(String lastReviewTime) {
            this.lastReviewTime = lastReviewTime;
            return this;
        }
        public String getLastReviewTime() {
            return this.lastReviewTime;
        }

        public GetNodeCodeReviewResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetNodeCodeReviewResponseBodyData setRequestDesc(String requestDesc) {
            this.requestDesc = requestDesc;
            return this;
        }
        public String getRequestDesc() {
            return this.requestDesc;
        }

        public GetNodeCodeReviewResponseBodyData setReviewedObjectType(String reviewedObjectType) {
            this.reviewedObjectType = reviewedObjectType;
            return this;
        }
        public String getReviewedObjectType() {
            return this.reviewedObjectType;
        }

        public GetNodeCodeReviewResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetNodeCodeReviewResponseBodyData setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public GetNodeCodeReviewResponseBodyData setSubmitter(String submitter) {
            this.submitter = submitter;
            return this;
        }
        public String getSubmitter() {
            return this.submitter;
        }

        public GetNodeCodeReviewResponseBodyData setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
