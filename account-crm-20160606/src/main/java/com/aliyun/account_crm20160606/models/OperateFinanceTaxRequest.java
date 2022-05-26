// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class OperateFinanceTaxRequest extends TeaModel {
    @NameInMap("FinanceTax")
    public String financeTax;

    @NameInMap("FinanceTaxCertificateImgName")
    public String financeTaxCertificateImgName;

    @NameInMap("HId")
    public Long HId;

    @NameInMap("SecondFinanceTax")
    public String secondFinanceTax;

    @NameInMap("SecondFinanceTaxCertificateImgName")
    public String secondFinanceTaxCertificateImgName;

    @NameInMap("SecondFinanceTaxCertificateImgUrl")
    public String secondFinanceTaxCertificateImgUrl;

    @NameInMap("financeTaxCertificateImgUrl")
    public String financeTaxCertificateImgUrl;

    public static OperateFinanceTaxRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateFinanceTaxRequest self = new OperateFinanceTaxRequest();
        return TeaModel.build(map, self);
    }

    public OperateFinanceTaxRequest setFinanceTax(String financeTax) {
        this.financeTax = financeTax;
        return this;
    }
    public String getFinanceTax() {
        return this.financeTax;
    }

    public OperateFinanceTaxRequest setFinanceTaxCertificateImgName(String financeTaxCertificateImgName) {
        this.financeTaxCertificateImgName = financeTaxCertificateImgName;
        return this;
    }
    public String getFinanceTaxCertificateImgName() {
        return this.financeTaxCertificateImgName;
    }

    public OperateFinanceTaxRequest setHId(Long HId) {
        this.HId = HId;
        return this;
    }
    public Long getHId() {
        return this.HId;
    }

    public OperateFinanceTaxRequest setSecondFinanceTax(String secondFinanceTax) {
        this.secondFinanceTax = secondFinanceTax;
        return this;
    }
    public String getSecondFinanceTax() {
        return this.secondFinanceTax;
    }

    public OperateFinanceTaxRequest setSecondFinanceTaxCertificateImgName(String secondFinanceTaxCertificateImgName) {
        this.secondFinanceTaxCertificateImgName = secondFinanceTaxCertificateImgName;
        return this;
    }
    public String getSecondFinanceTaxCertificateImgName() {
        return this.secondFinanceTaxCertificateImgName;
    }

    public OperateFinanceTaxRequest setSecondFinanceTaxCertificateImgUrl(String secondFinanceTaxCertificateImgUrl) {
        this.secondFinanceTaxCertificateImgUrl = secondFinanceTaxCertificateImgUrl;
        return this;
    }
    public String getSecondFinanceTaxCertificateImgUrl() {
        return this.secondFinanceTaxCertificateImgUrl;
    }

    public OperateFinanceTaxRequest setFinanceTaxCertificateImgUrl(String financeTaxCertificateImgUrl) {
        this.financeTaxCertificateImgUrl = financeTaxCertificateImgUrl;
        return this;
    }
    public String getFinanceTaxCertificateImgUrl() {
        return this.financeTaxCertificateImgUrl;
    }

}
