// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class PackageWeightSizeCheckRequest extends TeaModel {
    /**
     * <p>The URL of the annotated image, i.e., the image with blue/red rectangular bounding box lines overlaid on the original image by an operator. The URL must be publicly accessible. The image dimensions must not exceed 4000×4000 pixels, the file size must not exceed 10 MB, and the supported formats are PNG, JPEG, and JPG.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/annotated_image.png">https://example.com/annotated_image.png</a></p>
     */
    @NameInMap("AnnotatedImageUrl")
    public String annotatedImageUrl;

    /**
     * <p>The URL of the raw image, i.e., the unannotated photo of the parcel on the scanning platform. The URL must be publicly accessible. The image dimensions must not exceed 4000×4000 pixels, the file size must not exceed 10 MB, and the supported formats are PNG, JPEG, and JPG.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/raw_image.png">https://example.com/raw_image.png</a></p>
     */
    @NameInMap("RawImageUrl")
    public String rawImageUrl;

    public static PackageWeightSizeCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        PackageWeightSizeCheckRequest self = new PackageWeightSizeCheckRequest();
        return TeaModel.build(map, self);
    }

    public PackageWeightSizeCheckRequest setAnnotatedImageUrl(String annotatedImageUrl) {
        this.annotatedImageUrl = annotatedImageUrl;
        return this;
    }
    public String getAnnotatedImageUrl() {
        return this.annotatedImageUrl;
    }

    public PackageWeightSizeCheckRequest setRawImageUrl(String rawImageUrl) {
        this.rawImageUrl = rawImageUrl;
        return this;
    }
    public String getRawImageUrl() {
        return this.rawImageUrl;
    }

}
