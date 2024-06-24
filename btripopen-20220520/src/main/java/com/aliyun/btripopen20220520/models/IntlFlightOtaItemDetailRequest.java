// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightOtaItemDetailRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("btrip_user_id")
    public String btripUserId;

    @NameInMap("buyer_name")
    public String buyerName;

    /**
     * <strong>example:</strong>
     * <p>open12igetbis4o07v10B1TlOWcM00</p>
     */
    @NameInMap("isv_name")
    public String isvName;

    @NameInMap("language")
    public String language;

    /**
     * <strong>example:</strong>
     * <p>JIANHANG</p>
     */
    @NameInMap("supplier_code")
    public String supplierCode;

    public static IntlFlightOtaItemDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightOtaItemDetailRequest self = new IntlFlightOtaItemDetailRequest();
        return TeaModel.build(map, self);
    }

    public IntlFlightOtaItemDetailRequest setBtripUserId(String btripUserId) {
        this.btripUserId = btripUserId;
        return this;
    }
    public String getBtripUserId() {
        return this.btripUserId;
    }

    public IntlFlightOtaItemDetailRequest setBuyerName(String buyerName) {
        this.buyerName = buyerName;
        return this;
    }
    public String getBuyerName() {
        return this.buyerName;
    }

    public IntlFlightOtaItemDetailRequest setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
    }

    public IntlFlightOtaItemDetailRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public IntlFlightOtaItemDetailRequest setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
        return this;
    }
    public String getSupplierCode() {
        return this.supplierCode;
    }

}
