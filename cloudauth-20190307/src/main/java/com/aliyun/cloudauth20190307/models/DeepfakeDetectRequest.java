// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DeepfakeDetectRequest extends TeaModel {
    /**
     * <p>The Base64-encoded face image.</p>
     * <blockquote>
     * <p>Specify either FaceUrl or FaceBase64.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>/9j/4AAQSkZJRgABAQAASxxxxxxx</p>
     */
    @NameInMap("FaceBase64")
    public String faceBase64;

    /**
     * <p>The input type of the face material. Valid values:</p>
     * <ul>
     * <li>IMAGE (default): face image</li>
     * <li>VIDEO: face video</li>
     * </ul>
     * <blockquote>
     * <p>Video processing takes longer. Set the timeout to more than 3 seconds.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>IMAGE</p>
     */
    @NameInMap("FaceInputType")
    public String faceInputType;

    /**
     * <p>The URL of the face image.</p>
     * <blockquote>
     * <p>Specify either FaceUrl or FaceBase64.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="https://cn-shanghai-aliyun-cloudauth-xxxxxx.oss-cn-shanghai.aliyuncs.com/verify/xxxxx/xxxxx.jpeg">https://cn-shanghai-aliyun-cloudauth-xxxxxx.oss-cn-shanghai.aliyuncs.com/verify/xxxxx/xxxxx.jpeg</a></p>
     */
    @NameInMap("FaceUrl")
    public String faceUrl;

    /**
     * <p>The unique identifier of the merchant request. The value is a 32-character alphanumeric string. The first few characters consist of a custom merchant abbreviation, the middle part can contain a time segment, and the last part can use a random or incremental sequence.</p>
     * 
     * <strong>example:</strong>
     * <p>e0c34a77f5ac40a5aa5e6ed20c******</p>
     */
    @NameInMap("OuterOrderNo")
    public String outerOrderNo;

    public static DeepfakeDetectRequest build(java.util.Map<String, ?> map) throws Exception {
        DeepfakeDetectRequest self = new DeepfakeDetectRequest();
        return TeaModel.build(map, self);
    }

    public DeepfakeDetectRequest setFaceBase64(String faceBase64) {
        this.faceBase64 = faceBase64;
        return this;
    }
    public String getFaceBase64() {
        return this.faceBase64;
    }

    public DeepfakeDetectRequest setFaceInputType(String faceInputType) {
        this.faceInputType = faceInputType;
        return this;
    }
    public String getFaceInputType() {
        return this.faceInputType;
    }

    public DeepfakeDetectRequest setFaceUrl(String faceUrl) {
        this.faceUrl = faceUrl;
        return this;
    }
    public String getFaceUrl() {
        return this.faceUrl;
    }

    public DeepfakeDetectRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

}
