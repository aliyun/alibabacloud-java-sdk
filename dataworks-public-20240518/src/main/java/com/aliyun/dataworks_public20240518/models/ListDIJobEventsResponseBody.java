// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDIJobEventsResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListDIJobEventsResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID. You can use the ID to query logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>645F6D68-9C29-5961-80B1-BDD4B794C22D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDIJobEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDIJobEventsResponseBody self = new ListDIJobEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDIJobEventsResponseBody setPagingInfo(ListDIJobEventsResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListDIJobEventsResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListDIJobEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDIJobEventsResponseBodyPagingInfoDIJobEvent extends TeaModel {
        /**
         * <p>The processing result of the DDL event. Valid values: Critical, Ignore, Normal, and Warning.</p>
         * 
         * <strong>example:</strong>
         * <p>Ignore</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The alert notification method. Valid values: Phone, Mail, Sms, Ding, and Webhook.</p>
         * 
         * <strong>example:</strong>
         * <p>Phone</p>
         */
        @NameInMap("Channels")
        public String channels;

        /**
         * <p>The time when the event was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1663573162</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The alert details.</p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <p>The DDL statement of the destination table.</p>
         * 
         * <strong>example:</strong>
         * <p>alter table table2 ***</p>
         */
        @NameInMap("DstSql")
        public String dstSql;

        /**
         * <p>The name of the destination table.</p>
         * 
         * <strong>example:</strong>
         * <p>table2</p>
         */
        @NameInMap("DstTable")
        public String dstTable;

        /**
         * <p>The error logs for failovers.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-29 15:11:31,377 [main] INFO com.<em>.<strong>.di.core.metrics.:21 []  {</strong></em><em>} 
         * 2024-05-29 15:11:31,384 [main] INFO <em>.aliyun.</em>.di.</em>.<em>.metrics.</em>:27 [] - Open MarioDiReporter 
         * 2024-05-29 15:11:33,248 [flink-akka.<em>.</em>-dispatcher-17] INFO</p>
         */
        @NameInMap("FailoverMessage")
        public String failoverMessage;

        /**
         * <p>The event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The severity level of the alert. Valid values: Warning and Critical.</p>
         * 
         * <strong>example:</strong>
         * <p>Warning</p>
         */
        @NameInMap("Severity")
        public String severity;

        /**
         * <p>The DDL statement of the source table.</p>
         * 
         * <strong>example:</strong>
         * <p>alter table table1 ***</p>
         */
        @NameInMap("SrcSql")
        public String srcSql;

        /**
         * <p>The name of the source table.</p>
         * 
         * <strong>example:</strong>
         * <p>table1</p>
         */
        @NameInMap("SrcTable")
        public String srcTable;

        /**
         * <p>The sending status of an alert notification. Valid values: Success, Fail, and Silence.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the alert event.</p>
         * <ul>
         * <li>Heartbeat</li>
         * <li>Delay</li>
         * <li>FailoverCount</li>
         * <li>DdlReport</li>
         * <li>ResourceUtilization</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Delay</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListDIJobEventsResponseBodyPagingInfoDIJobEvent build(java.util.Map<String, ?> map) throws Exception {
            ListDIJobEventsResponseBodyPagingInfoDIJobEvent self = new ListDIJobEventsResponseBodyPagingInfoDIJobEvent();
            return TeaModel.build(map, self);
        }

        public ListDIJobEventsResponseBodyPagingInfoDIJobEvent setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ListDIJobEventsResponseBodyPagingInfoDIJobEvent setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public ListDIJobEventsResponseBodyPagingInfoDIJobEvent setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListDIJobEventsResponseBodyPagingInfoDIJobEvent setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public ListDIJobEventsResponseBodyPagingInfoDIJobEvent setDstSql(String dstSql) {
            this.dstSql = dstSql;
            return this;
        }
        public String getDstSql() {
            return this.dstSql;
        }

        public ListDIJobEventsResponseBodyPagingInfoDIJobEvent setDstTable(String dstTable) {
            this.dstTable = dstTable;
            return this;
        }
        public String getDstTable() {
            return this.dstTable;
        }

        public ListDIJobEventsResponseBodyPagingInfoDIJobEvent setFailoverMessage(String failoverMessage) {
            this.failoverMessage = failoverMessage;
            return this;
        }
        public String getFailoverMessage() {
            return this.failoverMessage;
        }

        public ListDIJobEventsResponseBodyPagingInfoDIJobEvent setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListDIJobEventsResponseBodyPagingInfoDIJobEvent setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public ListDIJobEventsResponseBodyPagingInfoDIJobEvent setSrcSql(String srcSql) {
            this.srcSql = srcSql;
            return this;
        }
        public String getSrcSql() {
            return this.srcSql;
        }

        public ListDIJobEventsResponseBodyPagingInfoDIJobEvent setSrcTable(String srcTable) {
            this.srcTable = srcTable;
            return this;
        }
        public String getSrcTable() {
            return this.srcTable;
        }

        public ListDIJobEventsResponseBodyPagingInfoDIJobEvent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDIJobEventsResponseBodyPagingInfoDIJobEvent setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDIJobEventsResponseBodyPagingInfo extends TeaModel {
        /**
         * <p>The events returned. The value of this parameter is an array.</p>
         */
        @NameInMap("DIJobEvent")
        public java.util.List<ListDIJobEventsResponseBodyPagingInfoDIJobEvent> DIJobEvent;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Long pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2524</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListDIJobEventsResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDIJobEventsResponseBodyPagingInfo self = new ListDIJobEventsResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListDIJobEventsResponseBodyPagingInfo setDIJobEvent(java.util.List<ListDIJobEventsResponseBodyPagingInfoDIJobEvent> DIJobEvent) {
            this.DIJobEvent = DIJobEvent;
            return this;
        }
        public java.util.List<ListDIJobEventsResponseBodyPagingInfoDIJobEvent> getDIJobEvent() {
            return this.DIJobEvent;
        }

        public ListDIJobEventsResponseBodyPagingInfo setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListDIJobEventsResponseBodyPagingInfo setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListDIJobEventsResponseBodyPagingInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
