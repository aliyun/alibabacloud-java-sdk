// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class QueryTicketResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public QueryTicketResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static QueryTicketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTicketResponseBody self = new QueryTicketResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTicketResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryTicketResponseBody setData(QueryTicketResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTicketResponseBodyData getData() {
        return this.data;
    }

    public QueryTicketResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTicketResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryTicketResponseBodyDataList extends TeaModel {
        @NameInMap("CaseId")
        public Long caseId;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("SrType")
        public String srType;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("QuestionInfo")
        public String questionInfo;

        @NameInMap("CaseStatus")
        public String caseStatus;

        @NameInMap("ExtAttrs")
        public String extAttrs;

        @NameInMap("Id")
        public Long id;

        public static QueryTicketResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryTicketResponseBodyDataList self = new QueryTicketResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryTicketResponseBodyDataList setCaseId(Long caseId) {
            this.caseId = caseId;
            return this;
        }
        public Long getCaseId() {
            return this.caseId;
        }

        public QueryTicketResponseBodyDataList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryTicketResponseBodyDataList setSrType(String srType) {
            this.srType = srType;
            return this;
        }
        public String getSrType() {
            return this.srType;
        }

        public QueryTicketResponseBodyDataList setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public QueryTicketResponseBodyDataList setQuestionInfo(String questionInfo) {
            this.questionInfo = questionInfo;
            return this;
        }
        public String getQuestionInfo() {
            return this.questionInfo;
        }

        public QueryTicketResponseBodyDataList setCaseStatus(String caseStatus) {
            this.caseStatus = caseStatus;
            return this;
        }
        public String getCaseStatus() {
            return this.caseStatus;
        }

        public QueryTicketResponseBodyDataList setExtAttrs(String extAttrs) {
            this.extAttrs = extAttrs;
            return this;
        }
        public String getExtAttrs() {
            return this.extAttrs;
        }

        public QueryTicketResponseBodyDataList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class QueryTicketResponseBodyData extends TeaModel {
        @NameInMap("TotalResults")
        public Integer totalResults;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("List")
        public java.util.List<QueryTicketResponseBodyDataList> list;

        @NameInMap("PageSize")
        public Long pageSize;

        public static QueryTicketResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTicketResponseBodyData self = new QueryTicketResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTicketResponseBodyData setTotalResults(Integer totalResults) {
            this.totalResults = totalResults;
            return this;
        }
        public Integer getTotalResults() {
            return this.totalResults;
        }

        public QueryTicketResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryTicketResponseBodyData setList(java.util.List<QueryTicketResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryTicketResponseBodyDataList> getList() {
            return this.list;
        }

        public QueryTicketResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

    }

}
