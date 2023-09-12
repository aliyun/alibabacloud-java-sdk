// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class AddressInfo extends TeaModel {
    @NameInMap("addressDetail")
    public String addressDetail;

    @NameInMap("addressId")
    public Long addressId;

    @NameInMap("divisionCode")
    public String divisionCode;

    @NameInMap("receiver")
    public String receiver;

    @NameInMap("receiverPhone")
    public String receiverPhone;

    @NameInMap("townDivisionCode")
    public String townDivisionCode;

    public static AddressInfo build(java.util.Map<String, ?> map) throws Exception {
        AddressInfo self = new AddressInfo();
        return TeaModel.build(map, self);
    }

    public AddressInfo setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
        return this;
    }
    public String getAddressDetail() {
        return this.addressDetail;
    }

    public AddressInfo setAddressId(Long addressId) {
        this.addressId = addressId;
        return this;
    }
    public Long getAddressId() {
        return this.addressId;
    }

    public AddressInfo setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode;
        return this;
    }
    public String getDivisionCode() {
        return this.divisionCode;
    }

    public AddressInfo setReceiver(String receiver) {
        this.receiver = receiver;
        return this;
    }
    public String getReceiver() {
        return this.receiver;
    }

    public AddressInfo setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
        return this;
    }
    public String getReceiverPhone() {
        return this.receiverPhone;
    }

    public AddressInfo setTownDivisionCode(String townDivisionCode) {
        this.townDivisionCode = townDivisionCode;
        return this;
    }
    public String getTownDivisionCode() {
        return this.townDivisionCode;
    }

}
