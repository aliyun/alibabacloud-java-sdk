// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryStudioProjectListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryStudioProjectListResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryStudioProjectListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryStudioProjectListResponseBody self = new QueryStudioProjectListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryStudioProjectListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryStudioProjectListResponseBody setData(QueryStudioProjectListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryStudioProjectListResponseBodyData getData() {
        return this.data;
    }

    public QueryStudioProjectListResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryStudioProjectListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryStudioProjectListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryStudioProjectListResponseBodyDataListProjectInfo extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Name")
        public String name;

        @NameInMap("ProjectId")
        public String projectId;

        public static QueryStudioProjectListResponseBodyDataListProjectInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryStudioProjectListResponseBodyDataListProjectInfo self = new QueryStudioProjectListResponseBodyDataListProjectInfo();
            return TeaModel.build(map, self);
        }

        public QueryStudioProjectListResponseBodyDataListProjectInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryStudioProjectListResponseBodyDataListProjectInfo setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryStudioProjectListResponseBodyDataListProjectInfo setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public QueryStudioProjectListResponseBodyDataListProjectInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryStudioProjectListResponseBodyDataListProjectInfo setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

    }

    public static class QueryStudioProjectListResponseBodyDataList extends TeaModel {
        @NameInMap("ProjectInfo")
        public java.util.List<QueryStudioProjectListResponseBodyDataListProjectInfo> projectInfo;

        public static QueryStudioProjectListResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryStudioProjectListResponseBodyDataList self = new QueryStudioProjectListResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryStudioProjectListResponseBodyDataList setProjectInfo(java.util.List<QueryStudioProjectListResponseBodyDataListProjectInfo> projectInfo) {
            this.projectInfo = projectInfo;
            return this;
        }
        public java.util.List<QueryStudioProjectListResponseBodyDataListProjectInfo> getProjectInfo() {
            return this.projectInfo;
        }

    }

    public static class QueryStudioProjectListResponseBodyData extends TeaModel {
        @NameInMap("List")
        public QueryStudioProjectListResponseBodyDataList list;

        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        @NameInMap("TotalPage")
        public Integer totalPage;

        public static QueryStudioProjectListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryStudioProjectListResponseBodyData self = new QueryStudioProjectListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryStudioProjectListResponseBodyData setList(QueryStudioProjectListResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public QueryStudioProjectListResponseBodyDataList getList() {
            return this.list;
        }

        public QueryStudioProjectListResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public QueryStudioProjectListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryStudioProjectListResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryStudioProjectListResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

    }

}
