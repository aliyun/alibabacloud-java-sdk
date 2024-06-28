// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitConvertImageToPdfJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>JPG</p>
     */
    @NameInMap("ImageNameExtension")
    public String imageNameExtension;

    @NameInMap("ImageNames")
    public java.util.List<String> imageNames;

    @NameInMap("ImageUrls")
    public java.util.List<String> imageUrls;

    public static SubmitConvertImageToPdfJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitConvertImageToPdfJobRequest self = new SubmitConvertImageToPdfJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitConvertImageToPdfJobRequest setImageNameExtension(String imageNameExtension) {
        this.imageNameExtension = imageNameExtension;
        return this;
    }
    public String getImageNameExtension() {
        return this.imageNameExtension;
    }

    public SubmitConvertImageToPdfJobRequest setImageNames(java.util.List<String> imageNames) {
        this.imageNames = imageNames;
        return this;
    }
    public java.util.List<String> getImageNames() {
        return this.imageNames;
    }

    public SubmitConvertImageToPdfJobRequest setImageUrls(java.util.List<String> imageUrls) {
        this.imageUrls = imageUrls;
        return this;
    }
    public java.util.List<String> getImageUrls() {
        return this.imageUrls;
    }

}
