// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class QueryEffectiveInvoiceListByBillNosRequest extends TeaModel {
    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("BillNo")
    public String billNo;

    @NameInMap("EncryptProps")
    public java.util.Map<String, String> encryptProps;

    @NameInMap("Language")
    public String language;

    @NameInMap("MajorBillNo")
    public String majorBillNo;

    @NameInMap("OuCode")
    public String ouCode;

    @NameInMap("RelatedSystem")
    public String relatedSystem;

    @NameInMap("Sign")
    public String sign;

    @NameInMap("Uuid")
    public String uuid;

    public static QueryEffectiveInvoiceListByBillNosRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEffectiveInvoiceListByBillNosRequest self = new QueryEffectiveInvoiceListByBillNosRequest();
        return TeaModel.build(map, self);
    }

    public QueryEffectiveInvoiceListByBillNosRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public QueryEffectiveInvoiceListByBillNosRequest setBillNo(String billNo) {
        this.billNo = billNo;
        return this;
    }
    public String getBillNo() {
        return this.billNo;
    }

    public QueryEffectiveInvoiceListByBillNosRequest setEncryptProps(java.util.Map<String, String> encryptProps) {
        this.encryptProps = encryptProps;
        return this;
    }
    public java.util.Map<String, String> getEncryptProps() {
        return this.encryptProps;
    }

    public QueryEffectiveInvoiceListByBillNosRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public QueryEffectiveInvoiceListByBillNosRequest setMajorBillNo(String majorBillNo) {
        this.majorBillNo = majorBillNo;
        return this;
    }
    public String getMajorBillNo() {
        return this.majorBillNo;
    }

    public QueryEffectiveInvoiceListByBillNosRequest setOuCode(String ouCode) {
        this.ouCode = ouCode;
        return this;
    }
    public String getOuCode() {
        return this.ouCode;
    }

    public QueryEffectiveInvoiceListByBillNosRequest setRelatedSystem(String relatedSystem) {
        this.relatedSystem = relatedSystem;
        return this;
    }
    public String getRelatedSystem() {
        return this.relatedSystem;
    }

    public QueryEffectiveInvoiceListByBillNosRequest setSign(String sign) {
        this.sign = sign;
        return this;
    }
    public String getSign() {
        return this.sign;
    }

    public QueryEffectiveInvoiceListByBillNosRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
