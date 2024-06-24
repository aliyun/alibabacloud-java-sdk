// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InvoiceAddRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("address")
    public String address;

    @NameInMap("bank_name")
    public String bankName;

    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("bank_no")
    public String bankNo;

    /**
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("tax_no")
    public String taxNo;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("tel")
    public String tel;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>340049</p>
     */
    @NameInMap("third_part_id")
    public String thirdPartId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("title")
    public String title;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("type")
    public Integer type;

    @NameInMap("unit_type")
    public Integer unitType;

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

    public InvoiceAddRequest setUnitType(Integer unitType) {
        this.unitType = unitType;
        return this;
    }
    public Integer getUnitType() {
        return this.unitType;
    }

}
