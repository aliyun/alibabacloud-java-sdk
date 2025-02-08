// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetTopicInfluenceResponseBody extends TeaModel {
    /**
     * <p>The list of baseline instances affected by the event.</p>
     */
    @NameInMap("Data")
    public GetTopicInfluenceResponseBodyData data;

    /**
     * <p>The error code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1031203110005</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified parameters are invalid.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the request. You can use the ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>0000-ABCD-EFG****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("BaselineId")
        public Long baselineId;

        /**
         * <p>The name of the baseline.</p>
         * 
         * <strong>example:</strong>
         * <p>Baseline name</p>
         */
        @NameInMap("BaselineName")
        public String baselineName;

        /**
         * <p>The data timestamp of the baseline instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1553356800000</p>
         */
        @NameInMap("Bizdate")
        public Long bizdate;

        /**
         * <p>The margin of the baseline instance. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>360</p>
         */
        @NameInMap("Buffer")
        public Long buffer;

        /**
         * <p>The ID of the cycle of the baseline instance. For a baseline instance that is scheduled by day, the field value is 1. For a baseline instance that is scheduled by hour, the field value ranges from 1 to 24.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InGroupId")
        public Integer inGroupId;

        /**
         * <p>The ID of the Alibaba Cloud account used by the baseline owner. Multiple IDs are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>952795****</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The priority of the baseline. Valid values: 1, 2, 5, 7, and 8.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The ID of the workspace to which the baseline belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The status of the baseline. Valid values: ERROR, SAFE, DANGROUS, and OVER. The value ERROR indicates that no nodes are associated with the baseline, or all nodes associated with the baseline are suspended. The value SAFE indicates that nodes are run before the alert duration begins. The value DANGROUS indicates that nodes are still running after the alert duration ends but the committed time does not arrive. The value OVER indicates that nodes are still running after the committed time.</p>
         * 
         * <strong>example:</strong>
         * <p>SAFE</p>
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
         * <p>The list of affected baseline instances.</p>
         */
        @NameInMap("Influences")
        public java.util.List<GetTopicInfluenceResponseBodyDataInfluences> influences;

        /**
         * <p>The ID of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
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
