// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListDeploymentsResponseBody extends TeaModel {
    // TotalCount本次请求条件下的数据总量，此参数为可选参数，默认可不返回
    @NameInMap("TotalCount")
    public Integer totalCount;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 表示当前调用返回读取到的位置，空代表数据已经读取完毕
    @NameInMap("NextToken")
    public String nextToken;

    // MaxResults本次请求所返回的最大记录条数
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Deployments")
    public java.util.List<ListDeploymentsResponseBodyDeployments> deployments;

    public static ListDeploymentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeploymentsResponseBody self = new ListDeploymentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeploymentsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListDeploymentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDeploymentsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDeploymentsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDeploymentsResponseBody setDeployments(java.util.List<ListDeploymentsResponseBodyDeployments> deployments) {
        this.deployments = deployments;
        return this;
    }
    public java.util.List<ListDeploymentsResponseBodyDeployments> getDeployments() {
        return this.deployments;
    }

    public static class ListDeploymentsResponseBodyDeployments extends TeaModel {
        @NameInMap("DeploymentId")
        public String deploymentId;

        @NameInMap("Name")
        public String name;

        @NameInMap("DeployType")
        public String deployType;

        @NameInMap("ServiceId")
        public String serviceId;

        @NameInMap("DefaultVersion")
        public String defaultVersion;

        public static ListDeploymentsResponseBodyDeployments build(java.util.Map<String, ?> map) throws Exception {
            ListDeploymentsResponseBodyDeployments self = new ListDeploymentsResponseBodyDeployments();
            return TeaModel.build(map, self);
        }

        public ListDeploymentsResponseBodyDeployments setDeploymentId(String deploymentId) {
            this.deploymentId = deploymentId;
            return this;
        }
        public String getDeploymentId() {
            return this.deploymentId;
        }

        public ListDeploymentsResponseBodyDeployments setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDeploymentsResponseBodyDeployments setDeployType(String deployType) {
            this.deployType = deployType;
            return this;
        }
        public String getDeployType() {
            return this.deployType;
        }

        public ListDeploymentsResponseBodyDeployments setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListDeploymentsResponseBodyDeployments setDefaultVersion(String defaultVersion) {
            this.defaultVersion = defaultVersion;
            return this;
        }
        public String getDefaultVersion() {
            return this.defaultVersion;
        }

    }

}
