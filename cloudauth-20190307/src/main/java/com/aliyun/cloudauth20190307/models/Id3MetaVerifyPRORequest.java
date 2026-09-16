// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Id3MetaVerifyPRORequest extends TeaModel {
    /**
     * <p>Specifies whether to allow cropping of the facial photo. By default, cropping is not allowed. Valid values:</p>
     * <ul>
     * <li><strong>T</strong>: Cropping is allowed.</li>
     * <li><strong>F</strong>: Cropping is not allowed.<blockquote>
     * <p>If the requested image is not captured by a standard liveness detection SDK, allow cropping of the facial photo.
     * After this feature is enabled, the requested image is first cropped and corrected for the face, and then the request is sent to the service.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>T</p>
     */
    @NameInMap("Crop")
    public String crop;

    /**
     * <p>Specifies whether to allow fallback to a non-public security source. Valid values:</p>
     * <ul>
     * <li><strong>N</strong> (default): Disabled.</li>
     * <li><strong>Y</strong>: Enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("EnableFallback")
    public String enableFallback;

    /**
     * <p>The input stream of the facial photo.</p>
     * 
     * <strong>example:</strong>
     * <p>For the specific integration method, refer to the file upload Advance API configuration</p>
     */
    @NameInMap("FaceFile")
    public String faceFile;

    /**
     * <p>The Base64-encoded photo. If you use this method to submit the facial photo, check the photo size and do not submit an excessively large photo.</p>
     * 
     * <strong>example:</strong>
     * <p>/9j/4AAQSkZJRgABAQAASxxxxxxx</p>
     */
    @NameInMap("FacePicture")
    public String facePicture;

    /**
     * <p>The URL of the facial photo. The URL must be a publicly accessible HTTP or HTTPS link.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://cn-shanghai-aliyun-cloudauth-xxxxxx.oss-cn-shanghai.aliyuncs.com/verify/xxxxx/xxxxx.jpeg">https://cn-shanghai-aliyun-cloudauth-xxxxxx.oss-cn-shanghai.aliyuncs.com/verify/xxxxx/xxxxx.jpeg</a></p>
     */
    @NameInMap("FaceUrl")
    public String faceUrl;

    /**
     * <p>The ID card number.</p>
     * <ul>
     * <li><p>If <strong>paramType</strong> is set to normal: Enter the ID card number in plaintext.</p>
     * </li>
     * <li><p>If <strong>paramType</strong> is set to sm2: Enter the encrypted ID card number.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Due to authoritative source limitations, only second-generation resident ID card numbers are supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Plaintext: 429001********8211</p>
     * <p>Ciphertext: MHsCIEPDt1ycBNSVgA2yKsMnvWGheiI+STWqJLmYWlZnklhnAiEAwq1bk5YVepHwqfMsd9ErlK71OrdXx8E+wfqbzyFCwoMEIM1QdrFeekvQh6fwK7sVXAsNePiNm7Eulqm/zahRosbKBBKgtyhm3SopJ3tO/wALKXQQW+g=</p>
     */
    @NameInMap("IdentifyNum")
    public String identifyNum;

    /**
     * <p>Specifies whether to enable liveness detection. Valid values:</p>
     * <ul>
     * <li><strong>N</strong> (default): Liveness detection is disabled.</li>
     * <li><strong>Y</strong>: Liveness detection is enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("LivenessCheck")
    public String livenessCheck;

    /**
     * <p>The encryption method. Valid values:</p>
     * <ul>
     * <li><p><strong>normal</strong>: Plaintext without encryption.</p>
     * </li>
     * <li><p><strong>sm2</strong>: SM2 encryption.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("ParamType")
    public String paramType;

    /**
     * <p>The name.</p>
     * <ul>
     * <li><p>If <strong>paramType</strong> is set to normal: Enter the name in plaintext.</p>
     * </li>
     * <li><p>If <strong>paramType</strong> is set to sm2: Enter the encrypted name.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Plaintext: Zhang San</p>
     * <p>Ciphertext: MG8CIQCxI0wNYbc0c2BRL+7+tSethTXfQC391ZFnszRRcvRZ9AIgekQYhgDtxaDuoRD4bde/5fnFdlUp4YoxlEnIFLLm2mQEILkctuy6Rw6lfAUxBtkpPoPVCJAeD5al/RX8JFUvTACEBAYAgLJjBe0=</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static Id3MetaVerifyPRORequest build(java.util.Map<String, ?> map) throws Exception {
        Id3MetaVerifyPRORequest self = new Id3MetaVerifyPRORequest();
        return TeaModel.build(map, self);
    }

    public Id3MetaVerifyPRORequest setCrop(String crop) {
        this.crop = crop;
        return this;
    }
    public String getCrop() {
        return this.crop;
    }

    public Id3MetaVerifyPRORequest setEnableFallback(String enableFallback) {
        this.enableFallback = enableFallback;
        return this;
    }
    public String getEnableFallback() {
        return this.enableFallback;
    }

    public Id3MetaVerifyPRORequest setFaceFile(String faceFile) {
        this.faceFile = faceFile;
        return this;
    }
    public String getFaceFile() {
        return this.faceFile;
    }

    public Id3MetaVerifyPRORequest setFacePicture(String facePicture) {
        this.facePicture = facePicture;
        return this;
    }
    public String getFacePicture() {
        return this.facePicture;
    }

    public Id3MetaVerifyPRORequest setFaceUrl(String faceUrl) {
        this.faceUrl = faceUrl;
        return this;
    }
    public String getFaceUrl() {
        return this.faceUrl;
    }

    public Id3MetaVerifyPRORequest setIdentifyNum(String identifyNum) {
        this.identifyNum = identifyNum;
        return this;
    }
    public String getIdentifyNum() {
        return this.identifyNum;
    }

    public Id3MetaVerifyPRORequest setLivenessCheck(String livenessCheck) {
        this.livenessCheck = livenessCheck;
        return this;
    }
    public String getLivenessCheck() {
        return this.livenessCheck;
    }

    public Id3MetaVerifyPRORequest setParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }
    public String getParamType() {
        return this.paramType;
    }

    public Id3MetaVerifyPRORequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
