// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitorGroupInstancesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("Resources")
    @Validation(required = true)
    public DescribeMonitorGroupInstancesResponseResources resources;

    public static DescribeMonitorGroupInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorGroupInstancesResponse self = new DescribeMonitorGroupInstancesResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeMonitorGroupInstancesResponseResourcesResource extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("Category")
        @Validation(required = true)
        public String category;

        @NameInMap("InstanceName")
        @Validation(required = true)
        public String instanceName;

        public static DescribeMonitorGroupInstancesResponseResourcesResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupInstancesResponseResourcesResource self = new DescribeMonitorGroupInstancesResponseResourcesResource();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMonitorGroupInstancesResponseResources extends TeaModel {
        @NameInMap("Resource")
        @Validation(required = true)
        public java.util.List<DescribeMonitorGroupInstancesResponseResourcesResource> resource;

        public static DescribeMonitorGroupInstancesResponseResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupInstancesResponseResources self = new DescribeMonitorGroupInstancesResponseResources();
            return TeaModel.build(map, self);
        }

    }

}
