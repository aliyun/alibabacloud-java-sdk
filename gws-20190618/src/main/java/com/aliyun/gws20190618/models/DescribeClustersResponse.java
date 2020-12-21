// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class DescribeClustersResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Long pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("Clusters")
    @Validation(required = true)
    public java.util.List<DescribeClustersResponseClusters> clusters;

    public static DescribeClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClustersResponse self = new DescribeClustersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClustersResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClustersResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeClustersResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeClustersResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeClustersResponse setClusters(java.util.List<DescribeClustersResponseClusters> clusters) {
        this.clusters = clusters;
        return this;
    }
    public java.util.List<DescribeClustersResponseClusters> getClusters() {
        return this.clusters;
    }

    public static class DescribeClustersResponseClusters extends TeaModel {
        @NameInMap("ClusterId")
        @Validation(required = true)
        public String clusterId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("SecurityGroup")
        @Validation(required = true)
        public String securityGroup;

        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("NatId")
        @Validation(required = true)
        public String natId;

        @NameInMap("NatEip")
        @Validation(required = true)
        public String natEip;

        @NameInMap("InstanceCount")
        @Validation(required = true)
        public Long instanceCount;

        public static DescribeClustersResponseClusters build(java.util.Map<String, ?> map) throws Exception {
            DescribeClustersResponseClusters self = new DescribeClustersResponseClusters();
            return TeaModel.build(map, self);
        }

        public DescribeClustersResponseClusters setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeClustersResponseClusters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeClustersResponseClusters setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeClustersResponseClusters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeClustersResponseClusters setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeClustersResponseClusters setSecurityGroup(String securityGroup) {
            this.securityGroup = securityGroup;
            return this;
        }
        public String getSecurityGroup() {
            return this.securityGroup;
        }

        public DescribeClustersResponseClusters setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeClustersResponseClusters setNatId(String natId) {
            this.natId = natId;
            return this;
        }
        public String getNatId() {
            return this.natId;
        }

        public DescribeClustersResponseClusters setNatEip(String natEip) {
            this.natEip = natEip;
            return this;
        }
        public String getNatEip() {
            return this.natEip;
        }

        public DescribeClustersResponseClusters setInstanceCount(Long instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Long getInstanceCount() {
            return this.instanceCount;
        }

    }

}
