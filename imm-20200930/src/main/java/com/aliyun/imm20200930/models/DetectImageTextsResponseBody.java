// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DetectImageTextsResponseBody extends TeaModel {
    @NameInMap("OCRContents")
    public java.util.List<OCRContents> OCRContents;

    @NameInMap("OCRTexts")
    public String OCRTexts;

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
