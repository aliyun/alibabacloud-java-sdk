// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class BatchCreateShopGroupRequest extends TeaModel {
    @NameInMap("Country")
    public String country;

    @NameInMap("ShopGroupList")
    public java.util.List<BatchCreateShopGroupRequestShopGroupList> shopGroupList;

    public static BatchCreateShopGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateShopGroupRequest self = new BatchCreateShopGroupRequest();
        return TeaModel.build(map, self);
    }

    public BatchCreateShopGroupRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public BatchCreateShopGroupRequest setShopGroupList(java.util.List<BatchCreateShopGroupRequestShopGroupList> shopGroupList) {
        this.shopGroupList = shopGroupList;
        return this;
    }
    public java.util.List<BatchCreateShopGroupRequestShopGroupList> getShopGroupList() {
        return this.shopGroupList;
    }

    public static class BatchCreateShopGroupRequestShopGroupList extends TeaModel {
        @NameInMap("ShopGroupId")
        public String shopGroupId;

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
