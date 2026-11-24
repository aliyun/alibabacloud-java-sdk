// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ProductVideoGenerationRequest extends TeaModel {
    /**
     * <p>The aspect ratio of the video. Default value: 9:16. Valid values: 16:9, 1:1, 3:4, and 9:16.</p>
     * 
     * <strong>example:</strong>
     * <p>9:16</p>
     */
    @NameInMap("aspect_ratio")
    public String aspectRatio;

    /**
     * <p>The duration of the video in seconds. Default value: 15. If no script is provided, the value must be an integer from 5 to 15. If a script is provided, the value must be an integer from 5 to 30. A value of 15.0 is treated as 15.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("duration")
    public Long duration;

    /**
     * <p>The public URLs of the product images. At least one image is required. After leading and trailing whitespaces are removed, each URL must start with http:// or https://.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("product_images")
    public java.util.List<String> productImages;

    /**
     * <p>The product title. This parameter is required.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>White minimalist ceramic mug</p>
     */
    @NameInMap("product_title")
    public String productTitle;

    /**
     * <p>The resolution of the video. Default value: 720P. Valid values: 720P and 1080P. The value is case-insensitive and is automatically converted to uppercase by the service.</p>
     * 
     * <strong>example:</strong>
     * <p>720P</p>
     */
    @NameInMap("resolution")
    public String resolution;

    /**
     * <p>The existing storyboard script. If this parameter is not provided or is left blank, automatic planning is used.</p>
     * 
     * <strong>example:</strong>
     * <p>create a dog</p>
     */
    @NameInMap("script")
    public String script;

    public static ProductVideoGenerationRequest build(java.util.Map<String, ?> map) throws Exception {
        ProductVideoGenerationRequest self = new ProductVideoGenerationRequest();
        return TeaModel.build(map, self);
    }

    public ProductVideoGenerationRequest setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
        return this;
    }
    public String getAspectRatio() {
        return this.aspectRatio;
    }

    public ProductVideoGenerationRequest setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public ProductVideoGenerationRequest setProductImages(java.util.List<String> productImages) {
        this.productImages = productImages;
        return this;
    }
    public java.util.List<String> getProductImages() {
        return this.productImages;
    }

    public ProductVideoGenerationRequest setProductTitle(String productTitle) {
        this.productTitle = productTitle;
        return this;
    }
    public String getProductTitle() {
        return this.productTitle;
    }

    public ProductVideoGenerationRequest setResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }
    public String getResolution() {
        return this.resolution;
    }

    public ProductVideoGenerationRequest setScript(String script) {
        this.script = script;
        return this;
    }
    public String getScript() {
        return this.script;
    }

}
