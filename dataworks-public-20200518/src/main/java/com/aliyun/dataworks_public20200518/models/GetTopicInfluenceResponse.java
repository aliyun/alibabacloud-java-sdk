// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetTopicInfluenceResponse extends TeaModel {
    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public GetTopicInfluenceResponseData data;

    public static GetTopicInfluenceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTopicInfluenceResponse self = new GetTopicInfluenceResponse();
        return TeaModel.build(map, self);
    }

    public GetTopicInfluenceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetTopicInfluenceResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetTopicInfluenceResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetTopicInfluenceResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetTopicInfluenceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTopicInfluenceResponse setData(GetTopicInfluenceResponseData data) {
        this.data = data;
        return this;
    }
    public GetTopicInfluenceResponseData getData() {
        return this.data;
    }

    public static class GetTopicInfluenceResponseDataInfluences extends TeaModel {
        @NameInMap("BaselineId")
        @Validation(required = true)
        public Long baselineId;

        @NameInMap("Bizdate")
        @Validation(required = true)
        public Long bizdate;

        @NameInMap("InGroupId")
        @Validation(required = true)
        public Integer inGroupId;

        @NameInMap("BaselineName")
        @Validation(required = true)
        public String baselineName;

        @NameInMap("Owner")
        @Validation(required = true)
        public String owner;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        @NameInMap("Priority")
        @Validation(required = true)
        public Integer priority;

        @NameInMap("Buffer")
        @Validation(required = true)
        public Long buffer;

        public static GetTopicInfluenceResponseDataInfluences build(java.util.Map<String, ?> map) throws Exception {
            GetTopicInfluenceResponseDataInfluences self = new GetTopicInfluenceResponseDataInfluences();
            return TeaModel.build(map, self);
        }

        public GetTopicInfluenceResponseDataInfluences setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public GetTopicInfluenceResponseDataInfluences setBizdate(Long bizdate) {
            this.bizdate = bizdate;
            return this;
        }
        public Long getBizdate() {
            return this.bizdate;
        }

        public GetTopicInfluenceResponseDataInfluences setInGroupId(Integer inGroupId) {
            this.inGroupId = inGroupId;
            return this;
        }
        public Integer getInGroupId() {
            return this.inGroupId;
        }

        public GetTopicInfluenceResponseDataInfluences setBaselineName(String baselineName) {
            this.baselineName = baselineName;
            return this;
        }
        public String getBaselineName() {
            return this.baselineName;
        }

        public GetTopicInfluenceResponseDataInfluences setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetTopicInfluenceResponseDataInfluences setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetTopicInfluenceResponseDataInfluences setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetTopicInfluenceResponseDataInfluences setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetTopicInfluenceResponseDataInfluences setBuffer(Long buffer) {
            this.buffer = buffer;
            return this;
        }
        public Long getBuffer() {
            return this.buffer;
        }

    }

    public static class GetTopicInfluenceResponseData extends TeaModel {
        @NameInMap("TopicId")
        @Validation(required = true)
        public Long topicId;

        @NameInMap("Influences")
        @Validation(required = true)
        public java.util.List<GetTopicInfluenceResponseDataInfluences> influences;

        public static GetTopicInfluenceResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetTopicInfluenceResponseData self = new GetTopicInfluenceResponseData();
            return TeaModel.build(map, self);
        }

        public GetTopicInfluenceResponseData setTopicId(Long topicId) {
            this.topicId = topicId;
            return this;
        }
        public Long getTopicId() {
            return this.topicId;
        }

        public GetTopicInfluenceResponseData setInfluences(java.util.List<GetTopicInfluenceResponseDataInfluences> influences) {
            this.influences = influences;
            return this;
        }
        public java.util.List<GetTopicInfluenceResponseDataInfluences> getInfluences() {
            return this.influences;
        }

    }

}
