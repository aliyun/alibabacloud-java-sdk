// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListTaskResponseBodyData data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTaskResponseBody self = new ListTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTaskResponseBody setData(ListTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListTaskResponseBodyData getData() {
        return this.data;
    }

    public ListTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListTaskResponseBodyDataRecord extends TeaModel {
        @NameInMap("CompleteCount")
        public Integer completeCount;

        @NameInMap("FireTime")
        public String fireTime;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("Id")
        public Long id;

        @NameInMap("RobotId")
        public Long robotId;

        @NameInMap("RobotName")
        public String robotName;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListTaskResponseBodyDataRecord build(java.util.Map<String, ?> map) throws Exception {
            ListTaskResponseBodyDataRecord self = new ListTaskResponseBodyDataRecord();
            return TeaModel.build(map, self);
        }

        public ListTaskResponseBodyDataRecord setCompleteCount(Integer completeCount) {
            this.completeCount = completeCount;
            return this;
        }
        public Integer getCompleteCount() {
            return this.completeCount;
        }

        public ListTaskResponseBodyDataRecord setFireTime(String fireTime) {
            this.fireTime = fireTime;
            return this;
        }
        public String getFireTime() {
            return this.fireTime;
        }

        public ListTaskResponseBodyDataRecord setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListTaskResponseBodyDataRecord setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListTaskResponseBodyDataRecord setRobotId(Long robotId) {
            this.robotId = robotId;
            return this;
        }
        public Long getRobotId() {
            return this.robotId;
        }

        public ListTaskResponseBodyDataRecord setRobotName(String robotName) {
            this.robotName = robotName;
            return this;
        }
        public String getRobotName() {
            return this.robotName;
        }

        public ListTaskResponseBodyDataRecord setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTaskResponseBodyDataRecord setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public ListTaskResponseBodyDataRecord setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class ListTaskResponseBodyData extends TeaModel {
        @NameInMap("PageNo")
        public Long pageNo;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Record")
        public java.util.List<ListTaskResponseBodyDataRecord> record;

        @NameInMap("Total")
        public Long total;

        public static ListTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTaskResponseBodyData self = new ListTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTaskResponseBodyData setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public ListTaskResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListTaskResponseBodyData setRecord(java.util.List<ListTaskResponseBodyDataRecord> record) {
            this.record = record;
            return this;
        }
        public java.util.List<ListTaskResponseBodyDataRecord> getRecord() {
            return this.record;
        }

        public ListTaskResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
