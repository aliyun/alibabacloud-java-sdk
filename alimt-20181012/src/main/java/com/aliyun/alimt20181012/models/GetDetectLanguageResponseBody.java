// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetDetectLanguageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("DetectedLanguage")
    public String detectedLanguage;

    @NameInMap("LanguageProbabilities")
    public String languageProbabilities;

    /**
     * <strong>example:</strong>
     * <p>0C5EC1EC-1A06-4D60-97E6-4D41350945E4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDetectLanguageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDetectLanguageResponseBody self = new GetDetectLanguageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDetectLanguageResponseBody setDetectedLanguage(String detectedLanguage) {
        this.detectedLanguage = detectedLanguage;
        return this;
    }
    public String getDetectedLanguage() {
        return this.detectedLanguage;
    }

    public GetDetectLanguageResponseBody setLanguageProbabilities(String languageProbabilities) {
        this.languageProbabilities = languageProbabilities;
        return this;
    }
    public String getLanguageProbabilities() {
        return this.languageProbabilities;
    }

    public GetDetectLanguageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
