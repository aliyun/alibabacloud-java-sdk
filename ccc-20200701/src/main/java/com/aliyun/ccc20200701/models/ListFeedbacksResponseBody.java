// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListFeedbacksResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListFeedbacksResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>26E54929-CA86-1035-9B42-0C8F291BB027</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListFeedbacksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFeedbacksResponseBody self = new ListFeedbacksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFeedbacksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListFeedbacksResponseBody setData(java.util.List<ListFeedbacksResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListFeedbacksResponseBodyData> getData() {
        return this.data;
    }

    public ListFeedbacksResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListFeedbacksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListFeedbacksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListFeedbacksResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>job-25920271311543****</p>
         */
        @NameInMap("ContactId")
        public String contactId;

        /**
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>20251216-8B9B7B02-16FE-54BE-942A-F59DE0656032</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>PostCallAnalyzer:solution</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("UserRating")
        public Integer userRating;

        /**
         * <strong>example:</strong>
         * <p>xxxxxxx</p>
         */
        @NameInMap("UserResponse")
        public String userResponse;

        public static ListFeedbacksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListFeedbacksResponseBodyData self = new ListFeedbacksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListFeedbacksResponseBodyData setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public ListFeedbacksResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListFeedbacksResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListFeedbacksResponseBodyData setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public ListFeedbacksResponseBodyData setUserRating(Integer userRating) {
            this.userRating = userRating;
            return this;
        }
        public Integer getUserRating() {
            return this.userRating;
        }

        public ListFeedbacksResponseBodyData setUserResponse(String userResponse) {
            this.userResponse = userResponse;
            return this;
        }
        public String getUserResponse() {
            return this.userResponse;
        }

    }

}
