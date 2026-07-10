// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class AIGCFaceVerifyRequest extends TeaModel {
    /**
     * <p>The Base64-encoded photo.</p>
     * <blockquote>
     * <p>You can use one of the following methods to pass in the image: FaceContrastPicture, FaceContrastPictureUrl, or OSS.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>/9j/4AAQSkZJRgABAQAASxxxxxxx</p>
     */
    @NameInMap("FaceContrastPicture")
    public String faceContrastPicture;

    /**
     * <p>The URL of the face image. The URL must be a publicly accessible HTTP or HTTPS link.</p>
     * <blockquote>
     * <p>You can use one of the following methods to pass in the image: FaceContrastPicture, FaceContrastPictureUrl, or OSS.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="https://cn-shanghai-aliyun-cloudauth-xxxxxx.oss-cn-shanghai.aliyuncs.com/verify/xxxxx/xxxxx.jpeg">https://cn-shanghai-aliyun-cloudauth-xxxxxx.oss-cn-shanghai.aliyuncs.com/verify/xxxxx/xxxxx.jpeg</a></p>
     */
    @NameInMap("FaceContrastPictureUrl")
    public String faceContrastPictureUrl;

    /**
     * <p>The name of the authorized OSS bucket.</p>
     * <blockquote>
     * <p>You can use one of the following methods to pass in the image: FaceContrastPicture, FaceContrastPictureUrl, or OSS.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-aliyun-cloudauth-xxxxx</p>
     */
    @NameInMap("OssBucketName")
    public String ossBucketName;

    /**
     * <p>The file name in the authorized OSS bucket.</p>
     * <blockquote>
     * <p>You can use one of the following methods to pass in the image: FaceContrastPicture, FaceContrastPictureUrl, or OSS.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>verify/xxxxx/xxxxxx.jpeg</p>
     */
    @NameInMap("OssObjectName")
    public String ossObjectName;

    /**
     * <p>The custom business unique identifier on the client side, used for subsequent troubleshooting. The value can contain up to 32 characters, including letters and digits. Make sure the value is unique.</p>
     * 
     * <strong>example:</strong>
     * <p>e0c34a77f5ac40a5aa5e6ed20c353888</p>
     */
    @NameInMap("OuterOrderNo")
    public String outerOrderNo;

    /**
     * <p>The product plan.</p>
     * 
     * <strong>example:</strong>
     * <p>LR_FR_AIGC</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The ID of the verification scenario. This ID is automatically generated after you create a verification scenario in the console. For more information about how to create a verification scenario, refer to Add a verification scenario.</p>
     * 
     * <strong>example:</strong>
     * <p>100000xxxx</p>
     */
    @NameInMap("SceneId")
    public Long sceneId;

    public static AIGCFaceVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        AIGCFaceVerifyRequest self = new AIGCFaceVerifyRequest();
        return TeaModel.build(map, self);
    }

    public AIGCFaceVerifyRequest setFaceContrastPicture(String faceContrastPicture) {
        this.faceContrastPicture = faceContrastPicture;
        return this;
    }
    public String getFaceContrastPicture() {
        return this.faceContrastPicture;
    }

    public AIGCFaceVerifyRequest setFaceContrastPictureUrl(String faceContrastPictureUrl) {
        this.faceContrastPictureUrl = faceContrastPictureUrl;
        return this;
    }
    public String getFaceContrastPictureUrl() {
        return this.faceContrastPictureUrl;
    }

    public AIGCFaceVerifyRequest setOssBucketName(String ossBucketName) {
        this.ossBucketName = ossBucketName;
        return this;
    }
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    public AIGCFaceVerifyRequest setOssObjectName(String ossObjectName) {
        this.ossObjectName = ossObjectName;
        return this;
    }
    public String getOssObjectName() {
        return this.ossObjectName;
    }

    public AIGCFaceVerifyRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public AIGCFaceVerifyRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public AIGCFaceVerifyRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

}
