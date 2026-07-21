// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class PersonalizedTextToImageQueryImageAssetRequest extends TeaModel {
    /**
     * <p>The image encoding format. For example, specify <code>base64</code> to receive the image data as a Base64-encoded string.</p>
     * 
     * <strong>example:</strong>
     * <p>base64</p>
     */
    @NameInMap("encodeFormat")
    public String encodeFormat;

    /**
     * <p>The image ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0000.png</p>
     */
    @NameInMap("imageId")
    public String imageId;

    public static PersonalizedTextToImageQueryImageAssetRequest build(java.util.Map<String, ?> map) throws Exception {
        PersonalizedTextToImageQueryImageAssetRequest self = new PersonalizedTextToImageQueryImageAssetRequest();
        return TeaModel.build(map, self);
    }

    public PersonalizedTextToImageQueryImageAssetRequest setEncodeFormat(String encodeFormat) {
        this.encodeFormat = encodeFormat;
        return this;
    }
    public String getEncodeFormat() {
        return this.encodeFormat;
    }

    public PersonalizedTextToImageQueryImageAssetRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

}
