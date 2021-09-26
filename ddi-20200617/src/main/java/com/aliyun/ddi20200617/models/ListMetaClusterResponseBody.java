// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListMetaClusterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Items")
    public ListMetaClusterResponseBodyItems items;

    public static ListMetaClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMetaClusterResponseBody self = new ListMetaClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMetaClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMetaClusterResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListMetaClusterResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMetaClusterResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListMetaClusterResponseBody setItems(ListMetaClusterResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public ListMetaClusterResponseBodyItems getItems() {
        return this.items;
    }

    public static class ListMetaClusterResponseBodyItemsItemSoftwareInfo extends TeaModel {
        @NameInMap("ClusterType")
        public String clusterType;

        @NameInMap("EmrVer")
        public String emrVer;

        public static ListMetaClusterResponseBodyItemsItemSoftwareInfo build(java.util.Map<String, ?> map) throws Exception {
            ListMetaClusterResponseBodyItemsItemSoftwareInfo self = new ListMetaClusterResponseBodyItemsItemSoftwareInfo();
            return TeaModel.build(map, self);
        }

        public ListMetaClusterResponseBodyItemsItemSoftwareInfo setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public ListMetaClusterResponseBodyItemsItemSoftwareInfo setEmrVer(String emrVer) {
            this.emrVer = emrVer;
            return this;
        }
        public String getEmrVer() {
            return this.emrVer;
        }

    }

    public static class ListMetaClusterResponseBodyItemsItem extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        @NameInMap("SoftwareInfo")
        public ListMetaClusterResponseBodyItemsItemSoftwareInfo softwareInfo;

        public static ListMetaClusterResponseBodyItemsItem build(java.util.Map<String, ?> map) throws Exception {
            ListMetaClusterResponseBodyItemsItem self = new ListMetaClusterResponseBodyItemsItem();
            return TeaModel.build(map, self);
        }

        public ListMetaClusterResponseBodyItemsItem setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMetaClusterResponseBodyItemsItem setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListMetaClusterResponseBodyItemsItem setSoftwareInfo(ListMetaClusterResponseBodyItemsItemSoftwareInfo softwareInfo) {
            this.softwareInfo = softwareInfo;
            return this;
        }
        public ListMetaClusterResponseBodyItemsItemSoftwareInfo getSoftwareInfo() {
            return this.softwareInfo;
        }

    }

    public static class ListMetaClusterResponseBodyItems extends TeaModel {
        @NameInMap("Item")
        public java.util.List<ListMetaClusterResponseBodyItemsItem> item;

        public static ListMetaClusterResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListMetaClusterResponseBodyItems self = new ListMetaClusterResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListMetaClusterResponseBodyItems setItem(java.util.List<ListMetaClusterResponseBodyItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<ListMetaClusterResponseBodyItemsItem> getItem() {
            return this.item;
        }

    }

}
