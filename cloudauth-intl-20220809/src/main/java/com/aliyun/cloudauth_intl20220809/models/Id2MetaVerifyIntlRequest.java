// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class Id2MetaVerifyIntlRequest extends TeaModel {
    /**
     * <p>The ID card number (in plaintext).</p>
     * 
     * <strong>example:</strong>
     * <p>429001********8211</p>
     */
    @NameInMap("IdentifyNum")
    public String identifyNum;

    /**
     * <p>The parameter type. Valid values:</p>
     * <ul>
     * <li>normal: original value (plaintext).</li>
     * <li>Note: Due to authoritative data source restrictions, two-factor identity verification does not support MD5 encryption.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("ParamType")
    public String paramType;

    /**
     * <p>The product solution code. Set this parameter to ID_2META.</p>
     * 
     * <strong>example:</strong>
     * <p>ID_2META</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The name (in plaintext).</p>
     * 
     * <strong>example:</strong>
     * <p>张*</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static Id2MetaVerifyIntlRequest build(java.util.Map<String, ?> map) throws Exception {
        Id2MetaVerifyIntlRequest self = new Id2MetaVerifyIntlRequest();
        return TeaModel.build(map, self);
    }

    public Id2MetaVerifyIntlRequest setIdentifyNum(String identifyNum) {
        this.identifyNum = identifyNum;
        return this;
    }
    public String getIdentifyNum() {
        return this.identifyNum;
    }

    public Id2MetaVerifyIntlRequest setParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }
    public String getParamType() {
        return this.paramType;
    }

    public Id2MetaVerifyIntlRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public Id2MetaVerifyIntlRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
