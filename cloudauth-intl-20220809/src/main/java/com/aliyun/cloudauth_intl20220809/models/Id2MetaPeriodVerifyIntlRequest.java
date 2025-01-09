// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class Id2MetaPeriodVerifyIntlRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DocName")
    public String docName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>411xxxxxxxxxxx0001</p>
     */
    @NameInMap("DocNo")
    public String docNo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>​00000001</p>
     */
    @NameInMap("DocType")
    public String docType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e0c34a77f5ac40a5aa5e6ed20c35****</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("MerchantUserId")
    public String merchantUserId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eKYC_Date_MIN</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("SceneCode")
    public String sceneCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20301001</p>
     */
    @NameInMap("ValidityEndDate")
    public String validityEndDate;

    /**
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
