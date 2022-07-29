// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryItemInventoryV2Request extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("DivisionCode")
    public String divisionCode;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("ItemList")
    public java.util.List<QueryItemInventoryV2RequestItemList> itemList;

    public static QueryItemInventoryV2Request build(java.util.Map<String, ?> map) throws Exception {
        QueryItemInventoryV2Request self = new QueryItemInventoryV2Request();
        return TeaModel.build(map, self);
    }

    public QueryItemInventoryV2Request setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryItemInventoryV2Request setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode;
        return this;
    }
    public String getDivisionCode() {
        return this.divisionCode;
    }

    public QueryItemInventoryV2Request setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public QueryItemInventoryV2Request setItemList(java.util.List<QueryItemInventoryV2RequestItemList> itemList) {
        this.itemList = itemList;
        return this;
    }
    public java.util.List<QueryItemInventoryV2RequestItemList> getItemList() {
        return this.itemList;
    }

    public static class QueryItemInventoryV2RequestItemList extends TeaModel {
        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("SkuIdList")
        public java.util.List<Long> skuIdList;

        public static QueryItemInventoryV2RequestItemList build(java.util.Map<String, ?> map) throws Exception {
            QueryItemInventoryV2RequestItemList self = new QueryItemInventoryV2RequestItemList();
            return TeaModel.build(map, self);
        }

        public QueryItemInventoryV2RequestItemList setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryItemInventoryV2RequestItemList setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryItemInventoryV2RequestItemList setSkuIdList(java.util.List<Long> skuIdList) {
            this.skuIdList = skuIdList;
            return this;
        }
        public java.util.List<Long> getSkuIdList() {
            return this.skuIdList;
        }

    }

}
