// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class BatchCreateShopGroupRequest extends TeaModel {
    // 门店组列表
    @NameInMap("ShopGroupList")
    public java.util.List<BatchCreateShopGroupRequestShopGroupList> shopGroupList;

    public static BatchCreateShopGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateShopGroupRequest self = new BatchCreateShopGroupRequest();
        return TeaModel.build(map, self);
    }

    public BatchCreateShopGroupRequest setShopGroupList(java.util.List<BatchCreateShopGroupRequestShopGroupList> shopGroupList) {
        this.shopGroupList = shopGroupList;
        return this;
    }
    public java.util.List<BatchCreateShopGroupRequestShopGroupList> getShopGroupList() {
        return this.shopGroupList;
    }

    public static class BatchCreateShopGroupRequestShopGroupList extends TeaModel {
        // 门店组编号（ID）
        @NameInMap("ShopGroupId")
        public String shopGroupId;

        // 门店组名称
        @NameInMap("ShopGroupName")
        public String shopGroupName;

        public static BatchCreateShopGroupRequestShopGroupList build(java.util.Map<String, ?> map) throws Exception {
            BatchCreateShopGroupRequestShopGroupList self = new BatchCreateShopGroupRequestShopGroupList();
            return TeaModel.build(map, self);
        }

        public BatchCreateShopGroupRequestShopGroupList setShopGroupId(String shopGroupId) {
            this.shopGroupId = shopGroupId;
            return this;
        }
        public String getShopGroupId() {
            return this.shopGroupId;
        }

        public BatchCreateShopGroupRequestShopGroupList setShopGroupName(String shopGroupName) {
            this.shopGroupName = shopGroupName;
            return this;
        }
        public String getShopGroupName() {
            return this.shopGroupName;
        }

    }

}
