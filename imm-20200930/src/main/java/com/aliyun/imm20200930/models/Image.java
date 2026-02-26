// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Image extends TeaModel {
    /**
     * <p>The image cropping suggestions. This parameter is reserved and not available.</p>
     */
    @NameInMap("CroppingSuggestions")
    public java.util.List<CroppingSuggestion> croppingSuggestions;

    /**
     * <p>The original EXIF information about the image. The EXIF information is stored in the serialized JSON format. For more information, see <a href="https://help.aliyun.com/document_detail/44975.html">Query image information</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;FileSize&quot;:{&quot;value&quot;:&quot;29304&quot;},&quot;Format&quot;:{&quot;value&quot;:&quot;jpg&quot;}}</p>
     */
    @NameInMap("EXIF")
    public String EXIF;

    /**
     * <p>The height of the image. Unit: pixels.</p>
     * 
     * <strong>example:</strong>
     * <p>820</p>
     */
    @NameInMap("ImageHeight")
    public Long imageHeight;

    /**
     * <p>The image scoring information.</p>
     */
    @NameInMap("ImageScore")
    public ImageScore imageScore;

    /**
     * <p>The width of the image. Unit: pixels.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("ImageWidth")
    public Long imageWidth;

    /**
     * <p>The results of optical character recognition (OCR). This parameter is reserved and not available.</p>
     */
    @NameInMap("OCRContents")
    public java.util.List<OCRContents> OCRContents;

    public static Image build(java.util.Map<String, ?> map) throws Exception {
        Image self = new Image();
        return TeaModel.build(map, self);
    }

    public Image setCroppingSuggestions(java.util.List<CroppingSuggestion> croppingSuggestions) {
        this.croppingSuggestions = croppingSuggestions;
        return this;
    }
    public java.util.List<CroppingSuggestion> getCroppingSuggestions() {
        return this.croppingSuggestions;
    }

    public Image setEXIF(String EXIF) {
        this.EXIF = EXIF;
        return this;
    }
    public String getEXIF() {
        return this.EXIF;
    }

    public Image setImageHeight(Long imageHeight) {
        this.imageHeight = imageHeight;
        return this;
    }
    public Long getImageHeight() {
        return this.imageHeight;
    }

    public Image setImageScore(ImageScore imageScore) {
        this.imageScore = imageScore;
        return this;
    }
    public ImageScore getImageScore() {
        return this.imageScore;
    }

    public Image setImageWidth(Long imageWidth) {
        this.imageWidth = imageWidth;
        return this;
    }
    public Long getImageWidth() {
        return this.imageWidth;
    }

    public Image setOCRContents(java.util.List<OCRContents> OCRContents) {
        this.OCRContents = OCRContents;
        return this;
    }
    public java.util.List<OCRContents> getOCRContents() {
        return this.OCRContents;
    }

}
