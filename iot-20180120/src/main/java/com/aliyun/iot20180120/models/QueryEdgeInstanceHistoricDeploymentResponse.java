// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeInstanceHistoricDeploymentResponse extends TeaModel {
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
    public QueryEdgeInstanceHistoricDeploymentResponseData data;

    public static QueryEdgeInstanceHistoricDeploymentResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEdgeInstanceHistoricDeploymentResponse self = new QueryEdgeInstanceHistoricDeploymentResponse();
        return TeaModel.build(map, self);
    }

    public QueryEdgeInstanceHistoricDeploymentResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEdgeInstanceHistoricDeploymentResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryEdgeInstanceHistoricDeploymentResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEdgeInstanceHistoricDeploymentResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryEdgeInstanceHistoricDeploymentResponse setData(QueryEdgeInstanceHistoricDeploymentResponseData data) {
        this.data = data;
        return this;
    }
    public QueryEdgeInstanceHistoricDeploymentResponseData getData() {
        return this.data;
    }

    public static class QueryEdgeInstanceHistoricDeploymentResponseDataDeploymentList extends TeaModel {
        @NameInMap("GmtCreate")
        @Validation(required = true)
        public String gmtCreate;

        @NameInMap("GmtModified")
        @Validation(required = true)
        public String gmtModified;

        @NameInMap("GmtCompleted")
        @Validation(required = true)
        public String gmtCompleted;

        @NameInMap("DeploymentId")
        @Validation(required = true)
        public String deploymentId;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("GmtCreateTimestamp")
        @Validation(required = true)
        public Long gmtCreateTimestamp;

        @NameInMap("GmtModifiedTimestamp")
        @Validation(required = true)
        public Long gmtModifiedTimestamp;

        @NameInMap("GmtCompletedTimestamp")
        @Validation(required = true)
        public Long gmtCompletedTimestamp;

        public static QueryEdgeInstanceHistoricDeploymentResponseDataDeploymentList build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeInstanceHistoricDeploymentResponseDataDeploymentList self = new QueryEdgeInstanceHistoricDeploymentResponseDataDeploymentList();
            return TeaModel.build(map, self);
        }

        public QueryEdgeInstanceHistoricDeploymentResponseDataDeploymentList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryEdgeInstanceHistoricDeploymentResponseDataDeploymentList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryEdgeInstanceHistoricDeploymentResponseDataDeploymentList setGmtCompleted(String gmtCompleted) {
            this.gmtCompleted = gmtCompleted;
            return this;
        }
        public String getGmtCompleted() {
            return this.gmtCompleted;
        }

        public QueryEdgeInstanceHistoricDeploymentResponseDataDeploymentList setDeploymentId(String deploymentId) {
            this.deploymentId = deploymentId;
            return this;
        }
        public String getDeploymentId() {
            return this.deploymentId;
        }

        public QueryEdgeInstanceHistoricDeploymentResponseDataDeploymentList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryEdgeInstanceHistoricDeploymentResponseDataDeploymentList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryEdgeInstanceHistoricDeploymentResponseDataDeploymentList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryEdgeInstanceHistoricDeploymentResponseDataDeploymentList setGmtCreateTimestamp(Long gmtCreateTimestamp) {
            this.gmtCreateTimestamp = gmtCreateTimestamp;
            return this;
        }
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        public QueryEdgeInstanceHistoricDeploymentResponseDataDeploymentList setGmtModifiedTimestamp(Long gmtModifiedTimestamp) {
            this.gmtModifiedTimestamp = gmtModifiedTimestamp;
            return this;
        }
        public Long getGmtModifiedTimestamp() {
            return this.gmtModifiedTimestamp;
        }

        public QueryEdgeInstanceHistoricDeploymentResponseDataDeploymentList setGmtCompletedTimestamp(Long gmtCompletedTimestamp) {
            this.gmtCompletedTimestamp = gmtCompletedTimestamp;
            return this;
        }
        public Long getGmtCompletedTimestamp() {
            return this.gmtCompletedTimestamp;
        }

    }

    public static class QueryEdgeInstanceHistoricDeploymentResponseData extends TeaModel {
        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("CurrentPage")
        @Validation(required = true)
        public Integer currentPage;

        @NameInMap("DeploymentList")
        @Validation(required = true)
        public java.util.List<QueryEdgeInstanceHistoricDeploymentResponseDataDeploymentList> deploymentList;

        public static QueryEdgeInstanceHistoricDeploymentResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeInstanceHistoricDeploymentResponseData self = new QueryEdgeInstanceHistoricDeploymentResponseData();
            return TeaModel.build(map, self);
        }

        public QueryEdgeInstanceHistoricDeploymentResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryEdgeInstanceHistoricDeploymentResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryEdgeInstanceHistoricDeploymentResponseData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryEdgeInstanceHistoricDeploymentResponseData setDeploymentList(java.util.List<QueryEdgeInstanceHistoricDeploymentResponseDataDeploymentList> deploymentList) {
            this.deploymentList = deploymentList;
            return this;
        }
        public java.util.List<QueryEdgeInstanceHistoricDeploymentResponseDataDeploymentList> getDeploymentList() {
            return this.deploymentList;
        }

    }

}
