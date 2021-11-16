// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDeploymentsResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListDeploymentsResponseBodyData data;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static ListDeploymentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeploymentsResponseBody self = new ListDeploymentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeploymentsResponseBody setData(ListDeploymentsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDeploymentsResponseBodyData getData() {
        return this.data;
    }

    public ListDeploymentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDeploymentsResponseBodyDataDeployments extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("ExecuteTime")
        public Long executeTime;

        @NameInMap("Executor")
        public String executor;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Status")
        public Integer status;

        public static ListDeploymentsResponseBodyDataDeployments build(java.util.Map<String, ?> map) throws Exception {
            ListDeploymentsResponseBodyDataDeployments self = new ListDeploymentsResponseBodyDataDeployments();
            return TeaModel.build(map, self);
        }

        public ListDeploymentsResponseBodyDataDeployments setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListDeploymentsResponseBodyDataDeployments setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListDeploymentsResponseBodyDataDeployments setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListDeploymentsResponseBodyDataDeployments setExecuteTime(Long executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        public Long getExecuteTime() {
            return this.executeTime;
        }

        public ListDeploymentsResponseBodyDataDeployments setExecutor(String executor) {
            this.executor = executor;
            return this;
        }
        public String getExecutor() {
            return this.executor;
        }

        public ListDeploymentsResponseBodyDataDeployments setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDeploymentsResponseBodyDataDeployments setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDeploymentsResponseBodyDataDeployments setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class ListDeploymentsResponseBodyData extends TeaModel {
        @NameInMap("Deployments")
        public java.util.List<ListDeploymentsResponseBodyDataDeployments> deployments;

        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListDeploymentsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDeploymentsResponseBodyData self = new ListDeploymentsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDeploymentsResponseBodyData setDeployments(java.util.List<ListDeploymentsResponseBodyDataDeployments> deployments) {
            this.deployments = deployments;
            return this;
        }
        public java.util.List<ListDeploymentsResponseBodyDataDeployments> getDeployments() {
            return this.deployments;
        }

        public ListDeploymentsResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListDeploymentsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListDeploymentsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
