// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class VerifyFaceMaskRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    @NameInMap("RefUrl")
    public String refUrl;

    @NameInMap("ImageData")
    public byte[] imageData;

    @NameInMap("RefData")
    public byte[] refData;

    public static VerifyFaceMaskRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyFaceMaskRequest self = new VerifyFaceMaskRequest();
        return TeaModel.build(map, self);
    }

    public VerifyFaceMaskRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public VerifyFaceMaskRequest setRefUrl(String refUrl) {
        this.refUrl = refUrl;
        return this;
    }
    public String getRefUrl() {
        return this.refUrl;
    }

    public VerifyFaceMaskRequest setImageData(byte[] imageData) {
        this.imageData = imageData;
        return this;
    }
    public byte[] getImageData() {
        return this.imageData;
    }

    public VerifyFaceMaskRequest setRefData(byte[] refData) {
        this.refData = refData;
        return this;
    }
    public byte[] getRefData() {
        return this.refData;
    }

}
