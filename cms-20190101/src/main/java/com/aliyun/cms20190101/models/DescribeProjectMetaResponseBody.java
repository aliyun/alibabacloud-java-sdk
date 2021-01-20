// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeProjectMetaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("Total")
    public String total;

    @NameInMap("Resources")
    public DescribeProjectMetaResponseBodyResources resources;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeProjectMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectMetaResponseBody self = new DescribeProjectMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProjectMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeProjectMetaResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeProjectMetaResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeProjectMetaResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeProjectMetaResponseBody setTotal(String total) {
        this.total = total;
        return this;
    }
    public String getTotal() {
        return this.total;
    }

    public DescribeProjectMetaResponseBody setResources(DescribeProjectMetaResponseBodyResources resources) {
        this.resources = resources;
        return this;
    }
    public DescribeProjectMetaResponseBodyResources getResources() {
        return this.resources;
    }

    public DescribeProjectMetaResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeProjectMetaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeProjectMetaResponseBodyResourcesResource extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Labels")
        public String labels;

        @NameInMap("Namespace")
        public String namespace;

        public static DescribeProjectMetaResponseBodyResourcesResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectMetaResponseBodyResourcesResource self = new DescribeProjectMetaResponseBodyResourcesResource();
            return TeaModel.build(map, self);
        }

        public DescribeProjectMetaResponseBodyResourcesResource setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeProjectMetaResponseBodyResourcesResource setLabels(String labels) {
            this.labels = labels;
            return this;
        }
        public String getLabels() {
            return this.labels;
        }

        public DescribeProjectMetaResponseBodyResourcesResource setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

    }

    public static class DescribeProjectMetaResponseBodyResources extends TeaModel {
        @NameInMap("Resource")
        public java.util.List<DescribeProjectMetaResponseBodyResourcesResource> resource;

        public static DescribeProjectMetaResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectMetaResponseBodyResources self = new DescribeProjectMetaResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public DescribeProjectMetaResponseBodyResources setResource(java.util.List<DescribeProjectMetaResponseBodyResourcesResource> resource) {
            this.resource = resource;
            return this;
        }
        public java.util.List<DescribeProjectMetaResponseBodyResourcesResource> getResource() {
            return this.resource;
        }

    }

}
