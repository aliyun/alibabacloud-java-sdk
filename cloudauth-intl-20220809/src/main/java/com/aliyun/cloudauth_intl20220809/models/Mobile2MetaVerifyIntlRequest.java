// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class Mobile2MetaVerifyIntlRequest extends TeaModel {
    /**
     * <p>The mobile number.</p>
     * <blockquote>
     * <ul>
     * <li>If <strong>paramType</strong> is set to <strong>normal</strong>, enter the plaintext value.</li>
     * <li>If <strong>paramType</strong> is set to <strong>md5</strong>, enter the 32-bit lowercase MD5 string.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>186****1234</p>
     */
    @NameInMap("Mobile")
    public String mobile;

    /**
     * <p>The parameter type:</p>
     * <ul>
     * <li><p><strong>normal</strong>: plaintext</p>
     * </li>
     * <li><p><strong>md5</strong>: MD5-encrypted</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("ParamType")
    public String paramType;

    /**
     * <p>The product to use. Set this parameter to the static value <strong>MOBILE_2META</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MOBILE_2META</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The name.</p>
     * <blockquote>
     * <ul>
     * <li>If <strong>paramType</strong> is set to <strong>normal</strong>, enter the plaintext value.</li>
     * <li>If <strong>paramType</strong> is set to <strong>md5</strong>, enter the 32-bit lowercase MD5 string.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Zhang*</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static Mobile2MetaVerifyIntlRequest build(java.util.Map<String, ?> map) throws Exception {
        Mobile2MetaVerifyIntlRequest self = new Mobile2MetaVerifyIntlRequest();
        return TeaModel.build(map, self);
    }

    public Mobile2MetaVerifyIntlRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public Mobile2MetaVerifyIntlRequest setParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }
    public String getParamType() {
        return this.paramType;
    }

    public Mobile2MetaVerifyIntlRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public Mobile2MetaVerifyIntlRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
