// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CreateDataAgentFeedbackResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateDataAgentFeedbackResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>Specified parameter Tid is not valid.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>89a07eac-96ff-48be-983b-f22c55*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateDataAgentFeedbackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataAgentFeedbackResponseBody self = new CreateDataAgentFeedbackResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDataAgentFeedbackResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateDataAgentFeedbackResponseBody setData(CreateDataAgentFeedbackResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDataAgentFeedbackResponseBodyData getData() {
        return this.data;
    }

    public CreateDataAgentFeedbackResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateDataAgentFeedbackResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateDataAgentFeedbackResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateDataAgentFeedbackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDataAgentFeedbackResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateDataAgentFeedbackResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;feedback_type&quot;:&quot;PRODUCT_SUGGESTION&quot;,&quot;user_feedback&quot;: &quot;test&quot;,&quot;email&quot;:&quot;<a href="mailto:yourname@example.com">yourname@example.com</a>&quot;,&quot;is_authorized&quot;:&quot;Y&quot;}</p>
         */
        @NameInMap("FeedbackContent")
        public String feedbackContent;

        /**
         * <strong>example:</strong>
         * <p>ISSUE_REPORT</p>
         */
        @NameInMap("FeedbackType")
        public String feedbackType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LikeValue")
        public Integer likeValue;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>h8r********4fch</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <strong>example:</strong>
         * <p>h8r********4fch_sdesfews</p>
         */
        @NameInMap("TargetId")
        public String targetId;

        /**
         * <strong>example:</strong>
         * <p>SESSION</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        public static CreateDataAgentFeedbackResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDataAgentFeedbackResponseBodyData self = new CreateDataAgentFeedbackResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDataAgentFeedbackResponseBodyData setFeedbackContent(String feedbackContent) {
            this.feedbackContent = feedbackContent;
            return this;
        }
        public String getFeedbackContent() {
            return this.feedbackContent;
        }

        public CreateDataAgentFeedbackResponseBodyData setFeedbackType(String feedbackType) {
            this.feedbackType = feedbackType;
            return this;
        }
        public String getFeedbackType() {
            return this.feedbackType;
        }

        public CreateDataAgentFeedbackResponseBodyData setLikeValue(Integer likeValue) {
            this.likeValue = likeValue;
            return this;
        }
        public Integer getLikeValue() {
            return this.likeValue;
        }

        public CreateDataAgentFeedbackResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateDataAgentFeedbackResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public CreateDataAgentFeedbackResponseBodyData setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public CreateDataAgentFeedbackResponseBodyData setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

}
