// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryStudioProjectListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryStudioProjectListResponseData data;

    public static QueryStudioProjectListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryStudioProjectListResponse self = new QueryStudioProjectListResponse();
        return TeaModel.build(map, self);
    }

    public QueryStudioProjectListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryStudioProjectListResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryStudioProjectListResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryStudioProjectListResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryStudioProjectListResponse setData(QueryStudioProjectListResponseData data) {
        this.data = data;
        return this;
    }
    public QueryStudioProjectListResponseData getData() {
        return this.data;
    }

    public static class QueryStudioProjectListResponseDataListProjectInfo extends TeaModel {
        @NameInMap("GmtCreate")
        @Validation(required = true)
        public Long gmtCreate;

        @NameInMap("GmtModified")
        @Validation(required = true)
        public Long gmtModified;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public String projectId;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        public static QueryStudioProjectListResponseDataListProjectInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryStudioProjectListResponseDataListProjectInfo self = new QueryStudioProjectListResponseDataListProjectInfo();
            return TeaModel.build(map, self);
        }

        public QueryStudioProjectListResponseDataListProjectInfo setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryStudioProjectListResponseDataListProjectInfo setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public QueryStudioProjectListResponseDataListProjectInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryStudioProjectListResponseDataListProjectInfo setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public QueryStudioProjectListResponseDataListProjectInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class QueryStudioProjectListResponseDataList extends TeaModel {
        @NameInMap("ProjectInfo")
        @Validation(required = true)
        public java.util.List<QueryStudioProjectListResponseDataListProjectInfo> projectInfo;

        public static QueryStudioProjectListResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryStudioProjectListResponseDataList self = new QueryStudioProjectListResponseDataList();
            return TeaModel.build(map, self);
        }

        public QueryStudioProjectListResponseDataList setProjectInfo(java.util.List<QueryStudioProjectListResponseDataListProjectInfo> projectInfo) {
            this.projectInfo = projectInfo;
            return this;
        }
        public java.util.List<QueryStudioProjectListResponseDataListProjectInfo> getProjectInfo() {
            return this.projectInfo;
        }

    }

    public static class QueryStudioProjectListResponseData extends TeaModel {
        @NameInMap("PageNo")
        @Validation(required = true)
        public Integer pageNo;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        @NameInMap("TotalPage")
        @Validation(required = true)
        public Integer totalPage;

        @NameInMap("List")
        @Validation(required = true)
        public QueryStudioProjectListResponseDataList list;

        public static QueryStudioProjectListResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryStudioProjectListResponseData self = new QueryStudioProjectListResponseData();
            return TeaModel.build(map, self);
        }

        public QueryStudioProjectListResponseData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public QueryStudioProjectListResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryStudioProjectListResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryStudioProjectListResponseData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public QueryStudioProjectListResponseData setList(QueryStudioProjectListResponseDataList list) {
            this.list = list;
            return this;
        }
        public QueryStudioProjectListResponseDataList getList() {
            return this.list;
        }

    }

}
