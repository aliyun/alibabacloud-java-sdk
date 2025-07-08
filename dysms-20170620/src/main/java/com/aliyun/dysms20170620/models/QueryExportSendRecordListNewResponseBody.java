// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryExportSendRecordListNewResponseBody extends TeaModel {
    @NameInMap("List")
    public QueryExportSendRecordListNewResponseBodyList list;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    public static QueryExportSendRecordListNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryExportSendRecordListNewResponseBody self = new QueryExportSendRecordListNewResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryExportSendRecordListNewResponseBody setList(QueryExportSendRecordListNewResponseBodyList list) {
        this.list = list;
        return this;
    }
    public QueryExportSendRecordListNewResponseBodyList getList() {
        return this.list;
    }

    public QueryExportSendRecordListNewResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryExportSendRecordListNewResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryExportSendRecordListNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryExportSendRecordListNewResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class QueryExportSendRecordListNewResponseBodyListFcFileUpInsResponse extends TeaModel {
        @NameInMap("FileFeature")
        public String fileFeature;

        @NameInMap("FileUrl")
        public String fileUrl;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("HandlerStatus")
        public Integer handlerStatus;

        @NameInMap("Id")
        public Long id;

        public static QueryExportSendRecordListNewResponseBodyListFcFileUpInsResponse build(java.util.Map<String, ?> map) throws Exception {
            QueryExportSendRecordListNewResponseBodyListFcFileUpInsResponse self = new QueryExportSendRecordListNewResponseBodyListFcFileUpInsResponse();
            return TeaModel.build(map, self);
        }

        public QueryExportSendRecordListNewResponseBodyListFcFileUpInsResponse setFileFeature(String fileFeature) {
            this.fileFeature = fileFeature;
            return this;
        }
        public String getFileFeature() {
            return this.fileFeature;
        }

        public QueryExportSendRecordListNewResponseBodyListFcFileUpInsResponse setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public QueryExportSendRecordListNewResponseBodyListFcFileUpInsResponse setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryExportSendRecordListNewResponseBodyListFcFileUpInsResponse setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryExportSendRecordListNewResponseBodyListFcFileUpInsResponse setHandlerStatus(Integer handlerStatus) {
            this.handlerStatus = handlerStatus;
            return this;
        }
        public Integer getHandlerStatus() {
            return this.handlerStatus;
        }

        public QueryExportSendRecordListNewResponseBodyListFcFileUpInsResponse setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class QueryExportSendRecordListNewResponseBodyList extends TeaModel {
        @NameInMap("FcFileUpInsResponse")
        public java.util.List<QueryExportSendRecordListNewResponseBodyListFcFileUpInsResponse> fcFileUpInsResponse;

        public static QueryExportSendRecordListNewResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QueryExportSendRecordListNewResponseBodyList self = new QueryExportSendRecordListNewResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QueryExportSendRecordListNewResponseBodyList setFcFileUpInsResponse(java.util.List<QueryExportSendRecordListNewResponseBodyListFcFileUpInsResponse> fcFileUpInsResponse) {
            this.fcFileUpInsResponse = fcFileUpInsResponse;
            return this;
        }
        public java.util.List<QueryExportSendRecordListNewResponseBodyListFcFileUpInsResponse> getFcFileUpInsResponse() {
            return this.fcFileUpInsResponse;
        }

    }

}
