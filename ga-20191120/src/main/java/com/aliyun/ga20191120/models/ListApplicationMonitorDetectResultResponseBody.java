// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListApplicationMonitorDetectResultResponseBody extends TeaModel {
    @NameInMap("ApplicationMonitorDetectResultList")
    public java.util.List<ListApplicationMonitorDetectResultResponseBodyApplicationMonitorDetectResultList> applicationMonitorDetectResultList;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AcceleratorId")
        public String acceleratorId;

        @NameInMap("Content")
        public String content;

        @NameInMap("Detail")
        public String detail;

        @NameInMap("DetectTime")
        public String detectTime;

        @NameInMap("DiagStatus")
        public String diagStatus;

        @NameInMap("ListenerId")
        public String listenerId;

        @NameInMap("Port")
        public String port;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("StatusCode")
        public String statusCode;

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
