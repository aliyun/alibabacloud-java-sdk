// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class RemoveImageSubtitlesRequest extends TeaModel {
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
    public String imageURL;

    public static RemoveImageSubtitlesRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveImageSubtitlesRequest self = new RemoveImageSubtitlesRequest();
        return TeaModel.build(map, self);
    }

    public RemoveImageSubtitlesRequest setBH(Float BH) {
        this.BH = BH;
        return this;
    }
    public Float getBH() {
        return this.BH;
    }

    public RemoveImageSubtitlesRequest setBW(Float BW) {
        this.BW = BW;
        return this;
    }
    public Float getBW() {
        return this.BW;
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

    public RemoveImageSubtitlesRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
