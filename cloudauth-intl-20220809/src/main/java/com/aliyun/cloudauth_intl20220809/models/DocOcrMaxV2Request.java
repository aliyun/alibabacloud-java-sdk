// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DocOcrMaxV2Request extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>T</p>
     */
    @NameInMap("Authorize")
    public String authorize;

    /**
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("DocPage")
    public String docPage;

    /**
     * <strong>example:</strong>
     * <p>CHN01001</p>
     */
    @NameInMap("DocType")
    public String docType;

    /**
     * <strong>example:</strong>
     * <p>base64</p>
     */
    @NameInMap("IdOcrPictureBase64")
    public String idOcrPictureBase64;

    /**
     * <strong>example:</strong>
     * <p>InputStream</p>
     */
    @NameInMap("IdOcrPictureFile")
    public String idOcrPictureFile;

    /**
     * <strong>example:</strong>
     * <p>https://***********.oss-cn-hangzhou.aliyuncs.com/1669520556530-expo/default/face/20221127114236530_w3kx2e6t.jpg</p>
     */
    @NameInMap("IdOcrPictureUrl")
    public String idOcrPictureUrl;

    /**
     * <strong>example:</strong>
     * <p>F</p>
     */
    @NameInMap("IdSpoof")
    public String idSpoof;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IdThreshold")
    public String idThreshold;

    /**
     * <strong>example:</strong>
     * <p>e0c34a77f5ac40a5aa5e6ed20c353888</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("MerchantUserId")
    public String merchantUserId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OcrModel")
    public String ocrModel;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OcrValueStandard")
    public String ocrValueStandard;

    /**
     * <strong>example:</strong>
     * <p>ID_OCR_MAX</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("SceneCode")
    public String sceneCode;

    public static DocOcrMaxV2Request build(java.util.Map<String, ?> map) throws Exception {
        DocOcrMaxV2Request self = new DocOcrMaxV2Request();
        return TeaModel.build(map, self);
    }

    public DocOcrMaxV2Request setAuthorize(String authorize) {
        this.authorize = authorize;
        return this;
    }
    public String getAuthorize() {
        return this.authorize;
    }

    public DocOcrMaxV2Request setDocPage(String docPage) {
        this.docPage = docPage;
        return this;
    }
    public String getDocPage() {
        return this.docPage;
    }

    public DocOcrMaxV2Request setDocType(String docType) {
        this.docType = docType;
        return this;
    }
    public String getDocType() {
        return this.docType;
    }

    public DocOcrMaxV2Request setIdOcrPictureBase64(String idOcrPictureBase64) {
        this.idOcrPictureBase64 = idOcrPictureBase64;
        return this;
    }
    public String getIdOcrPictureBase64() {
        return this.idOcrPictureBase64;
    }

    public DocOcrMaxV2Request setIdOcrPictureFile(String idOcrPictureFile) {
        this.idOcrPictureFile = idOcrPictureFile;
        return this;
    }
    public String getIdOcrPictureFile() {
        return this.idOcrPictureFile;
    }

    public DocOcrMaxV2Request setIdOcrPictureUrl(String idOcrPictureUrl) {
        this.idOcrPictureUrl = idOcrPictureUrl;
        return this;
    }
    public String getIdOcrPictureUrl() {
        return this.idOcrPictureUrl;
    }

    public DocOcrMaxV2Request setIdSpoof(String idSpoof) {
        this.idSpoof = idSpoof;
        return this;
    }
    public String getIdSpoof() {
        return this.idSpoof;
    }

    public DocOcrMaxV2Request setIdThreshold(String idThreshold) {
        this.idThreshold = idThreshold;
        return this;
    }
    public String getIdThreshold() {
        return this.idThreshold;
    }

    public DocOcrMaxV2Request setMerchantBizId(String merchantBizId) {
        this.merchantBizId = merchantBizId;
        return this;
    }
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    public DocOcrMaxV2Request setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
        return this;
    }
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

    public DocOcrMaxV2Request setOcrModel(String ocrModel) {
        this.ocrModel = ocrModel;
        return this;
    }
    public String getOcrModel() {
        return this.ocrModel;
    }

    public DocOcrMaxV2Request setOcrValueStandard(String ocrValueStandard) {
        this.ocrValueStandard = ocrValueStandard;
        return this;
    }
    public String getOcrValueStandard() {
        return this.ocrValueStandard;
    }

    public DocOcrMaxV2Request setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DocOcrMaxV2Request setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

}
