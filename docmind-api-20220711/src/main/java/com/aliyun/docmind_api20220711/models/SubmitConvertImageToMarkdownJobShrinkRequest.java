// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitConvertImageToMarkdownJobShrinkRequest extends TeaModel {
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

    public static SubmitConvertImageToMarkdownJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitConvertImageToMarkdownJobShrinkRequest self = new SubmitConvertImageToMarkdownJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitConvertImageToMarkdownJobShrinkRequest setImageNameExtension(String imageNameExtension) {
        this.imageNameExtension = imageNameExtension;
        return this;
    }
    public String getImageNameExtension() {
        return this.imageNameExtension;
    }

    public SubmitConvertImageToMarkdownJobShrinkRequest setImageNamesShrink(String imageNamesShrink) {
        this.imageNamesShrink = imageNamesShrink;
        return this;
    }
    public String getImageNamesShrink() {
        return this.imageNamesShrink;
    }

    public SubmitConvertImageToMarkdownJobShrinkRequest setImageUrlsShrink(String imageUrlsShrink) {
        this.imageUrlsShrink = imageUrlsShrink;
        return this;
    }
    public String getImageUrlsShrink() {
        return this.imageUrlsShrink;
    }

    public SubmitConvertImageToMarkdownJobShrinkRequest setOssBucket(String ossBucket) {
        this.ossBucket = ossBucket;
        return this;
    }
    public String getOssBucket() {
        return this.ossBucket;
    }

    public SubmitConvertImageToMarkdownJobShrinkRequest setOssEndpoint(String ossEndpoint) {
        this.ossEndpoint = ossEndpoint;
        return this;
    }
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

}
