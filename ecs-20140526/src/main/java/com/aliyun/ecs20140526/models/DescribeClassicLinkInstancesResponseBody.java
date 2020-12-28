// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeClassicLinkInstancesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Links")
    public java.util.List<DescribeClassicLinkInstancesResponseBodyLinks> links;

    public static DescribeClassicLinkInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClassicLinkInstancesResponseBody self = new DescribeClassicLinkInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClassicLinkInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeClassicLinkInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeClassicLinkInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClassicLinkInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeClassicLinkInstancesResponseBody setLinks(java.util.List<DescribeClassicLinkInstancesResponseBodyLinks> links) {
        this.links = links;
        return this;
    }
    public java.util.List<DescribeClassicLinkInstancesResponseBodyLinks> getLinks() {
        return this.links;
    }

    public static class DescribeClassicLinkInstancesResponseBodyLinks extends TeaModel {
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("InstanceId")
        public String instanceId;

        public static DescribeClassicLinkInstancesResponseBodyLinks build(java.util.Map<String, ?> map) throws Exception {
            DescribeClassicLinkInstancesResponseBodyLinks self = new DescribeClassicLinkInstancesResponseBodyLinks();
            return TeaModel.build(map, self);
        }

        public DescribeClassicLinkInstancesResponseBodyLinks setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeClassicLinkInstancesResponseBodyLinks setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
