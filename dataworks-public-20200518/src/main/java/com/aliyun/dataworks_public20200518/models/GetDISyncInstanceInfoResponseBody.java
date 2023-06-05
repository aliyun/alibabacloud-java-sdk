// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDISyncInstanceInfoResponseBody extends TeaModel {
    /**
     * <p>*   If the TaskType parameter is set to DI_REALTIME, the Status parameter indicates the status of the real-time synchronization node. Valid values: PAUSE, NORUN, RUN, KILLING, and WAIT.</p>
     * <p>*   If the TaskType parameter is set to DI_SOLITION, the Status parameter indicates the status of the data synchronization solution. Valid values: success and fail.</p>
     */
    @NameInMap("Data")
    public GetDISyncInstanceInfoResponseBodyData data;

    /**
     * <p>The status of the real-time synchronization node or data synchronization solution.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the request. You can use the ID to query logs and troubleshoot issues.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDISyncInstanceInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDISyncInstanceInfoResponseBody self = new GetDISyncInstanceInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDISyncInstanceInfoResponseBody setData(GetDISyncInstanceInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDISyncInstanceInfoResponseBodyData getData() {
        return this.data;
    }

    public GetDISyncInstanceInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDISyncInstanceInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDISyncInstanceInfoResponseBodyDataSolutionInfoStepDetail extends TeaModel {
        @NameInMap("Info")
        public String info;

        /**
         * <p>The ID of the step in the data synchronization solution.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The name of the step in the data synchronization solution.</p>
         */
        @NameInMap("StepId")
        public Long stepId;

        /**
         * <p>The information of the data synchronization solution.</p>
         */
        @NameInMap("StepName")
        public String stepName;

        public static GetDISyncInstanceInfoResponseBodyDataSolutionInfoStepDetail build(java.util.Map<String, ?> map) throws Exception {
            GetDISyncInstanceInfoResponseBodyDataSolutionInfoStepDetail self = new GetDISyncInstanceInfoResponseBodyDataSolutionInfoStepDetail();
            return TeaModel.build(map, self);
        }

        public GetDISyncInstanceInfoResponseBodyDataSolutionInfoStepDetail setInfo(String info) {
            this.info = info;
            return this;
        }
        public String getInfo() {
            return this.info;
        }

        public GetDISyncInstanceInfoResponseBodyDataSolutionInfoStepDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDISyncInstanceInfoResponseBodyDataSolutionInfoStepDetail setStepId(Long stepId) {
            this.stepId = stepId;
            return this;
        }
        public Long getStepId() {
            return this.stepId;
        }

        public GetDISyncInstanceInfoResponseBodyDataSolutionInfoStepDetail setStepName(String stepName) {
            this.stepName = stepName;
            return this;
        }
        public String getStepName() {
            return this.stepName;
        }

    }

    public static class GetDISyncInstanceInfoResponseBodyDataSolutionInfo extends TeaModel {
        /**
         * <p>The step details of the synchronization solution.</p>
         */
        @NameInMap("CreatorName")
        public String creatorName;

        /**
         * <p>The creator of the data synchronization solution.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The ID of the data synchronization solution.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The status of the step in the data synchronization solution.</p>
         */
        @NameInMap("StepDetail")
        public java.util.List<GetDISyncInstanceInfoResponseBodyDataSolutionInfoStepDetail> stepDetail;

        public static GetDISyncInstanceInfoResponseBodyDataSolutionInfo build(java.util.Map<String, ?> map) throws Exception {
            GetDISyncInstanceInfoResponseBodyDataSolutionInfo self = new GetDISyncInstanceInfoResponseBodyDataSolutionInfo();
            return TeaModel.build(map, self);
        }

        public GetDISyncInstanceInfoResponseBodyDataSolutionInfo setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public GetDISyncInstanceInfoResponseBodyDataSolutionInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDISyncInstanceInfoResponseBodyDataSolutionInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDISyncInstanceInfoResponseBodyDataSolutionInfo setStepDetail(java.util.List<GetDISyncInstanceInfoResponseBodyDataSolutionInfoStepDetail> stepDetail) {
            this.stepDetail = stepDetail;
            return this;
        }
        public java.util.List<GetDISyncInstanceInfoResponseBodyDataSolutionInfoStepDetail> getStepDetail() {
            return this.stepDetail;
        }

    }

    public static class GetDISyncInstanceInfoResponseBodyData extends TeaModel {
        /**
         * <p>*   If the TaskType parameter is set to DI_REALTIME, the Name parameter indicates the name of the real-time synchronization node.</p>
         * <p>*   If the TaskType parameter is set to DI_SOLITION, the value null is returned.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>*   If the TaskType parameter is set to DI_REALTIME, the value null is returned.</p>
         * <p>*   If the TaskType parameter is set to DI_SOLITION, the SolutionInfo parameter indicates the details of the data synchronization solution.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The status of the data synchronization solution.</p>
         */
        @NameInMap("SolutionInfo")
        public GetDISyncInstanceInfoResponseBodyDataSolutionInfo solutionInfo;

        /**
         * <p>The cause of the failure to obtain the status of the real-time synchronization node or data synchronization solution. If the status of the real-time synchronization node or data synchronization solution is obtained, the value null is returned.</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetDISyncInstanceInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDISyncInstanceInfoResponseBodyData self = new GetDISyncInstanceInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDISyncInstanceInfoResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetDISyncInstanceInfoResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDISyncInstanceInfoResponseBodyData setSolutionInfo(GetDISyncInstanceInfoResponseBodyDataSolutionInfo solutionInfo) {
            this.solutionInfo = solutionInfo;
            return this;
        }
        public GetDISyncInstanceInfoResponseBodyDataSolutionInfo getSolutionInfo() {
            return this.solutionInfo;
        }

        public GetDISyncInstanceInfoResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
