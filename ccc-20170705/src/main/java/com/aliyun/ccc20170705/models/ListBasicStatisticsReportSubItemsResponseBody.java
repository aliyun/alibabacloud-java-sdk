// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListBasicStatisticsReportSubItemsResponseBody extends TeaModel {
    @NameInMap("SubItems")
    public ListBasicStatisticsReportSubItemsResponseBodySubItems subItems;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static ListBasicStatisticsReportSubItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBasicStatisticsReportSubItemsResponseBody self = new ListBasicStatisticsReportSubItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBasicStatisticsReportSubItemsResponseBody setSubItems(ListBasicStatisticsReportSubItemsResponseBodySubItems subItems) {
        this.subItems = subItems;
        return this;
    }
    public ListBasicStatisticsReportSubItemsResponseBodySubItems getSubItems() {
        return this.subItems;
    }

    public ListBasicStatisticsReportSubItemsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListBasicStatisticsReportSubItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBasicStatisticsReportSubItemsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListBasicStatisticsReportSubItemsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListBasicStatisticsReportSubItemsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListBasicStatisticsReportSubItemsResponseBodySubItemsListRow extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListBasicStatisticsReportSubItemsResponseBodySubItemsListRow build(java.util.Map<String, ?> map) throws Exception {
            ListBasicStatisticsReportSubItemsResponseBodySubItemsListRow self = new ListBasicStatisticsReportSubItemsResponseBodySubItemsListRow();
            return TeaModel.build(map, self);
        }

        public ListBasicStatisticsReportSubItemsResponseBodySubItemsListRow setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListBasicStatisticsReportSubItemsResponseBodySubItemsListRow setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListBasicStatisticsReportSubItemsResponseBodySubItemsList extends TeaModel {
        @NameInMap("BasicStatisticsReportSubItemName")
        public String basicStatisticsReportSubItemName;

        @NameInMap("Value")
        public String value;

        @NameInMap("Percentage")
        public Integer percentage;

        @NameInMap("Count")
        public Integer count;

        @NameInMap("Row")
        public java.util.List<ListBasicStatisticsReportSubItemsResponseBodySubItemsListRow> row;

        public static ListBasicStatisticsReportSubItemsResponseBodySubItemsList build(java.util.Map<String, ?> map) throws Exception {
            ListBasicStatisticsReportSubItemsResponseBodySubItemsList self = new ListBasicStatisticsReportSubItemsResponseBodySubItemsList();
            return TeaModel.build(map, self);
        }

        public ListBasicStatisticsReportSubItemsResponseBodySubItemsList setBasicStatisticsReportSubItemName(String basicStatisticsReportSubItemName) {
            this.basicStatisticsReportSubItemName = basicStatisticsReportSubItemName;
            return this;
        }
        public String getBasicStatisticsReportSubItemName() {
            return this.basicStatisticsReportSubItemName;
        }

        public ListBasicStatisticsReportSubItemsResponseBodySubItemsList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public ListBasicStatisticsReportSubItemsResponseBodySubItemsList setPercentage(Integer percentage) {
            this.percentage = percentage;
            return this;
        }
        public Integer getPercentage() {
            return this.percentage;
        }

        public ListBasicStatisticsReportSubItemsResponseBodySubItemsList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListBasicStatisticsReportSubItemsResponseBodySubItemsList setRow(java.util.List<ListBasicStatisticsReportSubItemsResponseBodySubItemsListRow> row) {
            this.row = row;
            return this;
        }
        public java.util.List<ListBasicStatisticsReportSubItemsResponseBodySubItemsListRow> getRow() {
            return this.row;
        }

    }

    public static class ListBasicStatisticsReportSubItemsResponseBodySubItems extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListBasicStatisticsReportSubItemsResponseBodySubItemsList> list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListBasicStatisticsReportSubItemsResponseBodySubItems build(java.util.Map<String, ?> map) throws Exception {
            ListBasicStatisticsReportSubItemsResponseBodySubItems self = new ListBasicStatisticsReportSubItemsResponseBodySubItems();
            return TeaModel.build(map, self);
        }

        public ListBasicStatisticsReportSubItemsResponseBodySubItems setList(java.util.List<ListBasicStatisticsReportSubItemsResponseBodySubItemsList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListBasicStatisticsReportSubItemsResponseBodySubItemsList> getList() {
            return this.list;
        }

        public ListBasicStatisticsReportSubItemsResponseBodySubItems setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListBasicStatisticsReportSubItemsResponseBodySubItems setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListBasicStatisticsReportSubItemsResponseBodySubItems setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
