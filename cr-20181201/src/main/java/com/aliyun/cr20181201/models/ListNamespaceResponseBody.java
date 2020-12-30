// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListNamespaceResponseBody extends TeaModel {
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("Namespaces")
    public java.util.List<ListNamespaceResponseBodyNamespaces> namespaces;

    @NameInMap("TotalCount")
    public String totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("Code")
    public String code;

    public static ListNamespaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNamespaceResponseBody self = new ListNamespaceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNamespaceResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public ListNamespaceResponseBody setNamespaces(java.util.List<ListNamespaceResponseBodyNamespaces> namespaces) {
        this.namespaces = namespaces;
        return this;
    }
    public java.util.List<ListNamespaceResponseBodyNamespaces> getNamespaces() {
        return this.namespaces;
    }

    public ListNamespaceResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public ListNamespaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNamespaceResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListNamespaceResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListNamespaceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class ListNamespaceResponseBodyNamespaces extends TeaModel {
        @NameInMap("DefaultRepoType")
        public String defaultRepoType;

        @NameInMap("NamespaceStatus")
        public String namespaceStatus;

        @NameInMap("NamespaceId")
        public String namespaceId;

        @NameInMap("AutoCreateRepo")
        public Boolean autoCreateRepo;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("NamespaceName")
        public String namespaceName;

        public static ListNamespaceResponseBodyNamespaces build(java.util.Map<String, ?> map) throws Exception {
            ListNamespaceResponseBodyNamespaces self = new ListNamespaceResponseBodyNamespaces();
            return TeaModel.build(map, self);
        }

        public ListNamespaceResponseBodyNamespaces setDefaultRepoType(String defaultRepoType) {
            this.defaultRepoType = defaultRepoType;
            return this;
        }
        public String getDefaultRepoType() {
            return this.defaultRepoType;
        }

        public ListNamespaceResponseBodyNamespaces setNamespaceStatus(String namespaceStatus) {
            this.namespaceStatus = namespaceStatus;
            return this;
        }
        public String getNamespaceStatus() {
            return this.namespaceStatus;
        }

        public ListNamespaceResponseBodyNamespaces setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public ListNamespaceResponseBodyNamespaces setAutoCreateRepo(Boolean autoCreateRepo) {
            this.autoCreateRepo = autoCreateRepo;
            return this;
        }
        public Boolean getAutoCreateRepo() {
            return this.autoCreateRepo;
        }

        public ListNamespaceResponseBodyNamespaces setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListNamespaceResponseBodyNamespaces setNamespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }
        public String getNamespaceName() {
            return this.namespaceName;
        }

    }

}
