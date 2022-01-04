// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class CreateShopGroupRequest extends TeaModel {
    @NameInMap("ShopGroupList")
    public java.util.List<CreateShopGroupRequestShopGroupList> shopGroupList;

    public static CreateShopGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateShopGroupRequest self = new CreateShopGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateShopGroupRequest setShopGroupList(java.util.List<CreateShopGroupRequestShopGroupList> shopGroupList) {
        this.shopGroupList = shopGroupList;
        return this;
    }
    public java.util.List<CreateShopGroupRequestShopGroupList> getShopGroupList() {
        return this.shopGroupList;
    }

    public static class CreateShopGroupRequestShopGroupList extends TeaModel {
        // 门店组编号（ID）
        @NameInMap("ShopGroupId")
        public String shopGroupId;

        // 门店组名称
        @NameInMap("ShopGroupName")
        public String shopGroupName;

        public static CreateShopGroupRequestShopGroupList build(java.util.Map<String, ?> map) throws Exception {
            CreateShopGroupRequestShopGroupList self = new CreateShopGroupRequestShopGroupList();
            return TeaModel.build(map, self);
        }

        public CreateShopGroupRequestShopGroupList setShopGroupId(String shopGroupId) {
            this.shopGroupId = shopGroupId;
            return this;
        }
        public String getShopGroupId() {
            return this.shopGroupId;
        }

        public CreateShopGroupRequestShopGroupList setShopGroupName(String shopGroupName) {
            this.shopGroupName = shopGroupName;
            return this;
        }
        public String getShopGroupName() {
            return this.shopGroupName;
        }

    }

}
