// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class EcomVideoRecreationRequest extends TeaModel {
    /**
     * <p>The input parameters for video remix.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public EcomVideoRecreationRequestInput input;

    /**
     * <p>The output specifications for the final video.</p>
     */
    @NameInMap("Output")
    public EcomVideoRecreationRequestOutput output;

    public static EcomVideoRecreationRequest build(java.util.Map<String, ?> map) throws Exception {
        EcomVideoRecreationRequest self = new EcomVideoRecreationRequest();
        return TeaModel.build(map, self);
    }

    public EcomVideoRecreationRequest setInput(EcomVideoRecreationRequestInput input) {
        this.input = input;
        return this;
    }
    public EcomVideoRecreationRequestInput getInput() {
        return this.input;
    }

    public EcomVideoRecreationRequest setOutput(EcomVideoRecreationRequestOutput output) {
        this.output = output;
        return this;
    }
    public EcomVideoRecreationRequestOutput getOutput() {
        return this.output;
    }

    public static class EcomVideoRecreationRequestInputProductInfo extends TeaModel {
        /**
         * <p>The product category.<br>Example: Women\&quot;s Clothing/Sun Protection Jacket</p>
         * 
         * <strong>example:</strong>
         * <p>Women\&quot;s clothing/sun protection clothing</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The actual product information (SKU, brand, color, material, size, specifications, logo, and usage), used to constrain voiceover facts.<br>Example: Light moon yellow, cool-touch fabric, sun protection to the back of the hand, UPF50+</p>
         * 
         * <strong>example:</strong>
         * <p>Light moon yellow, cool-touch fabric, sun protection extending to the back of the hand, UPF50+</p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <p>Required for product replacement. The name of the target product. Maximum length: 200 characters.<br>Example: Light Moon Yellow Cool-touch Sun Protection Jacket</p>
         * 
         * <strong>example:</strong>
         * <p>Light moon yellow cool-touch sun protection clothing</p>
         */
        @NameInMap("Title")
        public String title;

        public static EcomVideoRecreationRequestInputProductInfo build(java.util.Map<String, ?> map) throws Exception {
            EcomVideoRecreationRequestInputProductInfo self = new EcomVideoRecreationRequestInputProductInfo();
            return TeaModel.build(map, self);
        }

        public EcomVideoRecreationRequestInputProductInfo setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public EcomVideoRecreationRequestInputProductInfo setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public EcomVideoRecreationRequestInputProductInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class EcomVideoRecreationRequestInput extends TeaModel {
        /**
         * <p>The description or supplementary constraints for the target person in person replacement mode. 1 to 500 characters. Required when PersonReferenceImageUrls is not provided.<br>Example: The target person is an adult male. Retain the original clothing and actions.</p>
         * 
         * <strong>example:</strong>
         * <p>The target character is an adult male, with the original costume and movements preserved.</p>
         */
        @NameInMap("ChangeDescription")
        public String changeDescription;

        /**
         * <p>The replacement mode. Valid values: <code>product_replacement</code> (default) and <code>person_replacement</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>product_replacement</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The URLs of target person reference images for person replacement. 1 to 5 images of the same person are supported. Arrange images in the following order: face close-up, front view, 45-degree angle, side view, and back view.<br>Example: [&quot;<a href="https://example.com/person.jpg%22%5D">https://example.com/person.jpg&quot;]</a></p>
         */
        @NameInMap("PersonReferenceImageUrls")
        public java.util.List<String> personReferenceImageUrls;

        /**
         * <p>The URL of the target product image. Required for product replacement. Exactly one image must be provided. A clear subject with no occlusion and a clean background is recommended.<br>Example: [&quot;<a href="https://example.com/product.png%22%5D">https://example.com/product.png&quot;]</a></p>
         */
        @NameInMap("ProductImageUrls")
        public java.util.List<String> productImageUrls;

        /**
         * <p>The target product information. Provide this parameter to improve voiceover accuracy.</p>
         */
        @NameInMap("ProductInfo")
        public EcomVideoRecreationRequestInputProductInfo productInfo;

        /**
         * <p>The HTTP(S) URL of the reference video. The video duration must be in the range of 2 to 360 seconds. The URL must remain accessible during task execution. Set the URL validity period to at least 24 hours.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/source.mp4">https://example.com/source.mp4</a></p>
         */
        @NameInMap("SourceVideoUrl")
        public String sourceVideoUrl;

        public static EcomVideoRecreationRequestInput build(java.util.Map<String, ?> map) throws Exception {
            EcomVideoRecreationRequestInput self = new EcomVideoRecreationRequestInput();
            return TeaModel.build(map, self);
        }

        public EcomVideoRecreationRequestInput setChangeDescription(String changeDescription) {
            this.changeDescription = changeDescription;
            return this;
        }
        public String getChangeDescription() {
            return this.changeDescription;
        }

        public EcomVideoRecreationRequestInput setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public EcomVideoRecreationRequestInput setPersonReferenceImageUrls(java.util.List<String> personReferenceImageUrls) {
            this.personReferenceImageUrls = personReferenceImageUrls;
            return this;
        }
        public java.util.List<String> getPersonReferenceImageUrls() {
            return this.personReferenceImageUrls;
        }

        public EcomVideoRecreationRequestInput setProductImageUrls(java.util.List<String> productImageUrls) {
            this.productImageUrls = productImageUrls;
            return this;
        }
        public java.util.List<String> getProductImageUrls() {
            return this.productImageUrls;
        }

        public EcomVideoRecreationRequestInput setProductInfo(EcomVideoRecreationRequestInputProductInfo productInfo) {
            this.productInfo = productInfo;
            return this;
        }
        public EcomVideoRecreationRequestInputProductInfo getProductInfo() {
            return this.productInfo;
        }

        public EcomVideoRecreationRequestInput setSourceVideoUrl(String sourceVideoUrl) {
            this.sourceVideoUrl = sourceVideoUrl;
            return this;
        }
        public String getSourceVideoUrl() {
            return this.sourceVideoUrl;
        }

    }

    public static class EcomVideoRecreationRequestOutput extends TeaModel {
        /**
         * <p>The target duration in seconds. <code>&quot;auto&quot;</code> (default): determined by the system. For product replacement, an integer from 5 to 60 can be specified. For person replacement, only <code>&quot;auto&quot;</code> is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>auto</p>
         */
        @NameInMap("Duration")
        public Integer duration;

        /**
         * <p>The output resolution. Default value: <code>720p</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>720p、1080p</p>
         */
        @NameInMap("Quality")
        public String quality;

        /**
         * <p>The output aspect ratio. Default value: <code>auto</code> (automatically matches the original video).</p>
         * 
         * <strong>example:</strong>
         * <p>auto、9:16、3:4、1:1、4:3、16:9</p>
         */
        @NameInMap("Ratio")
        public String ratio;

        public static EcomVideoRecreationRequestOutput build(java.util.Map<String, ?> map) throws Exception {
            EcomVideoRecreationRequestOutput self = new EcomVideoRecreationRequestOutput();
            return TeaModel.build(map, self);
        }

        public EcomVideoRecreationRequestOutput setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public EcomVideoRecreationRequestOutput setQuality(String quality) {
            this.quality = quality;
            return this;
        }
        public String getQuality() {
            return this.quality;
        }

        public EcomVideoRecreationRequestOutput setRatio(String ratio) {
            this.ratio = ratio;
            return this;
        }
        public String getRatio() {
            return this.ratio;
        }

    }

}
