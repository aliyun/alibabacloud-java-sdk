// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class TextCorrectRequest extends TeaModel {
    /**
     * <p>Source language code. Required. You can pass &quot;auto&quot; for automatic language detection. Supports 14 languages.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>de</p>
     */
    @NameInMap("SourceLanguage")
    public String sourceLanguage;

    /**
     * <p>Text to be corrected. Required.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Empfelung</p>
     */
    @NameInMap("SourceText")
    public String sourceText;

    public static TextCorrectRequest build(java.util.Map<String, ?> map) throws Exception {
        TextCorrectRequest self = new TextCorrectRequest();
        return TeaModel.build(map, self);
    }

    public TextCorrectRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public TextCorrectRequest setSourceText(String sourceText) {
        this.sourceText = sourceText;
        return this;
    }
    public String getSourceText() {
        return this.sourceText;
    }

}
