// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDISyncTaskResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetDISyncTaskResponseBodyData data;

    public static GetDISyncTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDISyncTaskResponseBody self = new GetDISyncTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDISyncTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDISyncTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDISyncTaskResponseBody setData(GetDISyncTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDISyncTaskResponseBodyData getData() {
        return this.data;
    }

    public static class GetDISyncTaskResponseBodyDataSolutionDetail extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("CreatorName")
        public String creatorName;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("ProcessContent")
        public String processContent;

        @NameInMap("Name")
        public String name;

        @NameInMap("ProcessExtra")
        public String processExtra;

        @NameInMap("SubmitTime")
        public String submitTime;

        @NameInMap("Id")
        public Long id;

        public static GetDISyncTaskResponseBodyDataSolutionDetail build(java.util.Map<String, ?> map) throws Exception {
            GetDISyncTaskResponseBodyDataSolutionDetail self = new GetDISyncTaskResponseBodyDataSolutionDetail();
            return TeaModel.build(map, self);
        }

        public GetDISyncTaskResponseBodyDataSolutionDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDISyncTaskResponseBodyDataSolutionDetail setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetDISyncTaskResponseBodyDataSolutionDetail setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetDISyncTaskResponseBodyDataSolutionDetail setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public GetDISyncTaskResponseBodyDataSolutionDetail setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetDISyncTaskResponseBodyDataSolutionDetail setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public GetDISyncTaskResponseBodyDataSolutionDetail setProcessContent(String processContent) {
            this.processContent = processContent;
            return this;
        }
        public String getProcessContent() {
            return this.processContent;
        }

        public GetDISyncTaskResponseBodyDataSolutionDetail setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDISyncTaskResponseBodyDataSolutionDetail setProcessExtra(String processExtra) {
            this.processExtra = processExtra;
            return this;
        }
        public String getProcessExtra() {
            return this.processExtra;
        }

        public GetDISyncTaskResponseBodyDataSolutionDetail setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public GetDISyncTaskResponseBodyDataSolutionDetail setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class GetDISyncTaskResponseBodyData extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Status")
        public String status;

        @NameInMap("Message")
        public String message;

        @NameInMap("SolutionDetail")
        public GetDISyncTaskResponseBodyDataSolutionDetail solutionDetail;

        public static GetDISyncTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDISyncTaskResponseBodyData self = new GetDISyncTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDISyncTaskResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetDISyncTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDISyncTaskResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetDISyncTaskResponseBodyData setSolutionDetail(GetDISyncTaskResponseBodyDataSolutionDetail solutionDetail) {
            this.solutionDetail = solutionDetail;
            return this;
        }
        public GetDISyncTaskResponseBodyDataSolutionDetail getSolutionDetail() {
            return this.solutionDetail;
        }

    }

}
