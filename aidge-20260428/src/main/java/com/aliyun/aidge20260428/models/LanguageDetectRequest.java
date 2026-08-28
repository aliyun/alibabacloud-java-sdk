// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class LanguageDetectRequest extends TeaModel {
    /**
     * <p>Optional. Set this parameter to query (case-insensitive) to use the new model. If this parameter is not specified or an invalid value is passed, the default value common (general language detection) is used.</p>
     * 
     * <strong>example:</strong>
     * <p>query</p>
     */
    @NameInMap("Scene")
    public String scene;

    /**
     * <p>The source text to be identified. This parameter is required.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample text</p>
     */
    @NameInMap("SourceText")
    public String sourceText;

    public static LanguageDetectRequest build(java.util.Map<String, ?> map) throws Exception {
        LanguageDetectRequest self = new LanguageDetectRequest();
        return TeaModel.build(map, self);
    }

    public LanguageDetectRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public LanguageDetectRequest setSourceText(String sourceText) {
        this.sourceText = sourceText;
        return this;
    }
    public String getSourceText() {
        return this.sourceText;
    }

}
