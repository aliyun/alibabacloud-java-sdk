// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryTaskInfoHistoryResponseBody extends TeaModel {
    /**
     * <p>Cursor for the current page.</p>
     */
    @NameInMap("CurrentPageCursor")
    public QueryTaskInfoHistoryResponseBodyCurrentPageCursor currentPageCursor;

    /**
     * <p>Cursor for the next page.</p>
     */
    @NameInMap("NextPageCursor")
    public QueryTaskInfoHistoryResponseBodyNextPageCursor nextPageCursor;

    /**
     * <p>Job information.</p>
     */
    @NameInMap("Objects")
    public java.util.List<QueryTaskInfoHistoryResponseBodyObjects> objects;

    /**
     * <p>Page size.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Cursor for the previous page.</p>
     */
    @NameInMap("PrePageCursor")
    public QueryTaskInfoHistoryResponseBodyPrePageCursor prePageCursor;

    /**
     * <p>Unique request access token.</p>
     * 
     * <strong>example:</strong>
     * <p>EB3FCCBA-CA1F-4D31-9F34-test</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryTaskInfoHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskInfoHistoryResponseBody self = new QueryTaskInfoHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTaskInfoHistoryResponseBody setCurrentPageCursor(QueryTaskInfoHistoryResponseBodyCurrentPageCursor currentPageCursor) {
        this.currentPageCursor = currentPageCursor;
        return this;
    }
    public QueryTaskInfoHistoryResponseBodyCurrentPageCursor getCurrentPageCursor() {
        return this.currentPageCursor;
    }

    public QueryTaskInfoHistoryResponseBody setNextPageCursor(QueryTaskInfoHistoryResponseBodyNextPageCursor nextPageCursor) {
        this.nextPageCursor = nextPageCursor;
        return this;
    }
    public QueryTaskInfoHistoryResponseBodyNextPageCursor getNextPageCursor() {
        return this.nextPageCursor;
    }

    public QueryTaskInfoHistoryResponseBody setObjects(java.util.List<QueryTaskInfoHistoryResponseBodyObjects> objects) {
        this.objects = objects;
        return this;
    }
    public java.util.List<QueryTaskInfoHistoryResponseBodyObjects> getObjects() {
        return this.objects;
    }

    public QueryTaskInfoHistoryResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTaskInfoHistoryResponseBody setPrePageCursor(QueryTaskInfoHistoryResponseBodyPrePageCursor prePageCursor) {
        this.prePageCursor = prePageCursor;
        return this;
    }
    public QueryTaskInfoHistoryResponseBodyPrePageCursor getPrePageCursor() {
        return this.prePageCursor;
    }

    public QueryTaskInfoHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryTaskInfoHistoryResponseBodyCurrentPageCursor extends TeaModel {
        /**
         * <p>User IP address when the job was submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        @NameInMap("Clientip")
        public String clientip;

        /**
         * <p>Job creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-11-01 17:22:51</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Job creation UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1509528171000</p>
         */
        @NameInMap("CreateTimeLong")
        public Long createTimeLong;

        /**
         * <p>Job number.</p>
         * 
         * <strong>example:</strong>
         * <p>aa634d3f-927e-4d17-9d2c-test</p>
         */
        @NameInMap("TaskNo")
        public String taskNo;

        /**
         * <p>Number of domain names included in the job.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TaskNum")
        public Integer taskNum;

        /**
         * <p>Task Status. Valid values:</p>
         * <ul>
         * <li><strong>WAITING_EXECUTE</strong>: Waiting for execution;</li>
         * <li><strong>EXECUTING</strong>: Executing;</li>
         * <li><strong>COMPLETE</strong>: Execution completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMPLETE</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        /**
         * <p>Job status code. Valid values:  </p>
         * <ul>
         * <li><strong>1</strong>: Waiting for execution  </li>
         * <li><strong>2</strong>: Executing  </li>
         * <li><strong>3</strong>: Execution completed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TaskStatusCode")
        public Integer taskStatusCode;

        /**
         * <p>Job type. Valid values:  </p>
         * <ul>
         * <li><strong>CHG_HOLDER</strong>: Modify registrant information  </li>
         * <li><strong>CHG_DNS</strong>: Modify DNS  </li>
         * <li><strong>SET_WHOIS_PROTECT</strong>: Enable privacy protection  </li>
         * <li><strong>UPDATE_ADMIN_CONTACT</strong>: Modify administrator contact information  </li>
         * <li><strong>UPDATE_BILLING_CONTACT</strong>: Modify billing contact information  </li>
         * <li><strong>UPDATE_TECH_CONTACT</strong>: Modify technical contact information  </li>
         * <li><strong>SET_UPDATE_PROHIBITED</strong>: Enable domain name edit lock  </li>
         * <li><strong>SET_TRANSFER_PROHIBITED</strong>: Enable domain name transfer lock  </li>
         * <li><strong>ORDER_ACTIVATE</strong>: Create registration order  </li>
         * <li><strong>ORDER_RENEW</strong>: Create renewal order  </li>
         * <li><strong>ORDER_REDEEM</strong>: Create redemption order  </li>
         * <li><strong>CREATE_DNSHOST</strong>: Create DNS host  </li>
         * <li><strong>UPDATE_DNSHOST</strong>: Update DNS host  </li>
         * <li><strong>UPDATE_REGISTRANT_CONTACT</strong>: Modify registrant contact  </li>
         * <li><strong>DELETE_DOMAIN</strong>: Delete domain name  </li>
         * <li><strong>SYNC_DNSHOST</strong>: Synchronize DNS host</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CHG_DNS</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <p>Task Type description.</p>
         * 
         * <strong>example:</strong>
         * <p>修改DNS</p>
         */
        @NameInMap("TaskTypeDescription")
        public String taskTypeDescription;

        public static QueryTaskInfoHistoryResponseBodyCurrentPageCursor build(java.util.Map<String, ?> map) throws Exception {
            QueryTaskInfoHistoryResponseBodyCurrentPageCursor self = new QueryTaskInfoHistoryResponseBodyCurrentPageCursor();
            return TeaModel.build(map, self);
        }

        public QueryTaskInfoHistoryResponseBodyCurrentPageCursor setClientip(String clientip) {
            this.clientip = clientip;
            return this;
        }
        public String getClientip() {
            return this.clientip;
        }

        public QueryTaskInfoHistoryResponseBodyCurrentPageCursor setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryTaskInfoHistoryResponseBodyCurrentPageCursor setCreateTimeLong(Long createTimeLong) {
            this.createTimeLong = createTimeLong;
            return this;
        }
        public Long getCreateTimeLong() {
            return this.createTimeLong;
        }

        public QueryTaskInfoHistoryResponseBodyCurrentPageCursor setTaskNo(String taskNo) {
            this.taskNo = taskNo;
            return this;
        }
        public String getTaskNo() {
            return this.taskNo;
        }

        public QueryTaskInfoHistoryResponseBodyCurrentPageCursor setTaskNum(Integer taskNum) {
            this.taskNum = taskNum;
            return this;
        }
        public Integer getTaskNum() {
            return this.taskNum;
        }

        public QueryTaskInfoHistoryResponseBodyCurrentPageCursor setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public QueryTaskInfoHistoryResponseBodyCurrentPageCursor setTaskStatusCode(Integer taskStatusCode) {
            this.taskStatusCode = taskStatusCode;
            return this;
        }
        public Integer getTaskStatusCode() {
            return this.taskStatusCode;
        }

        public QueryTaskInfoHistoryResponseBodyCurrentPageCursor setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public QueryTaskInfoHistoryResponseBodyCurrentPageCursor setTaskTypeDescription(String taskTypeDescription) {
            this.taskTypeDescription = taskTypeDescription;
            return this;
        }
        public String getTaskTypeDescription() {
            return this.taskTypeDescription;
        }

    }

    public static class QueryTaskInfoHistoryResponseBodyNextPageCursor extends TeaModel {
        /**
         * <p>User IP address when the job was submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        @NameInMap("Clientip")
        public String clientip;

        /**
         * <p>Creation Time of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-10-27 13:07:07</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Creation Time of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>1509080827000</p>
         */
        @NameInMap("CreateTimeLong")
        public Long createTimeLong;

        /**
         * <p>Job number.</p>
         * 
         * <strong>example:</strong>
         * <p>8f112aa1-98be-48c3-82f8-test</p>
         */
        @NameInMap("TaskNo")
        public String taskNo;

        /**
         * <p>Number of domain names included in the job.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("TaskNum")
        public Integer taskNum;

        /**
         * <p>Task Status. Valid values:  </p>
         * <ul>
         * <li><strong>WAITING_EXECUTE</strong>: Waiting to execute;  </li>
         * <li><strong>EXECUTING</strong>: Executing;  </li>
         * <li><strong>COMPLETE</strong>: Execution completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMPLETE</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        /**
         * <p>Job status code. Valid values:  </p>
         * <ul>
         * <li><strong>1</strong>: Waiting to execute;  </li>
         * <li><strong>2</strong>: Executing;  </li>
         * <li><strong>3</strong>: Execution completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TaskStatusCode")
        public Integer taskStatusCode;

        /**
         * <p>Task Type. Valid values:  </p>
         * <ul>
         * <li><strong>CHG_HOLDER</strong>: Modify registrant information;  </li>
         * <li><strong>CHG_DNS</strong>: Modify DNS;  </li>
         * <li><strong>SET_WHOIS_PROTECT</strong>: Enable privacy protection;  </li>
         * <li><strong>UPDATE_ADMIN_CONTACT</strong>: Modify administrative contact information;  </li>
         * <li><strong>UPDATE_BILLING_CONTACT</strong>: Modify billing contact information;  </li>
         * <li><strong>UPDATE_TECH_CONTACT</strong>: Modify technical contact information;  </li>
         * <li><strong>SET_UPDATE_PROHIBITED</strong>: Enable domain name Edit Lock;  </li>
         * <li><strong>SET_TRANSFER_PROHIBITED</strong>: Enable domain name transfer lock;  </li>
         * <li><strong>ORDER_ACTIVATE</strong>: Create a registration order;  </li>
         * <li><strong>ORDER_RENEW</strong>: Create a renewal order;  </li>
         * <li><strong>ORDER_REDEEM</strong>: Create a redemption order;  </li>
         * <li><strong>CREATE_DNSHOST</strong>: Create a DNS host;  </li>
         * <li><strong>UPDATE_DNSHOST</strong>: Update a DNS host;  </li>
         * <li><strong>UPDATE_REGISTRANT_CONTACT</strong>: Modify registrant contact information;  </li>
         * <li><strong>DELETE_DOMAIN</strong>: Delete a domain name;  </li>
         * <li><strong>SYNC_DNSHOST</strong>: Synchronize DNS host.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CHG_DNS</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <p>Task type description.</p>
         * 
         * <strong>example:</strong>
         * <p>修改DNS</p>
         */
        @NameInMap("TaskTypeDescription")
        public String taskTypeDescription;

        public static QueryTaskInfoHistoryResponseBodyNextPageCursor build(java.util.Map<String, ?> map) throws Exception {
            QueryTaskInfoHistoryResponseBodyNextPageCursor self = new QueryTaskInfoHistoryResponseBodyNextPageCursor();
            return TeaModel.build(map, self);
        }

        public QueryTaskInfoHistoryResponseBodyNextPageCursor setClientip(String clientip) {
            this.clientip = clientip;
            return this;
        }
        public String getClientip() {
            return this.clientip;
        }

        public QueryTaskInfoHistoryResponseBodyNextPageCursor setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryTaskInfoHistoryResponseBodyNextPageCursor setCreateTimeLong(Long createTimeLong) {
            this.createTimeLong = createTimeLong;
            return this;
        }
        public Long getCreateTimeLong() {
            return this.createTimeLong;
        }

        public QueryTaskInfoHistoryResponseBodyNextPageCursor setTaskNo(String taskNo) {
            this.taskNo = taskNo;
            return this;
        }
        public String getTaskNo() {
            return this.taskNo;
        }

        public QueryTaskInfoHistoryResponseBodyNextPageCursor setTaskNum(Integer taskNum) {
            this.taskNum = taskNum;
            return this;
        }
        public Integer getTaskNum() {
            return this.taskNum;
        }

        public QueryTaskInfoHistoryResponseBodyNextPageCursor setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public QueryTaskInfoHistoryResponseBodyNextPageCursor setTaskStatusCode(Integer taskStatusCode) {
            this.taskStatusCode = taskStatusCode;
            return this;
        }
        public Integer getTaskStatusCode() {
            return this.taskStatusCode;
        }

        public QueryTaskInfoHistoryResponseBodyNextPageCursor setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public QueryTaskInfoHistoryResponseBodyNextPageCursor setTaskTypeDescription(String taskTypeDescription) {
            this.taskTypeDescription = taskTypeDescription;
            return this;
        }
        public String getTaskTypeDescription() {
            return this.taskTypeDescription;
        }

    }

    public static class QueryTaskInfoHistoryResponseBodyObjects extends TeaModel {
        /**
         * <p>User IP address when submitting the task.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        @NameInMap("Clientip")
        public String clientip;

        /**
         * <p>Task creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-11-01 17:22:51</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Task creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1509528171000</p>
         */
        @NameInMap("CreateTimeLong")
        public Long createTimeLong;

        /**
         * <p>Job number.</p>
         * 
         * <strong>example:</strong>
         * <p>aa634d3f-927e-4d17-9d2c-test</p>
         */
        @NameInMap("TaskNo")
        public String taskNo;

        /**
         * <p>Number of domain names included in the job.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TaskNum")
        public Integer taskNum;

        /**
         * <p>Task status. Valid values:</p>
         * <ul>
         * <li><strong>WAITING_EXECUTE</strong>: Waiting for execution;</li>
         * <li><strong>EXECUTING</strong>: Executing;</li>
         * <li><strong>COMPLETE</strong>: Execution completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMPLETE</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        /**
         * <p>Task status code. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Waiting for execution;</li>
         * <li><strong>2</strong>: Executing;</li>
         * <li><strong>3</strong>: Execution completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TaskStatusCode")
        public Integer taskStatusCode;

        /**
         * <p>Task Type. Valid values:</p>
         * <ul>
         * <li><strong>CHG_HOLDER</strong>: Modify owner information;</li>
         * <li><strong>CHG_DNS</strong>: Modify DNS;</li>
         * <li><strong>SET_WHOIS_PROTECT</strong>: Enable privacy protection;</li>
         * <li><strong>UPDATE_ADMIN_CONTACT</strong>: Modify administrative contact information;</li>
         * <li><strong>UPDATE_BILLING_CONTACT</strong>: Modify billing contact information;</li>
         * <li><strong>UPDATE_TECH_CONTACT</strong>: Modify technical contact information;</li>
         * <li><strong>SET_UPDATE_PROHIBITED</strong>: Enable domain name edit lock;</li>
         * <li><strong>SET_TRANSFER_PROHIBITED</strong>: Enable domain name transfer lock;</li>
         * <li><strong>ORDER_ACTIVATE</strong>: Create a registration order;</li>
         * <li><strong>ORDER_RENEW</strong>: Create a renewal order;</li>
         * <li><strong>ORDER_REDEEM</strong>: Create a redemption order;</li>
         * <li><strong>CREATE_DNSHOST</strong>: Create a DNS host;</li>
         * <li><strong>UPDATE_DNSHOST</strong>: Update a DNS host;</li>
         * <li><strong>UPDATE_REGISTRANT_CONTACT</strong>: Modify registrant contact information;</li>
         * <li><strong>DELETE_DOMAIN</strong>: Delete a domain name;</li>
         * <li><strong>SYNC_DNSHOST</strong>: Synchronize a DNS host.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CHG_DNS</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <p>Task type description.</p>
         * 
         * <strong>example:</strong>
         * <p>修改DNS</p>
         */
        @NameInMap("TaskTypeDescription")
        public String taskTypeDescription;

        public static QueryTaskInfoHistoryResponseBodyObjects build(java.util.Map<String, ?> map) throws Exception {
            QueryTaskInfoHistoryResponseBodyObjects self = new QueryTaskInfoHistoryResponseBodyObjects();
            return TeaModel.build(map, self);
        }

        public QueryTaskInfoHistoryResponseBodyObjects setClientip(String clientip) {
            this.clientip = clientip;
            return this;
        }
        public String getClientip() {
            return this.clientip;
        }

        public QueryTaskInfoHistoryResponseBodyObjects setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryTaskInfoHistoryResponseBodyObjects setCreateTimeLong(Long createTimeLong) {
            this.createTimeLong = createTimeLong;
            return this;
        }
        public Long getCreateTimeLong() {
            return this.createTimeLong;
        }

        public QueryTaskInfoHistoryResponseBodyObjects setTaskNo(String taskNo) {
            this.taskNo = taskNo;
            return this;
        }
        public String getTaskNo() {
            return this.taskNo;
        }

        public QueryTaskInfoHistoryResponseBodyObjects setTaskNum(Integer taskNum) {
            this.taskNum = taskNum;
            return this;
        }
        public Integer getTaskNum() {
            return this.taskNum;
        }

        public QueryTaskInfoHistoryResponseBodyObjects setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public QueryTaskInfoHistoryResponseBodyObjects setTaskStatusCode(Integer taskStatusCode) {
            this.taskStatusCode = taskStatusCode;
            return this;
        }
        public Integer getTaskStatusCode() {
            return this.taskStatusCode;
        }

        public QueryTaskInfoHistoryResponseBodyObjects setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public QueryTaskInfoHistoryResponseBodyObjects setTaskTypeDescription(String taskTypeDescription) {
            this.taskTypeDescription = taskTypeDescription;
            return this;
        }
        public String getTaskTypeDescription() {
            return this.taskTypeDescription;
        }

    }

    public static class QueryTaskInfoHistoryResponseBodyPrePageCursor extends TeaModel {
        /**
         * <p>User IP address when submitting the job.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        @NameInMap("Clientip")
        public String clientip;

        /**
         * <p>Job creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-11-01 17:19:47</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Job creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1509527987000</p>
         */
        @NameInMap("CreateTimeLong")
        public Long createTimeLong;

        /**
         * <p>Task number.</p>
         * 
         * <strong>example:</strong>
         * <p>f9baa3d5-33b9-4c81-8847-test</p>
         */
        @NameInMap("TaskNo")
        public String taskNo;

        /**
         * <p>Number of domain names included in the job.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("TaskNum")
        public Integer taskNum;

        /**
         * <p>Task Status. Valid values:  </p>
         * <ul>
         * <li><strong>WAITING_EXECUTE</strong>: Waiting for execution;  </li>
         * <li><strong>EXECUTING</strong>: Executing;  </li>
         * <li><strong>COMPLETE</strong>: Execution completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMPLETE</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        /**
         * <p>Task status code. Valid values:  </p>
         * <ul>
         * <li><strong>1</strong>: Waiting for execution;  </li>
         * <li><strong>2</strong>: Executing;  </li>
         * <li><strong>3</strong>: Execution completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TaskStatusCode")
        public Integer taskStatusCode;

        /**
         * <p>Task Type. Valid values:  </p>
         * <ul>
         * <li><strong>CHG_HOLDER</strong>: Modify registrant information;  </li>
         * <li><strong>CHG_DNS</strong>: Modify DNS;  </li>
         * <li><strong>SET_WHOIS_PROTECT</strong>: Enable privacy protection;  </li>
         * <li><strong>UPDATE_ADMIN_CONTACT</strong>: Update administrative contact;  </li>
         * <li><strong>UPDATE_BILLING_CONTACT</strong>: Update billing contact;  </li>
         * <li><strong>UPDATE_TECH_CONTACT</strong>: Update technical contact;  </li>
         * <li><strong>SET_UPDATE_PROHIBITED</strong>: Enable domain name edit lock;  </li>
         * <li><strong>SET_TRANSFER_PROHIBITED</strong>: Enable domain name transfer lock;  </li>
         * <li><strong>ORDER_ACTIVATE</strong>: Create a registration order;  </li>
         * <li><strong>ORDER_RENEW</strong>: Create a renewal order;  </li>
         * <li><strong>ORDER_REDEEM</strong>: Create a redemption order;  </li>
         * <li><strong>CREATE_DNSHOST</strong>: Create a DNS host;  </li>
         * <li><strong>UPDATE_DNSHOST</strong>: Update a DNS host;  </li>
         * <li><strong>UPDATE_REGISTRANT_CONTACT</strong>: Update registrant contact;  </li>
         * <li><strong>DELETE_DOMAIN</strong>: Delete a domain name;  </li>
         * <li><strong>SYNC_DNSHOST</strong>: Synchronize DNS host.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CHG_DNS</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <p>Task type description.</p>
         * 
         * <strong>example:</strong>
         * <p>修改DNS</p>
         */
        @NameInMap("TaskTypeDescription")
        public String taskTypeDescription;

        public static QueryTaskInfoHistoryResponseBodyPrePageCursor build(java.util.Map<String, ?> map) throws Exception {
            QueryTaskInfoHistoryResponseBodyPrePageCursor self = new QueryTaskInfoHistoryResponseBodyPrePageCursor();
            return TeaModel.build(map, self);
        }

        public QueryTaskInfoHistoryResponseBodyPrePageCursor setClientip(String clientip) {
            this.clientip = clientip;
            return this;
        }
        public String getClientip() {
            return this.clientip;
        }

        public QueryTaskInfoHistoryResponseBodyPrePageCursor setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryTaskInfoHistoryResponseBodyPrePageCursor setCreateTimeLong(Long createTimeLong) {
            this.createTimeLong = createTimeLong;
            return this;
        }
        public Long getCreateTimeLong() {
            return this.createTimeLong;
        }

        public QueryTaskInfoHistoryResponseBodyPrePageCursor setTaskNo(String taskNo) {
            this.taskNo = taskNo;
            return this;
        }
        public String getTaskNo() {
            return this.taskNo;
        }

        public QueryTaskInfoHistoryResponseBodyPrePageCursor setTaskNum(Integer taskNum) {
            this.taskNum = taskNum;
            return this;
        }
        public Integer getTaskNum() {
            return this.taskNum;
        }

        public QueryTaskInfoHistoryResponseBodyPrePageCursor setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public QueryTaskInfoHistoryResponseBodyPrePageCursor setTaskStatusCode(Integer taskStatusCode) {
            this.taskStatusCode = taskStatusCode;
            return this;
        }
        public Integer getTaskStatusCode() {
            return this.taskStatusCode;
        }

        public QueryTaskInfoHistoryResponseBodyPrePageCursor setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public QueryTaskInfoHistoryResponseBodyPrePageCursor setTaskTypeDescription(String taskTypeDescription) {
            this.taskTypeDescription = taskTypeDescription;
            return this;
        }
        public String getTaskTypeDescription() {
            return this.taskTypeDescription;
        }

    }

}
