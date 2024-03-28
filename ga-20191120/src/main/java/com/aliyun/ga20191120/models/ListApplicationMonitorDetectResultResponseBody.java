// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListApplicationMonitorDetectResultResponseBody extends TeaModel {
    /**
     * <p>Details about the diagnostic result of the origin probing task.</p>
     */
    @NameInMap("ApplicationMonitorDetectResultList")
    public java.util.List<ListApplicationMonitorDetectResultResponseBodyApplicationMonitorDetectResultList> applicationMonitorDetectResultList;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListApplicationMonitorDetectResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationMonitorDetectResultResponseBody self = new ListApplicationMonitorDetectResultResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationMonitorDetectResultResponseBody setApplicationMonitorDetectResultList(java.util.List<ListApplicationMonitorDetectResultResponseBodyApplicationMonitorDetectResultList> applicationMonitorDetectResultList) {
        this.applicationMonitorDetectResultList = applicationMonitorDetectResultList;
        return this;
    }
    public java.util.List<ListApplicationMonitorDetectResultResponseBodyApplicationMonitorDetectResultList> getApplicationMonitorDetectResultList() {
        return this.applicationMonitorDetectResultList;
    }

    public ListApplicationMonitorDetectResultResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListApplicationMonitorDetectResultResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListApplicationMonitorDetectResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApplicationMonitorDetectResultResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListApplicationMonitorDetectResultResponseBodyApplicationMonitorDetectResultList extends TeaModel {
        /**
         * <p>The ID of the GA instance on which the origin probing task runs.</p>
         */
        @NameInMap("AcceleratorId")
        public String acceleratorId;

        /**
         * <p>The response content returned by the origin probing task.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The description of the diagnostic result. Valid values:</p>
         * <br>
         * <p>*   **All forward nodes work well.:** The origin server is normal.</p>
         * <p>*   **Endpoint network error.:** The origin server is abnormal. You must check whether the origin server is running as expected.</p>
         * <p>*   **Public network error.:** An Internet error occurred, which is a network error that occurred when the client connected to the acceleration region.</p>
         * <p>*   **Ga internal error.:** An internal error occurred. For example, an exception occurred when GA processed a request.</p>
         * <p>*   **Ga has been deleted.:** The current GA instance is deleted.</p>
         * <p>*   **Ga state is not stable.:** The current GA instance is in an unstable state, such as the Configuring state.</p>
         * <p>*   **Ga has no listener configuration.:** No listener is configured for the current GA instance.</p>
         * <p>*   **Missing endpoint configuration.:** No endpoint is configured.</p>
         * <p>*   **Missing acceleration region configuration.:** No acceleration region is configured.</p>
         * <p>*   **Missing endpointgroup configuration.:** No endpoint group is configured.</p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <p>The time when the diagnosis of the origin probing task ends.</p>
         */
        @NameInMap("DetectTime")
        public String detectTime;

        /**
         * <p>The diagnostic result of the origin probing task. Valid values:</p>
         * <br>
         * <p>*   **success:** The origin probing task succeeded.</p>
         * <p>*   **failed:** The origin probing task failed.</p>
         */
        @NameInMap("DiagStatus")
        public String diagStatus;

        /**
         * <p>The ID of the listener on which the origin probing task runs.</p>
         */
        @NameInMap("ListenerId")
        public String listenerId;

        /**
         * <p>The listener port.</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The network transmission protocol that is used by the listener. Valid values:</p>
         * <br>
         * <p>*   **tcp:** TCP.</p>
         * <p>*   **udp:** UDP.</p>
         * <p>*   **http:** HTTP.</p>
         * <p>*   **https:** HTTPS.</p>
         * <br>
         * <p>>  UDP listeners do not support probing.</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The error code returned by the origin probing task.</p>
         */
        @NameInMap("StatusCode")
        public String statusCode;

        /**
         * <p>The origin probing task ID.</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static ListApplicationMonitorDetectResultResponseBodyApplicationMonitorDetectResultList build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationMonitorDetectResultResponseBodyApplicationMonitorDetectResultList self = new ListApplicationMonitorDetectResultResponseBodyApplicationMonitorDetectResultList();
            return TeaModel.build(map, self);
        }

        public ListApplicationMonitorDetectResultResponseBodyApplicationMonitorDetectResultList setAcceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }
        public String getAcceleratorId() {
            return this.acceleratorId;
        }

        public ListApplicationMonitorDetectResultResponseBodyApplicationMonitorDetectResultList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListApplicationMonitorDetectResultResponseBodyApplicationMonitorDetectResultList setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public ListApplicationMonitorDetectResultResponseBodyApplicationMonitorDetectResultList setDetectTime(String detectTime) {
            this.detectTime = detectTime;
            return this;
        }
        public String getDetectTime() {
            return this.detectTime;
        }

        public ListApplicationMonitorDetectResultResponseBodyApplicationMonitorDetectResultList setDiagStatus(String diagStatus) {
            this.diagStatus = diagStatus;
            return this;
        }
        public String getDiagStatus() {
            return this.diagStatus;
        }

        public ListApplicationMonitorDetectResultResponseBodyApplicationMonitorDetectResultList setListenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }
        public String getListenerId() {
            return this.listenerId;
        }

        public ListApplicationMonitorDetectResultResponseBodyApplicationMonitorDetectResultList setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public ListApplicationMonitorDetectResultResponseBodyApplicationMonitorDetectResultList setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListApplicationMonitorDetectResultResponseBodyApplicationMonitorDetectResultList setStatusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public String getStatusCode() {
            return this.statusCode;
        }

        public ListApplicationMonitorDetectResultResponseBodyApplicationMonitorDetectResultList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
