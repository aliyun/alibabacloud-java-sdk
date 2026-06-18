// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListTaskResponseBody extends TeaModel {
    /**
     * <p>Request status code. A return value of OK indicates that the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>List of job data.</p>
     */
    @NameInMap("Data")
    public ListTaskResponseBodyData data;

    /**
     * <p>Description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D9CB3933-9FE3-4870-BA8E-2BEE91B69D23</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the API was invoked successfully. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Succeeded.</li>
     * <li><strong>false</strong>: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>Number of completed calls.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CompleteCount")
        public Integer completeCount;

        /**
         * <p>Job start time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1618477232000</p>
         */
        @NameInMap("FireTime")
        public String fireTime;

        /**
         * <p>Creation Time of the job. Format: UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1618477232000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The unique job ID for the robot calling task.</p>
         * 
         * <strong>example:</strong>
         * <p>12****</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The ID of the specified robot, which is the script ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12****</p>
         */
        @NameInMap("RobotId")
        public Long robotId;

        /**
         * <p>Robot Name.</p>
         * 
         * <strong>example:</strong>
         * <p>机器人</p>
         */
        @NameInMap("RobotName")
        public String robotName;

        /**
         * <p>Task Status.</p>
         * 
         * <strong>example:</strong>
         * <p>RELEASE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Task Name.</p>
         * 
         * <strong>example:</strong>
         * <p>测试任务</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>Total number of processed calls.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
        /**
         * <p>Current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Long pageNo;

        /**
         * <p>Number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>List of job information.</p>
         */
        @NameInMap("Record")
        public java.util.List<ListTaskResponseBodyDataRecord> record;

        /**
         * <p>Total number of jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
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
