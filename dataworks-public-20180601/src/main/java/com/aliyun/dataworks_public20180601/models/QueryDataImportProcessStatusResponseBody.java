// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class QueryDataImportProcessStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public QueryDataImportProcessStatusResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryDataImportProcessStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDataImportProcessStatusResponseBody self = new QueryDataImportProcessStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDataImportProcessStatusResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryDataImportProcessStatusResponseBody setData(QueryDataImportProcessStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDataImportProcessStatusResponseBodyData getData() {
        return this.data;
    }

    public QueryDataImportProcessStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryDataImportProcessStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryDataImportProcessStatusResponseBodyDataProjectList extends TeaModel {
        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("ProjectIdentifier")
        public String projectIdentifier;

        @NameInMap("ProjectName")
        public String projectName;

        public static QueryDataImportProcessStatusResponseBodyDataProjectList build(java.util.Map<String, ?> map) throws Exception {
            QueryDataImportProcessStatusResponseBodyDataProjectList self = new QueryDataImportProcessStatusResponseBodyDataProjectList();
            return TeaModel.build(map, self);
        }

        public QueryDataImportProcessStatusResponseBodyDataProjectList setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public QueryDataImportProcessStatusResponseBodyDataProjectList setProjectIdentifier(String projectIdentifier) {
            this.projectIdentifier = projectIdentifier;
            return this;
        }
        public String getProjectIdentifier() {
            return this.projectIdentifier;
        }

        public QueryDataImportProcessStatusResponseBodyDataProjectList setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

    }

    public static class QueryDataImportProcessStatusResponseBodyData extends TeaModel {
        @NameInMap("Message")
        public String message;

        @NameInMap("ProjectList")
        public java.util.List<QueryDataImportProcessStatusResponseBodyDataProjectList> projectList;

        @NameInMap("Status")
        public String status;

        public static QueryDataImportProcessStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDataImportProcessStatusResponseBodyData self = new QueryDataImportProcessStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDataImportProcessStatusResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryDataImportProcessStatusResponseBodyData setProjectList(java.util.List<QueryDataImportProcessStatusResponseBodyDataProjectList> projectList) {
            this.projectList = projectList;
            return this;
        }
        public java.util.List<QueryDataImportProcessStatusResponseBodyDataProjectList> getProjectList() {
            return this.projectList;
        }

        public QueryDataImportProcessStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
