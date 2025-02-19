// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitConvertImageToWordJobShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>jpg</p>
     */
    @NameInMap("ImageNameExtension")
    public String imageNameExtension;

    @NameInMap("ImageNames")
    public String imageNamesShrink;

    @NameInMap("ImageUrls")
    public String imageUrlsShrink;

    @NameInMap("OssBucket")
    public String ossBucket;

    @NameInMap("OssEndpoint")
    public String ossEndpoint;

    public static SubmitConvertImageToWordJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitConvertImageToWordJobShrinkRequest self = new SubmitConvertImageToWordJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitConvertImageToWordJobShrinkRequest setImageNameExtension(String imageNameExtension) {
        this.imageNameExtension = imageNameExtension;
        return this;
    }
    public String getImageNameExtension() {
        return this.imageNameExtension;
    }

    public SubmitConvertImageToWordJobShrinkRequest setImageNamesShrink(String imageNamesShrink) {
        this.imageNamesShrink = imageNamesShrink;
        return this;
    }
    public String getImageNamesShrink() {
        return this.imageNamesShrink;
    }

    public SubmitConvertImageToWordJobShrinkRequest setImageUrlsShrink(String imageUrlsShrink) {
        this.imageUrlsShrink = imageUrlsShrink;
        return this;
    }
    public String getImageUrlsShrink() {
        return this.imageUrlsShrink;
    }

    public SubmitConvertImageToWordJobShrinkRequest setOssBucket(String ossBucket) {
        this.ossBucket = ossBucket;
        return this;
    }
    public String getOssBucket() {
        return this.ossBucket;
    }

    public SubmitConvertImageToWordJobShrinkRequest setOssEndpoint(String ossEndpoint) {
        this.ossEndpoint = ossEndpoint;
        return this;
    }
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

}
