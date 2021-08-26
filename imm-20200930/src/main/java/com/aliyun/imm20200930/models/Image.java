// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Image extends TeaModel {
    // ImageWidth
    @NameInMap("ImageWidth")
    public Long imageWidth;

    // ImageHeight
    @NameInMap("ImageHeight")
    public Long imageHeight;

    // EXIF
    @NameInMap("EXIF")
    public String EXIF;

    @NameInMap("ImageScore")
    public ImageScore imageScore;

    // CroppingSuggestions
    @NameInMap("CroppingSuggestions")
    public java.util.List<CroppingSuggestion> croppingSuggestions;

    // OCRContents
    @NameInMap("OCRContents")
    public java.util.List<OCRContents> OCRContents;

    public static Image build(java.util.Map<String, ?> map) throws Exception {
        Image self = new Image();
        return TeaModel.build(map, self);
    }

    public Image setImageWidth(Long imageWidth) {
        this.imageWidth = imageWidth;
        return this;
    }
    public Long getImageWidth() {
        return this.imageWidth;
    }

    public Image setImageHeight(Long imageHeight) {
        this.imageHeight = imageHeight;
        return this;
    }
    public Long getImageHeight() {
        return this.imageHeight;
    }

    public Image setEXIF(String EXIF) {
        this.EXIF = EXIF;
        return this;
    }
    public String getEXIF() {
        return this.EXIF;
    }

    public Image setImageScore(ImageScore imageScore) {
        this.imageScore = imageScore;
        return this;
    }
    public ImageScore getImageScore() {
        return this.imageScore;
    }

    public Image setCroppingSuggestions(java.util.List<CroppingSuggestion> croppingSuggestions) {
        this.croppingSuggestions = croppingSuggestions;
        return this;
    }
    public java.util.List<CroppingSuggestion> getCroppingSuggestions() {
        return this.croppingSuggestions;
    }

    public Image setOCRContents(java.util.List<OCRContents> OCRContents) {
        this.OCRContents = OCRContents;
        return this;
    }
    public java.util.List<OCRContents> getOCRContents() {
        return this.OCRContents;
    }

}
