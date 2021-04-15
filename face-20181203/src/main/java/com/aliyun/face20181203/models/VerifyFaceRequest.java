// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.face20181203.models;

import com.aliyun.tea.*;

public class VerifyFaceRequest extends TeaModel {
    @NameInMap("ImageUrl1")
    public String imageUrl1;

    @NameInMap("ImageUrl2")
    public String imageUrl2;

    @NameInMap("Content1")
    public String content1;

    @NameInMap("Content2")
    public String content2;

    public static VerifyFaceRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyFaceRequest self = new VerifyFaceRequest();
        return TeaModel.build(map, self);
    }

    public VerifyFaceRequest setImageUrl1(String imageUrl1) {
        this.imageUrl1 = imageUrl1;
        return this;
    }
    public String getImageUrl1() {
        return this.imageUrl1;
    }

    public VerifyFaceRequest setImageUrl2(String imageUrl2) {
        this.imageUrl2 = imageUrl2;
        return this;
    }
    public String getImageUrl2() {
        return this.imageUrl2;
    }

    public VerifyFaceRequest setContent1(String content1) {
        this.content1 = content1;
        return this;
    }
    public String getContent1() {
        return this.content1;
    }

    public VerifyFaceRequest setContent2(String content2) {
        this.content2 = content2;
        return this;
    }
    public String getContent2() {
        return this.content2;
    }

}
