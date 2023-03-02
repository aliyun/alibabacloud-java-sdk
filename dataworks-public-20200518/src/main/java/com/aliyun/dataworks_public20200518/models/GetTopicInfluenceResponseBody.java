// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetTopicInfluenceResponseBody extends TeaModel {
    /**
     * <p>The information about the baseline instances affected by the event.</p>
     */
    @NameInMap("Data")
    public GetTopicInfluenceResponseBodyData data;

    /**
     * <p>The error code returned.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the request. You can use the ID to troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
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
        /**
         * <p>The ID of the baseline.</p>
         */
        @NameInMap("BaselineId")
        public Long baselineId;

        /**
         * <p>The name of the baseline.</p>
         */
        @NameInMap("BaselineName")
        public String baselineName;

        /**
         * <p>The data timestamp of the baseline instance.</p>
         */
        @NameInMap("Bizdate")
        public Long bizdate;

        /**
         * <p>The margin of the baseline instance. Unit: seconds.</p>
         */
        @NameInMap("Buffer")
        public Long buffer;

        /**
         * <p>The ID of the scheduling cycle of the baseline instance. For a baseline instance that is scheduled by day, the value of this parameter is 1. For a baseline instance that is scheduled by hour, the value of this parameter ranges from 1 to 24.</p>
         */
        @NameInMap("InGroupId")
        public Integer inGroupId;

        /**
         * <p>The ID of the Alibaba Cloud account used by the baseline owner. Multiple IDs are separated by commas (,).</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The priority of the baseline. Valid values: 1, 2, 5, 7, and 8.</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The ID of the workspace to which the baseline belongs.</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The status of the baseline. Valid values: ERROR, SAFE, DANGEROUS, and OVER. The value ERROR indicates that no nodes are associated with the baseline, or all nodes associated with the baseline are suspended. The value SAFE indicates that nodes finish running before the alerting time. The value DANGEROUS indicates that nodes are still running after the alerting time but before the committed time. The value OVER indicates that nodes are still running after the committed time.</p>
         */
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
        /**
         * <p>The affected baseline instances.</p>
         */
        @NameInMap("Influences")
        public java.util.List<GetTopicInfluenceResponseBodyDataInfluences> influences;

        /**
         * <p>The ID of the event.</p>
         */
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
