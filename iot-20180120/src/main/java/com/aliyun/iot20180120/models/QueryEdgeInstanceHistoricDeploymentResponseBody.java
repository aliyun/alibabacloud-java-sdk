// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeInstanceHistoricDeploymentResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryEdgeInstanceHistoricDeploymentResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryEdgeInstanceHistoricDeploymentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEdgeInstanceHistoricDeploymentResponseBody self = new QueryEdgeInstanceHistoricDeploymentResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEdgeInstanceHistoricDeploymentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEdgeInstanceHistoricDeploymentResponseBody setData(QueryEdgeInstanceHistoricDeploymentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryEdgeInstanceHistoricDeploymentResponseBodyData getData() {
        return this.data;
    }

    public QueryEdgeInstanceHistoricDeploymentResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryEdgeInstanceHistoricDeploymentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEdgeInstanceHistoricDeploymentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryEdgeInstanceHistoricDeploymentResponseBodyDataDeploymentList extends TeaModel {
        @NameInMap("DeploymentId")
        public String deploymentId;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCompleted")
        public String gmtCompleted;

        @NameInMap("GmtCompletedTimestamp")
        public Long gmtCompletedTimestamp;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtCreateTimestamp")
        public Long gmtCreateTimestamp;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("GmtModifiedTimestamp")
        public Long gmtModifiedTimestamp;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Type")
        public String type;

        public static QueryEdgeInstanceHistoricDeploymentResponseBodyDataDeploymentList build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeInstanceHistoricDeploymentResponseBodyDataDeploymentList self = new QueryEdgeInstanceHistoricDeploymentResponseBodyDataDeploymentList();
            return TeaModel.build(map, self);
        }

        public QueryEdgeInstanceHistoricDeploymentResponseBodyDataDeploymentList setDeploymentId(String deploymentId) {
            this.deploymentId = deploymentId;
            return this;
        }
        public String getDeploymentId() {
            return this.deploymentId;
        }

        public QueryEdgeInstanceHistoricDeploymentResponseBodyDataDeploymentList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryEdgeInstanceHistoricDeploymentResponseBodyDataDeploymentList setGmtCompleted(String gmtCompleted) {
            this.gmtCompleted = gmtCompleted;
            return this;
        }
        public String getGmtCompleted() {
            return this.gmtCompleted;
        }

        public QueryEdgeInstanceHistoricDeploymentResponseBodyDataDeploymentList setGmtCompletedTimestamp(Long gmtCompletedTimestamp) {
            this.gmtCompletedTimestamp = gmtCompletedTimestamp;
            return this;
        }
        public Long getGmtCompletedTimestamp() {
            return this.gmtCompletedTimestamp;
        }

        public QueryEdgeInstanceHistoricDeploymentResponseBodyDataDeploymentList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryEdgeInstanceHistoricDeploymentResponseBodyDataDeploymentList setGmtCreateTimestamp(Long gmtCreateTimestamp) {
            this.gmtCreateTimestamp = gmtCreateTimestamp;
            return this;
        }
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        public QueryEdgeInstanceHistoricDeploymentResponseBodyDataDeploymentList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryEdgeInstanceHistoricDeploymentResponseBodyDataDeploymentList setGmtModifiedTimestamp(Long gmtModifiedTimestamp) {
            this.gmtModifiedTimestamp = gmtModifiedTimestamp;
            return this;
        }
        public Long getGmtModifiedTimestamp() {
            return this.gmtModifiedTimestamp;
        }

        public QueryEdgeInstanceHistoricDeploymentResponseBodyDataDeploymentList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryEdgeInstanceHistoricDeploymentResponseBodyDataDeploymentList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryEdgeInstanceHistoricDeploymentResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("DeploymentList")
        public java.util.List<QueryEdgeInstanceHistoricDeploymentResponseBodyDataDeploymentList> deploymentList;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static QueryEdgeInstanceHistoricDeploymentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeInstanceHistoricDeploymentResponseBodyData self = new QueryEdgeInstanceHistoricDeploymentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryEdgeInstanceHistoricDeploymentResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryEdgeInstanceHistoricDeploymentResponseBodyData setDeploymentList(java.util.List<QueryEdgeInstanceHistoricDeploymentResponseBodyDataDeploymentList> deploymentList) {
            this.deploymentList = deploymentList;
            return this;
        }
        public java.util.List<QueryEdgeInstanceHistoricDeploymentResponseBodyDataDeploymentList> getDeploymentList() {
            return this.deploymentList;
        }

        public QueryEdgeInstanceHistoricDeploymentResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryEdgeInstanceHistoricDeploymentResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
