// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListDataSourceItemResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DataSourceItems")
    public ListDataSourceItemResponseBodyDataSourceItems dataSourceItems;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Integer total;

    public static ListDataSourceItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourceItemResponseBody self = new ListDataSourceItemResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataSourceItemResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDataSourceItemResponseBody setDataSourceItems(ListDataSourceItemResponseBodyDataSourceItems dataSourceItems) {
        this.dataSourceItems = dataSourceItems;
        return this;
    }
    public ListDataSourceItemResponseBodyDataSourceItems getDataSourceItems() {
        return this.dataSourceItems;
    }

    public ListDataSourceItemResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDataSourceItemResponseBody setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListDataSourceItemResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataSourceItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataSourceItemResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDataSourceItemResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListDataSourceItemResponseBodyDataSourceItemsDataSourceItem extends TeaModel {
        @NameInMap("DataSourceItemId")
        public Long dataSourceItemId;

        @NameInMap("Topic")
        public String topic;

        public static ListDataSourceItemResponseBodyDataSourceItemsDataSourceItem build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourceItemResponseBodyDataSourceItemsDataSourceItem self = new ListDataSourceItemResponseBodyDataSourceItemsDataSourceItem();
            return TeaModel.build(map, self);
        }

        public ListDataSourceItemResponseBodyDataSourceItemsDataSourceItem setDataSourceItemId(Long dataSourceItemId) {
            this.dataSourceItemId = dataSourceItemId;
            return this;
        }
        public Long getDataSourceItemId() {
            return this.dataSourceItemId;
        }

        public ListDataSourceItemResponseBodyDataSourceItemsDataSourceItem setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class ListDataSourceItemResponseBodyDataSourceItems extends TeaModel {
        @NameInMap("dataSourceItem")
        public java.util.List<ListDataSourceItemResponseBodyDataSourceItemsDataSourceItem> dataSourceItem;

        public static ListDataSourceItemResponseBodyDataSourceItems build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourceItemResponseBodyDataSourceItems self = new ListDataSourceItemResponseBodyDataSourceItems();
            return TeaModel.build(map, self);
        }

        public ListDataSourceItemResponseBodyDataSourceItems setDataSourceItem(java.util.List<ListDataSourceItemResponseBodyDataSourceItemsDataSourceItem> dataSourceItem) {
            this.dataSourceItem = dataSourceItem;
            return this;
        }
        public java.util.List<ListDataSourceItemResponseBodyDataSourceItemsDataSourceItem> getDataSourceItem() {
            return this.dataSourceItem;
        }

    }

}
