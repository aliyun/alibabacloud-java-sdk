// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListMetaDataSourceClusterForOuterResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Items")
    public ListMetaDataSourceClusterForOuterResponseBodyItems items;

    public static ListMetaDataSourceClusterForOuterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMetaDataSourceClusterForOuterResponseBody self = new ListMetaDataSourceClusterForOuterResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMetaDataSourceClusterForOuterResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListMetaDataSourceClusterForOuterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMetaDataSourceClusterForOuterResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMetaDataSourceClusterForOuterResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListMetaDataSourceClusterForOuterResponseBody setItems(ListMetaDataSourceClusterForOuterResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public ListMetaDataSourceClusterForOuterResponseBodyItems getItems() {
        return this.items;
    }

    public static class ListMetaDataSourceClusterForOuterResponseBodyItemsItem extends TeaModel {
        @NameInMap("DataSourceId")
        public String dataSourceId;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("ClusterId")
        public String clusterId;

        public static ListMetaDataSourceClusterForOuterResponseBodyItemsItem build(java.util.Map<String, ?> map) throws Exception {
            ListMetaDataSourceClusterForOuterResponseBodyItemsItem self = new ListMetaDataSourceClusterForOuterResponseBodyItemsItem();
            return TeaModel.build(map, self);
        }

        public ListMetaDataSourceClusterForOuterResponseBodyItemsItem setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public ListMetaDataSourceClusterForOuterResponseBodyItemsItem setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListMetaDataSourceClusterForOuterResponseBodyItemsItem setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

    }

    public static class ListMetaDataSourceClusterForOuterResponseBodyItems extends TeaModel {
        @NameInMap("Item")
        public java.util.List<ListMetaDataSourceClusterForOuterResponseBodyItemsItem> item;

        public static ListMetaDataSourceClusterForOuterResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListMetaDataSourceClusterForOuterResponseBodyItems self = new ListMetaDataSourceClusterForOuterResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListMetaDataSourceClusterForOuterResponseBodyItems setItem(java.util.List<ListMetaDataSourceClusterForOuterResponseBodyItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<ListMetaDataSourceClusterForOuterResponseBodyItemsItem> getItem() {
            return this.item;
        }

    }

}
