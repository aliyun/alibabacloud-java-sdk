// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class AiTryOnRequest extends TeaModel {
    /**
     * <p>The list of product image URLs. This parameter is required for single-item and multi-item outfit scenarios.   </p>
     * <ul>
     * <li>Single-item try-on: Pass images of the same product from different angles. The standard edition supports up to two product images, but requires that all images contain one and only one main product. We recommend that you use product images with a white background.   </li>
     * <li>Multi-item outfit: Pass images of all products to be worn. The standard edition supports up to two product images (each image can contain multiple products). A single outfit can include up to six clothing items and accessories.<br>Note: For the clothing replacement, face replacement, and posture replacement modes, specify only one mode per call. Do not upload parameters for multiple modes at the same time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><a href="https://ae01.alicdn.com/kf/S3470dc9f4be09a6cbed34e90dc8fs.jpg">https://ae01.alicdn.com/kf/S3470dc9f4be09a6cbed34e90dc8fs.jpg</a></p>
     */
    @NameInMap("ClothImageUrl")
    public String clothImageUrl;

    /**
     * <p>Specifies the types of products to try on. You can specify multiple types at a time. If you do not specify this parameter, the system automatically identifies all supported categories in the product image.<br>Valid values: tops, outwear, bottoms, dresses, tops and bottoms, socks, shoes, hats, earrings, necklaces, braceles, scarves, bags, and glasses.</p>
     * 
     * <strong>example:</strong>
     * <p>tops</p>
     */
    @NameInMap("ClothType")
    public String clothType;

    /**
     * <p>The try-on mode, which determines the maximum number of product images and outfit items. Currently, only <code>lite</code> is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>lite</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The URL of the model scene image. You can specify only one image.   </p>
     * <ul>
     * <li>The image must support public network access over HTTP or HTTPS.   </li>
     * <li>Supported formats: JPG, JPEG, PNG, BMP, and WEBP.   </li>
     * <li>The width and height must be between 256 and 2049 pixels.   </li>
     * <li>The size of a single file cannot exceed 10 MB.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/model.jpg%5C%5C">https://example.com/model.jpg\\</a></p>
     */
    @NameInMap("ModelImageUrl")
    public String modelImageUrl;

    /**
     * <p>The URL of the model template image. You can specify only one image. This image provides reference identity information such as gender, skin color, age, and body type.<br>This parameter is required for the model skin replacement scenario. Do not specify this parameter for the clothing replacement or posture replacement scenarios. For the clothing replacement, face replacement, and posture replacement modes, specify only one mode per call. Do not upload parameters for multiple modes at the same time.<br>We recommend that you use the official model templates. Experience URL: <a href="https://ecoa.console.aliyun.com/translate?category=assetOptimize&apiType=VirtualTryOn">E-commerce Operation Assistant Aidge console</a></p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxxx">https://xxxx</a></p>
     */
    @NameInMap("ModelTemplateUrl")
    public String modelTemplateUrl;

    /**
     * <p>The URL of the posture template image. You can specify only one image. This image provides a reference for the person\&quot;s posture.
     * This parameter is required for the posture fission scenario.
     * If this parameter is specified, the image is generated based on the template posture.
     * If this parameter is not specified, the posture in the scene image is used if a model scene image is provided. Otherwise, the posture in the model source image is preserved.
     * Note: For the clothing replacement, face replacement, and posture replacement modes, specify only one mode per call. Do not upload parameters for multiple modes at the same time.
     * We recommend that you use the official posture templates. Experience URL: <a href="https://ecoa.console.aliyun.com/translate?category=assetOptimize&apiType=VirtualTryOn">E-commerce Operation Assistant Aidge console</a></p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxxx">https://xxxx</a></p>
     */
    @NameInMap("PoseTemplateUrl")
    public String poseTemplateUrl;

    /**
     * <p>The aspect ratio of the output image. By default, the aspect ratio is the same as that of the original image specified by ModelImageUrl. Valid values: 1:1, 2:3, 3:4, and 9:16.</p>
     * 
     * <strong>example:</strong>
     * <p>1:1</p>
     */
    @NameInMap("Ratio")
    public String ratio;

    /**
     * <p>The resolution of the output image.</p>
     * <ul>
     * <li>Synchronous API: supports 1K.</li>
     * <li>Asynchronous API: supports 1K and 2K. The asynchronous API only supports single-item outfit scenarios.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1K</p>
     */
    @NameInMap("Resolution")
    public String resolution;

    /**
     * <p>This parameter takes effect only in try-on scenarios and specifies the number of products to try on. Default value: <code>singletryon</code>.<br>Valid values:   </p>
     * <ul>
     * <li><code>singletryon</code>: single-item try-on.   </li>
     * <li><code>multitryon</code>: multi-item outfit.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>singletryon</p>
     */
    @NameInMap("TryonType")
    public String tryonType;

    public static AiTryOnRequest build(java.util.Map<String, ?> map) throws Exception {
        AiTryOnRequest self = new AiTryOnRequest();
        return TeaModel.build(map, self);
    }

    public AiTryOnRequest setClothImageUrl(String clothImageUrl) {
        this.clothImageUrl = clothImageUrl;
        return this;
    }
    public String getClothImageUrl() {
        return this.clothImageUrl;
    }

    public AiTryOnRequest setClothType(String clothType) {
        this.clothType = clothType;
        return this;
    }
    public String getClothType() {
        return this.clothType;
    }

    public AiTryOnRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public AiTryOnRequest setModelImageUrl(String modelImageUrl) {
        this.modelImageUrl = modelImageUrl;
        return this;
    }
    public String getModelImageUrl() {
        return this.modelImageUrl;
    }

    public AiTryOnRequest setModelTemplateUrl(String modelTemplateUrl) {
        this.modelTemplateUrl = modelTemplateUrl;
        return this;
    }
    public String getModelTemplateUrl() {
        return this.modelTemplateUrl;
    }

    public AiTryOnRequest setPoseTemplateUrl(String poseTemplateUrl) {
        this.poseTemplateUrl = poseTemplateUrl;
        return this;
    }
    public String getPoseTemplateUrl() {
        return this.poseTemplateUrl;
    }

    public AiTryOnRequest setRatio(String ratio) {
        this.ratio = ratio;
        return this;
    }
    public String getRatio() {
        return this.ratio;
    }

    public AiTryOnRequest setResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }
    public String getResolution() {
        return this.resolution;
    }

    public AiTryOnRequest setTryonType(String tryonType) {
        this.tryonType = tryonType;
        return this;
    }
    public String getTryonType() {
        return this.tryonType;
    }

}
