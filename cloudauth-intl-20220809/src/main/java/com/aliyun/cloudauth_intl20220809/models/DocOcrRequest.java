// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DocOcrRequest extends TeaModel {
    @NameInMap("DocType")
    public String docType;

    @NameInMap("IdFaceQuality")
    public String idFaceQuality;

    @NameInMap("IdOcrPictureBase64")
    public String idOcrPictureBase64;

    @NameInMap("IdOcrPictureUrl")
    public String idOcrPictureUrl;

    @NameInMap("MerchantBizId")
    public String merchantBizId;

    @NameInMap("MerchantUserId")
    public String merchantUserId;

    @NameInMap("Ocr")
    public String ocr;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("Spoof")
    public String spoof;

    public static DocOcrRequest build(java.util.Map<String, ?> map) throws Exception {
        DocOcrRequest self = new DocOcrRequest();
        return TeaModel.build(map, self);
    }

    public DocOcrRequest setDocType(String docType) {
        this.docType = docType;
        return this;
    }
    public String getDocType() {
        return this.docType;
    }

    public DocOcrRequest setIdFaceQuality(String idFaceQuality) {
        this.idFaceQuality = idFaceQuality;
        return this;
    }
    public String getIdFaceQuality() {
        return this.idFaceQuality;
    }

    public DocOcrRequest setIdOcrPictureBase64(String idOcrPictureBase64) {
        this.idOcrPictureBase64 = idOcrPictureBase64;
        return this;
    }
    public String getIdOcrPictureBase64() {
        return this.idOcrPictureBase64;
    }

    public DocOcrRequest setIdOcrPictureUrl(String idOcrPictureUrl) {
        this.idOcrPictureUrl = idOcrPictureUrl;
        return this;
    }
    public String getIdOcrPictureUrl() {
        return this.idOcrPictureUrl;
    }

    public DocOcrRequest setMerchantBizId(String merchantBizId) {
        this.merchantBizId = merchantBizId;
        return this;
    }
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    public DocOcrRequest setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
        return this;
    }
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

    public DocOcrRequest setOcr(String ocr) {
        this.ocr = ocr;
        return this;
    }
    public String getOcr() {
        return this.ocr;
    }

    public DocOcrRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DocOcrRequest setSpoof(String spoof) {
        this.spoof = spoof;
        return this;
    }
    public String getSpoof() {
        return this.spoof;
    }

}
