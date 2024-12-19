// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryItemInventoryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LMALL2******002</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>410503006</p>
     */
    @NameInMap("DivisionCode")
    public String divisionCode;

    /**
     * <strong>example:</strong>
     * <p>113.77.105.73</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ItemList")
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
        /**
         * <strong>example:</strong>
         * <p>630730743485</p>
         */
        @NameInMap("ItemId")
        public Long itemId;

        /**
         * <strong>example:</strong>
         * <p>10000710-635764300767</p>
         */
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
