// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class EkycVerifyV2Request extends TeaModel {
    /**
     * <p>Indicates whether to enable authoritative identity verification. This parameter currently applies only to second-generation ID cards issued in the Chinese mainland.</p>
     * 
     * <strong>example:</strong>
     * <p>T</p>
     */
    @NameInMap("Authorize")
    public String authorize;

    /**
     * <p>Indicates whether clipping is allowed. Clipping is disabled by default (T/F).</p>
     * <ul>
     * <li>T: Detection is required.</li>
     * <li>F: Detection is required (default is F).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>F</p>
     */
    @NameInMap("Crop")
    public String crop;

    /**
     * <p>The user\&quot;s real name. When Authorize=\&quot;T\&quot; and the certificate type is a Chinese mainland ID card, you must provide at least one of the following: key certificate information (DocName, DocNo) or certificate image (IdOcrPictureBase64/URL). Note: It supports combinations of one or more Chinese characters, excluding special characters except for the interpunct 【·】 used in ethnic minority names.</p>
     * 
     * <strong>example:</strong>
     * <p>张**</p>
     */
    @NameInMap("DocName")
    public String docName;

    /**
     * <p>The user\&quot;s certificate number. When Authorize=\&quot;T\&quot; and the certificate type is a Chinese mainland ID card, you must provide at least one of the following: key certificate information (DocName, DocNo) or certificate image (IdOcrPictureBase64/URL). Note: It supports a combination of letters and digits with a length of 18 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>410***************</p>
     */
    @NameInMap("DocNo")
    public String docNo;

    /**
     * <p>Certificate type</p>
     * 
     * <strong>example:</strong>
     * <p>00000001</p>
     */
    @NameInMap("DocType")
    public String docType;

    /**
     * <p>Base64 encoding of the facial image.</p>
     * <p>Notes:</p>
     * <ul>
     * <li>If you choose this method to submit the certificate image, check the image size and avoid uploading excessively large images.</li>
     * <li>You must specify exactly one of FacePictureBase64, FacePictureUrl, or FacePictureFile.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Base64</p>
     */
    @NameInMap("FacePictureBase64")
    public String facePictureBase64;

    /**
     * <p>File stream of the facial photo</p>
     * 
     * <strong>example:</strong>
     * <p>InputStream</p>
     */
    @NameInMap("FacePictureFile")
    public String facePictureFile;

    /**
     * <p>URL of the facial photo</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://digital-face-prod8.oss-cn-hangzhou.aliyuncs.com/1669520556530-expo/default/face/20221127114236530_w3kx2e6t.jpg">https://digital-face-prod8.oss-cn-hangzhou.aliyuncs.com/1669520556530-expo/default/face/20221127114236530_w3kx2e6t.jpg</a></p>
     */
    @NameInMap("FacePictureUrl")
    public String facePictureUrl;

    /**
     * <p>Base64-encoded certificate Image. Notes:</p>
     * <ul>
     * <li>If you use this method to submit the certificate image, check the image size and avoid uploading excessively large images.</li>
     * <li>You must specify exactly one of IdOcrPictureBase64, IdOcrPictureUrl, or IdOcrPictureFile.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>base64</p>
     */
    @NameInMap("IdOcrPictureBase64")
    public String idOcrPictureBase64;

    /**
     * <p>File stream of the front side of the certificate</p>
     * 
     * <strong>example:</strong>
     * <p>InputStream</p>
     */
    @NameInMap("IdOcrPictureFile")
    public String idOcrPictureFile;

    /**
     * <p>URL of the front side of the certificate</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://digital-cardocr-prod8.oss-cn-hangzhou.aliyuncs.com/1669520556530-expo/default/face/20221127114236530_w3kx2e6t.jpg">https://digital-cardocr-prod8.oss-cn-hangzhou.aliyuncs.com/1669520556530-expo/default/face/20221127114236530_w3kx2e6t.jpg</a></p>
     */
    @NameInMap("IdOcrPictureUrl")
    public String idOcrPictureUrl;

    /**
     * <p>Custom OCR quality detection threshold mode:</p>
     * <ul>
     * <li>0: System default</li>
     * <li>1: Strict mode</li>
     * <li>2: Loose mode</li>
     * <li>3 (default): Shutdown quality detection</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IdThreshold")
    public String idThreshold;

    /**
     * <p>A custom business UUID defined by the merchant, used for subsequent issue tracking and troubleshooting. It supports a combination of letters and digits with a length of 32 characters. Ensure its uniqueness.</p>
     * 
     * <strong>example:</strong>
     * <p>e0c34a77f5ac40a5aa5e6ed20c353888</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <p>Your custom user ID or another identifier that can uniquely identify a specific user, such as a mobile phone number or mailbox address. We strongly recommend pre-masking the value of this field—for example, by applying a hash function.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("MerchantUserId")
    public String merchantUserId;

    /**
     * <p>Product code</p>
     * 
     * <strong>example:</strong>
     * <p>eKYC_MIN</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    public static EkycVerifyV2Request build(java.util.Map<String, ?> map) throws Exception {
        EkycVerifyV2Request self = new EkycVerifyV2Request();
        return TeaModel.build(map, self);
    }

    public EkycVerifyV2Request setAuthorize(String authorize) {
        this.authorize = authorize;
        return this;
    }
    public String getAuthorize() {
        return this.authorize;
    }

    public EkycVerifyV2Request setCrop(String crop) {
        this.crop = crop;
        return this;
    }
    public String getCrop() {
        return this.crop;
    }

    public EkycVerifyV2Request setDocName(String docName) {
        this.docName = docName;
        return this;
    }
    public String getDocName() {
        return this.docName;
    }

    public EkycVerifyV2Request setDocNo(String docNo) {
        this.docNo = docNo;
        return this;
    }
    public String getDocNo() {
        return this.docNo;
    }

    public EkycVerifyV2Request setDocType(String docType) {
        this.docType = docType;
        return this;
    }
    public String getDocType() {
        return this.docType;
    }

    public EkycVerifyV2Request setFacePictureBase64(String facePictureBase64) {
        this.facePictureBase64 = facePictureBase64;
        return this;
    }
    public String getFacePictureBase64() {
        return this.facePictureBase64;
    }

    public EkycVerifyV2Request setFacePictureFile(String facePictureFile) {
        this.facePictureFile = facePictureFile;
        return this;
    }
    public String getFacePictureFile() {
        return this.facePictureFile;
    }

    public EkycVerifyV2Request setFacePictureUrl(String facePictureUrl) {
        this.facePictureUrl = facePictureUrl;
        return this;
    }
    public String getFacePictureUrl() {
        return this.facePictureUrl;
    }

    public EkycVerifyV2Request setIdOcrPictureBase64(String idOcrPictureBase64) {
        this.idOcrPictureBase64 = idOcrPictureBase64;
        return this;
    }
    public String getIdOcrPictureBase64() {
        return this.idOcrPictureBase64;
    }

    public EkycVerifyV2Request setIdOcrPictureFile(String idOcrPictureFile) {
        this.idOcrPictureFile = idOcrPictureFile;
        return this;
    }
    public String getIdOcrPictureFile() {
        return this.idOcrPictureFile;
    }

    public EkycVerifyV2Request setIdOcrPictureUrl(String idOcrPictureUrl) {
        this.idOcrPictureUrl = idOcrPictureUrl;
        return this;
    }
    public String getIdOcrPictureUrl() {
        return this.idOcrPictureUrl;
    }

    public EkycVerifyV2Request setIdThreshold(String idThreshold) {
        this.idThreshold = idThreshold;
        return this;
    }
    public String getIdThreshold() {
        return this.idThreshold;
    }

    public EkycVerifyV2Request setMerchantBizId(String merchantBizId) {
        this.merchantBizId = merchantBizId;
        return this;
    }
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    public EkycVerifyV2Request setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
        return this;
    }
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

    public EkycVerifyV2Request setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
