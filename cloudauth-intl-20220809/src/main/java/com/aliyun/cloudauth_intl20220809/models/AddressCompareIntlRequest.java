// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class AddressCompareIntlRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DefaultCountry")
    public String defaultCountry;

    /**
     * <p>ADD_VERIFY</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Text1")
    public String text1;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Text2")
    public String text2;

    public static AddressCompareIntlRequest build(java.util.Map<String, ?> map) throws Exception {
        AddressCompareIntlRequest self = new AddressCompareIntlRequest();
        return TeaModel.build(map, self);
    }

    public AddressCompareIntlRequest setDefaultCountry(String defaultCountry) {
        this.defaultCountry = defaultCountry;
        return this;
    }
    public String getDefaultCountry() {
        return this.defaultCountry;
    }

    public AddressCompareIntlRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public AddressCompareIntlRequest setText1(String text1) {
        this.text1 = text1;
        return this;
    }
    public String getText1() {
        return this.text1;
    }

    public AddressCompareIntlRequest setText2(String text2) {
        this.text2 = text2;
        return this;
    }
    public String getText2() {
        return this.text2;
    }

}
