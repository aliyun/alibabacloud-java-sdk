// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class RemoveImageSubtitlesRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    @NameInMap("BX")
    public Float BX;

    @NameInMap("BY")
    public Float BY;

    @NameInMap("BW")
    public Float BW;

    @NameInMap("BH")
    public Float BH;

    public static RemoveImageSubtitlesRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveImageSubtitlesRequest self = new RemoveImageSubtitlesRequest();
        return TeaModel.build(map, self);
    }

    public RemoveImageSubtitlesRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public RemoveImageSubtitlesRequest setBX(Float BX) {
        this.BX = BX;
        return this;
    }
    public Float getBX() {
        return this.BX;
    }

    public RemoveImageSubtitlesRequest setBY(Float BY) {
        this.BY = BY;
        return this;
    }
    public Float getBY() {
        return this.BY;
    }

    public RemoveImageSubtitlesRequest setBW(Float BW) {
        this.BW = BW;
        return this;
    }
    public Float getBW() {
        return this.BW;
    }

    public RemoveImageSubtitlesRequest setBH(Float BH) {
        this.BH = BH;
        return this;
    }
    public Float getBH() {
        return this.BH;
    }

}
