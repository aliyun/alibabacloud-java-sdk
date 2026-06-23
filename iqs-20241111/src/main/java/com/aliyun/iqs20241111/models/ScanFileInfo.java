// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class ScanFileInfo extends TeaModel {
    /**
     * <p>The image rotation angle.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("angle")
    public Integer angle;

    /**
     * <p>The image height.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("height")
    public Integer height;

    /**
     * <p>The Base64 encoding of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>erwre</p>
     */
    @NameInMap("imageBase64")
    public String imageBase64;

    /**
     * <p>The image width.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("width")
    public Integer width;

    public static ScanFileInfo build(java.util.Map<String, ?> map) throws Exception {
        ScanFileInfo self = new ScanFileInfo();
        return TeaModel.build(map, self);
    }

    public ScanFileInfo setAngle(Integer angle) {
        this.angle = angle;
        return this;
    }
    public Integer getAngle() {
        return this.angle;
    }

    public ScanFileInfo setHeight(Integer height) {
        this.height = height;
        return this;
    }
    public Integer getHeight() {
        return this.height;
    }

    public ScanFileInfo setImageBase64(String imageBase64) {
        this.imageBase64 = imageBase64;
        return this;
    }
    public String getImageBase64() {
        return this.imageBase64;
    }

    public ScanFileInfo setWidth(Integer width) {
        this.width = width;
        return this;
    }
    public Integer getWidth() {
        return this.width;
    }

}
