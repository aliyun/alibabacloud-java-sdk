// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class PackageWeightSizeCheckRequest extends TeaModel {
    /**
     * <p>The URL of the annotated image with manual bounding box markings, which is the original image overlaid with blue or red rectangular bounding box lines. The URL must be publicly accessible. The image must not exceed 4000 × 4000 pixels or 10 MB in size. Supported formats: png, jpeg, and jpg.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/annotated_image.png">https://example.com/annotated_image.png</a></p>
     */
    @NameInMap("AnnotatedImageUrl")
    public String annotatedImageUrl;

    /**
     * <p>The URL of the raw image, which is the unannotated photo of the parcel on the scanning platform. The URL must be publicly accessible. The image must not exceed 4000 × 4000 pixels or 10 MB in size. Supported formats: png, jpeg, and jpg.</p>
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
