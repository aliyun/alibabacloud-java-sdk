// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class VirtualTryOnRequest extends TeaModel {
    /**
     * <p>The URL of the garment image. Only one image is supported. The URL must be a publicly accessible <code>http</code>/<code>https</code> address. The image must be in JPG, JPEG, PNG, BMP, or WEBP format, with a resolution between 256 × 256 and 2049 × 2049 pixels, and a file size of no more than 10 MB.<br></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://ae01.alicdn.com/kf/S342f0070dc9f4be09a6cbed34e90dc8fs.jpg">https://ae01.alicdn.com/kf/S342f0070dc9f4be09a6cbed34e90dc8fs.jpg</a></p>
     */
    @NameInMap("ClothImageUrl")
    public String clothImageUrl;

    /**
     * <p>The garment type. Valid values: tops, bottoms, dresses, tops_and_bottoms, shoes, and hats. If this parameter is not specified, the system automatically identifies the garment type.</p>
     * 
     * <strong>example:</strong>
     * <p>tops</p>
     */
    @NameInMap("ClothType")
    public String clothType;

    /**
     * <p>The URL of the model image. Only one image is supported. The URL must be a publicly accessible <code>http</code>/<code>https</code> address. The image must be in JPG, JPEG, PNG, BMP, or WEBP format, with a resolution between 256 × 256 and 2049 × 2049 pixels, and a file size of no more than 10 MB.<br></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://ae01.alicdn.com/kf/S342f0070dc9f4be09a6cbed34e90dc8fs.jpg">https://ae01.alicdn.com/kf/S342f0070dc9f4be09a6cbed34e90dc8fs.jpg</a></p>
     */
    @NameInMap("ModelImageUrl")
    public String modelImageUrl;

    /**
     * <p>Required. The image resolution. Valid values: 1K and 2K.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1K</p>
     */
    @NameInMap("Resolution")
    public String resolution;

    public static VirtualTryOnRequest build(java.util.Map<String, ?> map) throws Exception {
        VirtualTryOnRequest self = new VirtualTryOnRequest();
        return TeaModel.build(map, self);
    }

    public VirtualTryOnRequest setClothImageUrl(String clothImageUrl) {
        this.clothImageUrl = clothImageUrl;
        return this;
    }
    public String getClothImageUrl() {
        return this.clothImageUrl;
    }

    public VirtualTryOnRequest setClothType(String clothType) {
        this.clothType = clothType;
        return this;
    }
    public String getClothType() {
        return this.clothType;
    }

    public VirtualTryOnRequest setModelImageUrl(String modelImageUrl) {
        this.modelImageUrl = modelImageUrl;
        return this;
    }
    public String getModelImageUrl() {
        return this.modelImageUrl;
    }

    public VirtualTryOnRequest setResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }
    public String getResolution() {
        return this.resolution;
    }

}
