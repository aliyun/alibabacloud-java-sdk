// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class PageQueryTicketResponseBody extends TeaModel {
    // message
    @NameInMap("Message")
    public String message;

    // data
    @NameInMap("Data")
    public PageQueryTicketResponseBodyData data;

    // code
    @NameInMap("Code")
    public String code;

    // success
    @NameInMap("Success")
    public Boolean success;

    public static PageQueryTicketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PageQueryTicketResponseBody self = new PageQueryTicketResponseBody();
        return TeaModel.build(map, self);
    }

    public PageQueryTicketResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PageQueryTicketResponseBody setData(PageQueryTicketResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PageQueryTicketResponseBodyData getData() {
        return this.data;
    }

    public PageQueryTicketResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PageQueryTicketResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PageQueryTicketResponseBodyDataList extends TeaModel {
        // caseId
        @NameInMap("CaseId")
        public Long caseId;

        // gmtCreate
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        // srType
        @NameInMap("SrType")
        public String srType;

        // gmtModified
        @NameInMap("GmtModified")
        public Long gmtModified;

        // questionInfo
        @NameInMap("QuestionInfo")
        public String questionInfo;

        // caseStatus
        @NameInMap("CaseStatus")
        public String caseStatus;

        // extAttrs
        @NameInMap("ExtAttrs")
        public String extAttrs;

        // id
        @NameInMap("Id")
        public Long id;

        public static PageQueryTicketResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            PageQueryTicketResponseBodyDataList self = new PageQueryTicketResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public PageQueryTicketResponseBodyDataList setCaseId(Long caseId) {
            this.caseId = caseId;
            return this;
        }
        public Long getCaseId() {
            return this.caseId;
        }

        public PageQueryTicketResponseBodyDataList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public PageQueryTicketResponseBodyDataList setSrType(String srType) {
            this.srType = srType;
            return this;
        }
        public String getSrType() {
            return this.srType;
        }

        public PageQueryTicketResponseBodyDataList setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public PageQueryTicketResponseBodyDataList setQuestionInfo(String questionInfo) {
            this.questionInfo = questionInfo;
            return this;
        }
        public String getQuestionInfo() {
            return this.questionInfo;
        }

        public PageQueryTicketResponseBodyDataList setCaseStatus(String caseStatus) {
            this.caseStatus = caseStatus;
            return this;
        }
        public String getCaseStatus() {
            return this.caseStatus;
        }

        public PageQueryTicketResponseBodyDataList setExtAttrs(String extAttrs) {
            this.extAttrs = extAttrs;
            return this;
        }
        public String getExtAttrs() {
            return this.extAttrs;
        }

        public PageQueryTicketResponseBodyDataList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class PageQueryTicketResponseBodyData extends TeaModel {
        // totalResults
        @NameInMap("TotalResults")
        public Integer totalResults;

        // currentPage
        @NameInMap("CurrentPage")
        public Integer currentPage;

        // list
        @NameInMap("List")
        public java.util.List<PageQueryTicketResponseBodyDataList> list;

        // pageSize
        @NameInMap("PageSize")
        public Long pageSize;

        public static PageQueryTicketResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PageQueryTicketResponseBodyData self = new PageQueryTicketResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PageQueryTicketResponseBodyData setTotalResults(Integer totalResults) {
            this.totalResults = totalResults;
            return this;
        }
        public Integer getTotalResults() {
            return this.totalResults;
        }

        public PageQueryTicketResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public PageQueryTicketResponseBodyData setList(java.util.List<PageQueryTicketResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<PageQueryTicketResponseBodyDataList> getList() {
            return this.list;
        }

        public PageQueryTicketResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

    }

}
