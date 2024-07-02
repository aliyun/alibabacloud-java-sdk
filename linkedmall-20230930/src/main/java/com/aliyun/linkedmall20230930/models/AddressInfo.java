// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class AddressInfo extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>陕西省西安市新城区xxx大厦xx室</p>
     */
    @NameInMap("addressDetail")
    public String addressDetail;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("addressId")
    public Long addressId;

    /**
     * <strong>example:</strong>
     * <p>610102</p>
     */
    @NameInMap("divisionCode")
    public String divisionCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>任先生</p>
     */
    @NameInMap("receiver")
    public String receiver;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>182***5674</p>
     */
    @NameInMap("receiverPhone")
    public String receiverPhone;

    /**
     * <strong>example:</strong>
     * <p>61010212</p>
     */
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
