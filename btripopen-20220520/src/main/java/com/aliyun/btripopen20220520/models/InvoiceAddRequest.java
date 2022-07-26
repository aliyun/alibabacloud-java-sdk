// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InvoiceAddRequest extends TeaModel {
    @NameInMap("address")
    public String address;

    @NameInMap("bank_name")
    public String bankName;

    @NameInMap("bank_no")
    public String bankNo;

    @NameInMap("corp_id")
    public String corpId;

    @NameInMap("tax_no")
    public String taxNo;

    @NameInMap("tel")
    public String tel;

    @NameInMap("third_part_id")
    public String thirdPartId;

    @NameInMap("title")
    public String title;

    @NameInMap("type")
    public Integer type;

    @NameInMap("user_id")
    public String userId;

    public static InvoiceAddRequest build(java.util.Map<String, ?> map) throws Exception {
        InvoiceAddRequest self = new InvoiceAddRequest();
        return TeaModel.build(map, self);
    }

    public InvoiceAddRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public InvoiceAddRequest setBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }
    public String getBankName() {
        return this.bankName;
    }

    public InvoiceAddRequest setBankNo(String bankNo) {
        this.bankNo = bankNo;
        return this;
    }
    public String getBankNo() {
        return this.bankNo;
    }

    public InvoiceAddRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public InvoiceAddRequest setTaxNo(String taxNo) {
        this.taxNo = taxNo;
        return this;
    }
    public String getTaxNo() {
        return this.taxNo;
    }

    public InvoiceAddRequest setTel(String tel) {
        this.tel = tel;
        return this;
    }
    public String getTel() {
        return this.tel;
    }

    public InvoiceAddRequest setThirdPartId(String thirdPartId) {
        this.thirdPartId = thirdPartId;
        return this;
    }
    public String getThirdPartId() {
        return this.thirdPartId;
    }

    public InvoiceAddRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public InvoiceAddRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public InvoiceAddRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
