// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListCheckProcessesResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListCheckProcessesResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0000-ABCD-EF****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListCheckProcessesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCheckProcessesResponseBody self = new ListCheckProcessesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCheckProcessesResponseBody setPagingInfo(ListCheckProcessesResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListCheckProcessesResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListCheckProcessesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCheckProcessesResponseBodyPagingInfoCheckProcesses extends TeaModel {
        /**
         * <p>Extension point event encoding.</p>
         * 
         * <strong>example:</strong>
         * <p>commit-file</p>
         */
        @NameInMap("EventCode")
        public String eventCode;

        /**
         * <p>The name of the extension point event.</p>
         * 
         * <strong>example:</strong>
         * <p>DnsEvent</p>
         */
        @NameInMap("EventName")
        public String eventName;

        /**
         * <p>The English name of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>Pre-event for Node Commit</p>
         */
        @NameInMap("EventNameEn")
        public String eventNameEn;

        /**
         * <p>DataWorks the message ID of the open message. After an extended point event is triggered, you can obtain the message ID from the received event message.</p>
         * 
         * <strong>example:</strong>
         * <p>b824a5de-4223-4315-af3e-c4449d236db4</p>
         */
        @NameInMap("MessageId")
        public String messageId;

        /**
         * <p>The operator ID.</p>
         * 
         * <strong>example:</strong>
         * <p>297635</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The ID of the process instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rdk_generate_d395da25-b0d3-4114-b2a5-d0247444a661_none_3496903_365203</p>
         */
        @NameInMap("ProcessId")
        public String processId;

        /**
         * <p>The name of the check object, such as the file name or node name.</p>
         * 
         * <strong>example:</strong>
         * <p>odps_sql_test</p>
         */
        @NameInMap("ProcessName")
        public String processName;

        /**
         * <p>The ID of the DataWorks workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>32563</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The status of the extender check.</p>
         * <ul>
         * <li>CHECKING CHECKING</li>
         * <li>PASSED the pass check</li>
         * <li>BLOCKED check failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CHECKING</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListCheckProcessesResponseBodyPagingInfoCheckProcesses build(java.util.Map<String, ?> map) throws Exception {
            ListCheckProcessesResponseBodyPagingInfoCheckProcesses self = new ListCheckProcessesResponseBodyPagingInfoCheckProcesses();
            return TeaModel.build(map, self);
        }

        public ListCheckProcessesResponseBodyPagingInfoCheckProcesses setEventCode(String eventCode) {
            this.eventCode = eventCode;
            return this;
        }
        public String getEventCode() {
            return this.eventCode;
        }

        public ListCheckProcessesResponseBodyPagingInfoCheckProcesses setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public ListCheckProcessesResponseBodyPagingInfoCheckProcesses setEventNameEn(String eventNameEn) {
            this.eventNameEn = eventNameEn;
            return this;
        }
        public String getEventNameEn() {
            return this.eventNameEn;
        }

        public ListCheckProcessesResponseBodyPagingInfoCheckProcesses setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public ListCheckProcessesResponseBodyPagingInfoCheckProcesses setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListCheckProcessesResponseBodyPagingInfoCheckProcesses setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

        public ListCheckProcessesResponseBodyPagingInfoCheckProcesses setProcessName(String processName) {
            this.processName = processName;
            return this;
        }
        public String getProcessName() {
            return this.processName;
        }

        public ListCheckProcessesResponseBodyPagingInfoCheckProcesses setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListCheckProcessesResponseBodyPagingInfoCheckProcesses setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListCheckProcessesResponseBodyPagingInfo extends TeaModel {
        /**
         * <p>The check details of the extension.</p>
         */
        @NameInMap("CheckProcesses")
        public java.util.List<ListCheckProcessesResponseBodyPagingInfoCheckProcesses> checkProcesses;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries displayed on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListCheckProcessesResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListCheckProcessesResponseBodyPagingInfo self = new ListCheckProcessesResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListCheckProcessesResponseBodyPagingInfo setCheckProcesses(java.util.List<ListCheckProcessesResponseBodyPagingInfoCheckProcesses> checkProcesses) {
            this.checkProcesses = checkProcesses;
            return this;
        }
        public java.util.List<ListCheckProcessesResponseBodyPagingInfoCheckProcesses> getCheckProcesses() {
            return this.checkProcesses;
        }

        public ListCheckProcessesResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListCheckProcessesResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCheckProcessesResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
