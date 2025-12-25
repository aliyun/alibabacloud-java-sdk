// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20190601.models;

import com.aliyun.tea.*;

public class DescribeNamespacesResponseBody extends TeaModel {
    @NameInMap("Namespaces")
    public java.util.List<DescribeNamespacesResponseBodyNamespaces> namespaces;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageIndex")
    public Integer pageIndex;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>67F33190-946B-1105-B6A1-E2DF0426DD51</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <strong>example:</strong>
         * <p>40</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>2.5</p>
         */
        @NameInMap("Cpu")
        public Float cpu;

        /**
         * <strong>example:</strong>
         * <p>1.6</p>
         */
        @NameInMap("Cu")
        public Float cu;

        /**
         * <strong>example:</strong>
         * <p>6.6</p>
         */
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

        public DescribeNamespacesResponseBodyNamespacesResourceUsed setCu(Float cu) {
            this.cu = cu;
            return this;
        }
        public Float getCu() {
            return this.cu;
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
        /**
         * <strong>example:</strong>
         * <p>flink</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>1629879567394</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1629879567394</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Ha")
        public Boolean ha;

        /**
         * <strong>example:</strong>
         * <p>ns-1</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("ResourceSpec")
        public DescribeNamespacesResponseBodyNamespacesResourceSpec resourceSpec;

        @NameInMap("ResourceUsed")
        public DescribeNamespacesResponseBodyNamespacesResourceUsed resourceUsed;

        /**
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
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

        public DescribeNamespacesResponseBodyNamespaces setHa(Boolean ha) {
            this.ha = ha;
            return this;
        }
        public Boolean getHa() {
            return this.ha;
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
