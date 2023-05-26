// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ekyc_saas20230112.models;

import com.aliyun.tea.*;

public class ScanDocumentRequest extends TeaModel {
    /**
     * <p>The country or region code of the certificate. Specify the code in the ISO 3166 alpha-3 format.</p>
     */
    @NameInMap("countryCode")
    public String countryCode;

    /**
     * <p>The type of the certificate.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   IDENTITY_CARD</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   DRIVER_LICENSE</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   RESIDENCE_CARD</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   PASSPORT</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("documentType")
    public String documentType;

    /**
     * <p>Indicates whether the uploaded front-side image is in an image format or PDF format. The default value is pic.</p>
     */
    @NameInMap("imageAType")
    public String imageAType;

    /**
     * <p>Indicates whether the uploaded back-side image is in an image format or PDF format. The default value is pic.</p>
     */
    @NameInMap("imageBType")
    public String imageBType;

    /**
     * <p>The Base64-encoded front-side image of the certificate. Either this parameter or the imageUrlA parameter must be specified.</p>
     */
    @NameInMap("imageDataA")
    public String imageDataA;

    /**
     * <p>The Base64-encoded back-side image of the certificate.</p>
     */
    @NameInMap("imageDataB")
    public String imageDataB;

    /**
     * <p>The URL of the front-side image of the certificate. Either this parameter or the imageDataA parameter must be specified.</p>
     */
    @NameInMap("imageUrlA")
    public String imageUrlA;

    /**
     * <p>The URL of the back-side image of the certificate.</p>
     */
    @NameInMap("imageUrlB")
    public String imageUrlB;

    public static ScanDocumentRequest build(java.util.Map<String, ?> map) throws Exception {
        ScanDocumentRequest self = new ScanDocumentRequest();
        return TeaModel.build(map, self);
    }

    public ScanDocumentRequest setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }
    public String getCountryCode() {
        return this.countryCode;
    }

    public ScanDocumentRequest setDocumentType(String documentType) {
        this.documentType = documentType;
        return this;
    }
    public String getDocumentType() {
        return this.documentType;
    }

    public ScanDocumentRequest setImageAType(String imageAType) {
        this.imageAType = imageAType;
        return this;
    }
    public String getImageAType() {
        return this.imageAType;
    }

    public ScanDocumentRequest setImageBType(String imageBType) {
        this.imageBType = imageBType;
        return this;
    }
    public String getImageBType() {
        return this.imageBType;
    }

    public ScanDocumentRequest setImageDataA(String imageDataA) {
        this.imageDataA = imageDataA;
        return this;
    }
    public String getImageDataA() {
        return this.imageDataA;
    }

    public ScanDocumentRequest setImageDataB(String imageDataB) {
        this.imageDataB = imageDataB;
        return this;
    }
    public String getImageDataB() {
        return this.imageDataB;
    }

    public ScanDocumentRequest setImageUrlA(String imageUrlA) {
        this.imageUrlA = imageUrlA;
        return this;
    }
    public String getImageUrlA() {
        return this.imageUrlA;
    }

    public ScanDocumentRequest setImageUrlB(String imageUrlB) {
        this.imageUrlB = imageUrlB;
        return this;
    }
    public String getImageUrlB() {
        return this.imageUrlB;
    }

}
