// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class VerifyFaceMaskRequest extends TeaModel {
    @NameInMap("ImageData")
    public byte[] imageData;

    @NameInMap("ImageURL")
    public String imageURL;

    @NameInMap("RefData")
    public byte[] refData;

    @NameInMap("RefUrl")
    public String refUrl;

    public static VerifyFaceMaskRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyFaceMaskRequest self = new VerifyFaceMaskRequest();
        return TeaModel.build(map, self);
    }

    public VerifyFaceMaskRequest setImageData(byte[] imageData) {
        this.imageData = imageData;
        return this;
    }
    public byte[] getImageData() {
        return this.imageData;
    }

    public VerifyFaceMaskRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public VerifyFaceMaskRequest setRefData(byte[] refData) {
        this.refData = refData;
        return this;
    }
    public byte[] getRefData() {
        return this.refData;
    }

    public VerifyFaceMaskRequest setRefUrl(String refUrl) {
        this.refUrl = refUrl;
        return this;
    }
    public String getRefUrl() {
        return this.refUrl;
    }

}
