// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitConvertImageToMarkdownJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>jpg</p>
     */
    @NameInMap("ImageNameExtension")
    public String imageNameExtension;

    @NameInMap("ImageNames")
    public java.util.List<String> imageNames;

    @NameInMap("ImageUrls")
    public java.util.List<String> imageUrls;

    @NameInMap("OssBucket")
    public String ossBucket;

    @NameInMap("OssEndpoint")
    public String ossEndpoint;

    public static SubmitConvertImageToMarkdownJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitConvertImageToMarkdownJobRequest self = new SubmitConvertImageToMarkdownJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitConvertImageToMarkdownJobRequest setImageNameExtension(String imageNameExtension) {
        this.imageNameExtension = imageNameExtension;
        return this;
    }
    public String getImageNameExtension() {
        return this.imageNameExtension;
    }

    public SubmitConvertImageToMarkdownJobRequest setImageNames(java.util.List<String> imageNames) {
        this.imageNames = imageNames;
        return this;
    }
    public java.util.List<String> getImageNames() {
        return this.imageNames;
    }

    public SubmitConvertImageToMarkdownJobRequest setImageUrls(java.util.List<String> imageUrls) {
        this.imageUrls = imageUrls;
        return this;
    }
    public java.util.List<String> getImageUrls() {
        return this.imageUrls;
    }

    public SubmitConvertImageToMarkdownJobRequest setOssBucket(String ossBucket) {
        this.ossBucket = ossBucket;
        return this;
    }
    public String getOssBucket() {
        return this.ossBucket;
    }

    public SubmitConvertImageToMarkdownJobRequest setOssEndpoint(String ossEndpoint) {
        this.ossEndpoint = ossEndpoint;
        return this;
    }
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

}
