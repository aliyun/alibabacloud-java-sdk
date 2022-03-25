// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CustomCreateOrderRequest extends TeaModel {
    @NameInMap("ItemType")
    public String itemType;

    @NameInMap("OrderName")
    public String orderName;

    @NameInMap("OrderPhotoContact")
    public String orderPhotoContact;

    @NameInMap("PhotoAddress")
    public String photoAddress;

    @NameInMap("PhotoEnvironment")
    public String photoEnvironment;

    @NameInMap("PhotoFloorNum")
    public Long photoFloorNum;

    public static CustomCreateOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CustomCreateOrderRequest self = new CustomCreateOrderRequest();
        return TeaModel.build(map, self);
    }

    public CustomCreateOrderRequest setItemType(String itemType) {
        this.itemType = itemType;
        return this;
    }
    public String getItemType() {
        return this.itemType;
    }

    public CustomCreateOrderRequest setOrderName(String orderName) {
        this.orderName = orderName;
        return this;
    }
    public String getOrderName() {
        return this.orderName;
    }

    public CustomCreateOrderRequest setOrderPhotoContact(String orderPhotoContact) {
        this.orderPhotoContact = orderPhotoContact;
        return this;
    }
    public String getOrderPhotoContact() {
        return this.orderPhotoContact;
    }

    public CustomCreateOrderRequest setPhotoAddress(String photoAddress) {
        this.photoAddress = photoAddress;
        return this;
    }
    public String getPhotoAddress() {
        return this.photoAddress;
    }

    public CustomCreateOrderRequest setPhotoEnvironment(String photoEnvironment) {
        this.photoEnvironment = photoEnvironment;
        return this;
    }
    public String getPhotoEnvironment() {
        return this.photoEnvironment;
    }

    public CustomCreateOrderRequest setPhotoFloorNum(Long photoFloorNum) {
        this.photoFloorNum = photoFloorNum;
        return this;
    }
    public Long getPhotoFloorNum() {
        return this.photoFloorNum;
    }

}
