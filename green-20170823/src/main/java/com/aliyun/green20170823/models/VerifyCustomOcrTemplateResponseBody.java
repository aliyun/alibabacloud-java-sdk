// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class VerifyCustomOcrTemplateResponseBody extends TeaModel {
    @NameInMap("ImageUrl")
    public String imageUrl;

    @NameInMap("RecognizeInfo")
    public String recognizeInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static VerifyCustomOcrTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyCustomOcrTemplateResponseBody self = new VerifyCustomOcrTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyCustomOcrTemplateResponseBody setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public VerifyCustomOcrTemplateResponseBody setRecognizeInfo(String recognizeInfo) {
        this.recognizeInfo = recognizeInfo;
        return this;
    }
    public String getRecognizeInfo() {
        return this.recognizeInfo;
    }

    public VerifyCustomOcrTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
