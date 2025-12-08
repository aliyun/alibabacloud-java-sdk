// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class FaceBeautyAdvanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/facebody/FaceBeauty/FaceBeauty4.png">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/facebody/FaceBeauty/FaceBeauty4.png</a></p>
     */
    @NameInMap("ImageURL")
    public java.io.InputStream imageURLObject;

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

    public static FaceBeautyAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        FaceBeautyAdvanceRequest self = new FaceBeautyAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public FaceBeautyAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

    public FaceBeautyAdvanceRequest setSharp(Float sharp) {
        this.sharp = sharp;
        return this;
    }
    public Float getSharp() {
        return this.sharp;
    }

    public FaceBeautyAdvanceRequest setSmooth(Float smooth) {
        this.smooth = smooth;
        return this;
    }
    public Float getSmooth() {
        return this.smooth;
    }

    public FaceBeautyAdvanceRequest setWhite(Float white) {
        this.white = white;
        return this;
    }
    public Float getWhite() {
        return this.white;
    }

}
