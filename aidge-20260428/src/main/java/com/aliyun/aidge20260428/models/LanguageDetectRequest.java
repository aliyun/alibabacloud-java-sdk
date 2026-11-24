// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class LanguageDetectRequest extends TeaModel {
    /**
     * <p>The detection scenario. Default value: common. For search phrase scenarios, set this parameter to query. If an invalid value is specified or this parameter is left empty, the common general detection scenario is used. Note: The value query must be in lowercase.</p>
     * 
     * <strong>example:</strong>
     * <p>query</p>
     */
    @NameInMap("Scene")
    public String scene;

    /**
     * <p>The source text to be detected. This parameter is required.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Test text</p>
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
