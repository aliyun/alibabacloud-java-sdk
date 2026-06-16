// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class LanguageDetectRequest extends TeaModel {
    /**
     * <p>The source text for language detection. This parameter is required.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>测试文本</p>
     */
    @NameInMap("SourceText")
    public String sourceText;

    public static LanguageDetectRequest build(java.util.Map<String, ?> map) throws Exception {
        LanguageDetectRequest self = new LanguageDetectRequest();
        return TeaModel.build(map, self);
    }

    public LanguageDetectRequest setSourceText(String sourceText) {
        this.sourceText = sourceText;
        return this;
    }
    public String getSourceText() {
        return this.sourceText;
    }

}
