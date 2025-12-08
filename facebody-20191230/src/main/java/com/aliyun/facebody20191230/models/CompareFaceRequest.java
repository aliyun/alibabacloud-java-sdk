// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class CompareFaceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>/9j/4AAQSkZJRgABAQAAAQABAAD/2wBDAAgGBgcGBQgHBwcJCQgK****</p>
     */
    @NameInMap("ImageDataA")
    public String imageDataA;

    /**
     * <strong>example:</strong>
     * <p>/9j/4AAQSkZJRgABAQAAAQABAAD/2wBDAAgGBgcGBQgHBwcJCQgQ****</p>
     */
    @NameInMap("ImageDataB")
    public String imageDataB;

    /**
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/facebody/CompareFace/CompareFace-right1.png">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/facebody/CompareFace/CompareFace-right1.png</a></p>
     */
    @NameInMap("ImageURLA")
    public String imageURLA;

    /**
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/facebody/CompareFace/CompareFace-left1.png">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/facebody/CompareFace/CompareFace-left1.png</a></p>
     */
    @NameInMap("ImageURLB")
    public String imageURLB;

    /**
     * <strong>example:</strong>
     * <p>75.12</p>
     */
    @NameInMap("QualityScoreThreshold")
    public Float qualityScoreThreshold;

    public static CompareFaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CompareFaceRequest self = new CompareFaceRequest();
        return TeaModel.build(map, self);
    }

    public CompareFaceRequest setImageDataA(String imageDataA) {
        this.imageDataA = imageDataA;
        return this;
    }
    public String getImageDataA() {
        return this.imageDataA;
    }

    public CompareFaceRequest setImageDataB(String imageDataB) {
        this.imageDataB = imageDataB;
        return this;
    }
    public String getImageDataB() {
        return this.imageDataB;
    }

    public CompareFaceRequest setImageURLA(String imageURLA) {
        this.imageURLA = imageURLA;
        return this;
    }
    public String getImageURLA() {
        return this.imageURLA;
    }

    public CompareFaceRequest setImageURLB(String imageURLB) {
        this.imageURLB = imageURLB;
        return this;
    }
    public String getImageURLB() {
        return this.imageURLB;
    }

    public CompareFaceRequest setQualityScoreThreshold(Float qualityScoreThreshold) {
        this.qualityScoreThreshold = qualityScoreThreshold;
        return this;
    }
    public Float getQualityScoreThreshold() {
        return this.qualityScoreThreshold;
    }

}
