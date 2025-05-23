// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDeploymentPackagesResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListDeploymentPackagesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>952795279527ab****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDeploymentPackagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeploymentPackagesResponseBody self = new ListDeploymentPackagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeploymentPackagesResponseBody setData(ListDeploymentPackagesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDeploymentPackagesResponseBodyData getData() {
        return this.data;
    }

    public ListDeploymentPackagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDeploymentPackagesResponseBodyDataDeployments extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1593877765000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>2003****</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>1593877765000</p>
         */
        @NameInMap("ExecuteTime")
        public Long executeTime;

        /**
         * <strong>example:</strong>
         * <p>2003****</p>
         */
        @NameInMap("Executor")
        public String executor;

        /**
         * <strong>example:</strong>
         * <p>11111</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>auto_created</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static ListDeploymentPackagesResponseBodyDataDeployments build(java.util.Map<String, ?> map) throws Exception {
            ListDeploymentPackagesResponseBodyDataDeployments self = new ListDeploymentPackagesResponseBodyDataDeployments();
            return TeaModel.build(map, self);
        }

        public ListDeploymentPackagesResponseBodyDataDeployments setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListDeploymentPackagesResponseBodyDataDeployments setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListDeploymentPackagesResponseBodyDataDeployments setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListDeploymentPackagesResponseBodyDataDeployments setExecuteTime(Long executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        public Long getExecuteTime() {
            return this.executeTime;
        }

        public ListDeploymentPackagesResponseBodyDataDeployments setExecutor(String executor) {
            this.executor = executor;
            return this;
        }
        public String getExecutor() {
            return this.executor;
        }

        public ListDeploymentPackagesResponseBodyDataDeployments setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDeploymentPackagesResponseBodyDataDeployments setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDeploymentPackagesResponseBodyDataDeployments setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class ListDeploymentPackagesResponseBodyData extends TeaModel {
        @NameInMap("Deployments")
        public java.util.List<ListDeploymentPackagesResponseBodyDataDeployments> deployments;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Long pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListDeploymentPackagesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDeploymentPackagesResponseBodyData self = new ListDeploymentPackagesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDeploymentPackagesResponseBodyData setDeployments(java.util.List<ListDeploymentPackagesResponseBodyDataDeployments> deployments) {
            this.deployments = deployments;
            return this;
        }
        public java.util.List<ListDeploymentPackagesResponseBodyDataDeployments> getDeployments() {
            return this.deployments;
        }

        public ListDeploymentPackagesResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListDeploymentPackagesResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListDeploymentPackagesResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
