// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class VerifyOwnerInfoRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerType")
    public String ownerType;

    @NameInMap("CardType")
    public String cardType;

    @NameInMap("CardNum")
    public String cardNum;

    @NameInMap("Province")
    public String province;

    @NameInMap("City")
    public String city;

    public static VerifyOwnerInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyOwnerInfoRequest self = new VerifyOwnerInfoRequest();
        return TeaModel.build(map, self);
    }

    public VerifyOwnerInfoRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public VerifyOwnerInfoRequest setOwnerType(String ownerType) {
        this.ownerType = ownerType;
        return this;
    }
    public String getOwnerType() {
        return this.ownerType;
    }

    public VerifyOwnerInfoRequest setCardType(String cardType) {
        this.cardType = cardType;
        return this;
    }
    public String getCardType() {
        return this.cardType;
    }

    public VerifyOwnerInfoRequest setCardNum(String cardNum) {
        this.cardNum = cardNum;
        return this;
    }
    public String getCardNum() {
        return this.cardNum;
    }

    public VerifyOwnerInfoRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public VerifyOwnerInfoRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

}
