// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDISyncTaskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public GetDISyncTaskResponseData data;

    public static GetDISyncTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDISyncTaskResponse self = new GetDISyncTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetDISyncTaskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDISyncTaskResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDISyncTaskResponse setData(GetDISyncTaskResponseData data) {
        this.data = data;
        return this;
    }
    public GetDISyncTaskResponseData getData() {
        return this.data;
    }

    public static class GetDISyncTaskResponseDataSolutionDetail extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("ProcessContent")
        @Validation(required = true)
        public String processContent;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("CreatorName")
        @Validation(required = true)
        public String creatorName;

        @NameInMap("SourceType")
        @Validation(required = true)
        public String sourceType;

        @NameInMap("SubmitTime")
        @Validation(required = true)
        public String submitTime;

        @NameInMap("ProcessExtra")
        @Validation(required = true)
        public String processExtra;

        public static GetDISyncTaskResponseDataSolutionDetail build(java.util.Map<String, ?> map) throws Exception {
            GetDISyncTaskResponseDataSolutionDetail self = new GetDISyncTaskResponseDataSolutionDetail();
            return TeaModel.build(map, self);
        }

        public GetDISyncTaskResponseDataSolutionDetail setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDISyncTaskResponseDataSolutionDetail setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetDISyncTaskResponseDataSolutionDetail setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetDISyncTaskResponseDataSolutionDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDISyncTaskResponseDataSolutionDetail setProcessContent(String processContent) {
            this.processContent = processContent;
            return this;
        }
        public String getProcessContent() {
            return this.processContent;
        }

        public GetDISyncTaskResponseDataSolutionDetail setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetDISyncTaskResponseDataSolutionDetail setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDISyncTaskResponseDataSolutionDetail setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public GetDISyncTaskResponseDataSolutionDetail setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public GetDISyncTaskResponseDataSolutionDetail setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public GetDISyncTaskResponseDataSolutionDetail setProcessExtra(String processExtra) {
            this.processExtra = processExtra;
            return this;
        }
        public String getProcessExtra() {
            return this.processExtra;
        }

    }

    public static class GetDISyncTaskResponseData extends TeaModel {
        @NameInMap("Code")
        @Validation(required = true)
        public String code;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        @NameInMap("SolutionDetail")
        @Validation(required = true)
        public GetDISyncTaskResponseDataSolutionDetail solutionDetail;

        public static GetDISyncTaskResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetDISyncTaskResponseData self = new GetDISyncTaskResponseData();
            return TeaModel.build(map, self);
        }

        public GetDISyncTaskResponseData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetDISyncTaskResponseData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDISyncTaskResponseData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetDISyncTaskResponseData setSolutionDetail(GetDISyncTaskResponseDataSolutionDetail solutionDetail) {
            this.solutionDetail = solutionDetail;
            return this;
        }
        public GetDISyncTaskResponseDataSolutionDetail getSolutionDetail() {
            return this.solutionDetail;
        }

    }

}
