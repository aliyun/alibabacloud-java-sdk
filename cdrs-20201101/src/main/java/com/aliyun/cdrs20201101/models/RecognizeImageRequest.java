// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdrs20201101.models;

import com.aliyun.tea.*;

public class RecognizeImageRequest extends TeaModel {
    @NameInMap("CorpId")
    @Validation(required = true)
    public String corpId;

    @NameInMap("Vendor")
    public String vendor;

    @NameInMap("ImageContent")
    public String imageContent;

    @NameInMap("ImageUrl")
    public String imageUrl;

    public static RecognizeImageRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeImageRequest self = new RecognizeImageRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeImageRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public RecognizeImageRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

    public RecognizeImageRequest setImageContent(String imageContent) {
        this.imageContent = imageContent;
        return this;
    }
    public String getImageContent() {
        return this.imageContent;
    }

    public RecognizeImageRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

}
