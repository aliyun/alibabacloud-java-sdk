// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetDetectLanguageVpcResponseBody extends TeaModel {
    @NameInMap("DetectedLanguage")
    public String detectedLanguage;

    @NameInMap("LanguageProbabilities")
    public String languageProbabilities;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDetectLanguageVpcResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDetectLanguageVpcResponseBody self = new GetDetectLanguageVpcResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDetectLanguageVpcResponseBody setDetectedLanguage(String detectedLanguage) {
        this.detectedLanguage = detectedLanguage;
        return this;
    }
    public String getDetectedLanguage() {
        return this.detectedLanguage;
    }

    public GetDetectLanguageVpcResponseBody setLanguageProbabilities(String languageProbabilities) {
        this.languageProbabilities = languageProbabilities;
        return this;
    }
    public String getLanguageProbabilities() {
        return this.languageProbabilities;
    }

    public GetDetectLanguageVpcResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
