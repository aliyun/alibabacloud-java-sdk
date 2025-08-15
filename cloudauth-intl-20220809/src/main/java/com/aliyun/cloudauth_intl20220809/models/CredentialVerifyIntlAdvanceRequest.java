// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class CredentialVerifyIntlAdvanceRequest extends TeaModel {
    /**
     * <p>Credential name (numeric code):</p>
     * <ul>
     * <li>Starting with 03: Enterprise Qualification<ul>
     * <li>0301: Mainland China Business License</li>
     * </ul>
     * </li>
     * <li>Starting with 04, Transaction Voucher<ul>
     * <li>0401: Bank Statement</li>
     * <li>0402: Pay Slip</li>
     * <li>0403: Utility Bill</li>
     * <li>0405: Credit Card Statement</li>
     * <li>0499: Others</li>
     * </ul>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0301</p>
     */
    @NameInMap("CredName")
    public String credName;

    /**
     * <p>Credential type:</p>
     * <ul>
     * <li>03: Enterprise Qualification</li>
     * <li>04: Transaction Voucher</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>03</p>
     */
    @NameInMap("CredType")
    public String credType;

    /**
     * <p>Image input stream.</p>
     * <blockquote>
     * <p>Choose either ImageUrl or ImageFile.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("ImageFile")
    public java.io.InputStream imageFileObject;

    /**
     * <p>The URL of the image.</p>
     * <blockquote>
     * <p>Choose either ImageUrl or ImageFile.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="https://oss-bj01.avic.com/eavic-prod-commodity/pic/commodity/94677ee6-1067-4287-8ff4-6e030ef3a5a8.jpg">https://oss-bj01.avic.com/eavic-prod-commodity/pic/commodity/94677ee6-1067-4287-8ff4-6e030ef3a5a8.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>Invocation mode:</p>
     * <ul>
     * <li>ANTI_FAKE_CHECK: Image quality and tampering detection.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>取值：ANTI_FAKE_CHECK</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    public static CredentialVerifyIntlAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CredentialVerifyIntlAdvanceRequest self = new CredentialVerifyIntlAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public CredentialVerifyIntlAdvanceRequest setCredName(String credName) {
        this.credName = credName;
        return this;
    }
    public String getCredName() {
        return this.credName;
    }

    public CredentialVerifyIntlAdvanceRequest setCredType(String credType) {
        this.credType = credType;
        return this;
    }
    public String getCredType() {
        return this.credType;
    }

    public CredentialVerifyIntlAdvanceRequest setImageFileObject(java.io.InputStream imageFileObject) {
        this.imageFileObject = imageFileObject;
        return this;
    }
    public java.io.InputStream getImageFileObject() {
        return this.imageFileObject;
    }

    public CredentialVerifyIntlAdvanceRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public CredentialVerifyIntlAdvanceRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
