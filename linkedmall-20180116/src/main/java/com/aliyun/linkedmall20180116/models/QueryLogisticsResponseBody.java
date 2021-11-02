// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryLogisticsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryLogisticsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryLogisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLogisticsResponseBody self = new QueryLogisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLogisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryLogisticsResponseBody setData(QueryLogisticsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryLogisticsResponseBodyData getData() {
        return this.data;
    }

    public QueryLogisticsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLogisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryLogisticsResponseBodyDataDataGoodsGoods extends TeaModel {
        @NameInMap("GoodName")
        public String goodName;

        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("Quantity")
        public Integer quantity;

        public static QueryLogisticsResponseBodyDataDataGoodsGoods build(java.util.Map<String, ?> map) throws Exception {
            QueryLogisticsResponseBodyDataDataGoodsGoods self = new QueryLogisticsResponseBodyDataDataGoodsGoods();
            return TeaModel.build(map, self);
        }

        public QueryLogisticsResponseBodyDataDataGoodsGoods setGoodName(String goodName) {
            this.goodName = goodName;
            return this;
        }
        public String getGoodName() {
            return this.goodName;
        }

        public QueryLogisticsResponseBodyDataDataGoodsGoods setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryLogisticsResponseBodyDataDataGoodsGoods setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

    }

    public static class QueryLogisticsResponseBodyDataDataGoods extends TeaModel {
        @NameInMap("Goods")
        public java.util.List<QueryLogisticsResponseBodyDataDataGoodsGoods> goods;

        public static QueryLogisticsResponseBodyDataDataGoods build(java.util.Map<String, ?> map) throws Exception {
            QueryLogisticsResponseBodyDataDataGoods self = new QueryLogisticsResponseBodyDataDataGoods();
            return TeaModel.build(map, self);
        }

        public QueryLogisticsResponseBodyDataDataGoods setGoods(java.util.List<QueryLogisticsResponseBodyDataDataGoodsGoods> goods) {
            this.goods = goods;
            return this;
        }
        public java.util.List<QueryLogisticsResponseBodyDataDataGoodsGoods> getGoods() {
            return this.goods;
        }

    }

    public static class QueryLogisticsResponseBodyDataDataLogisticsDetailListLogisticsDetailList extends TeaModel {
        @NameInMap("OcurrTimeStr")
        public String ocurrTimeStr;

        @NameInMap("StanderdDesc")
        public String standerdDesc;

        public static QueryLogisticsResponseBodyDataDataLogisticsDetailListLogisticsDetailList build(java.util.Map<String, ?> map) throws Exception {
            QueryLogisticsResponseBodyDataDataLogisticsDetailListLogisticsDetailList self = new QueryLogisticsResponseBodyDataDataLogisticsDetailListLogisticsDetailList();
            return TeaModel.build(map, self);
        }

        public QueryLogisticsResponseBodyDataDataLogisticsDetailListLogisticsDetailList setOcurrTimeStr(String ocurrTimeStr) {
            this.ocurrTimeStr = ocurrTimeStr;
            return this;
        }
        public String getOcurrTimeStr() {
            return this.ocurrTimeStr;
        }

        public QueryLogisticsResponseBodyDataDataLogisticsDetailListLogisticsDetailList setStanderdDesc(String standerdDesc) {
            this.standerdDesc = standerdDesc;
            return this;
        }
        public String getStanderdDesc() {
            return this.standerdDesc;
        }

    }

    public static class QueryLogisticsResponseBodyDataDataLogisticsDetailList extends TeaModel {
        @NameInMap("LogisticsDetailList")
        public java.util.List<QueryLogisticsResponseBodyDataDataLogisticsDetailListLogisticsDetailList> logisticsDetailList;

        public static QueryLogisticsResponseBodyDataDataLogisticsDetailList build(java.util.Map<String, ?> map) throws Exception {
            QueryLogisticsResponseBodyDataDataLogisticsDetailList self = new QueryLogisticsResponseBodyDataDataLogisticsDetailList();
            return TeaModel.build(map, self);
        }

        public QueryLogisticsResponseBodyDataDataLogisticsDetailList setLogisticsDetailList(java.util.List<QueryLogisticsResponseBodyDataDataLogisticsDetailListLogisticsDetailList> logisticsDetailList) {
            this.logisticsDetailList = logisticsDetailList;
            return this;
        }
        public java.util.List<QueryLogisticsResponseBodyDataDataLogisticsDetailListLogisticsDetailList> getLogisticsDetailList() {
            return this.logisticsDetailList;
        }

    }

    public static class QueryLogisticsResponseBodyDataData extends TeaModel {
        @NameInMap("DataProvider")
        public String dataProvider;

        @NameInMap("DataProviderTitle")
        public String dataProviderTitle;

        @NameInMap("Goods")
        public QueryLogisticsResponseBodyDataDataGoods goods;

        @NameInMap("LogisticsCompanyCode")
        public String logisticsCompanyCode;

        @NameInMap("LogisticsCompanyName")
        public String logisticsCompanyName;

        @NameInMap("LogisticsDetailList")
        public QueryLogisticsResponseBodyDataDataLogisticsDetailList logisticsDetailList;

        @NameInMap("MailNo")
        public String mailNo;

        public static QueryLogisticsResponseBodyDataData build(java.util.Map<String, ?> map) throws Exception {
            QueryLogisticsResponseBodyDataData self = new QueryLogisticsResponseBodyDataData();
            return TeaModel.build(map, self);
        }

        public QueryLogisticsResponseBodyDataData setDataProvider(String dataProvider) {
            this.dataProvider = dataProvider;
            return this;
        }
        public String getDataProvider() {
            return this.dataProvider;
        }

        public QueryLogisticsResponseBodyDataData setDataProviderTitle(String dataProviderTitle) {
            this.dataProviderTitle = dataProviderTitle;
            return this;
        }
        public String getDataProviderTitle() {
            return this.dataProviderTitle;
        }

        public QueryLogisticsResponseBodyDataData setGoods(QueryLogisticsResponseBodyDataDataGoods goods) {
            this.goods = goods;
            return this;
        }
        public QueryLogisticsResponseBodyDataDataGoods getGoods() {
            return this.goods;
        }

        public QueryLogisticsResponseBodyDataData setLogisticsCompanyCode(String logisticsCompanyCode) {
            this.logisticsCompanyCode = logisticsCompanyCode;
            return this;
        }
        public String getLogisticsCompanyCode() {
            return this.logisticsCompanyCode;
        }

        public QueryLogisticsResponseBodyDataData setLogisticsCompanyName(String logisticsCompanyName) {
            this.logisticsCompanyName = logisticsCompanyName;
            return this;
        }
        public String getLogisticsCompanyName() {
            return this.logisticsCompanyName;
        }

        public QueryLogisticsResponseBodyDataData setLogisticsDetailList(QueryLogisticsResponseBodyDataDataLogisticsDetailList logisticsDetailList) {
            this.logisticsDetailList = logisticsDetailList;
            return this;
        }
        public QueryLogisticsResponseBodyDataDataLogisticsDetailList getLogisticsDetailList() {
            return this.logisticsDetailList;
        }

        public QueryLogisticsResponseBodyDataData setMailNo(String mailNo) {
            this.mailNo = mailNo;
            return this;
        }
        public String getMailNo() {
            return this.mailNo;
        }

    }

    public static class QueryLogisticsResponseBodyData extends TeaModel {
        @NameInMap("Data")
        public java.util.List<QueryLogisticsResponseBodyDataData> data;

        public static QueryLogisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLogisticsResponseBodyData self = new QueryLogisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLogisticsResponseBodyData setData(java.util.List<QueryLogisticsResponseBodyDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryLogisticsResponseBodyDataData> getData() {
            return this.data;
        }

    }

}
