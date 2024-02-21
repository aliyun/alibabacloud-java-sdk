// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class DescribeNamespacesResponseBody extends TeaModel {
    @NameInMap("Namespaces")
    public java.util.List<DescribeNamespacesResponseBodyNamespaces> namespaces;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("TotalPage")
    public Integer totalPage;

    public static DescribeNamespacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNamespacesResponseBody self = new DescribeNamespacesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNamespacesResponseBody setNamespaces(java.util.List<DescribeNamespacesResponseBodyNamespaces> namespaces) {
        this.namespaces = namespaces;
        return this;
    }
    public java.util.List<DescribeNamespacesResponseBodyNamespaces> getNamespaces() {
        return this.namespaces;
    }

    public DescribeNamespacesResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public DescribeNamespacesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeNamespacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNamespacesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeNamespacesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeNamespacesResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeNamespacesResponseBodyNamespacesResourceSpec extends TeaModel {
        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("MemoryGB")
        public Integer memoryGB;

        public static DescribeNamespacesResponseBodyNamespacesResourceSpec build(java.util.Map<String, ?> map) throws Exception {
            DescribeNamespacesResponseBodyNamespacesResourceSpec self = new DescribeNamespacesResponseBodyNamespacesResourceSpec();
            return TeaModel.build(map, self);
        }

        public DescribeNamespacesResponseBodyNamespacesResourceSpec setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public DescribeNamespacesResponseBodyNamespacesResourceSpec setMemoryGB(Integer memoryGB) {
            this.memoryGB = memoryGB;
            return this;
        }
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

    }

    public static class DescribeNamespacesResponseBodyNamespacesResourceUsed extends TeaModel {
        @NameInMap("Cpu")
        public Float cpu;

        @NameInMap("MemoryGB")
        public Float memoryGB;

        public static DescribeNamespacesResponseBodyNamespacesResourceUsed build(java.util.Map<String, ?> map) throws Exception {
            DescribeNamespacesResponseBodyNamespacesResourceUsed self = new DescribeNamespacesResponseBodyNamespacesResourceUsed();
            return TeaModel.build(map, self);
        }

        public DescribeNamespacesResponseBodyNamespacesResourceUsed setCpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }
        public Float getCpu() {
            return this.cpu;
        }

        public DescribeNamespacesResponseBodyNamespacesResourceUsed setMemoryGB(Float memoryGB) {
            this.memoryGB = memoryGB;
            return this;
        }
        public Float getMemoryGB() {
            return this.memoryGB;
        }

    }

    public static class DescribeNamespacesResponseBodyNamespacesTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeNamespacesResponseBodyNamespacesTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeNamespacesResponseBodyNamespacesTags self = new DescribeNamespacesResponseBodyNamespacesTags();
            return TeaModel.build(map, self);
        }

        public DescribeNamespacesResponseBodyNamespacesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeNamespacesResponseBodyNamespacesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeNamespacesResponseBodyNamespaces extends TeaModel {
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("ResourceSpec")
        public DescribeNamespacesResponseBodyNamespacesResourceSpec resourceSpec;

        @NameInMap("ResourceUsed")
        public DescribeNamespacesResponseBodyNamespacesResourceUsed resourceUsed;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public java.util.List<DescribeNamespacesResponseBodyNamespacesTags> tags;

        public static DescribeNamespacesResponseBodyNamespaces build(java.util.Map<String, ?> map) throws Exception {
            DescribeNamespacesResponseBodyNamespaces self = new DescribeNamespacesResponseBodyNamespaces();
            return TeaModel.build(map, self);
        }

        public DescribeNamespacesResponseBodyNamespaces setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeNamespacesResponseBodyNamespaces setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeNamespacesResponseBodyNamespaces setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeNamespacesResponseBodyNamespaces setResourceSpec(DescribeNamespacesResponseBodyNamespacesResourceSpec resourceSpec) {
            this.resourceSpec = resourceSpec;
            return this;
        }
        public DescribeNamespacesResponseBodyNamespacesResourceSpec getResourceSpec() {
            return this.resourceSpec;
        }

        public DescribeNamespacesResponseBodyNamespaces setResourceUsed(DescribeNamespacesResponseBodyNamespacesResourceUsed resourceUsed) {
            this.resourceUsed = resourceUsed;
            return this;
        }
        public DescribeNamespacesResponseBodyNamespacesResourceUsed getResourceUsed() {
            return this.resourceUsed;
        }

        public DescribeNamespacesResponseBodyNamespaces setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeNamespacesResponseBodyNamespaces setTags(java.util.List<DescribeNamespacesResponseBodyNamespacesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeNamespacesResponseBodyNamespacesTags> getTags() {
            return this.tags;
        }

    }

}
