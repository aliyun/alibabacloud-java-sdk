// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class LanguageDetectRequest extends TeaModel {
    /**
     * <p>The detection scenario. Default value: common. If you are using a search phrase scenario, set this parameter to query. If an incorrect value is passed or the parameter is not specified, the common general identification is used. Note: pass query in lowercase.</p>
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
