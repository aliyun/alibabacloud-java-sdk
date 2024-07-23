// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeClassicLinkInstancesResponseBody extends TeaModel {
    /**
     * <p>The details of the ClassicLink connections between the instances reside in the classic network and VPCs.</p>
     */
    @NameInMap("Links")
    public DescribeClassicLinkInstancesResponseBodyLinks links;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of ClassicLink connections.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeClassicLinkInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClassicLinkInstancesResponseBody self = new DescribeClassicLinkInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClassicLinkInstancesResponseBody setLinks(DescribeClassicLinkInstancesResponseBodyLinks links) {
        this.links = links;
        return this;
    }
    public DescribeClassicLinkInstancesResponseBodyLinks getLinks() {
        return this.links;
    }

    public DescribeClassicLinkInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
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

    public DescribeClassicLinkInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeClassicLinkInstancesResponseBodyLinksLink extends TeaModel {
        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-test</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeClassicLinkInstancesResponseBodyLinksLink build(java.util.Map<String, ?> map) throws Exception {
            DescribeClassicLinkInstancesResponseBodyLinksLink self = new DescribeClassicLinkInstancesResponseBodyLinksLink();
            return TeaModel.build(map, self);
        }

        public DescribeClassicLinkInstancesResponseBodyLinksLink setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeClassicLinkInstancesResponseBodyLinksLink setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class DescribeClassicLinkInstancesResponseBodyLinks extends TeaModel {
        @NameInMap("Link")
        public java.util.List<DescribeClassicLinkInstancesResponseBodyLinksLink> link;

        public static DescribeClassicLinkInstancesResponseBodyLinks build(java.util.Map<String, ?> map) throws Exception {
            DescribeClassicLinkInstancesResponseBodyLinks self = new DescribeClassicLinkInstancesResponseBodyLinks();
            return TeaModel.build(map, self);
        }

        public DescribeClassicLinkInstancesResponseBodyLinks setLink(java.util.List<DescribeClassicLinkInstancesResponseBodyLinksLink> link) {
            this.link = link;
            return this;
        }
        public java.util.List<DescribeClassicLinkInstancesResponseBodyLinksLink> getLink() {
            return this.link;
        }

    }

}
