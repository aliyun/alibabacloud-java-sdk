// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryTaskDetailHistoryResponseBody extends TeaModel {
    /**
     * <p>Current page cursor.</p>
     */
    @NameInMap("CurrentPageCursor")
    public QueryTaskDetailHistoryResponseBodyCurrentPageCursor currentPageCursor;

    /**
     * <p>Cursor for the next page.</p>
     */
    @NameInMap("NextPageCursor")
    public QueryTaskDetailHistoryResponseBodyNextPageCursor nextPageCursor;

    /**
     * <p>Task detail information.</p>
     */
    @NameInMap("Objects")
    public java.util.List<QueryTaskDetailHistoryResponseBodyObjects> objects;

    /**
     * <p>Paging size.</p>
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
    public QueryTaskDetailHistoryResponseBodyPrePageCursor prePageCursor;

    /**
     * <p>Unique Request access token.</p>
     * 
     * <strong>example:</strong>
     * <p>548CAE74-88F8-402F-8C12-97E747389C51</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryTaskDetailHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskDetailHistoryResponseBody self = new QueryTaskDetailHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTaskDetailHistoryResponseBody setCurrentPageCursor(QueryTaskDetailHistoryResponseBodyCurrentPageCursor currentPageCursor) {
        this.currentPageCursor = currentPageCursor;
        return this;
    }
    public QueryTaskDetailHistoryResponseBodyCurrentPageCursor getCurrentPageCursor() {
        return this.currentPageCursor;
    }

    public QueryTaskDetailHistoryResponseBody setNextPageCursor(QueryTaskDetailHistoryResponseBodyNextPageCursor nextPageCursor) {
        this.nextPageCursor = nextPageCursor;
        return this;
    }
    public QueryTaskDetailHistoryResponseBodyNextPageCursor getNextPageCursor() {
        return this.nextPageCursor;
    }

    public QueryTaskDetailHistoryResponseBody setObjects(java.util.List<QueryTaskDetailHistoryResponseBodyObjects> objects) {
        this.objects = objects;
        return this;
    }
    public java.util.List<QueryTaskDetailHistoryResponseBodyObjects> getObjects() {
        return this.objects;
    }

    public QueryTaskDetailHistoryResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTaskDetailHistoryResponseBody setPrePageCursor(QueryTaskDetailHistoryResponseBodyPrePageCursor prePageCursor) {
        this.prePageCursor = prePageCursor;
        return this;
    }
    public QueryTaskDetailHistoryResponseBodyPrePageCursor getPrePageCursor() {
        return this.prePageCursor;
    }

    public QueryTaskDetailHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryTaskDetailHistoryResponseBodyCurrentPageCursor extends TeaModel {
        /**
         * <p>Job Creation Time.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-07-30 00:00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>Result of task execution.</p>
         * 
         * <strong>example:</strong>
         * <p>执行成功</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>Domain instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>S1234456789</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Task detail ID.</p>
         * 
         * <strong>example:</strong>
         * <p>75addb07-28a3-450e-b5ec-2342</p>
         */
        @NameInMap("TaskDetailNo")
        public String taskDetailNo;

        /**
         * <p>Job number.</p>
         * 
         * <strong>example:</strong>
         * <p>75addb07-28a3-450e-b5ec-test</p>
         */
        @NameInMap("TaskNo")
        public String taskNo;

        /**
         * <p>Task Status. Valid values:  </p>
         * <ul>
         * <li><strong>WAITING_EXECUTE</strong>: Waiting for execution.  </li>
         * <li><strong>EXECUTING</strong>: Executing.  </li>
         * <li><strong>EXECUTE_SUCCESS</strong>: Execution succeeded.  </li>
         * <li><strong>EXECUTE_FAILURE</strong>: Execution failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EXECUTE_SUCCESS</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        /**
         * <p>Job Status code. Valid values:  </p>
         * <ul>
         * <li><strong>0</strong>: Waiting to execute.  </li>
         * <li><strong>1</strong>: Executing.  </li>
         * <li><strong>2</strong>: Succeeded.  </li>
         * <li><strong>3</strong>: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TaskStatusCode")
        public Integer taskStatusCode;

        /**
         * <p>Task Type. Valid values:  </p>
         * <ul>
         * <li><strong>CHG_HOLDER</strong>: Modify registrant information.  </li>
         * <li><strong>CHG_DNS</strong>: Modify DNS.  </li>
         * <li><strong>SET_WHOIS_PROTECT</strong>: Enable privacy protection.  </li>
         * <li><strong>UPDATE_ADMIN_CONTACT</strong>: Modify administrative contact information.  </li>
         * <li><strong>UPDATE_BILLING_CONTACT</strong>: Modify billing contact information.  </li>
         * <li><strong>UPDATE_TECH_CONTACT</strong>: Modify technical contact information.  </li>
         * <li><strong>SET_UPDATE_PROHIBITED</strong>: Enable domain name edit lock.  </li>
         * <li><strong>SET_TRANSFER_PROHIBITED</strong>: Enable domain name transfer lock.  </li>
         * <li><strong>ORDER_ACTIVATE</strong>: Create a registration order.  </li>
         * <li><strong>ORDER_RENEW</strong>: Create a renewal order.  </li>
         * <li><strong>ORDER_REDEEM</strong>: Create a redemption order.  </li>
         * <li><strong>CREATE_DNSHOST</strong>: Create a DNS host.  </li>
         * <li><strong>UPDATE_DNSHOST</strong>: Update a DNS host.  </li>
         * <li><strong>SYNC_DNSHOST</strong>: Synchronize a DNS host.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CHG_DNS</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <p>Description of the task type.</p>
         * 
         * <strong>example:</strong>
         * <p>修改DNS</p>
         */
        @NameInMap("TaskTypeDescription")
        public String taskTypeDescription;

        /**
         * <p>Retry Count of job details.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TryCount")
        public Integer tryCount;

        /**
         * <p>The most recent task execution time.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-07-30 00:00:00</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static QueryTaskDetailHistoryResponseBodyCurrentPageCursor build(java.util.Map<String, ?> map) throws Exception {
            QueryTaskDetailHistoryResponseBodyCurrentPageCursor self = new QueryTaskDetailHistoryResponseBodyCurrentPageCursor();
            return TeaModel.build(map, self);
        }

        public QueryTaskDetailHistoryResponseBodyCurrentPageCursor setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryTaskDetailHistoryResponseBodyCurrentPageCursor setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public QueryTaskDetailHistoryResponseBodyCurrentPageCursor setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public QueryTaskDetailHistoryResponseBodyCurrentPageCursor setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryTaskDetailHistoryResponseBodyCurrentPageCursor setTaskDetailNo(String taskDetailNo) {
            this.taskDetailNo = taskDetailNo;
            return this;
        }
        public String getTaskDetailNo() {
            return this.taskDetailNo;
        }

        public QueryTaskDetailHistoryResponseBodyCurrentPageCursor setTaskNo(String taskNo) {
            this.taskNo = taskNo;
            return this;
        }
        public String getTaskNo() {
            return this.taskNo;
        }

        public QueryTaskDetailHistoryResponseBodyCurrentPageCursor setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public QueryTaskDetailHistoryResponseBodyCurrentPageCursor setTaskStatusCode(Integer taskStatusCode) {
            this.taskStatusCode = taskStatusCode;
            return this;
        }
        public Integer getTaskStatusCode() {
            return this.taskStatusCode;
        }

        public QueryTaskDetailHistoryResponseBodyCurrentPageCursor setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public QueryTaskDetailHistoryResponseBodyCurrentPageCursor setTaskTypeDescription(String taskTypeDescription) {
            this.taskTypeDescription = taskTypeDescription;
            return this;
        }
        public String getTaskTypeDescription() {
            return this.taskTypeDescription;
        }

        public QueryTaskDetailHistoryResponseBodyCurrentPageCursor setTryCount(Integer tryCount) {
            this.tryCount = tryCount;
            return this;
        }
        public Integer getTryCount() {
            return this.tryCount;
        }

        public QueryTaskDetailHistoryResponseBodyCurrentPageCursor setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class QueryTaskDetailHistoryResponseBodyNextPageCursor extends TeaModel {
        /**
         * <p>Creation time of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-07-30 00:00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>Result of task execution.</p>
         * 
         * <strong>example:</strong>
         * <p>域名有禁止更新锁</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>Domain name instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>S1234567890</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Task detail number.</p>
         * 
         * <strong>example:</strong>
         * <p>75addb07-28a3-450e-b5ec-2424</p>
         */
        @NameInMap("TaskDetailNo")
        public String taskDetailNo;

        /**
         * <p>Job number.</p>
         * 
         * <strong>example:</strong>
         * <p>75addb07-28a3-450e-b5ec-test</p>
         */
        @NameInMap("TaskNo")
        public String taskNo;

        /**
         * <p>Task Status. Valid values:</p>
         * <ul>
         * <li><strong>WAITING_EXECUTE</strong>: Waiting for execution.</li>
         * <li><strong>EXECUTING</strong>: Executing.</li>
         * <li><strong>EXECUTE_SUCCESS</strong>: Succeeded.</li>
         * <li><strong>EXECUTE_FAILURE</strong>: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EXECUTE_FAILURE</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        /**
         * <p>Task status code. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Waiting for execution.</li>
         * <li><strong>1</strong>: Executing.</li>
         * <li><strong>2</strong>: Succeeded.</li>
         * <li><strong>3</strong>: Failed.</li>
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
         * <li><strong>CHG_HOLDER</strong>: Modify registrant information.</li>
         * <li><strong>CHG_DNS</strong>: Modify DNS.</li>
         * <li><strong>SET_WHOIS_PROTECT</strong>: Enable privacy protection.</li>
         * <li><strong>UPDATE_ADMIN_CONTACT</strong>: Modify administrator contact information.</li>
         * <li><strong>UPDATE_BILLING_CONTACT</strong>: Modify billing contact information.</li>
         * <li><strong>UPDATE_TECH_CONTACT</strong>: Modify technical contact information.</li>
         * <li><strong>SET_UPDATE_PROHIBITED</strong>: Enable Edit Lock.</li>
         * <li><strong>SET_TRANSFER_PROHIBITED</strong>: Enable transfer lock.</li>
         * <li><strong>ORDER_ACTIVATE</strong>: Create a registration order.</li>
         * <li><strong>ORDER_RENEW</strong>: Create a renewal order.</li>
         * <li><strong>ORDER_REDEEM</strong>: Create a redemption order.</li>
         * <li><strong>CREATE_DNSHOST</strong>: Create a DNS host.</li>
         * <li><strong>UPDATE_DNSHOST</strong>: Update a DNS host.</li>
         * <li><strong>SYNC_DNSHOST</strong>: Synchronize a DNS host.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CHG_DNS</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <p>Task Type Description.</p>
         * 
         * <strong>example:</strong>
         * <p>修改DNS</p>
         */
        @NameInMap("TaskTypeDescription")
        public String taskTypeDescription;

        /**
         * <p>Number of retries for the task details.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TryCount")
        public Integer tryCount;

        /**
         * <p>The most recent running time of the job details.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-07-30 00:00:00</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static QueryTaskDetailHistoryResponseBodyNextPageCursor build(java.util.Map<String, ?> map) throws Exception {
            QueryTaskDetailHistoryResponseBodyNextPageCursor self = new QueryTaskDetailHistoryResponseBodyNextPageCursor();
            return TeaModel.build(map, self);
        }

        public QueryTaskDetailHistoryResponseBodyNextPageCursor setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryTaskDetailHistoryResponseBodyNextPageCursor setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public QueryTaskDetailHistoryResponseBodyNextPageCursor setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public QueryTaskDetailHistoryResponseBodyNextPageCursor setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryTaskDetailHistoryResponseBodyNextPageCursor setTaskDetailNo(String taskDetailNo) {
            this.taskDetailNo = taskDetailNo;
            return this;
        }
        public String getTaskDetailNo() {
            return this.taskDetailNo;
        }

        public QueryTaskDetailHistoryResponseBodyNextPageCursor setTaskNo(String taskNo) {
            this.taskNo = taskNo;
            return this;
        }
        public String getTaskNo() {
            return this.taskNo;
        }

        public QueryTaskDetailHistoryResponseBodyNextPageCursor setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public QueryTaskDetailHistoryResponseBodyNextPageCursor setTaskStatusCode(Integer taskStatusCode) {
            this.taskStatusCode = taskStatusCode;
            return this;
        }
        public Integer getTaskStatusCode() {
            return this.taskStatusCode;
        }

        public QueryTaskDetailHistoryResponseBodyNextPageCursor setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public QueryTaskDetailHistoryResponseBodyNextPageCursor setTaskTypeDescription(String taskTypeDescription) {
            this.taskTypeDescription = taskTypeDescription;
            return this;
        }
        public String getTaskTypeDescription() {
            return this.taskTypeDescription;
        }

        public QueryTaskDetailHistoryResponseBodyNextPageCursor setTryCount(Integer tryCount) {
            this.tryCount = tryCount;
            return this;
        }
        public Integer getTryCount() {
            return this.tryCount;
        }

        public QueryTaskDetailHistoryResponseBodyNextPageCursor setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class QueryTaskDetailHistoryResponseBodyObjects extends TeaModel {
        /**
         * <p>The creation time of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-07-30 00:00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The result of the job execution.</p>
         * 
         * <strong>example:</strong>
         * <p>域名有禁止更新锁</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>The instance ID of the domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>S123456789</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Task detail number.</p>
         * 
         * <strong>example:</strong>
         * <p>75addb07-28a3-450e-b5ec-4234</p>
         */
        @NameInMap("TaskDetailNo")
        public String taskDetailNo;

        /**
         * <p>The job number.</p>
         * 
         * <strong>example:</strong>
         * <p>75addb07-28a3-450e-b5ec-test</p>
         */
        @NameInMap("TaskNo")
        public String taskNo;

        /**
         * <p>Task Status. Valid values:  </p>
         * <ul>
         * <li><strong>WAITING_EXECUTE</strong>: Waiting for execution.  </li>
         * <li><strong>EXECUTING</strong>: Executing.  </li>
         * <li><strong>EXECUTE_SUCCESS</strong>: Execution succeeded.  </li>
         * <li><strong>EXECUTE_FAILURE</strong>: Execution failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EXECUTE_FAILURE</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        /**
         * <p>The job status code. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Waiting for execution.</li>
         * <li><strong>1</strong>: Executing.</li>
         * <li><strong>2</strong>: Succeeded.</li>
         * <li><strong>3</strong>: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TaskStatusCode")
        public Integer taskStatusCode;

        /**
         * <p>The task type. Valid values:</p>
         * <ul>
         * <li><strong>CHG_HOLDER</strong>: Modify registrant information.</li>
         * <li><strong>CHG_DNS</strong>: Modify DNS settings.</li>
         * <li><strong>SET_WHOIS_PROTECT</strong>: Enable privacy protection.</li>
         * <li><strong>UPDATE_ADMIN_CONTACT</strong>: Update administrative contact information.</li>
         * <li><strong>UPDATE_BILLING_CONTACT</strong>: Update billing contact information.</li>
         * <li><strong>UPDATE_TECH_CONTACT</strong>: Update technical contact information.</li>
         * <li><strong>SET_UPDATE_PROHIBITED</strong>: Enable the Edit Lock for the domain name.</li>
         * <li><strong>SET_TRANSFER_PROHIBITED</strong>: Enable the transfer lock for the domain name.</li>
         * <li><strong>ORDER_ACTIVATE</strong>: Create a registration order.</li>
         * <li><strong>ORDER_RENEW</strong>: Create a renewal order.</li>
         * <li><strong>ORDER_REDEEM</strong>: Create a redemption order.</li>
         * <li><strong>CREATE_DNSHOST</strong>: Create a DNS host.</li>
         * <li><strong>UPDATE_DNSHOST</strong>: Update a DNS host.</li>
         * <li><strong>SYNC_DNSHOST</strong>: Synchronize a DNS host.</li>
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

        /**
         * <p>Number of retries for the task detail.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TryCount")
        public Integer tryCount;

        /**
         * <p>The running time of the most recent job execution.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-07-30 00:00:00</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static QueryTaskDetailHistoryResponseBodyObjects build(java.util.Map<String, ?> map) throws Exception {
            QueryTaskDetailHistoryResponseBodyObjects self = new QueryTaskDetailHistoryResponseBodyObjects();
            return TeaModel.build(map, self);
        }

        public QueryTaskDetailHistoryResponseBodyObjects setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryTaskDetailHistoryResponseBodyObjects setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public QueryTaskDetailHistoryResponseBodyObjects setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public QueryTaskDetailHistoryResponseBodyObjects setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryTaskDetailHistoryResponseBodyObjects setTaskDetailNo(String taskDetailNo) {
            this.taskDetailNo = taskDetailNo;
            return this;
        }
        public String getTaskDetailNo() {
            return this.taskDetailNo;
        }

        public QueryTaskDetailHistoryResponseBodyObjects setTaskNo(String taskNo) {
            this.taskNo = taskNo;
            return this;
        }
        public String getTaskNo() {
            return this.taskNo;
        }

        public QueryTaskDetailHistoryResponseBodyObjects setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public QueryTaskDetailHistoryResponseBodyObjects setTaskStatusCode(Integer taskStatusCode) {
            this.taskStatusCode = taskStatusCode;
            return this;
        }
        public Integer getTaskStatusCode() {
            return this.taskStatusCode;
        }

        public QueryTaskDetailHistoryResponseBodyObjects setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public QueryTaskDetailHistoryResponseBodyObjects setTaskTypeDescription(String taskTypeDescription) {
            this.taskTypeDescription = taskTypeDescription;
            return this;
        }
        public String getTaskTypeDescription() {
            return this.taskTypeDescription;
        }

        public QueryTaskDetailHistoryResponseBodyObjects setTryCount(Integer tryCount) {
            this.tryCount = tryCount;
            return this;
        }
        public Integer getTryCount() {
            return this.tryCount;
        }

        public QueryTaskDetailHistoryResponseBodyObjects setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class QueryTaskDetailHistoryResponseBodyPrePageCursor extends TeaModel {
        /**
         * <p>Task creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-07-30 00:00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>Result of task execution.</p>
         * 
         * <strong>example:</strong>
         * <p>域名有禁止更新锁</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>Domain instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>S123456789</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Task detail number.</p>
         * 
         * <strong>example:</strong>
         * <p>75addb07-28a3-450e-b5ec-123</p>
         */
        @NameInMap("TaskDetailNo")
        public String taskDetailNo;

        /**
         * <p>Task number.</p>
         * 
         * <strong>example:</strong>
         * <p>75addb07-28a3-450e-b5ec-test</p>
         */
        @NameInMap("TaskNo")
        public String taskNo;

        /**
         * <p>Task Status. Valid values:</p>
         * <ul>
         * <li><strong>WAITING_EXECUTE</strong>: Waiting for execution.</li>
         * <li><strong>EXECUTING</strong>: Executing.</li>
         * <li><strong>EXECUTE_SUCCESS</strong>: Execution succeeded.</li>
         * <li><strong>EXECUTE_FAILURE</strong>: Execution failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EXECUTE_FAILURE</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        /**
         * <p>Task status code. Valid values:  </p>
         * <ul>
         * <li><strong>0</strong>: Waiting for execution.  </li>
         * <li><strong>1</strong>: Executing.  </li>
         * <li><strong>2</strong>: Execution succeeded.  </li>
         * <li><strong>3</strong>: Execution failed.</li>
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
         * <li><strong>CHG_HOLDER</strong>: Modify registrant information.</li>
         * <li><strong>CHG_DNS</strong>: Modify DNS.</li>
         * <li><strong>SET_WHOIS_PROTECT</strong>: Enable privacy protection.</li>
         * <li><strong>UPDATE_ADMIN_CONTACT</strong>: Modify administrative contact information.</li>
         * <li><strong>UPDATE_BILLING_CONTACT</strong>: Modify billing contact information.</li>
         * <li><strong>UPDATE_TECH_CONTACT</strong>: Modify technical contact information.</li>
         * <li><strong>SET_UPDATE_PROHIBITED</strong>: Enable domain name edit lock.</li>
         * <li><strong>SET_TRANSFER_PROHIBITED</strong>: Enable domain name transfer lock.</li>
         * <li><strong>ORDER_ACTIVATE</strong>: Create a registration order.</li>
         * <li><strong>ORDER_RENEW</strong>: Create a renewal order.</li>
         * <li><strong>ORDER_REDEEM</strong>: Create a redemption order.</li>
         * <li><strong>CREATE_DNSHOST</strong>: Create a DNS host.</li>
         * <li><strong>UPDATE_DNSHOST</strong>: Update a DNS host.</li>
         * <li><strong>SYNC_DNSHOST</strong>: Synchronize a DNS host.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CHG_DNS</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <p>Description of the task type.</p>
         * 
         * <strong>example:</strong>
         * <p>修改DNS</p>
         */
        @NameInMap("TaskTypeDescription")
        public String taskTypeDescription;

        /**
         * <p>Number of retries for the task detail.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TryCount")
        public Integer tryCount;

        /**
         * <p>The most recent running time of the task details.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-07-30 00:00:00</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static QueryTaskDetailHistoryResponseBodyPrePageCursor build(java.util.Map<String, ?> map) throws Exception {
            QueryTaskDetailHistoryResponseBodyPrePageCursor self = new QueryTaskDetailHistoryResponseBodyPrePageCursor();
            return TeaModel.build(map, self);
        }

        public QueryTaskDetailHistoryResponseBodyPrePageCursor setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryTaskDetailHistoryResponseBodyPrePageCursor setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public QueryTaskDetailHistoryResponseBodyPrePageCursor setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public QueryTaskDetailHistoryResponseBodyPrePageCursor setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryTaskDetailHistoryResponseBodyPrePageCursor setTaskDetailNo(String taskDetailNo) {
            this.taskDetailNo = taskDetailNo;
            return this;
        }
        public String getTaskDetailNo() {
            return this.taskDetailNo;
        }

        public QueryTaskDetailHistoryResponseBodyPrePageCursor setTaskNo(String taskNo) {
            this.taskNo = taskNo;
            return this;
        }
        public String getTaskNo() {
            return this.taskNo;
        }

        public QueryTaskDetailHistoryResponseBodyPrePageCursor setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public QueryTaskDetailHistoryResponseBodyPrePageCursor setTaskStatusCode(Integer taskStatusCode) {
            this.taskStatusCode = taskStatusCode;
            return this;
        }
        public Integer getTaskStatusCode() {
            return this.taskStatusCode;
        }

        public QueryTaskDetailHistoryResponseBodyPrePageCursor setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public QueryTaskDetailHistoryResponseBodyPrePageCursor setTaskTypeDescription(String taskTypeDescription) {
            this.taskTypeDescription = taskTypeDescription;
            return this;
        }
        public String getTaskTypeDescription() {
            return this.taskTypeDescription;
        }

        public QueryTaskDetailHistoryResponseBodyPrePageCursor setTryCount(Integer tryCount) {
            this.tryCount = tryCount;
            return this;
        }
        public Integer getTryCount() {
            return this.tryCount;
        }

        public QueryTaskDetailHistoryResponseBodyPrePageCursor setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
