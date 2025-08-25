// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class RemoveImageSubtitlesAdvanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0.25</p>
     */
    @NameInMap("BH")
    public Float BH;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BW")
    public Float BW;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("BX")
    public Float BX;

    /**
     * <strong>example:</strong>
     * <p>0.75</p>
     */
    @NameInMap("BY")
    public Float BY;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageenhan/RemoveImageSubtitles/RemoveImageSubtitles1.jpg">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageenhan/RemoveImageSubtitles/RemoveImageSubtitles1.jpg</a></p>
     */
    @NameInMap("ImageURL")
    public java.io.InputStream imageURLObject;

    public static RemoveImageSubtitlesAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveImageSubtitlesAdvanceRequest self = new RemoveImageSubtitlesAdvanceRequest();
        return TeaModel.build(map, self);
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

    public RemoveImageSubtitlesAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

}
