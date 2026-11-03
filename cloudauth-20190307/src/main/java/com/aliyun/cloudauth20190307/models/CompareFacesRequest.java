// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CompareFacesRequest extends TeaModel {
    /**
     * <p>The type of the first image. Valid values:</p>
     * <ul>
     * <li><strong>FacePic</strong>: A face photo of the user.</li>
     * <li><strong>IDPic</strong>: A portrait photo from the chip of a second-generation Chinese ID card. This photo is typically read and decoded by a second-generation ID card reader.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FacePic</p>
     */
    @NameInMap("SourceImageType")
    public String sourceImageType;

    /**
     * <p>The URL of the first image. For more information, see the instructions on uploading image URLs.</p>
     * 
     * <strong>example:</strong>
     * <p>http%3A%2F%2Fjiangsu.china.com.cn%2Fuploadfile%2F2015%2F0114%2F1421221304095989.jpg</p>
     */
    @NameInMap("SourceImageValue")
    public String sourceImageValue;

    /**
     * <p>The type of the second image. Valid values:</p>
     * <ul>
     * <li><strong>FacePic</strong>: A face photo of the user.</li>
     * <li><strong>IDPic</strong>: A portrait photo from the chip of a second-generation Chinese ID card. This photo is typically read and decoded by a second-generation ID card reader.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FacePic</p>
     */
    @NameInMap("TargetImageType")
    public String targetImageType;

    /**
     * <p>The URL of the second image. For more information, see the instructions on uploading image URLs.</p>
     * 
     * <strong>example:</strong>
     * <p>http%3A%2F%2Fjiangsu.china.com.cn%2Fuploadfile%2F2015%2F0114%2F1421221304095989.jpg</p>
     */
    @NameInMap("TargetImageValue")
    public String targetImageValue;

    public static CompareFacesRequest build(java.util.Map<String, ?> map) throws Exception {
        CompareFacesRequest self = new CompareFacesRequest();
        return TeaModel.build(map, self);
    }

    public CompareFacesRequest setSourceImageType(String sourceImageType) {
        this.sourceImageType = sourceImageType;
        return this;
    }
    public String getSourceImageType() {
        return this.sourceImageType;
    }

    public CompareFacesRequest setSourceImageValue(String sourceImageValue) {
        this.sourceImageValue = sourceImageValue;
        return this;
    }
    public String getSourceImageValue() {
        return this.sourceImageValue;
    }

    public CompareFacesRequest setTargetImageType(String targetImageType) {
        this.targetImageType = targetImageType;
        return this;
    }
    public String getTargetImageType() {
        return this.targetImageType;
    }

    public CompareFacesRequest setTargetImageValue(String targetImageValue) {
        this.targetImageValue = targetImageValue;
        return this;
    }
    public String getTargetImageValue() {
        return this.targetImageValue;
    }

}
