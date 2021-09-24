// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDISyncInstanceInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public GetDISyncInstanceInfoResponseData data;

    public static GetDISyncInstanceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDISyncInstanceInfoResponse self = new GetDISyncInstanceInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetDISyncInstanceInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDISyncInstanceInfoResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDISyncInstanceInfoResponse setData(GetDISyncInstanceInfoResponseData data) {
        this.data = data;
        return this;
    }
    public GetDISyncInstanceInfoResponseData getData() {
        return this.data;
    }

    public static class GetDISyncInstanceInfoResponseDataSolutionInfoStepDetail extends TeaModel {
        @NameInMap("StepName")
        @Validation(required = true)
        public String stepName;

        @NameInMap("StepId")
        @Validation(required = true)
        public Long stepId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static GetDISyncInstanceInfoResponseDataSolutionInfoStepDetail build(java.util.Map<String, ?> map) throws Exception {
            GetDISyncInstanceInfoResponseDataSolutionInfoStepDetail self = new GetDISyncInstanceInfoResponseDataSolutionInfoStepDetail();
            return TeaModel.build(map, self);
        }

        public GetDISyncInstanceInfoResponseDataSolutionInfoStepDetail setStepName(String stepName) {
            this.stepName = stepName;
            return this;
        }
        public String getStepName() {
            return this.stepName;
        }

        public GetDISyncInstanceInfoResponseDataSolutionInfoStepDetail setStepId(Long stepId) {
            this.stepId = stepId;
            return this;
        }
        public Long getStepId() {
            return this.stepId;
        }

        public GetDISyncInstanceInfoResponseDataSolutionInfoStepDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetDISyncInstanceInfoResponseDataSolutionInfo extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("CreatorName")
        @Validation(required = true)
        public String creatorName;

        @NameInMap("StepDetail")
        @Validation(required = true)
        public java.util.List<GetDISyncInstanceInfoResponseDataSolutionInfoStepDetail> stepDetail;

        public static GetDISyncInstanceInfoResponseDataSolutionInfo build(java.util.Map<String, ?> map) throws Exception {
            GetDISyncInstanceInfoResponseDataSolutionInfo self = new GetDISyncInstanceInfoResponseDataSolutionInfo();
            return TeaModel.build(map, self);
        }

        public GetDISyncInstanceInfoResponseDataSolutionInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDISyncInstanceInfoResponseDataSolutionInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDISyncInstanceInfoResponseDataSolutionInfo setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public GetDISyncInstanceInfoResponseDataSolutionInfo setStepDetail(java.util.List<GetDISyncInstanceInfoResponseDataSolutionInfoStepDetail> stepDetail) {
            this.stepDetail = stepDetail;
            return this;
        }
        public java.util.List<GetDISyncInstanceInfoResponseDataSolutionInfoStepDetail> getStepDetail() {
            return this.stepDetail;
        }

    }

    public static class GetDISyncInstanceInfoResponseData extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        @NameInMap("SolutionInfo")
        @Validation(required = true)
        public GetDISyncInstanceInfoResponseDataSolutionInfo solutionInfo;

        public static GetDISyncInstanceInfoResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetDISyncInstanceInfoResponseData self = new GetDISyncInstanceInfoResponseData();
            return TeaModel.build(map, self);
        }

        public GetDISyncInstanceInfoResponseData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDISyncInstanceInfoResponseData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDISyncInstanceInfoResponseData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetDISyncInstanceInfoResponseData setSolutionInfo(GetDISyncInstanceInfoResponseDataSolutionInfo solutionInfo) {
            this.solutionInfo = solutionInfo;
            return this;
        }
        public GetDISyncInstanceInfoResponseDataSolutionInfo getSolutionInfo() {
            return this.solutionInfo;
        }

    }

}
