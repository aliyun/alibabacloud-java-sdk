// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class Mobile3MetaVerifyIntlRequest extends TeaModel {
    /**
     * <p>ID number</p>
     * <ul>
     * <li>When paramType is set to normal, enter the plaintext</li>
     * <li>When paramType is set to md5, enter a 32-character lowercase md5 string</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>429001********8211</p>
     */
    @NameInMap("IdentifyNum")
    public String identifyNum;

    /**
     * <p>Mobile phone number.</p>
     * <ul>
     * <li>When paramType is set to normal, enter the plaintext</li>
     * <li>When paramType is set to md5, enter a 32-character lowercase md5 string</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>186****1234</p>
     */
    @NameInMap("Mobile")
    public String mobile;

    /**
     * <p>Parameter type:</p>
     * <ul>
     * <li>normal: unencrypted</li>
     * <li>md5: md5 encrypted</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("ParamType")
    public String paramType;

    /**
     * <p>The product solution to be integrated, with a fixed value: MOBILE_3META</p>
     * 
     * <strong>example:</strong>
     * <p>MOBILE_3META</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>Name</p>
     * <ul>
     * <li>When paramType is set to normal, enter the plaintext</li>
     * <li>When paramType is set to md5, enter a 32-character lowercase md5 string</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>张*</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static Mobile3MetaVerifyIntlRequest build(java.util.Map<String, ?> map) throws Exception {
        Mobile3MetaVerifyIntlRequest self = new Mobile3MetaVerifyIntlRequest();
        return TeaModel.build(map, self);
    }

    public Mobile3MetaVerifyIntlRequest setIdentifyNum(String identifyNum) {
        this.identifyNum = identifyNum;
        return this;
    }
    public String getIdentifyNum() {
        return this.identifyNum;
    }

    public Mobile3MetaVerifyIntlRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public Mobile3MetaVerifyIntlRequest setParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }
    public String getParamType() {
        return this.paramType;
    }

    public Mobile3MetaVerifyIntlRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public Mobile3MetaVerifyIntlRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
