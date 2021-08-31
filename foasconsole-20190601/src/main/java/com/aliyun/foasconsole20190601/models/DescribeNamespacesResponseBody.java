// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20190601.models;

import com.aliyun.tea.*;

public class DescribeNamespacesResponseBody extends TeaModel {
    // 请求id
    @NameInMap("RequestId")
    public String requestId;

    // 是否成功
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("TotalPage")
    public Integer totalPage;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Namespaces")
    public java.util.List<DescribeNamespacesResponseBodyNamespaces> namespaces;

    public static DescribeNamespacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNamespacesResponseBody self = new DescribeNamespacesResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeNamespacesResponseBody setNamespaces(java.util.List<DescribeNamespacesResponseBodyNamespaces> namespaces) {
        this.namespaces = namespaces;
        return this;
    }
    public java.util.List<DescribeNamespacesResponseBodyNamespaces> getNamespaces() {
        return this.namespaces;
    }

    public static class DescribeNamespacesResponseBodyNamespacesResourceSpec extends TeaModel {
        @NameInMap("Cu")
        public Integer cu;

        public static DescribeNamespacesResponseBodyNamespacesResourceSpec build(java.util.Map<String, ?> map) throws Exception {
            DescribeNamespacesResponseBodyNamespacesResourceSpec self = new DescribeNamespacesResponseBodyNamespacesResourceSpec();
            return TeaModel.build(map, self);
        }

        public DescribeNamespacesResponseBodyNamespacesResourceSpec setCu(Integer cu) {
            this.cu = cu;
            return this;
        }
        public Integer getCu() {
            return this.cu;
        }

    }

    public static class DescribeNamespacesResponseBodyNamespaces extends TeaModel {
        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Status")
        public String status;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("ResourceSpec")
        public DescribeNamespacesResponseBodyNamespacesResourceSpec resourceSpec;

        public static DescribeNamespacesResponseBodyNamespaces build(java.util.Map<String, ?> map) throws Exception {
            DescribeNamespacesResponseBodyNamespaces self = new DescribeNamespacesResponseBodyNamespaces();
            return TeaModel.build(map, self);
        }

        public DescribeNamespacesResponseBodyNamespaces setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeNamespacesResponseBodyNamespaces setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
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

        public DescribeNamespacesResponseBodyNamespaces setResourceSpec(DescribeNamespacesResponseBodyNamespacesResourceSpec resourceSpec) {
            this.resourceSpec = resourceSpec;
            return this;
        }
        public DescribeNamespacesResponseBodyNamespacesResourceSpec getResourceSpec() {
            return this.resourceSpec;
        }

    }

}
