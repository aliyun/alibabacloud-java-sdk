// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class UpdateStoreRequest extends TeaModel {
    @NameInMap("Brand")
    public String brand;

    @NameInMap("Comments")
    public String comments;

    @NameInMap("Groups")
    public String groups;

    @NameInMap("OutId")
    public String outId;

    @NameInMap("Phone")
    public String phone;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StoreId")
    public String storeId;

    @NameInMap("StoreName")
    public String storeName;

    public static UpdateStoreRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateStoreRequest self = new UpdateStoreRequest();
        return TeaModel.build(map, self);
    }

    public UpdateStoreRequest setBrand(String brand) {
        this.brand = brand;
        return this;
    }
    public String getBrand() {
        return this.brand;
    }

    public UpdateStoreRequest setComments(String comments) {
        this.comments = comments;
        return this;
    }
    public String getComments() {
        return this.comments;
    }

    public UpdateStoreRequest setGroups(String groups) {
        this.groups = groups;
        return this;
    }
    public String getGroups() {
        return this.groups;
    }

    public UpdateStoreRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public UpdateStoreRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public UpdateStoreRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public UpdateStoreRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

}
