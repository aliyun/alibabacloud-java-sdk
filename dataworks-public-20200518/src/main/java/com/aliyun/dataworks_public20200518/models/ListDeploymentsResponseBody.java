// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDeploymentsResponseBody extends TeaModel {
    /**
     * <p>The return results.</p>
     */
    @NameInMap("Data")
    public ListDeploymentsResponseBodyData data;

    /**
     * <p>The ID of the request. You can use the ID to troubleshoot issues.</p>
     */
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
        /**
         * <p>The time when the deployment task was created.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The ID of the Alibaba Cloud account used by the user who created the deployment tasks.</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The error message returned when the deployment task failed.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The time when the deployment task was run. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("ExecuteTime")
        public Long executeTime;

        /**
         * <p>The ID of the Alibaba Cloud account used by the user who ran the deployment tasks.</p>
         */
        @NameInMap("Executor")
        public String executor;

        /**
         * <p>The ID of the deployment task. You can call the [GetDeployment](https://help.aliyun.com/document_detail/173950.html) operation to query the details of the deployment task based on the ID.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the deployment task.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The status of the deployment tasks. Valid values:</p>
         * <br>
         * <p>*   0: The deployment tasks are ready.</p>
         * <p>*   1: The deployment tasks are successful.</p>
         * <p>*   2: The deployment tasks fail.</p>
         * <p>*   6: The deployment tasks are rejected.</p>
         */
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
        /**
         * <p>The information about the deployment tasks.</p>
         */
        @NameInMap("Deployments")
        public java.util.List<ListDeploymentsResponseBodyDataDeployments> deployments;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("PageNumber")
        public Long pageNumber;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
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
