// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListRectifyFlowResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The backend exception details.</p>
     * 
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The pagination result.</p>
     */
    @NameInMap("PageResult")
    public ListRectifyFlowResponseBodyPageResult pageResult;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListRectifyFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRectifyFlowResponseBody self = new ListRectifyFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRectifyFlowResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRectifyFlowResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListRectifyFlowResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRectifyFlowResponseBody setPageResult(ListRectifyFlowResponseBodyPageResult pageResult) {
        this.pageResult = pageResult;
        return this;
    }
    public ListRectifyFlowResponseBodyPageResult getPageResult() {
        return this.pageResult;
    }

    public ListRectifyFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRectifyFlowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListRectifyFlowResponseBodyPageResultData extends TeaModel {
        /**
         * <p>The completion time. The value is a UNIX timestamp in milliseconds. If the process is not completed, this parameter is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>648218233037</p>
         */
        @NameInMap("FinishTime")
        public Long finishTime;

        /**
         * <p>The total number of issues in the current process.</p>
         * 
         * <strong>example:</strong>
         * <p>264461775547</p>
         */
        @NameInMap("ProblemCount")
        public Long problemCount;

        /**
         * <p>The process ID.</p>
         * 
         * <strong>example:</strong>
         * <p>474448887101</p>
         */
        @NameInMap("RectifyId")
        public Long rectifyId;

        /**
         * <p>The process name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RectifyName")
        public String rectifyName;

        /**
         * <p>The priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RectifyPriority")
        public String rectifyPriority;

        /**
         * <p>The rectifier ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3001</p>
         */
        @NameInMap("RectifyUser")
        public String rectifyUser;

        /**
         * <p>The rectifier name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RectifyUserName")
        public String rectifyUserName;

        /**
         * <p>The start time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>356278124692</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The process status.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The initiator ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3001</p>
         */
        @NameInMap("SubmitUser")
        public String submitUser;

        /**
         * <p>The initiator name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("SubmitUserName")
        public String submitUserName;

        /**
         * <p>The verifier ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3001</p>
         */
        @NameInMap("VerifyUser")
        public String verifyUser;

        /**
         * <p>The verifier name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("VerifyUserName")
        public String verifyUserName;

        public static ListRectifyFlowResponseBodyPageResultData build(java.util.Map<String, ?> map) throws Exception {
            ListRectifyFlowResponseBodyPageResultData self = new ListRectifyFlowResponseBodyPageResultData();
            return TeaModel.build(map, self);
        }

        public ListRectifyFlowResponseBodyPageResultData setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public ListRectifyFlowResponseBodyPageResultData setProblemCount(Long problemCount) {
            this.problemCount = problemCount;
            return this;
        }
        public Long getProblemCount() {
            return this.problemCount;
        }

        public ListRectifyFlowResponseBodyPageResultData setRectifyId(Long rectifyId) {
            this.rectifyId = rectifyId;
            return this;
        }
        public Long getRectifyId() {
            return this.rectifyId;
        }

        public ListRectifyFlowResponseBodyPageResultData setRectifyName(String rectifyName) {
            this.rectifyName = rectifyName;
            return this;
        }
        public String getRectifyName() {
            return this.rectifyName;
        }

        public ListRectifyFlowResponseBodyPageResultData setRectifyPriority(String rectifyPriority) {
            this.rectifyPriority = rectifyPriority;
            return this;
        }
        public String getRectifyPriority() {
            return this.rectifyPriority;
        }

        public ListRectifyFlowResponseBodyPageResultData setRectifyUser(String rectifyUser) {
            this.rectifyUser = rectifyUser;
            return this;
        }
        public String getRectifyUser() {
            return this.rectifyUser;
        }

        public ListRectifyFlowResponseBodyPageResultData setRectifyUserName(String rectifyUserName) {
            this.rectifyUserName = rectifyUserName;
            return this;
        }
        public String getRectifyUserName() {
            return this.rectifyUserName;
        }

        public ListRectifyFlowResponseBodyPageResultData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListRectifyFlowResponseBodyPageResultData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListRectifyFlowResponseBodyPageResultData setSubmitUser(String submitUser) {
            this.submitUser = submitUser;
            return this;
        }
        public String getSubmitUser() {
            return this.submitUser;
        }

        public ListRectifyFlowResponseBodyPageResultData setSubmitUserName(String submitUserName) {
            this.submitUserName = submitUserName;
            return this;
        }
        public String getSubmitUserName() {
            return this.submitUserName;
        }

        public ListRectifyFlowResponseBodyPageResultData setVerifyUser(String verifyUser) {
            this.verifyUser = verifyUser;
            return this;
        }
        public String getVerifyUser() {
            return this.verifyUser;
        }

        public ListRectifyFlowResponseBodyPageResultData setVerifyUserName(String verifyUserName) {
            this.verifyUserName = verifyUserName;
            return this;
        }
        public String getVerifyUserName() {
            return this.verifyUserName;
        }

    }

    public static class ListRectifyFlowResponseBodyPageResult extends TeaModel {
        /**
         * <p>The processes on the current page.</p>
         */
        @NameInMap("Data")
        public java.util.List<ListRectifyFlowResponseBodyPageResultData> data;

        /**
         * <p>The total number of processes.</p>
         * 
         * <strong>example:</strong>
         * <p>699386170553</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListRectifyFlowResponseBodyPageResult build(java.util.Map<String, ?> map) throws Exception {
            ListRectifyFlowResponseBodyPageResult self = new ListRectifyFlowResponseBodyPageResult();
            return TeaModel.build(map, self);
        }

        public ListRectifyFlowResponseBodyPageResult setData(java.util.List<ListRectifyFlowResponseBodyPageResultData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListRectifyFlowResponseBodyPageResultData> getData() {
            return this.data;
        }

        public ListRectifyFlowResponseBodyPageResult setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
