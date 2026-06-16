// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class Id2MetaPeriodVerifyIntlRequest extends TeaModel {
    /**
     * <p>The name of the user.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("DocName")
    public String docName;

    /**
     * <p>The document number of the user.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>411xxxxxxxxxxx0001</p>
     */
    @NameInMap("DocNo")
    public String docNo;

    /**
     * <p>The document type, which is uniquely identified by an 8-digit number. For more information, see the document type list.</p>
     * <p>Currently, only the second-generation resident identity card of the Chinese mainland is supported. Set this parameter to 00000001.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>​00000001</p>
     */
    @NameInMap("DocType")
    public String docType;

    /**
     * <p>The custom unique business identifier, which is used for subsequent troubleshooting. The value can be up to 32 characters in length and can contain letters and digits. Make sure the value is unique.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e0c34a77f5ac40a5aa5e6ed20c35****</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <p>The custom user ID or another identifier that can identify a specific user, such as a phone number or email address. We strongly recommend that you desensitize the value of this field in advance, for example, by hashing the value.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("MerchantUserId")
    public String merchantUserId;

    /**
     * <p>The product solution to use.</p>
     * <p>Set the value to eKYC_Date_MIN.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eKYC_Date_MIN</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The custom authentication scenario ID. You can use this scenario ID to query related records in the console. The value can be up to 10 characters in length and can contain letters, digits, and underscores.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("SceneCode")
    public String sceneCode;

    /**
     * <p>The expiration date of the ID card validity period, in the format YYYYMMDD. Example: 20301001.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20301001</p>
     */
    @NameInMap("ValidityEndDate")
    public String validityEndDate;

    /**
     * <p>The start date of the validity period, in the format YYYYMMDD. Example: 20201001.</p>
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
