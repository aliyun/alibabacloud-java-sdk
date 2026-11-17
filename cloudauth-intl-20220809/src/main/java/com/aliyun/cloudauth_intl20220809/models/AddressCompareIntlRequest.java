// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class AddressCompareIntlRequest extends TeaModel {
    /**
     * <p>The country name.</p>
     * <ul>
     * <li>China</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Fixed value: China</p>
     */
    @NameInMap("DefaultCountry")
    public String defaultCountry;

    /**
     * <p>ADD_VERIFY</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Fixed value: ADD_VERIFY</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The first address.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Alibaba Xixi Campus, Hangzhou</p>
     */
    @NameInMap("Text1")
    public String text1;

    /**
     * <p>The second address.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Building 1, No. 969 West Wenyi Road, Hangzhou</p>
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
