// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetTopicInfluenceResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetTopicInfluenceResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetTopicInfluenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTopicInfluenceResponseBody self = new GetTopicInfluenceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTopicInfluenceResponseBody setData(GetTopicInfluenceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTopicInfluenceResponseBodyData getData() {
        return this.data;
    }

    public GetTopicInfluenceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetTopicInfluenceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetTopicInfluenceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetTopicInfluenceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTopicInfluenceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTopicInfluenceResponseBodyDataInfluences extends TeaModel {
        @NameInMap("BaselineId")
        public Long baselineId;

        @NameInMap("BaselineName")
        public String baselineName;

        @NameInMap("Bizdate")
        public Long bizdate;

        @NameInMap("Buffer")
        public Long buffer;

        @NameInMap("InGroupId")
        public Integer inGroupId;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("Status")
        public String status;

        public static GetTopicInfluenceResponseBodyDataInfluences build(java.util.Map<String, ?> map) throws Exception {
            GetTopicInfluenceResponseBodyDataInfluences self = new GetTopicInfluenceResponseBodyDataInfluences();
            return TeaModel.build(map, self);
        }

        public GetTopicInfluenceResponseBodyDataInfluences setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public GetTopicInfluenceResponseBodyDataInfluences setBaselineName(String baselineName) {
            this.baselineName = baselineName;
            return this;
        }
        public String getBaselineName() {
            return this.baselineName;
        }

        public GetTopicInfluenceResponseBodyDataInfluences setBizdate(Long bizdate) {
            this.bizdate = bizdate;
            return this;
        }
        public Long getBizdate() {
            return this.bizdate;
        }

        public GetTopicInfluenceResponseBodyDataInfluences setBuffer(Long buffer) {
            this.buffer = buffer;
            return this;
        }
        public Long getBuffer() {
            return this.buffer;
        }

        public GetTopicInfluenceResponseBodyDataInfluences setInGroupId(Integer inGroupId) {
            this.inGroupId = inGroupId;
            return this;
        }
        public Integer getInGroupId() {
            return this.inGroupId;
        }

        public GetTopicInfluenceResponseBodyDataInfluences setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetTopicInfluenceResponseBodyDataInfluences setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetTopicInfluenceResponseBodyDataInfluences setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetTopicInfluenceResponseBodyDataInfluences setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetTopicInfluenceResponseBodyData extends TeaModel {
        @NameInMap("Influences")
        public java.util.List<GetTopicInfluenceResponseBodyDataInfluences> influences;

        @NameInMap("TopicId")
        public Long topicId;

        public static GetTopicInfluenceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTopicInfluenceResponseBodyData self = new GetTopicInfluenceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTopicInfluenceResponseBodyData setInfluences(java.util.List<GetTopicInfluenceResponseBodyDataInfluences> influences) {
            this.influences = influences;
            return this;
        }
        public java.util.List<GetTopicInfluenceResponseBodyDataInfluences> getInfluences() {
            return this.influences;
        }

        public GetTopicInfluenceResponseBodyData setTopicId(Long topicId) {
            this.topicId = topicId;
            return this;
        }
        public Long getTopicId() {
            return this.topicId;
        }

    }

}
