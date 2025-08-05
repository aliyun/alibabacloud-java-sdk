// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class ListDIJobEventsResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListDIJobEventsResponseBodyPagingInfo pagingInfo;

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
        @NameInMap("Action")
        public String action;

        @NameInMap("Channels")
        public String channels;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Detail")
        public String detail;

        @NameInMap("DstSql")
        public String dstSql;

        @NameInMap("DstTable")
        public String dstTable;

        @NameInMap("FailoverMessage")
        public String failoverMessage;

        @NameInMap("Id")
        public String id;

        @NameInMap("Severity")
        public String severity;

        @NameInMap("SrcSql")
        public String srcSql;

        @NameInMap("SrcTable")
        public String srcTable;

        @NameInMap("Status")
        public String status;

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
        @NameInMap("DIJobEvent")
        public java.util.List<ListDIJobEventsResponseBodyPagingInfoDIJobEvent> DIJobEvent;

        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

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
