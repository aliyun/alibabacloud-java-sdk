// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class RemoveImageSubtitlesAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    @NameInMap("BH")
    public Float BH;

    @NameInMap("BW")
    public Float BW;

    @NameInMap("BX")
    public Float BX;

    @NameInMap("BY")
    public Float BY;

    public static RemoveImageSubtitlesAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveImageSubtitlesAdvanceRequest self = new RemoveImageSubtitlesAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public RemoveImageSubtitlesAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

    public RemoveImageSubtitlesAdvanceRequest setBH(Float BH) {
        this.BH = BH;
        return this;
    }
    public Float getBH() {
        return this.BH;
    }

    public RemoveImageSubtitlesAdvanceRequest setBW(Float BW) {
        this.BW = BW;
        return this;
    }
    public Float getBW() {
        return this.BW;
    }

    public RemoveImageSubtitlesAdvanceRequest setBX(Float BX) {
        this.BX = BX;
        return this;
    }
    public Float getBX() {
        return this.BX;
    }

    public RemoveImageSubtitlesAdvanceRequest setBY(Float BY) {
        this.BY = BY;
        return this;
    }
    public Float getBY() {
        return this.BY;
    }

}
