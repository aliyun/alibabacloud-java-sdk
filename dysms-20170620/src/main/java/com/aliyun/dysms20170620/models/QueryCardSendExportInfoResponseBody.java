// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryCardSendExportInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Model")
    public QueryCardSendExportInfoResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryCardSendExportInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCardSendExportInfoResponseBody self = new QueryCardSendExportInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCardSendExportInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCardSendExportInfoResponseBody setModel(QueryCardSendExportInfoResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public QueryCardSendExportInfoResponseBodyModel getModel() {
        return this.model;
    }

    public QueryCardSendExportInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCardSendExportInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryCardSendExportInfoResponseBodyModelRecords extends TeaModel {
        @NameInMap("Ext")
        public String ext;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("OssUrl")
        public String ossUrl;

        @NameInMap("Pid")
        public Long pid;

        @NameInMap("Status")
        public Long status;

        @NameInMap("Type")
        public Long type;

        @NameInMap("UserId")
        public String userId;

        public static QueryCardSendExportInfoResponseBodyModelRecords build(java.util.Map<String, ?> map) throws Exception {
            QueryCardSendExportInfoResponseBodyModelRecords self = new QueryCardSendExportInfoResponseBodyModelRecords();
            return TeaModel.build(map, self);
        }

        public QueryCardSendExportInfoResponseBodyModelRecords setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

        public QueryCardSendExportInfoResponseBodyModelRecords setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public QueryCardSendExportInfoResponseBodyModelRecords setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryCardSendExportInfoResponseBodyModelRecords setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public QueryCardSendExportInfoResponseBodyModelRecords setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryCardSendExportInfoResponseBodyModelRecords setOssUrl(String ossUrl) {
            this.ossUrl = ossUrl;
            return this;
        }
        public String getOssUrl() {
            return this.ossUrl;
        }

        public QueryCardSendExportInfoResponseBodyModelRecords setPid(Long pid) {
            this.pid = pid;
            return this;
        }
        public Long getPid() {
            return this.pid;
        }

        public QueryCardSendExportInfoResponseBodyModelRecords setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public QueryCardSendExportInfoResponseBodyModelRecords setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

        public QueryCardSendExportInfoResponseBodyModelRecords setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class QueryCardSendExportInfoResponseBodyModel extends TeaModel {
        @NameInMap("PageNo")
        public Long pageNo;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Records")
        public java.util.List<QueryCardSendExportInfoResponseBodyModelRecords> records;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static QueryCardSendExportInfoResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryCardSendExportInfoResponseBodyModel self = new QueryCardSendExportInfoResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryCardSendExportInfoResponseBodyModel setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public QueryCardSendExportInfoResponseBodyModel setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryCardSendExportInfoResponseBodyModel setRecords(java.util.List<QueryCardSendExportInfoResponseBodyModelRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<QueryCardSendExportInfoResponseBodyModelRecords> getRecords() {
            return this.records;
        }

        public QueryCardSendExportInfoResponseBodyModel setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
