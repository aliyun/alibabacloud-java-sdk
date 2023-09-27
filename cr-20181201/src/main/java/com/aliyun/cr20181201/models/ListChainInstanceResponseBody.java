// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListChainInstanceResponseBody extends TeaModel {
    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("ChainInstances")
    public java.util.List<ListChainInstanceResponseBodyChainInstances> chainInstances;

    /**
     * <p>The version of the delivery chain.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The page number of the page to return.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The execution record of the delivery chain.</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>30</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>Indicates whether the operation is successful.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the Container Registry instance.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The name of the repository.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListChainInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListChainInstanceResponseBody self = new ListChainInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListChainInstanceResponseBody setChainInstances(java.util.List<ListChainInstanceResponseBodyChainInstances> chainInstances) {
        this.chainInstances = chainInstances;
        return this;
    }
    public java.util.List<ListChainInstanceResponseBodyChainInstances> getChainInstances() {
        return this.chainInstances;
    }

    public ListChainInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListChainInstanceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListChainInstanceResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public ListChainInstanceResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListChainInstanceResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListChainInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListChainInstanceResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListChainInstanceResponseBodyChainInstancesChain extends TeaModel {
        /**
         * <p>The name of the namespace.</p>
         */
        @NameInMap("ChainId")
        public String chainId;

        /**
         * <p>The number of entries returned on each page.</p>
         */
        @NameInMap("ChainName")
        public String chainName;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("Version")
        public Long version;

        public static ListChainInstanceResponseBodyChainInstancesChain build(java.util.Map<String, ?> map) throws Exception {
            ListChainInstanceResponseBodyChainInstancesChain self = new ListChainInstanceResponseBodyChainInstancesChain();
            return TeaModel.build(map, self);
        }

        public ListChainInstanceResponseBodyChainInstancesChain setChainId(String chainId) {
            this.chainId = chainId;
            return this;
        }
        public String getChainId() {
            return this.chainId;
        }

        public ListChainInstanceResponseBodyChainInstancesChain setChainName(String chainName) {
            this.chainName = chainName;
            return this;
        }
        public String getChainName() {
            return this.chainName;
        }

        public ListChainInstanceResponseBodyChainInstancesChain setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

    public static class ListChainInstanceResponseBodyChainInstances extends TeaModel {
        /**
         * <p>The name of the namespace.</p>
         */
        @NameInMap("Chain")
        public ListChainInstanceResponseBodyChainInstancesChain chain;

        /**
         * <p>1</p>
         */
        @NameInMap("ChainInstanceId")
        public String chainInstanceId;

        /**
         * <p>The ID of the Container Registry instance.</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The ID of the delivery chain.</p>
         */
        @NameInMap("RepoName")
        public String repoName;

        /**
         * <p>The execution result of the delivery chain. Valid values:</p>
         * <br>
         * <p>*   `SUCCESS`</p>
         * <p>*   `FAILED`</p>
         * <p>*   `CANCELED`</p>
         * <p>*   `DENIED`</p>
         */
        @NameInMap("RepoNamespaceName")
        public String repoNamespaceName;

        /**
         * <p>The list of the execution records of delivery chains.</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <p>test-repo</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The status of the delivery chain. Valid values:</p>
         * <br>
         * <p>*   `RUNNING`</p>
         * <p>*   `COMPLETE`</p>
         * <p>*   `CANCELING`</p>
         * <p>*   `CANCELED`</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListChainInstanceResponseBodyChainInstances build(java.util.Map<String, ?> map) throws Exception {
            ListChainInstanceResponseBodyChainInstances self = new ListChainInstanceResponseBodyChainInstances();
            return TeaModel.build(map, self);
        }

        public ListChainInstanceResponseBodyChainInstances setChain(ListChainInstanceResponseBodyChainInstancesChain chain) {
            this.chain = chain;
            return this;
        }
        public ListChainInstanceResponseBodyChainInstancesChain getChain() {
            return this.chain;
        }

        public ListChainInstanceResponseBodyChainInstances setChainInstanceId(String chainInstanceId) {
            this.chainInstanceId = chainInstanceId;
            return this;
        }
        public String getChainInstanceId() {
            return this.chainInstanceId;
        }

        public ListChainInstanceResponseBodyChainInstances setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListChainInstanceResponseBodyChainInstances setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public ListChainInstanceResponseBodyChainInstances setRepoNamespaceName(String repoNamespaceName) {
            this.repoNamespaceName = repoNamespaceName;
            return this;
        }
        public String getRepoNamespaceName() {
            return this.repoNamespaceName;
        }

        public ListChainInstanceResponseBodyChainInstances setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public ListChainInstanceResponseBodyChainInstances setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListChainInstanceResponseBodyChainInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
