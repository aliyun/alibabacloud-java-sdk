// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class DescribeClustersResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("Clusters")
    public java.util.List<DescribeClustersResponseBodyClusters> clusters;

    public static DescribeClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClustersResponseBody self = new DescribeClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClustersResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeClustersResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClustersResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeClustersResponseBody setClusters(java.util.List<DescribeClustersResponseBodyClusters> clusters) {
        this.clusters = clusters;
        return this;
    }
    public java.util.List<DescribeClustersResponseBodyClusters> getClusters() {
        return this.clusters;
    }

    public static class DescribeClustersResponseBodyClusters extends TeaModel {
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("Status")
        public String status;

        @NameInMap("NatId")
        public String natId;

        @NameInMap("InstanceCount")
        public Long instanceCount;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("NatEip")
        public String natEip;

        @NameInMap("SecurityGroup")
        public String securityGroup;

        @NameInMap("Name")
        public String name;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("ClusterId")
        public String clusterId;

        public static DescribeClustersResponseBodyClusters build(java.util.Map<String, ?> map) throws Exception {
            DescribeClustersResponseBodyClusters self = new DescribeClustersResponseBodyClusters();
            return TeaModel.build(map, self);
        }

        public DescribeClustersResponseBodyClusters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeClustersResponseBodyClusters setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeClustersResponseBodyClusters setNatId(String natId) {
            this.natId = natId;
            return this;
        }
        public String getNatId() {
            return this.natId;
        }

        public DescribeClustersResponseBodyClusters setInstanceCount(Long instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Long getInstanceCount() {
            return this.instanceCount;
        }

        public DescribeClustersResponseBodyClusters setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeClustersResponseBodyClusters setNatEip(String natEip) {
            this.natEip = natEip;
            return this;
        }
        public String getNatEip() {
            return this.natEip;
        }

        public DescribeClustersResponseBodyClusters setSecurityGroup(String securityGroup) {
            this.securityGroup = securityGroup;
            return this;
        }
        public String getSecurityGroup() {
            return this.securityGroup;
        }

        public DescribeClustersResponseBodyClusters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeClustersResponseBodyClusters setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeClustersResponseBodyClusters setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

    }

}
