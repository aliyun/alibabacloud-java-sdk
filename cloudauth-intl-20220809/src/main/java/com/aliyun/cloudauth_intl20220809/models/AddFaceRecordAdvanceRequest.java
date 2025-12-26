// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class AddFaceRecordAdvanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sgl****7uc</p>
     */
    @NameInMap("FaceGroupCode")
    public String faceGroupCode;

    /**
     * <strong>example:</strong>
     * <p>base64</p>
     */
    @NameInMap("FacePicture")
    public String facePicture;

    /**
     * <strong>example:</strong>
     * <p>InputStream</p>
     */
    @NameInMap("FacePictureFile")
    public java.io.InputStream facePictureFileObject;

    /**
     * <strong>example:</strong>
     * <p><a href="https://www.xxxxx.com/test.jpg">https://www.xxxxx.com/test.jpg</a></p>
     */
    @NameInMap("FacePictureUrl")
    public String facePictureUrl;

    /**
     * <strong>example:</strong>
     * <p>N</p>
     */
    @NameInMap("FaceQualityCheck")
    public String faceQualityCheck;

    /**
     * <strong>example:</strong>
     * <p>130A2C10B9EE4D8488E35384FF03hst</p>
     */
    @NameInMap("MerchantUserId")
    public String merchantUserId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FACE_ENROLL</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    public static AddFaceRecordAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddFaceRecordAdvanceRequest self = new AddFaceRecordAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public AddFaceRecordAdvanceRequest setFaceGroupCode(String faceGroupCode) {
        this.faceGroupCode = faceGroupCode;
        return this;
    }
    public String getFaceGroupCode() {
        return this.faceGroupCode;
    }

    public AddFaceRecordAdvanceRequest setFacePicture(String facePicture) {
        this.facePicture = facePicture;
        return this;
    }
    public String getFacePicture() {
        return this.facePicture;
    }

    public AddFaceRecordAdvanceRequest setFacePictureFileObject(java.io.InputStream facePictureFileObject) {
        this.facePictureFileObject = facePictureFileObject;
        return this;
    }
    public java.io.InputStream getFacePictureFileObject() {
        return this.facePictureFileObject;
    }

    public AddFaceRecordAdvanceRequest setFacePictureUrl(String facePictureUrl) {
        this.facePictureUrl = facePictureUrl;
        return this;
    }
    public String getFacePictureUrl() {
        return this.facePictureUrl;
    }

    public AddFaceRecordAdvanceRequest setFaceQualityCheck(String faceQualityCheck) {
        this.faceQualityCheck = faceQualityCheck;
        return this;
    }
    public String getFaceQualityCheck() {
        return this.faceQualityCheck;
    }

    public AddFaceRecordAdvanceRequest setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
        return this;
    }
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

    public AddFaceRecordAdvanceRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
