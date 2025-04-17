// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class AddImageMosaicRequest extends TeaModel {
    /**
     * <p><strong>If you do not have special requirements, leave this parameter empty.</strong></p>
     * <p>The authorization chain settings. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use authorization chains to access resources of other entities</a>.</p>
     */
    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    /**
     * <p>The encoding of the output image. By default, the output image uses the same encoding as the input image. Valid values: jpg, png, and webp.</p>
     * 
     * <strong>example:</strong>
     * <p>jpg</p>
     */
    @NameInMap("ImageFormat")
    public String imageFormat;

    /**
     * <p>The name of the project.<a href="~~478153~~"></a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The quality of the output image. This parameter applies only to JPG and WebP images. Valid values: 0 to 100. Default value: 80.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("Quality")
    public Integer quality;

    /**
     * <p>The OSS URI of the input image.</p>
     * <p>Specify the OSS URI in the oss://${Bucket}/${Object} format, where <code>${Bucket}</code> is the name of the bucket in the same region as the current project and <code>${Object}</code> is the path of the object with the extension included.</p>
     * <p>Supported formats of input images include JPG, PNG, TIFF, JP2, and BMP.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://examplebucket/sampleobject.jpg</p>
     */
    @NameInMap("SourceURI")
    public String sourceURI;

    /**
     * <p>The OSS URI of the output image.</p>
     * <p>Specify the OSS URI in the oss://${Bucket}/${Object} format, where <code>${Bucket}</code> is the name of the bucket in the same region as the current project and <code>${Object}</code> is the path of the object with the extension included.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://examplebucket/outputImage.jpg</p>
     */
    @NameInMap("TargetURI")
    public String targetURI;

    /**
     * <p>The bounding boxes and processing parameters.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Targets")
    public java.util.List<AddImageMosaicRequestTargets> targets;

    public static AddImageMosaicRequest build(java.util.Map<String, ?> map) throws Exception {
        AddImageMosaicRequest self = new AddImageMosaicRequest();
        return TeaModel.build(map, self);
    }

    public AddImageMosaicRequest setCredentialConfig(CredentialConfig credentialConfig) {
        this.credentialConfig = credentialConfig;
        return this;
    }
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    public AddImageMosaicRequest setImageFormat(String imageFormat) {
        this.imageFormat = imageFormat;
        return this;
    }
    public String getImageFormat() {
        return this.imageFormat;
    }

    public AddImageMosaicRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public AddImageMosaicRequest setQuality(Integer quality) {
        this.quality = quality;
        return this;
    }
    public Integer getQuality() {
        return this.quality;
    }

    public AddImageMosaicRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

    public AddImageMosaicRequest setTargetURI(String targetURI) {
        this.targetURI = targetURI;
        return this;
    }
    public String getTargetURI() {
        return this.targetURI;
    }

    public AddImageMosaicRequest setTargets(java.util.List<AddImageMosaicRequestTargets> targets) {
        this.targets = targets;
        return this;
    }
    public java.util.List<AddImageMosaicRequestTargets> getTargets() {
        return this.targets;
    }

    public static class AddImageMosaicRequestTargetsBoundary extends TeaModel {
        /**
         * <p>The height of the bounding box. The value can be an integer greater than or equal to 0 or a decimal within the range of [0,1):</p>
         * <ul>
         * <li>An integer value greater than or equal to 0 indicates the height of the bounding box in pixels.</li>
         * <li>A decimal value within the range of [0,1) indicates the height of the bounding box as a ratio of its height to the image height.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Height")
        public Float height;

        /**
         * <p>The reference position of the bounding box on the image. Valid values:</p>
         * <ul>
         * <li>topright: the upper-right corner.</li>
         * <li>topleft: the upper-left corner. This is the default value.</li>
         * <li>bottomright: the lower-right corner.</li>
         * <li>bottomleft: the lower-left corner.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>topleft</p>
         */
        @NameInMap("ReferPos")
        public String referPos;

        /**
         * <p>The width of the bounding box. The value can be an integer greater than or equal to 0 or a decimal within the range of [0,1):</p>
         * <ul>
         * <li>An integer value greater than or equal to 0 indicates the width of the bounding box in pixels.</li>
         * <li>A decimal value within the range of [0,1) indicates the width of the bounding box as a ratio of its width to the image width.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Width")
        public Float width;

        /**
         * <p>The horizontal offset relative to the reference position. The value can be an integer greater than or equal to 0 or a decimal within the range of [0,1):</p>
         * <ul>
         * <li>An integer value greater than or equal to 0 indicates the horizontal offset in pixels.</li>
         * <li>A decimal value within the range of [0,1) indicates the horizontal offset as a ratio of the offset to the image width.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("X")
        public Float x;

        /**
         * <p>The vertical offset relative to the reference position. The value can be an integer greater than or equal to 0 or a decimal within the range of [0,1):</p>
         * <ul>
         * <li>An integer value greater than or equal to 0 indicates the vertical offset in pixels.</li>
         * <li>A decimal value within the range of [0,1) indicates the vertical offset as a ratio of the offset to the image height.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Y")
        public Float y;

        public static AddImageMosaicRequestTargetsBoundary build(java.util.Map<String, ?> map) throws Exception {
            AddImageMosaicRequestTargetsBoundary self = new AddImageMosaicRequestTargetsBoundary();
            return TeaModel.build(map, self);
        }

        public AddImageMosaicRequestTargetsBoundary setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public AddImageMosaicRequestTargetsBoundary setReferPos(String referPos) {
            this.referPos = referPos;
            return this;
        }
        public String getReferPos() {
            return this.referPos;
        }

        public AddImageMosaicRequestTargetsBoundary setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public AddImageMosaicRequestTargetsBoundary setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public AddImageMosaicRequestTargetsBoundary setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class AddImageMosaicRequestTargets extends TeaModel {
        /**
         * <p>The radius of the Gaussian blur. Valid values: 1 to 50. Default value: 3. Unit: pixels.</p>
         * <blockquote>
         * <p> This parameter takes effect only for a Gaussian blur.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("BlurRadius")
        public Integer blurRadius;

        /**
         * <p>The position of the bounding box.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Boundary")
        public AddImageMosaicRequestTargetsBoundary boundary;

        /**
         * <p>The color of the color shape. You can specify a color by using a color code such as<code>#RRGGBB</code> or preset color names such as <code>red</code> and <code>white</code>. The default value is #FFFFFF, which is white.</p>
         * <blockquote>
         * <p> This parameter takes effect only for solid color shapes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>#FFFFFF</p>
         */
        @NameInMap("Color")
        public String color;

        /**
         * <p>The radius of the mosaic. Default value: 5. Unit: pixels.</p>
         * <blockquote>
         * <p> This parameter does not take effect for Gaussian blurs and solid color shapes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MosaicRadius")
        public Integer mosaicRadius;

        /**
         * <p>The standard deviation of the Gaussian blur. The value must be greater than 0. Default value: 5.</p>
         * <blockquote>
         * <p> This parameter takes effect only for a Gaussian blur.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Sigma")
        public Integer sigma;

        /**
         * <p>The type of the mosaic effect. Valid values:</p>
         * <ul>
         * <li>square: squares.</li>
         * <li>diamond: diamonds.</li>
         * <li>hexagon: hexagons.</li>
         * <li>blur: Gaussian blurs.</li>
         * <li>pure: solid color shapes.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>square</p>
         */
        @NameInMap("Type")
        public String type;

        public static AddImageMosaicRequestTargets build(java.util.Map<String, ?> map) throws Exception {
            AddImageMosaicRequestTargets self = new AddImageMosaicRequestTargets();
            return TeaModel.build(map, self);
        }

        public AddImageMosaicRequestTargets setBlurRadius(Integer blurRadius) {
            this.blurRadius = blurRadius;
            return this;
        }
        public Integer getBlurRadius() {
            return this.blurRadius;
        }

        public AddImageMosaicRequestTargets setBoundary(AddImageMosaicRequestTargetsBoundary boundary) {
            this.boundary = boundary;
            return this;
        }
        public AddImageMosaicRequestTargetsBoundary getBoundary() {
            return this.boundary;
        }

        public AddImageMosaicRequestTargets setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
        }

        public AddImageMosaicRequestTargets setMosaicRadius(Integer mosaicRadius) {
            this.mosaicRadius = mosaicRadius;
            return this;
        }
        public Integer getMosaicRadius() {
            return this.mosaicRadius;
        }

        public AddImageMosaicRequestTargets setSigma(Integer sigma) {
            this.sigma = sigma;
            return this;
        }
        public Integer getSigma() {
            return this.sigma;
        }

        public AddImageMosaicRequestTargets setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
