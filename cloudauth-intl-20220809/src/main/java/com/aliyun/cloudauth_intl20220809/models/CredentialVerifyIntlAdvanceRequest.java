// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class CredentialVerifyIntlAdvanceRequest extends TeaModel {
    /**
     * <p>The credential name (specified as a numeric code). Valid values:</p>
     * <ul>
     * <li>Codes starting with 03: enterprise qualification<ul>
     * <li>0301: business license issued in the Chinese mainland</li>
     * </ul>
     * </li>
     * <li>Codes starting with 04: transaction voucher<ul>
     * <li>0401: bank statement</li>
     * <li>0402: payslip</li>
     * <li>0403: utility bill</li>
     * <li>0405: credit card statement</li>
     * <li>0499: other.</li>
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
     * <p>The credential type. Valid values:</p>
     * <ul>
     * <li>03: enterprise qualification</li>
     * <li>04: transaction voucher.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>03</p>
     */
    @NameInMap("CredType")
    public String credType;

    /**
     * <p>The image input stream.</p>
     * <blockquote>
     * <p>Specify either ImageUrl or ImageFile.</p>
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
     * <p>Specify either ImageUrl or ImageFile.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="https://oss-bj01.avic.com/eavic-prod-commodity/pic/commodity/94677ee6-1067-4287-8ff4-6e030ef3a5a8.jpg">https://oss-bj01.avic.com/eavic-prod-commodity/pic/commodity/94677ee6-1067-4287-8ff4-6e030ef3a5a8.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The call mode. Valid values:</p>
     * <ul>
     * <li>ANTI_FAKE_CHECK: image quality and tampering detection.</li>
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
