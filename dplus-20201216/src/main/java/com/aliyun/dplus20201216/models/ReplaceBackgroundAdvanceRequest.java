// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dplus20201216.models;

import com.aliyun.tea.*;

public class ReplaceBackgroundAdvanceRequest extends TeaModel {
    @NameInMap("PicUrlObject")
    @Validation(required = true)
    public java.io.InputStream picUrlObject;

    // 返回的图片背景图片ID
    @NameInMap("BackgroundId")
    public String backgroundId;

    @NameInMap("Num")
    public Integer num;

    @NameInMap("PicBackgroundUrl")
    public String picBackgroundUrl;

    public static ReplaceBackgroundAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplaceBackgroundAdvanceRequest self = new ReplaceBackgroundAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public ReplaceBackgroundAdvanceRequest setPicUrlObject(java.io.InputStream picUrlObject) {
        this.picUrlObject = picUrlObject;
        return this;
    }
    public java.io.InputStream getPicUrlObject() {
        return this.picUrlObject;
    }

    public ReplaceBackgroundAdvanceRequest setBackgroundId(String backgroundId) {
        this.backgroundId = backgroundId;
        return this;
    }
    public String getBackgroundId() {
        return this.backgroundId;
    }

    public ReplaceBackgroundAdvanceRequest setNum(Integer num) {
        this.num = num;
        return this;
    }
    public Integer getNum() {
        return this.num;
    }

    public ReplaceBackgroundAdvanceRequest setPicBackgroundUrl(String picBackgroundUrl) {
        this.picBackgroundUrl = picBackgroundUrl;
        return this;
    }
    public String getPicBackgroundUrl() {
        return this.picBackgroundUrl;
    }

}
