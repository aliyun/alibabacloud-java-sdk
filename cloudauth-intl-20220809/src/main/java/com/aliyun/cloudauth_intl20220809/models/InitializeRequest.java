// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class InitializeRequest extends TeaModel {
    @NameInMap("Crop")
    public String crop;

    @NameInMap("DocType")
    public String docType;

    @NameInMap("FacePictureBase64")
    public String facePictureBase64;

    @NameInMap("FacePictureUrl")
    public String facePictureUrl;

    @NameInMap("FlowType")
    public String flowType;

    @NameInMap("IdFaceQuality")
    public String idFaceQuality;

    @NameInMap("IdSpoof")
    public String idSpoof;

    @NameInMap("MerchantBizId")
    public String merchantBizId;

    @NameInMap("MerchantUserId")
    public String merchantUserId;

    @NameInMap("MetaInfo")
    public String metaInfo;

    /**
     * <p>OCR。</p>
     */
    @NameInMap("Ocr")
    public String ocr;

    @NameInMap("OperationMode")
    public String operationMode;

    @NameInMap("Pages")
    public String pages;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("ProductConfig")
    public String productConfig;

    @NameInMap("ReturnUrl")
    public String returnUrl;

    @NameInMap("SceneCode")
    public String sceneCode;

    @NameInMap("ServiceLevel")
    public String serviceLevel;

    public static InitializeRequest build(java.util.Map<String, ?> map) throws Exception {
        InitializeRequest self = new InitializeRequest();
        return TeaModel.build(map, self);
    }

    public InitializeRequest setCrop(String crop) {
        this.crop = crop;
        return this;
    }
    public String getCrop() {
        return this.crop;
    }

    public InitializeRequest setDocType(String docType) {
        this.docType = docType;
        return this;
    }
    public String getDocType() {
        return this.docType;
    }

    public InitializeRequest setFacePictureBase64(String facePictureBase64) {
        this.facePictureBase64 = facePictureBase64;
        return this;
    }
    public String getFacePictureBase64() {
        return this.facePictureBase64;
    }

    public InitializeRequest setFacePictureUrl(String facePictureUrl) {
        this.facePictureUrl = facePictureUrl;
        return this;
    }
    public String getFacePictureUrl() {
        return this.facePictureUrl;
    }

    public InitializeRequest setFlowType(String flowType) {
        this.flowType = flowType;
        return this;
    }
    public String getFlowType() {
        return this.flowType;
    }

    public InitializeRequest setIdFaceQuality(String idFaceQuality) {
        this.idFaceQuality = idFaceQuality;
        return this;
    }
    public String getIdFaceQuality() {
        return this.idFaceQuality;
    }

    public InitializeRequest setIdSpoof(String idSpoof) {
        this.idSpoof = idSpoof;
        return this;
    }
    public String getIdSpoof() {
        return this.idSpoof;
    }

    public InitializeRequest setMerchantBizId(String merchantBizId) {
        this.merchantBizId = merchantBizId;
        return this;
    }
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    public InitializeRequest setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
        return this;
    }
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

    public InitializeRequest setMetaInfo(String metaInfo) {
        this.metaInfo = metaInfo;
        return this;
    }
    public String getMetaInfo() {
        return this.metaInfo;
    }

    public InitializeRequest setOcr(String ocr) {
        this.ocr = ocr;
        return this;
    }
    public String getOcr() {
        return this.ocr;
    }

    public InitializeRequest setOperationMode(String operationMode) {
        this.operationMode = operationMode;
        return this;
    }
    public String getOperationMode() {
        return this.operationMode;
    }

    public InitializeRequest setPages(String pages) {
        this.pages = pages;
        return this;
    }
    public String getPages() {
        return this.pages;
    }

    public InitializeRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public InitializeRequest setProductConfig(String productConfig) {
        this.productConfig = productConfig;
        return this;
    }
    public String getProductConfig() {
        return this.productConfig;
    }

    public InitializeRequest setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
    }
    public String getReturnUrl() {
        return this.returnUrl;
    }

    public InitializeRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public InitializeRequest setServiceLevel(String serviceLevel) {
        this.serviceLevel = serviceLevel;
        return this;
    }
    public String getServiceLevel() {
        return this.serviceLevel;
    }

}
