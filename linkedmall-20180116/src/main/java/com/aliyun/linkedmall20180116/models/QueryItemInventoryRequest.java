// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryItemInventoryRequest extends TeaModel {
    @NameInMap("BizId")
    @Validation(required = true)
    public String bizId;

    @NameInMap("DivisionCode")
    @Validation(required = true)
    public String divisionCode;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("ItemList")
    @Validation(required = true)
    public java.util.List<QueryItemInventoryRequestItemList> itemList;

    public static QueryItemInventoryRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryItemInventoryRequest self = new QueryItemInventoryRequest();
        return TeaModel.build(map, self);
    }

    public QueryItemInventoryRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryItemInventoryRequest setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode;
        return this;
    }
    public String getDivisionCode() {
        return this.divisionCode;
    }

    public QueryItemInventoryRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public QueryItemInventoryRequest setItemList(java.util.List<QueryItemInventoryRequestItemList> itemList) {
        this.itemList = itemList;
        return this;
    }
    public java.util.List<QueryItemInventoryRequestItemList> getItemList() {
        return this.itemList;
    }

    public static class QueryItemInventoryRequestItemList extends TeaModel {
        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("SkuIdList")
        public java.util.List<Long> skuIdList;

        public static QueryItemInventoryRequestItemList build(java.util.Map<String, ?> map) throws Exception {
            QueryItemInventoryRequestItemList self = new QueryItemInventoryRequestItemList();
            return TeaModel.build(map, self);
        }

        public QueryItemInventoryRequestItemList setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryItemInventoryRequestItemList setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryItemInventoryRequestItemList setSkuIdList(java.util.List<Long> skuIdList) {
            this.skuIdList = skuIdList;
            return this;
        }
        public java.util.List<Long> getSkuIdList() {
            return this.skuIdList;
        }

    }

}
