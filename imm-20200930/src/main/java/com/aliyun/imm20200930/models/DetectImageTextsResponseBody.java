// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DetectImageTextsResponseBody extends TeaModel {
    /**
     * <p>OCR text blocks.</p>
     */
    @NameInMap("OCRContents")
    public java.util.List<OCRContents> OCRContents;

    /**
     * <p>The full Optical Character Recognition (OCR) text, which is spliced by using the content of OCRContents.</p>
     */
    @NameInMap("OCRTexts")
    public String OCRTexts;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1B3D5E0A-D8B8-4DA0-8127-ED32C851****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DetectImageTextsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectImageTextsResponseBody self = new DetectImageTextsResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectImageTextsResponseBody setOCRContents(java.util.List<OCRContents> OCRContents) {
        this.OCRContents = OCRContents;
        return this;
    }
    public java.util.List<OCRContents> getOCRContents() {
        return this.OCRContents;
    }

    public DetectImageTextsResponseBody setOCRTexts(String OCRTexts) {
        this.OCRTexts = OCRTexts;
        return this;
    }
    public String getOCRTexts() {
        return this.OCRTexts;
    }

    public DetectImageTextsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
