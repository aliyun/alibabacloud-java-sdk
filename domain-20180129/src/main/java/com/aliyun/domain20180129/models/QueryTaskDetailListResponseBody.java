// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryTaskDetailListResponseBody extends TeaModel {
    /**
     * <p>The page number returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    /**
     * <p>The tasks.</p>
     */
    @NameInMap("Data")
    public QueryTaskDetailListResponseBodyData data;

    /**
     * <p>Indicates whether the current page is followed by a page.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NextPage")
    public Boolean nextPage;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Indicates whether the current page is preceded by a page.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PrePage")
    public Boolean prePage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6A2320E4-D870-49C9-A6DC-test</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    public static QueryTaskDetailListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskDetailListResponseBody self = new QueryTaskDetailListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTaskDetailListResponseBody setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public QueryTaskDetailListResponseBody setData(QueryTaskDetailListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTaskDetailListResponseBodyData getData() {
        return this.data;
    }

    public QueryTaskDetailListResponseBody setNextPage(Boolean nextPage) {
        this.nextPage = nextPage;
        return this;
    }
    public Boolean getNextPage() {
        return this.nextPage;
    }

    public QueryTaskDetailListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTaskDetailListResponseBody setPrePage(Boolean prePage) {
        this.prePage = prePage;
        return this;
    }
    public Boolean getPrePage() {
        return this.prePage;
    }

    public QueryTaskDetailListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTaskDetailListResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public QueryTaskDetailListResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static class QueryTaskDetailListResponseBodyDataTaskDetail extends TeaModel {
        /**
         * <p>The time when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-01-25 20:46:57</p>
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
         * <p>The error message returned when the task failed.</p>
         * 
         * <strong>example:</strong>
         * <p>The operation is successful.</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>The cause of a domain name task failure.</p>
         * 
         * <strong>example:</strong>
         * <p>Purchase record exists for the domain name in Aliyun</p>
         */
        @NameInMap("FailReason")
        public String failReason;

        /**
         * <p>The instance ID of the domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>S20179H1BBI9test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of the task details.</p>
         * 
         * <strong>example:</strong>
         * <p>75addb07-28a3-450e-b5ec-test</p>
         */
        @NameInMap("TaskDetailNo")
        public String taskDetailNo;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>60d6e201-8ee5-47ab-8fdc-test</p>
         */
        @NameInMap("TaskNo")
        public String taskNo;

        /**
         * <p>The result of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("TaskResult")
        public String taskResult;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li><strong>WAITING_EXECUTE</strong>: To be executed</li>
         * <li><strong>EXECUTING</strong>: being executed</li>
         * <li><strong>EXECUTE_SUCCESS</strong>: successful</li>
         * <li><strong>EXECUTE_FAILURE</strong>: failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EXECUTE_SUCCESS</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        /**
         * <p>The status code of the task. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: waiting for execution</li>
         * <li><strong>1</strong>: being executed</li>
         * <li><strong>2</strong>: successful</li>
         * <li><strong>3</strong>: failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TaskStatusCode")
        public Integer taskStatusCode;

        /**
         * <p>The task type. Valid values:</p>
         * <ul>
         * <li><strong>CHG_HOLDER</strong>: The task is run to modify the domain name registrant.</li>
         * <li><strong>CHG_DNS</strong>: The task is run to change the Domain Name System (DNS) servers.</li>
         * <li><strong>SET_WHOIS_PROTECT</strong>: The task is run to configure privacy protection for the domain name.</li>
         * <li><strong>UPDATE_ADMIN_CONTACT</strong>: The task is run to modify the information about the administrator of the domain name.</li>
         * <li><strong>UPDATE_BILLING_CONTACT</strong>: The task is run to modify the information about the payer for the domain name.</li>
         * <li><strong>UPDATE_TECH_CONTACT</strong>: The task is run to modify the information about the technical support for the domain name.</li>
         * <li><strong>SET_UPDATE_PROHIBITED</strong>: The task is run to configure the security lock for the domain name.</li>
         * <li><strong>SET_TRANSFER_PROHIBITED</strong>: The task is run to configure the transfer lock for the domain name.</li>
         * <li><strong>ORDER_ACTIVATE</strong>: The task is run to create a registration order for the domain name.</li>
         * <li><strong>ORDER_RENEW</strong>: The task is run to create a renewal order for the domain name.</li>
         * <li><strong>ORDER_REDEEM</strong>: The task is run to create a redemption order for the domain name.</li>
         * <li><strong>CREATE_DNSHOST</strong>: The task is run to create a DNS server for the domain name.</li>
         * <li><strong>UPDATE_DNSHOST</strong>: The task is run to update the information about a DNS server for the domain name.</li>
         * <li><strong>SYNC_DNSHOST</strong>: The task is run to synchronize a DNS server for the domain name.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ORDER_RENEW</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <p>The description of the task type.</p>
         */
        @NameInMap("TaskTypeDescription")
        public String taskTypeDescription;

        /**
         * <p>The number of times the task was retried.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TryCount")
        public Integer tryCount;

        /**
         * <p>The last time when the task was run.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-01-25 20:47:01</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static QueryTaskDetailListResponseBodyDataTaskDetail build(java.util.Map<String, ?> map) throws Exception {
            QueryTaskDetailListResponseBodyDataTaskDetail self = new QueryTaskDetailListResponseBodyDataTaskDetail();
            return TeaModel.build(map, self);
        }

        public QueryTaskDetailListResponseBodyDataTaskDetail setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryTaskDetailListResponseBodyDataTaskDetail setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public QueryTaskDetailListResponseBodyDataTaskDetail setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public QueryTaskDetailListResponseBodyDataTaskDetail setFailReason(String failReason) {
            this.failReason = failReason;
            return this;
        }
        public String getFailReason() {
            return this.failReason;
        }

        public QueryTaskDetailListResponseBodyDataTaskDetail setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryTaskDetailListResponseBodyDataTaskDetail setTaskDetailNo(String taskDetailNo) {
            this.taskDetailNo = taskDetailNo;
            return this;
        }
        public String getTaskDetailNo() {
            return this.taskDetailNo;
        }

        public QueryTaskDetailListResponseBodyDataTaskDetail setTaskNo(String taskNo) {
            this.taskNo = taskNo;
            return this;
        }
        public String getTaskNo() {
            return this.taskNo;
        }

        public QueryTaskDetailListResponseBodyDataTaskDetail setTaskResult(String taskResult) {
            this.taskResult = taskResult;
            return this;
        }
        public String getTaskResult() {
            return this.taskResult;
        }

        public QueryTaskDetailListResponseBodyDataTaskDetail setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public QueryTaskDetailListResponseBodyDataTaskDetail setTaskStatusCode(Integer taskStatusCode) {
            this.taskStatusCode = taskStatusCode;
            return this;
        }
        public Integer getTaskStatusCode() {
            return this.taskStatusCode;
        }

        public QueryTaskDetailListResponseBodyDataTaskDetail setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public QueryTaskDetailListResponseBodyDataTaskDetail setTaskTypeDescription(String taskTypeDescription) {
            this.taskTypeDescription = taskTypeDescription;
            return this;
        }
        public String getTaskTypeDescription() {
            return this.taskTypeDescription;
        }

        public QueryTaskDetailListResponseBodyDataTaskDetail setTryCount(Integer tryCount) {
            this.tryCount = tryCount;
            return this;
        }
        public Integer getTryCount() {
            return this.tryCount;
        }

        public QueryTaskDetailListResponseBodyDataTaskDetail setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class QueryTaskDetailListResponseBodyData extends TeaModel {
        @NameInMap("TaskDetail")
        public java.util.List<QueryTaskDetailListResponseBodyDataTaskDetail> taskDetail;

        public static QueryTaskDetailListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTaskDetailListResponseBodyData self = new QueryTaskDetailListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTaskDetailListResponseBodyData setTaskDetail(java.util.List<QueryTaskDetailListResponseBodyDataTaskDetail> taskDetail) {
            this.taskDetail = taskDetail;
            return this;
        }
        public java.util.List<QueryTaskDetailListResponseBodyDataTaskDetail> getTaskDetail() {
            return this.taskDetail;
        }

    }

}
