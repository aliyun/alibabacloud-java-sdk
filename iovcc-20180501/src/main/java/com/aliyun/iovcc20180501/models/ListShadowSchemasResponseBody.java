// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListShadowSchemasResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageList")
    public ListShadowSchemasResponseBodyPageList pageList;

    public static ListShadowSchemasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListShadowSchemasResponseBody self = new ListShadowSchemasResponseBody();
        return TeaModel.build(map, self);
    }

    public ListShadowSchemasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListShadowSchemasResponseBody setPageList(ListShadowSchemasResponseBodyPageList pageList) {
        this.pageList = pageList;
        return this;
    }
    public ListShadowSchemasResponseBodyPageList getPageList() {
        return this.pageList;
    }

    public static class ListShadowSchemasResponseBodyPageListList extends TeaModel {
        @NameInMap("AuthTypeDesc")
        public String authTypeDesc;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("DeviceModelId")
        public Long deviceModelId;

        @NameInMap("DeviceModel")
        public String deviceModel;

        @NameInMap("ModuleSchema")
        public String moduleSchema;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("AuthType")
        public Integer authType;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        public static ListShadowSchemasResponseBodyPageListList build(java.util.Map<String, ?> map) throws Exception {
            ListShadowSchemasResponseBodyPageListList self = new ListShadowSchemasResponseBodyPageListList();
            return TeaModel.build(map, self);
        }

        public ListShadowSchemasResponseBodyPageListList setAuthTypeDesc(String authTypeDesc) {
            this.authTypeDesc = authTypeDesc;
            return this;
        }
        public String getAuthTypeDesc() {
            return this.authTypeDesc;
        }

        public ListShadowSchemasResponseBodyPageListList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListShadowSchemasResponseBodyPageListList setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListShadowSchemasResponseBodyPageListList setDeviceModelId(Long deviceModelId) {
            this.deviceModelId = deviceModelId;
            return this;
        }
        public Long getDeviceModelId() {
            return this.deviceModelId;
        }

        public ListShadowSchemasResponseBodyPageListList setDeviceModel(String deviceModel) {
            this.deviceModel = deviceModel;
            return this;
        }
        public String getDeviceModel() {
            return this.deviceModel;
        }

        public ListShadowSchemasResponseBodyPageListList setModuleSchema(String moduleSchema) {
            this.moduleSchema = moduleSchema;
            return this;
        }
        public String getModuleSchema() {
            return this.moduleSchema;
        }

        public ListShadowSchemasResponseBodyPageListList setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListShadowSchemasResponseBodyPageListList setAuthType(Integer authType) {
            this.authType = authType;
            return this;
        }
        public Integer getAuthType() {
            return this.authType;
        }

        public ListShadowSchemasResponseBodyPageListList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListShadowSchemasResponseBodyPageListList setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

    }

    public static class ListShadowSchemasResponseBodyPageListPagination extends TeaModel {
        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("TotalPageCount")
        public Integer totalPageCount;

        @NameInMap("PageIndex")
        public Integer pageIndex;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("SimpleSign")
        public Boolean simpleSign;

        @NameInMap("HasNextPage")
        public Boolean hasNextPage;

        public static ListShadowSchemasResponseBodyPageListPagination build(java.util.Map<String, ?> map) throws Exception {
            ListShadowSchemasResponseBodyPageListPagination self = new ListShadowSchemasResponseBodyPageListPagination();
            return TeaModel.build(map, self);
        }

        public ListShadowSchemasResponseBodyPageListPagination setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListShadowSchemasResponseBodyPageListPagination setTotalPageCount(Integer totalPageCount) {
            this.totalPageCount = totalPageCount;
            return this;
        }
        public Integer getTotalPageCount() {
            return this.totalPageCount;
        }

        public ListShadowSchemasResponseBodyPageListPagination setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public ListShadowSchemasResponseBodyPageListPagination setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListShadowSchemasResponseBodyPageListPagination setSimpleSign(Boolean simpleSign) {
            this.simpleSign = simpleSign;
            return this;
        }
        public Boolean getSimpleSign() {
            return this.simpleSign;
        }

        public ListShadowSchemasResponseBodyPageListPagination setHasNextPage(Boolean hasNextPage) {
            this.hasNextPage = hasNextPage;
            return this;
        }
        public Boolean getHasNextPage() {
            return this.hasNextPage;
        }

    }

    public static class ListShadowSchemasResponseBodyPageList extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListShadowSchemasResponseBodyPageListList> list;

        @NameInMap("Pagination")
        public ListShadowSchemasResponseBodyPageListPagination pagination;

        public static ListShadowSchemasResponseBodyPageList build(java.util.Map<String, ?> map) throws Exception {
            ListShadowSchemasResponseBodyPageList self = new ListShadowSchemasResponseBodyPageList();
            return TeaModel.build(map, self);
        }

        public ListShadowSchemasResponseBodyPageList setList(java.util.List<ListShadowSchemasResponseBodyPageListList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListShadowSchemasResponseBodyPageListList> getList() {
            return this.list;
        }

        public ListShadowSchemasResponseBodyPageList setPagination(ListShadowSchemasResponseBodyPageListPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public ListShadowSchemasResponseBodyPageListPagination getPagination() {
            return this.pagination;
        }

    }

}
