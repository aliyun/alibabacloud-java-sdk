// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class ListMyGroupInstancesResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Resources")
    public ListMyGroupInstancesResponseBodyResources resources;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Integer total;

    public static ListMyGroupInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMyGroupInstancesResponseBody self = new ListMyGroupInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMyGroupInstancesResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public ListMyGroupInstancesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListMyGroupInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListMyGroupInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMyGroupInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMyGroupInstancesResponseBody setResources(ListMyGroupInstancesResponseBodyResources resources) {
        this.resources = resources;
        return this;
    }
    public ListMyGroupInstancesResponseBodyResources getResources() {
        return this.resources;
    }

    public ListMyGroupInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListMyGroupInstancesResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListMyGroupInstancesResponseBodyResourcesResource extends TeaModel {
        @NameInMap("AliUid")
        public Long aliUid;

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

        public static ListMyGroupInstancesResponseBodyResourcesResource build(java.util.Map<String, ?> map) throws Exception {
            ListMyGroupInstancesResponseBodyResourcesResource self = new ListMyGroupInstancesResponseBodyResourcesResource();
            return TeaModel.build(map, self);
        }

        public ListMyGroupInstancesResponseBodyResourcesResource setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public ListMyGroupInstancesResponseBodyResourcesResource setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListMyGroupInstancesResponseBodyResourcesResource setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMyGroupInstancesResponseBodyResourcesResource setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListMyGroupInstancesResponseBodyResourcesResource setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListMyGroupInstancesResponseBodyResourcesResource setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class ListMyGroupInstancesResponseBodyResources extends TeaModel {
        @NameInMap("Resource")
        public java.util.List<ListMyGroupInstancesResponseBodyResourcesResource> resource;

        public static ListMyGroupInstancesResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            ListMyGroupInstancesResponseBodyResources self = new ListMyGroupInstancesResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public ListMyGroupInstancesResponseBodyResources setResource(java.util.List<ListMyGroupInstancesResponseBodyResourcesResource> resource) {
            this.resource = resource;
            return this;
        }
        public java.util.List<ListMyGroupInstancesResponseBodyResourcesResource> getResource() {
            return this.resource;
        }

    }

}
