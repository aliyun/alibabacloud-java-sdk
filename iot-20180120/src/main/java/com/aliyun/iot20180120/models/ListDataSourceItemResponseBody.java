// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListDataSourceItemResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information about the topics that are returned.</p>
     */
    @NameInMap("DataSourceItems")
    public ListDataSourceItemResponseBodyDataSourceItems dataSourceItems;

    /**
     * <p>The error message returned if the request fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E4C0FF92-2A86-41DB-92D3-73B60310D25E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
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
        /**
         * <p>The ID of the topic of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>129322</p>
         */
        @NameInMap("DataSourceItemId")
        public Long dataSourceItemId;

        /**
         * <strong>example:</strong>
         * <p>lightDevice</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <strong>example:</strong>
         * <p>aw3****</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        /**
         * <strong>example:</strong>
         * <p>PRODUCT</p>
         */
        @NameInMap("ScopeType")
        public String scopeType;

        /**
         * <p>The name of the topic of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>/gyh***z/+/thing/event/property/post</p>
         */
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

        public ListDataSourceItemResponseBodyDataSourceItemsDataSourceItem setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public ListDataSourceItemResponseBodyDataSourceItemsDataSourceItem setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public ListDataSourceItemResponseBodyDataSourceItemsDataSourceItem setScopeType(String scopeType) {
            this.scopeType = scopeType;
            return this;
        }
        public String getScopeType() {
            return this.scopeType;
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
