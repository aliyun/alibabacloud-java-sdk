// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeClassicLinkInstancesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Links")
    @Validation(required = true)
    public DescribeClassicLinkInstancesResponseLinks links;

    public static DescribeClassicLinkInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClassicLinkInstancesResponse self = new DescribeClassicLinkInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClassicLinkInstancesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClassicLinkInstancesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeClassicLinkInstancesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeClassicLinkInstancesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeClassicLinkInstancesResponse setLinks(DescribeClassicLinkInstancesResponseLinks links) {
        this.links = links;
        return this;
    }
    public DescribeClassicLinkInstancesResponseLinks getLinks() {
        return this.links;
    }

    public static class DescribeClassicLinkInstancesResponseLinksLink extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        public static DescribeClassicLinkInstancesResponseLinksLink build(java.util.Map<String, ?> map) throws Exception {
            DescribeClassicLinkInstancesResponseLinksLink self = new DescribeClassicLinkInstancesResponseLinksLink();
            return TeaModel.build(map, self);
        }

        public DescribeClassicLinkInstancesResponseLinksLink setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeClassicLinkInstancesResponseLinksLink setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class DescribeClassicLinkInstancesResponseLinks extends TeaModel {
        @NameInMap("Link")
        @Validation(required = true)
        public java.util.List<DescribeClassicLinkInstancesResponseLinksLink> link;

        public static DescribeClassicLinkInstancesResponseLinks build(java.util.Map<String, ?> map) throws Exception {
            DescribeClassicLinkInstancesResponseLinks self = new DescribeClassicLinkInstancesResponseLinks();
            return TeaModel.build(map, self);
        }

        public DescribeClassicLinkInstancesResponseLinks setLink(java.util.List<DescribeClassicLinkInstancesResponseLinksLink> link) {
            this.link = link;
            return this;
        }
        public java.util.List<DescribeClassicLinkInstancesResponseLinksLink> getLink() {
            return this.link;
        }

    }

}
