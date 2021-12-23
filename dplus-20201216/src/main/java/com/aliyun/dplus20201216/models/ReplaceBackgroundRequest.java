// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dplus20201216.models;

import com.aliyun.tea.*;

public class ReplaceBackgroundRequest extends TeaModel {
    // 返回的图片背景图片ID
    @NameInMap("BackgroundId")
    public String backgroundId;

    @NameInMap("Num")
    public Integer num;

    @NameInMap("PicBackgroundUrl")
    public String picBackgroundUrl;

    // 图片地址
    @NameInMap("PicUrl")
    public String picUrl;

    public static ReplaceBackgroundRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplaceBackgroundRequest self = new ReplaceBackgroundRequest();
        return TeaModel.build(map, self);
    }

    public ReplaceBackgroundRequest setBackgroundId(String backgroundId) {
        this.backgroundId = backgroundId;
        return this;
    }
    public String getBackgroundId() {
        return this.backgroundId;
    }

    public ReplaceBackgroundRequest setNum(Integer num) {
        this.num = num;
        return this;
    }
    public Integer getNum() {
        return this.num;
    }

    public ReplaceBackgroundRequest setPicBackgroundUrl(String picBackgroundUrl) {
        this.picBackgroundUrl = picBackgroundUrl;
        return this;
    }
    public String getPicBackgroundUrl() {
        return this.picBackgroundUrl;
    }

    public ReplaceBackgroundRequest setPicUrl(String picUrl) {
        this.picUrl = picUrl;
        return this;
    }
    public String getPicUrl() {
        return this.picUrl;
    }

}
