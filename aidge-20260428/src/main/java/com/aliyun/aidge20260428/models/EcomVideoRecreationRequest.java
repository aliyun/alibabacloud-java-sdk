// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class EcomVideoRecreationRequest extends TeaModel {
    /**
     * <p>The input parameters for video variation generation.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public EcomVideoRecreationRequestInput input;

    /**
     * <p>The output specifications for the generated video.</p>
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
         * <p>The product category.<br>Example value: Women\&quot;s clothing/Sun protection clothing.</p>
         * 
         * <strong>example:</strong>
         * <p>Women\&quot;s clothing/sun protection clothing</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The actual product information, such as SKU, brand, color, material, size, specifications, logo, and usage instructions. This information is used to constrain the facts in the voiceover.<br>Example value: Pale moon yellow, cool-touch fabric, sun protection down to the back of the hand, UPF50+</p>
         * 
         * <strong>example:</strong>
         * <p>Light moon yellow, cool-touch fabric, sun protection extending to the back of the hand, UPF50+</p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <p>The name of the target product. This parameter is required for product replacement. The maximum length is 200 characters.<br>Example value: Pale moon yellow cool-touch sun protection clothing.</p>
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
         * <p>The description or supplementary constraints for the target person in person replacement. The length is 1 to 500 characters. This parameter is required when PersonReferenceImageUrls is not provided.<br>Example value: The target person is an adult male, retaining the original clothing and actions.</p>
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
         * <p>The URLs of the reference images for the target person in person replacement. You can provide 1 to 5 images, which must be of the same person. We recommend that you arrange the images in the order of facial close-up, front, 45-degree angle, side, and back.<br>Example value: [&quot;<a href="https://example.com/person.jpg%22%5D">https://example.com/person.jpg&quot;]</a></p>
         */
        @NameInMap("PersonReferenceImageUrls")
        public java.util.List<String> personReferenceImageUrls;

        /**
         * <p>The URLs of the target product images. This parameter is required for product replacement. You can upload 1 to 8 images for the same SKU. We recommend that the main subject is clear, unobstructed, and has a clean background.<br>Example value: [&quot;<a href="https://example.com/product.png%22%5D">https://example.com/product.png&quot;]</a></p>
         */
        @NameInMap("ProductImageUrls")
        public java.util.List<String> productImageUrls;

        /**
         * <p>The target product information. We recommend that you specify this parameter to improve the accuracy of the voiceover.</p>
         */
        @NameInMap("ProductInfo")
        public EcomVideoRecreationRequestInputProductInfo productInfo;

        /**
         * <p>The generation mode. Default value: <code>reference</code>. Valid values: <code>reference</code> (directly references the original video) and <code>rebuild</code> (breaks down the original video before regenerating it).</p>
         * 
         * <strong>example:</strong>
         * <p>reference</p>
         */
        @NameInMap("RecreateMode")
        public String recreateMode;

        /**
         * <p>The HTTP(S) URL of the reference video. The duration ranges from 2 to 360 seconds. The URL must remain accessible during task execution. We recommend that the validity period is no less than 24 hours.</p>
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

        public EcomVideoRecreationRequestInput setRecreateMode(String recreateMode) {
            this.recreateMode = recreateMode;
            return this;
        }
        public String getRecreateMode() {
            return this.recreateMode;
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
         * <p>The target duration in seconds. In <code>reference</code> mode, the input value is ignored and forced to -1, which follows the duration of the original video. In <code>rebuild</code> mode, you can pass an integer from 5 to 60, or pass -1 to indicate an automatic duration.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
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
