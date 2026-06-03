// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class QueryDictDataItemResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryDictDataItemResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryDictDataItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDictDataItemResponseBody self = new QueryDictDataItemResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDictDataItemResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDictDataItemResponseBody setData(java.util.List<QueryDictDataItemResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryDictDataItemResponseBodyData> getData() {
        return this.data;
    }

    public QueryDictDataItemResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryDictDataItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryDictDataItemResponseBodyDataSubListData extends TeaModel {
        @NameInMap("ClassifyItemCode")
        public String classifyItemCode;

        @NameInMap("ClassifyItemValue")
        public String classifyItemValue;

        @NameInMap("DataItemCode")
        public String dataItemCode;

        @NameInMap("DataItemOrder")
        public Integer dataItemOrder;

        @NameInMap("DataItemParent")
        public String dataItemParent;

        @NameInMap("DataItemValue")
        public String dataItemValue;

        @NameInMap("ItemType")
        public Integer itemType;

        public static QueryDictDataItemResponseBodyDataSubListData build(java.util.Map<String, ?> map) throws Exception {
            QueryDictDataItemResponseBodyDataSubListData self = new QueryDictDataItemResponseBodyDataSubListData();
            return TeaModel.build(map, self);
        }

        public QueryDictDataItemResponseBodyDataSubListData setClassifyItemCode(String classifyItemCode) {
            this.classifyItemCode = classifyItemCode;
            return this;
        }
        public String getClassifyItemCode() {
            return this.classifyItemCode;
        }

        public QueryDictDataItemResponseBodyDataSubListData setClassifyItemValue(String classifyItemValue) {
            this.classifyItemValue = classifyItemValue;
            return this;
        }
        public String getClassifyItemValue() {
            return this.classifyItemValue;
        }

        public QueryDictDataItemResponseBodyDataSubListData setDataItemCode(String dataItemCode) {
            this.dataItemCode = dataItemCode;
            return this;
        }
        public String getDataItemCode() {
            return this.dataItemCode;
        }

        public QueryDictDataItemResponseBodyDataSubListData setDataItemOrder(Integer dataItemOrder) {
            this.dataItemOrder = dataItemOrder;
            return this;
        }
        public Integer getDataItemOrder() {
            return this.dataItemOrder;
        }

        public QueryDictDataItemResponseBodyDataSubListData setDataItemParent(String dataItemParent) {
            this.dataItemParent = dataItemParent;
            return this;
        }
        public String getDataItemParent() {
            return this.dataItemParent;
        }

        public QueryDictDataItemResponseBodyDataSubListData setDataItemValue(String dataItemValue) {
            this.dataItemValue = dataItemValue;
            return this;
        }
        public String getDataItemValue() {
            return this.dataItemValue;
        }

        public QueryDictDataItemResponseBodyDataSubListData setItemType(Integer itemType) {
            this.itemType = itemType;
            return this;
        }
        public Integer getItemType() {
            return this.itemType;
        }

    }

    public static class QueryDictDataItemResponseBodyData extends TeaModel {
        @NameInMap("ClassifyItemCode")
        public String classifyItemCode;

        @NameInMap("ClassifyItemValue")
        public String classifyItemValue;

        @NameInMap("DataItemCode")
        public String dataItemCode;

        @NameInMap("DataItemOrder")
        public Integer dataItemOrder;

        @NameInMap("DataItemParent")
        public String dataItemParent;

        @NameInMap("DataItemValue")
        public String dataItemValue;

        @NameInMap("ItemType")
        public Integer itemType;

        @NameInMap("SubListData")
        public java.util.List<QueryDictDataItemResponseBodyDataSubListData> subListData;

        public static QueryDictDataItemResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDictDataItemResponseBodyData self = new QueryDictDataItemResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDictDataItemResponseBodyData setClassifyItemCode(String classifyItemCode) {
            this.classifyItemCode = classifyItemCode;
            return this;
        }
        public String getClassifyItemCode() {
            return this.classifyItemCode;
        }

        public QueryDictDataItemResponseBodyData setClassifyItemValue(String classifyItemValue) {
            this.classifyItemValue = classifyItemValue;
            return this;
        }
        public String getClassifyItemValue() {
            return this.classifyItemValue;
        }

        public QueryDictDataItemResponseBodyData setDataItemCode(String dataItemCode) {
            this.dataItemCode = dataItemCode;
            return this;
        }
        public String getDataItemCode() {
            return this.dataItemCode;
        }

        public QueryDictDataItemResponseBodyData setDataItemOrder(Integer dataItemOrder) {
            this.dataItemOrder = dataItemOrder;
            return this;
        }
        public Integer getDataItemOrder() {
            return this.dataItemOrder;
        }

        public QueryDictDataItemResponseBodyData setDataItemParent(String dataItemParent) {
            this.dataItemParent = dataItemParent;
            return this;
        }
        public String getDataItemParent() {
            return this.dataItemParent;
        }

        public QueryDictDataItemResponseBodyData setDataItemValue(String dataItemValue) {
            this.dataItemValue = dataItemValue;
            return this;
        }
        public String getDataItemValue() {
            return this.dataItemValue;
        }

        public QueryDictDataItemResponseBodyData setItemType(Integer itemType) {
            this.itemType = itemType;
            return this;
        }
        public Integer getItemType() {
            return this.itemType;
        }

        public QueryDictDataItemResponseBodyData setSubListData(java.util.List<QueryDictDataItemResponseBodyDataSubListData> subListData) {
            this.subListData = subListData;
            return this;
        }
        public java.util.List<QueryDictDataItemResponseBodyDataSubListData> getSubListData() {
            return this.subListData;
        }

    }

}
