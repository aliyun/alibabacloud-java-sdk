// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryLogisticsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryLogisticsResponseData data;

    public static QueryLogisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLogisticsResponse self = new QueryLogisticsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLogisticsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLogisticsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryLogisticsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLogisticsResponse setData(QueryLogisticsResponseData data) {
        this.data = data;
        return this;
    }
    public QueryLogisticsResponseData getData() {
        return this.data;
    }

    public static class QueryLogisticsResponseDataDataLogisticsDetailListLogisticsDetailList extends TeaModel {
        @NameInMap("StanderdDesc")
        @Validation(required = true)
        public String standerdDesc;

        @NameInMap("OcurrTimeStr")
        @Validation(required = true)
        public String ocurrTimeStr;

        public static QueryLogisticsResponseDataDataLogisticsDetailListLogisticsDetailList build(java.util.Map<String, ?> map) throws Exception {
            QueryLogisticsResponseDataDataLogisticsDetailListLogisticsDetailList self = new QueryLogisticsResponseDataDataLogisticsDetailListLogisticsDetailList();
            return TeaModel.build(map, self);
        }

        public QueryLogisticsResponseDataDataLogisticsDetailListLogisticsDetailList setStanderdDesc(String standerdDesc) {
            this.standerdDesc = standerdDesc;
            return this;
        }
        public String getStanderdDesc() {
            return this.standerdDesc;
        }

        public QueryLogisticsResponseDataDataLogisticsDetailListLogisticsDetailList setOcurrTimeStr(String ocurrTimeStr) {
            this.ocurrTimeStr = ocurrTimeStr;
            return this;
        }
        public String getOcurrTimeStr() {
            return this.ocurrTimeStr;
        }

    }

    public static class QueryLogisticsResponseDataDataLogisticsDetailList extends TeaModel {
        @NameInMap("LogisticsDetailList")
        @Validation(required = true)
        public java.util.List<QueryLogisticsResponseDataDataLogisticsDetailListLogisticsDetailList> logisticsDetailList;

        public static QueryLogisticsResponseDataDataLogisticsDetailList build(java.util.Map<String, ?> map) throws Exception {
            QueryLogisticsResponseDataDataLogisticsDetailList self = new QueryLogisticsResponseDataDataLogisticsDetailList();
            return TeaModel.build(map, self);
        }

        public QueryLogisticsResponseDataDataLogisticsDetailList setLogisticsDetailList(java.util.List<QueryLogisticsResponseDataDataLogisticsDetailListLogisticsDetailList> logisticsDetailList) {
            this.logisticsDetailList = logisticsDetailList;
            return this;
        }
        public java.util.List<QueryLogisticsResponseDataDataLogisticsDetailListLogisticsDetailList> getLogisticsDetailList() {
            return this.logisticsDetailList;
        }

    }

    public static class QueryLogisticsResponseDataDataGoodsGoods extends TeaModel {
        @NameInMap("GoodName")
        @Validation(required = true)
        public String goodName;

        @NameInMap("Quantity")
        @Validation(required = true)
        public Integer quantity;

        @NameInMap("ItemId")
        @Validation(required = true)
        public Long itemId;

        public static QueryLogisticsResponseDataDataGoodsGoods build(java.util.Map<String, ?> map) throws Exception {
            QueryLogisticsResponseDataDataGoodsGoods self = new QueryLogisticsResponseDataDataGoodsGoods();
            return TeaModel.build(map, self);
        }

        public QueryLogisticsResponseDataDataGoodsGoods setGoodName(String goodName) {
            this.goodName = goodName;
            return this;
        }
        public String getGoodName() {
            return this.goodName;
        }

        public QueryLogisticsResponseDataDataGoodsGoods setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public QueryLogisticsResponseDataDataGoodsGoods setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

    }

    public static class QueryLogisticsResponseDataDataGoods extends TeaModel {
        @NameInMap("Goods")
        @Validation(required = true)
        public java.util.List<QueryLogisticsResponseDataDataGoodsGoods> goods;

        public static QueryLogisticsResponseDataDataGoods build(java.util.Map<String, ?> map) throws Exception {
            QueryLogisticsResponseDataDataGoods self = new QueryLogisticsResponseDataDataGoods();
            return TeaModel.build(map, self);
        }

        public QueryLogisticsResponseDataDataGoods setGoods(java.util.List<QueryLogisticsResponseDataDataGoodsGoods> goods) {
            this.goods = goods;
            return this;
        }
        public java.util.List<QueryLogisticsResponseDataDataGoodsGoods> getGoods() {
            return this.goods;
        }

    }

    public static class QueryLogisticsResponseDataData extends TeaModel {
        @NameInMap("MailNo")
        @Validation(required = true)
        public String mailNo;

        @NameInMap("DataProvider")
        @Validation(required = true)
        public String dataProvider;

        @NameInMap("DataProviderTitle")
        @Validation(required = true)
        public String dataProviderTitle;

        @NameInMap("LogisticsCompanyName")
        @Validation(required = true)
        public String logisticsCompanyName;

        @NameInMap("LogisticsCompanyCode")
        @Validation(required = true)
        public String logisticsCompanyCode;

        @NameInMap("LogisticsDetailList")
        @Validation(required = true)
        public QueryLogisticsResponseDataDataLogisticsDetailList logisticsDetailList;

        @NameInMap("Goods")
        @Validation(required = true)
        public QueryLogisticsResponseDataDataGoods goods;

        public static QueryLogisticsResponseDataData build(java.util.Map<String, ?> map) throws Exception {
            QueryLogisticsResponseDataData self = new QueryLogisticsResponseDataData();
            return TeaModel.build(map, self);
        }

        public QueryLogisticsResponseDataData setMailNo(String mailNo) {
            this.mailNo = mailNo;
            return this;
        }
        public String getMailNo() {
            return this.mailNo;
        }

        public QueryLogisticsResponseDataData setDataProvider(String dataProvider) {
            this.dataProvider = dataProvider;
            return this;
        }
        public String getDataProvider() {
            return this.dataProvider;
        }

        public QueryLogisticsResponseDataData setDataProviderTitle(String dataProviderTitle) {
            this.dataProviderTitle = dataProviderTitle;
            return this;
        }
        public String getDataProviderTitle() {
            return this.dataProviderTitle;
        }

        public QueryLogisticsResponseDataData setLogisticsCompanyName(String logisticsCompanyName) {
            this.logisticsCompanyName = logisticsCompanyName;
            return this;
        }
        public String getLogisticsCompanyName() {
            return this.logisticsCompanyName;
        }

        public QueryLogisticsResponseDataData setLogisticsCompanyCode(String logisticsCompanyCode) {
            this.logisticsCompanyCode = logisticsCompanyCode;
            return this;
        }
        public String getLogisticsCompanyCode() {
            return this.logisticsCompanyCode;
        }

        public QueryLogisticsResponseDataData setLogisticsDetailList(QueryLogisticsResponseDataDataLogisticsDetailList logisticsDetailList) {
            this.logisticsDetailList = logisticsDetailList;
            return this;
        }
        public QueryLogisticsResponseDataDataLogisticsDetailList getLogisticsDetailList() {
            return this.logisticsDetailList;
        }

        public QueryLogisticsResponseDataData setGoods(QueryLogisticsResponseDataDataGoods goods) {
            this.goods = goods;
            return this;
        }
        public QueryLogisticsResponseDataDataGoods getGoods() {
            return this.goods;
        }

    }

    public static class QueryLogisticsResponseData extends TeaModel {
        @NameInMap("Data")
        @Validation(required = true)
        public java.util.List<QueryLogisticsResponseDataData> data;

        public static QueryLogisticsResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryLogisticsResponseData self = new QueryLogisticsResponseData();
            return TeaModel.build(map, self);
        }

        public QueryLogisticsResponseData setData(java.util.List<QueryLogisticsResponseDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryLogisticsResponseDataData> getData() {
            return this.data;
        }

    }

}
