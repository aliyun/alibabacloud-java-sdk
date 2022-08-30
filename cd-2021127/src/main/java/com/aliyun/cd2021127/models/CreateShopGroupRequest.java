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

    public static class CreateShopGroupRequestShopGroupList extends TeaModel {
        @NameInMap("ShopGroupId")
        public String shopGroupId;

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
