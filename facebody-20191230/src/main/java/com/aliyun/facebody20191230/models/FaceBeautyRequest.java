// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class FaceBeautyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/facebody/FaceBeauty/FaceBeauty4.png">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/facebody/FaceBeauty/FaceBeauty4.png</a></p>
     */
    @NameInMap("ImageURL")
    public String imageURL;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Sharp")
    public Float sharp;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0.1</p>
     */
    @NameInMap("Smooth")
    public Float smooth;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0.3</p>
     */
    @NameInMap("White")
    public Float white;

    public static FaceBeautyRequest build(java.util.Map<String, ?> map) throws Exception {
        FaceBeautyRequest self = new FaceBeautyRequest();
        return TeaModel.build(map, self);
    }

    public FaceBeautyRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public FaceBeautyRequest setSharp(Float sharp) {
        this.sharp = sharp;
        return this;
    }
    public Float getSharp() {
        return this.sharp;
    }

    public FaceBeautyRequest setSmooth(Float smooth) {
        this.smooth = smooth;
        return this;
    }
    public Float getSmooth() {
        return this.smooth;
    }

    public FaceBeautyRequest setWhite(Float white) {
        this.white = white;
        return this;
    }
    public Float getWhite() {
        return this.white;
    }

}
