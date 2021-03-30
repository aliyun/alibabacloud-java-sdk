// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListSchemaSubscribesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageList")
    public java.util.List<ListSchemaSubscribesResponseBodyPageList> pageList;

    public static ListSchemaSubscribesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSchemaSubscribesResponseBody self = new ListSchemaSubscribesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSchemaSubscribesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSchemaSubscribesResponseBody setPageList(java.util.List<ListSchemaSubscribesResponseBodyPageList> pageList) {
        this.pageList = pageList;
        return this;
    }
    public java.util.List<ListSchemaSubscribesResponseBodyPageList> getPageList() {
        return this.pageList;
    }

    public static class ListSchemaSubscribesResponseBodyPageListPagination extends TeaModel {
        @NameInMap("PageIndex")
        public Integer pageIndex;

        @NameInMap("TotalPageCount")
        public Integer totalPageCount;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("SimpleSign")
        public Boolean simpleSign;

        @NameInMap("HasNextPage")
        public Boolean hasNextPage;

        public static ListSchemaSubscribesResponseBodyPageListPagination build(java.util.Map<String, ?> map) throws Exception {
            ListSchemaSubscribesResponseBodyPageListPagination self = new ListSchemaSubscribesResponseBodyPageListPagination();
            return TeaModel.build(map, self);
        }

        public ListSchemaSubscribesResponseBodyPageListPagination setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public ListSchemaSubscribesResponseBodyPageListPagination setTotalPageCount(Integer totalPageCount) {
            this.totalPageCount = totalPageCount;
            return this;
        }
        public Integer getTotalPageCount() {
            return this.totalPageCount;
        }

        public ListSchemaSubscribesResponseBodyPageListPagination setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListSchemaSubscribesResponseBodyPageListPagination setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListSchemaSubscribesResponseBodyPageListPagination setSimpleSign(Boolean simpleSign) {
            this.simpleSign = simpleSign;
            return this;
        }
        public Boolean getSimpleSign() {
            return this.simpleSign;
        }

        public ListSchemaSubscribesResponseBodyPageListPagination setHasNextPage(Boolean hasNextPage) {
            this.hasNextPage = hasNextPage;
            return this;
        }
        public Boolean getHasNextPage() {
            return this.hasNextPage;
        }

    }

    public static class ListSchemaSubscribesResponseBodyPageListList extends TeaModel {
        @NameInMap("DeviceModelId")
        public Long deviceModelId;

        @NameInMap("Version")
        public String version;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("ValiditySchema")
        public String validitySchema;

        @NameInMap("DeviceModel")
        public String deviceModel;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Id")
        public Long id;

        public static ListSchemaSubscribesResponseBodyPageListList build(java.util.Map<String, ?> map) throws Exception {
            ListSchemaSubscribesResponseBodyPageListList self = new ListSchemaSubscribesResponseBodyPageListList();
            return TeaModel.build(map, self);
        }

        public ListSchemaSubscribesResponseBodyPageListList setDeviceModelId(Long deviceModelId) {
            this.deviceModelId = deviceModelId;
            return this;
        }
        public Long getDeviceModelId() {
            return this.deviceModelId;
        }

        public ListSchemaSubscribesResponseBodyPageListList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListSchemaSubscribesResponseBodyPageListList setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListSchemaSubscribesResponseBodyPageListList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListSchemaSubscribesResponseBodyPageListList setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListSchemaSubscribesResponseBodyPageListList setValiditySchema(String validitySchema) {
            this.validitySchema = validitySchema;
            return this;
        }
        public String getValiditySchema() {
            return this.validitySchema;
        }

        public ListSchemaSubscribesResponseBodyPageListList setDeviceModel(String deviceModel) {
            this.deviceModel = deviceModel;
            return this;
        }
        public String getDeviceModel() {
            return this.deviceModel;
        }

        public ListSchemaSubscribesResponseBodyPageListList setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListSchemaSubscribesResponseBodyPageListList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class ListSchemaSubscribesResponseBodyPageList extends TeaModel {
        @NameInMap("Pagination")
        public ListSchemaSubscribesResponseBodyPageListPagination pagination;

        @NameInMap("List")
        public java.util.List<ListSchemaSubscribesResponseBodyPageListList> list;

        public static ListSchemaSubscribesResponseBodyPageList build(java.util.Map<String, ?> map) throws Exception {
            ListSchemaSubscribesResponseBodyPageList self = new ListSchemaSubscribesResponseBodyPageList();
            return TeaModel.build(map, self);
        }

        public ListSchemaSubscribesResponseBodyPageList setPagination(ListSchemaSubscribesResponseBodyPageListPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public ListSchemaSubscribesResponseBodyPageListPagination getPagination() {
            return this.pagination;
        }

        public ListSchemaSubscribesResponseBodyPageList setList(java.util.List<ListSchemaSubscribesResponseBodyPageListList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListSchemaSubscribesResponseBodyPageListList> getList() {
            return this.list;
        }

    }

}
