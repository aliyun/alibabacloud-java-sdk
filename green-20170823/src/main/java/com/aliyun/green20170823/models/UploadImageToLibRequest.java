// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UploadImageToLibRequest extends TeaModel {
    @NameInMap("ImageLibId")
    public Integer imageLibId;

    @NameInMap("Images")
    public String images;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Urls")
    public String urls;

    public static UploadImageToLibRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadImageToLibRequest self = new UploadImageToLibRequest();
        return TeaModel.build(map, self);
    }

    public UploadImageToLibRequest setImageLibId(Integer imageLibId) {
        this.imageLibId = imageLibId;
        return this;
    }
    public Integer getImageLibId() {
        return this.imageLibId;
    }

    public UploadImageToLibRequest setImages(String images) {
        this.images = images;
        return this;
    }
    public String getImages() {
        return this.images;
    }

    public UploadImageToLibRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public UploadImageToLibRequest setUrls(String urls) {
        this.urls = urls;
        return this;
    }
    public String getUrls() {
        return this.urls;
    }

}
