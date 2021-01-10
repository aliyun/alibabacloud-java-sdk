// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListUpstreamAppKeyRelationsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RelationList")
    public ListUpstreamAppKeyRelationsResponseBodyRelationList relationList;

    public static ListUpstreamAppKeyRelationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUpstreamAppKeyRelationsResponseBody self = new ListUpstreamAppKeyRelationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUpstreamAppKeyRelationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUpstreamAppKeyRelationsResponseBody setRelationList(ListUpstreamAppKeyRelationsResponseBodyRelationList relationList) {
        this.relationList = relationList;
        return this;
    }
    public ListUpstreamAppKeyRelationsResponseBodyRelationList getRelationList() {
        return this.relationList;
    }

    public static class ListUpstreamAppKeyRelationsResponseBodyRelationListPagination extends TeaModel {
        @NameInMap("PageIndex")
        public Integer pageIndex;

        @NameInMap("TotalPageCount")
        public Integer totalPageCount;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListUpstreamAppKeyRelationsResponseBodyRelationListPagination build(java.util.Map<String, ?> map) throws Exception {
            ListUpstreamAppKeyRelationsResponseBodyRelationListPagination self = new ListUpstreamAppKeyRelationsResponseBodyRelationListPagination();
            return TeaModel.build(map, self);
        }

        public ListUpstreamAppKeyRelationsResponseBodyRelationListPagination setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public ListUpstreamAppKeyRelationsResponseBodyRelationListPagination setTotalPageCount(Integer totalPageCount) {
            this.totalPageCount = totalPageCount;
            return this;
        }
        public Integer getTotalPageCount() {
            return this.totalPageCount;
        }

        public ListUpstreamAppKeyRelationsResponseBodyRelationListPagination setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListUpstreamAppKeyRelationsResponseBodyRelationListPagination setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class ListUpstreamAppKeyRelationsResponseBodyRelationListList extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppKey")
        public String appKey;

        @NameInMap("AppPackage")
        public String appPackage;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("PAppKey")
        public String PAppKey;

        @NameInMap("Id")
        public Long id;

        public static ListUpstreamAppKeyRelationsResponseBodyRelationListList build(java.util.Map<String, ?> map) throws Exception {
            ListUpstreamAppKeyRelationsResponseBodyRelationListList self = new ListUpstreamAppKeyRelationsResponseBodyRelationListList();
            return TeaModel.build(map, self);
        }

        public ListUpstreamAppKeyRelationsResponseBodyRelationListList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListUpstreamAppKeyRelationsResponseBodyRelationListList setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public ListUpstreamAppKeyRelationsResponseBodyRelationListList setAppPackage(String appPackage) {
            this.appPackage = appPackage;
            return this;
        }
        public String getAppPackage() {
            return this.appPackage;
        }

        public ListUpstreamAppKeyRelationsResponseBodyRelationListList setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListUpstreamAppKeyRelationsResponseBodyRelationListList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListUpstreamAppKeyRelationsResponseBodyRelationListList setPAppKey(String PAppKey) {
            this.PAppKey = PAppKey;
            return this;
        }
        public String getPAppKey() {
            return this.PAppKey;
        }

        public ListUpstreamAppKeyRelationsResponseBodyRelationListList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class ListUpstreamAppKeyRelationsResponseBodyRelationList extends TeaModel {
        @NameInMap("Pagination")
        public ListUpstreamAppKeyRelationsResponseBodyRelationListPagination pagination;

        @NameInMap("List")
        public java.util.List<ListUpstreamAppKeyRelationsResponseBodyRelationListList> list;

        public static ListUpstreamAppKeyRelationsResponseBodyRelationList build(java.util.Map<String, ?> map) throws Exception {
            ListUpstreamAppKeyRelationsResponseBodyRelationList self = new ListUpstreamAppKeyRelationsResponseBodyRelationList();
            return TeaModel.build(map, self);
        }

        public ListUpstreamAppKeyRelationsResponseBodyRelationList setPagination(ListUpstreamAppKeyRelationsResponseBodyRelationListPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public ListUpstreamAppKeyRelationsResponseBodyRelationListPagination getPagination() {
            return this.pagination;
        }

        public ListUpstreamAppKeyRelationsResponseBodyRelationList setList(java.util.List<ListUpstreamAppKeyRelationsResponseBodyRelationListList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListUpstreamAppKeyRelationsResponseBodyRelationListList> getList() {
            return this.list;
        }

    }

}
