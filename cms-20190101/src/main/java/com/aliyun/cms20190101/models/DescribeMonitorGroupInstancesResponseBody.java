// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitorGroupInstancesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Resources")
    public DescribeMonitorGroupInstancesResponseBodyResources resources;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Integer total;

    public static DescribeMonitorGroupInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorGroupInstancesResponseBody self = new DescribeMonitorGroupInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMonitorGroupInstancesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeMonitorGroupInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeMonitorGroupInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMonitorGroupInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMonitorGroupInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMonitorGroupInstancesResponseBody setResources(DescribeMonitorGroupInstancesResponseBodyResources resources) {
        this.resources = resources;
        return this;
    }
    public DescribeMonitorGroupInstancesResponseBodyResources getResources() {
        return this.resources;
    }

    public DescribeMonitorGroupInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeMonitorGroupInstancesResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeMonitorGroupInstancesResponseBodyResourcesResource extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeMonitorGroupInstancesResponseBodyResourcesResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupInstancesResponseBodyResourcesResource self = new DescribeMonitorGroupInstancesResponseBodyResourcesResource();
            return TeaModel.build(map, self);
        }

        public DescribeMonitorGroupInstancesResponseBodyResourcesResource setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeMonitorGroupInstancesResponseBodyResourcesResource setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeMonitorGroupInstancesResponseBodyResourcesResource setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeMonitorGroupInstancesResponseBodyResourcesResource setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeMonitorGroupInstancesResponseBodyResourcesResource setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeMonitorGroupInstancesResponseBodyResources extends TeaModel {
        @NameInMap("Resource")
        public java.util.List<DescribeMonitorGroupInstancesResponseBodyResourcesResource> resource;

        public static DescribeMonitorGroupInstancesResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupInstancesResponseBodyResources self = new DescribeMonitorGroupInstancesResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public DescribeMonitorGroupInstancesResponseBodyResources setResource(java.util.List<DescribeMonitorGroupInstancesResponseBodyResourcesResource> resource) {
            this.resource = resource;
            return this;
        }
        public java.util.List<DescribeMonitorGroupInstancesResponseBodyResourcesResource> getResource() {
            return this.resource;
        }

    }

}
