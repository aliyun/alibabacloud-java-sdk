// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Id3MetaVerifyRequest extends TeaModel {
    /**
     * <p>Specifies whether to allow cropping of the facial photo. By default, cropping is not allowed. Valid values:</p>
     * <ul>
     * <li>T: allows cropping.</li>
     * <li>F: does not allow cropping.</li>
     * </ul>
     * <p><strong>Note</strong></p>
     * <p>If the requested image is not captured by a standard liveness detection SDK, allow cropping of the facial photo. After this feature is enabled, the requested image is first cropped and corrected for face alignment before the service request is initiated.</p>
     * 
     * <strong>example:</strong>
     * <p>T</p>
     */
    @NameInMap("Crop")
    public String crop;

    /**
     * <p>The input stream of the ID card portrait photo. Specify either CertUrl or CertFile.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("FaceFile")
    public String faceFile;

    /**
     * <p>The Base64-encoded facial photo.</p>
     * 
     * <strong>example:</strong>
     * <p>/9j/4AAQSkZJRgABAQAASxxxxxxx</p>
     */
    @NameInMap("FacePicture")
    public String facePicture;

    /**
     * <p>The URL of the ID card portrait photo. The URL must be a publicly accessible HTTP or HTTPS link. Specify either CertUrl or CertFile.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.aliyun.com/cert.jpeg">https://www.aliyun.com/cert.jpeg</a></p>
     */
    @NameInMap("FaceUrl")
    public String faceUrl;

    /**
     * <p>The ID card number:</p>
     * <ul>
     * <li>If paramType is set to normal: enter the ID card number in plaintext.</li>
     * <li>If paramType is set to md5: first 6 digits of the ID card number (plaintext) + date of birth (ciphertext) + last 4 digits of the ID card number (plaintext).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>● Plaintext: 429001****<strong><strong>8211
     * ● Ciphertext:
     * 42900132fa7bcd874161bea8ec8fd98f39</strong></strong>8211</p>
     */
    @NameInMap("IdentifyNum")
    public String identifyNum;

    /**
     * <p>The encryption method. Valid values:</p>
     * <ul>
     * <li>normal: plaintext without encryption.</li>
     * <li>md5: MD5 encryption.</li>
     * </ul>
     * <p><strong>Important</strong></p>
     * <ul>
     * <li>All encrypted parameter values use 32-character lowercase MD5 strings.</li>
     * <li>Different MD5 tools may produce different ciphertext. If the API call succeeds with plaintext but fails after encryption, try a different MD5 tool.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("ParamType")
    public String paramType;

    /**
     * <p>The name:</p>
     * <ul>
     * <li>If paramType is set to normal: enter the name in plaintext.</li>
     * <li>If paramType is set to md5: ciphertext of the first character of the name + plaintext of the remaining characters.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>● Plaintext: Zhang San
     * ● Ciphertext:
     * 6499fc7409049355527ef6a2ba5706b8San​</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static Id3MetaVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        Id3MetaVerifyRequest self = new Id3MetaVerifyRequest();
        return TeaModel.build(map, self);
    }

    public Id3MetaVerifyRequest setCrop(String crop) {
        this.crop = crop;
        return this;
    }
    public String getCrop() {
        return this.crop;
    }

    public Id3MetaVerifyRequest setFaceFile(String faceFile) {
        this.faceFile = faceFile;
        return this;
    }
    public String getFaceFile() {
        return this.faceFile;
    }

    public Id3MetaVerifyRequest setFacePicture(String facePicture) {
        this.facePicture = facePicture;
        return this;
    }
    public String getFacePicture() {
        return this.facePicture;
    }

    public Id3MetaVerifyRequest setFaceUrl(String faceUrl) {
        this.faceUrl = faceUrl;
        return this;
    }
    public String getFaceUrl() {
        return this.faceUrl;
    }

    public Id3MetaVerifyRequest setIdentifyNum(String identifyNum) {
        this.identifyNum = identifyNum;
        return this;
    }
    public String getIdentifyNum() {
        return this.identifyNum;
    }

    public Id3MetaVerifyRequest setParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }
    public String getParamType() {
        return this.paramType;
    }

    public Id3MetaVerifyRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
