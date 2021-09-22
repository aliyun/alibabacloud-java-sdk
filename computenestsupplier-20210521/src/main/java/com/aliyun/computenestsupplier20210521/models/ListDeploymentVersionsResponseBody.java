// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListDeploymentVersionsResponseBody extends TeaModel {
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

    @NameInMap("DeploymentVersions")
    public java.util.List<ListDeploymentVersionsResponseBodyDeploymentVersions> deploymentVersions;

    public static ListDeploymentVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeploymentVersionsResponseBody self = new ListDeploymentVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeploymentVersionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListDeploymentVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDeploymentVersionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDeploymentVersionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDeploymentVersionsResponseBody setDeploymentVersions(java.util.List<ListDeploymentVersionsResponseBodyDeploymentVersions> deploymentVersions) {
        this.deploymentVersions = deploymentVersions;
        return this;
    }
    public java.util.List<ListDeploymentVersionsResponseBodyDeploymentVersions> getDeploymentVersions() {
        return this.deploymentVersions;
    }

    public static class ListDeploymentVersionsResponseBodyDeploymentVersions extends TeaModel {
        @NameInMap("DeploymentId")
        public String deploymentId;

        @NameInMap("Version")
        public String version;

        @NameInMap("DeployMetadata")
        public String deployMetadata;

        @NameInMap("ServiceId")
        public String serviceId;

        @NameInMap("IsDefault")
        public Boolean isDefault;

        public static ListDeploymentVersionsResponseBodyDeploymentVersions build(java.util.Map<String, ?> map) throws Exception {
            ListDeploymentVersionsResponseBodyDeploymentVersions self = new ListDeploymentVersionsResponseBodyDeploymentVersions();
            return TeaModel.build(map, self);
        }

        public ListDeploymentVersionsResponseBodyDeploymentVersions setDeploymentId(String deploymentId) {
            this.deploymentId = deploymentId;
            return this;
        }
        public String getDeploymentId() {
            return this.deploymentId;
        }

        public ListDeploymentVersionsResponseBodyDeploymentVersions setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListDeploymentVersionsResponseBodyDeploymentVersions setDeployMetadata(String deployMetadata) {
            this.deployMetadata = deployMetadata;
            return this;
        }
        public String getDeployMetadata() {
            return this.deployMetadata;
        }

        public ListDeploymentVersionsResponseBodyDeploymentVersions setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListDeploymentVersionsResponseBodyDeploymentVersions setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

    }

}
