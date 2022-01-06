// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListApplicationMonitorResponseBody extends TeaModel {
    @NameInMap("ApplicationMonitors")
    public java.util.List<ListApplicationMonitorResponseBodyApplicationMonitors> applicationMonitors;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListApplicationMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationMonitorResponseBody self = new ListApplicationMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationMonitorResponseBody setApplicationMonitors(java.util.List<ListApplicationMonitorResponseBodyApplicationMonitors> applicationMonitors) {
        this.applicationMonitors = applicationMonitors;
        return this;
    }
    public java.util.List<ListApplicationMonitorResponseBodyApplicationMonitors> getApplicationMonitors() {
        return this.applicationMonitors;
    }

    public ListApplicationMonitorResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListApplicationMonitorResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListApplicationMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApplicationMonitorResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListApplicationMonitorResponseBodyApplicationMonitors extends TeaModel {
        @NameInMap("AcceleratorId")
        public String acceleratorId;

        @NameInMap("Address")
        public String address;

        @NameInMap("DetectThreshold")
        public Integer detectThreshold;

        @NameInMap("ListenerId")
        public String listenerId;

        @NameInMap("OptionsJson")
        public String optionsJson;

        @NameInMap("State")
        public String state;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskName")
        public String taskName;

        public static ListApplicationMonitorResponseBodyApplicationMonitors build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationMonitorResponseBodyApplicationMonitors self = new ListApplicationMonitorResponseBodyApplicationMonitors();
            return TeaModel.build(map, self);
        }

        public ListApplicationMonitorResponseBodyApplicationMonitors setAcceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }
        public String getAcceleratorId() {
            return this.acceleratorId;
        }

        public ListApplicationMonitorResponseBodyApplicationMonitors setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public ListApplicationMonitorResponseBodyApplicationMonitors setDetectThreshold(Integer detectThreshold) {
            this.detectThreshold = detectThreshold;
            return this;
        }
        public Integer getDetectThreshold() {
            return this.detectThreshold;
        }

        public ListApplicationMonitorResponseBodyApplicationMonitors setListenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }
        public String getListenerId() {
            return this.listenerId;
        }

        public ListApplicationMonitorResponseBodyApplicationMonitors setOptionsJson(String optionsJson) {
            this.optionsJson = optionsJson;
            return this;
        }
        public String getOptionsJson() {
            return this.optionsJson;
        }

        public ListApplicationMonitorResponseBodyApplicationMonitors setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListApplicationMonitorResponseBodyApplicationMonitors setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListApplicationMonitorResponseBodyApplicationMonitors setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

}
