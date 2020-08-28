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

    }

    public static class DescribeClassicLinkInstancesResponseLinks extends TeaModel {
        @NameInMap("Link")
        @Validation(required = true)
        public java.util.List<DescribeClassicLinkInstancesResponseLinksLink> link;

        public static DescribeClassicLinkInstancesResponseLinks build(java.util.Map<String, ?> map) throws Exception {
            DescribeClassicLinkInstancesResponseLinks self = new DescribeClassicLinkInstancesResponseLinks();
            return TeaModel.build(map, self);
        }

    }

}
