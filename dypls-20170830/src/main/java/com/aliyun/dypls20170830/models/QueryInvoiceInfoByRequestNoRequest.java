// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class QueryInvoiceInfoByRequestNoRequest extends TeaModel {
    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("EncryptProps")
    public java.util.Map<String, String> encryptProps;

    @NameInMap("Language")
    public String language;

    @NameInMap("RelatedSystem")
    public String relatedSystem;

    @NameInMap("RequestNo")
    public String requestNo;

    @NameInMap("Sign")
    public String sign;

    @NameInMap("Uuid")
    public String uuid;

    public static QueryInvoiceInfoByRequestNoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInvoiceInfoByRequestNoRequest self = new QueryInvoiceInfoByRequestNoRequest();
        return TeaModel.build(map, self);
    }

    public QueryInvoiceInfoByRequestNoRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public QueryInvoiceInfoByRequestNoRequest setEncryptProps(java.util.Map<String, String> encryptProps) {
        this.encryptProps = encryptProps;
        return this;
    }
    public java.util.Map<String, String> getEncryptProps() {
        return this.encryptProps;
    }

    public QueryInvoiceInfoByRequestNoRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public QueryInvoiceInfoByRequestNoRequest setRelatedSystem(String relatedSystem) {
        this.relatedSystem = relatedSystem;
        return this;
    }
    public String getRelatedSystem() {
        return this.relatedSystem;
    }

    public QueryInvoiceInfoByRequestNoRequest setRequestNo(String requestNo) {
        this.requestNo = requestNo;
        return this;
    }
    public String getRequestNo() {
        return this.requestNo;
    }

    public QueryInvoiceInfoByRequestNoRequest setSign(String sign) {
        this.sign = sign;
        return this;
    }
    public String getSign() {
        return this.sign;
    }

    public QueryInvoiceInfoByRequestNoRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
