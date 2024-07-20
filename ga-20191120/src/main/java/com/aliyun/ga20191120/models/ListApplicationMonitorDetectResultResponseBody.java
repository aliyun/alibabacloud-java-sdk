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
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * 
         * <strong>example:</strong>
         * <p>ga-bp1odcab8tmno0hdq****</p>
         */
        @NameInMap("AcceleratorId")
        public String acceleratorId;

        /**
         * <p>The response content returned by the origin probing task.</p>
         * 
         * <strong>example:</strong>
         * <p>502 BadGateway</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The description of the diagnostic result. Valid values:</p>
         * <ul>
         * <li><strong>All forward nodes work well.:</strong> The origin server is normal.</li>
         * <li><strong>Endpoint network error.:</strong> The origin server is abnormal. You must check whether the origin server is running as expected.</li>
         * <li><strong>Public network error.:</strong> An Internet error occurred, which is a network error that occurred when the client connected to the acceleration region.</li>
         * <li><strong>Ga internal error.:</strong> An internal error occurred. For example, an exception occurred when GA processed a request.</li>
         * <li><strong>Ga has been deleted.:</strong> The current GA instance is deleted.</li>
         * <li><strong>Ga state is not stable.:</strong> The current GA instance is in an unstable state, such as the Configuring state.</li>
         * <li><strong>Ga has no listener configuration.:</strong> No listener is configured for the current GA instance.</li>
         * <li><strong>Missing endpoint configuration.:</strong> No endpoint is configured.</li>
         * <li><strong>Missing acceleration region configuration.:</strong> No acceleration region is configured.</li>
         * <li><strong>Missing endpointgroup configuration.:</strong> No endpoint group is configured.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>All forward nodes work well</p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <p>The time when the diagnosis of the origin probing task ends.</p>
         * 
         * <strong>example:</strong>
         * <p>1663205460</p>
         */
        @NameInMap("DetectTime")
        public String detectTime;

        /**
         * <p>The diagnostic result of the origin probing task. Valid values:</p>
         * <ul>
         * <li><strong>success:</strong> The origin probing task succeeded.</li>
         * <li><strong>failed:</strong> The origin probing task failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("DiagStatus")
        public String diagStatus;

        /**
         * <p>The ID of the listener on which the origin probing task runs.</p>
         * 
         * <strong>example:</strong>
         * <p>lsr-bp1bpn0kn908w4nbw****</p>
         */
        @NameInMap("ListenerId")
        public String listenerId;

        /**
         * <p>The listener port.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The network transmission protocol that is used by the listener. Valid values:</p>
         * <ul>
         * <li><strong>tcp:</strong> TCP.</li>
         * <li><strong>udp:</strong> UDP.</li>
         * <li><strong>http:</strong> HTTP.</li>
         * <li><strong>https:</strong> HTTPS.</li>
         * </ul>
         * <blockquote>
         * <p> UDP listeners do not support probing.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>http</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The error code returned by the origin probing task.</p>
         * 
         * <strong>example:</strong>
         * <p>502</p>
         */
        @NameInMap("StatusCode")
        public String statusCode;

        /**
         * <p>The origin probing task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sm-bp1fpdjfju9k8yr1y****</p>
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
