// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class GeneralImageGenerationRequest extends TeaModel {
    /**
     * <p>The task type. Select the generation method.<br>text_to_image: Generate images using only text descriptions.<br>image_to_image: Generate or edit images based on existing images.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>text_to_image</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>The generation mode. The lite mode is faster and more cost-effective. The plus mode produces finer visual effects and supports more reference images.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lite</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The number of images generated per call. Valid values: 1 to 4. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("N")
    public Integer n;

    /**
     * <p>The specific operation for image generation or editing. Only one operation can be selected. Valid values:<br>[general] scenario</p>
     * <ul>
     * <li><p>general_generate (General generation)</p>
     * </li>
     * <li><p>outpaint (AI outpainting)</p>
     * </li>
     * </ul>
     * <p>[product_ecommerce] scenario</p>
     * <ul>
     * <li><p>scene_generate (Scene image generation)</p>
     * </li>
     * <li><p>product_replace (Product replacement)</p>
     * </li>
     * </ul>
     * <p>[cloth_ecommerce] scenario</p>
     * <ul>
     * <li>model_generate (Model image generation)</li>
     * </ul>
     * <p>[product_ecommerce] scenario &amp; [cloth_ecommerce] scenario</p>
     * <ul>
     * <li><p>detail_generate (Detail image generation)</p>
     * </li>
     * <li><p>selling_point_generate (Selling point image generation)</p>
     * </li>
     * <li><p>scene_variation (Scene variation)</p>
     * </li>
     * <li><p>subject_extract (Subject extraction)</p>
     * </li>
     * <li><p>recolor (Recolor)</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>generate_generate</p>
     */
    @NameInMap("Operation")
    public String operation;

    /**
     * <p>The content of the image you want to generate. Enter only one prompt, up to 5,000 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>A white ceramic cup placed in a simple studio background</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <p>Specifies whether automatic optimization is enabled for the entered prompt. When the optimization is enabled, it completes image details to make the generated effect closer to the description. Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("PromptExtend")
    public Boolean promptExtend;

    /**
     * <p>The aspect ratio of the image. Valid values: 1:1, 2:3, 3:2, 4:3, 3:4, 16:9, and 9:16. Default value: 1:1.</p>
     * 
     * <strong>example:</strong>
     * <p>1:1</p>
     */
    @NameInMap("Ratio")
    public String ratio;

    /**
     * <p>The URLs of the reference images. Enter publicly accessible links.
     * Used only for image-to-image generation. Not supported for text-to-image generation.
     * The number of images that can be uploaded varies by mode: up to 3 images in lite mode, and up to 9 images in plus mode.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;<a href="https://example.com/referece.jpg%22%5D">https://example.com/referece.jpg&quot;]</a></p>
     */
    @NameInMap("ReferenceUrl")
    public java.util.List<String> referenceUrl;

    /**
     * <p>The resolution of the output image. Valid values: 1K and 2K. Default value: 1K.</p>
     * 
     * <strong>example:</strong>
     * <p>1K</p>
     */
    @NameInMap("Resolution")
    public String resolution;

    /**
     * <p>The scenario. Valid values: general (general scenario), product_ecommerce (general product scenario), and cloth_ecommerce (apparel and accessories scenario). Only one scenario can be selected.</p>
     * <ul>
     * <li><p>If the task type is text_to_image, only general is supported.</p>
     * </li>
     * <li><p>If the task type is image_to_image, general, product_ecommerce, and cloth_ecommerce are supported.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>general</p>
     */
    @NameInMap("Scene")
    public String scene;

    /**
     * <p>Specifies whether to add a watermark to the generated image. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Watermark")
    public Boolean watermark;

    public static GeneralImageGenerationRequest build(java.util.Map<String, ?> map) throws Exception {
        GeneralImageGenerationRequest self = new GeneralImageGenerationRequest();
        return TeaModel.build(map, self);
    }

    public GeneralImageGenerationRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public GeneralImageGenerationRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public GeneralImageGenerationRequest setN(Integer n) {
        this.n = n;
        return this;
    }
    public Integer getN() {
        return this.n;
    }

    public GeneralImageGenerationRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public GeneralImageGenerationRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public GeneralImageGenerationRequest setPromptExtend(Boolean promptExtend) {
        this.promptExtend = promptExtend;
        return this;
    }
    public Boolean getPromptExtend() {
        return this.promptExtend;
    }

    public GeneralImageGenerationRequest setRatio(String ratio) {
        this.ratio = ratio;
        return this;
    }
    public String getRatio() {
        return this.ratio;
    }

    public GeneralImageGenerationRequest setReferenceUrl(java.util.List<String> referenceUrl) {
        this.referenceUrl = referenceUrl;
        return this;
    }
    public java.util.List<String> getReferenceUrl() {
        return this.referenceUrl;
    }

    public GeneralImageGenerationRequest setResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }
    public String getResolution() {
        return this.resolution;
    }

    public GeneralImageGenerationRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public GeneralImageGenerationRequest setWatermark(Boolean watermark) {
        this.watermark = watermark;
        return this;
    }
    public Boolean getWatermark() {
        return this.watermark;
    }

}
