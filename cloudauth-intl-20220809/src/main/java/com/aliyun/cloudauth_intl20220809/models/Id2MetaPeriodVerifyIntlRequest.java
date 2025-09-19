// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class Id2MetaPeriodVerifyIntlRequest extends TeaModel {
    /**
     * <p>The user\&quot;s name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Zhang San</p>
     */
    @NameInMap("DocName")
    public String docName;

    /**
     * <p>The user\&quot;s certificate number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>411xxxxxxxxxxx0001</p>
     */
    @NameInMap("DocNo")
    public String docNo;

    /**
     * <p>The certificate type, which is uniquely identified by an 8-digit number.</p>
     * <p>Currently, only second-generation resident ID cards from the Chinese mainland are supported. Set the value to the static field: <strong>00000001</strong>.</p>
     * <p>For more information, see <a href="https://www.alibabacloud.com/help/en/ekyc/latest/im1u641gyesiqmbg?spm=a2c63.p38356.0.i13#Hu5TG">Certificate types</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>​00000001</p>
     */
    @NameInMap("DocType")
    public String docType;

    /**
     * <p>A unique business identifier that you can customize. Use this identifier to locate and troubleshoot issues. The identifier can be up to 32 characters in length and can contain letters and digits. Make sure that the identifier is unique.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e0c34a77f5ac40a5aa5e6ed20c35****</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <p>A custom user ID or another identifier for a specific user, such as a mobile number or email address. Desensitize the value of this field in advance, for example, by hashing the value.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("MerchantUserId")
    public String merchantUserId;

    /**
     * <p>The product solution to integrate. Set the value to <strong>eKYC_Date_MIN</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eKYC_Date_MIN</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>A custom authentication scenario ID. You can use this ID to query related records in the console. The ID can be up to 10 characters in length and can contain letters, digits, and underscores (_).</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("SceneCode")
    public String sceneCode;

    /**
     * <p>The expiration date of the ID card\&quot;s validity period. The format is YYYYMMDD.</p>
     * <blockquote>
     * <p>If the ID card is valid for a long term, enter <strong>long-term</strong> for this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20301001</p>
     */
    @NameInMap("ValidityEndDate")
    public String validityEndDate;

    /**
     * <p>The start date of the validity period. The format is YYYYMMDD.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20201001</p>
     */
    @NameInMap("ValidityStartDate")
    public String validityStartDate;

    public static Id2MetaPeriodVerifyIntlRequest build(java.util.Map<String, ?> map) throws Exception {
        Id2MetaPeriodVerifyIntlRequest self = new Id2MetaPeriodVerifyIntlRequest();
        return TeaModel.build(map, self);
    }

    public Id2MetaPeriodVerifyIntlRequest setDocName(String docName) {
        this.docName = docName;
        return this;
    }
    public String getDocName() {
        return this.docName;
    }

    public Id2MetaPeriodVerifyIntlRequest setDocNo(String docNo) {
        this.docNo = docNo;
        return this;
    }
    public String getDocNo() {
        return this.docNo;
    }

    public Id2MetaPeriodVerifyIntlRequest setDocType(String docType) {
        this.docType = docType;
        return this;
    }
    public String getDocType() {
        return this.docType;
    }

    public Id2MetaPeriodVerifyIntlRequest setMerchantBizId(String merchantBizId) {
        this.merchantBizId = merchantBizId;
        return this;
    }
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    public Id2MetaPeriodVerifyIntlRequest setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
        return this;
    }
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

    public Id2MetaPeriodVerifyIntlRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public Id2MetaPeriodVerifyIntlRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public Id2MetaPeriodVerifyIntlRequest setValidityEndDate(String validityEndDate) {
        this.validityEndDate = validityEndDate;
        return this;
    }
    public String getValidityEndDate() {
        return this.validityEndDate;
    }

    public Id2MetaPeriodVerifyIntlRequest setValidityStartDate(String validityStartDate) {
        this.validityStartDate = validityStartDate;
        return this;
    }
    public String getValidityStartDate() {
        return this.validityStartDate;
    }

}
