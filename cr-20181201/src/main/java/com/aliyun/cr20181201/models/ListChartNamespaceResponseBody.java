// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListChartNamespaceResponseBody extends TeaModel {
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("Namespaces")
    public java.util.List<ListChartNamespaceResponseBodyNamespaces> namespaces;

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

    public static ListChartNamespaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListChartNamespaceResponseBody self = new ListChartNamespaceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListChartNamespaceResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public ListChartNamespaceResponseBody setNamespaces(java.util.List<ListChartNamespaceResponseBodyNamespaces> namespaces) {
        this.namespaces = namespaces;
        return this;
    }
    public java.util.List<ListChartNamespaceResponseBodyNamespaces> getNamespaces() {
        return this.namespaces;
    }

    public ListChartNamespaceResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public ListChartNamespaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListChartNamespaceResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListChartNamespaceResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListChartNamespaceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class ListChartNamespaceResponseBodyNamespaces extends TeaModel {
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

        public static ListChartNamespaceResponseBodyNamespaces build(java.util.Map<String, ?> map) throws Exception {
            ListChartNamespaceResponseBodyNamespaces self = new ListChartNamespaceResponseBodyNamespaces();
            return TeaModel.build(map, self);
        }

        public ListChartNamespaceResponseBodyNamespaces setDefaultRepoType(String defaultRepoType) {
            this.defaultRepoType = defaultRepoType;
            return this;
        }
        public String getDefaultRepoType() {
            return this.defaultRepoType;
        }

        public ListChartNamespaceResponseBodyNamespaces setNamespaceStatus(String namespaceStatus) {
            this.namespaceStatus = namespaceStatus;
            return this;
        }
        public String getNamespaceStatus() {
            return this.namespaceStatus;
        }

        public ListChartNamespaceResponseBodyNamespaces setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public ListChartNamespaceResponseBodyNamespaces setAutoCreateRepo(Boolean autoCreateRepo) {
            this.autoCreateRepo = autoCreateRepo;
            return this;
        }
        public Boolean getAutoCreateRepo() {
            return this.autoCreateRepo;
        }

        public ListChartNamespaceResponseBodyNamespaces setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListChartNamespaceResponseBodyNamespaces setNamespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }
        public String getNamespaceName() {
            return this.namespaceName;
        }

    }

}
