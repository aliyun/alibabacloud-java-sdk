// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListRpcServicesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RpcServices")
    public ListRpcServicesResponseBodyRpcServices rpcServices;

    public static ListRpcServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRpcServicesResponseBody self = new ListRpcServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRpcServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRpcServicesResponseBody setRpcServices(ListRpcServicesResponseBodyRpcServices rpcServices) {
        this.rpcServices = rpcServices;
        return this;
    }
    public ListRpcServicesResponseBodyRpcServices getRpcServices() {
        return this.rpcServices;
    }

    public static class ListRpcServicesResponseBodyRpcServicesPagination extends TeaModel {
        @NameInMap("PageIndex")
        public Integer pageIndex;

        @NameInMap("TotalPageCount")
        public Integer totalPageCount;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListRpcServicesResponseBodyRpcServicesPagination build(java.util.Map<String, ?> map) throws Exception {
            ListRpcServicesResponseBodyRpcServicesPagination self = new ListRpcServicesResponseBodyRpcServicesPagination();
            return TeaModel.build(map, self);
        }

        public ListRpcServicesResponseBodyRpcServicesPagination setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public ListRpcServicesResponseBodyRpcServicesPagination setTotalPageCount(Integer totalPageCount) {
            this.totalPageCount = totalPageCount;
            return this;
        }
        public Integer getTotalPageCount() {
            return this.totalPageCount;
        }

        public ListRpcServicesResponseBodyRpcServicesPagination setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListRpcServicesResponseBodyRpcServicesPagination setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class ListRpcServicesResponseBodyRpcServicesList extends TeaModel {
        @NameInMap("MethodName")
        public String methodName;

        @NameInMap("Type")
        public String type;

        @NameInMap("InterfaceName")
        public String interfaceName;

        @NameInMap("Params")
        public String params;

        @NameInMap("AppKey")
        public String appKey;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("IsDelete")
        public String isDelete;

        @NameInMap("VersionCode")
        public String versionCode;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Id")
        public Long id;

        public static ListRpcServicesResponseBodyRpcServicesList build(java.util.Map<String, ?> map) throws Exception {
            ListRpcServicesResponseBodyRpcServicesList self = new ListRpcServicesResponseBodyRpcServicesList();
            return TeaModel.build(map, self);
        }

        public ListRpcServicesResponseBodyRpcServicesList setMethodName(String methodName) {
            this.methodName = methodName;
            return this;
        }
        public String getMethodName() {
            return this.methodName;
        }

        public ListRpcServicesResponseBodyRpcServicesList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListRpcServicesResponseBodyRpcServicesList setInterfaceName(String interfaceName) {
            this.interfaceName = interfaceName;
            return this;
        }
        public String getInterfaceName() {
            return this.interfaceName;
        }

        public ListRpcServicesResponseBodyRpcServicesList setParams(String params) {
            this.params = params;
            return this;
        }
        public String getParams() {
            return this.params;
        }

        public ListRpcServicesResponseBodyRpcServicesList setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public ListRpcServicesResponseBodyRpcServicesList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListRpcServicesResponseBodyRpcServicesList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListRpcServicesResponseBodyRpcServicesList setIsDelete(String isDelete) {
            this.isDelete = isDelete;
            return this;
        }
        public String getIsDelete() {
            return this.isDelete;
        }

        public ListRpcServicesResponseBodyRpcServicesList setVersionCode(String versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public String getVersionCode() {
            return this.versionCode;
        }

        public ListRpcServicesResponseBodyRpcServicesList setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListRpcServicesResponseBodyRpcServicesList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class ListRpcServicesResponseBodyRpcServices extends TeaModel {
        @NameInMap("Pagination")
        public ListRpcServicesResponseBodyRpcServicesPagination pagination;

        @NameInMap("List")
        public java.util.List<ListRpcServicesResponseBodyRpcServicesList> list;

        public static ListRpcServicesResponseBodyRpcServices build(java.util.Map<String, ?> map) throws Exception {
            ListRpcServicesResponseBodyRpcServices self = new ListRpcServicesResponseBodyRpcServices();
            return TeaModel.build(map, self);
        }

        public ListRpcServicesResponseBodyRpcServices setPagination(ListRpcServicesResponseBodyRpcServicesPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public ListRpcServicesResponseBodyRpcServicesPagination getPagination() {
            return this.pagination;
        }

        public ListRpcServicesResponseBodyRpcServices setList(java.util.List<ListRpcServicesResponseBodyRpcServicesList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListRpcServicesResponseBodyRpcServicesList> getList() {
            return this.list;
        }

    }

}
