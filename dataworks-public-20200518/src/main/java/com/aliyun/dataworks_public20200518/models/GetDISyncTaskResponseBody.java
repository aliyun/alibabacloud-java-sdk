// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDISyncTaskResponseBody extends TeaModel {
    /**
     * <p>*   If the TaskType parameter is set to DI_REALTIME, the details of the real-time synchronization node are returned.</p>
     * <p>*   If the TaskType parameter is set to DI_SOLUTION, the value null is returned.</p>
     */
    @NameInMap("Data")
    public GetDISyncTaskResponseBodyData data;

    /**
     * <p>The details of the real-time synchronization node or data synchronization solution.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the request. You can query logs and troubleshoot issues based on the ID.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDISyncTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDISyncTaskResponseBody self = new GetDISyncTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDISyncTaskResponseBody setData(GetDISyncTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDISyncTaskResponseBodyData getData() {
        return this.data;
    }

    public GetDISyncTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDISyncTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDISyncTaskResponseBodyDataSolutionDetail extends TeaModel {
        /**
         * <p>The ID of the project to which the data synchronization solution belongs.</p>
         */
        @NameInMap("CreatorName")
        public String creatorName;

        @NameInMap("Id")
        public Long id;

        /**
         * <p>The additional parameters of the data synchronization solution.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The name of the data synchronization solution.</p>
         */
        @NameInMap("ProcessContent")
        public String processContent;

        /**
         * <p>The time when the data synchronization solution was committed.</p>
         */
        @NameInMap("ProcessExtra")
        public String processExtra;

        /**
         * <p>The type of the source of the data synchronization solution.</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The configuration details of the data synchronization solution.</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The creator of the data synchronization solution.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The type of the data synchronization solution.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the data synchronization solution.</p>
         */
        @NameInMap("SubmitTime")
        public String submitTime;

        /**
         * <p>The start time of the data synchronization solution.</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetDISyncTaskResponseBodyDataSolutionDetail build(java.util.Map<String, ?> map) throws Exception {
            GetDISyncTaskResponseBodyDataSolutionDetail self = new GetDISyncTaskResponseBodyDataSolutionDetail();
            return TeaModel.build(map, self);
        }

        public GetDISyncTaskResponseBodyDataSolutionDetail setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public GetDISyncTaskResponseBodyDataSolutionDetail setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDISyncTaskResponseBodyDataSolutionDetail setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDISyncTaskResponseBodyDataSolutionDetail setProcessContent(String processContent) {
            this.processContent = processContent;
            return this;
        }
        public String getProcessContent() {
            return this.processContent;
        }

        public GetDISyncTaskResponseBodyDataSolutionDetail setProcessExtra(String processExtra) {
            this.processExtra = processExtra;
            return this;
        }
        public String getProcessExtra() {
            return this.processExtra;
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

        public GetDISyncTaskResponseBodyDataSolutionDetail setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetDISyncTaskResponseBodyDataSolutionDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDISyncTaskResponseBodyDataSolutionDetail setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public GetDISyncTaskResponseBodyDataSolutionDetail setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDISyncTaskResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the details of the real-time synchronization node or data synchronization solution are obtained. Valid values:</p>
         * <br>
         * <p>success: The details are obtained.</p>
         * <br>
         * <p>fail: The details fail to be obtained.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>*   If the TaskType parameter is set to DI_REALTIME, the value null is returned.</p>
         * <p>*   If the TaskType parameter is set to DI_SOLUTION, the details of the data synchronization solution task are returned.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The status of the data synchronization solution. Valid values:</p>
         * <br>
         * <p>*   0: successful</p>
         * <p>*   1: not running</p>
         * <p>*   2: running</p>
         * <p>*   3: failed</p>
         * <p>*   4: committed</p>
         * <p>*   5: pending manual confirmation</p>
         * <p>*   6: manually confirmed</p>
         * <p>*   7: others</p>
         * <p>*   8: waiting</p>
         * <p>*   9: deleted</p>
         */
        @NameInMap("SolutionDetail")
        public GetDISyncTaskResponseBodyDataSolutionDetail solutionDetail;

        /**
         * <p>The cause of the failure to obtain the details of the real-time synchronization node or data synchronization solution.</p>
         * <br>
         * <p>If the details of the real-time synchronization node or data synchronization solution are obtained, the value null is returned.</p>
         */
        @NameInMap("Status")
        public String status;

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

        public GetDISyncTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
